package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemActivity extends Entity {
  
  // An item was accessed.
  var access: js.UndefOr[NullableOption[AccessAction]] = js.native
  
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[NullableOption[DriveItem]] = js.native
}
object ItemActivity {
  
  @scala.inline
  def apply(): ItemActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemActivity]
  }
  
  @scala.inline
  implicit class ItemActivityOps[Self <: ItemActivity] (val x: Self) extends AnyVal {
    
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
    def setAccess(value: NullableOption[AccessAction]): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setAccessNull: Self = this.set("access", null)
    
    @scala.inline
    def setActivityDateTime(value: NullableOption[String]): Self = this.set("activityDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityDateTime: Self = this.set("activityDateTime", js.undefined)
    
    @scala.inline
    def setActivityDateTimeNull: Self = this.set("activityDateTime", null)
    
    @scala.inline
    def setActor(value: NullableOption[IdentitySet]): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setActorNull: Self = this.set("actor", null)
    
    @scala.inline
    def setDriveItem(value: NullableOption[DriveItem]): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    
    @scala.inline
    def setDriveItemNull: Self = this.set("driveItem", null)
  }
}
