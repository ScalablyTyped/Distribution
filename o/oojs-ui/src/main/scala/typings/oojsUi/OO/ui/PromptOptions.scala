package typings.oojsUi.OO.ui

import typings.oojsUi.OO.ui.MessageDialog.SetupDataMap
import typings.oojsUi.OO.ui.TextInputWidget.ConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptOptions
  extends StObject
     with SetupDataMap {
  
  /** Additional options for text input widget, see {@link OO.ui.TextInputWidget} */
  var textInput: js.UndefOr[ConfigOptions] = js.undefined
}
object PromptOptions {
  
  inline def apply(): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
    
    inline def setTextInput(value: ConfigOptions): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
  }
}
