package typings.node.cryptoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonWebKey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var crv: js.UndefOr[String] = js.undefined
  
  var d: js.UndefOr[String] = js.undefined
  
  var dp: js.UndefOr[String] = js.undefined
  
  var dq: js.UndefOr[String] = js.undefined
  
  var e: js.UndefOr[String] = js.undefined
  
  var k: js.UndefOr[String] = js.undefined
  
  var kty: js.UndefOr[String] = js.undefined
  
  var n: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var qi: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[String] = js.undefined
  
  var y: js.UndefOr[String] = js.undefined
}
object JsonWebKey {
  
  inline def apply(): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey]
  }
  
  extension [Self <: JsonWebKey](x: Self) {
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
