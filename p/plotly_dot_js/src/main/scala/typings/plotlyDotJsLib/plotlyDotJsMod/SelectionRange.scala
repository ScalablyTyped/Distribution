package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  var x: js.Array[scala.Double]
  var y: js.Array[scala.Double]
}

object SelectionRange {
  @scala.inline
  def apply(x: js.Array[scala.Double], y: js.Array[scala.Double]): SelectionRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[SelectionRange]
  }
}

