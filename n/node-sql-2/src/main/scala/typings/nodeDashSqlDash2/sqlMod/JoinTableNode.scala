package typings.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinTableNode extends TableNode {
  def on(filter: String): TableNode = js.native
  def on(filter: BinaryNode): TableNode = js.native
}

