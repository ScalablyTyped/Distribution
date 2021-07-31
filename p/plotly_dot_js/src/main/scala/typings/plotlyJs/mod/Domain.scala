package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var column: Double
  
  var row: Double
  
  var x: js.Array[Double]
  
  var y: js.Array[Double]
}
object Domain {
  
  @scala.inline
  def apply(column: Double, row: Double, x: js.Array[Double], y: js.Array[Double]): Domain = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
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
