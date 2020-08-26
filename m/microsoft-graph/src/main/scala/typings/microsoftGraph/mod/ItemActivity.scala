package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemActivity extends Entity {
  // An item was accessed.
  var access: js.UndefOr[AccessAction] = js.native
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[String] = js.native
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[IdentitySet] = js.native
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[DriveItem] = js.native
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
    def setAccess(value: AccessAction): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setActivityDateTime(value: String): Self = this.set("activityDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityDateTime: Self = this.set("activityDateTime", js.undefined)
    @scala.inline
    def setActor(value: IdentitySet): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setDriveItem(value: DriveItem): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
  }
  
}

