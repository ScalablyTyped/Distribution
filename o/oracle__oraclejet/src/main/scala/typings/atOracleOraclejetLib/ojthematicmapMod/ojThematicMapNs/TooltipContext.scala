package typings
package atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K1, K2, K3, D1, D2, D3] extends js.Object {
  var color: java.lang.String | scala.Null
  var componentElement: stdLib.Element
  var data: js.Object | scala.Null
  var id: K1 | K2 | K3
  var itemData: D1 | D2 | D3
  var label: java.lang.String | scala.Null
  var location: java.lang.String | scala.Null
  var locationName: java.lang.String | scala.Null
  var parentElement: stdLib.Element
  var tooltip: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object TooltipContext {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    componentElement: stdLib.Element,
    id: K1 | K2 | K3,
    itemData: D1 | D2 | D3,
    parentElement: stdLib.Element,
    tooltip: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    color: java.lang.String = null,
    data: js.Object = null,
    label: java.lang.String = null,
    location: java.lang.String = null,
    locationName: java.lang.String = null
  ): TooltipContext[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement, tooltip = tooltip, x = x, y = y)
    if (color != null) __obj.updateDynamic("color")(color)
    if (data != null) __obj.updateDynamic("data")(data)
    if (label != null) __obj.updateDynamic("label")(label)
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationName != null) __obj.updateDynamic("locationName")(locationName)
    __obj.asInstanceOf[TooltipContext[K1, K2, K3, D1, D2, D3]]
  }
}

