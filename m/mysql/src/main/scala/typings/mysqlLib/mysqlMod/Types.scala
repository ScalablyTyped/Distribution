package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mysqlLib.mysqlLibNumbers.`0x00`
  - mysqlLib.mysqlLibNumbers.`0x01`
  - mysqlLib.mysqlLibNumbers.`0x02`
  - mysqlLib.mysqlLibNumbers.`0x03`
  - mysqlLib.mysqlLibNumbers.`0x04`
  - mysqlLib.mysqlLibNumbers.`0x05`
  - mysqlLib.mysqlLibNumbers.`0x06`
  - mysqlLib.mysqlLibNumbers.`0x07`
  - mysqlLib.mysqlLibNumbers.`0x08`
  - mysqlLib.mysqlLibNumbers.`0x09`
  - mysqlLib.mysqlLibNumbers.`0x0a`
  - mysqlLib.mysqlLibNumbers.`0x0b`
  - mysqlLib.mysqlLibNumbers.`0x0c`
  - mysqlLib.mysqlLibNumbers.`0x0d`
  - mysqlLib.mysqlLibNumbers.`0x0e`
  - mysqlLib.mysqlLibNumbers.`0x0f`
  - mysqlLib.mysqlLibNumbers.`0x10`
  - mysqlLib.mysqlLibNumbers.`0x11`
  - mysqlLib.mysqlLibNumbers.`0x12`
  - mysqlLib.mysqlLibNumbers.`0x13`
  - mysqlLib.mysqlLibNumbers.`0xf5`
  - mysqlLib.mysqlLibNumbers.`0xf6`
  - mysqlLib.mysqlLibNumbers.`0xf7`
  - mysqlLib.mysqlLibNumbers.`0xf8`
  - mysqlLib.mysqlLibNumbers.`0xf9`
  - mysqlLib.mysqlLibNumbers.`0xfa`
  - mysqlLib.mysqlLibNumbers.`0xfb`
  - mysqlLib.mysqlLibNumbers.`0xfc`
  - mysqlLib.mysqlLibNumbers.`0xfd`
  - mysqlLib.mysqlLibNumbers.`0xfe`
  - mysqlLib.mysqlLibNumbers.`0xff`
*/
trait Types extends js.Object

object Types {
   // aka BIT, 1-8 byte
  @scala.inline
  def BIT: mysqlLib.mysqlLibNumbers.`0x10` = this.cast(0x10)
   // aka BLOB, TEXT
  @scala.inline
  def BLOB: mysqlLib.mysqlLibNumbers.`0xfc` = this.cast(0xfc)
   // aka DATE
  @scala.inline
  def DATE: mysqlLib.mysqlLibNumbers.`0x0a` = this.cast(0x0a)
   // aka DATETIME
  @scala.inline
  def DATETIME: mysqlLib.mysqlLibNumbers.`0x0c` = this.cast(0x0c)
   // aka DATETIME with fractional seconds
  @scala.inline
  def DATETIME2: mysqlLib.mysqlLibNumbers.`0x12` = this.cast(0x12)
   // aka DECIMAL (http://dev.mysql.com/doc/refman/5.0/en/precision-math-decimal-changes.html)
  @scala.inline
  def DECIMAL: mysqlLib.mysqlLibNumbers.`0x00` = this.cast(0x00)
   // aka DOUBLE, 8 bytes
  @scala.inline
  def DOUBLE: mysqlLib.mysqlLibNumbers.`0x05` = this.cast(0x05)
   // aka ENUM
  @scala.inline
  def ENUM: mysqlLib.mysqlLibNumbers.`0xf7` = this.cast(0xf7)
   // aka FLOAT, 4-8 bytes
  @scala.inline
  def FLOAT: mysqlLib.mysqlLibNumbers.`0x04` = this.cast(0x04)
   // aka GEOMETRY
  @scala.inline
  def GEOMETRY: mysqlLib.mysqlLibNumbers.`0xff` = this.cast(0xff)
   // aka MEDIUMINT, 3 bytes
  @scala.inline
  def INT24: mysqlLib.mysqlLibNumbers.`0x09` = this.cast(0x09)
   // aka JSON
  @scala.inline
  def JSON: mysqlLib.mysqlLibNumbers.`0xf5` = this.cast(0xf5)
   // aka INT, 4 bytes
  @scala.inline
  def LONG: mysqlLib.mysqlLibNumbers.`0x03` = this.cast(0x03)
   // aka BIGINT, 8 bytes
  @scala.inline
  def LONGLONG: mysqlLib.mysqlLibNumbers.`0x08` = this.cast(0x08)
   // aka LONGBLOG, LONGTEXT
  @scala.inline
  def LONG_BLOB: mysqlLib.mysqlLibNumbers.`0xfb` = this.cast(0xfb)
   // aka MEDIUMBLOB, MEDIUMTEXT
  @scala.inline
  def MEDIUM_BLOB: mysqlLib.mysqlLibNumbers.`0xfa` = this.cast(0xfa)
   // aka ?
  @scala.inline
  def NEWDATE: mysqlLib.mysqlLibNumbers.`0x0e` = this.cast(0x0e)
   // aka DECIMAL
  @scala.inline
  def NEWDECIMAL: mysqlLib.mysqlLibNumbers.`0xf6` = this.cast(0xf6)
   // NULL (used for prepared statements, I think)
  @scala.inline
  def NULL: mysqlLib.mysqlLibNumbers.`0x06` = this.cast(0x06)
   // aka SET
  @scala.inline
  def SET: mysqlLib.mysqlLibNumbers.`0xf8` = this.cast(0xf8)
   // aka SMALLINT, 2 bytes
  @scala.inline
  def SHORT: mysqlLib.mysqlLibNumbers.`0x02` = this.cast(0x02)
   // aka CHAR, BINARY
  @scala.inline
  def STRING: mysqlLib.mysqlLibNumbers.`0xfe` = this.cast(0xfe)
   // aka TIME
  @scala.inline
  def TIME: mysqlLib.mysqlLibNumbers.`0x0b` = this.cast(0x0b)
   // aka TIME with fractional seconds
  @scala.inline
  def TIME2: mysqlLib.mysqlLibNumbers.`0x13` = this.cast(0x13)
   // aka TIMESTAMP
  @scala.inline
  def TIMESTAMP: mysqlLib.mysqlLibNumbers.`0x07` = this.cast(0x07)
   // aka TIMESTAMP with fractional seconds
  @scala.inline
  def TIMESTAMP2: mysqlLib.mysqlLibNumbers.`0x11` = this.cast(0x11)
   // aka TINYINT, 1 byte
  @scala.inline
  def TINY: mysqlLib.mysqlLibNumbers.`0x01` = this.cast(0x01)
   // aka TINYBLOB, TINYTEXT
  @scala.inline
  def TINY_BLOB: mysqlLib.mysqlLibNumbers.`0xf9` = this.cast(0xf9)
   // aka VARCHAR (?)
  @scala.inline
  def VARCHAR: mysqlLib.mysqlLibNumbers.`0x0f` = this.cast(0x0f)
   // aka VARCHAR, VARBINARY
  @scala.inline
  def VAR_STRING: mysqlLib.mysqlLibNumbers.`0xfd` = this.cast(0xfd)
   // aka YEAR, 1 byte (don't ask)
  @scala.inline
  def YEAR: mysqlLib.mysqlLibNumbers.`0x0d` = this.cast(0x0d)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

