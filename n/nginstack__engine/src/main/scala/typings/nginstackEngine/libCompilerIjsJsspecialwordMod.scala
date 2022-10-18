package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompilerIjsJsspecialwordMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSSpecialWord", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSSpecialWord {
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var tokenType: String = js.native
  }
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSSpecialWord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSSpecialWord extends StObject {
    
    var name: String
    
    var tokenType: String
  }
  object JSSpecialWord {
    
    inline def apply(name: String, tokenType: String): JSSpecialWord = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSSpecialWord]
    }
    
    extension [Self <: JSSpecialWord](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
