package typings.officeUiFabricReact.keytipConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipConfig extends js.Object {
  var keytips: js.Array[IKeytipConfigItem]
}

object IKeytipConfig {
  @scala.inline
  def apply(keytips: js.Array[IKeytipConfigItem]): IKeytipConfig = {
    val __obj = js.Dynamic.literal(keytips = keytips.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipConfig]
  }
}

