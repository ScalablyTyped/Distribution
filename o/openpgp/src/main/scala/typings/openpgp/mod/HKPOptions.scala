package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HKPOptions extends StObject {
  
  /**
    * (optionsl) The long public key ID.
    */
  var keyId: js.UndefOr[String] = js.undefined
  
  /**
    * (optional) This can be any part of the key user ID such as name or email address.
    */
  var query: js.UndefOr[String] = js.undefined
}
object HKPOptions {
  
  inline def apply(): HKPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HKPOptions]
  }
  
  extension [Self <: HKPOptions](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
