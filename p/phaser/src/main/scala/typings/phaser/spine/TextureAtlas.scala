package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureAtlas
  extends StObject
     with Disposable {
  
  def findRegion(name: String): TextureAtlasRegion
  
  var load: js.Any
  
  var pages: js.Array[TextureAtlasPage]
  
  var regions: js.Array[TextureAtlasRegion]
}
object TextureAtlas {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    findRegion: String => TextureAtlasRegion,
    load: js.Any,
    pages: js.Array[TextureAtlasPage],
    regions: js.Array[TextureAtlasRegion]
  ): TextureAtlas = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), findRegion = js.Any.fromFunction1(findRegion), load = load.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureAtlas]
  }
  
  @scala.inline
  implicit class TextureAtlasMutableBuilder[Self <: TextureAtlas] (val x: Self) extends AnyVal {
    
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
