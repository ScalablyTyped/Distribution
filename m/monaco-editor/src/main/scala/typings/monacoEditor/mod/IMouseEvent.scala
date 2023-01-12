package typings.monacoEditor.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseEvent extends StObject {
  
  val altKey: Boolean
  
  val browserEvent: MouseEvent
  
  val buttons: Double
  
  val ctrlKey: Boolean
  
  val detail: Double
  
  val leftButton: Boolean
  
  val metaKey: Boolean
  
  val middleButton: Boolean
  
  val posx: Double
  
  val posy: Double
  
  def preventDefault(): Unit
  
  val rightButton: Boolean
  
  val shiftKey: Boolean
  
  def stopPropagation(): Unit
  
  val target: HTMLElement
  
  val timestamp: Double
}
object IMouseEvent {
  
  inline def apply(
    altKey: Boolean,
    browserEvent: MouseEvent,
    buttons: Double,
    ctrlKey: Boolean,
    detail: Double,
    leftButton: Boolean,
    metaKey: Boolean,
    middleButton: Boolean,
    posx: Double,
    posy: Double,
    preventDefault: () => Unit,
    rightButton: Boolean,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement,
    timestamp: Double
  ): IMouseEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], leftButton = leftButton.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], middleButton = middleButton.asInstanceOf[js.Any], posx = posx.asInstanceOf[js.Any], posy = posy.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), rightButton = rightButton.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMouseEvent] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setBrowserEvent(value: MouseEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setLeftButton(value: Boolean): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMiddleButton(value: Boolean): Self = StObject.set(x, "middleButton", value.asInstanceOf[js.Any])
    
    inline def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    inline def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setRightButton(value: Boolean): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
