package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthenticationResult extends StObject {
  
  val Intermediate: IAuthenticationResultIntermediate
  
  val ServerFinal: IAuthenticationResultServerFinal
  
  val VaultFinal: IAuthenticationResultVaultFinal
}
object IAuthenticationResult {
  
  inline def apply(
    Intermediate: IAuthenticationResultIntermediate,
    ServerFinal: IAuthenticationResultServerFinal,
    VaultFinal: IAuthenticationResultVaultFinal
  ): IAuthenticationResult = {
    val __obj = js.Dynamic.literal(Intermediate = Intermediate.asInstanceOf[js.Any], ServerFinal = ServerFinal.asInstanceOf[js.Any], VaultFinal = VaultFinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResult]
  }
  
  extension [Self <: IAuthenticationResult](x: Self) {
    
    inline def setIntermediate(value: IAuthenticationResultIntermediate): Self = StObject.set(x, "Intermediate", value.asInstanceOf[js.Any])
    
    inline def setServerFinal(value: IAuthenticationResultServerFinal): Self = StObject.set(x, "ServerFinal", value.asInstanceOf[js.Any])
    
    inline def setVaultFinal(value: IAuthenticationResultVaultFinal): Self = StObject.set(x, "VaultFinal", value.asInstanceOf[js.Any])
  }
}
