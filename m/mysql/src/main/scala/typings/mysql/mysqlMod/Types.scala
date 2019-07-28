package typings.mysql.mysqlMod

import typings.mysql.mysqlNumbers.`0x00`
import typings.mysql.mysqlNumbers.`0x01`
import typings.mysql.mysqlNumbers.`0x02`
import typings.mysql.mysqlNumbers.`0x03`
import typings.mysql.mysqlNumbers.`0x04`
import typings.mysql.mysqlNumbers.`0x05`
import typings.mysql.mysqlNumbers.`0x06`
import typings.mysql.mysqlNumbers.`0x07`
import typings.mysql.mysqlNumbers.`0x08`
import typings.mysql.mysqlNumbers.`0x09`
import typings.mysql.mysqlNumbers.`0x0a`
import typings.mysql.mysqlNumbers.`0x0b`
import typings.mysql.mysqlNumbers.`0x0c`
import typings.mysql.mysqlNumbers.`0x0d`
import typings.mysql.mysqlNumbers.`0x0e`
import typings.mysql.mysqlNumbers.`0x0f`
import typings.mysql.mysqlNumbers.`0x10`
import typings.mysql.mysqlNumbers.`0x11`
import typings.mysql.mysqlNumbers.`0x12`
import typings.mysql.mysqlNumbers.`0x13`
import typings.mysql.mysqlNumbers.`0xf5`
import typings.mysql.mysqlNumbers.`0xf6`
import typings.mysql.mysqlNumbers.`0xf7`
import typings.mysql.mysqlNumbers.`0xf8`
import typings.mysql.mysqlNumbers.`0xf9`
import typings.mysql.mysqlNumbers.`0xfa`
import typings.mysql.mysqlNumbers.`0xfb`
import typings.mysql.mysqlNumbers.`0xfc`
import typings.mysql.mysqlNumbers.`0xfd`
import typings.mysql.mysqlNumbers.`0xfe`
import typings.mysql.mysqlNumbers.`0xff`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mysql.mysqlNumbers.`0x00`
  - typings.mysql.mysqlNumbers.`0x01`
  - typings.mysql.mysqlNumbers.`0x02`
  - typings.mysql.mysqlNumbers.`0x03`
  - typings.mysql.mysqlNumbers.`0x04`
  - typings.mysql.mysqlNumbers.`0x05`
  - typings.mysql.mysqlNumbers.`0x06`
  - typings.mysql.mysqlNumbers.`0x07`
  - typings.mysql.mysqlNumbers.`0x08`
  - typings.mysql.mysqlNumbers.`0x09`
  - typings.mysql.mysqlNumbers.`0x0a`
  - typings.mysql.mysqlNumbers.`0x0b`
  - typings.mysql.mysqlNumbers.`0x0c`
  - typings.mysql.mysqlNumbers.`0x0d`
  - typings.mysql.mysqlNumbers.`0x0e`
  - typings.mysql.mysqlNumbers.`0x0f`
  - typings.mysql.mysqlNumbers.`0x10`
  - typings.mysql.mysqlNumbers.`0x11`
  - typings.mysql.mysqlNumbers.`0x12`
  - typings.mysql.mysqlNumbers.`0x13`
  - typings.mysql.mysqlNumbers.`0xf5`
  - typings.mysql.mysqlNumbers.`0xf6`
  - typings.mysql.mysqlNumbers.`0xf7`
  - typings.mysql.mysqlNumbers.`0xf8`
  - typings.mysql.mysqlNumbers.`0xf9`
  - typings.mysql.mysqlNumbers.`0xfa`
  - typings.mysql.mysqlNumbers.`0xfb`
  - typings.mysql.mysqlNumbers.`0xfc`
  - typings.mysql.mysqlNumbers.`0xfd`
  - typings.mysql.mysqlNumbers.`0xfe`
  - typings.mysql.mysqlNumbers.`0xff`
*/
trait Types extends js.Object

object Types {
   // aka BIT, 1-8 byte
  @scala.inline
  def BIT: `0x10` = this.cast(0x10)
   // aka BLOB, TEXT
  @scala.inline
  def BLOB: `0xfc` = this.cast(0xfc)
   // aka DATE
  @scala.inline
  def DATE: `0x0a` = this.cast(0x0a)
   // aka DATETIME
  @scala.inline
  def DATETIME: `0x0c` = this.cast(0x0c)
   // aka DATETIME with fractional seconds
  @scala.inline
  def DATETIME2: `0x12` = this.cast(0x12)
   // aka DECIMAL (http://dev.mysql.com/doc/refman/5.0/en/precision-math-decimal-changes.html)
  @scala.inline
  def DECIMAL: `0x00` = this.cast(0x00)
   // aka DOUBLE, 8 bytes
  @scala.inline
  def DOUBLE: `0x05` = this.cast(0x05)
   // aka ENUM
  @scala.inline
  def ENUM: `0xf7` = this.cast(0xf7)
   // aka FLOAT, 4-8 bytes
  @scala.inline
  def FLOAT: `0x04` = this.cast(0x04)
   // aka GEOMETRY
  @scala.inline
  def GEOMETRY: `0xff` = this.cast(0xff)
   // aka MEDIUMINT, 3 bytes
  @scala.inline
  def INT24: `0x09` = this.cast(0x09)
   // aka JSON
  @scala.inline
  def JSON: `0xf5` = this.cast(0xf5)
   // aka INT, 4 bytes
  @scala.inline
  def LONG: `0x03` = this.cast(0x03)
   // aka BIGINT, 8 bytes
  @scala.inline
  def LONGLONG: `0x08` = this.cast(0x08)
   // aka LONGBLOG, LONGTEXT
  @scala.inline
  def LONG_BLOB: `0xfb` = this.cast(0xfb)
   // aka MEDIUMBLOB, MEDIUMTEXT
  @scala.inline
  def MEDIUM_BLOB: `0xfa` = this.cast(0xfa)
   // aka ?
  @scala.inline
  def NEWDATE: `0x0e` = this.cast(0x0e)
   // aka DECIMAL
  @scala.inline
  def NEWDECIMAL: `0xf6` = this.cast(0xf6)
   // NULL (used for prepared statements, I think)
  @scala.inline
  def NULL: `0x06` = this.cast(0x06)
   // aka SET
  @scala.inline
  def SET: `0xf8` = this.cast(0xf8)
   // aka SMALLINT, 2 bytes
  @scala.inline
  def SHORT: `0x02` = this.cast(0x02)
   // aka CHAR, BINARY
  @scala.inline
  def STRING: `0xfe` = this.cast(0xfe)
   // aka TIME
  @scala.inline
  def TIME: `0x0b` = this.cast(0x0b)
   // aka TIME with fractional seconds
  @scala.inline
  def TIME2: `0x13` = this.cast(0x13)
   // aka TIMESTAMP
  @scala.inline
  def TIMESTAMP: `0x07` = this.cast(0x07)
   // aka TIMESTAMP with fractional seconds
  @scala.inline
  def TIMESTAMP2: `0x11` = this.cast(0x11)
   // aka TINYINT, 1 byte
  @scala.inline
  def TINY: `0x01` = this.cast(0x01)
   // aka TINYBLOB, TINYTEXT
  @scala.inline
  def TINY_BLOB: `0xf9` = this.cast(0xf9)
   // aka VARCHAR (?)
  @scala.inline
  def VARCHAR: `0x0f` = this.cast(0x0f)
   // aka VARCHAR, VARBINARY
  @scala.inline
  def VAR_STRING: `0xfd` = this.cast(0xfd)
   // aka YEAR, 1 byte (don't ask)
  @scala.inline
  def YEAR: `0x0d` = this.cast(0x0d)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

