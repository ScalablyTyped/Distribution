package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSelectionEvent extends js.Object {
  var lassoPoints: js.UndefOr[SelectionRange] = js.undefined
  var points: js.Array[PlotDatum]
  var range: js.UndefOr[SelectionRange] = js.undefined
}

object PlotSelectionEvent {
  @scala.inline
  def apply(points: js.Array[PlotDatum], lassoPoints: SelectionRange = null, range: SelectionRange = null): PlotSelectionEvent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (lassoPoints != null) __obj.updateDynamic("lassoPoints")(lassoPoints.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSelectionEvent]
  }
}

