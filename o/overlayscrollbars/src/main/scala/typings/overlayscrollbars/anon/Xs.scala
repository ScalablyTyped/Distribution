package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xs extends StObject {
  
  var x: Boolean
  
  var xs: Boolean
  
  var y: Boolean
  
  var ys: Boolean
}
object Xs {
  
  inline def apply(x: Boolean, xs: Boolean, y: Boolean, ys: Boolean): Xs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xs]
  }
  
  extension [Self <: Xs](x: Self) {
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXs(value: Boolean): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYs(value: Boolean): Self = StObject.set(x, "ys", value.asInstanceOf[js.Any])
  }
}
