package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import typings.nodeDashHueDashApi.Anon_Bri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightGroup extends js.Object {
  var action: js.UndefOr[Anon_Bri] = js.undefined
  var `class`: js.UndefOr[RoomType] = js.undefined
  var id: String
  var lights: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var `type`: LightGroupType
}

object ILightGroup {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: LightGroupType,
    action: Anon_Bri = null,
    `class`: RoomType = null,
    lights: js.Array[String] = null
  ): ILightGroup = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (action != null) __obj.updateDynamic("action")(action)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (lights != null) __obj.updateDynamic("lights")(lights)
    __obj.asInstanceOf[ILightGroup]
  }
}

