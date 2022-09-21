package typings.ngPackagr

import typings.angularCompilerCli.performCompileMod.ParsedConfiguration
import typings.ngPackagr.nodesMod.EntryPointNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsconfigMod {
  
  @JSImport("ng-packagr/lib/ts/tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/ts/tsconfig", "defaultTsConfigPath")
  @js.native
  val defaultTsConfigPath: String = js.native
  
  inline def initializeTsConfig(defaultTsConfig: String, entryPoints: js.Array[EntryPointNode]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeTsConfig")(defaultTsConfig.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def initializeTsConfig(defaultTsConfig: Unit, entryPoints: js.Array[EntryPointNode]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeTsConfig")(defaultTsConfig.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def initializeTsConfig(defaultTsConfig: ParsedConfiguration, entryPoints: js.Array[EntryPointNode]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeTsConfig")(defaultTsConfig.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setDependenciesTsConfigPaths(parsedTsConfig: ParsedConfiguration, entryPoints: js.Array[EntryPointNode]): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("setDependenciesTsConfigPaths")(parsedTsConfig.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def setDependenciesTsConfigPaths(parsedTsConfig: ParsedConfiguration, entryPoints: js.Array[EntryPointNode], pointToSource: Boolean): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("setDependenciesTsConfigPaths")(parsedTsConfig.asInstanceOf[js.Any], entryPoints.asInstanceOf[js.Any], pointToSource.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
}
