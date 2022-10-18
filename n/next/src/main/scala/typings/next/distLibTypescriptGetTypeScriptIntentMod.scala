package typings.next

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTypescriptGetTypeScriptIntentMod {
  
  @JSImport("next/dist/lib/typescript/getTypeScriptIntent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTypeScriptIntent(baseDir: String, intentDirs: js.Array[String], tsconfigPath: String): js.Promise[TypeScriptIntent | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptIntent")(baseDir.asInstanceOf[js.Any], intentDirs.asInstanceOf[js.Any], tsconfigPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TypeScriptIntent | `false`]]
  
  trait TypeScriptIntent extends StObject {
    
    var firstTimeSetup: Boolean
  }
  object TypeScriptIntent {
    
    inline def apply(firstTimeSetup: Boolean): TypeScriptIntent = {
      val __obj = js.Dynamic.literal(firstTimeSetup = firstTimeSetup.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptIntent]
    }
    
    extension [Self <: TypeScriptIntent](x: Self) {
      
      inline def setFirstTimeSetup(value: Boolean): Self = StObject.set(x, "firstTimeSetup", value.asInstanceOf[js.Any])
    }
  }
}
