package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :std.Array<number>,   y :std.Array<number>}> */
@js.native
trait PartialxArraynumberyArray extends StObject {
  
  var x: js.UndefOr[js.Array[Double]] = js.native
  
  var y: js.UndefOr[js.Array[Double]] = js.native
}
object PartialxArraynumberyArray {
  
  @scala.inline
  def apply(): PartialxArraynumberyArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialxArraynumberyArray]
  }
  
  @scala.inline
  implicit class PartialxArraynumberyArrayMutableBuilder[Self <: PartialxArraynumberyArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
