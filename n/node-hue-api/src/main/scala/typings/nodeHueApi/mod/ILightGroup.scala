package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Bri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightGroup extends js.Object {
  var action: js.UndefOr[Bri] = js.undefined
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
    action: Bri = null,
    `class`: RoomType = null,
    lights: js.Array[String] = null
  ): ILightGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (lights != null) __obj.updateDynamic("lights")(lights.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILightGroup]
  }
}

