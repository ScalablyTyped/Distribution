package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :number,   y :number,   centerOffset :number}> */
trait Partialxnumberynumbercent extends StObject {
  
  var centerOffset: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object Partialxnumberynumbercent {
  
  inline def apply(): Partialxnumberynumbercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialxnumberynumbercent]
  }
  
  extension [Self <: Partialxnumberynumbercent](x: Self) {
    
    inline def setCenterOffset(value: Double): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    inline def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
