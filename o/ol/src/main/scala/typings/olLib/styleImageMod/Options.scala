package typings
package olLib.styleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var opacity: scala.Double
  var rotateWithView: scala.Boolean
  var rotation: scala.Double
  var scale: scala.Double
}

object Options {
  @scala.inline
  def apply(opacity: scala.Double, rotateWithView: scala.Boolean, rotation: scala.Double, scale: scala.Double): Options = {
    val __obj = js.Dynamic.literal(opacity = opacity, rotateWithView = rotateWithView, rotation = rotation, scale = scale)
  
    __obj.asInstanceOf[Options]
  }
}

