package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalculation extends StObject {
  
  var calculate: js.Function = js.native
  
  var fields: js.Array[String] = js.native
}
object ICalculation {
  
  @scala.inline
  def apply(calculate: js.Function, fields: js.Array[String]): ICalculation = {
    val __obj = js.Dynamic.literal(calculate = calculate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalculation]
  }
  
  @scala.inline
  implicit class ICalculationMutableBuilder[Self <: ICalculation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: js.Function): Self = StObject.set(x, "calculate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
