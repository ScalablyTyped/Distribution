package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapsuleOptions
  extends StObject
     with SharedShapeOptions {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object CapsuleOptions {
  
  inline def apply(): CapsuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapsuleOptions]
  }
  
  extension [Self <: CapsuleOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
