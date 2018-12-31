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
  def cypher(options: CypherOptions, callback: neo4jLib.ResultCallback): requestLib.requestMod.requestNs.Request
  def renew(callback: neo4jLib.DoneCallback): scala.Unit
  def rollback(callback: neo4jLib.DoneCallback): scala.Unit
}

