package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationTerm extends StObject {
  
  // Display name of the term.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // End of the term.
  var endDate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of term in the syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Start of the term.
  var startDate: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationTerm {
  
  @scala.inline
  def apply(): EducationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTerm]
  }
  
  @scala.inline
  implicit class EducationTermMutableBuilder[Self <: EducationTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEndDate(value: NullableOption[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setStartDate(value: NullableOption[String]): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
