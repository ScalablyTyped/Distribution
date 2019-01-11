package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyingQuery extends Executable {
  def returning[U](nodes: js.Any*): Query[U]
  def where(nodes: js.Any*): ModifyingQuery
}

