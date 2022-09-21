package typings.pixiSpineBase.mod

import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "TextureAtlas")
@js.native
open class TextureAtlas ()
  extends StObject
     with Disposable {
  def this(atlasText: String) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
        Any
      ]
  ) = this()
  def this(
    atlasText: Unit,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
        Any
      ]
  ) = this()
  def this(
    atlasText: String,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
        Any
      ],
    callback: js.Function1[/* obj */ TextureAtlas, Any]
  ) = this()
  def this(atlasText: String, textureLoader: Unit, callback: js.Function1[/* obj */ TextureAtlas, Any]) = this()
  def this(
    atlasText: Unit,
    textureLoader: js.Function2[
        /* path */ String, 
        /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
        Any
      ],
    callback: js.Function1[/* obj */ TextureAtlas, Any]
  ) = this()
  def this(atlasText: Unit, textureLoader: Unit, callback: js.Function1[/* obj */ TextureAtlas, Any]) = this()
  
  def addSpineAtlas(
    atlasText: String,
    textureLoader: js.Function2[
      /* path */ String, 
      /* loaderFunction */ js.Function1[/* tex */ BaseTexture[Resource, IAutoDetectOptions], Any], 
      Any
    ],
    callback: js.Function1[/* obj */ this.type, Any]
  ): Unit = js.native
  
  def addTexture(name: String, texture: Texture[Resource]): TextureAtlasRegion = js.native
  
  def addTextureHash(textures: Map2[Texture[Resource]], stripExtension: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  def findRegion(name: String): TextureAtlasRegion = js.native
  
  /* private */ var load: Any = js.native
  
  var pages: js.Array[TextureAtlasPage] = js.native
  
  var regions: js.Array[TextureAtlasRegion] = js.native
}
