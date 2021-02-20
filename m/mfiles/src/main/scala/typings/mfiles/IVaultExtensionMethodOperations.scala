package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultExtensionMethodOperations extends StObject {
  
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
  implicit class IVaultExtensionMethodOperationsMutableBuilder[Self <: IVaultExtensionMethodOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoesActiveVaultExtensionMethodExist(value: String => Boolean): Self = StObject.set(x, "DoesActiveVaultExtensionMethodExist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteVaultExtensionMethod(value: (String, String) => String): Self = StObject.set(x, "ExecuteVaultExtensionMethod", js.Any.fromFunction2(value))
  }
}
