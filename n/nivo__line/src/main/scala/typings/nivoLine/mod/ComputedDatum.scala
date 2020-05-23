package typings.nivoLine.mod

import typings.nivoLine.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedDatum extends js.Object {
  var data: Datum
  var position: X
}

object ComputedDatum {
  @scala.inline
  def apply(data: Datum, position: X): ComputedDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum]
  }
}

