package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent
import typings.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): scala.Unit
  
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): scala.Unit
  
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`]
  
  var style: js.Any
}
object ClassName {
  
  inline def apply(
    className: String,
    onMouseDown: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    onMouseUp: MouseTouchEvent[HTMLElement] => scala.Unit,
    onTouchEnd: MouseTouchEvent[HTMLElement] => scala.Unit,
    onTouchStart: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`],
    style: js.Any
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDown(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseUp(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnTouchEnd(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchStart(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
