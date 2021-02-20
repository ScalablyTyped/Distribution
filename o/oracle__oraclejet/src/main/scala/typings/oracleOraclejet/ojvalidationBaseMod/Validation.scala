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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validation {
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory[CF /* <: ConverterFactory[_] */](`type`: String): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory[CF /* <: ConverterFactory[_] */](`type`: String, instance: CF): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_color[CF /* <: ConverterFactory[_] */](`type`: color): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_color[CF /* <: ConverterFactory[_] */](`type`: color, instance: CF): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_datetime[CF /* <: ConverterFactory[_] */](`type`: datetime): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_datetime[CF /* <: ConverterFactory[_] */](`type`: datetime, instance: CF): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_number[CF /* <: ConverterFactory[_] */](`type`: number): CF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.converterFactory")
  @js.native
  def converterFactory_number[CF /* <: ConverterFactory[_] */](`type`: number, instance: CF): CF | Null = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory[VF /* <: ValidatorFactory[_] */](`type`: String): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory[VF /* <: ValidatorFactory[_] */](`type`: String, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[_] */](`type`: dateRestriction): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[_] */](`type`: dateRestriction, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[_] */](`type`: dateTimeRange): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[_] */](`type`: dateTimeRange, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_length[VF /* <: ValidatorFactory[_] */](`type`: length): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_length[VF /* <: ValidatorFactory[_] */](`type`: length, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_numberRange[VF /* <: ValidatorFactory[_] */](`type`: numberRange): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_numberRange[VF /* <: ValidatorFactory[_] */](`type`: numberRange, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_regexp[VF /* <: ValidatorFactory[_] */](`type`: regexp): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_regexp[VF /* <: ValidatorFactory[_] */](`type`: regexp, instance: VF): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_required[VF /* <: ValidatorFactory[_] */](`type`: required): VF | Null = js.native
  @JSImport("@oracle/oraclejet/ojvalidation-base", "Validation.validatorFactory")
  @js.native
  def validatorFactory_required[VF /* <: ValidatorFactory[_] */](`type`: required, instance: VF): VF | Null = js.native
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RegisteredConverter extends StObject {
    
    var options: js.UndefOr[js.Object] = js.native
    
    var `type`: String = js.native
  }
  object RegisteredConverter {
    
    @scala.inline
    def apply(`type`: String): RegisteredConverter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredConverter]
    }
    
    @scala.inline
    implicit class RegisteredConverterMutableBuilder[Self <: RegisteredConverter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait RegisteredValidator extends StObject {
    
    var options: js.UndefOr[js.Object] = js.native
    
    var `type`: String = js.native
  }
  object RegisteredValidator {
    
    @scala.inline
    def apply(`type`: String): RegisteredValidator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredValidator]
    }
    
    @scala.inline
    implicit class RegisteredValidatorMutableBuilder[Self <: RegisteredValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
