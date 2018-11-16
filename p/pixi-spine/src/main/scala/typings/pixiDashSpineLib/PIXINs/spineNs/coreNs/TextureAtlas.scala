package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TextureAtlas")
@js.native
class TextureAtlas () extends Disposable {
  def this(atlasText: java.lang.String) = this()
  def this(atlasText: java.lang.String, textureLoader: js.Function2[
      /* path */ java.lang.String, 
      /* loaderFunction */ js.Function1[/* tex */ pixiDotJsLib.PIXINs.BaseTexture, _], 
      _
    ]) = this()
  def this(atlasText: java.lang.String, textureLoader: js.Function2[
      /* path */ java.lang.String, 
      /* loaderFunction */ js.Function1[/* tex */ pixiDotJsLib.PIXINs.BaseTexture, _], 
      _
    ], callback: js.Function1[/* obj */ TextureAtlas, _]) = this()
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  def addSpineAtlas(
    atlasText: java.lang.String,
    textureLoader: js.Function2[
      /* path */ java.lang.String, 
      /* loaderFunction */ js.Function1[/* tex */ pixiDotJsLib.PIXINs.BaseTexture, _], 
      _
    ],
    callback: js.Function1[/* obj */ this.type, _]
  ): scala.Unit = js.native
  def addTexture(name: java.lang.String, texture: pixiDotJsLib.PIXINs.Texture): TextureAtlasRegion = js.native
  def addTextureHash(textures: Map[pixiDotJsLib.PIXINs.Texture], stripExtension: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def findRegion(name: java.lang.String): TextureAtlasRegion = js.native
  /* private */ def load(atlasText: js.Any, textureLoader: js.Any, callback: js.Any): js.Any = js.native
}

