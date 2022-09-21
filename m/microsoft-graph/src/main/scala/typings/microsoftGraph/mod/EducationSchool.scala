package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationSchool
  extends StObject
     with EducationOrganization {
  
  // Address of the school.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The underlying administrativeUnit for this school.
  var administrativeUnit: js.UndefOr[NullableOption[AdministrativeUnit]] = js.undefined
  
  // Classes taught at the school. Nullable.
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.undefined
  
  // Entity who created the school.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // ID of school in syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of principal in syncing system.
  var externalPrincipalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var fax: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Highest grade taught.
  var highestGrade: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Lowest grade taught.
  var lowestGrade: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Phone number of school.
  var phone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email address of the principal.
  var principalEmail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the principal.
  var principalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // School Number.
  var schoolNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Users in the school. Nullable.
  var users: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.undefined
}
object EducationSchool {
  
  inline def apply(): EducationSchool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSchool]
  }
  
  extension [Self <: EducationSchool](x: Self) {
    
    inline def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAdministrativeUnit(value: NullableOption[AdministrativeUnit]): Self = StObject.set(x, "administrativeUnit", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeUnitNull: Self = StObject.set(x, "administrativeUnit", null)
    
    inline def setAdministrativeUnitUndefined: Self = StObject.set(x, "administrativeUnit", js.undefined)
    
    inline def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesNull: Self = StObject.set(x, "classes", null)
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: EducationClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setExternalPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "externalPrincipalId", value.asInstanceOf[js.Any])
    
    inline def setExternalPrincipalIdNull: Self = StObject.set(x, "externalPrincipalId", null)
    
    inline def setExternalPrincipalIdUndefined: Self = StObject.set(x, "externalPrincipalId", js.undefined)
    
    inline def setFax(value: NullableOption[String]): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    inline def setFaxNull: Self = StObject.set(x, "fax", null)
    
    inline def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    inline def setHighestGrade(value: NullableOption[String]): Self = StObject.set(x, "highestGrade", value.asInstanceOf[js.Any])
    
    inline def setHighestGradeNull: Self = StObject.set(x, "highestGrade", null)
    
    inline def setHighestGradeUndefined: Self = StObject.set(x, "highestGrade", js.undefined)
    
    inline def setLowestGrade(value: NullableOption[String]): Self = StObject.set(x, "lowestGrade", value.asInstanceOf[js.Any])
    
    inline def setLowestGradeNull: Self = StObject.set(x, "lowestGrade", null)
    
    inline def setLowestGradeUndefined: Self = StObject.set(x, "lowestGrade", js.undefined)
    
    inline def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPrincipalEmail(value: NullableOption[String]): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailNull: Self = StObject.set(x, "principalEmail", null)
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "principalName", value.asInstanceOf[js.Any])
    
    inline def setPrincipalNameNull: Self = StObject.set(x, "principalName", null)
    
    inline def setPrincipalNameUndefined: Self = StObject.set(x, "principalName", js.undefined)
    
    inline def setSchoolNumber(value: NullableOption[String]): Self = StObject.set(x, "schoolNumber", value.asInstanceOf[js.Any])
    
    inline def setSchoolNumberNull: Self = StObject.set(x, "schoolNumber", null)
    
    inline def setSchoolNumberUndefined: Self = StObject.set(x, "schoolNumber", js.undefined)
    
    inline def setUsers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersNull: Self = StObject.set(x, "users", null)
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: EducationUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
