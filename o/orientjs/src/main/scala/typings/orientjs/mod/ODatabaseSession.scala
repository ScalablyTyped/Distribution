package typings.orientjs.mod

import typings.orientjs.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "ODatabaseSession")
@js.native
class ODatabaseSession () extends ODatabase {
  def this(client: OrientDBClient) = this()
  def this(client: OrientDBClient, options: ODatabaseSessionOptions) = this()
  var pool: ODatabaseSessionPool = js.native
  var sessionManager: OSessionManager = js.native
  /**
    * Execute an SQL batch script against the database and retreive the results
    * @param   batch                    The SQL batch to execute.
    * @param   {Object} [options]                The options for the batch SQL
    * @param   {Number} [options.pageSize]       Page size of the streamed result set
    * @param   {Object|Array} [options.params]   Batch parameters
    * @return           The results of the batch script
    */
  def batch[R](batch: String): OResult[R] = js.native
  def batch[R](batch: String, options: AnonPageSize): OResult[R] = js.native
  /**
    * Begin a transaction in this database session. ODatabaseSession supports only 1 transaction at time.
    * Use multiple sessions if you want to run concurrent transactions.
    * @returns {ODatabaseTransaction} The new transaction
    */
  def begin(): ODatabaseTransaction = js.native
  /**
    * Close the database session. If the session is pooled, the instance is returned to the pool,
    * leaving the session open on the server.
    * Otherwhise the session is closed permanently on the server.
    *
    * @returns
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Execute an SQL command against the database and retreive the results
    * @param   command    The command to execute.
    * @param   {Object} [options]                The options for the command
    * @param   {Number} [options.pageSize]       Page size of the streamed result set
    * @param   {Object|Array} [options.params]   Command parameters
    * @return            The results of the command
    */
  def command[R](command: String): OResult[R] = js.native
  def command[R](command: String, options: AnonPageSize): OResult[R] = js.native
  /**
    * Commit the transaction.
    * @param   changes
    * @returns The results of the transaction.
    */
  def commit(changes: js.Any): js.Promise[_] = js.native
  /**
    * Execute a custom language script against the database and retreive the results
    *
    * @param   language                 The scripting language
    * @param   script                   The script to execute.
    * @param   {Object} [options]                The options for the script
    * @param   {Number} [options.pageSize]       Page size of the streamed result set
    * @param   {Object|Array} [options.params]   Script parameters
    * @return                          The results of the script
    */
  def execute[R](language: String, script: String): OResult[R] = js.native
  def execute[R](language: String, script: String, options: AnonPageSize): OResult[R] = js.native
  /**
    * Execute an SQL Live query against the database and retreive the results
    *
    * @param    query    The query to execute.
    * @param    options  The options for the batch script
    * @returns        The live query object
    */
  def liveQuery(query: String): LiveQuery = js.native
  def liveQuery(query: String, options: js.Any): LiveQuery = js.native
  /**
    * Execute an SQL query against the database and retreive the results
    * @param   query                    The query to execute.
    * @param   {Object} [options]                The options for the query
    * @param   {Number} [options.pageSize]       Page size of the streamed result set
    * @param   {Object|Array} [options.params]   Query parameters
    * @returns                         The results of the query
    */
  def query[R](query: String): OResult[R] = js.native
  def query[R](query: String, options: AnonPageSize): OResult[R] = js.native
  /**
    * Execute a unit of work in a transaction
    *
    * @param   txWork           Transactional work
    * @param   [times]                  Number of retry in case of some failures. (MVVC errors)
    * @return                          The results of transaction
    */
  def runInTransaction(txWork: js.Any): js.Promise[_] = js.native
  def runInTransaction(txWork: js.Any, times: Double): js.Promise[_] = js.native
  /**
    * Get the current transaction
    * @returns The new transaction
    */
  def tx(): ODatabaseTransaction = js.native
}

