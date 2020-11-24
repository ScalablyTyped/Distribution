package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompanyDerivedInfo extends js.Object {
  
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
  implicit class CompanyDerivedInfoOps[Self <: CompanyDerivedInfo] (val x: Self) extends AnyVal {
    
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
    def setHeadquartersLocation(value: Location): Self = this.set("headquartersLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadquartersLocation: Self = this.set("headquartersLocation", js.undefined)
  }
}
