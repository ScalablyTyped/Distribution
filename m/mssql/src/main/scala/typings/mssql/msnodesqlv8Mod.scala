package typings.mssql

import typings.mssql.mod.IIsolationLevel
import typings.mssql.mod.IMap
import typings.mssql.mod.IPool
import typings.mssql.mod.ISqlTypeFactoryWithLength
import typings.mssql.mod.ISqlTypeFactoryWithNoParams
import typings.mssql.mod.ISqlTypeFactoryWithPrecisionScale
import typings.mssql.mod.ISqlTypeFactoryWithScale
import typings.mssql.mod.ISqlTypeFactoryWithTvpType
import typings.mssql.mod.ISqlTypeWithLength
import typings.mssql.mod.ISqlTypeWithNoParams
import typings.mssql.mod.ISqlTypeWithPrecisionScale
import typings.mssql.mod.ISqlTypeWithScale
import typings.mssql.mod.ISqlTypeWithTvpType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msnodesqlv8Mod {
  
  @JSImport("mssql/msnodesqlv8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mssql/msnodesqlv8", "BigInt")
  @js.native
  def BigInt: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def BigInt_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Binary")
  @js.native
  def Binary: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Binary_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Bit")
  @js.native
  def Bit: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Bit_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bit")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Char")
  @js.native
  def Char: ISqlTypeFactoryWithLength = js.native
  @scala.inline
  def Char_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Char")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "ConnectionError")
  @js.native
  class ConnectionError protected ()
    extends typings.mssql.mod.ConnectionError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "ConnectionPool")
  @js.native
  class ConnectionPool protected ()
    extends typings.mssql.mod.ConnectionPool {
    def this(config: typings.mssql.mod.config) = this()
    def this(connectionString: String) = this()
    def this(config: typings.mssql.mod.config, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
    def this(connectionString: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "DRIVERS")
  @js.native
  def DRIVERS: js.Array[String] = js.native
  @scala.inline
  def DRIVERS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRIVERS")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Date")
  @js.native
  def Date: ISqlTypeFactoryWithNoParams = js.native
  
  @JSImport("mssql/msnodesqlv8", "DateTime")
  @js.native
  def DateTime: ISqlTypeFactoryWithNoParams = js.native
  
  @JSImport("mssql/msnodesqlv8", "DateTime2")
  @js.native
  def DateTime2: ISqlTypeFactoryWithScale = js.native
  @scala.inline
  def DateTime2_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime2")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "DateTimeOffset")
  @js.native
  def DateTimeOffset: ISqlTypeFactoryWithScale = js.native
  @scala.inline
  def DateTimeOffset_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOffset")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def DateTime_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def Date_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Decimal")
  @js.native
  def Decimal: ISqlTypeFactoryWithPrecisionScale = js.native
  @scala.inline
  def Decimal_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Float")
  @js.native
  def Float: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Float_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Geography")
  @js.native
  def Geography: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Geography_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geography")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Geometry")
  @js.native
  def Geometry: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Geometry_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(x.asInstanceOf[js.Any])
  
  object ISOLATION_LEVEL {
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL.READ_COMMITTED")
    @js.native
    def READ_COMMITTED: IIsolationLevel = js.native
    @scala.inline
    def READ_COMMITTED_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ_COMMITTED")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL.READ_UNCOMMITTED")
    @js.native
    def READ_UNCOMMITTED: IIsolationLevel = js.native
    @scala.inline
    def READ_UNCOMMITTED_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ_UNCOMMITTED")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL.REPEATABLE_READ")
    @js.native
    def REPEATABLE_READ: IIsolationLevel = js.native
    @scala.inline
    def REPEATABLE_READ_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPEATABLE_READ")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL.SERIALIZABLE")
    @js.native
    def SERIALIZABLE: IIsolationLevel = js.native
    @scala.inline
    def SERIALIZABLE_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERIALIZABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "ISOLATION_LEVEL.SNAPSHOT")
    @js.native
    def SNAPSHOT: IIsolationLevel = js.native
    @scala.inline
    def SNAPSHOT_=(x: IIsolationLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNAPSHOT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mssql/msnodesqlv8", "Image")
  @js.native
  def Image: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Image_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Int")
  @js.native
  def Int: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Int_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "MAX")
  @js.native
  def MAX: Double = js.native
  @scala.inline
  def MAX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Money")
  @js.native
  def Money: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Money_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Money")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "NChar")
  @js.native
  def NChar: ISqlTypeFactoryWithLength = js.native
  @scala.inline
  def NChar_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "NText")
  @js.native
  def NText: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def NText_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NText")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "NVarChar")
  @js.native
  def NVarChar: ISqlTypeFactoryWithLength = js.native
  @scala.inline
  def NVarChar_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NVarChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Numeric")
  @js.native
  def Numeric: ISqlTypeFactoryWithPrecisionScale = js.native
  @scala.inline
  def Numeric_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "PreparedStatement")
  @js.native
  class PreparedStatement ()
    extends typings.mssql.mod.PreparedStatement {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
    def this(transaction: typings.mssql.mod.Transaction) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "PreparedStatementError")
  @js.native
  class PreparedStatementError protected ()
    extends typings.mssql.mod.PreparedStatementError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "Promise")
  @js.native
  def Promise: js.Any = js.native
  @scala.inline
  def Promise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Real")
  @js.native
  def Real: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Real_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Real")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Request")
  @js.native
  class Request ()
    extends typings.mssql.mod.Request {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
    def this(preparedStatement: typings.mssql.mod.PreparedStatement) = this()
    def this(transaction: typings.mssql.mod.Transaction) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "RequestError")
  @js.native
  class RequestError protected ()
    extends typings.mssql.mod.RequestError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "SmallDateTime")
  @js.native
  def SmallDateTime: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def SmallDateTime_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallDateTime")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "SmallInt")
  @js.native
  def SmallInt: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def SmallInt_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "SmallMoney")
  @js.native
  def SmallMoney: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def SmallMoney_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallMoney")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "TVP")
  @js.native
  def TVP: ISqlTypeFactoryWithTvpType = js.native
  @scala.inline
  def TVP_=(x: ISqlTypeFactoryWithTvpType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TVP")(x.asInstanceOf[js.Any])
  
  object TYPES {
    
    @JSImport("mssql/msnodesqlv8", "TYPES")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def BigInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("BigInt")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.BigInt")
    @js.native
    def BigInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def BigInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigInt")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Binary(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Binary")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Binary")
    @js.native
    def Binary_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Binary_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Bit(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Bit")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Bit")
    @js.native
    def Bit_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Bit_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bit")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Char(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("Char")().asInstanceOf[ISqlTypeWithLength]
    @scala.inline
    def Char(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("Char")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
    @JSImport("mssql/msnodesqlv8", "TYPES.Char")
    @js.native
    def Char_FTYPES: ISqlTypeFactoryWithLength = js.native
    
    @scala.inline
    def Char_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Char")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Date(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Date")().asInstanceOf[ISqlTypeWithNoParams]
    
    @scala.inline
    def DateTime(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime")().asInstanceOf[ISqlTypeWithNoParams]
    
    @scala.inline
    def DateTime2(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime2")().asInstanceOf[ISqlTypeWithScale]
    @scala.inline
    def DateTime2(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTime2")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
    @JSImport("mssql/msnodesqlv8", "TYPES.DateTime2")
    @js.native
    def DateTime2_FTYPES: ISqlTypeFactoryWithScale = js.native
    
    @scala.inline
    def DateTime2_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DateTimeOffset(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTimeOffset")().asInstanceOf[ISqlTypeWithScale]
    @scala.inline
    def DateTimeOffset(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("DateTimeOffset")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
    @JSImport("mssql/msnodesqlv8", "TYPES.DateTimeOffset")
    @js.native
    def DateTimeOffset_FTYPES: ISqlTypeFactoryWithScale = js.native
    
    @scala.inline
    def DateTimeOffset_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTimeOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "TYPES.DateTime")
    @js.native
    def DateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def DateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    @JSImport("mssql/msnodesqlv8", "TYPES.Date")
    @js.native
    def Date_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Date_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Decimal(): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")().asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Decimal(precision: Double): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Decimal(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Decimal(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Decimal")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
    @JSImport("mssql/msnodesqlv8", "TYPES.Decimal")
    @js.native
    def Decimal_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
    
    @scala.inline
    def Decimal_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Float(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Float")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Float")
    @js.native
    def Float_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Float_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Geography(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Geography")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Geography")
    @js.native
    def Geography_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Geography_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geography")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Geometry(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Geometry")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Geometry")
    @js.native
    def Geometry_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Geometry_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Image(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Image")
    @js.native
    def Image_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Image_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Int(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Int")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Int")
    @js.native
    def Int_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Int_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Money(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Money")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Money")
    @js.native
    def Money_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Money_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Money")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NChar")().asInstanceOf[ISqlTypeWithLength]
    @scala.inline
    def NChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
    @JSImport("mssql/msnodesqlv8", "TYPES.NChar")
    @js.native
    def NChar_FTYPES: ISqlTypeFactoryWithLength = js.native
    
    @scala.inline
    def NChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NChar")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NText(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("NText")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.NText")
    @js.native
    def NText_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def NText_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NVarChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NVarChar")().asInstanceOf[ISqlTypeWithLength]
    @scala.inline
    def NVarChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("NVarChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
    @JSImport("mssql/msnodesqlv8", "TYPES.NVarChar")
    @js.native
    def NVarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
    
    @scala.inline
    def NVarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NVarChar")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Numeric(): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")().asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Numeric(precision: Double): ISqlTypeWithPrecisionScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Numeric(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
    @scala.inline
    def Numeric(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale = (^.asInstanceOf[js.Dynamic].applyDynamic("Numeric")(precision.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[ISqlTypeWithPrecisionScale]
    @JSImport("mssql/msnodesqlv8", "TYPES.Numeric")
    @js.native
    def Numeric_FTYPES: ISqlTypeFactoryWithPrecisionScale = js.native
    
    @scala.inline
    def Numeric_FTYPES_=(x: ISqlTypeFactoryWithPrecisionScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numeric")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Real(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Real")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Real")
    @js.native
    def Real_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Real_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Real")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SmallDateTime(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallDateTime")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.SmallDateTime")
    @js.native
    def SmallDateTime_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def SmallDateTime_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallDateTime")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SmallInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallInt")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.SmallInt")
    @js.native
    def SmallInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def SmallInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallInt")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SmallMoney(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("SmallMoney")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.SmallMoney")
    @js.native
    def SmallMoney_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def SmallMoney_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SmallMoney")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TVP(): ISqlTypeWithTvpType = ^.asInstanceOf[js.Dynamic].applyDynamic("TVP")().asInstanceOf[ISqlTypeWithTvpType]
    @scala.inline
    def TVP(tvpType: js.Any): ISqlTypeWithTvpType = ^.asInstanceOf[js.Dynamic].applyDynamic("TVP")(tvpType.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithTvpType]
    @JSImport("mssql/msnodesqlv8", "TYPES.TVP")
    @js.native
    def TVP_FTYPES: ISqlTypeFactoryWithTvpType = js.native
    
    @scala.inline
    def TVP_FTYPES_=(x: ISqlTypeFactoryWithTvpType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TVP")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Text(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Text")
    @js.native
    def Text_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Text_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Time(): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Time")().asInstanceOf[ISqlTypeWithScale]
    @scala.inline
    def Time(scale: Double): ISqlTypeWithScale = ^.asInstanceOf[js.Dynamic].applyDynamic("Time")(scale.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithScale]
    @JSImport("mssql/msnodesqlv8", "TYPES.Time")
    @js.native
    def Time_FTYPES: ISqlTypeFactoryWithScale = js.native
    
    @scala.inline
    def Time_FTYPES_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TinyInt(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("TinyInt")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.TinyInt")
    @js.native
    def TinyInt_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def TinyInt_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TinyInt")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def UDT(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("UDT")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.UDT")
    @js.native
    def UDT_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def UDT_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UDT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def UniqueIdentifier(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueIdentifier")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.UniqueIdentifier")
    @js.native
    def UniqueIdentifier_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def UniqueIdentifier_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniqueIdentifier")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VarBinary(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarBinary")().asInstanceOf[ISqlTypeWithLength]
    @scala.inline
    def VarBinary(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarBinary")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
    @JSImport("mssql/msnodesqlv8", "TYPES.VarBinary")
    @js.native
    def VarBinary_FTYPES: ISqlTypeFactoryWithLength = js.native
    
    @scala.inline
    def VarBinary_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def VarChar(): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarChar")().asInstanceOf[ISqlTypeWithLength]
    @scala.inline
    def VarChar(length: Double): ISqlTypeWithLength = ^.asInstanceOf[js.Dynamic].applyDynamic("VarChar")(length.asInstanceOf[js.Any]).asInstanceOf[ISqlTypeWithLength]
    @JSImport("mssql/msnodesqlv8", "TYPES.VarChar")
    @js.native
    def VarChar_FTYPES: ISqlTypeFactoryWithLength = js.native
    
    @scala.inline
    def VarChar_FTYPES_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarChar")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Variant(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Variant")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Variant")
    @js.native
    def Variant_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Variant_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variant")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Xml(): ISqlTypeWithNoParams = ^.asInstanceOf[js.Dynamic].applyDynamic("Xml")().asInstanceOf[ISqlTypeWithNoParams]
    @JSImport("mssql/msnodesqlv8", "TYPES.Xml")
    @js.native
    def Xml_FTYPES: ISqlTypeFactoryWithNoParams = js.native
    
    @scala.inline
    def Xml_FTYPES_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mssql/msnodesqlv8", "Table")
  @js.native
  class Table ()
    extends typings.mssql.mod.Table {
    def this(tableName: String) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "Text")
  @js.native
  def Text: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Text_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Time")
  @js.native
  def Time: ISqlTypeFactoryWithScale = js.native
  @scala.inline
  def Time_=(x: ISqlTypeFactoryWithScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "TinyInt")
  @js.native
  def TinyInt: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def TinyInt_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TinyInt")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Transaction")
  @js.native
  class Transaction ()
    extends typings.mssql.mod.Transaction {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "TransactionError")
  @js.native
  class TransactionError protected ()
    extends typings.mssql.mod.TransactionError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @JSImport("mssql/msnodesqlv8", "UDT")
  @js.native
  def UDT: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def UDT_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UDT")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "UniqueIdentifier")
  @js.native
  def UniqueIdentifier: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def UniqueIdentifier_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniqueIdentifier")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "VarBinary")
  @js.native
  def VarBinary: ISqlTypeFactoryWithLength = js.native
  @scala.inline
  def VarBinary_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarBinary")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "VarChar")
  @js.native
  def VarChar: ISqlTypeFactoryWithLength = js.native
  @scala.inline
  def VarChar_=(x: ISqlTypeFactoryWithLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VarChar")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Variant")
  @js.native
  def Variant: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Variant_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variant")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "Xml")
  @js.native
  def Xml: ISqlTypeFactoryWithNoParams = js.native
  @scala.inline
  def Xml_=(x: ISqlTypeFactoryWithNoParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "fix")
  @js.native
  def fix: Boolean = js.native
  @scala.inline
  def fix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fix")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "map")
  @js.native
  def map: IMap = js.native
  @scala.inline
  def map_=(x: IMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
  
  @JSImport("mssql/msnodesqlv8", "pool")
  @js.native
  def pool: IPool = js.native
  @scala.inline
  def pool_=(x: IPool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pool")(x.asInstanceOf[js.Any])
}
