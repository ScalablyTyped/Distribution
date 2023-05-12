package typings.ngtoolsWebpack

import typings.ngtoolsWebpack.anon.DirectTemplateLoading
import typings.ngtoolsWebpack.srcResourceLoaderMod.WebpackResourceLoader
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyHostMod {
  
  @JSImport("@ngtools/webpack/src/ivy/host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def augmentHostWithCaching(host: CompilerHost, cache: Map[String, SourceFile]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithCaching")(host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentHostWithDependencyCollection(host: CompilerHost, dependencies: Map[String, Set[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithDependencyCollection")(host.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def augmentHostWithDependencyCollection(
    host: CompilerHost,
    dependencies: Map[String, Set[String]],
    moduleResolutionCache: ModuleResolutionCache
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithDependencyCollection")(host.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentHostWithReplacements(host: CompilerHost, replacements: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithReplacements")(host.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def augmentHostWithReplacements(
    host: CompilerHost,
    replacements: Record[String, String],
    moduleResolutionCache: ModuleResolutionCache
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithReplacements")(host.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], moduleResolutionCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentHostWithResources(host: CompilerHost, resourceLoader: WebpackResourceLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithResources")(host.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def augmentHostWithResources(host: CompilerHost, resourceLoader: WebpackResourceLoader, options: DirectTemplateLoading): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithResources")(host.asInstanceOf[js.Any], resourceLoader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentHostWithSubstitutions(host: CompilerHost, substitutions: Record[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithSubstitutions")(host.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentHostWithVersioning(host: CompilerHost): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augmentHostWithVersioning")(host.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def augmentProgramWithVersioning(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("augmentProgramWithVersioning")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
