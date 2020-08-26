package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "TYPES")
@js.native
object TYPES extends js.Object {
  @JSName("BigInt")
  var BigInt_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Binary")
  var Binary_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Bit")
  var Bit_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Char")
  var Char_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("DateTime2")
  var DateTime2_Original: ISqlTypeFactoryWithScale = js.native
  @JSName("DateTimeOffset")
  var DateTimeOffset_Original: ISqlTypeFactoryWithScale = js.native
  @JSName("DateTime")
  var DateTime_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Date")
  var Date_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Decimal")
  var Decimal_Original: ISqlTypeFactoryWithPrecisionScale = js.native
  @JSName("Float")
  var Float_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Geography")
  var Geography_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Geometry")
  var Geometry_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Image")
  var Image_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Int")
  var Int_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Money")
  var Money_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("NChar")
  var NChar_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("NText")
  var NText_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("NVarChar")
  var NVarChar_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("Numeric")
  var Numeric_Original: ISqlTypeFactoryWithPrecisionScale = js.native
  @JSName("Real")
  var Real_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallDateTime")
  var SmallDateTime_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallInt")
  var SmallInt_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallMoney")
  var SmallMoney_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("TVP")
  var TVP_Original: ISqlTypeFactoryWithTvpType = js.native
  @JSName("Text")
  var Text_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Time")
  var Time_Original: ISqlTypeFactoryWithScale = js.native
  @JSName("TinyInt")
  var TinyInt_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("UDT")
  var UDT_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("UniqueIdentifier")
  var UniqueIdentifier_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("VarBinary")
  var VarBinary_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("VarChar")
  var VarChar_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("Variant")
  var Variant_Original: ISqlTypeFactoryWithNoParams = js.native
  @JSName("Xml")
  var Xml_Original: ISqlTypeFactoryWithNoParams = js.native
  def BigInt(): ISqlTypeWithNoParams = js.native
  def Binary(): ISqlTypeWithNoParams = js.native
  def Bit(): ISqlTypeWithNoParams = js.native
  def Char(): ISqlTypeWithLength = js.native
  def Char(length: Double): ISqlTypeWithLength = js.native
  def Date(): ISqlTypeWithNoParams = js.native
  def DateTime(): ISqlTypeWithNoParams = js.native
  def DateTime2(): ISqlTypeWithScale = js.native
  def DateTime2(scale: Double): ISqlTypeWithScale = js.native
  def DateTimeOffset(): ISqlTypeWithScale = js.native
  def DateTimeOffset(scale: Double): ISqlTypeWithScale = js.native
  def Decimal(): ISqlTypeWithPrecisionScale = js.native
  def Decimal(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  def Decimal(precision: Double): ISqlTypeWithPrecisionScale = js.native
  def Decimal(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  def Float(): ISqlTypeWithNoParams = js.native
  def Geography(): ISqlTypeWithNoParams = js.native
  def Geometry(): ISqlTypeWithNoParams = js.native
  def Image(): ISqlTypeWithNoParams = js.native
  def Int(): ISqlTypeWithNoParams = js.native
  def Money(): ISqlTypeWithNoParams = js.native
  def NChar(): ISqlTypeWithLength = js.native
  def NChar(length: Double): ISqlTypeWithLength = js.native
  def NText(): ISqlTypeWithNoParams = js.native
  def NVarChar(): ISqlTypeWithLength = js.native
  def NVarChar(length: Double): ISqlTypeWithLength = js.native
  def Numeric(): ISqlTypeWithPrecisionScale = js.native
  def Numeric(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  def Numeric(precision: Double): ISqlTypeWithPrecisionScale = js.native
  def Numeric(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  def Real(): ISqlTypeWithNoParams = js.native
  def SmallDateTime(): ISqlTypeWithNoParams = js.native
  def SmallInt(): ISqlTypeWithNoParams = js.native
  def SmallMoney(): ISqlTypeWithNoParams = js.native
  def TVP(): ISqlTypeWithTvpType = js.native
  def TVP(tvpType: js.Any): ISqlTypeWithTvpType = js.native
  def Text(): ISqlTypeWithNoParams = js.native
  def Time(): ISqlTypeWithScale = js.native
  def Time(scale: Double): ISqlTypeWithScale = js.native
  def TinyInt(): ISqlTypeWithNoParams = js.native
  def UDT(): ISqlTypeWithNoParams = js.native
  def UniqueIdentifier(): ISqlTypeWithNoParams = js.native
  def VarBinary(): ISqlTypeWithLength = js.native
  def VarBinary(length: Double): ISqlTypeWithLength = js.native
  def VarChar(): ISqlTypeWithLength = js.native
  def VarChar(length: Double): ISqlTypeWithLength = js.native
  def Variant(): ISqlTypeWithNoParams = js.native
  def Xml(): ISqlTypeWithNoParams = js.native
}

