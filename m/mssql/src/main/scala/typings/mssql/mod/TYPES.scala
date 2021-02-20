package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TYPES {
  
  @JSImport("mssql", "TYPES")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mssql", "TYPES.BigInt")
  @js.native
  def BigInt(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.BigInt")
  @js.native
  def BigInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def BigInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Binary")
  @js.native
  def Binary(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Binary")
  @js.native
  def Binary_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Binary_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Bit")
  @js.native
  def Bit(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Bit")
  @js.native
  def Bit_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Bit_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bit")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Char")
  @js.native
  def Char(): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.Char")
  @js.native
  def Char(length: Double): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.Char")
  @js.native
  def Char_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  @scala.inline
  def Char_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Char")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Date")
  @js.native
  def Date(): ISqlTypeWithNoParams = js.native
  
  @JSImport("mssql", "TYPES.DateTime")
  @js.native
  def DateTime(): ISqlTypeWithNoParams = js.native
  
  @JSImport("mssql", "TYPES.DateTime2")
  @js.native
  def DateTime2(): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.DateTime2")
  @js.native
  def DateTime2(scale: Double): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.DateTime2")
  @js.native
  def DateTime2_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  @scala.inline
  def DateTime2_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime2")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.DateTimeOffset")
  @js.native
  def DateTimeOffset(): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.DateTimeOffset")
  @js.native
  def DateTimeOffset(scale: Double): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.DateTimeOffset")
  @js.native
  def DateTimeOffset_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  @scala.inline
  def DateTimeOffset_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOffset")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.DateTime")
  @js.native
  def DateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def DateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Date")
  @js.native
  def Date_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Date_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal(): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal(precision: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Decimal")
  @js.native
  def Decimal_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
  
  @scala.inline
  def Decimal_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Float")
  @js.native
  def Float(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Float")
  @js.native
  def Float_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Float_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Geography")
  @js.native
  def Geography(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Geography")
  @js.native
  def Geography_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Geography_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geography")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Geometry")
  @js.native
  def Geometry(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Geometry")
  @js.native
  def Geometry_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Geometry_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Image")
  @js.native
  def Image(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Image")
  @js.native
  def Image_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Image_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Int")
  @js.native
  def Int(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Int")
  @js.native
  def Int_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Int_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Money")
  @js.native
  def Money(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Money")
  @js.native
  def Money_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Money_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Money")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.NChar")
  @js.native
  def NChar(): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.NChar")
  @js.native
  def NChar(length: Double): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.NChar")
  @js.native
  def NChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  @scala.inline
  def NChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.NText")
  @js.native
  def NText(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.NText")
  @js.native
  def NText_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def NText_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NText")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.NVarChar")
  @js.native
  def NVarChar(): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.NVarChar")
  @js.native
  def NVarChar(length: Double): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.NVarChar")
  @js.native
  def NVarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  @scala.inline
  def NVarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NVarChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric(): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric(precision: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
  @JSImport("mssql", "TYPES.Numeric")
  @js.native
  def Numeric_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
  
  @scala.inline
  def Numeric_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Real")
  @js.native
  def Real(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Real")
  @js.native
  def Real_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Real_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Real")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.SmallDateTime")
  @js.native
  def SmallDateTime(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.SmallDateTime")
  @js.native
  def SmallDateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def SmallDateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallDateTime")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.SmallInt")
  @js.native
  def SmallInt(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.SmallInt")
  @js.native
  def SmallInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def SmallInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.SmallMoney")
  @js.native
  def SmallMoney(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.SmallMoney")
  @js.native
  def SmallMoney_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def SmallMoney_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallMoney")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.TVP")
  @js.native
  def TVP(): ISqlTypeWithTvpType = js.native
  @JSImport("mssql", "TYPES.TVP")
  @js.native
  def TVP(tvpType: js.Any): ISqlTypeWithTvpType = js.native
  @JSImport("mssql", "TYPES.TVP")
  @js.native
  def TVP_FTYPES: ISqlTypeFactoryWithTvpType = js.native
  
  @scala.inline
  def TVP_FTYPES_=(x: ISqlTypeFactoryWithTvpType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TVP")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Text")
  @js.native
  def Text(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Text")
  @js.native
  def Text_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Text_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Time")
  @js.native
  def Time(): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.Time")
  @js.native
  def Time(scale: Double): ISqlTypeWithScale = js.native
  @JSImport("mssql", "TYPES.Time")
  @js.native
  def Time_FTYPES: ISqlTypeFactoryWithScale = js.native
  
  @scala.inline
  def Time_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.TinyInt")
  @js.native
  def TinyInt(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.TinyInt")
  @js.native
  def TinyInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def TinyInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TinyInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.UDT")
  @js.native
  def UDT(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.UDT")
  @js.native
  def UDT_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def UDT_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UDT")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.UniqueIdentifier")
  @js.native
  def UniqueIdentifier(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.UniqueIdentifier")
  @js.native
  def UniqueIdentifier_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def UniqueIdentifier_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniqueIdentifier")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.VarBinary")
  @js.native
  def VarBinary(): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.VarBinary")
  @js.native
  def VarBinary(length: Double): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.VarBinary")
  @js.native
  def VarBinary_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  @scala.inline
  def VarBinary_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarBinary")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.VarChar")
  @js.native
  def VarChar(): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.VarChar")
  @js.native
  def VarChar(length: Double): ISqlTypeWithLength = js.native
  @JSImport("mssql", "TYPES.VarChar")
  @js.native
  def VarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
  
  @scala.inline
  def VarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Variant")
  @js.native
  def Variant(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Variant")
  @js.native
  def Variant_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Variant_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variant")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql", "TYPES.Xml")
  @js.native
  def Xml(): ISqlTypeWithNoParams = js.native
  @JSImport("mssql", "TYPES.Xml")
  @js.native
  def Xml_FTYPES: ISqlTypeFactoryWithNoParams = js.native
  
  @scala.inline
  def Xml_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
