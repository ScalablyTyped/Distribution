package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthenticationResult extends js.Object {
  val Intermediate: IAuthenticationResultIntermediate
  val ServerFinal: IAuthenticationResultServerFinal
  val VaultFinal: IAuthenticationResultVaultFinal
}

object IAuthenticationResult {
  @scala.inline
  def apply(
    Intermediate: IAuthenticationResultIntermediate,
    ServerFinal: IAuthenticationResultServerFinal,
    VaultFinal: IAuthenticationResultVaultFinal
  ): IAuthenticationResult = {
    val __obj = js.Dynamic.literal(Intermediate = Intermediate, ServerFinal = ServerFinal, VaultFinal = VaultFinal)
  
    __obj.asInstanceOf[IAuthenticationResult]
  }
}

