package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationRoot extends StObject {
  
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.undefined
  
  var me: js.UndefOr[NullableOption[EducationUser]] = js.undefined
  
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.undefined
  
  var users: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.undefined
}
object EducationRoot {
  
  inline def apply(): EducationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationRoot] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesNull: Self = StObject.set(x, "classes", null)
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: EducationClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setMe(value: NullableOption[EducationUser]): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    inline def setMeNull: Self = StObject.set(x, "me", null)
    
    inline def setMeUndefined: Self = StObject.set(x, "me", js.undefined)
    
    inline def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
    
    inline def setSchoolsNull: Self = StObject.set(x, "schools", null)
    
    inline def setSchoolsUndefined: Self = StObject.set(x, "schools", js.undefined)
    
    inline def setSchoolsVarargs(value: EducationSchool*): Self = StObject.set(x, "schools", js.Array(value*))
    
    inline def setUsers(value: NullableOption[js.Array[EducationUser]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersNull: Self = StObject.set(x, "users", null)
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: EducationUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
