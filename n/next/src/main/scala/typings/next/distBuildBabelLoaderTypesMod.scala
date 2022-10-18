package typings.next

import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildBabelLoaderTypesMod {
  
  trait NextBabelLoaderOptions extends StObject {
    
    var caller: Any
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var cwd: String
    
    var development: Boolean
    
    var hasJsxRuntime: Boolean
    
    var hasReactRefresh: Boolean
    
    var isServer: Boolean
    
    var overrides: Any
    
    var pagesDir: String
    
    var sourceMaps: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object NextBabelLoaderOptions {
    
    inline def apply(
      caller: Any,
      cwd: String,
      development: Boolean,
      hasJsxRuntime: Boolean,
      hasReactRefresh: Boolean,
      isServer: Boolean,
      overrides: Any,
      pagesDir: String
    ): NextBabelLoaderOptions = {
      val __obj = js.Dynamic.literal(caller = caller.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], development = development.asInstanceOf[js.Any], hasJsxRuntime = hasJsxRuntime.asInstanceOf[js.Any], hasReactRefresh = hasReactRefresh.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pagesDir = pagesDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextBabelLoaderOptions]
    }
    
    extension [Self <: NextBabelLoaderOptions](x: Self) {
      
      inline def setCaller(value: Any): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setHasJsxRuntime(value: Boolean): Self = StObject.set(x, "hasJsxRuntime", value.asInstanceOf[js.Any])
      
      inline def setHasReactRefresh(value: Boolean): Self = StObject.set(x, "hasReactRefresh", value.asInstanceOf[js.Any])
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
      
      inline def setSourceMaps(value: js.Array[Any]): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setSourceMapsVarargs(value: Any*): Self = StObject.set(x, "sourceMaps", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.LoaderContext<{}> * / any */ trait NextJsLoaderContext extends StObject {
    
    var currentTraceSpan: Span
    
    var target: String
  }
  object NextJsLoaderContext {
    
    inline def apply(currentTraceSpan: Span, target: String): NextJsLoaderContext = {
      val __obj = js.Dynamic.literal(currentTraceSpan = currentTraceSpan.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextJsLoaderContext]
    }
    
    extension [Self <: NextJsLoaderContext](x: Self) {
      
      inline def setCurrentTraceSpan(value: Span): Self = StObject.set(x, "currentTraceSpan", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
