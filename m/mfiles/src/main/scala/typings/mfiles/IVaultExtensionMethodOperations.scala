package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExtensionMethodOperations extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Boolean
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String): String
}

object IVaultExtensionMethodOperations {
  @scala.inline
  def apply(
    DoesActiveVaultExtensionMethodExist: String => Boolean,
    ExecuteVaultExtensionMethod: (String, String) => String
  ): IVaultExtensionMethodOperations = {
    val __obj = js.Dynamic.literal(DoesActiveVaultExtensionMethodExist = js.Any.fromFunction1(DoesActiveVaultExtensionMethodExist), ExecuteVaultExtensionMethod = js.Any.fromFunction2(ExecuteVaultExtensionMethod))
  
    __obj.asInstanceOf[IVaultExtensionMethodOperations]
  }
}

