package typings.nivoLine.mod

import typings.nivoLine.anon.Height
import typings.nivoLine.nivoLineStrings.x
import typings.nivoLine.nivoLineStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceTooltipProps extends js.Object {
  var axis: x | y
  var slice: Height
}

object SliceTooltipProps {
  @scala.inline
  def apply(axis: x | y, slice: Height): SliceTooltipProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceTooltipProps]
  }
}

