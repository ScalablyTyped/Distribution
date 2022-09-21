package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowDesc extends StObject {
  
  var classification: String
  
  var colours: js.UndefOr[js.Array[Double]] = js.undefined
  
  var height: Double
  
  var id: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTabChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var tabs: js.UndefOr[js.Array[WindowTabDesc]] = js.undefined
  
  var title: String
  
  var widgets: js.UndefOr[js.Array[Widget]] = js.undefined
  
  var width: Double
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object WindowDesc {
  
  inline def apply(classification: String, height: Double, title: String, width: Double): WindowDesc = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowDesc]
  }
  
  extension [Self <: WindowDesc](x: Self) {
    
    inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setColours(value: js.Array[Double]): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
    
    inline def setColoursVarargs(value: Double*): Self = StObject.set(x, "colours", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnTabChange(value: () => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction0(value))
    
    inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
    
    inline def setOnUpdate(value: () => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction0(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTabs(value: js.Array[WindowTabDesc]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: WindowTabDesc*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
    
    inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
