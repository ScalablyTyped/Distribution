package typings
package atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext extends js.Object {
  var color: java.lang.String
  var label: java.lang.String
  var selected: scala.Boolean
  var tooltip: java.lang.String
  var value: scala.Double
}

object ItemContext {
  @scala.inline
  def apply(
    color: java.lang.String,
    label: java.lang.String,
    selected: scala.Boolean,
    tooltip: java.lang.String,
    value: scala.Double
  ): ItemContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ItemContext]
  }
}

