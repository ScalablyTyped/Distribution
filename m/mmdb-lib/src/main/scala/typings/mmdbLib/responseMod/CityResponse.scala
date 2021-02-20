package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mmdbLib.responseMod.Response because Already inherited */ @js.native
trait CityResponse extends CountryResponse {
  
  val city: js.UndefOr[CityRecord] = js.native
  
  val location: js.UndefOr[LocationRecord] = js.native
  
  val postal: js.UndefOr[PostalRecord] = js.native
  
  val subdivisions: js.UndefOr[js.Array[SubdivisionsRecord]] = js.native
}
object CityResponse {
  
  @scala.inline
  def apply(): CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CityResponse]
  }
  
  @scala.inline
  implicit class CityResponseMutableBuilder[Self <: CityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: CityRecord): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationRecord): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPostal(value: PostalRecord): Self = StObject.set(x, "postal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalUndefined: Self = StObject.set(x, "postal", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: js.Array[SubdivisionsRecord]): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setSubdivisionsVarargs(value: SubdivisionsRecord*): Self = StObject.set(x, "subdivisions", js.Array(value :_*))
  }
}
