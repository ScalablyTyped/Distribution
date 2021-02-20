package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRange extends StObject {
  
  var x: js.Array[Double] = js.native
  
  var y: js.Array[Double] = js.native
}
object SelectionRange {
  
  @scala.inline
  def apply(x: js.Array[Double], y: js.Array[Double]): SelectionRange = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  
  @scala.inline
  implicit class SelectionRangeMutableBuilder[Self <: SelectionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
