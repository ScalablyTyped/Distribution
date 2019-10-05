package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", "update")
@js.native
object update extends js.Object {
  def apply(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout], traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout], traces: Double): js.Promise[PlotlyHTMLElement] = js.native
}

