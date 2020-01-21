package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TextureAtlas")
@js.native
class TextureAtlas () extends Disposable {
  def this(atlasText: String) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          _
        ], 
        _
      ]
  ) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          _
        ], 
        _
      ],
    callback: js.Function1[/* obj */ TextureAtlas, _]
  ) = this()
  var load: js.Any = js.native
  var pages: js.Array[TextureAtlasPage] = js.native
  var regions: js.Array[TextureAtlasRegion] = js.native
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
  ): Unit = js.native
  def addTexture(
    name: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): TextureAtlasRegion = js.native
  def addTextureHash(
    textures: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ _
    ],
    stripExtension: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  def findRegion(name: String): TextureAtlasRegion = js.native
}

