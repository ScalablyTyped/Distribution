package typings.nivoLine.mod

import typings.nivoLine.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedDatum extends js.Object {
  var data: Datum
  var position: AnonX
}

object ComputedDatum {
  @scala.inline
  def apply(data: Datum, position: AnonX): ComputedDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum]
  }
}

