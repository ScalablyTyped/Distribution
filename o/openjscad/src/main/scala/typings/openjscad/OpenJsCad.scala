package typings.openjscad

import typings.std.Event
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenJsCad {
  
  type EventHandler = js.Function1[/* ev */ js.UndefOr[Event], Any]
  
  @js.native
  trait ILog extends StObject {
    
    def apply(x: String): Unit = js.native
    
    var prevLogTime: js.UndefOr[Double] = js.native
  }
  
  trait IViewerOptions extends StObject {
    
    var bgColor: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[js.Array[Double]] = js.undefined
    
    var drawFaces: js.UndefOr[Boolean] = js.undefined
    
    var drawLines: js.UndefOr[Boolean] = js.undefined
    
    var noWebGL: js.UndefOr[Boolean] = js.undefined
  }
  object IViewerOptions {
    
    inline def apply(): IViewerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewerOptions]
    }
    
    extension [Self <: IViewerOptions](x: Self) {
      
      inline def setBgColor(value: Double): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setDrawFaces(value: Boolean): Self = StObject.set(x, "drawFaces", value.asInstanceOf[js.Any])
      
      inline def setDrawFacesUndefined: Self = StObject.set(x, "drawFaces", js.undefined)
      
      inline def setDrawLines(value: Boolean): Self = StObject.set(x, "drawLines", value.asInstanceOf[js.Any])
      
      inline def setDrawLinesUndefined: Self = StObject.set(x, "drawLines", js.undefined)
      
      inline def setNoWebGL(value: Boolean): Self = StObject.set(x, "noWebGL", value.asInstanceOf[js.Any])
      
      inline def setNoWebGLUndefined: Self = StObject.set(x, "noWebGL", js.undefined)
    }
  }
  
  @js.native
  trait Processor extends StObject {
    
    def abort(): Unit = js.native
    
    /* private */ var abortbutton: Any = js.native
    
    def addLibrary(lib: Any): Unit = js.native
    
    def cleanOption(option: Any, deflt: Any): Any = js.native
    
    def clearOutputFile(): Unit = js.native
    
    def clearViewer(): Unit = js.native
    
    /* private */ var containerdiv: Any = js.native
    
    /* private */ var controldiv: Any = js.native
    
    def createElements(): Unit = js.native
    
    def createParamControls(): Unit = js.native
    
    /* private */ var currentFormat: Any = js.native
    
    /* private */ var currentObject: Any = js.native
    
    /* private */ var currentObjectIndex: Any = js.native
    
    def currentObjectToBlob(): Any = js.native
    
    /* private */ var currentObjects: Any = js.native
    
    /* private */ var debugging: Any = js.native
    
    def downloadLinkTextForCurrentObject(): String = js.native
    
    /* private */ var downloadOutputFileLink: Any = js.native
    
    def enableItems(): Unit = js.native
    
    /* private */ var errordiv: Any = js.native
    
    /* private */ var errorpre: Any = js.native
    
    /* private */ var filename: Any = js.native
    
    /* private */ var formatDropdown: Any = js.native
    
    def formatInfo(format: Any): Any = js.native
    
    def generateOutputFile(): Unit = js.native
    
    def generateOutputFileBlobUrl(): Unit = js.native
    
    /* private */ var generateOutputFileButton: Any = js.native
    
    def generateOutputFileFileSystem(): Unit = js.native
    
    def getFilenameForRenderedObject(): String = js.native
    
    def getParamValues(): js.Object = js.native
    
    def handleResize(): Unit = js.native
    
    /* private */ var hasError: Any = js.native
    
    /* private */ var hasOutputFile: Any = js.native
    
    def hasSolid(): Boolean = js.native
    
    /* private */ var hasValidCurrentObject: Any = js.native
    
    /* private */ var isFirstRender_ : Any = js.native
    
    def isProcessing(): Boolean = js.native
    
    /* private */ var onchange: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var outputFileBlobUrl: Any = js.native
    
    /* private */ var outputFileDirEntry: Any = js.native
    
    /* private */ var paramControls: Any = js.native
    
    /* private */ var paramDefinitions: Any = js.native
    
    /* private */ var parametersdiv: Any = js.native
    
    /* private */ var parameterstable: Any = js.native
    
    /* private */ var processing: Any = js.native
    
    def rebuildSolid(): Unit = js.native
    
    /* private */ var renderedElementDropdown: Any = js.native
    
    /* private */ var script: Any = js.native
    
    def selectedFormat(): Any = js.native
    
    def selectedFormatInfo(): Any = js.native
    
    def setDebugging(debugging: Boolean): Unit = js.native
    
    def setDrawOption(str: Any, bool: Any): Unit = js.native
    
    def setError(txt: String): Unit = js.native
    
    def setJsCad(script: String): Unit = js.native
    def setJsCad(script: String, filename: String): Unit = js.native
    
    def setOpenJsCadPath(path: String): Unit = js.native
    
    def setRenderedObjects(obj: Any): Unit = js.native
    
    def setSelectedObjectIndex(index: Double): Unit = js.native
    
    /* private */ var statusbuttons: Any = js.native
    
    /* private */ var statusdiv: Any = js.native
    
    /* private */ var statusspan: Any = js.native
    
    def supportedFormatsForCurrentObject(): js.Array[String] = js.native
    
    def toggleDrawOption(str: Any): Boolean = js.native
    
    def updateDownloadLink(): Unit = js.native
    
    /* private */ var viewer: Any = js.native
    
    /* private */ var viewerSize: Any = js.native
    
    /* private */ var viewerdiv: Any = js.native
    
    /* private */ var worker: Any = js.native
  }
  
  trait ProcessorOptions
    extends StObject
       with IViewerOptions {
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var viewerheight: js.UndefOr[Double] = js.undefined
    
    var viewerheightratio: js.UndefOr[Double] = js.undefined
    
    var viewerwidth: js.UndefOr[Double] = js.undefined
  }
  object ProcessorOptions {
    
    inline def apply(): ProcessorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessorOptions]
    }
    
    extension [Self <: ProcessorOptions](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setViewerheight(value: Double): Self = StObject.set(x, "viewerheight", value.asInstanceOf[js.Any])
      
      inline def setViewerheightUndefined: Self = StObject.set(x, "viewerheight", js.undefined)
      
      inline def setViewerheightratio(value: Double): Self = StObject.set(x, "viewerheightratio", value.asInstanceOf[js.Any])
      
      inline def setViewerheightratioUndefined: Self = StObject.set(x, "viewerheightratio", js.undefined)
      
      inline def setViewerwidth(value: Double): Self = StObject.set(x, "viewerwidth", value.asInstanceOf[js.Any])
      
      inline def setViewerwidthUndefined: Self = StObject.set(x, "viewerwidth", js.undefined)
    }
  }
  
  @js.native
  trait Viewer extends StObject {
    
    def animate(): Unit = js.native
    
    def applyDrawOptions(): Unit = js.native
    
    /* private */ var bgColor_ : Any = js.native
    
    /* private */ var camera_ : Any = js.native
    
    def cancelAnimate(): Unit = js.native
    
    /* private */ var canvas: Any = js.native
    
    def clear(): Unit = js.native
    
    /* private */ var containerElm_ : Any = js.native
    
    /* private */ var controls_ : Any = js.native
    
    def createCamera(): Unit = js.native
    
    def createControls(canvas: Any): Unit = js.native
    
    def createRenderer(bool_noWebGL: Any): Unit = js.native
    
    def createScene(drawAxes: Any, axLen: Any): Unit = js.native
    
    /* private */ var defaultColor_ : Any = js.native
    
    def drawAxes(axLen: Any): Unit = js.native
    
    /* private */ var drawOptions: Any = js.native
    
    def getUserMeshes(): js.Array[Object3D[typings.three.srcCoreEventDispatcherMod.Event]] = js.native
    def getUserMeshes(str: Any): js.Array[Object3D[typings.three.srcCoreEventDispatcherMod.Event]] = js.native
    
    def handleResize(): Unit = js.native
    
    def parseSizeParams(): Unit = js.native
    
    /* private */ var pauseRender_ : Any = js.native
    
    /* private */ var perspective: Any = js.native
    
    def refreshRenderer(bool_noWebGL: Any): Unit = js.native
    
    def render(): Unit = js.native
    
    /* private */ var renderer_ : Any = js.native
    
    /* private */ var requestID_ : Any = js.native
    
    def resetZoom(r: Any): Unit = js.native
    
    /* private */ var scene_ : Any = js.native
    
    def setCsg(csg: Any, resetZoom: Any): Unit = js.native
    
    /* private */ var size: Any = js.native
    
    def webGLAvailable(): Boolean = js.native
  }
  
  /**
    * options parameter:
    * - drawLines: display wireframe lines
    * - drawFaces: display surfaces
    * - bgColor: canvas background color
    * - color: object color
    * - viewerwidth, viewerheight: set rendering size. Works with any css unit.
    *     viewerheight can also be specified as a ratio to width, ie number e (0, 1]
    * - noWebGL: force render without webGL
    * - verbose: show additional info (currently only time used for rendering)
    */
  trait ViewerSize extends StObject {
    
    var height: Double
    
    var heightDefault: String
    
    var heightratio: Double
    
    var width: Double
    
    var widthDefault: String
  }
  object ViewerSize {
    
    inline def apply(height: Double, heightDefault: String, heightratio: Double, width: Double, widthDefault: String): ViewerSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightDefault = heightDefault.asInstanceOf[js.Any], heightratio = heightratio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthDefault = widthDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerSize]
    }
    
    extension [Self <: ViewerSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightDefault(value: String): Self = StObject.set(x, "heightDefault", value.asInstanceOf[js.Any])
      
      inline def setHeightratio(value: Double): Self = StObject.set(x, "heightratio", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthDefault(value: String): Self = StObject.set(x, "widthDefault", value.asInstanceOf[js.Any])
    }
  }
}
