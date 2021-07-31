package typings.monacoEditor.mod

import typings.monacoEditor.monacoEditorBooleans.`true`
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyboardEvent extends StObject {
  
  val _standardKeyboardEventBrand: `true`
  
  val altKey: Boolean
  
  val browserEvent: KeyboardEvent
  
  val code: String
  
  val ctrlKey: Boolean
  
  def equals(keybinding: Double): Boolean
  
  val keyCode: KeyCode
  
  val metaKey: Boolean
  
  def preventDefault(): Unit
  
  val shiftKey: Boolean
  
  def stopPropagation(): Unit
  
  val target: HTMLElement
}
object IKeyboardEvent {
  
  @scala.inline
  def apply(
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals_ : Double => Boolean,
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = true, altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IKeyboardEvent]
  }
  
  @scala.inline
  implicit class IKeyboardEventMutableBuilder[Self <: IKeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserEvent(value: KeyboardEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: Double => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyCode(value: KeyCode): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_standardKeyboardEventBrand(value: `true`): Self = StObject.set(x, "_standardKeyboardEventBrand", value.asInstanceOf[js.Any])
  }
}
