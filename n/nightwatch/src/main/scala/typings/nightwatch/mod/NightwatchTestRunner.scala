package typings.nightwatch.mod

import typings.nightwatch.anon.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestRunner extends js.Object {
  var options: js.UndefOr[Ui] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object NightwatchTestRunner {
  @scala.inline
  def apply(): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestRunner]
  }
  @scala.inline
  implicit class NightwatchTestRunnerOps[Self <: NightwatchTestRunner] (val x: Self) extends AnyVal {
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
    def setOptions(value: Ui): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

