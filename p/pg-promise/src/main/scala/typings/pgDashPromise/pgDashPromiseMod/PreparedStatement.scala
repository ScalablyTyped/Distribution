package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.pgDashPromiseMod.errorsNs.PreparedStatementError
import typings.pgDashPromise.pgDashPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PreparedStatement class;
// API: http://vitaly-t.github.io/pg-promise/PreparedStatement.html
@JSImport("pg-promise", "PreparedStatement")
@js.native
class PreparedStatement () extends _QueryParam {
  def this(options: IPreparedStatement) = this()
  // advanced properties:
  var binary: Boolean = js.native
  // standard properties:
  var name: String = js.native
  var rowMode: Unit | array = js.native
  var rows: Double = js.native
  var text: String | QueryFile = js.native
  var values: js.Array[_] = js.native
  def parse(): IPreparedParsed | PreparedStatementError = js.native
  def toString(level: Double): String = js.native
}

