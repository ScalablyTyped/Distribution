package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vault extends StObject {
  
  /** The details about a saved payment source. */
  var vault: js.UndefOr[PartialidstringstatusCREA] = js.undefined
}
object Vault {
  
  inline def apply(): Vault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vault] (val x: Self) extends AnyVal {
    
    inline def setVault(value: PartialidstringstatusCREA): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
    
    inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
  }
}
