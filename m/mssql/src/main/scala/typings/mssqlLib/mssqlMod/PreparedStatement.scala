package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "PreparedStatement")
@js.native
class PreparedStatement ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(connection: ConnectionPool) = this()
  var parameters: IRequestParameters = js.native
  var prepared: scala.Boolean = js.native
  var statement: java.lang.String = js.native
  var stream: js.Any = js.native
  var transaction: Transaction = js.native
  def execute(values: js.Object): stdLib.Promise[IProcedureResult[_]] = js.native
  def execute(
    values: js.Object,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* result */ js.UndefOr[IProcedureResult[_]], 
      scala.Unit
    ]
  ): Request = js.native
  @JSName("execute")
  def execute_Entity[Entity](values: js.Object): stdLib.Promise[IProcedureResult[Entity]] = js.native
  @JSName("execute")
  def execute_Entity[Entity](
    values: js.Object,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* result */ js.UndefOr[IProcedureResult[Entity]], 
      scala.Unit
    ]
  ): Request = js.native
  def input(name: java.lang.String, `type`: js.Function0[ISqlType]): PreparedStatement = js.native
  def input(name: java.lang.String, `type`: ISqlType): PreparedStatement = js.native
  def output(name: java.lang.String, `type`: js.Function0[ISqlType]): PreparedStatement = js.native
  def output(name: java.lang.String, `type`: ISqlType): PreparedStatement = js.native
  def prepare(): PreparedStatement = js.native
  def prepare(statement: java.lang.String): PreparedStatement = js.native
  def prepare(
    statement: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): PreparedStatement = js.native
  @JSName("prepare")
  def prepare_Promise(): stdLib.Promise[scala.Unit] = js.native
  @JSName("prepare")
  def prepare_Promise(statement: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def unprepare(): stdLib.Promise[scala.Unit] = js.native
  def unprepare(callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): PreparedStatement = js.native
}

