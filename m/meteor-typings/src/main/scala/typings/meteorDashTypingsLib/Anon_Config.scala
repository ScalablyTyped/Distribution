package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  def config(options: Anon_ForceApprovalPrompt): scala.Unit
}

object Anon_Config {
  @scala.inline
  def apply(config: js.Function1[Anon_ForceApprovalPrompt, scala.Unit]): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[Anon_Config]
  }
}

