package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.oracleOraclejetStrings.color
import typings.oracleOraclejet.oracleOraclejetStrings.dateRestriction
import typings.oracleOraclejet.oracleOraclejetStrings.dateTimeRange
import typings.oracleOraclejet.oracleOraclejetStrings.datetime
import typings.oracleOraclejet.oracleOraclejetStrings.length
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.numberRange
import typings.oracleOraclejet.oracleOraclejetStrings.regexp
import typings.oracleOraclejet.oracleOraclejetStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validation {
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def converterFactory[CF /* <: ConverterFactory[Any] */](`type`: number | color | datetime): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory[CF /* <: ConverterFactory[Any] */](`type`: number | color | datetime, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  inline def converterFactory[CF /* <: ConverterFactory[Any] */](`type`: String): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory[CF /* <: ConverterFactory[Any] */](`type`: String, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  
  inline def validatorFactory[VF /* <: ValidatorFactory[Any] */](`type`: required | regexp | numberRange | length | dateTimeRange | dateRestriction): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory[VF /* <: ValidatorFactory[Any] */](`type`: required | regexp | numberRange | length | dateTimeRange | dateRestriction, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  inline def validatorFactory[VF /* <: ValidatorFactory[Any] */](`type`: String): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory[VF /* <: ValidatorFactory[Any] */](`type`: String, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredConverter extends StObject {
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var `type`: String
  }
  object RegisteredConverter {
    
    inline def apply(`type`: String): RegisteredConverter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredConverter]
    }
    
    extension [Self <: RegisteredConverter](x: Self) {
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredValidator extends StObject {
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var `type`: String
  }
  object RegisteredValidator {
    
    inline def apply(`type`: String): RegisteredValidator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredValidator]
    }
    
    extension [Self <: RegisteredValidator](x: Self) {
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
