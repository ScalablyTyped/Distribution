package typings.openfin.installedAppsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationInfo extends js.Object {
  var cachedManifest: js.Any = js.native
}

object InstallationInfo {
  @scala.inline
  def apply(cachedManifest: js.Any): InstallationInfo = {
    val __obj = js.Dynamic.literal(cachedManifest = cachedManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationInfo]
  }
  @scala.inline
  implicit class InstallationInfoOps[Self <: InstallationInfo] (val x: Self) extends AnyVal {
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
    def setCachedManifest(value: js.Any): Self = this.set("cachedManifest", value.asInstanceOf[js.Any])
  }
  
}

