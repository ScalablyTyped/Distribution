package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acr extends StObject {
  
  var accountId: String
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var cookie: String
  
  var uid: String
}
object Acr {
  
  inline def apply(accountId: String, cookie: String, uid: String): Acr = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acr]
  }
  
  extension [Self <: Acr](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
