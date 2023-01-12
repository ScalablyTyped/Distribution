package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RSAPrivateKeyJson extends StObject {
  
  var d: String
  
  var dp: String
  
  var dq: String
  
  var e: String
  
  var n: String
  
  var oth: js.UndefOr[js.Array[OtherPrimeInfoJson]] = js.undefined
  
  var p: String
  
  var q: String
  
  var qi: String
}
object RSAPrivateKeyJson {
  
  inline def apply(d: String, dp: String, dq: String, e: String, n: String, p: String, q: String, qi: String): RSAPrivateKeyJson = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKeyJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAPrivateKeyJson] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setOth(value: js.Array[OtherPrimeInfoJson]): Self = StObject.set(x, "oth", value.asInstanceOf[js.Any])
    
    inline def setOthUndefined: Self = StObject.set(x, "oth", js.undefined)
    
    inline def setOthVarargs(value: OtherPrimeInfoJson*): Self = StObject.set(x, "oth", js.Array(value*))
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
  }
}
