package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jstokenwordMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSTokenWord", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSTokenWord {
    
    /* CompleteClass */
    var escapeChars: Any = js.native
    
    /* CompleteClass */
    var specialWord: Any = js.native
    
    /* CompleteClass */
    var str: Any = js.native
    
    /* CompleteClass */
    var tokenType: String = js.native
  }
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSTokenWord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSTokenWord extends StObject {
    
    var escapeChars: Any
    
    var specialWord: Any
    
    var str: Any
    
    var tokenType: String
  }
  object JSTokenWord {
    
    inline def apply(escapeChars: Any, specialWord: Any, str: Any, tokenType: String): JSTokenWord = {
      val __obj = js.Dynamic.literal(escapeChars = escapeChars.asInstanceOf[js.Any], specialWord = specialWord.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSTokenWord]
    }
    
    extension [Self <: JSTokenWord](x: Self) {
      
      inline def setEscapeChars(value: Any): Self = StObject.set(x, "escapeChars", value.asInstanceOf[js.Any])
      
      inline def setSpecialWord(value: Any): Self = StObject.set(x, "specialWord", value.asInstanceOf[js.Any])
      
      inline def setStr(value: Any): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
