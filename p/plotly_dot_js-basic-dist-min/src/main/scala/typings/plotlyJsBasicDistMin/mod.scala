package typings.plotlyJsBasicDistMin

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialFrame
import typings.plotlyJs.anon.PartialLayout
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.DownloadImgopts
import typings.plotlyJs.mod.PlotlyHTMLElement
import typings.plotlyJs.mod.PlotlyModule
import typings.plotlyJs.mod.Root
import typings.plotlyJs.mod.RootOrData
import typings.plotlyJs.mod.StaticPlots
import typings.plotlyJs.mod.ToImgopts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("plotly.js-basic-dist-min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plotly.js-basic-dist-min", "Plots")
  @js.native
  val Plots: StaticPlots = js.native
  
  inline def addFrames(root: Root, frames: js.Array[PartialFrame]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def addTraces(root: Root, traces: js.Array[Data]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def addTraces(root: Root, traces: js.Array[Data], newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def addTraces(root: Root, traces: js.Array[Data], newIndices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def addTraces(root: Root, traces: Data): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def addTraces(root: Root, traces: Data, newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def addTraces(root: Root, traces: Data, newIndices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTraces")(root.asInstanceOf[js.Any], traces.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def deleteFrames(root: Root, frames: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFrames")(root.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def deleteTraces(root: Root, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def deleteTraces(root: Root, indices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTraces")(root.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def downloadImage(root: RootOrData, opts: DownloadImgopts): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def extendTraces(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: js.Array[Data], indices: js.Array[Double], maxPoints: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: js.Array[Data], indices: Double, maxPoints: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: Data, indices: js.Array[Double], maxPoints: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def extendTraces(root: Root, update: Data, indices: Double, maxPoints: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def moveTraces(root: Root, currentIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def moveTraces(root: Root, currentIndices: js.Array[Double], newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def moveTraces(root: Root, currentIndices: js.Array[Double], newIndices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def moveTraces(root: Root, currentIndices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def moveTraces(root: Root, currentIndices: Double, newIndices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def moveTraces(root: Root, currentIndices: Double, newIndices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTraces")(root.asInstanceOf[js.Any], currentIndices.asInstanceOf[js.Any], newIndices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def newPlot(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def newPlot(root: Root, data: js.Array[Data], layout: Unit, config: PartialConfig): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def newPlot(root: Root, data: js.Array[Data], layout: PartialLayout): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def newPlot(root: Root, data: js.Array[Data], layout: PartialLayout, config: PartialConfig): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("newPlot")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def prependTraces(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def prependTraces(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def prependTraces(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def prependTraces(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("prependTraces")(root.asInstanceOf[js.Any], update.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def purge(root: Root): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purge")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def react(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def react(root: Root, data: js.Array[Data], layout: Unit, config: PartialConfig): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def react(root: Root, data: js.Array[Data], layout: PartialLayout): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def react(root: Root, data: js.Array[Data], layout: PartialLayout, config: PartialConfig): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("react")(root.asInstanceOf[js.Any], data.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def redraw(root: Root): js.Promise[PlotlyHTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("redraw")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def register(modules: js.Array[PlotlyModule]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def register(modules: PlotlyModule): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(modules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def relayout(root: Root, layout: PartialLayout): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("relayout")(root.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def restyle(root: Root, aobj: Data): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def restyle(root: Root, aobj: Data, traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def restyle(root: Root, aobj: Data, traces: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("restyle")(root.asInstanceOf[js.Any], aobj.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  
  inline def toImage(root: RootOrData): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def toImage(root: RootOrData, opts: ToImgopts): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toImage")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def update(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def update(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout, traces: js.Array[Double]): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
  inline def update(root: Root, traceUpdate: Data, layoutUpdate: PartialLayout, traces: Double): js.Promise[PlotlyHTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(root.asInstanceOf[js.Any], traceUpdate.asInstanceOf[js.Any], layoutUpdate.asInstanceOf[js.Any], traces.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PlotlyHTMLElement]]
}
