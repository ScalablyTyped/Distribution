package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthenticationResultVaultFinal extends StObject {
  
  val Vault: IVault
}
object IAuthenticationResultVaultFinal {
  
  inline def apply(Vault: IVault): IAuthenticationResultVaultFinal = {
    val __obj = js.Dynamic.literal(Vault = Vault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultVaultFinal]
  }
  
  extension [Self <: IAuthenticationResultVaultFinal](x: Self) {
    
    inline def setVault(value: IVault): Self = StObject.set(x, "Vault", value.asInstanceOf[js.Any])
  }
}
