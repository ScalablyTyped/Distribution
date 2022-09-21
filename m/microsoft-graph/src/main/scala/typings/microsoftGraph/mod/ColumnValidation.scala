package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnValidation extends StObject {
  
  // Default BCP 47 language tag for the description.
  var defaultLanguage: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Localized messages that explain what is needed for this column's value to be considered valid. User will be prompted
    * with this message if validation fails.
    */
  var descriptions: js.UndefOr[NullableOption[js.Array[DisplayNameLocalization]]] = js.undefined
  
  // The formula to validate column value. For examples, see Examples of common formulas in lists.
  var formula: js.UndefOr[NullableOption[String]] = js.undefined
}
object ColumnValidation {
  
  inline def apply(): ColumnValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnValidation]
  }
  
  extension [Self <: ColumnValidation](x: Self) {
    
    inline def setDefaultLanguage(value: NullableOption[String]): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDescriptions(value: NullableOption[js.Array[DisplayNameLocalization]]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsNull: Self = StObject.set(x, "descriptions", null)
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: DisplayNameLocalization*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setFormula(value: NullableOption[String]): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
  }
}
