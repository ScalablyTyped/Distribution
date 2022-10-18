package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  var city: js.UndefOr[Double] = js.undefined
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var speciality: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var type_str: js.UndefOr[String] = js.undefined
  
  var year_from: js.UndefOr[Double] = js.undefined
  
  var year_graduated: js.UndefOr[Double] = js.undefined
  
  var year_to: js.UndefOr[Double] = js.undefined
}
object City {
  
  inline def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCity(value: Double): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setCountry(value: Double): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpeciality(value: String): Self = StObject.set(x, "speciality", value.asInstanceOf[js.Any])
    
    inline def setSpecialityUndefined: Self = StObject.set(x, "speciality", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setType_str(value: String): Self = StObject.set(x, "type_str", value.asInstanceOf[js.Any])
    
    inline def setType_strUndefined: Self = StObject.set(x, "type_str", js.undefined)
    
    inline def setYear_from(value: Double): Self = StObject.set(x, "year_from", value.asInstanceOf[js.Any])
    
    inline def setYear_fromUndefined: Self = StObject.set(x, "year_from", js.undefined)
    
    inline def setYear_graduated(value: Double): Self = StObject.set(x, "year_graduated", value.asInstanceOf[js.Any])
    
    inline def setYear_graduatedUndefined: Self = StObject.set(x, "year_graduated", js.undefined)
    
    inline def setYear_to(value: Double): Self = StObject.set(x, "year_to", value.asInstanceOf[js.Any])
    
    inline def setYear_toUndefined: Self = StObject.set(x, "year_to", js.undefined)
  }
}
