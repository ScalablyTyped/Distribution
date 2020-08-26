package typings.pngjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNGMetadata extends js.Object {
  var alpha: Boolean = js.native
  var color: Boolean = js.native
  var height: Double = js.native
  var interlace: Boolean = js.native
  var palette: Boolean = js.native
  var width: Double = js.native
}

object PNGMetadata {
  @scala.inline
  def apply(
    alpha: Boolean,
    color: Boolean,
    height: Double,
    interlace: Boolean,
    palette: Boolean,
    width: Double
  ): PNGMetadata = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNGMetadata]
  }
  @scala.inline
  implicit class PNGMetadataOps[Self <: PNGMetadata] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterlace(value: Boolean): Self = this.set("interlace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPalette(value: Boolean): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

