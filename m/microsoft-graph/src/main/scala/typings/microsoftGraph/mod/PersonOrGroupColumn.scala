package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonOrGroupColumn extends js.Object {
  
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
  implicit class PersonOrGroupColumnOps[Self <: PersonOrGroupColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMultipleSelection(value: NullableOption[Boolean]): Self = this.set("allowMultipleSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleSelection: Self = this.set("allowMultipleSelection", js.undefined)
    
    @scala.inline
    def setAllowMultipleSelectionNull: Self = this.set("allowMultipleSelection", null)
    
    @scala.inline
    def setChooseFromType(value: NullableOption[String]): Self = this.set("chooseFromType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChooseFromType: Self = this.set("chooseFromType", js.undefined)
    
    @scala.inline
    def setChooseFromTypeNull: Self = this.set("chooseFromType", null)
    
    @scala.inline
    def setDisplayAs(value: NullableOption[String]): Self = this.set("displayAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAs: Self = this.set("displayAs", js.undefined)
    
    @scala.inline
    def setDisplayAsNull: Self = this.set("displayAs", null)
  }
}
