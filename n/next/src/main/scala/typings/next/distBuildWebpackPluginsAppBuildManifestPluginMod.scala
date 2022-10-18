package typings.next

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsAppBuildManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/app-build-manifest-plugin", "AppBuildManifestPlugin")
  @js.native
  open class AppBuildManifestPlugin protected () extends StObject {
    def this(options: Options) = this()
    
    @JSName("apply")
    def apply(compiler: Any): Unit = js.native
    
    /* private */ var createAsset: Any = js.native
    
    /* private */ val dev: Any = js.native
  }
  
  trait AppBuildManifest extends StObject {
    
    var pages: Record[String, js.Array[String]]
  }
  object AppBuildManifest {
    
    inline def apply(pages: Record[String, js.Array[String]]): AppBuildManifest = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppBuildManifest]
    }
    
    extension [Self <: AppBuildManifest](x: Self) {
      
      inline def setPages(value: Record[String, js.Array[String]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    }
  }
  
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
