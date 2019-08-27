package typings.mssql.mssqlMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "ConnectionPool")
@js.native
class ConnectionPool protected () extends EventEmitter {
  def this(config: config) = this()
  def this(connectionString: String) = this()
  def this(config: config, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
  def this(connectionString: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]) = this()
  var connected: Boolean = js.native
  var connecting: Boolean = js.native
  var driver: String = js.native
  def batch(batch: String): js.Promise[IResult[_]] = js.native
  def batch(
    batch: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* recordset */ js.UndefOr[IResult[_]], Unit]
  ): Unit = js.native
  def batch(strings: TemplateStringsArray, interpolations: js.Any*): js.Promise[IResult[_]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](batch: String): js.Promise[IResult[Entity]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](strings: TemplateStringsArray, interpolations: js.Any*): js.Promise[IResult[Entity]] = js.native
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def connect(): js.Promise[ConnectionPool] = js.native
  def connect(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def query(command: String): js.Promise[IResult[_]] = js.native
  def query(strings: TemplateStringsArray, interpolations: js.Any*): js.Promise[IResult[_]] = js.native
  def query[Entity](
    command: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* recordset */ js.UndefOr[IResult[Entity]], Unit]
  ): Unit = js.native
  @JSName("query")
  def query_Entity[Entity](command: String): js.Promise[IResult[Entity]] = js.native
  @JSName("query")
  def query_Entity[Entity](strings: TemplateStringsArray, interpolations: js.Any*): js.Promise[IResult[Entity]] = js.native
  def request(): Request = js.native
  def transaction(): Transaction = js.native
}

