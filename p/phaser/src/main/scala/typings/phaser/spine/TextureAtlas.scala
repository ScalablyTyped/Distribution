package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureAtlas extends Disposable {
  var load: js.Any
  var pages: js.Array[TextureAtlasPage]
  var regions: js.Array[TextureAtlasRegion]
  def findRegion(name: String): TextureAtlasRegion
}

object TextureAtlas {
  @scala.inline
  def apply(
    dispose: () => Unit,
    findRegion: String => TextureAtlasRegion,
    load: js.Any,
    pages: js.Array[TextureAtlasPage],
    regions: js.Array[TextureAtlasRegion]
  ): TextureAtlas = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), findRegion = js.Any.fromFunction1(findRegion), load = load.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlas]
  }
}

