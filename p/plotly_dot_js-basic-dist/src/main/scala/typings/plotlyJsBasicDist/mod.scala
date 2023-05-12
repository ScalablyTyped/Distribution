package typings.plotlyJsBasicDist

import typings.plotlyJs.anon.PartialConfig
import typings.plotlyJs.anon.PartialFrame
import typings.plotlyJs.anon.PartialLayout
import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.DownloadImgopts
import typings.plotlyJs.mod.Icon
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
  
  @JSImport("plotly.js-basic-dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {[ K in plotly.js.plotly.js.DefaultIcons ]: plotly.js.plotly.js.Icon} */
  object Icons {
    
    @JSImport("plotly.js-basic-dist", "Icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plotly.js-basic-dist", "Icons.3d_rotate")
    @js.native
    val `3dRotate`: Icon = js.native
    
    @JSImport("plotly.js-basic-dist", "Icons.autoscale")
    @js.native
    def autoscale: Icon = js.native
    inline def autoscale_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoscale")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.camera")
    @js.native
    def camera: Icon = js.native
    
    @JSImport("plotly.js-basic-dist", "Icons.camera-retro")
    @js.native
    def cameraRetro: Icon = js.native
    
    inline def cameraRetro_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("camera-retro")(x.asInstanceOf[js.Any])
    
    inline def camera_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("camera")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.disk")
    @js.native
    def disk: Icon = js.native
    inline def disk_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disk")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.drawcircle")
    @js.native
    def drawcircle: Icon = js.native
    inline def drawcircle_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawcircle")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.drawclosedpath")
    @js.native
    def drawclosedpath: Icon = js.native
    inline def drawclosedpath_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawclosedpath")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.drawline")
    @js.native
    def drawline: Icon = js.native
    inline def drawline_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawline")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.drawopenpath")
    @js.native
    def drawopenpath: Icon = js.native
    inline def drawopenpath_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawopenpath")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.drawrect")
    @js.native
    def drawrect: Icon = js.native
    inline def drawrect_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawrect")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.eraseshape")
    @js.native
    def eraseshape: Icon = js.native
    inline def eraseshape_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseshape")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.home")
    @js.native
    def home: Icon = js.native
    inline def home_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("home")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.lasso")
    @js.native
    def lasso: Icon = js.native
    inline def lasso_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lasso")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.movie")
    @js.native
    def movie: Icon = js.native
    inline def movie_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("movie")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.newplotlylogo")
    @js.native
    def newplotlylogo: Icon = js.native
    inline def newplotlylogo_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newplotlylogo")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.pan")
    @js.native
    def pan: Icon = js.native
    inline def pan_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pan")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.pencil")
    @js.native
    def pencil: Icon = js.native
    inline def pencil_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pencil")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.plotlylogo")
    @js.native
    def plotlylogo: Icon = js.native
    inline def plotlylogo_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plotlylogo")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.question")
    @js.native
    def question: Icon = js.native
    inline def question_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.selectbox")
    @js.native
    def selectbox: Icon = js.native
    inline def selectbox_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectbox")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.spikeline")
    @js.native
    def spikeline: Icon = js.native
    inline def spikeline_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spikeline")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.tooltip_basic")
    @js.native
    def tooltipBasic: Icon = js.native
    
    inline def tooltipBasic_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip_basic")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.tooltip_compare")
    @js.native
    def tooltipCompare: Icon = js.native
    
    inline def tooltipCompare_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip_compare")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.undo")
    @js.native
    def undo: Icon = js.native
    inline def undo_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undo")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.z-axis")
    @js.native
    def zAxis: Icon = js.native
    
    inline def zAxis_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("z-axis")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.zoom_minus")
    @js.native
    def zoomMinus: Icon = js.native
    
    inline def zoomMinus_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom_minus")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.zoom_plus")
    @js.native
    def zoomPlus: Icon = js.native
    
    inline def zoomPlus_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom_plus")(x.asInstanceOf[js.Any])
    
    @JSImport("plotly.js-basic-dist", "Icons.zoombox")
    @js.native
    def zoombox: Icon = js.native
    inline def zoombox_=(x: Icon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoombox")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plotly.js-basic-dist", "Plots")
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
