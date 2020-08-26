package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAtlasRegion extends TextureRegion {
  var degrees: Double = js.native
  var index: Double = js.native
  var name: String = js.native
  var page: TextureAtlasPage = js.native
  var texture: Texture = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object TextureAtlasRegion {
  @scala.inline
  def apply(
    degrees: Double,
    height: Double,
    index: Double,
    name: String,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    page: TextureAtlasPage,
    renderObject: js.Any,
    rotate: Boolean,
    texture: Texture,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double,
    x: Double,
    y: Double
  ): TextureAtlasRegion = {
    val __obj = js.Dynamic.literal(degrees = degrees.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], renderObject = renderObject.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasRegion]
  }
  @scala.inline
  implicit class TextureAtlasRegionOps[Self <: TextureAtlasRegion] (val x: Self) extends AnyVal {
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
    def setDegrees(value: Double): Self = this.set("degrees", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: TextureAtlasPage): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: Texture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

