package typings.atOracleOraclejet.ojvalidationDashBaseMod

import typings.atOracleOraclejet.atOracleOraclejetStrings.color
import typings.atOracleOraclejet.atOracleOraclejetStrings.dateRestriction
import typings.atOracleOraclejet.atOracleOraclejetStrings.dateTimeRange
import typings.atOracleOraclejet.atOracleOraclejetStrings.datetime
import typings.atOracleOraclejet.atOracleOraclejetStrings.length
import typings.atOracleOraclejet.atOracleOraclejetStrings.number
import typings.atOracleOraclejet.atOracleOraclejetStrings.numberRange
import typings.atOracleOraclejet.atOracleOraclejetStrings.regexp
import typings.atOracleOraclejet.atOracleOraclejetStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "Validation")
@js.native
object ValidationNs extends js.Object {
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredConverter extends js.Object {
    var options: js.UndefOr[js.Object] = js.undefined
    var `type`: String
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredValidator extends js.Object {
    var options: js.UndefOr[js.Object] = js.undefined
    var `type`: String
  }
  
  def converterFactory[CF /* <: ConverterFactory[_] */](`type`: String): CF | Null = js.native
  def converterFactory[CF /* <: ConverterFactory[_] */](`type`: String, instance: CF): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_color[CF /* <: ConverterFactory[_] */](`type`: color): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_color[CF /* <: ConverterFactory[_] */](`type`: color, instance: CF): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_datetime[CF /* <: ConverterFactory[_] */](`type`: datetime): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_datetime[CF /* <: ConverterFactory[_] */](`type`: datetime, instance: CF): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_number[CF /* <: ConverterFactory[_] */](`type`: number): CF | Null = js.native
  @JSName("converterFactory")
  def converterFactory_number[CF /* <: ConverterFactory[_] */](`type`: number, instance: CF): CF | Null = js.native
  def validatorFactory[VF /* <: ValidatorFactory[_] */](`type`: String): VF | Null = js.native
  def validatorFactory[VF /* <: ValidatorFactory[_] */](`type`: String, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[_] */](`type`: dateRestriction): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateRestriction[VF /* <: ValidatorFactory[_] */](`type`: dateRestriction, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[_] */](`type`: dateTimeRange): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateTimeRange[VF /* <: ValidatorFactory[_] */](`type`: dateTimeRange, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_length[VF /* <: ValidatorFactory[_] */](`type`: length): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_length[VF /* <: ValidatorFactory[_] */](`type`: length, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_numberRange[VF /* <: ValidatorFactory[_] */](`type`: numberRange): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_numberRange[VF /* <: ValidatorFactory[_] */](`type`: numberRange, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_regexp[VF /* <: ValidatorFactory[_] */](`type`: regexp): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_regexp[VF /* <: ValidatorFactory[_] */](`type`: regexp, instance: VF): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_required[VF /* <: ValidatorFactory[_] */](`type`: required): VF | Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_required[VF /* <: ValidatorFactory[_] */](`type`: required, instance: VF): VF | Null = js.native
}

