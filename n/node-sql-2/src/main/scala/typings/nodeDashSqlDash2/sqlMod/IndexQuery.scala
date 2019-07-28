package typings.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexQuery extends js.Object {
  def create(): IndexCreationQuery = js.native
  def create(indexName: String): IndexCreationQuery = js.native
  def drop(columns: (Column[_, _])*): Executable = js.native
  def drop(indexName: String): Executable = js.native
}

