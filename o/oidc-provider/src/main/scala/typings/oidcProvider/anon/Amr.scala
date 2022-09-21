package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amr extends StObject {
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var authTime: js.UndefOr[Double] = js.undefined
}
object Amr {
  
  inline def apply(): Amr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amr]
  }
  
  extension [Self <: Amr](x: Self) {
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setAuthTime(value: Double): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setAuthTimeUndefined: Self = StObject.set(x, "authTime", js.undefined)
  }
}
