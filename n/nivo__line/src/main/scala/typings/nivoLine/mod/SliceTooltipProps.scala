package typings.nivoLine.mod

import typings.nivoLine.AnonHeight
import typings.nivoLine.nivoLineStrings.x
import typings.nivoLine.nivoLineStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceTooltipProps extends js.Object {
  var axis: x | y
  var slice: AnonHeight
}

object SliceTooltipProps {
  @scala.inline
  def apply(axis: x | y, slice: AnonHeight): SliceTooltipProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SliceTooltipProps]
  }
}

