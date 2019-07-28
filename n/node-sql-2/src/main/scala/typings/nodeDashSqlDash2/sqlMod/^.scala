package typings.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def define[Name /* <: String */, T](map: TableDefinition[Name, T]): Table[Name, T] = js.native
  def setDialect(dialect: SQLDialects): Unit = js.native
}

