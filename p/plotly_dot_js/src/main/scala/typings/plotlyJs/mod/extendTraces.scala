package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", "extendTraces")
@js.native
object extendTraces extends js.Object {
  def apply(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = js.native
}

