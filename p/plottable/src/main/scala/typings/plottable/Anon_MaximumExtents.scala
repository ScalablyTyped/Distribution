package typings.plottable

import typings.plottable.buildSrcUtilsMod.Map
import typings.plottable.buildSrcUtilsStackingUtilsMod.StackExtent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumExtents[D] extends js.Object {
  var maximumExtents: Map[String | Double, StackExtent[D]]
  var minimumExtents: Map[String | Double, StackExtent[D]]
}

object Anon_MaximumExtents {
  @scala.inline
  def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): Anon_MaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents, minimumExtents = minimumExtents)
  
    __obj.asInstanceOf[Anon_MaximumExtents[D]]
  }
}

