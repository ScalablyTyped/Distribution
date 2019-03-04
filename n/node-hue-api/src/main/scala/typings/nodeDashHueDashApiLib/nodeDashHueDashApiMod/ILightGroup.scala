package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightGroup extends js.Object {
  var action: js.UndefOr[nodeDashHueDashApiLib.Anon_Bri] = js.undefined
  var `class`: js.UndefOr[RoomType] = js.undefined
  var id: java.lang.String
  var lights: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var `type`: LightGroupType
}

object ILightGroup {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    `type`: LightGroupType,
    action: nodeDashHueDashApiLib.Anon_Bri = null,
    `class`: RoomType = null,
    lights: js.Array[java.lang.String] = null
  ): ILightGroup = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (action != null) __obj.updateDynamic("action")(action)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (lights != null) __obj.updateDynamic("lights")(lights)
    __obj.asInstanceOf[ILightGroup]
  }
}

