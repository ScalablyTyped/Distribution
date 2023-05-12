package typings.metroConfig

import typings.metroConfig.srcConfigTypesMod.ConfigT
import typings.metroConfig.srcConfigTypesMod.InputConfigT
import typings.metroConfig.srcConfigTypesMod.YargArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLoadConfigMod {
  
  @JSImport("metro-config/src/loadConfig", JSImport.Namespace)
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
  
  trait CosmiConfigResult extends StObject {
    
    var config: (js.Function1[/* partialConfig */ ConfigT, ConfigT | js.Promise[ConfigT]]) | InputConfigT
    
    var filepath: String
    
    var isEmpty: Boolean
  }
  object CosmiConfigResult {
    
    inline def apply(
      config: (js.Function1[/* partialConfig */ ConfigT, ConfigT | js.Promise[ConfigT]]) | InputConfigT,
      filepath: String,
      isEmpty: Boolean
    ): CosmiConfigResult = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[CosmiConfigResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CosmiConfigResult] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: (js.Function1[/* partialConfig */ ConfigT, ConfigT | js.Promise[ConfigT]]) | InputConfigT): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigFunction1(value: /* partialConfig */ ConfigT => ConfigT | js.Promise[ConfigT]): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    }
  }
}
