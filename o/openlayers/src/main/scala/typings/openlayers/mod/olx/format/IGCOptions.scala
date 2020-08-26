package typings.openlayers.mod.olx.format

import typings.openlayers.mod.format.IGCZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable-next-line:interface-name */
@js.native
trait IGCOptions extends js.Object {
  var altitudeMode: js.UndefOr[IGCZ] = js.native
}

object IGCOptions {
  @scala.inline
  def apply(): IGCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGCOptions]
  }
  @scala.inline
  implicit class IGCOptionsOps[Self <: IGCOptions] (val x: Self) extends AnyVal {
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
    def setAltitudeMode(value: IGCZ): Self = this.set("altitudeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitudeMode: Self = this.set("altitudeMode", js.undefined)
  }
  
}

