package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def bringToFront(): Unit
  
  var classification: Double
  
  def close(): Unit
  
  var colours: js.Array[Double]
  
  def findWidget[T /* <: Widget */](name: String): T
  
  var height: Double
  
  var isSticky: Boolean
  
  var maxHeight: Double
  
  var maxWidth: Double
  
  var minHeight: Double
  
  var minWidth: Double
  
  var number: Double
  
  var tabIndex: Double
  
  var title: String
  
  var widgets: js.Array[Widget]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object Window {
  
  inline def apply(
    bringToFront: () => Unit,
    classification: Double,
    close: () => Unit,
    colours: js.Array[Double],
    findWidget: String => Any,
    height: Double,
    isSticky: Boolean,
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double,
    number: Double,
    tabIndex: Double,
    title: String,
    widgets: js.Array[Widget],
    width: Double,
    x: Double,
    y: Double
  ): Window = {
    val __obj = js.Dynamic.literal(bringToFront = js.Any.fromFunction0(bringToFront), classification = classification.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), colours = colours.asInstanceOf[js.Any], findWidget = js.Any.fromFunction1(findWidget), height = height.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setBringToFront(value: () => Unit): Self = StObject.set(x, "bringToFront", js.Any.fromFunction0(value))
    
    inline def setClassification(value: Double): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setColours(value: js.Array[Double]): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setColoursVarargs(value: Double*): Self = StObject.set(x, "colours", js.Array(value*))
    
    inline def setFindWidget(value: String => Any): Self = StObject.set(x, "findWidget", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: js.Array[Widget]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
    
    inline def setWidgetsVarargs(value: Widget*): Self = StObject.set(x, "widgets", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
