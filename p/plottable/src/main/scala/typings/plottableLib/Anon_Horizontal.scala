package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Horizontal extends js.Object {
  var horizontal: plottableLib.plottableLibStrings.horizontal
  var vertical: plottableLib.plottableLibStrings.vertical
}

object Anon_Horizontal {
  @scala.inline
  def apply(
    horizontal: plottableLib.plottableLibStrings.horizontal,
    vertical: plottableLib.plottableLibStrings.vertical
  ): Anon_Horizontal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("horizontal")(horizontal)
    __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[Anon_Horizontal]
  }
}

