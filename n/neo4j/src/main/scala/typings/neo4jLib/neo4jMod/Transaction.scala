package typings
package neo4jLib.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var expiresAt: stdLib.Date
  var expiresIn: stdLib.Date | scala.Double
  var state: java.lang.String
  def commit(callback: neo4jLib.DoneCallback): scala.Unit
  def cypher(options: CypherOptions, callback: neo4jLib.ResultCallback): requestLib.requestMod.Request
  def renew(callback: neo4jLib.DoneCallback): scala.Unit
  def rollback(callback: neo4jLib.DoneCallback): scala.Unit
}

object Transaction {
  @scala.inline
  def apply(
    commit: neo4jLib.DoneCallback => scala.Unit,
    cypher: (CypherOptions, neo4jLib.ResultCallback) => requestLib.requestMod.Request,
    expiresAt: stdLib.Date,
    expiresIn: stdLib.Date | scala.Double,
    renew: neo4jLib.DoneCallback => scala.Unit,
    rollback: neo4jLib.DoneCallback => scala.Unit,
    state: java.lang.String
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), cypher = js.Any.fromFunction2(cypher), expiresAt = expiresAt, expiresIn = expiresIn.asInstanceOf[js.Any], renew = js.Any.fromFunction1(renew), rollback = js.Any.fromFunction1(rollback), state = state)
  
    __obj.asInstanceOf[Transaction]
  }
}

