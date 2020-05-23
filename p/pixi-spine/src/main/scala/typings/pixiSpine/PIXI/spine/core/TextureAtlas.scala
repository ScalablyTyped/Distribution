package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextureAtlas extends Disposable {
  var load: js.Any
  var pages: js.Array[TextureAtlasPage]
  var regions: js.Array[TextureAtlasRegion]
  def addSpineAtlas(
    atlasText: String,
    textureLoader: js.Function2[
      /* path */ String, 
      /* loaderFunction */ js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        _
      ], 
      _
    ],
    callback: js.Function1[/* obj */ this.type, _]
  ): Unit
  def addTexture(
    name: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): TextureAtlasRegion
  def addTextureHash(
    textures: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ _
    ],
    stripExtension: Boolean
  ): Unit
  def findRegion(name: String): TextureAtlasRegion
}

object TextureAtlas {
  @scala.inline
  def apply(
    addSpineAtlas: (String, js.Function2[
      /* path */ String, 
      /* loaderFunction */ js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        _
      ], 
      _
    ], js.Function1[TextureAtlas, _]) => Unit,
    addTexture: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any) => TextureAtlasRegion,
    addTextureHash: (Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ _
    ], Boolean) => Unit,
    dispose: () => Unit,
    findRegion: String => TextureAtlasRegion,
    load: js.Any,
    pages: js.Array[TextureAtlasPage],
    regions: js.Array[TextureAtlasRegion]
  ): TextureAtlas = {
    val __obj = js.Dynamic.literal(addSpineAtlas = js.Any.fromFunction3(addSpineAtlas), addTexture = js.Any.fromFunction2(addTexture), addTextureHash = js.Any.fromFunction2(addTextureHash), dispose = js.Any.fromFunction0(dispose), findRegion = js.Any.fromFunction1(findRegion), load = load.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlas]
  }
}

