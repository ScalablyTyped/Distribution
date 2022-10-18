package typings.next

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibInstallDependenciesMod {
  
  @JSImport("next/dist/lib/install-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def installDependencies(baseDir: String, deps: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("installDependencies")(baseDir.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def installDependencies(baseDir: String, deps: Any, dev: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("installDependencies")(baseDir.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Dependencies extends StObject {
    
    var resolved: Map[String, String]
  }
  object Dependencies {
    
    inline def apply(resolved: Map[String, String]): Dependencies = {
      val __obj = js.Dynamic.literal(resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies]
    }
    
    extension [Self <: Dependencies](x: Self) {
      
      inline def setResolved(value: Map[String, String]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
