package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentEncoding extends StObject {
  
  /** @description The new blob's content. */
  var content: String
  
  /**
    * @description The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
    * @default utf-8
    */
  var encoding: js.UndefOr[String] = js.undefined
}
object ContentEncoding {
  
  inline def apply(content: String): ContentEncoding = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncoding]
  }
  
  extension [Self <: ContentEncoding](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
