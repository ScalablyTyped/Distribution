package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAxis extends js.Object {
  var autorange: Boolean
  var range: js.Tuple2[Double, Double]
}

object PlotAxis {
  @scala.inline
  def apply(autorange: Boolean, range: js.Tuple2[Double, Double]): PlotAxis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlotAxis]
  }
}

