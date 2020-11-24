package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgUnitInfo extends js.Object {
  
  /** Org unit to search, as provided by the Admin SDK Directory API. */
  var orgUnitId: js.UndefOr[String] = js.native
}
object OrgUnitInfo {
  
  @scala.inline
  def apply(): OrgUnitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgUnitInfo]
  }
  
  @scala.inline
  implicit class OrgUnitInfoOps[Self <: OrgUnitInfo] (val x: Self) extends AnyVal {
    
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
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
  }
}
