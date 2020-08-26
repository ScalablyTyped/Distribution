package typings.pngjs.mod

import typings.pngjs.pngjsNumbers.`16`
import typings.pngjs.pngjsNumbers.`1`
import typings.pngjs.pngjsNumbers.`2`
import typings.pngjs.pngjsNumbers.`3`
import typings.pngjs.pngjsNumbers.`4`
import typings.pngjs.pngjsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var alpha: Boolean = js.native
  var bpp: `1` | `2` | `3` | `4` = js.native
  var color: Boolean = js.native
  var colorType: ColorType = js.native
  var depth: `1` | `2` | `4` | `8` | `16` = js.native
  var height: Double = js.native
  var interlace: Boolean = js.native
  var palette: Boolean = js.native
  var width: Double = js.native
}

object Metadata {
  @scala.inline
  def apply(
    alpha: Boolean,
    bpp: `1` | `2` | `3` | `4`,
    color: Boolean,
    colorType: ColorType,
    depth: `1` | `2` | `4` | `8` | `16`,
    height: Double,
    interlace: Boolean,
    palette: Boolean,
    width: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bpp = bpp.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setBpp(value: `1` | `2` | `3` | `4`): Self = this.set("bpp", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorType(value: ColorType): Self = this.set("colorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: `1` | `2` | `4` | `8` | `16`): Self = this.set("depth", value.asInstanceOf[js.Any])
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

