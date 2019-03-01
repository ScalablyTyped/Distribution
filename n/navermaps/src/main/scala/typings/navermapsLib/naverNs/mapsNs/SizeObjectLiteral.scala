package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeObjectLiteral extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object SizeObjectLiteral {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): SizeObjectLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SizeObjectLiteral]
  }
}

