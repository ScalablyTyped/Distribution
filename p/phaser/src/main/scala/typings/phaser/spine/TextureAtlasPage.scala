package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureAtlasPage extends js.Object {
  var height: Double
  var magFilter: TextureFilter
  var minFilter: TextureFilter
  var name: String
  var texture: Texture
  var uWrap: TextureWrap
  var vWrap: TextureWrap
  var width: Double
}

object TextureAtlasPage {
  @scala.inline
  def apply(
    height: Double,
    magFilter: TextureFilter,
    minFilter: TextureFilter,
    name: String,
    texture: Texture,
    uWrap: TextureWrap,
    vWrap: TextureWrap,
    width: Double
  ): TextureAtlasPage = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], magFilter = magFilter.asInstanceOf[js.Any], minFilter = minFilter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], uWrap = uWrap.asInstanceOf[js.Any], vWrap = vWrap.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlasPage]
  }
}

