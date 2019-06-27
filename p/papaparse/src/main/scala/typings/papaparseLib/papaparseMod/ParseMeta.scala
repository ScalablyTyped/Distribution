package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMeta extends js.Object {
   // Line break sequence used
  var aborted: scala.Boolean
   // Whether preview consumed all input
  var cursor: scala.Double
  var delimiter: java.lang.String
   // Whether process was aborted
  var fields: js.Array[java.lang.String]
   // Delimiter used
  var linebreak: java.lang.String
   // Array of field names
  var truncated: scala.Boolean
}

object ParseMeta {
  @scala.inline
  def apply(
    aborted: scala.Boolean,
    cursor: scala.Double,
    delimiter: java.lang.String,
    fields: js.Array[java.lang.String],
    linebreak: java.lang.String,
    truncated: scala.Boolean
  ): ParseMeta = {
    val __obj = js.Dynamic.literal(aborted = aborted, cursor = cursor, delimiter = delimiter, fields = fields, linebreak = linebreak, truncated = truncated)
  
    __obj.asInstanceOf[ParseMeta]
  }
}

