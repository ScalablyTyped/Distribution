package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceColumn extends StObject {
  
  // If true, allows custom values that aren't in the configured choices.
  var allowTextEntry: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The list of values available for this column.
  var choices: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
  var displayAs: js.UndefOr[NullableOption[String]] = js.undefined
}
object ChoiceColumn {
  
  inline def apply(): ChoiceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChoiceColumn] (val x: Self) extends AnyVal {
    
    inline def setAllowTextEntry(value: NullableOption[Boolean]): Self = StObject.set(x, "allowTextEntry", value.asInstanceOf[js.Any])
    
    inline def setAllowTextEntryNull: Self = StObject.set(x, "allowTextEntry", null)
    
    inline def setAllowTextEntryUndefined: Self = StObject.set(x, "allowTextEntry", js.undefined)
    
    inline def setChoices(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesNull: Self = StObject.set(x, "choices", null)
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
  }
}
