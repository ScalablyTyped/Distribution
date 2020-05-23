package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// request params
trait SendParams extends js.Object {
  var Messages: js.Array[SendParamsMessage]
  var SandboxMode: js.UndefOr[Boolean] = js.undefined
}

object SendParams {
  @scala.inline
  def apply(Messages: js.Array[SendParamsMessage], SandboxMode: js.UndefOr[Boolean] = js.undefined): SendParams = {
    val __obj = js.Dynamic.literal(Messages = Messages.asInstanceOf[js.Any])
    if (!js.isUndefined(SandboxMode)) __obj.updateDynamic("SandboxMode")(SandboxMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
}

