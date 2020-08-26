package typings.plottable.anon

import typings.plottable.stackingUtilsMod.StackExtent
import typings.plottable.utilsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaximumExtents[D] extends js.Object {
  var maximumExtents: Map[String | Double, StackExtent[D]] = js.native
  var minimumExtents: Map[String | Double, StackExtent[D]] = js.native
}

object MaximumExtents {
  @scala.inline
  def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): MaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents.asInstanceOf[js.Any], minimumExtents = minimumExtents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumExtents[D]]
  }
  @scala.inline
  implicit class MaximumExtentsOps[Self <: MaximumExtents[_], D] (val x: Self with MaximumExtents[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaximumExtents(value: Map[String | Double, StackExtent[D]]): Self = this.set("maximumExtents", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumExtents(value: Map[String | Double, StackExtent[D]]): Self = this.set("minimumExtents", value.asInstanceOf[js.Any])
  }
  
}

