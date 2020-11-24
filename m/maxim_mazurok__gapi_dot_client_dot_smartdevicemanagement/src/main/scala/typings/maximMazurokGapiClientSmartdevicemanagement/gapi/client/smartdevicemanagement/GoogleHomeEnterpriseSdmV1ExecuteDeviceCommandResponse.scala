package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse extends js.Object {
  
  /** The results of executing the command. */
  var results: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse with TopLevel[js.Any]
  ] = js.native
}
object GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponseOps[Self <: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] (val x: Self) extends AnyVal {
    
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
    def setResults(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse with TopLevel[js.Any]
    ): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
