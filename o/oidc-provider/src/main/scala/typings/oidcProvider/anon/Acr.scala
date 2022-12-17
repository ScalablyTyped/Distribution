package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acr
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accountId: String
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var remember: js.UndefOr[Boolean] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
}
object Acr {
  
  inline def apply(accountId: String): Acr = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acr]
  }
  
  extension [Self <: Acr](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setRemember(value: Boolean): Self = StObject.set(x, "remember", value.asInstanceOf[js.Any])
    
    inline def setRememberUndefined: Self = StObject.set(x, "remember", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
  }
}
