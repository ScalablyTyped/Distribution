package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wireMod {
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.wireMod.ExistingConnectConfig
    - typings.openfin.wireMod.NewConnectConfig
    - typings.openfin.wireMod.ExternalConfig
  */
  type ConnectConfig = typings.openfin.wireMod._ConnectConfig | typings.openfin.wireMod.NewConnectConfig
  type InternalConnectConfig = typings.openfin.wireMod.ExistingConnectConfig | typings.openfin.wireMod.NewConnectConfig
  type NewConnectConfig = typings.openfin.wireMod.ConfigWithUuid with typings.openfin.wireMod.ConfigWithRuntime
  type PortDiscoveryConfig = (typings.openfin.wireMod.ExternalConfig with typings.openfin.wireMod.ConfigWithRuntime) | typings.openfin.wireMod.NewConnectConfig
}
