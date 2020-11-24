package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationDetails extends js.Object {
  
  /** Additional details of the entry in string format. Must be UTF-8 encoded with a length of no more than 1000 characters. */
  var details: js.UndefOr[String] = js.native
  
  /**
    * An external identifier to be associated with the entry. The integration code will show up together with the entry in many places in the system, for example, reporting. Must be UTF-8
    * encoded with a length of no more than 500 characters.
    */
  var integrationCode: js.UndefOr[String] = js.native
}
object IntegrationDetails {
  
  @scala.inline
  def apply(): IntegrationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationDetails]
  }
  
  @scala.inline
  implicit class IntegrationDetailsOps[Self <: IntegrationDetails] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setIntegrationCode(value: String): Self = this.set("integrationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrationCode: Self = this.set("integrationCode", js.undefined)
  }
}
