package typings.pg.pgMod

import typings.node.eventsMod.EventEmitter
import typings.pg.pgStrings.acquire
import typings.pg.pgStrings.connect
import typings.pg.pgStrings.error
import typings.pg.pgStrings.remove
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Pool")
@js.native
// `new Pool('pg://user@localhost/mydb')` is not allowed.
// But it passes type check because of issue:
// https://github.com/Microsoft/TypeScript/issues/7485
class Pool () extends EventEmitter {
  def this(config: PoolConfig) = this()
  val idleCount: Double = js.native
  val totalCount: Double = js.native
  val waitingCount: Double = js.native
  def connect(): js.Promise[PoolClient] = js.native
  def connect(
    callback: js.Function3[
      /* err */ Error, 
      /* client */ PoolClient, 
      /* done */ js.Function1[/* release */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Unit = js.native
  def end(): js.Promise[Unit] = js.native
  def end(callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_acquire(event: acquire, listener: js.Function1[/* client */ PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* client */ PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ Error, /* client */ PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* client */ PoolClient, Unit]): this.type = js.native
  def query(queryConfig: QueryArrayConfig): js.Promise[QueryArrayResult] = js.native
  def query(
    queryConfig: QueryArrayConfig,
    callback: js.Function2[/* err */ Error, /* result */ QueryArrayResult, Unit]
  ): Unit = js.native
  def query(queryConfig: QueryArrayConfig, values: js.Array[_]): js.Promise[QueryArrayResult] = js.native
  def query(queryConfig: QueryConfig): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: String, callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]): Unit = js.native
  def query(queryTextOrConfig: String, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: QueryConfig,
    callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]
  ): Unit = js.native
  def query(queryTextOrConfig: QueryConfig, values: js.Array[_]): js.Promise[QueryResult] = js.native
  def query(
    queryText: String,
    values: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ QueryResult, Unit]
  ): Unit = js.native
  def query[T /* <: Submittable */](queryStream: T): T = js.native
}

