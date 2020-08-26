package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandData extends js.Object {
  var cas: js.UndefOr[String] = js.native
  var command: String = js.native
  var execution: Double = js.native
  var key: js.UndefOr[String] = js.native
  var lifetime: js.UndefOr[Double] = js.native
  var redundancyEnabled: js.UndefOr[Boolean] = js.native
  var start: Double = js.native
  var `type`: String = js.native
  var validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]] = js.native
  var value: js.UndefOr[js.Any] = js.native
  def callback(args: js.Any*): js.Any = js.native
}

object CommandData {
  @scala.inline
  def apply(
    callback: /* repeated */ js.Any => js.Any,
    command: String,
    execution: Double,
    start: Double,
    `type`: String,
    validate: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]]
  ): CommandData = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandData]
  }
  @scala.inline
  implicit class CommandDataOps[Self <: CommandData] (val x: Self) extends AnyVal {
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
    def setCallback(value: /* repeated */ js.Any => js.Any): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution(value: Double): Self = this.set("execution", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidateVarargs(value: (js.Tuple2[String, js.Function1[js.Any, js.Any]])*): Self = this.set("validate", js.Array(value :_*))
    @scala.inline
    def setValidate(value: js.Array[js.Tuple2[String, js.Function1[/* repeated */ _, _]]]): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCas(value: String): Self = this.set("cas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCas: Self = this.set("cas", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
    @scala.inline
    def setRedundancyEnabled(value: Boolean): Self = this.set("redundancyEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedundancyEnabled: Self = this.set("redundancyEnabled", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

