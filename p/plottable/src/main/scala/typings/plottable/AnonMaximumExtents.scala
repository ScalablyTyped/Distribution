package typings.plottable

import typings.plottable.stackingUtilsMod.StackExtent
import typings.plottable.utilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaximumExtents[D] extends js.Object {
  var maximumExtents: Map[String | Double, StackExtent[D]]
  var minimumExtents: Map[String | Double, StackExtent[D]]
}

object AnonMaximumExtents {
  @scala.inline
  def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): AnonMaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents.asInstanceOf[js.Any], minimumExtents = minimumExtents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaximumExtents[D]]
  }
}

