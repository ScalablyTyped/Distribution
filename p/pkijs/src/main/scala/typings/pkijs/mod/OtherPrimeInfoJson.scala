package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherPrimeInfoJson extends StObject {
  
  var d: String
  
  var r: String
  
  var t: String
}
object OtherPrimeInfoJson {
  
  inline def apply(d: String, r: String, t: String): OtherPrimeInfoJson = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherPrimeInfoJson]
  }
  
  extension [Self <: OtherPrimeInfoJson](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
