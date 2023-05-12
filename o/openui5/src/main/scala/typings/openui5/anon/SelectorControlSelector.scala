package typings.openui5.anon

import typings.openui5.sapUiTestRecordReplayMod.ControlSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorControlSelector extends StObject {
  
  /**
    * Control selector for this control Could be the result of {@link sap.ui.test.RecordReplay.findControlSelectorByDOMElement}
    * If the selector matches multiple controls, only the first one will be used If the selector contains ID
    * suffix for a DOM element, the 'first' relevant DOM element will be located Otherwise, the result will
    * be the 'first' DOM element with ID matching the control's or the one that usually receives focus events
    */
  var selector: ControlSelector
}
object SelectorControlSelector {
  
  inline def apply(selector: ControlSelector): SelectorControlSelector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorControlSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectorControlSelector] (val x: Self) extends AnyVal {
    
    inline def setSelector(value: ControlSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
