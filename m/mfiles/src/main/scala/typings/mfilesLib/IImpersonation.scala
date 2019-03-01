package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImpersonation extends js.Object {
  var Account: java.lang.String
  var ImpersonationType: mfilesLib.MFilesNs.MFImpersonationType
  var Password: java.lang.String
  def Clone(): IImpersonation
}

object IImpersonation {
  @scala.inline
  def apply(
    Account: java.lang.String,
    Clone: js.Function0[IImpersonation],
    ImpersonationType: mfilesLib.MFilesNs.MFImpersonationType,
    Password: java.lang.String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Account")(Account)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("ImpersonationType")(ImpersonationType)
    __obj.updateDynamic("Password")(Password)
    __obj.asInstanceOf[IImpersonation]
  }
}

