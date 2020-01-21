package typings.neo4j.mod

import typings.request.mod.Request
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var expiresAt: Date
  var expiresIn: Date | Double
  var state: String
  def commit(callback: DoneCallback): Unit
  def cypher(options: CypherOptions, callback: ResultCallback): Request
  def renew(callback: DoneCallback): Unit
  def rollback(callback: DoneCallback): Unit
}

object Transaction {
  @scala.inline
  def apply(
    commit: DoneCallback => Unit,
    cypher: (CypherOptions, ResultCallback) => Request,
    expiresAt: Date,
    expiresIn: Date | Double,
    renew: DoneCallback => Unit,
    rollback: DoneCallback => Unit,
    state: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), cypher = js.Any.fromFunction2(cypher), expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], renew = js.Any.fromFunction1(renew), rollback = js.Any.fromFunction1(rollback), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transaction]
  }
}

