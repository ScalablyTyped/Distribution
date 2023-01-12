package typings.parameter.mod

import typings.parameter.parameterStrings.string
import typings.parameter.parameterStrings.stringQuestionmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRuleString
  extends StObject
     with ParameterRuleBase
     with _ParameterRuleItem {
  
  /**
    * Allow empty string, default to false. If rule.required set to false, allowEmpty will be set to true by default.
    * @alias ParameterRuleString.empty
    */
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Alias of allowEmpty
    */
  var empty: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[js.RegExp] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var trim: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_ParameterRuleString: string | stringQuestionmark
}
object ParameterRuleString {
  
  inline def apply(`type`: string | stringQuestionmark): ParameterRuleString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRuleString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterRuleString] (val x: Self) extends AnyVal {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setType(value: string | stringQuestionmark): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
