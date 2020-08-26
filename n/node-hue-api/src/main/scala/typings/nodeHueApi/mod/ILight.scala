package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Alert
import typings.nodeHueApi.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILight extends js.Object {
  var id: js.UndefOr[String] = js.native
  var manufacturername: String = js.native
  var modelid: String = js.native
  var name: String = js.native
  var pointsymbol: js.UndefOr[`1`] = js.native
  var state: Alert = js.native
  var swversion: String = js.native
  var `type`: String = js.native
  var uniqueid: String = js.native
}

object ILight {
  @scala.inline
  def apply(
    manufacturername: String,
    modelid: String,
    name: String,
    state: Alert,
    swversion: String,
    `type`: String,
    uniqueid: String
  ): ILight = {
    val __obj = js.Dynamic.literal(manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], uniqueid = uniqueid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILight]
  }
  @scala.inline
  implicit class ILightOps[Self <: ILight] (val x: Self) extends AnyVal {
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
    def setManufacturername(value: String): Self = this.set("manufacturername", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelid(value: String): Self = this.set("modelid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Alert): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwversion(value: String): Self = this.set("swversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueid(value: String): Self = this.set("uniqueid", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPointsymbol(value: `1`): Self = this.set("pointsymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsymbol: Self = this.set("pointsymbol", js.undefined)
  }
  
}

