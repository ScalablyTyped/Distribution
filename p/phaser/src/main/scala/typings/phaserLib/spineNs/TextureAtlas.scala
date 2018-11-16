package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TextureAtlas")
@js.native
class TextureAtlas protected () extends Disposable {
  def this(atlasText: java.lang.String, textureLoader: js.Function1[/* path */ java.lang.String, _]) = this()
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def findRegion(name: java.lang.String): TextureAtlasRegion = js.native
  /* private */ def load(atlasText: js.Any, textureLoader: js.Any): js.Any = js.native
}

