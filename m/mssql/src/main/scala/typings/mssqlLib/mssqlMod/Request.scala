package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "Request")
@js.native
class Request ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(connection: ConnectionPool) = this()
  def this(preparedStatement: PreparedStatement) = this()
  def this(transaction: Transaction) = this()
  var canceled: scala.Boolean = js.native
  var multiple: scala.Boolean = js.native
  var parameters: IRequestParameters = js.native
  var pstatement: PreparedStatement = js.native
  var stream: js.Any = js.native
  var transaction: Transaction = js.native
  var verbose: scala.Boolean = js.native
  def batch(batch: java.lang.String): stdLib.Promise[IResult[_]] = js.native
  def batch(
    batch: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* recordset */ js.UndefOr[IResult[_]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("batch")
  def batch_Entity[Entity](batch: java.lang.String): stdLib.Promise[IResult[Entity]] = js.native
  @JSName("batch")
  def batch_Entity[Entity](
    batch: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[js.Any], 
      /* recordset */ js.UndefOr[IResult[Entity]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def bulk(table: Table): stdLib.Promise[scala.Double] = js.native
  def bulk(table: Table, callback: js.Function2[/* err */ nodeLib.Error, /* rowCount */ js.Any, scala.Unit]): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def execute(procedure: java.lang.String): stdLib.Promise[IProcedureResult[_]] = js.native
  def execute[Entity](
    procedure: java.lang.String,
    callback: js.Function3[
      /* err */ js.UndefOr[js.Any], 
      /* recordsets */ js.UndefOr[IProcedureResult[Entity]], 
      /* returnValue */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("execute")
  def execute_Entity[Entity](procedure: java.lang.String): stdLib.Promise[IProcedureResult[Entity]] = js.native
  def input(name: java.lang.String, `type`: js.Function0[ISqlType], value: js.Any): Request = js.native
  def input(name: java.lang.String, `type`: ISqlType, value: js.Any): Request = js.native
  def input(name: java.lang.String, value: js.Any): Request = js.native
  def output(name: java.lang.String, `type`: js.Function0[ISqlType]): Request = js.native
  def output(name: java.lang.String, `type`: js.Function0[ISqlType], value: js.Any): Request = js.native
  def output(name: java.lang.String, `type`: ISqlType): Request = js.native
  def output(name: java.lang.String, `type`: ISqlType, value: js.Any): Request = js.native
  def pipe(stream: nodeLib.NodeJSNs.WritableStream): nodeLib.NodeJSNs.WritableStream = js.native
  def query(command: java.lang.String): stdLib.Promise[IResult[_]] = js.native
  def query[Entity](
    command: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* recordset */ js.UndefOr[IResult[Entity]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("query")
  def query_Entity[Entity](command: java.lang.String): stdLib.Promise[IResult[Entity]] = js.native
}

