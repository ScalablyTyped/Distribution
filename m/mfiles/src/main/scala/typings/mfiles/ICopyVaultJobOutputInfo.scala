package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyVaultJobOutputInfo extends js.Object {
  val VaultProperties: IVaultProperties
}

object ICopyVaultJobOutputInfo {
  @scala.inline
  def apply(VaultProperties: IVaultProperties): ICopyVaultJobOutputInfo = {
    val __obj = js.Dynamic.literal(VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJobOutputInfo]
  }
}

