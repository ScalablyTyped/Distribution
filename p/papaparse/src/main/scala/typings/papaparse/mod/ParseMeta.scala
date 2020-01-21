package typings.papaparse.mod

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
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], linebreak = linebreak.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseMeta]
  }
}

