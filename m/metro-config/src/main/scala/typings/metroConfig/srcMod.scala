package typings.metroConfig

import typings.metroConfig.srcConfigTypesMod.ConfigT
import typings.metroConfig.srcConfigTypesMod.InputConfigT
import typings.metroConfig.srcConfigTypesMod.YargArguments
import typings.metroConfig.srcLoadConfigMod.CosmiConfigResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("metro-config/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfig(): js.Promise[ConfigT] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: Unit, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any], defaultConfigOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: YargArguments): js.Promise[ConfigT] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: YargArguments, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any], defaultConfigOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigT]]
  
  inline def mergeConfig(defaultConfig: InputConfigT, configs: InputConfigT*): ConfigT = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(scala.List(defaultConfig.asInstanceOf[js.Any]).`++`(configs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ConfigT]
  
  inline def resolveConfig(): js.Promise[CosmiConfigResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")().asInstanceOf[js.Promise[CosmiConfigResult]]
  inline def resolveConfig(filePath: String): js.Promise[CosmiConfigResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CosmiConfigResult]]
  inline def resolveConfig(filePath: String, cwd: String): js.Promise[CosmiConfigResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(filePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CosmiConfigResult]]
  inline def resolveConfig(filePath: Unit, cwd: String): js.Promise[CosmiConfigResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfig")(filePath.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CosmiConfigResult]]
}
