package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolEventArgs extends StObject {
  
  val entityId: js.UndefOr[Double] = js.undefined
  
  val isDown: Boolean
  
  val mapCoords: js.UndefOr[CoordsXYZ] = js.undefined
  
  val screenCoords: ScreenCoordsXY
  
  val tileElementIndex: js.UndefOr[Double] = js.undefined
}
object ToolEventArgs {
  
  inline def apply(isDown: Boolean, screenCoords: ScreenCoordsXY): ToolEventArgs = {
    val __obj = js.Dynamic.literal(isDown = isDown.asInstanceOf[js.Any], screenCoords = screenCoords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToolEventArgs] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: Double): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setIsDown(value: Boolean): Self = StObject.set(x, "isDown", value.asInstanceOf[js.Any])
    
    inline def setMapCoords(value: CoordsXYZ): Self = StObject.set(x, "mapCoords", value.asInstanceOf[js.Any])
    
    inline def setMapCoordsUndefined: Self = StObject.set(x, "mapCoords", js.undefined)
    
    inline def setScreenCoords(value: ScreenCoordsXY): Self = StObject.set(x, "screenCoords", value.asInstanceOf[js.Any])
    
    inline def setTileElementIndex(value: Double): Self = StObject.set(x, "tileElementIndex", value.asInstanceOf[js.Any])
    
    inline def setTileElementIndexUndefined: Self = StObject.set(x, "tileElementIndex", js.undefined)
  }
}
