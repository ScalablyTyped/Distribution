package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationTerm extends js.Object {
  
  // Display name of the term.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // End of the term.
  var endDate: js.UndefOr[NullableOption[String]] = js.native
  
  // ID of term in the syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Start of the term.
  var startDate: js.UndefOr[NullableOption[String]] = js.native
}
object EducationTerm {
  
  @scala.inline
  def apply(): EducationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTerm]
  }
  
  @scala.inline
  implicit class EducationTermOps[Self <: EducationTerm] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEndDate(value: NullableOption[String]): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setEndDateNull: Self = this.set("endDate", null)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setStartDate(value: NullableOption[String]): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartDateNull: Self = this.set("startDate", null)
  }
}
