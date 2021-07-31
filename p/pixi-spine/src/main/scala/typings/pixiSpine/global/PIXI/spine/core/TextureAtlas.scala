package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.TextureAtlas")
@js.native
class TextureAtlas ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.core.TextureAtlas {
  def this(atlasText: String) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          js.Any
        ], 
        js.Any
      ]
  ) = this()
  def this(
    atlasText: Unit,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          js.Any
        ], 
        js.Any
      ]
  ) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          js.Any
        ], 
        js.Any
      ],
    callback: js.Function1[/* obj */ typings.pixiSpine.PIXI.spine.core.TextureAtlas, js.Any]
  ) = this()
  def this(
    atlasText: String,
    textureLoader: Unit,
    callback: js.Function1[/* obj */ typings.pixiSpine.PIXI.spine.core.TextureAtlas, js.Any]
  ) = this()
  def this(
    atlasText: Unit,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
          js.Any
        ], 
        js.Any
      ],
    callback: js.Function1[/* obj */ typings.pixiSpine.PIXI.spine.core.TextureAtlas, js.Any]
  ) = this()
  def this(
    atlasText: Unit,
    textureLoader: Unit,
    callback: js.Function1[/* obj */ typings.pixiSpine.PIXI.spine.core.TextureAtlas, js.Any]
  ) = this()
  
  /* CompleteClass */
  override def addSpineAtlas(
    atlasText: String,
    textureLoader: js.Function2[
      /* path */ String, 
      /* loaderFunction */ js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
        js.Any
      ], 
      js.Any
    ],
    callback: js.Function1[/* obj */ this.type, js.Any]
  ): Unit = js.native
  
  /* CompleteClass */
  override def addTexture(
    name: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion = js.native
  
  /* CompleteClass */
  override def addTextureHash(
    textures: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
    ],
    stripExtension: Boolean
  ): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def findRegion(name: String): typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion = js.native
  
  /* CompleteClass */
  var load: js.Any = js.native
  
  /* CompleteClass */
  var pages: js.Array[typings.pixiSpine.PIXI.spine.core.TextureAtlasPage] = js.native
  
  /* CompleteClass */
  var regions: js.Array[typings.pixiSpine.PIXI.spine.core.TextureAtlasRegion] = js.native
}
