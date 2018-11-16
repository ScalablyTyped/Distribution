package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", JSImport.Namespace)
@js.native
object plotlyDotJsModMembers extends js.Object {
  val Plots: StaticPlots = js.native
  val d3: js.Any = js.native
  def addFrames(root: Root, frames: js.Array[stdLib.Partial[Frame]]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data], newIndices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: js.Array[Data], newIndices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data, newIndices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def addTraces(root: Root, traces: Data, newIndices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def deleteFrames(root: Root, frames: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def deleteTraces(root: Root, indices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def downloadImage(root: Root, opts: DownloadImgopts): stdLib.Promise[java.lang.String] = js.native
  def extendTraces(root: Root, update: js.Array[Data], indices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: js.Array[Data], indices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: Data, indices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def extendTraces(root: Root, update: Data, indices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[scala.Double], newIndices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: js.Array[scala.Double], newIndices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: scala.Double, newIndices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def moveTraces(root: Root, currentIndices: scala.Double, newIndices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def newPlot(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout], config: stdLib.Partial[Config]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def plot(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout], config: stdLib.Partial[Config]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: js.Array[Data], indices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: js.Array[Data], indices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: Data, indices: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def prependTraces(root: Root, update: Data, indices: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def purge(root: Root): scala.Unit = js.native
  def react(root: Root, data: js.Array[Data]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def react(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def react(root: Root, data: js.Array[Data], layout: stdLib.Partial[Layout], config: stdLib.Partial[Config]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def redraw(root: Root): stdLib.Promise[PlotlyHTMLElement] = js.native
  def relayout(root: Root, layout: stdLib.Partial[Layout]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data): stdLib.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data, traces: js.Array[scala.Double]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def restyle(root: Root, aobj: Data, traces: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
  def toImage(root: Root, opts: ToImgopts): stdLib.Promise[java.lang.String] = js.native
  def update(root: Root, traceUpdate: Data, layoutUpdate: stdLib.Partial[Layout]): stdLib.Promise[PlotlyHTMLElement] = js.native
  def update(
    root: Root,
    traceUpdate: Data,
    layoutUpdate: stdLib.Partial[Layout],
    traces: js.Array[scala.Double]
  ): stdLib.Promise[PlotlyHTMLElement] = js.native
  def update(root: Root, traceUpdate: Data, layoutUpdate: stdLib.Partial[Layout], traces: scala.Double): stdLib.Promise[PlotlyHTMLElement] = js.native
}

