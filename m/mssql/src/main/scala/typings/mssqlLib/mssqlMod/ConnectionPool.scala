package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "ConnectionPool")
@js.native
class ConnectionPool protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: config) = this()
  def this(connectionString: java.lang.String) = this()
  def this(config: config, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) = this()
  def this(connectionString: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) = this()
  var connected: scala.Boolean = js.native
  var connecting: scala.Boolean = js.native
  var driver: java.lang.String = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def connect(): stdLib.Promise[ConnectionPool] = js.native
  def connect(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def query(strings: stdLib.TemplateStringsArray, interpolations: js.Any*): stdLib.Promise[IResult[_]] = js.native
  def request(): Request = js.native
  def transaction(): Transaction = js.native
}

