package typings
package oracledbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operation extends js.Object {
  /** One of the CQN_OPCODE_* constants. */
  var operation: scala.Double
  /** ROWID of the row that was affected. */
  var rowid: java.lang.String
}

object Anon_Operation {
  @scala.inline
  def apply(operation: scala.Double, rowid: java.lang.String): Anon_Operation = {
    val __obj = js.Dynamic.literal(operation = operation, rowid = rowid)
  
    __obj.asInstanceOf[Anon_Operation]
  }
}

