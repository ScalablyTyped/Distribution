package typings.playcanvas.anon

import typings.playcanvas.mod.TextureAtlas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atlas extends StObject {
  
  var atlas: js.UndefOr[TextureAtlas] = js.undefined
  
  var frameKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var pixelsPerUnit: js.UndefOr[Double] = js.undefined
  
  var renderMode: js.UndefOr[Double] = js.undefined
}
object Atlas {
  
  inline def apply(): Atlas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Atlas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Atlas] (val x: Self) extends AnyVal {
    
    inline def setAtlas(value: TextureAtlas): Self = StObject.set(x, "atlas", value.asInstanceOf[js.Any])
    
    inline def setAtlasUndefined: Self = StObject.set(x, "atlas", js.undefined)
    
    inline def setFrameKeys(value: js.Array[String]): Self = StObject.set(x, "frameKeys", value.asInstanceOf[js.Any])
    
    inline def setFrameKeysUndefined: Self = StObject.set(x, "frameKeys", js.undefined)
    
    inline def setFrameKeysVarargs(value: String*): Self = StObject.set(x, "frameKeys", js.Array(value*))
    
    inline def setPixelsPerUnit(value: Double): Self = StObject.set(x, "pixelsPerUnit", value.asInstanceOf[js.Any])
    
    inline def setPixelsPerUnitUndefined: Self = StObject.set(x, "pixelsPerUnit", js.undefined)
    
    inline def setRenderMode(value: Double): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
  }
}
