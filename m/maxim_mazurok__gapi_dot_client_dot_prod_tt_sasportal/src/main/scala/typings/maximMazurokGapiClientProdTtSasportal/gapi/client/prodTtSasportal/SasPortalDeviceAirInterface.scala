package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDeviceAirInterface extends js.Object {
  
  /** This field specifies the radio access technology that is used for the CBSD. Conditional */
  var radioTechnology: js.UndefOr[String] = js.native
  
  /** This field is related to the radioTechnology field and provides the air interface specification that the CBSD is compliant with at the time of registration. Optional */
  var supportedSpec: js.UndefOr[String] = js.native
}
object SasPortalDeviceAirInterface {
  
  @scala.inline
  def apply(): SasPortalDeviceAirInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDeviceAirInterface]
  }
  
  @scala.inline
  implicit class SasPortalDeviceAirInterfaceOps[Self <: SasPortalDeviceAirInterface] (val x: Self) extends AnyVal {
    
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
    def setRadioTechnology(value: String): Self = this.set("radioTechnology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioTechnology: Self = this.set("radioTechnology", js.undefined)
    
    @scala.inline
    def setSupportedSpec(value: String): Self = this.set("supportedSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedSpec: Self = this.set("supportedSpec", js.undefined)
  }
}
