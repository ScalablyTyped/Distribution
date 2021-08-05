package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomaticValue extends StObject {
  
  var ANSIncrement: Double
  
  var ANVCode: String
  
  var CVSExpression: String
  
  var CVVCode: String
  
  var CalculationOrderNumber: Double
  
  def Clone(): IAutomaticValue
}
object IAutomaticValue {
  
  inline def apply(
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
  
  extension [Self <: IAutomaticValue](x: Self) {
    
    inline def setANSIncrement(value: Double): Self = StObject.set(x, "ANSIncrement", value.asInstanceOf[js.Any])
    
    inline def setANVCode(value: String): Self = StObject.set(x, "ANVCode", value.asInstanceOf[js.Any])
    
    inline def setCVSExpression(value: String): Self = StObject.set(x, "CVSExpression", value.asInstanceOf[js.Any])
    
    inline def setCVVCode(value: String): Self = StObject.set(x, "CVVCode", value.asInstanceOf[js.Any])
    
    inline def setCalculationOrderNumber(value: Double): Self = StObject.set(x, "CalculationOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IAutomaticValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
  }
}
