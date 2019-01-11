package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubQuery[T] extends js.Object {
  def exists(): BinaryNode = js.native
  def from(statement: java.lang.String): SubQuery[T] = js.native
  def from(table: TableNode): SubQuery[T] = js.native
  def group(nodes: js.Any*): SubQuery[T] = js.native
  def notExists(): BinaryNode = js.native
  def notExists(subQuery: SubQuery[_]): BinaryNode = js.native
  def order(criteria: OrderByValueNode): SubQuery[T] = js.native
  def select(nodes: js.Any*): SubQuery[T] = js.native
  def select[Name](node: Column[Name, T]): SubQuery[T] = js.native
  def where(nodes: js.Any*): SubQuery[T] = js.native
}

