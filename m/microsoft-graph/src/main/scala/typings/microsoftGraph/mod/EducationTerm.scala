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
  
  inline def apply(): EducationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationTerm]
  }
  
  extension [Self <: EducationTerm](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDate(value: NullableOption[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setStartDate(value: NullableOption[String]): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
