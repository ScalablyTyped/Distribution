package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFlightTypesPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/flight-types-plugin", "FlightTypesPlugin")
  @js.native
  open class FlightTypesPlugin protected () extends StObject {
    def this(options: Options) = this()
    
    var appDir: String = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    var dev: Boolean = js.native
    
    var dir: String = js.native
    
    var isEdgeServer: Boolean = js.native
  }
  
  trait Options extends StObject {
    
    var appDir: String
    
    var dev: Boolean
    
    var dir: String
    
    var isEdgeServer: Boolean
  }
  object Options {
    
    inline def apply(appDir: String, dev: Boolean, dir: String, isEdgeServer: Boolean): Options = {
      val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], isEdgeServer = isEdgeServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeServer(value: Boolean): Self = StObject.set(x, "isEdgeServer", value.asInstanceOf[js.Any])
    }
  }
}
