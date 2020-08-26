package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppUuid extends js.Object {
  var appUuid: String = js.native
  var windowName: String = js.native
}

object AppUuid {
  @scala.inline
  def apply(appUuid: String, windowName: String): AppUuid = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUuid]
  }
  @scala.inline
  implicit class AppUuidOps[Self <: AppUuid] (val x: Self) extends AnyVal {
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
    def setAppUuid(value: String): Self = this.set("appUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowName(value: String): Self = this.set("windowName", value.asInstanceOf[js.Any])
  }
  
}

