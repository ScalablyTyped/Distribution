package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResultVaultFinal extends js.Object {
  
  val Vault: IVault = js.native
}
object IAuthenticationResultVaultFinal {
  
  @scala.inline
  def apply(Vault: IVault): IAuthenticationResultVaultFinal = {
    val __obj = js.Dynamic.literal(Vault = Vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultVaultFinal]
  }
  
  @scala.inline
  implicit class IAuthenticationResultVaultFinalOps[Self <: IAuthenticationResultVaultFinal] (val x: Self) extends AnyVal {
    
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
    def setVault(value: IVault): Self = this.set("Vault", value.asInstanceOf[js.Any])
  }
}
