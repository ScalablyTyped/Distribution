package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Pool")
@js.native
class Pool ()
  extends eventsLib.eventsMod.EventEmitter {
  // `new Pool('pg://user@localhost/mydb')` is not allowed.
  // But it passes type check because of issue:
  // https://github.com/Microsoft/TypeScript/issues/7485
  def this(config: PoolConfig) = this()
  val idleCount: scala.Double = js.native
  val totalCount: scala.Double = js.native
  val waitingCount: scala.Double = js.native
  def connect(): stdLib.Promise[PoolClient] = js.native
  def connect(
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* client */ PoolClient, 
      /* done */ js.Function1[/* release */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def end(): stdLib.Promise[scala.Unit] = js.native
  def end(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_acquire(event: pgLib.pgLibStrings.acquire, listener: js.Function1[/* client */ PoolClient, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: pgLib.pgLibStrings.connect, listener: js.Function1[/* client */ PoolClient, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: pgLib.pgLibStrings.error,
    listener: js.Function2[/* err */ nodeLib.Error, /* client */ PoolClient, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_remove(event: pgLib.pgLibStrings.remove, listener: js.Function1[/* client */ PoolClient, scala.Unit]): this.type = js.native
  def query(queryConfig: QueryArrayConfig): stdLib.Promise[QueryArrayResult] = js.native
  def query(
    queryConfig: QueryArrayConfig,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryArrayResult, scala.Unit]
  ): Query = js.native
  def query(queryConfig: QueryArrayConfig, values: js.Array[_]): stdLib.Promise[QueryArrayResult] = js.native
  def query(queryConfig: QueryConfig): stdLib.Promise[QueryResult] = js.native
  def query(queryTextOrConfig: java.lang.String): stdLib.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query(queryTextOrConfig: java.lang.String, values: js.Array[_]): stdLib.Promise[QueryResult] = js.native
  def query(
    queryTextOrConfig: QueryConfig,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query(queryTextOrConfig: QueryConfig, values: js.Array[_]): stdLib.Promise[QueryResult] = js.native
  def query(
    queryText: java.lang.String,
    values: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ QueryResult, scala.Unit]
  ): Query = js.native
  def query[T /* <: Submittable */](queryStream: T): T = js.native
}

