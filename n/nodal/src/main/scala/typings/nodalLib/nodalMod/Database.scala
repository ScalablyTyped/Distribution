package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Database")
@js.native
class Database () extends js.Object {
  var __logColorFuncs: js.Array[js.Function] = js.native
  var _useLogColor: js.Any = js.native
  var adapter: js.Any = js.native
  def close(callback: js.Function): scala.Boolean = js.native
  def connect(cfg: js.Any): scala.Boolean = js.native
  def create(): scala.Unit = js.native
  def drop(): scala.Unit = js.native
  def error(message: java.lang.String): scala.Boolean = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def log(sql: java.lang.String): scala.Boolean = js.native
  def log(sql: java.lang.String, params: js.Any): scala.Boolean = js.native
  def log(sql: java.lang.String, params: js.Any, time: scala.Double): scala.Boolean = js.native
  def query(args: js.Any*): scala.Unit = js.native
  def transaction(args: js.Any*): scala.Unit = js.native
}

