package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulingGroup extends ChangeTrackedEntity {
  // The display name for the schedulingGroup. Required.
  var displayName: js.UndefOr[String] = js.native
  // Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones. Required.
  var isActive: js.UndefOr[Boolean] = js.native
  // The list of user IDs that are a member of the schedulingGroup. Required.
  var userIds: js.UndefOr[js.Array[String]] = js.native
}

object SchedulingGroup {
  @scala.inline
  def apply(): SchedulingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulingGroup]
  }
  @scala.inline
  implicit class SchedulingGroupOps[Self <: SchedulingGroup] (val x: Self) extends AnyVal {
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("userIds", js.Array(value :_*))
    @scala.inline
    def setUserIds(value: js.Array[String]): Self = this.set("userIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIds: Self = this.set("userIds", js.undefined)
  }
  
}

