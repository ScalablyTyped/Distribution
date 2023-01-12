package typings.parameter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterOptions extends StObject {
  
  /**
    * convert primitive params to specific type.
    * @default false
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * translate function
    */
  var translate: js.UndefOr[ParameterTranslateFunction] = js.undefined
  
  /**
    * config whether to validate the passed in value must be a object
    * @default false
    */
  var validateRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * convert empty string(''), NaN, Null to undefined, this option can make rule.required more powerful,
    * **This may change the original input params.**
    * @default false
    */
  var widelyUndefined: js.UndefOr[Boolean] = js.undefined
}
object ParameterOptions {
  
  inline def apply(): ParameterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterOptions] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setTranslate(value: ParameterTranslateFunction): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setValidateRoot(value: Boolean): Self = StObject.set(x, "validateRoot", value.asInstanceOf[js.Any])
    
    inline def setValidateRootUndefined: Self = StObject.set(x, "validateRoot", js.undefined)
    
    inline def setWidelyUndefined(value: Boolean): Self = StObject.set(x, "widelyUndefined", value.asInstanceOf[js.Any])
    
    inline def setWidelyUndefinedUndefined: Self = StObject.set(x, "widelyUndefined", js.undefined)
  }
}
