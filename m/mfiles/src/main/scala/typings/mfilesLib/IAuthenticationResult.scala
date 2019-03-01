package typings
package mfilesLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Intermediate")(Intermediate)
    __obj.updateDynamic("ServerFinal")(ServerFinal)
    __obj.updateDynamic("VaultFinal")(VaultFinal)
    __obj.asInstanceOf[IAuthenticationResult]
  }
}

