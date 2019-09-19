package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "ODatabaseTransaction")
@js.native
class ODatabaseTransaction () extends js.Object {
  /**
    * Execute an SQL command against the database and retreive the results
    * @param   command    The command to execute.
    * @param   options  The options for the command
    * @return           The results of the command
    */
  def command(command: String): OResult = js.native
  def command(command: String, options: js.Any): OResult = js.native
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

