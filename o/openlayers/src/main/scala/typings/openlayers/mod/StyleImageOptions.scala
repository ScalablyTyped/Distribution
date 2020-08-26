package typings.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleImageOptions extends js.Object {
  var opacity: Double = js.native
  var rotateWithView: Boolean = js.native
  var rotation: Double = js.native
  var scale: Double = js.native
  var snapToPixel: Boolean = js.native
}

object StyleImageOptions {
  @scala.inline
  def apply(opacity: Double, rotateWithView: Boolean, rotation: Double, scale: Double, snapToPixel: Boolean): StyleImageOptions = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], rotateWithView = rotateWithView.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], snapToPixel = snapToPixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleImageOptions]
  }
  @scala.inline
  implicit class StyleImageOptionsOps[Self <: StyleImageOptions] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateWithView(value: Boolean): Self = this.set("rotateWithView", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapToPixel(value: Boolean): Self = this.set("snapToPixel", value.asInstanceOf[js.Any])
  }
  
}

