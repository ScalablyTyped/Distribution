package typings.parseDataUrl

import typings.node.Buffer
import typings.parseDataUrl.parseDataUrlBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(s: String): `false` | DataUrl = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[`false` | DataUrl]
  
  @JSImport("parse-data-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataUrl extends StObject {
    
    var base64: Boolean
    
    var charset: String
    
    var contentType: String
    
    var data: String
    
    var mediaType: String
    
    def toBuffer(): Buffer
  }
  object DataUrl {
    
    @scala.inline
    def apply(
      base64: Boolean,
      charset: String,
      contentType: String,
      data: String,
      mediaType: String,
      toBuffer: () => Buffer
    ): DataUrl = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[DataUrl]
    }
    
    @scala.inline
    implicit class DataUrlMutableBuilder[Self <: DataUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
}
