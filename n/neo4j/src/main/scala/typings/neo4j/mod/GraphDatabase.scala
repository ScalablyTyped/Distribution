package typings.neo4j.mod

import typings.request.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("neo4j", "GraphDatabase")
@js.native
class GraphDatabase protected () extends js.Object {
  /**
    * Constructor.
    * @constructor
    * @param {GraphDatabaseOptions} options Connection options.
    */
  def this(options: GraphDatabaseOptions) = this()
  /**
    * Constructor.
    * @constructor
    * @param {string} url A URL connection.
    */
  def this(url: String) = this()
  /**
    * Agent.
    * @type {any}
    */
  var agent: js.Any = js.native
  /**
    * Credentials.
    * @type {Authentication}
    */
  var auth: Authentication = js.native
  /**
    * Proxy.
    * @type {any}
    */
  var proxy: js.Any = js.native
  /**
    * URL connection.
    * @type {string}
    */
  var url: String = js.native
  /**
    * Makes multiple queries, across multiple network requests, all within a single transaction.
    * @return {Transaction} The transaction.
    */
  def beginTransaction(): Transaction = js.native
  /**
    * Changes password.
    * @param {ChangePasswordOptions}   options     Options.
    * @param {DoneCallback}            callback    A callback.
    */
  def changePassword(options: ChangePasswordOptions, callback: DoneCallback): Unit = js.native
  /**
    * Checks if the password must be changed.
    * @param {Function} callback A callback.
    */
  def checkPasswordChangeNeeded(callback: js.Function2[/* error */ js.Any, /* changed */ Boolean, Unit]): Unit = js.native
  /**
    * Creates a constraint.
    * @param {ConstraintOptions}   options   Options.
    * @param {ResultCallback}      callback  A callback.
    */
  def createConstraint(options: ConstraintOptions, callback: ResultCallback): Unit = js.native
  /**
    * Makes simple, parametrized Cypher queries.
    * @param {CypherOptions}   options     Options.
    * @param {ResultCallback}  callback    A callback.
    */
  def cypher(options: CypherOptions, callback: ResultCallback): Request = js.native
  /**
    * Drops a constraint.
    * @param {ConstraintOptions}   options   Options.
    * @param {DoneCallback}        callback  A callback.
    */
  def dropConstraint(options: ConstraintOptions, callback: DoneCallback): Unit = js.native
  /**
    * Drop an index.
    * @param {IndexOptions}    options   Options.
    * @param {DoneCallback}    callback  A callback.
    */
  def dropIndex(options: IndexOptions, callback: DoneCallback): Unit = js.native
  /**
    * Gets constraints.
    * @param {ConstraintOptions}   options     Options or callback.
    * @param {ResultCallback}      callback    A callback.
    */
  def getConstraints(options: ConstraintOptions): Unit = js.native
  def getConstraints(options: ConstraintOptions, callback: ResultCallback): Unit = js.native
  /**
    * Gets indexes.
    * @param {ResultCallback} callback A callback.
    */
  def getIndexes(): Unit = js.native
  def getIndexes(callback: ResultCallback): Unit = js.native
  /**
    * Gets indexes.
    * @param {IndexOptions}    options     Options.
    * @param {ResultCallback}  callback    A callback.
    */
  def getIndexes(options: IndexOptions, callback: ResultCallback): Unit = js.native
  /**
    * Get labels.
    * @param {ResultCallback} callback A callback.
    */
  def getLabels(callback: ResultCallback): Unit = js.native
  /**
    * Gets property keys.
    * @param {ResultCallback} callback A callback.
    */
  def getPropertyKeys(callback: ResultCallback): Unit = js.native
  /**
    * Gets relationship types.
    * @param {ResultCallback} callback A callback.
    */
  def getRelationshipTypes(callback: ResultCallback): Unit = js.native
  /**
    * Determines if a constraint exists.
    * @param {ConstraintOptions}   options   Options.
    * @param {Function}            callback  A callback.
    */
  def hasConstraint(options: ConstraintOptions, callback: js.Function2[/* error */ js.Any, /* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Determines if an index exists.
    * @param {IndexOptions}    options   Options.
    * @param {Function}        callback  A callback.
    */
  def hasIndex(options: IndexOptions, callback: js.Function2[/* error */ js.Any, /* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Makes arbitrary HTTP request to the REST API.
    * @param {HttpOptions}     options     Options.
    * @param {ResultCallback}  callback    A callback.
    * @return {Request} The HTTP request.
    */
  def http(options: HttpOptions, callback: ResultCallback): Request = js.native
}

