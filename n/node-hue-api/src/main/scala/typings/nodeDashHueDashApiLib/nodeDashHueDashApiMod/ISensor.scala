package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensor extends js.Object {
  var config: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]
  var id: js.UndefOr[java.lang.String] = js.undefined
  var manufacturername: java.lang.String
  var modelid: java.lang.String
  var name: java.lang.String
  var state: nodeDashHueDashApiLib.Anon_Key
  var swversion: java.lang.String
  var `type`: java.lang.String
  var uniqueid: js.UndefOr[java.lang.String] = js.undefined
}

object ISensor {
  @scala.inline
  def apply(
    config: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String],
    manufacturername: java.lang.String,
    modelid: java.lang.String,
    name: java.lang.String,
    state: nodeDashHueDashApiLib.Anon_Key,
    swversion: java.lang.String,
    `type`: java.lang.String,
    id: java.lang.String = null,
    uniqueid: java.lang.String = null
  ): ISensor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("manufacturername")(manufacturername)
    __obj.updateDynamic("modelid")(modelid)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("swversion")(swversion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (uniqueid != null) __obj.updateDynamic("uniqueid")(uniqueid)
    __obj.asInstanceOf[ISensor]
  }
}

