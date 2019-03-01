package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait selectionObject extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object selectionObject {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): selectionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[selectionObject]
  }
}

