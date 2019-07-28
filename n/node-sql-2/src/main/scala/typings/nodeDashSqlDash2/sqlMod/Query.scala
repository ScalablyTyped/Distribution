package typings.nodeDashSqlDash2.sqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[T] extends Queryable[T] {
  var resultType: T = js.native
  def from(statement: String): Query[T] = js.native
  def from(table: TableNode): Query[T] = js.native
  def group(nodes: js.Any*): Query[T] = js.native
  def limit(l: Double): Query[T] = js.native
  def offset(o: Double): Query[T] = js.native
  def order(criteria: OrderByValueNode*): Query[T] = js.native
  def update(o: js.Object): ModifyingQuery = js.native
  def update(o: StringDictionary[js.Any]): ModifyingQuery = js.native
}

