package typings.openui5.anon

import typings.openui5.sapUiTestRecordReplayMod.InteractionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTextFirst extends StObject {
  
  /**
    * Clear existing text before interaction
    */
  var clearTextFirst: js.UndefOr[String] = js.undefined
  
  /**
    * Text for the EnterText interaction
    */
  var enterText: String
  
  /**
    * Interaction type; Currently supported interaction types are {@link sap.ui.test.RecordReplay.InteractionType}
    * To see the interaction details and options, see {@link sap.ui.test.actions}
    */
  var interactionType: InteractionType
  
  /**
    * If the input will remain focused after text is entered
    */
  var keepFocus: Boolean
  
  /**
    * If ENTER key will be entered after the text
    */
  var pressEnterKey: Boolean
  
  /**
    * control selector for the control to interact with The returned promise will be rejected if the control
    * is not specified or does not have a DOM reference
    */
  var selector: js.Object
}
object ClearTextFirst {
  
  inline def apply(
    enterText: String,
    interactionType: InteractionType,
    keepFocus: Boolean,
    pressEnterKey: Boolean,
    selector: js.Object
  ): ClearTextFirst = {
    val __obj = js.Dynamic.literal(enterText = enterText.asInstanceOf[js.Any], interactionType = interactionType.asInstanceOf[js.Any], keepFocus = keepFocus.asInstanceOf[js.Any], pressEnterKey = pressEnterKey.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTextFirst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearTextFirst] (val x: Self) extends AnyVal {
    
    inline def setClearTextFirst(value: String): Self = StObject.set(x, "clearTextFirst", value.asInstanceOf[js.Any])
    
    inline def setClearTextFirstUndefined: Self = StObject.set(x, "clearTextFirst", js.undefined)
    
    inline def setEnterText(value: String): Self = StObject.set(x, "enterText", value.asInstanceOf[js.Any])
    
    inline def setInteractionType(value: InteractionType): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
    
    inline def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
    
    inline def setPressEnterKey(value: Boolean): Self = StObject.set(x, "pressEnterKey", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: js.Object): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
