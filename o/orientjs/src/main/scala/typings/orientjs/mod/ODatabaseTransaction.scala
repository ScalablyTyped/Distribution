package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "ODatabaseTransaction")
@js.native
class ODatabaseTransaction () extends js.Object {
  
  /**
    * Execute an SQL command against the database and retreive the results
    * @param   command    The command to execute.
    * @param   options  The options for the command
    * @return           The results of the command
    */
  def command[R](command: String): OResult[R] = js.native
  def command[R](command: String, options: js.Any): OResult[R] = js.native
  
  /**
    * Commit the transaction.
    * @return The results of the transaction.
    */
  def commit(changes: js.Any): js.Promise[_] = js.native
  
  /**
    * Rollbacks the transaction.
    * @return The results of the rollback.
    */
  def rollback(): js.Promise[Unit] = js.native
}
