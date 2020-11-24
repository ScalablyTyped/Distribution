package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plotly.js", "addTraces")
@js.native
object addTraces extends js.Object {
  
  def apply(root: Root, traces: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traces: js.Array[Data], newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traces: js.Array[Data], newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traces: Data): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traces: Data, newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, traces: Data, newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
}
