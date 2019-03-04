package typings
package plotlyDotJsLib.plotlyDotJsMod

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
    val __obj = js.Dynamic.literal(points = points)
    if (lassoPoints != null) __obj.updateDynamic("lassoPoints")(lassoPoints)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PlotSelectionEvent]
  }
}

