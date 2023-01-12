package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLevelEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var best: js.Object
  
  /**
    * @deprecated use `drawArea` instead
    */
  var bottomright: js.Object
  
  var currenttime: js.Object
  
  var drawArea: Rect
  
  var havedrawn: js.Object
  
  var level: js.Object
  
  var opacity: js.Object
  
  var tiledImage: TiledImage
  
  /**
    * @deprecated use `drawArea` instead
    */
  var topleft: js.Object
  
  var visibility: js.Object
}
object UpdateLevelEvent {
  
  inline def apply(
    best: js.Object,
    bottomright: js.Object,
    currenttime: js.Object,
    drawArea: Rect,
    eventSource: Viewer,
    havedrawn: js.Object,
    level: js.Object,
    opacity: js.Object,
    tiledImage: TiledImage,
    topleft: js.Object,
    userData: Any,
    visibility: js.Object
  ): UpdateLevelEvent = {
    val __obj = js.Dynamic.literal(best = best.asInstanceOf[js.Any], bottomright = bottomright.asInstanceOf[js.Any], currenttime = currenttime.asInstanceOf[js.Any], drawArea = drawArea.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], havedrawn = havedrawn.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any], topleft = topleft.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLevelEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLevelEvent] (val x: Self) extends AnyVal {
    
    inline def setBest(value: js.Object): Self = StObject.set(x, "best", value.asInstanceOf[js.Any])
    
    inline def setBottomright(value: js.Object): Self = StObject.set(x, "bottomright", value.asInstanceOf[js.Any])
    
    inline def setCurrenttime(value: js.Object): Self = StObject.set(x, "currenttime", value.asInstanceOf[js.Any])
    
    inline def setDrawArea(value: Rect): Self = StObject.set(x, "drawArea", value.asInstanceOf[js.Any])
    
    inline def setHavedrawn(value: js.Object): Self = StObject.set(x, "havedrawn", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: js.Object): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: js.Object): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setTiledImage(value: TiledImage): Self = StObject.set(x, "tiledImage", value.asInstanceOf[js.Any])
    
    inline def setTopleft(value: js.Object): Self = StObject.set(x, "topleft", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: js.Object): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
