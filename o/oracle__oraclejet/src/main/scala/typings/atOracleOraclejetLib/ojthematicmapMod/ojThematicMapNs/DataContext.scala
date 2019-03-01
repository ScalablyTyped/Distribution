package typings
package atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DataContext extends js.Object {
  var color: java.lang.String
  var label: java.lang.String
  var selected: scala.Boolean
  var tooltip: java.lang.String
}

object DataContext {
  @scala.inline
  def apply(
    color: java.lang.String,
    label: java.lang.String,
    selected: scala.Boolean,
    tooltip: java.lang.String
  ): DataContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DataContext]
  }
}

