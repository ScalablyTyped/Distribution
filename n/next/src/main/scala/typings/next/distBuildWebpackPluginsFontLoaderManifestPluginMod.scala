package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.FontLoaderTargets
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsFontLoaderManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/font-loader-manifest-plugin", "FontLoaderManifestPlugin")
  @js.native
  open class FontLoaderManifestPlugin protected () extends StObject {
    def this(options: FontLoaderTargets) = this()
    
    /* private */ var appDirEnabled: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ var fontLoaderTargets: Any = js.native
  }
  
  trait FontLoaderManifest extends StObject {
    
    var app: StringDictionary[js.Array[String]]
    
    var pages: StringDictionary[js.Array[String]]
  }
  object FontLoaderManifest {
    
    inline def apply(app: StringDictionary[js.Array[String]], pages: StringDictionary[js.Array[String]]): FontLoaderManifest = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontLoaderManifest]
    }
    
    extension [Self <: FontLoaderManifest](x: Self) {
      
      inline def setApp(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setPages(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    }
  }
}
