package typings.mssql.mod

import typings.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "PreparedStatement")
@js.native
open class PreparedStatement () extends EventEmitter {
  def this(connection: ConnectionPool) = this()
  def this(transaction: Transaction) = this()
  
  def execute(values: js.Object): js.Promise[IProcedureResult[Any]] = js.native
  def execute(
    values: js.Object,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[IProcedureResult[Any]], Unit]
  ): Request = js.native
  @JSName("execute")
  def execute_Entity[Entity](values: js.Object): js.Promise[IProcedureResult[Entity]] = js.native
  @JSName("execute")
  def execute_Entity[Entity](
    values: js.Object,
    callback: js.Function2[
      /* err */ js.UndefOr[js.Error], 
      /* result */ js.UndefOr[IProcedureResult[Entity]], 
      Unit
    ]
  ): Request = js.native
  
  def input(name: String, `type`: js.Function0[ISqlType]): PreparedStatement = js.native
  def input(name: String, `type`: ISqlType): PreparedStatement = js.native
  
  def output(name: String, `type`: js.Function0[ISqlType]): PreparedStatement = js.native
  def output(name: String, `type`: ISqlType): PreparedStatement = js.native
  
  var parameters: IRequestParameters = js.native
  
  def prepare(): PreparedStatement = js.native
  def prepare(statement: String): PreparedStatement = js.native
  def prepare(statement: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): PreparedStatement = js.native
  def prepare(statement: Unit, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): PreparedStatement = js.native
  @JSName("prepare")
  def prepare_Promise(): js.Promise[Unit] = js.native
  @JSName("prepare")
  def prepare_Promise(statement: String): js.Promise[Unit] = js.native
  
  var prepared: Boolean = js.native
  
  var statement: String = js.native
  
  var stream: Any = js.native
  
  var transaction: Transaction = js.native
  
  def unprepare(): js.Promise[Unit] = js.native
  def unprepare(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): PreparedStatement = js.native
}
