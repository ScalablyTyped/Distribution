package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureRegion extends js.Object {
  var size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  var texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  def height: Double
  def offsetX: Double
  def offsetY: Double
  def originalHeight: Double
  def originalWidth: Double
  def pixiOffsetY: Double
  def rotate: Boolean
  def spineOffsetY: Double
  def u: Double
  def u2: Double
  def v: Double
  def v2: Double
  def width: Double
  def x: Double
  def y: Double
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
}

