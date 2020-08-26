package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureAtlas extends Disposable {
  var load: js.Any = js.native
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  def findRegion(name: String): TextureAtlasRegion = js.native
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
  @scala.inline
  implicit class TextureAtlasOps[Self <: TextureAtlas] (val x: Self) extends AnyVal {
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
    def setFindRegion(value: String => TextureAtlasRegion): Self = this.set("findRegion", js.Any.fromFunction1(value))
    @scala.inline
    def setLoad(value: js.Any): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesVarargs(value: TextureAtlasPage*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[TextureAtlasPage]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionsVarargs(value: TextureAtlasRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[TextureAtlasRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
  }
  
}

