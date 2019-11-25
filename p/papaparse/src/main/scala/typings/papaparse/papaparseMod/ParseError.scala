package typings.papaparse.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
   // A generalization of the error
  var code: String
   // Standardized error code
  var message: String
   // Human-readable details
  var row: Double
  var `type`: String
}

object ParseError {
  @scala.inline
  def apply(code: String, message: String, row: Double, `type`: String): ParseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseError]
  }
}

