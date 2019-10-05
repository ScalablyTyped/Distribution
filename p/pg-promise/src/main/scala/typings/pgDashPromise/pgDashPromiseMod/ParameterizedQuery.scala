package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.pgDashPromiseMod.errors.ParameterizedQueryError
import typings.pgDashPromise.pgDashPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ParameterizedQuery class;
// API: http://vitaly-t.github.io/pg-promise/ParameterizedQuery.html
@JSImport("pg-promise", "ParameterizedQuery")
@js.native
class ParameterizedQuery () extends _QueryParam {
  def this(options: String) = this()
  def this(options: IParameterizedQuery) = this()
  def this(options: QueryFile) = this()
  // advanced properties:
  var binary: Boolean = js.native
  var rowMode: Unit | array = js.native
  // standard properties:
  var text: String | QueryFile = js.native
  var values: js.Array[_] = js.native
  def parse(): IParameterizedParsed | ParameterizedQueryError = js.native
  def toString(level: Double): String = js.native
}

