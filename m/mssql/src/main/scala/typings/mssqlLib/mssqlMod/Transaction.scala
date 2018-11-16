package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "Transaction")
@js.native
class Transaction ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(connection: ConnectionPool) = this()
  var isolationLevel: mssqlLib.IIsolationLevel = js.native
  def begin(): scala.Unit = js.native
  def begin(isolationLevel: mssqlLib.IIsolationLevel): scala.Unit = js.native
  def begin(
    isolationLevel: mssqlLib.IIsolationLevel,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  @JSName("begin")
  def begin_Promise(): stdLib.Promise[scala.Unit] = js.native
  @JSName("begin")
  def begin_Promise(isolationLevel: mssqlLib.IIsolationLevel): stdLib.Promise[scala.Unit] = js.native
  def commit(): stdLib.Promise[scala.Unit] = js.native
  def commit(callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def request(): Request = js.native
  def rollback(): stdLib.Promise[scala.Unit] = js.native
  def rollback(callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
}

