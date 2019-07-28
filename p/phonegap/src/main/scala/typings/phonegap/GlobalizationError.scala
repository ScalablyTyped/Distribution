package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationError extends js.Object {
  var code: Double
  var message: String
}

@JSGlobal("GlobalizationError")
@js.native
object GlobalizationError extends js.Object {
  var FORMATTING_ERROR: Double = js.native
  var PARSING_ERROR: Double = js.native
  var PATTERN_ERROR: Double = js.native
  var UNKNOWN_ERROR: Double = js.native
}

