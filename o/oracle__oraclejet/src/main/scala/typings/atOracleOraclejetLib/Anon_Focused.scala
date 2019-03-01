package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: scala.Boolean
  var hovered: scala.Boolean
  var selected: scala.Boolean
}

object Anon_Focused {
  @scala.inline
  def apply(focused: scala.Boolean, hovered: scala.Boolean, selected: scala.Boolean): Anon_Focused = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focused")(focused)
    __obj.updateDynamic("hovered")(hovered)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_Focused]
  }
}

