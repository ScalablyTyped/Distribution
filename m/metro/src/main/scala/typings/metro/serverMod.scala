package typings.metro

import typings.metro.srcServerMod.DefaultBundleOptions
import typings.metro.srcServerMod.DefaultGraphOptions
import typings.metro.srcServerMod.ServerOptions
import typings.metro.srcServerMod.default
import typings.metroConfig.configTypesMod.ConfigT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("metro/Server", "Server")
  @js.native
  open class Server protected () extends default {
    def this(config: ConfigT) = this()
    def this(config: ConfigT, options: ServerOptions) = this()
  }
  /* static members */
  object Server {
    
    @JSImport("metro/Server", "Server")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro/Server", "Server.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: DefaultBundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: DefaultBundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro/Server", "Server.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
}
