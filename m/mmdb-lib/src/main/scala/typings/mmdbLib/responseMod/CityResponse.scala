package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mmdbLib.responseMod.Response because Already inherited */ trait CityResponse
  extends StObject
     with CountryResponse {
  
  val city: js.UndefOr[CityRecord] = js.undefined
  
  val location: js.UndefOr[LocationRecord] = js.undefined
  
  val postal: js.UndefOr[PostalRecord] = js.undefined
  
  val subdivisions: js.UndefOr[js.Array[SubdivisionsRecord]] = js.undefined
}
object CityResponse {
  
  inline def apply(): CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CityResponse]
  }
  
  extension [Self <: CityResponse](x: Self) {
    
    inline def setCity(value: CityRecord): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setLocation(value: LocationRecord): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPostal(value: PostalRecord): Self = StObject.set(x, "postal", value.asInstanceOf[js.Any])
    
    inline def setPostalUndefined: Self = StObject.set(x, "postal", js.undefined)
    
    inline def setSubdivisions(value: js.Array[SubdivisionsRecord]): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setSubdivisionsVarargs(value: SubdivisionsRecord*): Self = StObject.set(x, "subdivisions", js.Array(value*))
  }
}
