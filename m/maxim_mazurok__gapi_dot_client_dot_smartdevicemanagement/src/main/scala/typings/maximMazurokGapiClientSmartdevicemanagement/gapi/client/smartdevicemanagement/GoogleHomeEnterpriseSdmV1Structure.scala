package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1Structure extends js.Object {
  
  /** Output only. The resource name of the structure. For example: "enterprises/XYZ/structures/ABC". */
  var name: js.UndefOr[String] = js.native
  
  /** Structure traits. */
  var traits: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Structure with TopLevel[js.Any]
  ] = js.native
}
object GoogleHomeEnterpriseSdmV1Structure {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1Structure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1Structure]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1StructureOps[Self <: GoogleHomeEnterpriseSdmV1Structure] (val x: Self) extends AnyVal {
    
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
    def setTraits(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.GoogleHomeEnterpriseSdmV1Structure with TopLevel[js.Any]
    ): Self = this.set("traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
  }
}
