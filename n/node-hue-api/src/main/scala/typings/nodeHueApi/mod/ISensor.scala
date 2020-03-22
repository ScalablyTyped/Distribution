package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensor extends js.Object {
  var config: StringDictionary[Double | String]
  var id: js.UndefOr[String] = js.undefined
  var manufacturername: String
  var modelid: String
  var name: String
  var state: AnonDictkey
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
    state: AnonDictkey,
    swversion: String,
    `type`: String,
    id: String = null,
    uniqueid: String = null
  ): ISensor = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (uniqueid != null) __obj.updateDynamic("uniqueid")(uniqueid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensor]
  }
}

