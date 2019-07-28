package typings.nodeDashSqlDash2

import typings.nodeDashSqlDash2.Anon_Alter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlMod {
  type Columns[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.Columns with T
  type Table[Name /* <: String */, T] = TableNode with Queryable[T] with Named[Name] with Columns[T] with Anon_Alter[T]
}
