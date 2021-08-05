package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonOrGroupColumn extends StObject {
  
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleSelection: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
  var chooseFromType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // How to display the information about the person or group chosen. See below.
  var displayAs: js.UndefOr[NullableOption[String]] = js.undefined
}
object PersonOrGroupColumn {
  
  inline def apply(): PersonOrGroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonOrGroupColumn]
  }
  
  extension [Self <: PersonOrGroupColumn](x: Self) {
    
    inline def setAllowMultipleSelection(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleSelectionNull: Self = StObject.set(x, "allowMultipleSelection", null)
    
    inline def setAllowMultipleSelectionUndefined: Self = StObject.set(x, "allowMultipleSelection", js.undefined)
    
    inline def setChooseFromType(value: NullableOption[String]): Self = StObject.set(x, "chooseFromType", value.asInstanceOf[js.Any])
    
    inline def setChooseFromTypeNull: Self = StObject.set(x, "chooseFromType", null)
    
    inline def setChooseFromTypeUndefined: Self = StObject.set(x, "chooseFromType", js.undefined)
    
    inline def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
  }
}
