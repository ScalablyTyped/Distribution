package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expanded extends js.Object {
  var expanded: scala.Boolean
  var focused: scala.Boolean
  var hovered: scala.Boolean
  var selected: scala.Boolean
  var zoom: scala.Double
}

object Anon_Expanded {
  @scala.inline
  def apply(
    expanded: scala.Boolean,
    focused: scala.Boolean,
    hovered: scala.Boolean,
    selected: scala.Boolean,
    zoom: scala.Double
  ): Anon_Expanded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("focused")(focused)
    __obj.updateDynamic("hovered")(hovered)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[Anon_Expanded]
  }
}

