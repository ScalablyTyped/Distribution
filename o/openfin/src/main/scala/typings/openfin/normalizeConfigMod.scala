package typings.openfin

import typings.openfin.wireMod.ConnectConfig
import typings.openfin.wireMod.ExternalConfig
import typings.openfin.wireMod.InternalConnectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeConfigMod {
  
  @JSImport("openfin/_v2/util/normalize-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeConfig(config: ConnectConfig): js.Promise[InternalConnectConfig | ExternalConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalConnectConfig | ExternalConfig]]
  
  inline def validateConfig(config: ConnectConfig): js.Promise[InternalConnectConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InternalConnectConfig]]
}
