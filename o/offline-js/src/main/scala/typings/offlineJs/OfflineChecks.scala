package typings.offlineJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineChecks extends js.Object {
  var active: js.UndefOr[String] = js.native
  var image: js.UndefOr[OfflineCheck] = js.native
  // TODO "xhr" and "image" probably have different options.
  // However, this is not stated in the project documentation.
  var xhr: js.UndefOr[OfflineCheck] = js.native
}

object OfflineChecks {
  @scala.inline
  def apply(): OfflineChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfflineChecks]
  }
  @scala.inline
  implicit class OfflineChecksOps[Self <: OfflineChecks] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setImage(value: OfflineCheck): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setXhr(value: OfflineCheck): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

