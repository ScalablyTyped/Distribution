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
      /* loaderFunction */ js.Function1[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        _
      ], 
      _
    ]) = this()
  def this(atlasText: java.lang.String, textureLoader: js.Function2[
      /* path */ java.lang.String, 
      /* loaderFunction */ js.Function1[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        _
      ], 
      _
    ], callback: js.Function1[/* obj */ TextureAtlas, _]) = this()
  var load: js.Any = js.native
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
  def addSpineAtlas(
    atlasText: java.lang.String,
    textureLoader: js.Function2[
      /* path */ java.lang.String, 
      /* loaderFunction */ js.Function1[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        _
      ], 
      _
    ],
    callback: js.Function1[/* obj */ this.type, _]
  ): scala.Unit = js.native
  def addTexture(
    name: java.lang.String,
    texture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): TextureAtlasRegion = js.native
  def addTextureHash(
    textures: Map[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PIXI.Texture */ _
    ],
    stripExtension: scala.Boolean
  ): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def findRegion(name: java.lang.String): TextureAtlasRegion = js.native
}

