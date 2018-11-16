package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNotificationOperationsAsync extends js.Object {
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String
  ): scala.Unit = js.native
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: scala.Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: scala.Boolean,
    Subject: java.lang.String,
    Body: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

