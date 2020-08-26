package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureRegion extends js.Object {
  var height: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var originalHeight: Double = js.native
  var originalWidth: Double = js.native
  var renderObject: js.Any = js.native
  var rotate: Boolean = js.native
  var u: Double = js.native
  var u2: Double = js.native
  var v: Double = js.native
  var v2: Double = js.native
  var width: Double = js.native
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
  @scala.inline
  implicit class TextureRegionOps[Self <: TextureRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalHeight(value: Double): Self = this.set("originalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalWidth(value: Double): Self = this.set("originalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderObject(value: js.Any): Self = this.set("renderObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setU(value: Double): Self = this.set("u", value.asInstanceOf[js.Any])
    @scala.inline
    def setU2(value: Double): Self = this.set("u2", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setV2(value: Double): Self = this.set("v2", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

