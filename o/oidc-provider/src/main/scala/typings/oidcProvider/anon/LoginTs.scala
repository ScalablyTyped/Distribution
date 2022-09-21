package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginTs extends StObject {
  
  var accountId: String
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var loginTs: js.UndefOr[Double] = js.undefined
  
  var transient: js.UndefOr[Boolean] = js.undefined
}
object LoginTs {
  
  inline def apply(accountId: String): LoginTs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginTs]
  }
  
  extension [Self <: LoginTs](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setLoginTs(value: Double): Self = StObject.set(x, "loginTs", value.asInstanceOf[js.Any])
    
    inline def setLoginTsUndefined: Self = StObject.set(x, "loginTs", js.undefined)
    
    inline def setTransient(value: Boolean): Self = StObject.set(x, "transient", value.asInstanceOf[js.Any])
    
    inline def setTransientUndefined: Self = StObject.set(x, "transient", js.undefined)
  }
}
