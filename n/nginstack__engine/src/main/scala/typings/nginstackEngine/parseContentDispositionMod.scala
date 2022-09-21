package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseContentDispositionMod {
  
  inline def apply(content: String): ParseResult = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
  
  @JSImport("@nginstack/engine/lib/multipart/parseContentDisposition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseResult extends StObject {
    
    var params: Any
    
    var `type`: String
  }
  object ParseResult {
    
    inline def apply(params: Any, `type`: String): ParseResult = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    extension [Self <: ParseResult](x: Self) {
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
