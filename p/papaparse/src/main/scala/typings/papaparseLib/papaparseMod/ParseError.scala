package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseError extends js.Object {
       // A generalization of the error
  var code: java.lang.String
       // Standardized error code
  var message: java.lang.String
    // Human-readable details
  var row: scala.Double
  var `type`: java.lang.String
}

object ParseError {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String, row: scala.Double, `type`: java.lang.String): ParseError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[ParseError]
  }
}

