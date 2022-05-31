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
  
  inline def converterFactory[CF /* <: ConverterFactory[js.Any] */](`type`: String): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory[CF /* <: ConverterFactory[js.Any] */](`type`: String, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  
  inline def converterFactory_color[CF /* <: ConverterFactory[js.Any] */](`type`: color): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory_color[CF /* <: ConverterFactory[js.Any] */](`type`: color, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  
  inline def converterFactory_datetime[CF /* <: ConverterFactory[js.Any] */](`type`: datetime): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory_datetime[CF /* <: ConverterFactory[js.Any] */](`type`: datetime, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  
  inline def converterFactory_number[CF /* <: ConverterFactory[js.Any] */](`type`: number): CF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CF | Null]
  inline def converterFactory_number[CF /* <: ConverterFactory[js.Any] */](`type`: number, instance: CF): CF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("converterFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[CF | Null]
  
  inline def validatorFactory[VF /* <: ValidatorFactory[js.Any] */](`type`: String): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory[VF /* <: ValidatorFactory[js.Any] */](`type`: String, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[js.Any] */](`type`: dateRestriction): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[js.Any] */](`type`: dateRestriction, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[js.Any] */](`type`: dateTimeRange): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[js.Any] */](`type`: dateTimeRange, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_length[VF /* <: ValidatorFactory[js.Any] */](`type`: length): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_length[VF /* <: ValidatorFactory[js.Any] */](`type`: length, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_numberRange[VF /* <: ValidatorFactory[js.Any] */](`type`: numberRange): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_numberRange[VF /* <: ValidatorFactory[js.Any] */](`type`: numberRange, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_regexp[VF /* <: ValidatorFactory[js.Any] */](`type`: regexp): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_regexp[VF /* <: ValidatorFactory[js.Any] */](`type`: regexp, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
  inline def validatorFactory_required[VF /* <: ValidatorFactory[js.Any] */](`type`: required): VF | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[VF | Null]
  inline def validatorFactory_required[VF /* <: ValidatorFactory[js.Any] */](`type`: required, instance: VF): VF | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validatorFactory")(`type`.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[VF | Null]
  
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
