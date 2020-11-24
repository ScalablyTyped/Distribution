package typings.maximMazurokGapiClientLocalservices.gapi.client.localservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleTypeTimeZone extends js.Object {
  
  /** IANA Time Zone Database time zone, e.g. "America/New_York". */
  var id: js.UndefOr[String] = js.native
  
  /** Optional. IANA Time Zone Database version number, e.g. "2019a". */
  var version: js.UndefOr[String] = js.native
}
object GoogleTypeTimeZone {
  
  @scala.inline
  def apply(): GoogleTypeTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleTypeTimeZone]
  }
  
  @scala.inline
  implicit class GoogleTypeTimeZoneOps[Self <: GoogleTypeTimeZone] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
