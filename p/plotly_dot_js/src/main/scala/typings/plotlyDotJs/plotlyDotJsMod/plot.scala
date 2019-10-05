package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", "plot")
@js.native
object plot extends js.Object {
  def apply(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: Partial[Layout], config: Partial[Config]): js.Promise[PlotlyHTMLElement] = js.native
}

