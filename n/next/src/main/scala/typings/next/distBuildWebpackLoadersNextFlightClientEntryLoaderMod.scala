package typings.next

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextFlightClientEntryLoaderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-flight-client-entry-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  
  type ClientComponentImports = js.Array[String]
  
  type CssImports = Record[String, js.Array[String]]
  
  trait NextFlightClientEntryLoaderOptions extends StObject {
    
    var modules: ClientComponentImports
    
    /** This is transmitted as a string to `getOptions` */
    var server: Boolean
  }
  object NextFlightClientEntryLoaderOptions {
    
    inline def apply(modules: ClientComponentImports, server: Boolean): NextFlightClientEntryLoaderOptions = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextFlightClientEntryLoaderOptions]
    }
    
    extension [Self <: NextFlightClientEntryLoaderOptions](x: Self) {
      
      inline def setModules(value: ClientComponentImports): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setServer(value: Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
