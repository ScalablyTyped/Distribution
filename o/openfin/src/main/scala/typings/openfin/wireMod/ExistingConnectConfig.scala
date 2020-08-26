package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExistingConnectConfig
  extends ConfigWithUuid
     with _ConnectConfig {
  @JSName("address")
  var address_ExistingConnectConfig: String = js.native
}

object ExistingConnectConfig {
  @scala.inline
  def apply(address: String, uuid: String): ExistingConnectConfig = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingConnectConfig]
  }
  @scala.inline
  implicit class ExistingConnectConfigOps[Self <: ExistingConnectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
  }
  
}

