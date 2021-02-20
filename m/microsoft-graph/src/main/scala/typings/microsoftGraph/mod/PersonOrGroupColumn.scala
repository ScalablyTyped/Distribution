package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonOrGroupColumn extends StObject {
  
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleSelection: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
  var chooseFromType: js.UndefOr[NullableOption[String]] = js.native
  
  // How to display the information about the person or group chosen. See below.
  var displayAs: js.UndefOr[NullableOption[String]] = js.native
}
object PersonOrGroupColumn {
  
  @scala.inline
  def apply(): PersonOrGroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonOrGroupColumn]
  }
  
  @scala.inline
  implicit class PersonOrGroupColumnMutableBuilder[Self <: PersonOrGroupColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleSelection(value: NullableOption[Boolean]): Self = StObject.set(x, "allowMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleSelectionNull: Self = StObject.set(x, "allowMultipleSelection", null)
    
    @scala.inline
    def setAllowMultipleSelectionUndefined: Self = StObject.set(x, "allowMultipleSelection", js.undefined)
    
    @scala.inline
    def setChooseFromType(value: NullableOption[String]): Self = StObject.set(x, "chooseFromType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChooseFromTypeNull: Self = StObject.set(x, "chooseFromType", null)
    
    @scala.inline
    def setChooseFromTypeUndefined: Self = StObject.set(x, "chooseFromType", js.undefined)
    
    @scala.inline
    def setDisplayAs(value: NullableOption[String]): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAsNull: Self = StObject.set(x, "displayAs", null)
    
    @scala.inline
    def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
  }
}
