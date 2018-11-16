package typings
package neo4jLib.neo4jMod

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
  def this(url: java.lang.String) = this()
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
  var url: java.lang.String = js.native
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
  def changePassword(options: ChangePasswordOptions, callback: neo4jLib.DoneCallback): scala.Unit = js.native
  /**
       * Checks if the password must be changed.
       * @param {Function} callback A callback.
       */
  def checkPasswordChangeNeeded(callback: js.Function2[/* error */ js.Any, /* changed */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
       * Creates a constraint.
       * @param {ConstraintOptions}   options   Options.
       * @param {ResultCallback}      callback  A callback.
       */
  def createConstraint(options: ConstraintOptions, callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Makes simple, parametrized Cypher queries.
       * @param {CypherOptions}   options     Options.
       * @param {ResultCallback}  callback    A callback.
       */
  def cypher(options: CypherOptions, callback: neo4jLib.ResultCallback): requestLib.requestMod.requestNs.Request = js.native
  /**
       * Drops a constraint.
       * @param {ConstraintOptions}   options   Options.
       * @param {DoneCallback}        callback  A callback.
       */
  def dropConstraint(options: ConstraintOptions, callback: neo4jLib.DoneCallback): scala.Unit = js.native
  /**
       * Drop an index.
       * @param {IndexOptions}    options   Options.
       * @param {DoneCallback}    callback  A callback.
       */
  def dropIndex(options: IndexOptions, callback: neo4jLib.DoneCallback): scala.Unit = js.native
  /**
       * Gets constraints.
       * @param {ConstraintOptions}   options     Options or callback.
       * @param {ResultCallback}      callback    A callback.
       */
  def getConstraints(options: ConstraintOptions): scala.Unit = js.native
  /**
       * Gets constraints.
       * @param {ConstraintOptions}   options     Options or callback.
       * @param {ResultCallback}      callback    A callback.
       */
  def getConstraints(options: ConstraintOptions, callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Gets indexes.
       * @param {ResultCallback} callback A callback.
       */
  def getIndexes(): scala.Unit = js.native
  /**
       * Gets indexes.
       * @param {ResultCallback} callback A callback.
       */
  def getIndexes(callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Gets indexes.
       * @param {IndexOptions}    options     Options.
       * @param {ResultCallback}  callback    A callback.
       */
  def getIndexes(options: IndexOptions, callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Get labels.
       * @param {ResultCallback} callback A callback.
       */
  def getLabels(callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Gets property keys.
       * @param {ResultCallback} callback A callback.
       */
  def getPropertyKeys(callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Gets relationship types.
       * @param {ResultCallback} callback A callback.
       */
  def getRelationshipTypes(callback: neo4jLib.ResultCallback): scala.Unit = js.native
  /**
       * Determines if a constraint exists.
       * @param {ConstraintOptions}   options   Options.
       * @param {Function}            callback  A callback.
       */
  def hasConstraint(
    options: ConstraintOptions,
    callback: js.Function2[/* error */ js.Any, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Determines if an index exists.
       * @param {IndexOptions}    options   Options.
       * @param {Function}        callback  A callback.
       */
  def hasIndex(
    options: IndexOptions,
    callback: js.Function2[/* error */ js.Any, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Makes arbitrary HTTP request to the REST API.
       * @param {HttpOptions}     options     Options.
       * @param {ResultCallback}  callback    A callback.
       * @return {Request} The HTTP request.
       */
  def http(options: HttpOptions, callback: neo4jLib.ResultCallback): requestLib.requestMod.requestNs.Request = js.native
}

