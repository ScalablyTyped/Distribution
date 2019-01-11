package typings
package nodeDashSqlDash2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlMod {
  type Columns[T] = nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.Columns with T
  type SQLDialects = nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.mssql | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.mysql | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.oracle | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.postgres | nodeDashSqlDash2Lib.nodeDashSqlDash2LibStrings.sqlite
  type Table[Name /* <: java.lang.String */, T] = TableNode with Queryable[T] with Named[Name] with Columns[T] with nodeDashSqlDash2Lib.Anon_Alter[T]
}
