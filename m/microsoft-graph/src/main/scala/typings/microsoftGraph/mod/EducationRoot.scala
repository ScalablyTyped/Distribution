package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationRoot
  extends StObject
     with Entity {
  
  // Read-only. Nullable.
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.undefined
  
  // Read-only. Nullable.
  var me: js.UndefOr[NullableOption[EducationUser]] = js.undefined
  
  // Read-only. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.undefined
  
  // Read-only. Nullable.
  var users: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.undefined
}
object EducationRoot {
  
  @scala.inline
  def apply(): EducationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationRoot]
  }
  
  @scala.inline
  implicit class EducationRootMutableBuilder[Self <: EducationRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesNull: Self = StObject.set(x, "classes", null)
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setMe(value: NullableOption[EducationUser]): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeNull: Self = StObject.set(x, "me", null)
    
    @scala.inline
    def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    @scala.inline
    def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = StObject.set(x, "schools", js.Array(value :_*))
    
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
