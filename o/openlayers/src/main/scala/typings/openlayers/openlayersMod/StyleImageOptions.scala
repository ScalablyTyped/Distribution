package typings.openlayers.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleImageOptions extends js.Object {
  var opacity: Double
  var rotateWithView: Boolean
  var rotation: Double
  var scale: Double
  var snapToPixel: Boolean
}

object StyleImageOptions {
  @scala.inline
  def apply(opacity: Double, rotateWithView: Boolean, rotation: Double, scale: Double, snapToPixel: Boolean): StyleImageOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity, rotateWithView = rotateWithView, rotation = rotation, scale = scale, snapToPixel = snapToPixel)
  
    __obj.asInstanceOf[StyleImageOptions]
  }
}

