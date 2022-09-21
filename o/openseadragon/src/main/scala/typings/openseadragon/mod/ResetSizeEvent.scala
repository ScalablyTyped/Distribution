package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetSizeEvent
  extends StObject
     with OSDEvent[Viewer] {
  
  var contentBounds: Rect
  
  var contentFactor: Double
  
  var contentSize: Point
  
  var homeBounds: Rect
}
object ResetSizeEvent {
  
  inline def apply(
    contentBounds: Rect,
    contentFactor: Double,
    contentSize: Point,
    eventSource: Viewer,
    homeBounds: Rect,
    userData: Any
  ): ResetSizeEvent = {
    val __obj = js.Dynamic.literal(contentBounds = contentBounds.asInstanceOf[js.Any], contentFactor = contentFactor.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], homeBounds = homeBounds.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetSizeEvent]
  }
  
  extension [Self <: ResetSizeEvent](x: Self) {
    
    inline def setContentBounds(value: Rect): Self = StObject.set(x, "contentBounds", value.asInstanceOf[js.Any])
    
    inline def setContentFactor(value: Double): Self = StObject.set(x, "contentFactor", value.asInstanceOf[js.Any])
    
    inline def setContentSize(value: Point): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setHomeBounds(value: Rect): Self = StObject.set(x, "homeBounds", value.asInstanceOf[js.Any])
  }
}
