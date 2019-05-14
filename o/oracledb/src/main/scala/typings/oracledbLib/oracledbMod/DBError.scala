package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBError extends js.Object {
  /**
    * The Oracle error number. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var errorNum: scala.Double
  /**
    * The text of the error message.
    *
    * The error may be a standard Oracle message with a prefix like ORA or PLS.
    *
    * Alternatively it may be a node-oracledb specific error prefixed with NJS or DPI.
    */
  var message: java.lang.String
  /**
    * Generally offset is the character offset into the SQL text that resulted in the Oracle error.
    *
    * The value may be 0 in non-SQL contexts. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var offset: scala.Double
}

object DBError {
  @scala.inline
  def apply(errorNum: scala.Double, message: java.lang.String, offset: scala.Double): DBError = {
    val __obj = js.Dynamic.literal(errorNum = errorNum, message = message, offset = offset)
  
    __obj.asInstanceOf[DBError]
  }
}

