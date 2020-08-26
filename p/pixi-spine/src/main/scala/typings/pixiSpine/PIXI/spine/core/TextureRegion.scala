package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureRegion extends js.Object {
  var size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any = js.native
  var texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any = js.native
  def height: Double = js.native
  def offsetX: Double = js.native
  def offsetY: Double = js.native
  def originalHeight: Double = js.native
  def originalWidth: Double = js.native
  def pixiOffsetY: Double = js.native
  def rotate: Boolean = js.native
  def spineOffsetY: Double = js.native
  def u: Double = js.native
  def u2: Double = js.native
  def v: Double = js.native
  def v2: Double = js.native
  def width: Double = js.native
  def x: Double = js.native
  def y: Double = js.native
}

object TextureRegion {
  @scala.inline
  def apply(
    height: () => Double,
    offsetX: () => Double,
    offsetY: () => Double,
    originalHeight: () => Double,
    originalWidth: () => Double,
    pixiOffsetY: () => Double,
    rotate: () => Boolean,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any,
    spineOffsetY: () => Double,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    u: () => Double,
    u2: () => Double,
    v: () => Double,
    v2: () => Double,
    width: () => Double,
    x: () => Double,
    y: () => Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = js.Any.fromFunction0(height), offsetX = js.Any.fromFunction0(offsetX), offsetY = js.Any.fromFunction0(offsetY), originalHeight = js.Any.fromFunction0(originalHeight), originalWidth = js.Any.fromFunction0(originalWidth), pixiOffsetY = js.Any.fromFunction0(pixiOffsetY), rotate = js.Any.fromFunction0(rotate), size = size.asInstanceOf[js.Any], spineOffsetY = js.Any.fromFunction0(spineOffsetY), texture = texture.asInstanceOf[js.Any], u = js.Any.fromFunction0(u), u2 = js.Any.fromFunction0(u2), v = js.Any.fromFunction0(v), v2 = js.Any.fromFunction0(v2), width = js.Any.fromFunction0(width), x = js.Any.fromFunction0(x), y = js.Any.fromFunction0(y))
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
    def setHeight(value: () => Double): Self = this.set("height", js.Any.fromFunction0(value))
    @scala.inline
    def setOffsetX(value: () => Double): Self = this.set("offsetX", js.Any.fromFunction0(value))
    @scala.inline
    def setOffsetY(value: () => Double): Self = this.set("offsetY", js.Any.fromFunction0(value))
    @scala.inline
    def setOriginalHeight(value: () => Double): Self = this.set("originalHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setOriginalWidth(value: () => Double): Self = this.set("originalWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setPixiOffsetY(value: () => Double): Self = this.set("pixiOffsetY", js.Any.fromFunction0(value))
    @scala.inline
    def setRotate(value: () => Boolean): Self = this.set("rotate", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpineOffsetY(value: () => Double): Self = this.set("spineOffsetY", js.Any.fromFunction0(value))
    @scala.inline
    def setTexture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
    ): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setU(value: () => Double): Self = this.set("u", js.Any.fromFunction0(value))
    @scala.inline
    def setU2(value: () => Double): Self = this.set("u2", js.Any.fromFunction0(value))
    @scala.inline
    def setV(value: () => Double): Self = this.set("v", js.Any.fromFunction0(value))
    @scala.inline
    def setV2(value: () => Double): Self = this.set("v2", js.Any.fromFunction0(value))
    @scala.inline
    def setWidth(value: () => Double): Self = this.set("width", js.Any.fromFunction0(value))
    @scala.inline
    def setX(value: () => Double): Self = this.set("x", js.Any.fromFunction0(value))
    @scala.inline
    def setY(value: () => Double): Self = this.set("y", js.Any.fromFunction0(value))
  }
  
}

