package typings.pg.pgMod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.pg.pgStrings.drain
import typings.pg.pgStrings.end
import typings.pg.pgStrings.error
import typings.pg.pgStrings.notice
import typings.pg.pgStrings.notification
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "ClientBase")
@js.native
class ClientBase () extends EventEmitter {
  def this(config: String) = this()
  def this(config: ClientConfig) = this()
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def copyFrom(queryText: String): Writable = js.native
  def copyTo(queryText: String): Readable = js.native
  def escapeIdentifier(str: String): String = js.native
  def escapeLiteral(str: String): String = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  // tslint:disable-next-line unified-signatures
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_notice(event: notice, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_notification(event: notification, listener: js.Function1[/* message */ Notification, Unit]): this.type = js.native
  def pauseDrain(): Unit = js.native
  def query(queryConfig: QueryArrayConfig): js.Promise[QueryArrayResult] = js.native
  def query(
    queryConfig: QueryArrayConfig,
    callback: js.Function2[/* err */ Error, /* result */ QueryArrayResult, Unit]
  ): Query = js.native
  def query(queryConfig: QueryArrayConfig, values: js.Array[_]): js.Promise[QueryArrayResult] = js.native
  def query(queryConfig: QueryConfig): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String, callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]): Query = js.native
  def query(queryTextOrConfig: String, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: QueryConfig,
    callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]
  ): Query = js.native
  def query(queryTextOrConfig: QueryConfig, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryText: String,
    values: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]
  ): Query = js.native
  def query[T /* <: Submittable */](queryStream: T): T = js.native
  def resumeDrain(): Unit = js.native
}

