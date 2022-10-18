package typings.mssql.mod

import typings.events.mod.EventEmitter
import typings.node.NodeJS.WritableStream
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "Request")
@js.native
open class Request () extends EventEmitter {
  def this(connection: ConnectionPool) = this()
  def this(preparedStatement: PreparedStatement) = this()
  def this(transaction: Transaction) = this()
  
  def batch(batch: String): js.Promise[IResult[Any]] = js.native
  def batch(
    batch: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* recordset */ js.UndefOr[IResult[Any]], Unit]
  ): Unit = js.native
  def batch(strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Any]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](batch: String): js.Promise[IResult[Entity]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](
    batch: String,
    callback: js.Function2[/* err */ js.UndefOr[Any], /* recordset */ js.UndefOr[IResult[Entity]], Unit]
  ): Unit = js.native
  @JSName("batch")
  def batch_Entity[Entity](strings: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Entity]] = js.native
  
  def bulk(table: Table): js.Promise[IBulkResult] = js.native
  def bulk(table: Table, callback: js.Function2[/* err */ js.Error, /* result */ IBulkResult, Unit]): Unit = js.native
  def bulk(table: Table, options: IBulkOptions): js.Promise[IBulkResult] = js.native
  def bulk(
    table: Table,
    options: IBulkOptions,
    callback: js.Function2[/* err */ js.Error, /* result */ IBulkResult, Unit]
  ): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var canceled: Boolean = js.native
  
  def execute(procedure: String): js.Promise[IProcedureResult[Any]] = js.native
  def execute[Entity](
    procedure: String,
    callback: js.Function3[
      /* err */ js.UndefOr[Any], 
      /* recordsets */ js.UndefOr[IProcedureResult[Entity]], 
      /* returnValue */ js.UndefOr[Any], 
      Unit
    ]
  ): Unit = js.native
  @JSName("execute")
  def execute_Entity[Entity](procedure: String): js.Promise[IProcedureResult[Entity]] = js.native
  
  def input(name: String, `type`: js.Function0[ISqlType], value: Any): Request = js.native
  def input(name: String, `type`: ISqlType, value: Any): Request = js.native
  def input(name: String, value: Any): Request = js.native
  
  var multiple: Boolean = js.native
  
  def output(name: String, `type`: js.Function0[ISqlType]): Request = js.native
  def output(name: String, `type`: js.Function0[ISqlType], value: Any): Request = js.native
  def output(name: String, `type`: ISqlType): Request = js.native
  def output(name: String, `type`: ISqlType, value: Any): Request = js.native
  
  var parameters: IRequestParameters = js.native
  
  def pause(): Boolean = js.native
  
  def pipe(stream: WritableStream): WritableStream = js.native
  
  var pstatement: PreparedStatement = js.native
  
  def query(command: String): js.Promise[IResult[Any]] = js.native
  def query(command: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Any]] = js.native
  def query[Entity](
    command: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* recordset */ js.UndefOr[IResult[Entity]], Unit]
  ): Unit = js.native
  @JSName("query")
  def query_Entity[Entity](command: String): js.Promise[IResult[Entity]] = js.native
  @JSName("query")
  def query_Entity[Entity](command: TemplateStringsArray, interpolations: Any*): js.Promise[IResult[Entity]] = js.native
  
  def replaceInput(name: String, `type`: js.Function0[ISqlType], value: Any): Request = js.native
  def replaceInput(name: String, `type`: ISqlType, value: Any): Request = js.native
  def replaceInput(name: String, value: Any): Request = js.native
  
  def resume(): Boolean = js.native
  
  var stream: Any = js.native
  
  var transaction: Transaction = js.native
  
  var verbose: Boolean = js.native
}
