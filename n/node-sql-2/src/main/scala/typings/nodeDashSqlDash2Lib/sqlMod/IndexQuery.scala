package typings
package nodeDashSqlDash2Lib.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexQuery extends js.Object {
  def create(): IndexCreationQuery = js.native
  def create(indexName: java.lang.String): IndexCreationQuery = js.native
  def drop(columns: (Column[_, _])*): Executable = js.native
  def drop(indexName: java.lang.String): Executable = js.native
}

