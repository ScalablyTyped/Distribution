package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuthenticationResult extends js.Object {
  val Intermediate: IAuthenticationResultIntermediate = js.native
  val ServerFinal: IAuthenticationResultServerFinal = js.native
  val VaultFinal: IAuthenticationResultVaultFinal = js.native
}

object IAuthenticationResult {
  @scala.inline
  def apply(
    Intermediate: IAuthenticationResultIntermediate,
    ServerFinal: IAuthenticationResultServerFinal,
    VaultFinal: IAuthenticationResultVaultFinal
  ): IAuthenticationResult = {
    val __obj = js.Dynamic.literal(Intermediate = Intermediate.asInstanceOf[js.Any], ServerFinal = ServerFinal.asInstanceOf[js.Any], VaultFinal = VaultFinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResult]
  }
  @scala.inline
  implicit class IAuthenticationResultOps[Self <: IAuthenticationResult] (val x: Self) extends AnyVal {
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
    def setIntermediate(value: IAuthenticationResultIntermediate): Self = this.set("Intermediate", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerFinal(value: IAuthenticationResultServerFinal): Self = this.set("ServerFinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultFinal(value: IAuthenticationResultVaultFinal): Self = this.set("VaultFinal", value.asInstanceOf[js.Any])
  }
  
}

