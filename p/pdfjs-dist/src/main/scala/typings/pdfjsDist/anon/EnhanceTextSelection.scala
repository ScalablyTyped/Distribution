package typings.pdfjsDist.anon

import typings.pdfjsDist.interfacesMod.PageViewport
import typings.pdfjsDist.interfacesMod.TextHighlighter
import typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhanceTextSelection extends StObject {
  
  var accessibilityManager: js.UndefOr[TextAccessibilityManager] = js.undefined
  
  var enhanceTextSelection: js.UndefOr[Boolean] = js.undefined
  
  var eventBus: typings.pdfjsDist.interfacesMod.EventBus
  
  var highlighter: TextHighlighter
  
  var pageIndex: Double
  
  var textLayerDiv: HTMLDivElement
  
  var viewport: PageViewport
}
object EnhanceTextSelection {
  
  inline def apply(
    eventBus: typings.pdfjsDist.interfacesMod.EventBus,
    highlighter: TextHighlighter,
    pageIndex: Double,
    textLayerDiv: HTMLDivElement,
    viewport: PageViewport
  ): EnhanceTextSelection = {
    val __obj = js.Dynamic.literal(eventBus = eventBus.asInstanceOf[js.Any], highlighter = highlighter.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], textLayerDiv = textLayerDiv.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhanceTextSelection]
  }
  
  extension [Self <: EnhanceTextSelection](x: Self) {
    
    inline def setAccessibilityManager(value: TextAccessibilityManager): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
    
    inline def setEnhanceTextSelection(value: Boolean): Self = StObject.set(x, "enhanceTextSelection", value.asInstanceOf[js.Any])
    
    inline def setEnhanceTextSelectionUndefined: Self = StObject.set(x, "enhanceTextSelection", js.undefined)
    
    inline def setEventBus(value: typings.pdfjsDist.interfacesMod.EventBus): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
    
    inline def setHighlighter(value: TextHighlighter): Self = StObject.set(x, "highlighter", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setTextLayerDiv(value: HTMLDivElement): Self = StObject.set(x, "textLayerDiv", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
