package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditActivityInitiator extends js.Object {
  /**
    * If the resource initiating the activity is an app, this property indicates all the app related information like appId,
    * Name, servicePrincipalId, Name.
    */
  var app: js.UndefOr[AppIdentity] = js.native
  /**
    * If the resource initiating the activity is a user, this property Indicates all the user related information like
    * userId, Name, UserPrinicpalName.
    */
  var user: js.UndefOr[UserIdentity] = js.native
}

object AuditActivityInitiator {
  @scala.inline
  def apply(): AuditActivityInitiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditActivityInitiator]
  }
  @scala.inline
  implicit class AuditActivityInitiatorOps[Self <: AuditActivityInitiator] (val x: Self) extends AnyVal {
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
    def setApp(value: AppIdentity): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setUser(value: UserIdentity): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

