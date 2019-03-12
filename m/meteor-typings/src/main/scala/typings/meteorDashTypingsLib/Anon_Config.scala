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
  def apply(config: Anon_ForceApprovalPrompt => scala.Unit): Anon_Config = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
  
    __obj.asInstanceOf[Anon_Config]
  }
}

