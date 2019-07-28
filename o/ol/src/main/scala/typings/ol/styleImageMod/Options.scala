package typings.ol.styleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var opacity: Double
  var rotateWithView: Boolean
  var rotation: Double
  var scale: Double
}

object Options {
  @scala.inline
  def apply(opacity: Double, rotateWithView: Boolean, rotation: Double, scale: Double): Options = {
    val __obj = js.Dynamic.literal(opacity = opacity, rotateWithView = rotateWithView, rotation = rotation, scale = scale)
  
    __obj.asInstanceOf[Options]
  }
}

