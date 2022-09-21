package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresIn
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var expiresIn: js.UndefOr[Double] = js.undefined
  
  var policies: js.UndefOr[js.Array[String]] = js.undefined
}
object ExpiresIn {
  
  inline def apply(): ExpiresIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresIn]
  }
  
  extension [Self <: ExpiresIn](x: Self) {
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setPolicies(value: js.Array[String]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: String*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
