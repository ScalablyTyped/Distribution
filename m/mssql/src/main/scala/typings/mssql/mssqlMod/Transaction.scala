package typings.mssql.mssqlMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "Transaction")
@js.native
class Transaction () extends EventEmitter {
  def this(connection: ConnectionPool) = this()
  var isolationLevel: IIsolationLevel = js.native
  def begin(): Unit = js.native
  def begin(isolationLevel: IIsolationLevel): Unit = js.native
  def begin(isolationLevel: IIsolationLevel, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  @JSName("begin")
  def begin_Promise(): js.Promise[Unit] = js.native
  @JSName("begin")
  def begin_Promise(isolationLevel: IIsolationLevel): js.Promise[Unit] = js.native
  def commit(): js.Promise[Unit] = js.native
  def commit(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def request(): Request = js.native
  def rollback(): js.Promise[Unit] = js.native
  def rollback(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

