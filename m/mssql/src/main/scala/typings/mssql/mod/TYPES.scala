package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TYPES {
  
  @JSImport("mssql", "TYPES")
  @js.native
  val ^ : js.Any = js.native
  
  inline def BigInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.BigInt")
  @js.native
  def BigInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def BigInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigInt")(x.asInstanceOf[js.Any])
  
  inline def Binary(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Binary")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Binary")
  @js.native
  def Binary_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Binary_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  inline def Bit(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Bit")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Bit")
  @js.native
  def Bit_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Bit_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bit")(x.asInstanceOf[js.Any])
  
  inline def Char(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("Char")().asInstanceOf[ISqlTypeWithLength]
  inline def Char(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("Char")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
  @JSImport("mssql", "TYPES.Char")
  @js.native
  def Char_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  inline def Char_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Char")(x.asInstanceOf[js.Any])
  
  inline def Date(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")().asInstanceOf[ISqlTypeWithNoParams]
  
  inline def DateTime(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime")().asInstanceOf[ISqlTypeWithNoParams]
  
  inline def DateTime2(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime2")().asInstanceOf[ISqlTypeWithScale]
  inline def DateTime2(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime2")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
  @JSImport("mssql", "TYPES.DateTime2")
  @js.native
  def DateTime2_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  inline def DateTime2_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime2")(x.asInstanceOf[js.Any])
  
  inline def DateTimeOffset(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTimeOffset")().asInstanceOf[ISqlTypeWithScale]
  inline def DateTimeOffset(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTimeOffset")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
  @JSImport("mssql", "TYPES.DateTimeOffset")
  @js.native
  def DateTimeOffset_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  inline def DateTimeOffset_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOffset")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.DateTime")
  @js.native
  def DateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def DateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Date")
  @js.native
  def Date_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Date_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  inline def Decimal(): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")().asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Decimal(precision: Double): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Decimal(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Decimal(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
  
  inline def Decimal_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
  
  inline def Float(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Float")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Float")
  @js.native
  def Float_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Float_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
  
  inline def Geography(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Geography")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Geography")
  @js.native
  def Geography_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Geography_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geography")(x.asInstanceOf[js.Any])
  
  inline def Geometry(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Geometry")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Geometry")
  @js.native
  def Geometry_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Geometry_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(x.asInstanceOf[js.Any])
  
  inline def Image(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Image")
  @js.native
  def Image_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Image_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  inline def Int(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Int")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Int")
  @js.native
  def Int_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Int_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int")(x.asInstanceOf[js.Any])
  
  inline def Money(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Money")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Money")
  @js.native
  def Money_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Money_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Money")(x.asInstanceOf[js.Any])
  
  inline def NChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NChar")().asInstanceOf[ISqlTypeWithLength]
  inline def NChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
  @JSImport("mssql", "TYPES.NChar")
  @js.native
  def NChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  inline def NChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NChar")(x.asInstanceOf[js.Any])
  
  inline def NText(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("NText")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.NText")
  @js.native
  def NText_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def NText_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NText")(x.asInstanceOf[js.Any])
  
  inline def NVarChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NVarChar")().asInstanceOf[ISqlTypeWithLength]
  inline def NVarChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NVarChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
  @JSImport("mssql", "TYPES.NVarChar")
  @js.native
  def NVarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  inline def NVarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NVarChar")(x.asInstanceOf[js.Any])
  
  inline def Numeric(): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")().asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Numeric(precision: Double): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Numeric(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
  inline def Numeric(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
  
  inline def Numeric_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(x.asInstanceOf[js.Any])
  
  inline def Real(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Real")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Real")
  @js.native
  def Real_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Real_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Real")(x.asInstanceOf[js.Any])
  
  inline def SmallDateTime(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallDateTime")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.SmallDateTime")
  @js.native
  def SmallDateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def SmallDateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallDateTime")(x.asInstanceOf[js.Any])
  
  inline def SmallInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallInt")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.SmallInt")
  @js.native
  def SmallInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def SmallInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallInt")(x.asInstanceOf[js.Any])
  
  inline def SmallMoney(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallMoney")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.SmallMoney")
  @js.native
  def SmallMoney_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def SmallMoney_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallMoney")(x.asInstanceOf[js.Any])
  
  inline def TVP(): ISqlTypeWithTvpType = ^.asInstanceOf[js.Dynamic].applyDynamic("TVP")().asInstanceOf[ISqlTypeWithTvpType]
  inline def TVP(tvpType: Any): ISqlTypeWithTvpType = ^.asInstanceOf[js.Dynamic].applyDynamic("TVP")(tvpType.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithTvpType]
  @JSImport("mssql", "TYPES.TVP")
  @js.native
  def TVP_FTYPES: ISqlTypeFactoryWithTvpType = js.native
  
  inline def TVP_FTYPES_=(x: ISqlTypeFactoryWithTvpType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TVP")(x.asInstanceOf[js.Any])
  
  inline def Text(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Text")
  @js.native
  def Text_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Text_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  inline def Time(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Time")().asInstanceOf[ISqlTypeWithScale]
  inline def Time(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Time")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
  @JSImport("mssql", "TYPES.Time")
  @js.native
  def Time_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  inline def Time_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
  
  inline def TinyInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("TinyInt")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.TinyInt")
  @js.native
  def TinyInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def TinyInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TinyInt")(x.asInstanceOf[js.Any])
  
  inline def UDT(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("UDT")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.UDT")
  @js.native
  def UDT_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def UDT_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UDT")(x.asInstanceOf[js.Any])
  
  inline def UniqueIdentifier(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueIdentifier")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.UniqueIdentifier")
  @js.native
  def UniqueIdentifier_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def UniqueIdentifier_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniqueIdentifier")(x.asInstanceOf[js.Any])
  
  inline def VarBinary(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarBinary")().asInstanceOf[ISqlTypeWithLength]
  inline def VarBinary(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarBinary")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
  @JSImport("mssql", "TYPES.VarBinary")
  @js.native
  def VarBinary_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  inline def VarBinary_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarBinary")(x.asInstanceOf[js.Any])
  
  inline def VarChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarChar")().asInstanceOf[ISqlTypeWithLength]
  inline def VarChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
  @JSImport("mssql", "TYPES.VarChar")
  @js.native
  def VarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  inline def VarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarChar")(x.asInstanceOf[js.Any])
  
  inline def Variant(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Variant")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Variant")
  @js.native
  def Variant_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Variant_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variant")(x.asInstanceOf[js.Any])
  
  inline def Xml(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Xml")().asInstanceOf[ISqlTypeWithNoParams]
  @JSImport("mssql", "TYPES.Xml")
  @js.native
  def Xml_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  inline def Xml_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
