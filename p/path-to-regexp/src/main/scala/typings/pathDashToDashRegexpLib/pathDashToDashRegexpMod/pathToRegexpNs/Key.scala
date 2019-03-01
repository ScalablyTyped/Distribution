package typings
package pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delimiter")(delimiter)
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("repeat")(repeat)
    __obj.asInstanceOf[Key]
  }
}

