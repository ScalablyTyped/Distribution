package typings.openfin

import typings.openfin.wireMod.ConnectConfig
import typings.openfin.wireMod.ExternalConfig
import typings.openfin.wireMod.InternalConnectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/util/normalize-config", JSImport.Namespace)
@js.native
object normalizeConfigMod extends js.Object {
  
  def normalizeConfig(config: ConnectConfig): js.Promise[InternalConnectConfig | ExternalConfig] = js.native
  
  def validateConfig(config: ConnectConfig): js.Promise[InternalConnectConfig] = js.native
}
