package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompanyDerivedInfo extends StObject {
  
  /** A structured headquarters location of the company, resolved from Company.hq_location if provided. */
  var headquartersLocation: js.UndefOr[Location] = js.native
}
object CompanyDerivedInfo {
  
  @scala.inline
  def apply(): CompanyDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyDerivedInfo]
  }
  
  @scala.inline
  implicit class CompanyDerivedInfoMutableBuilder[Self <: CompanyDerivedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadquartersLocation(value: Location): Self = StObject.set(x, "headquartersLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadquartersLocationUndefined: Self = StObject.set(x, "headquartersLocation", js.undefined)
  }
}
