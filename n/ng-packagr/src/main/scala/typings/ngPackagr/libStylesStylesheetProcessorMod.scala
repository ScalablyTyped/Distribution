package typings.ngPackagr

import typings.ngPackagr.anon.FilePath
import typings.ngPackagr.ngPackagrBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesStylesheetProcessorMod {
  
  @js.native
  sealed trait CssUrl extends StObject
  @JSImport("ng-packagr/lib/styles/stylesheet-processor", "CssUrl")
  @js.native
  object CssUrl extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CssUrl & String] = js.native
    
    @js.native
    sealed trait `inline`
      extends StObject
         with CssUrl
    /* "inline" */ val `inline`: typings.ngPackagr.libStylesStylesheetProcessorMod.CssUrl.`inline` & String = js.native
    
    @js.native
    sealed trait none
      extends StObject
         with CssUrl
    /* "none" */ val none: typings.ngPackagr.libStylesStylesheetProcessorMod.CssUrl.none & String = js.native
  }
  
  @JSImport("ng-packagr/lib/styles/stylesheet-processor", "StylesheetProcessor")
  @js.native
  open class StylesheetProcessor protected () extends StObject {
    def this(basePath: String) = this()
    def this(basePath: String, cssUrl: CssUrl) = this()
    def this(basePath: String, cssUrl: Unit, includePaths: js.Array[String]) = this()
    def this(basePath: String, cssUrl: CssUrl, includePaths: js.Array[String]) = this()
    def this(basePath: String, cssUrl: Unit, includePaths: js.Array[String], cacheDirectory: String) = this()
    def this(basePath: String, cssUrl: Unit, includePaths: js.Array[String], cacheDirectory: `false`) = this()
    def this(basePath: String, cssUrl: Unit, includePaths: Unit, cacheDirectory: String) = this()
    def this(basePath: String, cssUrl: Unit, includePaths: Unit, cacheDirectory: `false`) = this()
    def this(basePath: String, cssUrl: CssUrl, includePaths: js.Array[String], cacheDirectory: String) = this()
    def this(basePath: String, cssUrl: CssUrl, includePaths: js.Array[String], cacheDirectory: `false`) = this()
    def this(basePath: String, cssUrl: CssUrl, includePaths: Unit, cacheDirectory: String) = this()
    def this(basePath: String, cssUrl: CssUrl, includePaths: Unit, cacheDirectory: `false`) = this()
    
    /* private */ val basePath: Any = js.native
    
    /* private */ var browserslistData: Any = js.native
    
    /* private */ val cacheDirectory: Any = js.native
    
    /* private */ var createPostCssPlugins: Any = js.native
    
    /* private */ val cssUrl: Any = js.native
    
    /* private */ var esbuild: Any = js.native
    
    /* private */ val includePaths: Any = js.native
    
    /* private */ var postCssProcessor: Any = js.native
    
    def process(param0: FilePath): js.Promise[String] = js.native
    
    /* private */ var renderCss: Any = js.native
    
    /* private */ var styleIncludePaths: Any = js.native
    
    /* private */ var targets: Any = js.native
  }
  
  trait Result extends StObject {
    
    var css: String
    
    var error: js.UndefOr[String] = js.undefined
    
    var warnings: js.Array[String]
  }
  object Result {
    
    inline def apply(css: String, warnings: js.Array[String]): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
