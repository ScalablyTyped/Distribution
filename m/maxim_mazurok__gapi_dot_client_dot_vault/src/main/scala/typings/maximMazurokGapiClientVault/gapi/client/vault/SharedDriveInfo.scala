package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDriveInfo extends js.Object {
  
  /** List of Shared drive IDs, as provided by Drive API. */
  var sharedDriveIds: js.UndefOr[js.Array[String]] = js.native
}
object SharedDriveInfo {
  
  @scala.inline
  def apply(): SharedDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveInfo]
  }
  
  @scala.inline
  implicit class SharedDriveInfoOps[Self <: SharedDriveInfo] (val x: Self) extends AnyVal {
    
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
    def setSharedDriveIdsVarargs(value: String*): Self = this.set("sharedDriveIds", js.Array(value :_*))
    
    @scala.inline
    def setSharedDriveIds(value: js.Array[String]): Self = this.set("sharedDriveIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDriveIds: Self = this.set("sharedDriveIds", js.undefined)
  }
}
