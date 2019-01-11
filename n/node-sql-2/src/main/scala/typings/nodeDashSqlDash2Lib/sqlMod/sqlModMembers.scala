package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql", JSImport.Namespace)
@js.native
object sqlModMembers extends js.Object {
  def define[Name /* <: java.lang.String */, T](map: TableDefinition[Name, T]): Table[Name, T] = js.native
  def setDialect(dialect: SQLDialects): scala.Unit = js.native
}

