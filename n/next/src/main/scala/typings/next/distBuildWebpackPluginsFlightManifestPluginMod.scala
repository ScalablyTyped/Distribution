package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.Chunks
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFlightManifestPluginMod {
  
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
  
  type FlightCSSManifest = StringDictionary[js.Array[String]]
  
  trait FlightManifest
    extends StObject
       with /* modulePath */ StringDictionary[ManifestNode] {
    
    var __ssr_module_mapping__ : StringDictionary[ManifestNode]
  }
  object FlightManifest {
    
    inline def apply(__ssr_module_mapping__ : StringDictionary[ManifestNode]): FlightManifest = {
      val __obj = js.Dynamic.literal(__ssr_module_mapping__ = __ssr_module_mapping__.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlightManifest]
    }
    
    extension [Self <: FlightManifest](x: Self) {
      
      inline def set__ssr_module_mapping__(value: StringDictionary[ManifestNode]): Self = StObject.set(x, "__ssr_module_mapping__", value.asInstanceOf[js.Any])
    }
  }
  
  type ManifestChunks = js.Array[/* template literal string: ${string}:${string} */ String]
  
  type ManifestNode = StringDictionary[Chunks]
  
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
