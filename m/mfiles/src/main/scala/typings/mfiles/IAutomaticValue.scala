package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticValue extends StObject {
  
  var ANSIncrement: Double = js.native
  
  var ANVCode: String = js.native
  
  var CVSExpression: String = js.native
  
  var CVVCode: String = js.native
  
  var CalculationOrderNumber: Double = js.native
  
  def Clone(): IAutomaticValue = js.native
}
object IAutomaticValue {
  
  @scala.inline
  def apply(
    ANSIncrement: Double,
    ANVCode: String,
    CVSExpression: String,
    CVVCode: String,
    CalculationOrderNumber: Double,
    Clone: () => IAutomaticValue
  ): IAutomaticValue = {
    val __obj = js.Dynamic.literal(ANSIncrement = ANSIncrement.asInstanceOf[js.Any], ANVCode = ANVCode.asInstanceOf[js.Any], CVSExpression = CVSExpression.asInstanceOf[js.Any], CVVCode = CVVCode.asInstanceOf[js.Any], CalculationOrderNumber = CalculationOrderNumber.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IAutomaticValue]
  }
  
  @scala.inline
  implicit class IAutomaticValueMutableBuilder[Self <: IAutomaticValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANSIncrement(value: Double): Self = StObject.set(x, "ANSIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANVCode(value: String): Self = StObject.set(x, "ANVCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVSExpression(value: String): Self = StObject.set(x, "CVSExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVVCode(value: String): Self = StObject.set(x, "CVVCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculationOrderNumber(value: Double): Self = StObject.set(x, "CalculationOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAutomaticValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
  }
}
