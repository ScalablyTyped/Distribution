package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResult extends StObject {
  
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
  implicit class IAuthenticationResultMutableBuilder[Self <: IAuthenticationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntermediate(value: IAuthenticationResultIntermediate): Self = StObject.set(x, "Intermediate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerFinal(value: IAuthenticationResultServerFinal): Self = StObject.set(x, "ServerFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultFinal(value: IAuthenticationResultVaultFinal): Self = StObject.set(x, "VaultFinal", value.asInstanceOf[js.Any])
  }
}
