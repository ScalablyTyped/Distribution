package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureRegion extends js.Object {
  var height: Double
  var offsetX: Double
  var offsetY: Double
  var originalHeight: Double
  var originalWidth: Double
  var renderObject: js.Any
  var rotate: Boolean
  var u: Double
  var u2: Double
  var v: Double
  var v2: Double
  var width: Double
}

object TextureRegion {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    renderObject: js.Any,
    rotate: Boolean,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureRegion]
  }
}

