package typings.papaparse.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMeta extends js.Object {
   // Line break sequence used
  var aborted: Boolean
   // Whether preview consumed all input
  var cursor: Double
  var delimiter: String
   // Whether process was aborted
  var fields: js.Array[String]
   // Delimiter used
  var linebreak: String
   // Array of field names
  var truncated: Boolean
}

object ParseMeta {
  @scala.inline
  def apply(
    aborted: Boolean,
    cursor: Double,
    delimiter: String,
    fields: js.Array[String],
    linebreak: String,
    truncated: Boolean
  ): ParseMeta = {
    val __obj = js.Dynamic.literal(aborted = aborted, cursor = cursor, delimiter = delimiter, fields = fields, linebreak = linebreak, truncated = truncated)
  
    __obj.asInstanceOf[ParseMeta]
  }
}

