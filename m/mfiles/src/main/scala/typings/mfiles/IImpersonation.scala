package typings.mfiles

import typings.mfiles.MFiles.MFImpersonationType
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
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ImpersonationType = ImpersonationType.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IImpersonation]
  }
}

