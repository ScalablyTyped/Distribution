package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureAtlasPage extends js.Object {
  var baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any
  var height: Double
  var magFilter: TextureFilter
  var minFilter: TextureFilter
  var name: String
  var uWrap: TextureWrap
  var vWrap: TextureWrap
  var width: Double
  def setFilters(): Unit
}

object TextureAtlasPage {
  @scala.inline
  def apply(
    baseTexture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ js.Any,
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    setFilters: () => Unit,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(baseTexture = baseTexture.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setFilters = js.Any.fromFunction0(setFilters), uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasPage]
  }
}

