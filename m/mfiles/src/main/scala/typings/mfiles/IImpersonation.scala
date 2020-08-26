package typings.mfiles

import typings.mfiles.MFiles.MFImpersonationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImpersonation extends js.Object {
  var Account: String = js.native
  var ImpersonationType: MFImpersonationType = js.native
  var Password: String = js.native
  def Clone(): IImpersonation = js.native
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
  @scala.inline
  implicit class IImpersonationOps[Self <: IImpersonation] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IImpersonation): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setImpersonationType(value: MFImpersonationType): Self = this.set("ImpersonationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
  }
  
}

