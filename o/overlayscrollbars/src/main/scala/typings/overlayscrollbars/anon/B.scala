package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B extends StObject {
  
  var b: Double
  
  var l: Double
  
  var r: Double
  
  var t: Double
}
object B {
  
  inline def apply(b: Double, l: Double, r: Double, t: Double): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  
  extension [Self <: B](x: Self) {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
