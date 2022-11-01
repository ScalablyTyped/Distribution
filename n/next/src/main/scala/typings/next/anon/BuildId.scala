package typings.next.anon

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distCompiledWebpackWebpackMod.webpack.EntryObject
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.next.distSharedLibConstantsMod.CompilerNameValues
import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildId extends StObject {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  var buildId: String
  
  var compilerType: CompilerNameValues
  
  var config: NextConfigComplete
  
  var dev: js.UndefOr[Boolean] = js.undefined
  
  var entrypoints: EntryObject
  
  var isDevFallback: js.UndefOr[Boolean] = js.undefined
  
  var middlewareMatchers: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var reactProductionProfiling: js.UndefOr[Boolean] = js.undefined
  
  var rewrites: AfterFiles
  
  var runWebpackSpan: Span
  
  var target: js.UndefOr[String] = js.undefined
}
object BuildId {
  
  inline def apply(
    buildId: String,
    compilerType: CompilerNameValues,
    config: NextConfigComplete,
    entrypoints: EntryObject,
    rewrites: AfterFiles,
    runWebpackSpan: Span
  ): BuildId = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], compilerType = compilerType.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], entrypoints = entrypoints.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any], runWebpackSpan = runWebpackSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildId]
  }
  
  extension [Self <: BuildId](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setCompilerType(value: CompilerNameValues): Self = StObject.set(x, "compilerType", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: NextConfigComplete): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
    
    inline def setEntrypoints(value: EntryObject): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    inline def setIsDevFallback(value: Boolean): Self = StObject.set(x, "isDevFallback", value.asInstanceOf[js.Any])
    
    inline def setIsDevFallbackUndefined: Self = StObject.set(x, "isDevFallback", js.undefined)
    
    inline def setMiddlewareMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "middlewareMatchers", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareMatchersUndefined: Self = StObject.set(x, "middlewareMatchers", js.undefined)
    
    inline def setMiddlewareMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "middlewareMatchers", js.Array(value*))
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setReactProductionProfiling(value: Boolean): Self = StObject.set(x, "reactProductionProfiling", value.asInstanceOf[js.Any])
    
    inline def setReactProductionProfilingUndefined: Self = StObject.set(x, "reactProductionProfiling", js.undefined)
    
    inline def setRewrites(value: AfterFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    inline def setRunWebpackSpan(value: Span): Self = StObject.set(x, "runWebpackSpan", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
