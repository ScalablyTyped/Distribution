package typings.ol.styleImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var displacement: js.Array[Double]
  var opacity: Double
  var rotateWithView: Boolean
  var rotation: Double
  var scale: Double
}

object Options {
  @scala.inline
  def apply(
    displacement: js.Array[Double],
    opacity: Double,
    rotateWithView: Boolean,
    rotation: Double,
    scale: Double
  ): Options = {
    val __obj = js.Dynamic.literal(displacement = displacement.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], rotateWithView = rotateWithView.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

