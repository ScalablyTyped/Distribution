package typings.postcss.mod

import typings.postcss.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSource extends js.Object {
  /**
    * The ending position of the node's source.
    */
  var end: js.UndefOr[AnonColumn] = js.undefined
  var input: Input
  /**
    * The starting position of the node's source.
    */
  var start: js.UndefOr[AnonColumn] = js.undefined
}

object NodeSource {
  @scala.inline
  def apply(input: Input, end: AnonColumn = null, start: AnonColumn = null): NodeSource = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSource]
  }
}

