package typings.monacoEditor.mod

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMouseEvent extends StObject {
  
  val altKey: Boolean = js.native
  
  val browserEvent: MouseEvent = js.native
  
  val buttons: Double = js.native
  
  val ctrlKey: Boolean = js.native
  
  val detail: Double = js.native
  
  val leftButton: Boolean = js.native
  
  val metaKey: Boolean = js.native
  
  val middleButton: Boolean = js.native
  
  val posx: Double = js.native
  
  val posy: Double = js.native
  
  def preventDefault(): Unit = js.native
  
  val rightButton: Boolean = js.native
  
  val shiftKey: Boolean = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: HTMLElement = js.native
  
  val timestamp: Double = js.native
}
object IMouseEvent {
  
  @scala.inline
  def apply(
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
  implicit class IMouseEventMutableBuilder[Self <: IMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserEvent(value: MouseEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButton(value: Boolean): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleButton(value: Boolean): Self = StObject.set(x, "middleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRightButton(value: Boolean): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
