package typings.pleaseUpgradeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var exitCode: Double = js.native
  def message(version: String): String = js.native
}

object Options {
  @scala.inline
  def apply(exitCode: Double, message: String => String): Options = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = js.Any.fromFunction1(message))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String => String): Self = this.set("message", js.Any.fromFunction1(value))
  }
  
}

