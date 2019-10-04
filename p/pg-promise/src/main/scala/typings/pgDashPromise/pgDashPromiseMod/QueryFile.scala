package typings.pgDashPromise.pgDashPromiseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// QueryFile class;
// API: http://vitaly-t.github.io/pg-promise/QueryFile.html
@JSImport("pg-promise", "QueryFile")
@js.native
class QueryFile protected () extends _QueryParam {
  def this(file: String) = this()
  def this(file: String, options: IQueryFileOptions) = this()
  val error: Error = js.native
  val file: String = js.native
  val options: js.Any = js.native
  def prepare(): Unit = js.native
  def toString(level: Double): String = js.native
}

