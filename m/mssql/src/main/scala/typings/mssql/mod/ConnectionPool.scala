package typings.mssql.mod

import typings.events.mod.EventEmitter
import typings.std.TemplateStringsArray
import typings.tarn.mod.Pool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "ConnectionPool")
@js.native
open class ConnectionPool protected () extends EventEmitter {
  def this(config: typings.mssql.mod.config) = this()
  def this(connectionString: String) = this()
  def this(config: typings.mssql.mod.config, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]) = this()
  def this(connectionString: String, callback: js.Function1[/* err */ js.UndefOr[Any], Unit]) = this()
  
  val available: Double = js.native
  
  def batch(batch: String): js.Promise[IResult[Any]] = js.native
  def batch(
    batch: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* recordset */ js.UndefOr[IResult[Any]], Unit]
  ): Unit = js.native
  def batch(strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Any]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](batch: String): js.Promise[IResult[Entity]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Entity]] = js.native
  
  val borrowed: Double = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  def connect(): js.Promise[ConnectionPool] = js.native
  def connect(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  val connected: Boolean = js.native
  
  val connecting: Boolean = js.native
  
  val driver: String = js.native
  
  val healthy: Boolean = js.native
  
  val pending: Double = js.native
  
  val pool: Pool[Connection] = js.native
  
  def query(command: String): js.Promise[IResult[Any]] = js.native
  def query(strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Any]] = js.native
  def query[Entity](
    command: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* recordset */ js.UndefOr[IResult[Entity]], Unit]
  ): Unit = js.native
  @JSName("query")
  def query_Entity[Entity](command: String): js.Promise[IResult[Entity]] = js.native
  @JSName("query")
  def query_Entity[Entity](strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Entity]] = js.native
  
  def request(): Request = js.native
  
  val size: Double = js.native
  
  def transaction(): Transaction = js.native
}
/* static members */
object ConnectionPool {
  
  @JSImport("mssql", "ConnectionPool")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseConnectionString(connectionString: String): config = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConnectionString")(connectionString.asInstanceOf[js.Any]).asInstanceOf[config]
}
