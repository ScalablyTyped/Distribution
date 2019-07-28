package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashHueDashApi.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensor extends js.Object {
  var config: StringDictionary[Double | String]
  var id: js.UndefOr[String] = js.undefined
  var manufacturername: String
  var modelid: String
  var name: String
  var state: Anon_Key
  var swversion: String
  var `type`: String
  var uniqueid: js.UndefOr[String] = js.undefined
}

object ISensor {
  @scala.inline
  def apply(
    config: StringDictionary[Double | String],
    manufacturername: String,
    modelid: String,
    name: String,
    state: Anon_Key,
    swversion: String,
    `type`: String,
    id: String = null,
    uniqueid: String = null
  ): ISensor = {
    val __obj = js.Dynamic.literal(config = config, manufacturername = manufacturername, modelid = modelid, name = name, state = state, swversion = swversion)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (uniqueid != null) __obj.updateDynamic("uniqueid")(uniqueid)
    __obj.asInstanceOf[ISensor]
  }
}

