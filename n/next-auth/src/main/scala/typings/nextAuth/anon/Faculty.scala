package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Faculty extends StObject {
  
  var faculty: js.UndefOr[Double] = js.undefined
  
  var faculty_name: js.UndefOr[String] = js.undefined
  
  var graduation: js.UndefOr[Double] = js.undefined
  
  var university: js.UndefOr[Double] = js.undefined
  
  var university_name: js.UndefOr[String] = js.undefined
}
object Faculty {
  
  inline def apply(): Faculty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Faculty]
  }
  
  extension [Self <: Faculty](x: Self) {
    
    inline def setFaculty(value: Double): Self = StObject.set(x, "faculty", value.asInstanceOf[js.Any])
    
    inline def setFacultyUndefined: Self = StObject.set(x, "faculty", js.undefined)
    
    inline def setFaculty_name(value: String): Self = StObject.set(x, "faculty_name", value.asInstanceOf[js.Any])
    
    inline def setFaculty_nameUndefined: Self = StObject.set(x, "faculty_name", js.undefined)
    
    inline def setGraduation(value: Double): Self = StObject.set(x, "graduation", value.asInstanceOf[js.Any])
    
    inline def setGraduationUndefined: Self = StObject.set(x, "graduation", js.undefined)
    
    inline def setUniversity(value: Double): Self = StObject.set(x, "university", value.asInstanceOf[js.Any])
    
    inline def setUniversityUndefined: Self = StObject.set(x, "university", js.undefined)
    
    inline def setUniversity_name(value: String): Self = StObject.set(x, "university_name", value.asInstanceOf[js.Any])
    
    inline def setUniversity_nameUndefined: Self = StObject.set(x, "university_name", js.undefined)
  }
}
