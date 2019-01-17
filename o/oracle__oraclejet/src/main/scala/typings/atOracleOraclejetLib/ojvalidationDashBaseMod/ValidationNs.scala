package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "Validation")
@js.native
object ValidationNs extends js.Object {
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredConverter extends js.Object {
    var options: js.UndefOr[js.Object] = js.undefined
    var `type`: java.lang.String
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait RegisteredValidator extends js.Object {
    var options: js.UndefOr[js.Object] = js.undefined
    var `type`: java.lang.String
  }
  
  def converterFactory[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: java.lang.String): CF | scala.Null = js.native
  def converterFactory[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: java.lang.String, instance: CF): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_color[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.color): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_color[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.color, instance: CF): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_datetime[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.datetime): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_datetime[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.datetime, instance: CF): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_number[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.number): CF | scala.Null = js.native
  @JSName("converterFactory")
  def converterFactory_number[CF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ConverterFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.number, instance: CF): CF | scala.Null = js.native
  def validatorFactory[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: java.lang.String): VF | scala.Null = js.native
  def validatorFactory[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: java.lang.String, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateRestriction[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateRestriction): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateRestriction[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateRestriction, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateTimeRange[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateTimeRange): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_dateTimeRange[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.dateTimeRange, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_length[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.length): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_length[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.length, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_numberRange[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.numberRange): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_numberRange[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.numberRange, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_regexp[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.regexp): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_regexp[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.regexp, instance: VF): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_required[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.required): VF | scala.Null = js.native
  @JSName("validatorFactory")
  def validatorFactory_required[VF /* <: atOracleOraclejetLib.ojvalidationDashBaseMod.ValidatorFactory[_] */](`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.required, instance: VF): VF | scala.Null = js.native
}

