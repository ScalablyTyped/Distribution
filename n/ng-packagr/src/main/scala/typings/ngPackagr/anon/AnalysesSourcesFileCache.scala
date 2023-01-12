package typings.ngPackagr.anon

import typings.angularCompilerCli.mod.NgtscProgram
import typings.angularCompilerCli.srcTransformersApiMod.Program
import typings.ngPackagr.libFileSystemFileCacheMod.FileCache
import typings.ngPackagr.libNgPackageNgccCacheMod.NgccProcessingCache
import typings.ngPackagr.libNgPackageNodesMod.OutputFileCache
import typings.ngPackagr.libStylesStylesheetProcessorMod.StylesheetProcessor
import typings.ngPackagr.ngPackagrStrings.analysis
import typings.rollup.mod.RollupCache
import typings.std.Record
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysesSourcesFileCache extends StObject {
  
  var analysesSourcesFileCache: FileCache
  
  var moduleResolutionCache: ModuleResolutionCache
  
  var ngccProcessingCache: NgccProcessingCache
  
  var oldBuilder: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.undefined
  
  var oldNgtscProgram: js.UndefOr[NgtscProgram] = js.undefined
  
  var oldPrograms: js.UndefOr[Record[ScriptTarget | analysis, Program | typings.typescript.mod.Program]] = js.undefined
  
  var outputCache: OutputFileCache
  
  var rollupFESM2015Cache: js.UndefOr[RollupCache] = js.undefined
  
  var rollupFESM2020Cache: js.UndefOr[RollupCache] = js.undefined
  
  var sourcesFileCache: FileCache
  
  var stylesheetProcessor: js.UndefOr[StylesheetProcessor] = js.undefined
}
object AnalysesSourcesFileCache {
  
  inline def apply(
    analysesSourcesFileCache: FileCache,
    moduleResolutionCache: ModuleResolutionCache,
    ngccProcessingCache: NgccProcessingCache,
    outputCache: OutputFileCache,
    sourcesFileCache: FileCache
  ): AnalysesSourcesFileCache = {
    val __obj = js.Dynamic.literal(analysesSourcesFileCache = analysesSourcesFileCache.asInstanceOf[js.Any], moduleResolutionCache = moduleResolutionCache.asInstanceOf[js.Any], ngccProcessingCache = ngccProcessingCache.asInstanceOf[js.Any], outputCache = outputCache.asInstanceOf[js.Any], sourcesFileCache = sourcesFileCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysesSourcesFileCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysesSourcesFileCache] (val x: Self) extends AnyVal {
    
    inline def setAnalysesSourcesFileCache(value: FileCache): Self = StObject.set(x, "analysesSourcesFileCache", value.asInstanceOf[js.Any])
    
    inline def setModuleResolutionCache(value: ModuleResolutionCache): Self = StObject.set(x, "moduleResolutionCache", value.asInstanceOf[js.Any])
    
    inline def setNgccProcessingCache(value: NgccProcessingCache): Self = StObject.set(x, "ngccProcessingCache", value.asInstanceOf[js.Any])
    
    inline def setOldBuilder(value: EmitAndSemanticDiagnosticsBuilderProgram): Self = StObject.set(x, "oldBuilder", value.asInstanceOf[js.Any])
    
    inline def setOldBuilderUndefined: Self = StObject.set(x, "oldBuilder", js.undefined)
    
    inline def setOldNgtscProgram(value: NgtscProgram): Self = StObject.set(x, "oldNgtscProgram", value.asInstanceOf[js.Any])
    
    inline def setOldNgtscProgramUndefined: Self = StObject.set(x, "oldNgtscProgram", js.undefined)
    
    inline def setOldPrograms(value: Record[ScriptTarget | analysis, Program | typings.typescript.mod.Program]): Self = StObject.set(x, "oldPrograms", value.asInstanceOf[js.Any])
    
    inline def setOldProgramsUndefined: Self = StObject.set(x, "oldPrograms", js.undefined)
    
    inline def setOutputCache(value: OutputFileCache): Self = StObject.set(x, "outputCache", value.asInstanceOf[js.Any])
    
    inline def setRollupFESM2015Cache(value: RollupCache): Self = StObject.set(x, "rollupFESM2015Cache", value.asInstanceOf[js.Any])
    
    inline def setRollupFESM2015CacheUndefined: Self = StObject.set(x, "rollupFESM2015Cache", js.undefined)
    
    inline def setRollupFESM2020Cache(value: RollupCache): Self = StObject.set(x, "rollupFESM2020Cache", value.asInstanceOf[js.Any])
    
    inline def setRollupFESM2020CacheUndefined: Self = StObject.set(x, "rollupFESM2020Cache", js.undefined)
    
    inline def setSourcesFileCache(value: FileCache): Self = StObject.set(x, "sourcesFileCache", value.asInstanceOf[js.Any])
    
    inline def setStylesheetProcessor(value: StylesheetProcessor): Self = StObject.set(x, "stylesheetProcessor", value.asInstanceOf[js.Any])
    
    inline def setStylesheetProcessorUndefined: Self = StObject.set(x, "stylesheetProcessor", js.undefined)
  }
}
