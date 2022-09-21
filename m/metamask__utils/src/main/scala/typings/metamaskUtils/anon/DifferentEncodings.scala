package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DifferentEncodings extends StObject {
  
  var differentEncodings: Ascii
  
  var moreNestedObjects: NestedAgainNestedAgain
  
  var numbers: js.Array[Double]
  
  var specialObjectsTypesAndValues: Dates
}
object DifferentEncodings {
  
  inline def apply(
    differentEncodings: Ascii,
    moreNestedObjects: NestedAgainNestedAgain,
    numbers: js.Array[Double],
    specialObjectsTypesAndValues: Dates
  ): DifferentEncodings = {
    val __obj = js.Dynamic.literal(differentEncodings = differentEncodings.asInstanceOf[js.Any], moreNestedObjects = moreNestedObjects.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], specialObjectsTypesAndValues = specialObjectsTypesAndValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DifferentEncodings]
  }
  
  extension [Self <: DifferentEncodings](x: Self) {
    
    inline def setDifferentEncodings(value: Ascii): Self = StObject.set(x, "differentEncodings", value.asInstanceOf[js.Any])
    
    inline def setMoreNestedObjects(value: NestedAgainNestedAgain): Self = StObject.set(x, "moreNestedObjects", value.asInstanceOf[js.Any])
    
    inline def setNumbers(value: js.Array[Double]): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setNumbersVarargs(value: Double*): Self = StObject.set(x, "numbers", js.Array(value*))
    
    inline def setSpecialObjectsTypesAndValues(value: Dates): Self = StObject.set(x, "specialObjectsTypesAndValues", value.asInstanceOf[js.Any])
  }
}
