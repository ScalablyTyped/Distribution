package typings.nivoLine.mod

import typings.nivoLine.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieDatum extends js.Object {
  var data: LineDatum
  var position: AnonX
}

object LineComputedSerieDatum {
  @scala.inline
  def apply(data: LineDatum, position: AnonX): LineComputedSerieDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LineComputedSerieDatum]
  }
}

