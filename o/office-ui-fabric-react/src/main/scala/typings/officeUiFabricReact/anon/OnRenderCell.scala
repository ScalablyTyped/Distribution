package typings.officeUiFabricReact.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnRenderCell extends StObject {
  
  def onRenderCell(item: js.Any, index: Double, containsFocus: Boolean): Element
  
  var renderedWindowsAhead: Double
  
  var renderedWindowsBehind: Double
  
  var startIndex: Double
}
object OnRenderCell {
  
  inline def apply(
    onRenderCell: (js.Any, Double, Boolean) => Element,
    renderedWindowsAhead: Double,
    renderedWindowsBehind: Double,
    startIndex: Double
  ): OnRenderCell = {
    val __obj = js.Dynamic.literal(onRenderCell = js.Any.fromFunction3(onRenderCell), renderedWindowsAhead = renderedWindowsAhead.asInstanceOf[js.Any], renderedWindowsBehind = renderedWindowsBehind.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRenderCell]
  }
  
  extension [Self <: OnRenderCell](x: Self) {
    
    inline def setOnRenderCell(value: (js.Any, Double, Boolean) => Element): Self = StObject.set(x, "onRenderCell", js.Any.fromFunction3(value))
    
    inline def setRenderedWindowsAhead(value: Double): Self = StObject.set(x, "renderedWindowsAhead", value.asInstanceOf[js.Any])
    
    inline def setRenderedWindowsBehind(value: Double): Self = StObject.set(x, "renderedWindowsBehind", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
