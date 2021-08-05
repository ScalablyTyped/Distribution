package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonOtherPrimeInfo extends StObject {
  
  var d: String
  
  var r: String
  
  var t: String
}
object JsonOtherPrimeInfo {
  
  inline def apply(d: String, r: String, t: String): JsonOtherPrimeInfo = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonOtherPrimeInfo]
  }
  
  extension [Self <: JsonOtherPrimeInfo](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
