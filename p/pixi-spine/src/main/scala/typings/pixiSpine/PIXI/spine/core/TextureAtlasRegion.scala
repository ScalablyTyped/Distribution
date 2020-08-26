package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAtlasRegion extends TextureRegion {
  var index: Double = js.native
  var name: String = js.native
  var page: TextureAtlasPage = js.native
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: TextureAtlasPage): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

