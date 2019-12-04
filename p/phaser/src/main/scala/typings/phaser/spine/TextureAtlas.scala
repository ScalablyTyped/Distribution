package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TextureAtlas")
@js.native
class TextureAtlas protected () extends Disposable {
  def this(atlasText: String, textureLoader: js.Function1[/* path */ String, _]) = this()
  var load: js.Any = js.native
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def findRegion(name: String): TextureAtlasRegion = js.native
}

