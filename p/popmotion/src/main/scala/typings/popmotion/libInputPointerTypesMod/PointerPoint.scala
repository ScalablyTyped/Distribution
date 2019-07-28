package typings.popmotion.libInputPointerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerPoint extends js.Object {
  var clientX: Double
  var clientY: Double
  var pageX: Double
  var pageY: Double
  var x: Double
  var y: Double
}

object PointerPoint {
  @scala.inline
  def apply(clientX: Double, clientY: Double, pageX: Double, pageY: Double, x: Double, y: Double): PointerPoint = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, pageX = pageX, pageY = pageY, x = x, y = y)
  
    __obj.asInstanceOf[PointerPoint]
  }
}

