package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleImageOptions extends js.Object {
  var opacity: scala.Double
  var rotateWithView: scala.Boolean
  var rotation: scala.Double
  var scale: scala.Double
  var snapToPixel: scala.Boolean
}

object StyleImageOptions {
  @scala.inline
  def apply(
    opacity: scala.Double,
    rotateWithView: scala.Boolean,
    rotation: scala.Double,
    scale: scala.Double,
    snapToPixel: scala.Boolean
  ): StyleImageOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity, rotateWithView = rotateWithView, rotation = rotation, scale = scale, snapToPixel = snapToPixel)
  
    __obj.asInstanceOf[StyleImageOptions]
  }
}

