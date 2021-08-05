package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICopyVaultJobOutputInfo extends StObject {
  
  val VaultProperties: IVaultProperties
}
object ICopyVaultJobOutputInfo {
  
  inline def apply(VaultProperties: IVaultProperties): ICopyVaultJobOutputInfo = {
    val __obj = js.Dynamic.literal(VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJobOutputInfo]
  }
  
  extension [Self <: ICopyVaultJobOutputInfo](x: Self) {
    
    inline def setVaultProperties(value: IVaultProperties): Self = StObject.set(x, "VaultProperties", value.asInstanceOf[js.Any])
  }
}
