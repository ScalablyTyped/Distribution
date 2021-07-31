package typings.openjscad

import typings.std.Event
import typings.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenJsCad {
  
  type EventHandler = js.Function1[/* ev */ js.UndefOr[Event], js.Any]
  
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
    
    @scala.inline
    def apply(): IViewerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewerOptions]
    }
    
    @scala.inline
    implicit class IViewerOptionsMutableBuilder[Self <: IViewerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: Double): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setDrawFaces(value: Boolean): Self = StObject.set(x, "drawFaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawFacesUndefined: Self = StObject.set(x, "drawFaces", js.undefined)
      
      @scala.inline
      def setDrawLines(value: Boolean): Self = StObject.set(x, "drawLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawLinesUndefined: Self = StObject.set(x, "drawLines", js.undefined)
      
      @scala.inline
      def setNoWebGL(value: Boolean): Self = StObject.set(x, "noWebGL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWebGLUndefined: Self = StObject.set(x, "noWebGL", js.undefined)
    }
  }
  
  @js.native
  trait Processor extends StObject {
    
    def abort(): Unit = js.native
    
    var abortbutton: js.Any = js.native
    
    def addLibrary(lib: js.Any): Unit = js.native
    
    def cleanOption(option: js.Any, deflt: js.Any): js.Any = js.native
    
    def clearOutputFile(): Unit = js.native
    
    def clearViewer(): Unit = js.native
    
    var containerdiv: js.Any = js.native
    
    var controldiv: js.Any = js.native
    
    def createElements(): Unit = js.native
    
    def createParamControls(): Unit = js.native
    
    var currentFormat: js.Any = js.native
    
    var currentObject: js.Any = js.native
    
    var currentObjectIndex: js.Any = js.native
    
    def currentObjectToBlob(): js.Any = js.native
    
    var currentObjects: js.Any = js.native
    
    var debugging: js.Any = js.native
    
    def downloadLinkTextForCurrentObject(): String = js.native
    
    var downloadOutputFileLink: js.Any = js.native
    
    def enableItems(): Unit = js.native
    
    var errordiv: js.Any = js.native
    
    var errorpre: js.Any = js.native
    
    var filename: js.Any = js.native
    
    var formatDropdown: js.Any = js.native
    
    def formatInfo(format: js.Any): js.Any = js.native
    
    def generateOutputFile(): Unit = js.native
    
    def generateOutputFileBlobUrl(): Unit = js.native
    
    var generateOutputFileButton: js.Any = js.native
    
    def generateOutputFileFileSystem(): Unit = js.native
    
    def getFilenameForRenderedObject(): String = js.native
    
    def getParamValues(): js.Object = js.native
    
    def handleResize(): Unit = js.native
    
    var hasError: js.Any = js.native
    
    var hasOutputFile: js.Any = js.native
    
    def hasSolid(): Boolean = js.native
    
    var hasValidCurrentObject: js.Any = js.native
    
    var isFirstRender_ : js.Any = js.native
    
    def isProcessing(): Boolean = js.native
    
    var onchange: js.Any = js.native
    
    var options: js.Any = js.native
    
    var outputFileBlobUrl: js.Any = js.native
    
    var outputFileDirEntry: js.Any = js.native
    
    var paramControls: js.Any = js.native
    
    var paramDefinitions: js.Any = js.native
    
    var parametersdiv: js.Any = js.native
    
    var parameterstable: js.Any = js.native
    
    var processing: js.Any = js.native
    
    def rebuildSolid(): Unit = js.native
    
    var renderedElementDropdown: js.Any = js.native
    
    var script: js.Any = js.native
    
    def selectedFormat(): js.Any = js.native
    
    def selectedFormatInfo(): js.Any = js.native
    
    def setDebugging(debugging: Boolean): Unit = js.native
    
    def setDrawOption(str: js.Any, bool: js.Any): Unit = js.native
    
    def setError(txt: String): Unit = js.native
    
    def setJsCad(script: String): Unit = js.native
    def setJsCad(script: String, filename: String): Unit = js.native
    
    def setOpenJsCadPath(path: String): Unit = js.native
    
    def setRenderedObjects(obj: js.Any): Unit = js.native
    
    def setSelectedObjectIndex(index: Double): Unit = js.native
    
    var statusbuttons: js.Any = js.native
    
    var statusdiv: js.Any = js.native
    
    var statusspan: js.Any = js.native
    
    def supportedFormatsForCurrentObject(): js.Array[String] = js.native
    
    def toggleDrawOption(str: js.Any): Boolean = js.native
    
    def updateDownloadLink(): Unit = js.native
    
    var viewer: js.Any = js.native
    
    var viewerSize: js.Any = js.native
    
    var viewerdiv: js.Any = js.native
    
    var worker: js.Any = js.native
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
    
    @scala.inline
    def apply(): ProcessorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessorOptions]
    }
    
    @scala.inline
    implicit class ProcessorOptionsMutableBuilder[Self <: ProcessorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setViewerheight(value: Double): Self = StObject.set(x, "viewerheight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerheightUndefined: Self = StObject.set(x, "viewerheight", js.undefined)
      
      @scala.inline
      def setViewerheightratio(value: Double): Self = StObject.set(x, "viewerheightratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerheightratioUndefined: Self = StObject.set(x, "viewerheightratio", js.undefined)
      
      @scala.inline
      def setViewerwidth(value: Double): Self = StObject.set(x, "viewerwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewerwidthUndefined: Self = StObject.set(x, "viewerwidth", js.undefined)
    }
  }
  
  @js.native
  trait Viewer extends StObject {
    
    def animate(): Unit = js.native
    
    def applyDrawOptions(): Unit = js.native
    
    var bgColor_ : js.Any = js.native
    
    var camera_ : js.Any = js.native
    
    def cancelAnimate(): Unit = js.native
    
    var canvas: js.Any = js.native
    
    def clear(): Unit = js.native
    
    var containerElm_ : js.Any = js.native
    
    var controls_ : js.Any = js.native
    
    def createCamera(): Unit = js.native
    
    def createControls(canvas: js.Any): Unit = js.native
    
    def createRenderer(bool_noWebGL: js.Any): Unit = js.native
    
    def createScene(drawAxes: js.Any, axLen: js.Any): Unit = js.native
    
    var defaultColor_ : js.Any = js.native
    
    def drawAxes(axLen: js.Any): Unit = js.native
    
    var drawOptions: js.Any = js.native
    
    def getUserMeshes(): js.Array[Object3D] = js.native
    def getUserMeshes(str: js.Any): js.Array[Object3D] = js.native
    
    def handleResize(): Unit = js.native
    
    def parseSizeParams(): Unit = js.native
    
    var pauseRender_ : js.Any = js.native
    
    var perspective: js.Any = js.native
    
    def refreshRenderer(bool_noWebGL: js.Any): Unit = js.native
    
    def render(): Unit = js.native
    
    var renderer_ : js.Any = js.native
    
    var requestID_ : js.Any = js.native
    
    def resetZoom(r: js.Any): Unit = js.native
    
    var scene_ : js.Any = js.native
    
    def setCsg(csg: js.Any, resetZoom: js.Any): Unit = js.native
    
    var size: js.Any = js.native
    
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
    
    @scala.inline
    def apply(height: Double, heightDefault: String, heightratio: Double, width: Double, widthDefault: String): ViewerSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightDefault = heightDefault.asInstanceOf[js.Any], heightratio = heightratio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthDefault = widthDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewerSize]
    }
    
    @scala.inline
    implicit class ViewerSizeMutableBuilder[Self <: ViewerSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightDefault(value: String): Self = StObject.set(x, "heightDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightratio(value: Double): Self = StObject.set(x, "heightratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthDefault(value: String): Self = StObject.set(x, "widthDefault", value.asInstanceOf[js.Any])
    }
  }
}
