package typings.pathParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokeniserMod {
  
  @JSImport("path-parser/dist/tokeniser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def default(str: String, tokens: js.Array[Token]): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  trait Token extends StObject {
    
    var `match`: String
    
    var otherVal: Any
    
    var regex: js.UndefOr[js.RegExp] = js.undefined
    
    var `type`: String
    
    var `val`: Any
  }
  object Token {
    
    inline def apply(`match`: String, otherVal: Any, `type`: String, `val`: Any): Token = {
      val __obj = js.Dynamic.literal(otherVal = otherVal.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setOtherVal(value: Any): Self = StObject.set(x, "otherVal", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
