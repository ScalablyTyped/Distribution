package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureAtlas extends Disposable {
  
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
  
  def findRegion(name: String): TextureAtlasRegion = js.native
  
  var load: js.Any = js.native
  
  var pages: js.Array[TextureAtlasPage] = js.native
  
  var regions: js.Array[TextureAtlasRegion] = js.native
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
  
  @scala.inline
  implicit class TextureAtlasMutableBuilder[Self <: TextureAtlas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSpineAtlas(
      value: (String, js.Function2[
          /* path */ String, 
          /* loaderFunction */ js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.BaseTexture */ /* tex */ js.Any, 
            _
          ], 
          _
        ], js.Function1[TextureAtlas, _]) => Unit
    ): Self = StObject.set(x, "addSpineAtlas", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddTexture(
      value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any) => TextureAtlasRegion
    ): Self = StObject.set(x, "addTexture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddTextureHash(
      value: (Map[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ _
        ], Boolean) => Unit
    ): Self = StObject.set(x, "addTextureHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindRegion(value: String => TextureAtlasRegion): Self = StObject.set(x, "findRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoad(value: js.Any): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: js.Array[TextureAtlasPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: TextureAtlasPage*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[TextureAtlasRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsVarargs(value: TextureAtlasRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
