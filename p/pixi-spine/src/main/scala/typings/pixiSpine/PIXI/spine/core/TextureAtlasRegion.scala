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
    height: () => Double,
    index: Double,
    name: String,
    offsetX: () => Double,
    offsetY: () => Double,
    originalHeight: () => Double,
    originalWidth: () => Double,
    page: TextureAtlasPage,
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
  ): TextureAtlasRegion = {
    val __obj = js.Dynamic.literal(height = js.Any.fromFunction0(height), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = js.Any.fromFunction0(offsetX), offsetY = js.Any.fromFunction0(offsetY), originalHeight = js.Any.fromFunction0(originalHeight), originalWidth = js.Any.fromFunction0(originalWidth), page = page.asInstanceOf[js.Any], pixiOffsetY = js.Any.fromFunction0(pixiOffsetY), rotate = js.Any.fromFunction0(rotate), size = size.asInstanceOf[js.Any], spineOffsetY = js.Any.fromFunction0(spineOffsetY), texture = texture.asInstanceOf[js.Any], u = js.Any.fromFunction0(u), u2 = js.Any.fromFunction0(u2), v = js.Any.fromFunction0(v), v2 = js.Any.fromFunction0(v2), width = js.Any.fromFunction0(width), x = js.Any.fromFunction0(x), y = js.Any.fromFunction0(y))
    __obj.asInstanceOf[TextureAtlasRegion]
  }
}

