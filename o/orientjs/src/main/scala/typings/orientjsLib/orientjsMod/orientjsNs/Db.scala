package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Db
  extends nodeLib.eventsMod.EventEmitter {
  var `class`: Class = js.native
  var cluster: Cluster = js.native
  var dataSegments: js.Array[_] = js.native
  var forcePrepare: scala.Boolean = js.native
  var index: Index = js.native
  var name: java.lang.String = js.native
  var password: java.lang.String = js.native
  var record: Record = js.native
  var sequence: Sequence = js.native
  var server: Server = js.native
  var sessionId: scala.Double = js.native
  var storage: orientjsLib.orientjsLibStrings.plocal | orientjsLib.orientjsLibStrings.memory = js.native
  var token: js.Any = js.native
  var transactionId: scala.Double = js.native
  var transformerFunctions: js.Any = js.native
  var transformers: js.Any = js.native
  var `type`: orientjsLib.orientjsLibStrings.graph | orientjsLib.orientjsLibStrings.document = js.native
  var username: java.lang.String = js.native
  /**
    * Begin a new transaction.
    *
    * @return The transaction instance.
    */
  def begin(): Transaction = js.native
  /**
    * Close the database.
    *
    * @promise {Db} The now closed db instance.
    */
  def close(): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  /**
    * Configure the database instance.
    * @param  config The configuration for the database.
    * @return            The configured database object.
    */
  def configure(config: DbConfig): Db = js.native
  /**
    * Create a create query.
    *
    * @return The query instance.
    */
  def create[T](): Statement[T] = js.native
  def create[T](params: js.Any): Statement[T] = js.native
  def create[T](paramtype: java.lang.String, paramname: java.lang.String): Statement[T] = js.native
  def createFn(fn: js.Function1[/* repeated */ js.Any, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createFn(fn: js.Function1[/* repeated */ js.Any, _], options: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a orient function from a plain Javascript function
    *
    * @param   name     The name of the function
    * @param   fn       Plain Javascript function to stringify
    * @param   options  Not currently used but will be used for 'IDEMPOTENT' arg
    * @promise {Mixed}           The results of the query / command.
    */
  def createFn(name: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def createFn(name: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], options: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a query instance for this database.
    *
    * @return The query instance.
    */
  def createQuery[T](): Statement[T] = js.native
  /**
    * Create a context for a user, using their authentication token.
    * The context includes the query builder methods, which will be executed
    * on behalf of the user.
    *
    * @param  token The authentication token.
    * @return              The object containing the query builder methods.
    */
  def createUserContext(token: js.Any): js.Any = js.native
  /**
    * Create a delete query.
    *
    * @return The query instance.
    */
  def delete[T](): Statement[T] = js.native
  def delete[T](params: js.Any): Statement[T] = js.native
  /**
    * Escape the given input.
    *
    * @param  input The input to escape.
    * @return       The escaped input.
    */
  def escape(input: java.lang.String): java.lang.String = js.native
  /**
    * Execute an SQL query against the database and retreive the raw, parsed response.
    *
    * @param   query   The query or command to execute.
    * @param   options The options for the query / command.
    * @promise {Mixed}          The results of the query / command.
    */
  def exec(query: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def exec(query: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a transactional query with if.
    *
    * @return The query instance.
    */
  def `if`[T](condition: SqlExpression, statements: Statement[T]*): Statement[T] = js.native
  /**
    * Create a transactional query with if.
    *
    * @return The query instance.
    */
  def `if`[T](condition: SqlExpression, statements: js.Array[Statement[T]]): Statement[T] = js.native
  /**
    * Initialize the database instance.
    */
  def init(): scala.Unit = js.native
  /**
    * Create an insert query.
    *
    * @return The query instance.
    */
  def insert[T](): Statement[T] = js.native
  def insert[T](params: js.Any): Statement[T] = js.native
  /**
    * Create a transactional query.
    *
    * @return The query instance.
    */
  def let[T](): Statement[T] = js.native
  def let[T](name: java.lang.String, value: java.lang.String): Statement[T] = js.native
  def let[T](name: java.lang.String, value: Statement[T]): Statement[T] = js.native
  def let[T](params: js.Any): Statement[T] = js.native
  /**
    * Execute a live query against the database
    *
    * @param   query   The query or command to execute.
    * @param   options The options for the query / command.
    * @promise {Mixed}          The token of the live query.
    */
  def liveQuery(command: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def liveQuery(command: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Normalize a result, where possible.
    * @param  result The result to normalize.
    * @return        The normalized result.
    */
  def normalizeResult(result: js.Any): js.Any = js.native
  /**
    * Normalize the content for a result.
    * @param  content The content to normalize.
    * @return         The normalized content.
    */
  def normalizeResultContent(content: js.Any): js.Any = js.native
  /**
    * Open the database.
    *
    * @promise {Db} The open db instance.
    */
  def open(): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  /**
    * Execute an SQL query against the database and retreive the results
    *
    * @param   query   The query or command to execute.
    * @param   options The options for the query / command.
    * @promise {Mixed}          The results of the query / command.
    */
  def query(command: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def query(command: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a raw expression.
    *
    * @return The raw expression instance.
    */
  def rawExpression(param: java.lang.String): RawExpression = js.native
  /**
    * Register a transformer function for documents of the given class.
    * This function will be invoked for each document of the specified class
    * in all future result sets.
    *
    * @param    className   The name of the document class.
    * @param  transformer The transformer function.
    * @return                   The database instance.
    */
  def registerTransformer[T](className: java.lang.String, transformer: js.Function1[/* item */ Record, T]): Db = js.native
  /**
    * Reload the configuration for the database.
    *
    * @promise {Db}  The database with reloaded configuration.
    */
  def reload(): bluebirdLib.bluebirdMod.namespaced[Db] = js.native
  /**
    * Create a select query.
    *
    * @return The query instance.
    */
  def select[T](): Statement[T] = js.native
  def select[T](params: js.Any): Statement[T] = js.native
  /**
    * Send the given operation to the server, ensuring the
    * database is open first.
    *
    * @param  operation The operation to send.
    * @param  data       The data for the operation.
    * @promise {Mixed}            The result of the operation.
    */
  def send(operation: scala.Double, data: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a sql Function.
    *
    * @return The sql function instance.
    */
  def sqlFunction(): SqlFunction = js.native
  def sqlFunction(options: js.Any): SqlFunction = js.native
  /**
    * Transform a document according to its `@class` property, using the registered transformers.
    * @param  document The document to transform.
    * @return           The transformed document.
    */
  def transformDocument(document: ODocument): js.Any = js.native
  /**
    * Create a traverse query.
    *
    * @return The query instance.
    */
  def traverse[T](): Statement[T] = js.native
  def traverse[T](params: js.Any): Statement[T] = js.native
  /**
    * Create an update query.
    *
    * @return The query instance.
    */
  def update[T](): Statement[T] = js.native
  def update[T](params: js.Any): Statement[T] = js.native
}

