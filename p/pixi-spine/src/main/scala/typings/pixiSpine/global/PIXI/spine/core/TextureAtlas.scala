package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TextureAtlas")
@js.native
class TextureAtlas ()
  extends typings.pixiSpine.PIXI.spine.core.TextureAtlas {
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
    callback: js.Function1[/* obj */ typings.pixiSpine.PIXI.spine.core.TextureAtlas, _]
  ) = this()
  /* CompleteClass */
  override var load: js.Any = js.native
  /* CompleteClass */
  override var pages: js.Array[typings.pixiSpine.PIXI.spine.core.TextureAtlasPage] = js.native
  /* CompleteClass */
  override var regions: js.Array[typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion] = js.native
  /* CompleteClass */
  override def addSpineAtlas(
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
  /* CompleteClass */
  override def addTexture(
    name: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion = js.native
  /* CompleteClass */
  override def addTextureHash(
    textures: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ _
    ],
    stripExtension: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def findRegion(name: String): typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion = js.native
}

