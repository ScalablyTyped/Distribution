package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintResult extends StObject {
  
  /** Human readable debug message associated with the issue. */
  var debugMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the field for which this lint result is about. For nested messages `field_name` consists of names of the embedded fields separated by period character. The top-level
    * qualifier is the input object to lint in the request. For example, the `field_name` value `condition.expression` identifies a lint result for the `expression` field of the provided
    * condition.
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /** The validation unit level. */
  var level: js.UndefOr[String] = js.undefined
  
  /** 0-based character position of problematic construct within the object identified by `field_name`. Currently, this is populated only for condition expression. */
  var locationOffset: js.UndefOr[Double] = js.undefined
  
  /** The validation unit severity. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The validation unit name, for instance "lintValidationUnits/ConditionComplexityCheck". */
  var validationUnitName: js.UndefOr[String] = js.undefined
}
object LintResult {
  
  inline def apply(): LintResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintResult]
  }
  
  extension [Self <: LintResult](x: Self) {
    
    inline def setDebugMessage(value: String): Self = StObject.set(x, "debugMessage", value.asInstanceOf[js.Any])
    
    inline def setDebugMessageUndefined: Self = StObject.set(x, "debugMessage", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocationOffset(value: Double): Self = StObject.set(x, "locationOffset", value.asInstanceOf[js.Any])
    
    inline def setLocationOffsetUndefined: Self = StObject.set(x, "locationOffset", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setValidationUnitName(value: String): Self = StObject.set(x, "validationUnitName", value.asInstanceOf[js.Any])
    
    inline def setValidationUnitNameUndefined: Self = StObject.set(x, "validationUnitName", js.undefined)
  }
}
