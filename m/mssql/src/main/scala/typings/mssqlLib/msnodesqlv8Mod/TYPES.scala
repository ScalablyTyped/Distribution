package typings
package mssqlLib.msnodesqlv8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql/msnodesqlv8", "TYPES")
@js.native
object TYPES extends js.Object {
  @JSName("BigInt")
  var BigInt_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Binary")
  var Binary_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Bit")
  var Bit_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Char")
  var Char_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithLength = js.native
  @JSName("DateTime2")
  var DateTime2_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithScale = js.native
  @JSName("DateTimeOffset")
  var DateTimeOffset_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithScale = js.native
  @JSName("DateTime")
  var DateTime_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Date")
  var Date_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Decimal")
  var Decimal_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithPrecisionScale = js.native
  @JSName("Float")
  var Float_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Geography")
  var Geography_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Geometry")
  var Geometry_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Image")
  var Image_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Int")
  var Int_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Money")
  var Money_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("NChar")
  var NChar_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithLength = js.native
  @JSName("NText")
  var NText_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("NVarChar")
  var NVarChar_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithLength = js.native
  @JSName("Numeric")
  var Numeric_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithPrecisionScale = js.native
  @JSName("Real")
  var Real_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallDateTime")
  var SmallDateTime_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallInt")
  var SmallInt_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("SmallMoney")
  var SmallMoney_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("TVP")
  var TVP_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithTvpType = js.native
  @JSName("Text")
  var Text_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Time")
  var Time_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithScale = js.native
  @JSName("TinyInt")
  var TinyInt_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("UDT")
  var UDT_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("UniqueIdentifier")
  var UniqueIdentifier_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("VarBinary")
  var VarBinary_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithLength = js.native
  @JSName("VarChar")
  var VarChar_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithLength = js.native
  @JSName("Variant")
  var Variant_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  @JSName("Xml")
  var Xml_Original: mssqlLib.mssqlMod.ISqlTypeFactoryWithNoParams = js.native
  def BigInt(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Binary(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Bit(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Char(): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def Char(length: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def Date(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def DateTime(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def DateTime2(): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def DateTime2(scale: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def DateTimeOffset(): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def DateTimeOffset(scale: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def Decimal(): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Decimal(precision: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Decimal(precision: scala.Double, scale: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Float(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Geography(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Geometry(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Image(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Int(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Money(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def NChar(): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def NChar(length: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def NText(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def NVarChar(): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def NVarChar(length: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def Numeric(): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Numeric(precision: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Numeric(precision: scala.Double, scale: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithPrecisionScale = js.native
  def Real(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def SmallDateTime(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def SmallInt(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def SmallMoney(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def TVP(tvpType: js.Any): mssqlLib.mssqlMod.ISqlTypeWithTvpType = js.native
  def Text(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Time(): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def Time(scale: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithScale = js.native
  def TinyInt(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def UDT(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def UniqueIdentifier(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def VarBinary(): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def VarBinary(length: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def VarChar(): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def VarChar(length: scala.Double): mssqlLib.mssqlMod.ISqlTypeWithLength = js.native
  def Variant(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
  def Xml(): mssqlLib.mssqlMod.ISqlTypeWithNoParams = js.native
}

