package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.draggableZoneDraggableZoneMod.MouseTouchEvent
import typings.officeUiFabricReact.officeUiFabricReactBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: String = js.native
  
  def onMouseDown(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`] = js.native
  
  def onMouseUp(event: MouseTouchEvent[HTMLElement]): scala.Unit = js.native
  
  def onTouchEnd(event: MouseTouchEvent[HTMLElement]): scala.Unit = js.native
  
  def onTouchStart(event: MouseTouchEvent[HTMLElement]): js.UndefOr[`false`] = js.native
  
  var style: js.Any = js.native
}
object ClassName {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDown(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: MouseTouchEvent[HTMLElement] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: MouseTouchEvent[HTMLElement] => js.UndefOr[`false`]): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
