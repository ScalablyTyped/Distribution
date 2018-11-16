package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("mysql", "Types")
@js.native
object Types extends js.Object {
   // aka BIT, 1-8 byte
  @js.native
  sealed trait BIT
    extends mysqlLib.mysqlMod.Types
  
   // aka BLOB, TEXT
  @js.native
  sealed trait BLOB
    extends mysqlLib.mysqlMod.Types
  
   // aka DATE
  @js.native
  sealed trait DATE
    extends mysqlLib.mysqlMod.Types
  
   // aka DATETIME
  @js.native
  sealed trait DATETIME
    extends mysqlLib.mysqlMod.Types
  
   // aka DATETIME with fractional seconds
  @js.native
  sealed trait DATETIME2
    extends mysqlLib.mysqlMod.Types
  
   // aka DECIMAL (http://dev.mysql.com/doc/refman/5.0/en/precision-math-decimal-changes.html)
  @js.native
  sealed trait DECIMAL
    extends mysqlLib.mysqlMod.Types
  
   // aka DOUBLE, 8 bytes
  @js.native
  sealed trait DOUBLE
    extends mysqlLib.mysqlMod.Types
  
   // aka ENUM
  @js.native
  sealed trait ENUM
    extends mysqlLib.mysqlMod.Types
  
   // aka FLOAT, 4-8 bytes
  @js.native
  sealed trait FLOAT
    extends mysqlLib.mysqlMod.Types
  
   // aka GEOMETRY
  @js.native
  sealed trait GEOMETRY
    extends mysqlLib.mysqlMod.Types
  
   // aka MEDIUMINT, 3 bytes
  @js.native
  sealed trait INT24
    extends mysqlLib.mysqlMod.Types
  
   // aka JSON
  @js.native
  sealed trait JSON
    extends mysqlLib.mysqlMod.Types
  
   // aka INT, 4 bytes
  @js.native
  sealed trait LONG
    extends mysqlLib.mysqlMod.Types
  
   // aka BIGINT, 8 bytes
  @js.native
  sealed trait LONGLONG
    extends mysqlLib.mysqlMod.Types
  
   // aka LONGBLOG, LONGTEXT
  @js.native
  sealed trait LONG_BLOB
    extends mysqlLib.mysqlMod.Types
  
   // aka MEDIUMBLOB, MEDIUMTEXT
  @js.native
  sealed trait MEDIUM_BLOB
    extends mysqlLib.mysqlMod.Types
  
   // aka ?
  @js.native
  sealed trait NEWDATE
    extends mysqlLib.mysqlMod.Types
  
   // aka DECIMAL
  @js.native
  sealed trait NEWDECIMAL
    extends mysqlLib.mysqlMod.Types
  
   // NULL (used for prepared statements, I think)
  @js.native
  sealed trait NULL
    extends mysqlLib.mysqlMod.Types
  
   // aka SET
  @js.native
  sealed trait SET
    extends mysqlLib.mysqlMod.Types
  
   // aka SMALLINT, 2 bytes
  @js.native
  sealed trait SHORT
    extends mysqlLib.mysqlMod.Types
  
   // aka CHAR, BINARY
  @js.native
  sealed trait STRING
    extends mysqlLib.mysqlMod.Types
  
   // aka TIME
  @js.native
  sealed trait TIME
    extends mysqlLib.mysqlMod.Types
  
   // aka TIME with fractional seconds
  @js.native
  sealed trait TIME2
    extends mysqlLib.mysqlMod.Types
  
   // aka TIMESTAMP
  @js.native
  sealed trait TIMESTAMP
    extends mysqlLib.mysqlMod.Types
  
   // aka TIMESTAMP with fractional seconds
  @js.native
  sealed trait TIMESTAMP2
    extends mysqlLib.mysqlMod.Types
  
   // aka TINYINT, 1 byte
  @js.native
  sealed trait TINY
    extends mysqlLib.mysqlMod.Types
  
   // aka TINYBLOB, TINYTEXT
  @js.native
  sealed trait TINY_BLOB
    extends mysqlLib.mysqlMod.Types
  
   // aka VARCHAR (?)
  @js.native
  sealed trait VARCHAR
    extends mysqlLib.mysqlMod.Types
  
   // aka VARCHAR, VARBINARY
  @js.native
  sealed trait VAR_STRING
    extends mysqlLib.mysqlMod.Types
  
   // aka YEAR, 1 byte (don't ask)
  @js.native
  sealed trait YEAR
    extends mysqlLib.mysqlMod.Types
  
  /* 0x10 */ val BIT: BIT with scala.Double = js.native
  /* 0xfc */ val BLOB: BLOB with scala.Double = js.native
  /* 0x0a */ val DATE: DATE with scala.Double = js.native
  /* 0x0c */ val DATETIME: DATETIME with scala.Double = js.native
  /* 0x12 */ val DATETIME2: DATETIME2 with scala.Double = js.native
  /* 0x00 */ val DECIMAL: DECIMAL with scala.Double = js.native
  /* 0x05 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 0xf7 */ val ENUM: ENUM with scala.Double = js.native
  /* 0x04 */ val FLOAT: FLOAT with scala.Double = js.native
  /* 0xff */ val GEOMETRY: GEOMETRY with scala.Double = js.native
  /* 0x09 */ val INT24: INT24 with scala.Double = js.native
  /* 0xf5 */ val JSON: JSON with scala.Double = js.native
  /* 0x03 */ val LONG: LONG with scala.Double = js.native
  /* 0x08 */ val LONGLONG: LONGLONG with scala.Double = js.native
  /* 0xfb */ val LONG_BLOB: LONG_BLOB with scala.Double = js.native
  /* 0xfa */ val MEDIUM_BLOB: MEDIUM_BLOB with scala.Double = js.native
  /* 0x0e */ val NEWDATE: NEWDATE with scala.Double = js.native
  /* 0xf6 */ val NEWDECIMAL: NEWDECIMAL with scala.Double = js.native
  /* 0x06 */ val NULL: NULL with scala.Double = js.native
  /* 0xf8 */ val SET: SET with scala.Double = js.native
  /* 0x02 */ val SHORT: SHORT with scala.Double = js.native
  /* 0xfe */ val STRING: STRING with scala.Double = js.native
  /* 0x0b */ val TIME: TIME with scala.Double = js.native
  /* 0x13 */ val TIME2: TIME2 with scala.Double = js.native
  /* 0x07 */ val TIMESTAMP: TIMESTAMP with scala.Double = js.native
  /* 0x11 */ val TIMESTAMP2: TIMESTAMP2 with scala.Double = js.native
  /* 0x01 */ val TINY: TINY with scala.Double = js.native
  /* 0xf9 */ val TINY_BLOB: TINY_BLOB with scala.Double = js.native
  /* 0x0f */ val VARCHAR: VARCHAR with scala.Double = js.native
  /* 0xfd */ val VAR_STRING: VAR_STRING with scala.Double = js.native
  /* 0x0d */ val YEAR: YEAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mysqlLib.mysqlMod.Types with scala.Double] = js.native
}

