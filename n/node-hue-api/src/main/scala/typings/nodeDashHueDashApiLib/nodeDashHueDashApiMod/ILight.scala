package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILight extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var manufacturername: java.lang.String
  var modelid: java.lang.String
  var name: java.lang.String
  var pointsymbol: js.UndefOr[nodeDashHueDashApiLib.Anon_1] = js.undefined
  var state: nodeDashHueDashApiLib.Anon_Alert
  var swversion: java.lang.String
  var `type`: java.lang.String
  var uniqueid: java.lang.String
}

object ILight {
  @scala.inline
  def apply(
    manufacturername: java.lang.String,
    modelid: java.lang.String,
    name: java.lang.String,
    state: nodeDashHueDashApiLib.Anon_Alert,
    swversion: java.lang.String,
    `type`: java.lang.String,
    uniqueid: java.lang.String,
    id: java.lang.String = null,
    pointsymbol: nodeDashHueDashApiLib.Anon_1 = null
  ): ILight = {
    val __obj = js.Dynamic.literal(manufacturername = manufacturername, modelid = modelid, name = name, state = state, swversion = swversion, uniqueid = uniqueid)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (pointsymbol != null) __obj.updateDynamic("pointsymbol")(pointsymbol)
    __obj.asInstanceOf[ILight]
  }
}

