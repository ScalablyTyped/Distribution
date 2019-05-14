package typings
package popmotionLib.libInputPointerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerPoint extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object PointerPoint {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): PointerPoint = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, pageX = pageX, pageY = pageY, x = x, y = y)
  
    __obj.asInstanceOf[PointerPoint]
  }
}

