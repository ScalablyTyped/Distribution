package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditActivityInitiator extends js.Object {
  /**
    * If the resource initiating the activity is an app, this property indicates all the app related information like appId,
    * Name, servicePrincipalId, Name.
    */
  var app: js.UndefOr[AppIdentity] = js.undefined
  /**
    * If the resource initiating the activity is a user, this property Indicates all the user related information like
    * userId, Name, UserPrinicpalName.
    */
  var user: js.UndefOr[UserIdentity] = js.undefined
}

object AuditActivityInitiator {
  @scala.inline
  def apply(app: AppIdentity = null, user: UserIdentity = null): AuditActivityInitiator = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditActivityInitiator]
  }
}

