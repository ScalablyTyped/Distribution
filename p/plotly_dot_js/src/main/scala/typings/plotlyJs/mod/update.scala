package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", "update")
@js.native
object update extends js.Object {
  def apply(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout, traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout, traces: Double): js.Promise[PlotlyHTMLElement] = js.native
}

