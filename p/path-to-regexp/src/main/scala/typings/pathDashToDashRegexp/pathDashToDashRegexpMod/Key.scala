package typings.pathDashToDashRegexp.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var delimiter: String
  var name: String | Double
  var optional: Boolean
  var pattern: String
  var prefix: String
  var repeat: Boolean
}

object Key {
  @scala.inline
  def apply(
    delimiter: String,
    name: String | Double,
    optional: Boolean,
    pattern: String,
    prefix: String,
    repeat: Boolean
  ): Key = {
    val __obj = js.Dynamic.literal(delimiter = delimiter, name = name.asInstanceOf[js.Any], optional = optional, pattern = pattern, prefix = prefix, repeat = repeat)
  
    __obj.asInstanceOf[Key]
  }
}

