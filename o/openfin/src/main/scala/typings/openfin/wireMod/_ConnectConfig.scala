package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ConnectConfig extends js.Object

object _ConnectConfig {
  @scala.inline
  def ExistingConnectConfig(address: String, uuid: String): _ConnectConfig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ConnectConfig]
  }
  @scala.inline
  def ExternalConfig(manifestUrl: String): _ConnectConfig = {
    val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ConnectConfig]
  }
}

