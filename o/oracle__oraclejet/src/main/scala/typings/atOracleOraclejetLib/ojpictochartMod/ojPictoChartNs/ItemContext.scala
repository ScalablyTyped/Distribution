package typings
package atOracleOraclejetLib.ojpictochartMod.ojPictoChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K] extends js.Object {
  var color: java.lang.String
  var count: scala.Double
  var id: K
  var name: java.lang.String
  var selected: scala.Boolean
  var tooltip: java.lang.String
}

object ItemContext {
  @scala.inline
  def apply[K](
    color: java.lang.String,
    count: scala.Double,
    id: K,
    name: java.lang.String,
    selected: scala.Boolean,
    tooltip: java.lang.String
  ): ItemContext[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ItemContext[K]]
  }
}

