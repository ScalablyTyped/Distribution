package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest extends js.Object {
  
  /** The command name to execute, represented by the fully qualified protobuf message name. */
  var command: js.UndefOr[String] = js.native
  
  /** The command message to execute, represented as a Struct. */
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest with TopLevel[js.Any]
  ] = js.native
}
object GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequestOps[Self <: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest with TopLevel[js.Any]
    ): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
