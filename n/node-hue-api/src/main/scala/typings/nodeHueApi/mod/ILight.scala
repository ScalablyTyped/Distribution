package typings.nodeHueApi.mod

import typings.nodeHueApi.Anon1
import typings.nodeHueApi.AnonAlert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILight extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var manufacturername: String
  var modelid: String
  var name: String
  var pointsymbol: js.UndefOr[Anon1] = js.undefined
  var state: AnonAlert
  var swversion: String
  var `type`: String
  var uniqueid: String
}

object ILight {
  @scala.inline
  def apply(
    manufacturername: String,
    modelid: String,
    name: String,
    state: AnonAlert,
    swversion: String,
    `type`: String,
    uniqueid: String,
    id: String = null,
    pointsymbol: Anon1 = null
  ): ILight = {
    val __obj = js.Dynamic.literal(manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], uniqueid = uniqueid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (pointsymbol != null) __obj.updateDynamic("pointsymbol")(pointsymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILight]
  }
}

