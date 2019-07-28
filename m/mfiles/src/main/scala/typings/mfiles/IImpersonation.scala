package typings.mfiles

import typings.mfiles.MFilesNs.MFImpersonationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImpersonation extends js.Object {
  var Account: String
  var ImpersonationType: MFImpersonationType
  var Password: String
  def Clone(): IImpersonation
}

object IImpersonation {
  @scala.inline
  def apply(
    Account: String,
    Clone: () => IImpersonation,
    ImpersonationType: MFImpersonationType,
    Password: String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal(Account = Account, Clone = js.Any.fromFunction0(Clone), ImpersonationType = ImpersonationType, Password = Password)
  
    __obj.asInstanceOf[IImpersonation]
  }
}

