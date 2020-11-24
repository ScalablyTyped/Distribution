package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoragePlanInformation extends js.Object {
  
  // Indicates whether there are higher storage quota plans available. Read-only.
  var upgradeAvailable: js.UndefOr[NullableOption[Boolean]] = js.native
}
object StoragePlanInformation {
  
  @scala.inline
  def apply(): StoragePlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoragePlanInformation]
  }
  
  @scala.inline
  implicit class StoragePlanInformationOps[Self <: StoragePlanInformation] (val x: Self) extends AnyVal {
    
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
    def setUpgradeAvailable(value: NullableOption[Boolean]): Self = this.set("upgradeAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeAvailable: Self = this.set("upgradeAvailable", js.undefined)
    
    @scala.inline
    def setUpgradeAvailableNull: Self = this.set("upgradeAvailable", null)
  }
}
