package typings.openfin.systemApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  var isRunning: Boolean = js.native
  var parentUuid: js.UndefOr[String] = js.native
  var uuid: String = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(isRunning: Boolean, uuid: String): ApplicationInfo = {
    val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
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
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentUuid(value: String): Self = this.set("parentUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentUuid: Self = this.set("parentUuid", js.undefined)
  }
  
}

