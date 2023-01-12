package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMimeParseMediaTypeMod {
  
  inline def apply(content: String): ParseResult = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
  
  @JSImport("@nginstack/engine/lib/mime/parseMediaType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseResult extends StObject {
    
    var mediaType: String
    
    var params: Any
  }
  object ParseResult {
    
    inline def apply(mediaType: String, params: Any): ParseResult = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
