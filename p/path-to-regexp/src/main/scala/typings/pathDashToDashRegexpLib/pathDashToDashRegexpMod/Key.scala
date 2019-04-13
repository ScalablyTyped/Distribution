package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var delimiter: java.lang.String
  var name: java.lang.String | scala.Double
  var optional: scala.Boolean
  var pattern: java.lang.String
  var prefix: java.lang.String
  var repeat: scala.Boolean
}

object Key {
  @scala.inline
  def apply(
    delimiter: java.lang.String,
    name: java.lang.String | scala.Double,
    optional: scala.Boolean,
    pattern: java.lang.String,
    prefix: java.lang.String,
    repeat: scala.Boolean
  ): Key = {
    val __obj = js.Dynamic.literal(delimiter = delimiter, name = name.asInstanceOf[js.Any], optional = optional, pattern = pattern, prefix = prefix, repeat = repeat)
  
    __obj.asInstanceOf[Key]
  }
}

