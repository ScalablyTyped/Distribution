package typings.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAvailableDetails extends js.Object {
  /** The version number of the available update. */
  var version: String = js.native
}

object UpdateAvailableDetails {
  @scala.inline
  def apply(version: String): UpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailableDetails]
  }
  @scala.inline
  implicit class UpdateAvailableDetailsOps[Self <: UpdateAvailableDetails] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

