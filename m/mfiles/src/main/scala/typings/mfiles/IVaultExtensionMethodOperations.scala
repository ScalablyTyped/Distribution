package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultExtensionMethodOperations extends js.Object {
  def DoesActiveVaultExtensionMethodExist(MethodIdentifier: String): Boolean = js.native
  def ExecuteVaultExtensionMethod(MethodIdentifier: String, Input: String): String = js.native
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
  @scala.inline
  implicit class IVaultExtensionMethodOperationsOps[Self <: IVaultExtensionMethodOperations] (val x: Self) extends AnyVal {
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
    def setDoesActiveVaultExtensionMethodExist(value: String => Boolean): Self = this.set("DoesActiveVaultExtensionMethodExist", js.Any.fromFunction1(value))
    @scala.inline
    def setExecuteVaultExtensionMethod(value: (String, String) => String): Self = this.set("ExecuteVaultExtensionMethod", js.Any.fromFunction2(value))
  }
  
}

