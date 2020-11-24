package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlRestriction extends js.Object {
  
  /** End date (if specified) of the URL restriction. End date should be later than the start date for the date range to be valid. */
  var endDate: js.UndefOr[Date] = js.native
  
  /** The restriction type for the specified URL. */
  var restrictionType: js.UndefOr[String] = js.native
  
  /** Start date (if specified) of the URL restriction. */
  var startDate: js.UndefOr[Date] = js.native
  
  /** Required. The URL to use for applying the restriction on the user list. */
  var url: js.UndefOr[String] = js.native
}
object UrlRestriction {
  
  @scala.inline
  def apply(): UrlRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlRestriction]
  }
  
  @scala.inline
  implicit class UrlRestrictionOps[Self <: UrlRestriction] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setRestrictionType(value: String): Self = this.set("restrictionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictionType: Self = this.set("restrictionType", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
