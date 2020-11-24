package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1ParentRelation extends js.Object {
  
  /** Output only. The custom name of the relation -- e.g., structure/room where the device is assigned to. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. The name of the relation -- e.g., structure/room where the device is assigned to. For example: "enterprises/XYZ/structures/ABC" or
    * "enterprises/XYZ/structures/ABC/rooms/123"
    */
  var parent: js.UndefOr[String] = js.native
}
object GoogleHomeEnterpriseSdmV1ParentRelation {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1ParentRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ParentRelation]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1ParentRelationOps[Self <: GoogleHomeEnterpriseSdmV1ParentRelation] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
