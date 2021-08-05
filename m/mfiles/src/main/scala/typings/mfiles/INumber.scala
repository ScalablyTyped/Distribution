package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumber extends StObject {
  
  def Clone(): INumber
  
  var Value: Double
}
object INumber {
  
  inline def apply(Clone: () => INumber, Value: Double): INumber = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumber]
  }
  
  extension [Self <: INumber](x: Self) {
    
    inline def setClone(value: () => INumber): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
