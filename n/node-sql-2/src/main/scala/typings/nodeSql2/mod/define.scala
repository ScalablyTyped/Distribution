package typings.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql", "define")
@js.native
object define extends js.Object {
  def apply[Name /* <: String */, T](map: TableDefinition[Name, T]): Table[Name, T] = js.native
}

