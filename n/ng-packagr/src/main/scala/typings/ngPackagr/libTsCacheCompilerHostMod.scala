package typings.ngPackagr

import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions
import typings.ngPackagr.libFileSystemFileCacheMod.FileCache
import typings.ngPackagr.libGraphBuildGraphMod.BuildGraph
import typings.ngPackagr.libNgPackageNodesMod.EntryPointNode
import typings.ngPackagr.libStylesStylesheetProcessorMod.StylesheetProcessor
import typings.ngPackagr.ngPackagrStrings.css
import typings.ngPackagr.ngPackagrStrings.less
import typings.ngPackagr.ngPackagrStrings.sass
import typings.ngPackagr.ngPackagrStrings.scss
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTsCacheCompilerHostMod {
  
  @JSImport("ng-packagr/lib/ts/cache-compiler-host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def augmentProgramWithVersioning(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augmentProgramWithVersioning")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: Unit,
    inlineStyleLanguage: js.UndefOr[css | less | sass | scss]
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: Unit,
    inlineStyleLanguage: js.UndefOr[css | less | sass | scss],
    sourcesFileCache: FileCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any], sourcesFileCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: Unit,
    inlineStyleLanguage: Unit,
    sourcesFileCache: FileCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any], sourcesFileCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: StylesheetProcessor
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: StylesheetProcessor,
    inlineStyleLanguage: js.UndefOr[css | less | sass | scss]
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: StylesheetProcessor,
    inlineStyleLanguage: js.UndefOr[css | less | sass | scss],
    sourcesFileCache: FileCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any], sourcesFileCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
  inline def cacheCompilerHost(
    graph: BuildGraph,
    entryPoint: EntryPointNode,
    compilerOptions: CompilerOptions,
    moduleResolutionCache: ModuleResolutionCache,
    stylesheetProcessor: StylesheetProcessor,
    inlineStyleLanguage: Unit,
    sourcesFileCache: FileCache
  ): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheCompilerHost")(graph.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any], stylesheetProcessor.asInstanceOf[js.Any], inlineStyleLanguage.asInstanceOf[js.Any], sourcesFileCache.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]
}
