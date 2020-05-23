package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureRegion extends js.Object {
  val height: Double
  val offsetX: Double
  val offsetY: Double
  val originalHeight: Double
  val originalWidth: Double
  val pixiOffsetY: Double
  val rotate: Boolean
  var size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  val spineOffsetY: Double
  var texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  val u: Double
  val u2: Double
  val v: Double
  val v2: Double
  val width: Double
  val x: Double
  val y: Double
}

object TextureRegion {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    pixiOffsetY: Double,
    rotate: Boolean,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any,
    spineOffsetY: Double,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    u: Double,
    u2: Double,
    v: Double,
    v2: Double,
    width: Double,
    x: Double,
    y: Double
  ): TextureRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], pixiOffsetY = pixiOffsetY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spineOffsetY = spineOffsetY.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureRegion]
  }
}

