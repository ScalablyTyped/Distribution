package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// helpers.TableName class;
// API: http://vitaly-t.github.io/pg-promise/helpers.TableName.html
@JSImport("pg-promise", "TableName")
@js.native
class TableName protected () extends js.Object {
  def this(table: String) = this()
  def this(table: ITable) = this()
  // these are all read-only:
  val name: String = js.native
  val schema: String = js.native
  val table: String = js.native
}

