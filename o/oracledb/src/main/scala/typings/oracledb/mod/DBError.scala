package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBError extends js.Object {
  /**
    * The Oracle error number. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var errorNum: js.UndefOr[Double] = js.undefined
  /**
    * The text of the error message.
    *
    * The error may be a standard Oracle message with a prefix like ORA or PLS.
    *
    * Alternatively it may be a node-oracledb specific error prefixed with NJS or DPI.
    */
  var message: String
  /**
    * Generally offset is the character offset into the SQL text that resulted in the Oracle error.
    *
    * The value may be 0 in non-SQL contexts. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object DBError {
  @scala.inline
  def apply(message: String, errorNum: Int | Double = null, offset: Int | Double = null): DBError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (errorNum != null) __obj.updateDynamic("errorNum")(errorNum.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBError]
  }
}

