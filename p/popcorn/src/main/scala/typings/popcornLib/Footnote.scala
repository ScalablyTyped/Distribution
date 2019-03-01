package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Footnote extends js.Object {
  var end: scala.Double
  var start: scala.Double
  var target: java.lang.String
  var text: java.lang.String
}

object Footnote {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, target: java.lang.String, text: java.lang.String): Footnote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Footnote]
  }
}

