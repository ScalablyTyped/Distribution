package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :std.Array<number>,   y :std.Array<number>}> */
trait PartialxArraynumberyArray extends StObject {
  
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}
object PartialxArraynumberyArray {
  
  inline def apply(): PartialxArraynumberyArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialxArraynumberyArray]
  }
  
  extension [Self <: PartialxArraynumberyArray](x: Self) {
    
    inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
