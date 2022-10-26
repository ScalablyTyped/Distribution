package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Async
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFlightManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/flight-manifest-plugin", "ASYNC_CLIENT_MODULES")
  @js.native
  val ASYNC_CLIENT_MODULES: Set[String] = js.native
  
  @JSImport("next/dist/build/webpack/plugins/flight-manifest-plugin", "FlightManifestPlugin")
  @js.native
  open class FlightManifestPlugin protected () extends StObject {
    def this(options: Options) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    @JSName("createAsset")
    def createAsset_assets(
      assets: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/compiled/webpack/webpack.webpack.Compilation['assets'] */ js.Any,
      compilation: Compilation,
      context: String
    ): Unit = js.native
    
    var dev: Boolean = js.native
  }
  
  trait FlightCSSManifest
    extends StObject
       with /* page */ StringDictionary[js.Array[String]] {
    
    var __entry_css__ : js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object FlightCSSManifest {
    
    inline def apply(): FlightCSSManifest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlightCSSManifest]
    }
    
    extension [Self <: FlightCSSManifest](x: Self) {
      
      inline def set__entry_css__(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "__entry_css__", value.asInstanceOf[js.Any])
      
      inline def set__entry_css__Undefined: Self = StObject.set(x, "__entry_css__", js.undefined)
    }
  }
  
  trait FlightManifest
    extends StObject
       with /* modulePath */ StringDictionary[ManifestNode] {
    
    var __edge_ssr_module_mapping__ : StringDictionary[ManifestNode]
    
    var __ssr_module_mapping__ : StringDictionary[ManifestNode]
  }
  object FlightManifest {
    
    inline def apply(
      __edge_ssr_module_mapping__ : StringDictionary[ManifestNode],
      __ssr_module_mapping__ : StringDictionary[ManifestNode]
    ): FlightManifest = {
      val __obj = js.Dynamic.literal(__edge_ssr_module_mapping__ = __edge_ssr_module_mapping__.asInstanceOf[js.Any], __ssr_module_mapping__ = __ssr_module_mapping__.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlightManifest]
    }
    
    extension [Self <: FlightManifest](x: Self) {
      
      inline def set__edge_ssr_module_mapping__(value: StringDictionary[ManifestNode]): Self = StObject.set(x, "__edge_ssr_module_mapping__", value.asInstanceOf[js.Any])
      
      inline def set__ssr_module_mapping__(value: StringDictionary[ManifestNode]): Self = StObject.set(x, "__ssr_module_mapping__", value.asInstanceOf[js.Any])
    }
  }
  
  type ManifestChunks = js.Array[/* template literal string: ${string}:${string} */ String]
  
  type ManifestNode = StringDictionary[Async]
  
  /**
    * Webpack module id
    */
  type ModuleId = String | Double
  
  trait Options extends StObject {
    
    var dev: Boolean
  }
  object Options {
    
    inline def apply(dev: Boolean): Options = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    }
  }
}
