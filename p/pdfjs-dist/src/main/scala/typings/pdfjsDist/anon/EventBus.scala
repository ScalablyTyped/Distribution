package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBus extends StObject {
  
  var accessibilityManager: js.UndefOr[Null] = js.undefined
  
  var enhanceTextSelection: js.UndefOr[Boolean] = js.undefined
  
  var eventBus: Any
  
  var highlighter: js.UndefOr[Null] = js.undefined
  
  var pageIndex: Any
  
  var textLayerDiv: Any
  
  var viewport: Any
}
object EventBus {
  
  inline def apply(eventBus: Any, pageIndex: Any, textLayerDiv: Any, viewport: Any): EventBus = {
    val __obj = js.Dynamic.literal(eventBus = eventBus.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], textLayerDiv = textLayerDiv.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBus]
  }
  
  extension [Self <: EventBus](x: Self) {
    
    inline def setEnhanceTextSelection(value: Boolean): Self = StObject.set(x, "enhanceTextSelection", value.asInstanceOf[js.Any])
    
    inline def setEnhanceTextSelectionUndefined: Self = StObject.set(x, "enhanceTextSelection", js.undefined)
    
    inline def setEventBus(value: Any): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Any): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setTextLayerDiv(value: Any): Self = StObject.set(x, "textLayerDiv", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Any): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
