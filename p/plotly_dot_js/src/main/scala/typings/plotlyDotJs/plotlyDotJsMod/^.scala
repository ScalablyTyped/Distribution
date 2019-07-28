package typings.plotlyDotJs.plotlyDotJsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Plots: StaticPlots = js.native
  def addFrames(root: Root, frames: js.Array[Partial[Frame]]): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data], newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data], newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data, newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data, newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def deleteFrames(root: Root, frames: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def downloadImage(root: Root, opts: DownloadImgopts): js.Promise[String] = js.native
  def extendTraces(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[Double], newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[Double], newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: Double, newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: Double, newIndices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data], layout: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data], layout: Partial[Layout], config: Partial[Config]): js.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data], layout: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data], layout: Partial[Layout], config: Partial[Config]): js.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def purge(root: Root): Unit = js.native
  def react(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def react(root: Root, data: js.Array[Data], layout: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def react(root: Root, data: js.Array[Data], layout: Partial[Layout], config: Partial[Config]): js.Promise[PlotlyHTMLElement] = js.native
  def redraw(root: Root): js.Promise[PlotlyHTMLElement] = js.native
  def relayout(root: Root, layout: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data): js.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data, traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data, traces: Double): js.Promise[PlotlyHTMLElement] = js.native
  def toImage(root: Root, opts: ToImgopts): js.Promise[String] = js.native
  def update(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout]): js.Promise[PlotlyHTMLElement] = js.native
  def update(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout], traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def update(root: Root, traceUpdate: Data, layoutUpdate: Partial[Layout], traces: Double): js.Promise[PlotlyHTMLElement] = js.native
}

