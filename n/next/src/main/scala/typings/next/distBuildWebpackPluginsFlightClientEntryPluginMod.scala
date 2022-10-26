package typings.next

import typings.next.anon.BundlePath
import typings.next.anon.Compilation
import typings.next.anon.Layer
import typings.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.ClientComponentImports
import typings.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.CssImports
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFlightClientEntryPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "FlightClientEntryPlugin")
  @js.native
  open class FlightClientEntryPlugin protected () extends StObject {
    def this(options: Options) = this()
    
    def addEntry(compilation: Any, context: String, entry: Any, options: Layer): js.Promise[Any] = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def collectClientComponentsAndCSSForDependency(param0: Compilation): js.Tuple2[ClientComponentImports, CssImports] = js.native
    
    def createClientEntries(compiler: Any, compilation: Any): js.Promise[Unit] = js.native
    
    var dev: Boolean = js.native
    
    def injectClientEntryAndSSRModules(param0: BundlePath): js.Promise[Boolean] = js.native
    
    var isEdgeServer: Boolean = js.native
  }
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "edgeServerModuleIds")
  @js.native
  val edgeServerModuleIds: Map[String, String | Double] = js.native
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "injectedClientEntries")
  @js.native
  val injectedClientEntries: Map[Any, Any] = js.native
  
  @JSImport("next/dist/build/webpack/plugins/flight-client-entry-plugin", "serverModuleIds")
  @js.native
  val serverModuleIds: Map[String, String | Double] = js.native
  
  trait Options extends StObject {
    
    var dev: Boolean
    
    var isEdgeServer: Boolean
  }
  object Options {
    
    inline def apply(dev: Boolean, isEdgeServer: Boolean): Options = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], isEdgeServer = isEdgeServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeServer(value: Boolean): Self = StObject.set(x, "isEdgeServer", value.asInstanceOf[js.Any])
    }
  }
}
