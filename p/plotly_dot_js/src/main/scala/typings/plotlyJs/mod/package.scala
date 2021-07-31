package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Plots: typings.plotlyJs.mod.StaticPlots = typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Plots").asInstanceOf[typings.plotlyJs.mod.StaticPlots]

@scala.inline
def addFrames(root: typings.plotlyJs.mod.Root, frames: js.Array[typings.plotlyJs.anon.PartialFrame]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def addTraces(root: typings.plotlyJs.mod.Root, traces: js.Array[typings.plotlyJs.mod.Data]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def addTraces(
  root: typings.plotlyJs.mod.Root,
  traces: js.Array[typings.plotlyJs.mod.Data],
  newIndices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def addTraces(
  root: typings.plotlyJs.mod.Root,
  traces: js.Array[typings.plotlyJs.mod.Data],
  newIndices: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def addTraces(root: typings.plotlyJs.mod.Root, traces: typings.plotlyJs.mod.Data): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def addTraces(
  root: typings.plotlyJs.mod.Root,
  traces: typings.plotlyJs.mod.Data,
  newIndices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def addTraces(root: typings.plotlyJs.mod.Root, traces: typings.plotlyJs.mod.Data, newIndices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def deleteFrames(root: typings.plotlyJs.mod.Root, frames: js.Array[scala.Double]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def deleteTraces(root: typings.plotlyJs.mod.Root, indices: js.Array[scala.Double]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def deleteTraces(root: typings.plotlyJs.mod.Root, indices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def downloadImage(root: typings.plotlyJs.mod.Root, opts: typings.plotlyJs.mod.DownloadImgopts): js.Promise[java.lang.String] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]

@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: js.Array[scala.Double],
  maxPoints: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: scala.Double,
  maxPoints: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: typings.plotlyJs.mod.Data,
  indices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: typings.plotlyJs.mod.Data,
  indices: js.Array[scala.Double],
  maxPoints: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(root: typings.plotlyJs.mod.Root, update: typings.plotlyJs.mod.Data, indices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def extendTraces(
  root: typings.plotlyJs.mod.Root,
  update: typings.plotlyJs.mod.Data,
  indices: scala.Double,
  maxPoints: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def moveTraces(root: typings.plotlyJs.mod.Root, currentIndices: js.Array[scala.Double]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def moveTraces(
  root: typings.plotlyJs.mod.Root,
  currentIndices: js.Array[scala.Double],
  newIndices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def moveTraces(root: typings.plotlyJs.mod.Root, currentIndices: js.Array[scala.Double], newIndices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def moveTraces(root: typings.plotlyJs.mod.Root, currentIndices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def moveTraces(root: typings.plotlyJs.mod.Root, currentIndices: scala.Double, newIndices: js.Array[scala.Double]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def moveTraces(root: typings.plotlyJs.mod.Root, currentIndices: scala.Double, newIndices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def newPlot(root: typings.plotlyJs.mod.Root, data: js.Array[typings.plotlyJs.mod.Data]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def newPlot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: scala.Unit,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def newPlot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def newPlot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def plot(root: typings.plotlyJs.mod.Root, data: js.Array[typings.plotlyJs.mod.Data]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def plot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: scala.Unit,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def plot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def plot(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("plot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def prependTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def prependTraces(
  root: typings.plotlyJs.mod.Root,
  update: js.Array[typings.plotlyJs.mod.Data],
  indices: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def prependTraces(
  root: typings.plotlyJs.mod.Root,
  update: typings.plotlyJs.mod.Data,
  indices: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def prependTraces(root: typings.plotlyJs.mod.Root, update: typings.plotlyJs.mod.Data, indices: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def purge(root: typings.plotlyJs.mod.Root): scala.Unit = typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("purge")(root.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def react(root: typings.plotlyJs.mod.Root, data: js.Array[typings.plotlyJs.mod.Data]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def react(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: scala.Unit,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def react(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def react(
  root: typings.plotlyJs.mod.Root,
  data: js.Array[typings.plotlyJs.mod.Data],
  layout: typings.plotlyJs.anon.PartialLayout,
  config: typings.plotlyJs.anon.PartialConfig
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def redraw(root: typings.plotlyJs.mod.Root): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redraw")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def relayout(root: typings.plotlyJs.mod.Root, layout: typings.plotlyJs.anon.PartialLayout): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("relayout")(root.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def restyle(root: typings.plotlyJs.mod.Root, aobj: typings.plotlyJs.mod.Data): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def restyle(root: typings.plotlyJs.mod.Root, aobj: typings.plotlyJs.mod.Data, traces: js.Array[scala.Double]): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def restyle(root: typings.plotlyJs.mod.Root, aobj: typings.plotlyJs.mod.Data, traces: scala.Double): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

@scala.inline
def toImage(root: typings.plotlyJs.mod.Root, opts: typings.plotlyJs.mod.ToImgopts): js.Promise[java.lang.String] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]

@scala.inline
def update(
  root: typings.plotlyJs.mod.Root,
  traceUpdate: typings.plotlyJs.mod.Data,
  layoutUpdate: typings.plotlyJs.anon.PartialLayout
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def update(
  root: typings.plotlyJs.mod.Root,
  traceUpdate: typings.plotlyJs.mod.Data,
  layoutUpdate: typings.plotlyJs.anon.PartialLayout,
  traces: js.Array[scala.Double]
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]
@scala.inline
def update(
  root: typings.plotlyJs.mod.Root,
  traceUpdate: typings.plotlyJs.mod.Data,
  layoutUpdate: typings.plotlyJs.anon.PartialLayout,
  traces: scala.Double
): js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement] = (typings.plotlyJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.plotlyJs.mod.PlotlyHTMLElement]]

type ButtonClickEvent = js.Function2[
/* gd */ typings.plotlyJs.mod.PlotlyHTMLElement, 
/* ev */ typings.std.MouseEvent, 
scala.Unit]

type Color = java.lang.String | scala.Double | (js.Array[
js.UndefOr[
  (js.Array[js.UndefOr[java.lang.String | scala.Double | scala.Null]]) | scala.Double | scala.Null | java.lang.String
]])

type ColorScale = java.lang.String | (js.Array[java.lang.String | (js.Tuple2[scala.Double, java.lang.String])])

type DTickValue = scala.Double | java.lang.String

type Datum = java.lang.String | scala.Double | typings.std.Date | scala.Null

type ErrorBar = typings.plotlyJs.anon.PartialErrorOptions & (typings.plotlyJs.anon.Type | typings.plotlyJs.anon.Array)

type MarkerSymbol = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])

type PlotRestyleEvent = js.Tuple2[typings.plotlyJs.mod.PlotRestyleEventUpdate, js.Array[scala.Double]]

type PlotRestyleEventUpdate = org.scalablytyped.runtime.StringDictionary[js.Any]

type Root = java.lang.String | typings.std.HTMLElement

type ScatterData = typings.plotlyJs.mod.PlotData

type ScatterMarker = typings.plotlyJs.mod.PlotMarker

type TypedArray = typings.std.Int8Array | typings.std.Uint8Array | typings.std.Int16Array | typings.std.Uint16Array | typings.std.Int32Array | typings.std.Uint32Array | typings.std.Uint8ClampedArray | typings.std.Float32Array | typings.std.Float64Array
