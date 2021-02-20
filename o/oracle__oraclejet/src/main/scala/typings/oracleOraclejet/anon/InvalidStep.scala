package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidStep extends StObject {
  
  var invalidStep: js.UndefOr[String] = js.native
  
  var maxMin: js.UndefOr[String] = js.native
  
  var noValue: js.UndefOr[String] = js.native
  
  var optionNum: js.UndefOr[String] = js.native
  
  var valueRange: js.UndefOr[String] = js.native
}
object InvalidStep {
  
  @scala.inline
  def apply(): InvalidStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidStep]
  }
  
  @scala.inline
  implicit class InvalidStepMutableBuilder[Self <: InvalidStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidStep(value: String): Self = StObject.set(x, "invalidStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidStepUndefined: Self = StObject.set(x, "invalidStep", js.undefined)
    
    @scala.inline
    def setMaxMin(value: String): Self = StObject.set(x, "maxMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMinUndefined: Self = StObject.set(x, "maxMin", js.undefined)
    
    @scala.inline
    def setNoValue(value: String): Self = StObject.set(x, "noValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoValueUndefined: Self = StObject.set(x, "noValue", js.undefined)
    
    @scala.inline
    def setOptionNum(value: String): Self = StObject.set(x, "optionNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionNumUndefined: Self = StObject.set(x, "optionNum", js.undefined)
    
    @scala.inline
    def setValueRange(value: String): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
