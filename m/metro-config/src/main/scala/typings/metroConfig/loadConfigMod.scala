package typings.metroConfig

import typings.metroConfig.configTypesMod.ConfigT
import typings.metroConfig.configTypesMod.InputConfigT
import typings.metroConfig.configTypesMod.YargArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadConfigMod {
  
  @JSImport("metro-config/loadConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfig(): js.Promise[ConfigT] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: Unit, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any], defaultConfigOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: YargArguments): js.Promise[ConfigT] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConfigT]]
  inline def loadConfig(argv: YargArguments, defaultConfigOverrides: InputConfigT): js.Promise[ConfigT] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(argv.asInstanceOf[js.Any], defaultConfigOverrides.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConfigT]]
}
