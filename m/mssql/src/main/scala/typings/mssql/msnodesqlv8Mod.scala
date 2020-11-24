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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql/msnodesqlv8", JSImport.Namespace)
@js.native
object msnodesqlv8Mod extends js.Object {
  
  var BigInt: ISqlTypeFactoryWithNoParams = js.native
  
  var Binary: ISqlTypeFactoryWithNoParams = js.native
  
  var Bit: ISqlTypeFactoryWithNoParams = js.native
  
  var Char: ISqlTypeFactoryWithLength = js.native
  
  var DRIVERS: js.Array[String] = js.native
  
  var Date: ISqlTypeFactoryWithNoParams = js.native
  
  var DateTime: ISqlTypeFactoryWithNoParams = js.native
  
  var DateTime2: ISqlTypeFactoryWithScale = js.native
  
  var DateTimeOffset: ISqlTypeFactoryWithScale = js.native
  
  var Decimal: ISqlTypeFactoryWithPrecisionScale = js.native
  
  var Float: ISqlTypeFactoryWithNoParams = js.native
  
  var Geography: ISqlTypeFactoryWithNoParams = js.native
  
  var Geometry: ISqlTypeFactoryWithNoParams = js.native
  
  var Image: ISqlTypeFactoryWithNoParams = js.native
  
  var Int: ISqlTypeFactoryWithNoParams = js.native
  
  var MAX: Double = js.native
  
  var Money: ISqlTypeFactoryWithNoParams = js.native
  
  var NChar: ISqlTypeFactoryWithLength = js.native
  
  var NText: ISqlTypeFactoryWithNoParams = js.native
  
  var NVarChar: ISqlTypeFactoryWithLength = js.native
  
  var Numeric: ISqlTypeFactoryWithPrecisionScale = js.native
  
  var Promise: js.Any = js.native
  
  var Real: ISqlTypeFactoryWithNoParams = js.native
  
  var SmallDateTime: ISqlTypeFactoryWithNoParams = js.native
  
  var SmallInt: ISqlTypeFactoryWithNoParams = js.native
  
  var SmallMoney: ISqlTypeFactoryWithNoParams = js.native
  
  var TVP: ISqlTypeFactoryWithTvpType = js.native
  
  var Text: ISqlTypeFactoryWithNoParams = js.native
  
  var Time: ISqlTypeFactoryWithScale = js.native
  
  var TinyInt: ISqlTypeFactoryWithNoParams = js.native
  
  var UDT: ISqlTypeFactoryWithNoParams = js.native
  
  var UniqueIdentifier: ISqlTypeFactoryWithNoParams = js.native
  
  var VarBinary: ISqlTypeFactoryWithLength = js.native
  
  var VarChar: ISqlTypeFactoryWithLength = js.native
  
  var Variant: ISqlTypeFactoryWithNoParams = js.native
  
  var Xml: ISqlTypeFactoryWithNoParams = js.native
  
  var fix: Boolean = js.native
  
  var map: IMap = js.native
  
  var pool: IPool = js.native
  
  @js.native
  class ConnectionError protected ()
    extends typings.mssql.mod.ConnectionError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @js.native
  class ConnectionPool protected ()
    extends typings.mssql.mod.ConnectionPool {
    def this(config: typings.mssql.mod.config) = this()
    def this(connectionString: String) = this()
    def this(config: typings.mssql.mod.config, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
    def this(connectionString: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
  }
  
  @js.native
  object ISOLATION_LEVEL extends js.Object {
    
    var READ_COMMITTED: IIsolationLevel = js.native
    
    var READ_UNCOMMITTED: IIsolationLevel = js.native
    
    var REPEATABLE_READ: IIsolationLevel = js.native
    
    var SERIALIZABLE: IIsolationLevel = js.native
    
    var SNAPSHOT: IIsolationLevel = js.native
  }
  
  @js.native
  class PreparedStatement ()
    extends typings.mssql.mod.PreparedStatement {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
    def this(transaction: typings.mssql.mod.Transaction) = this()
  }
  
  @js.native
  class PreparedStatementError protected ()
    extends typings.mssql.mod.PreparedStatementError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @js.native
  class Request ()
    extends typings.mssql.mod.Request {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
    def this(preparedStatement: typings.mssql.mod.PreparedStatement) = this()
    def this(transaction: typings.mssql.mod.Transaction) = this()
  }
  
  @js.native
  class RequestError protected ()
    extends typings.mssql.mod.RequestError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
  
  @js.native
  object TYPES extends js.Object {
    
    def BigInt(): ISqlTypeWithNoParams = js.native
    @JSName("BigInt")
    var BigInt_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Binary(): ISqlTypeWithNoParams = js.native
    @JSName("Binary")
    var Binary_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Bit(): ISqlTypeWithNoParams = js.native
    @JSName("Bit")
    var Bit_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Char(): ISqlTypeWithLength = js.native
    def Char(length: Double): ISqlTypeWithLength = js.native
    @JSName("Char")
    var Char_Original: ISqlTypeFactoryWithLength = js.native
    
    def Date(): ISqlTypeWithNoParams = js.native
    
    def DateTime(): ISqlTypeWithNoParams = js.native
    
    def DateTime2(): ISqlTypeWithScale = js.native
    def DateTime2(scale: Double): ISqlTypeWithScale = js.native
    @JSName("DateTime2")
    var DateTime2_Original: ISqlTypeFactoryWithScale = js.native
    
    def DateTimeOffset(): ISqlTypeWithScale = js.native
    def DateTimeOffset(scale: Double): ISqlTypeWithScale = js.native
    @JSName("DateTimeOffset")
    var DateTimeOffset_Original: ISqlTypeFactoryWithScale = js.native
    
    @JSName("DateTime")
    var DateTime_Original: ISqlTypeFactoryWithNoParams = js.native
    
    @JSName("Date")
    var Date_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Decimal(): ISqlTypeWithPrecisionScale = js.native
    def Decimal(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
    def Decimal(precision: Double): ISqlTypeWithPrecisionScale = js.native
    def Decimal(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
    @JSName("Decimal")
    var Decimal_Original: ISqlTypeFactoryWithPrecisionScale = js.native
    
    def Float(): ISqlTypeWithNoParams = js.native
    @JSName("Float")
    var Float_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Geography(): ISqlTypeWithNoParams = js.native
    @JSName("Geography")
    var Geography_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Geometry(): ISqlTypeWithNoParams = js.native
    @JSName("Geometry")
    var Geometry_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Image(): ISqlTypeWithNoParams = js.native
    @JSName("Image")
    var Image_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Int(): ISqlTypeWithNoParams = js.native
    @JSName("Int")
    var Int_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Money(): ISqlTypeWithNoParams = js.native
    @JSName("Money")
    var Money_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def NChar(): ISqlTypeWithLength = js.native
    def NChar(length: Double): ISqlTypeWithLength = js.native
    @JSName("NChar")
    var NChar_Original: ISqlTypeFactoryWithLength = js.native
    
    def NText(): ISqlTypeWithNoParams = js.native
    @JSName("NText")
    var NText_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def NVarChar(): ISqlTypeWithLength = js.native
    def NVarChar(length: Double): ISqlTypeWithLength = js.native
    @JSName("NVarChar")
    var NVarChar_Original: ISqlTypeFactoryWithLength = js.native
    
    def Numeric(): ISqlTypeWithPrecisionScale = js.native
    def Numeric(precision: js.UndefOr[scala.Nothing], scale: Double): ISqlTypeWithPrecisionScale = js.native
    def Numeric(precision: Double): ISqlTypeWithPrecisionScale = js.native
    def Numeric(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
    @JSName("Numeric")
    var Numeric_Original: ISqlTypeFactoryWithPrecisionScale = js.native
    
    def Real(): ISqlTypeWithNoParams = js.native
    @JSName("Real")
    var Real_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def SmallDateTime(): ISqlTypeWithNoParams = js.native
    @JSName("SmallDateTime")
    var SmallDateTime_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def SmallInt(): ISqlTypeWithNoParams = js.native
    @JSName("SmallInt")
    var SmallInt_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def SmallMoney(): ISqlTypeWithNoParams = js.native
    @JSName("SmallMoney")
    var SmallMoney_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def TVP(): ISqlTypeWithTvpType = js.native
    def TVP(tvpType: js.Any): ISqlTypeWithTvpType = js.native
    @JSName("TVP")
    var TVP_Original: ISqlTypeFactoryWithTvpType = js.native
    
    def Text(): ISqlTypeWithNoParams = js.native
    @JSName("Text")
    var Text_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Time(): ISqlTypeWithScale = js.native
    def Time(scale: Double): ISqlTypeWithScale = js.native
    @JSName("Time")
    var Time_Original: ISqlTypeFactoryWithScale = js.native
    
    def TinyInt(): ISqlTypeWithNoParams = js.native
    @JSName("TinyInt")
    var TinyInt_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def UDT(): ISqlTypeWithNoParams = js.native
    @JSName("UDT")
    var UDT_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def UniqueIdentifier(): ISqlTypeWithNoParams = js.native
    @JSName("UniqueIdentifier")
    var UniqueIdentifier_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def VarBinary(): ISqlTypeWithLength = js.native
    def VarBinary(length: Double): ISqlTypeWithLength = js.native
    @JSName("VarBinary")
    var VarBinary_Original: ISqlTypeFactoryWithLength = js.native
    
    def VarChar(): ISqlTypeWithLength = js.native
    def VarChar(length: Double): ISqlTypeWithLength = js.native
    @JSName("VarChar")
    var VarChar_Original: ISqlTypeFactoryWithLength = js.native
    
    def Variant(): ISqlTypeWithNoParams = js.native
    @JSName("Variant")
    var Variant_Original: ISqlTypeFactoryWithNoParams = js.native
    
    def Xml(): ISqlTypeWithNoParams = js.native
    @JSName("Xml")
    var Xml_Original: ISqlTypeFactoryWithNoParams = js.native
  }
  
  @js.native
  class Table ()
    extends typings.mssql.mod.Table {
    def this(tableName: String) = this()
  }
  
  @js.native
  class Transaction ()
    extends typings.mssql.mod.Transaction {
    def this(connection: typings.mssql.mod.ConnectionPool) = this()
  }
  
  @js.native
  class TransactionError protected ()
    extends typings.mssql.mod.TransactionError {
    def this(message: String) = this()
    def this(message: String, code: js.Any) = this()
  }
}
