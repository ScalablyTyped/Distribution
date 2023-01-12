package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidStep extends StObject {
  
  var invalidStep: js.UndefOr[String] = js.undefined
  
  var maxMin: js.UndefOr[String] = js.undefined
  
  var noValue: js.UndefOr[String] = js.undefined
  
  var optionNum: js.UndefOr[String] = js.undefined
  
  var valueRange: js.UndefOr[String] = js.undefined
}
object InvalidStep {
  
  inline def apply(): InvalidStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidStep] (val x: Self) extends AnyVal {
    
    inline def setInvalidStep(value: String): Self = StObject.set(x, "invalidStep", value.asInstanceOf[js.Any])
    
    inline def setInvalidStepUndefined: Self = StObject.set(x, "invalidStep", js.undefined)
    
    inline def setMaxMin(value: String): Self = StObject.set(x, "maxMin", value.asInstanceOf[js.Any])
    
    inline def setMaxMinUndefined: Self = StObject.set(x, "maxMin", js.undefined)
    
    inline def setNoValue(value: String): Self = StObject.set(x, "noValue", value.asInstanceOf[js.Any])
    
    inline def setNoValueUndefined: Self = StObject.set(x, "noValue", js.undefined)
    
    inline def setOptionNum(value: String): Self = StObject.set(x, "optionNum", value.asInstanceOf[js.Any])
    
    inline def setOptionNumUndefined: Self = StObject.set(x, "optionNum", js.undefined)
    
    inline def setValueRange(value: String): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
