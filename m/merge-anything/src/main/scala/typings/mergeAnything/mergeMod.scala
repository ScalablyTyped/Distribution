package typings.mergeAnything

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("merge-anything/types/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(origin: js.Any, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def default(origin: IConfig, newComers: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], newComers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Extension = js.Function2[/* param1 */ js.Any, /* param2 */ js.Any, js.Any]
  
  trait IConfig extends StObject {
    
    var extensions: js.Array[Extension]
  }
  object IConfig {
    
    inline def apply(extensions: js.Array[Extension]): IConfig = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    extension [Self <: IConfig](x: Self) {
      
      inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    }
  }
}
