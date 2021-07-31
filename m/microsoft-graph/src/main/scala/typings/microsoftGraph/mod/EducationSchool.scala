package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationSchool
  extends StObject
     with EducationOrganization {
  
  // Address of the school.
  var address: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
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
  
  @scala.inline
  def apply(): EducationSchool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSchool]
  }
  
  @scala.inline
  implicit class EducationSchoolMutableBuilder[Self <: EducationSchool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesNull: Self = StObject.set(x, "classes", null)
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setExternalPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "externalPrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalPrincipalIdNull: Self = StObject.set(x, "externalPrincipalId", null)
    
    @scala.inline
    def setExternalPrincipalIdUndefined: Self = StObject.set(x, "externalPrincipalId", js.undefined)
    
    @scala.inline
    def setFax(value: NullableOption[String]): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNull: Self = StObject.set(x, "fax", null)
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    @scala.inline
    def setHighestGrade(value: NullableOption[String]): Self = StObject.set(x, "highestGrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighestGradeNull: Self = StObject.set(x, "highestGrade", null)
    
    @scala.inline
    def setHighestGradeUndefined: Self = StObject.set(x, "highestGrade", js.undefined)
    
    @scala.inline
    def setLowestGrade(value: NullableOption[String]): Self = StObject.set(x, "lowestGrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowestGradeNull: Self = StObject.set(x, "lowestGrade", null)
    
    @scala.inline
    def setLowestGradeUndefined: Self = StObject.set(x, "lowestGrade", js.undefined)
    
    @scala.inline
    def setPhone(value: NullableOption[String]): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPrincipalEmail(value: NullableOption[String]): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalEmailNull: Self = StObject.set(x, "principalEmail", null)
    
    @scala.inline
    def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    @scala.inline
    def setPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "principalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalNameNull: Self = StObject.set(x, "principalName", null)
    
    @scala.inline
    def setPrincipalNameUndefined: Self = StObject.set(x, "principalName", js.undefined)
    
    @scala.inline
    def setSchoolNumber(value: NullableOption[String]): Self = StObject.set(x, "schoolNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchoolNumberNull: Self = StObject.set(x, "schoolNumber", null)
    
    @scala.inline
    def setSchoolNumberUndefined: Self = StObject.set(x, "schoolNumber", js.undefined)
    
    @scala.inline
    def setUsers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersNull: Self = StObject.set(x, "users", null)
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: EducationUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
