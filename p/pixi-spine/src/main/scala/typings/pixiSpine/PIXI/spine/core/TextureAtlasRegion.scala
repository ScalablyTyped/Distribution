package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureAtlasRegion extends TextureRegion {
  var index: Double
  var name: String
  var page: TextureAtlasPage
}

object TextureAtlasRegion {
  @scala.inline
  def apply(
    height: Double,
    index: Double,
    name: String,
    offsetX: Double,
    offsetY: Double,
    originalHeight: Double,
    originalWidth: Double,
    page: TextureAtlasPage,
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
  ): TextureAtlasRegion = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pixiOffsetY = pixiOffsetY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spineOffsetY = spineOffsetY.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], u2 = u2.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasRegion]
  }
}

