package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1Device extends js.Object {
  
  /** Required. The resource name of the device. For example: "enterprises/XYZ/devices/123". */
  var name: js.UndefOr[String] = js.native
  
  /** Assignee details of the device. */
  var parentRelations: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1ParentRelation]] = js.native
  
  /** Output only. Device traits. */
  var traits: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Device with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Output only. Type of the device for general display purposes. For example: "THERMOSTAT". The device type should not be used to deduce or infer functionality of the actual device it
    * is assigned to. Instead, use the returned traits for the device.
    */
  var `type`: js.UndefOr[String] = js.native
}
object GoogleHomeEnterpriseSdmV1Device {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1Device]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1DeviceOps[Self <: GoogleHomeEnterpriseSdmV1Device] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentRelationsVarargs(value: GoogleHomeEnterpriseSdmV1ParentRelation*): Self = this.set("parentRelations", js.Array(value :_*))
    
    @scala.inline
    def setParentRelations(value: js.Array[GoogleHomeEnterpriseSdmV1ParentRelation]): Self = this.set("parentRelations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentRelations: Self = this.set("parentRelations", js.undefined)
    
    @scala.inline
    def setTraits(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Device with TopLevel[js.Any]
    ): Self = this.set("traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
