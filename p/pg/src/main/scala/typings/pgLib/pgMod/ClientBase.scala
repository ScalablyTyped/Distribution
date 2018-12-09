package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "ClientBase")
@js.native
class ClientBase ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: java.lang.String) = this()
  def this(config: ClientConfig) = this()
  def connect(): js.Promise[scala.Unit] = js.native
  def connect(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def copyFrom(queryText: java.lang.String): nodeLib.streamMod.Writable = js.native
  def copyTo(queryText: java.lang.String): nodeLib.streamMod.Readable = js.native
  def escapeIdentifier(str: java.lang.String): java.lang.String = js.native
  def escapeLiteral(str: java.lang.String): java.lang.String = js.native
  @JSName("on")
  def on_drain(event: pgLib.pgLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  // tslint:disable-next-line unified-signatures
  @JSName("on")
  def on_end(event: pgLib.pgLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: pgLib.pgLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_notice(event: pgLib.pgLibStrings.notice, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_notification(
    event: pgLib.pgLibStrings.notification,
    listener: js.Function1[/* message */ Notification, scala.Unit]
  ): this.type = js.native
  def pauseDrain(): scala.Unit = js.native
  def query(queryConfig: QueryArrayConfig): js.Promise[QueryArrayResult] = js.native
  def query(
    queryConfig: QueryArrayConfig,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryArrayResult, scala.Unit]
  ): Query = js.native
  def query(queryConfig: QueryArrayConfig, values: js.Array[_]): js.Promise[QueryArrayResult] = js.native
  def query(queryConfig: QueryConfig): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: java.lang.String): js.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query(queryTextOrConfig: java.lang.String, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: QueryConfig,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query(queryTextOrConfig: QueryConfig, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryText: java.lang.String,
    values: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query[T /* <: Submittable */](queryStream: T): T = js.native
  def resumeDrain(): scala.Unit = js.native
}

