package typings.mmdbLib.responseMod

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
  implicit class CityResponseOps[Self <: CityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCity(value: CityRecord): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setLocation(value: LocationRecord): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPostal(value: PostalRecord): Self = this.set("postal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostal: Self = this.set("postal", js.undefined)
    
    @scala.inline
    def setSubdivisionsVarargs(value: SubdivisionsRecord*): Self = this.set("subdivisions", js.Array(value :_*))
    
    @scala.inline
    def setSubdivisions(value: js.Array[SubdivisionsRecord]): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
}
