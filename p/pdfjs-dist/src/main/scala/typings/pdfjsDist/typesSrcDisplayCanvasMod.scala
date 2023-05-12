package typings.pdfjsDist

import typings.pdfjsDist.anon.Background
import typings.pdfjsDist.anon.Img
import typings.pdfjsDist.anon.MarkedContentStack
import typings.pdfjsDist.anon.OffsetX
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayCanvasMod {
  
  @JSImport("pdfjs-dist/types/src/display/canvas", "CanvasGraphics")
  @js.native
  open class CanvasGraphics protected () extends StObject {
    def this(
      canvasCtx: Any,
      commonObjs: Any,
      objs: Any,
      canvasFactory: Any,
      filterFactory: Any,
      param5: MarkedContentStack,
      annotationCanvasMap: Any,
      pageColors: Any
    ) = this()
    
    var _cachedBitmapsMap: Map[Any, Any] = js.native
    
    var _cachedGetSinglePixelWidth: Double | Null = js.native
    
    var _cachedScaleForStroking: js.Array[Double] | Null = js.native
    
    def _createMaskCanvas(img: Any): OffsetX = js.native
    
    def _getPattern(objId: Any): Any = js.native
    
    def _scaleImage(img: Any, inverseTransform: Any): Img = js.native
    
    var annotationCanvas: Any = js.native
    
    var annotationCanvasMap: Any = js.native
    
    def applyTransferMapsToBitmap(imgData: Any): Any = js.native
    
    def applyTransferMapsToCanvas(ctx: Any): Any = js.native
    
    var baseTransform: Any = js.native
    
    var baseTransformStack: js.Array[Any] = js.native
    
    def beginAnnotation(id: Any, rect: Any, transform: Any, matrix: Any, hasOwnCanvas: Any): Unit = js.native
    
    def beginCompat(): Unit = js.native
    
    def beginDrawing(param0: Background): Unit = js.native
    
    def beginGroup(group: Any): Unit = js.native
    
    def beginImageData(): Unit = js.native
    
    def beginInlineImage(): Unit = js.native
    
    def beginMarkedContent(tag: Any): Unit = js.native
    
    def beginMarkedContentProps(tag: Any, properties: Any): Unit = js.native
    
    /**
      * Soft mask mode takes the current main drawing canvas and replaces it with
      * a temporary canvas. Any drawing operations that happen on the temporary
      * canvas need to be composed with the main canvas that was suspended (see
      * `compose()`). The temporary canvas also duplicates many of its operations
      * on the suspended canvas to keep them in sync, so that when the soft mask
      * mode ends any clipping paths or transformations will still be active and in
      * the right order on the canvas' graphics state stack.
      */
    def beginSMaskMode(): Unit = js.native
    
    def beginText(): Unit = js.native
    
    var cachedCanvases: CachedCanvases = js.native
    
    var cachedPatterns: Map[Any, Any] = js.native
    
    var canvasFactory: Any = js.native
    
    def checkSMaskState(): Unit = js.native
    
    def clip(): Unit = js.native
    
    def closeEOFillStroke(): Unit = js.native
    
    def closeFillStroke(): Unit = js.native
    
    def closePath(): Unit = js.native
    
    def closeStroke(): Unit = js.native
    
    var commonObjs: Any = js.native
    
    def compose(dirtyBox: Any): Unit = js.native
    
    var compositeCtx: Any = js.native
    
    def constructPath(ops: Any, args: Any, minMax: Any): Unit = js.native
    
    def consumePath(clipBox: Any): Unit = js.native
    
    var contentVisible: Boolean = js.native
    
    var ctx: Any = js.native
    
    var current: CanvasExtraState = js.native
    
    def endAnnotation(): Unit = js.native
    
    def endCompat(): Unit = js.native
    
    def endDrawing(): Unit = js.native
    
    def endGroup(group: Any): Unit = js.native
    
    def endMarkedContent(): Unit = js.native
    
    def endPath(): Unit = js.native
    
    def endSMaskMode(): Unit = js.native
    
    def endText(): Unit = js.native
    
    def eoClip(): Unit = js.native
    
    def eoFill(): Unit = js.native
    
    def eoFillStroke(): Unit = js.native
    
    def executeOperatorList(operatorList: Any, executionStartIdx: Any, continueCallback: Any, stepper: Any): Any = js.native
    
    def fill(): Unit = js.native
    def fill(consumePath: Boolean): Unit = js.native
    
    def fillStroke(): Unit = js.native
    
    var filterFactory: Any = js.native
    
    def getColorN_Pattern(IR: Any): Any = js.native
    
    def getObject(data: Any): Any = js.native
    
    def getScaleForStroking(): js.Array[Double] = js.native
    
    def getSinglePixelWidth(): Double = js.native
    
    var groupLevel: Double = js.native
    
    var groupStack: js.Array[Any] = js.native
    
    def inSMaskMode: Boolean = js.native
    
    def isContentVisible(): Boolean = js.native
    
    def isFontSubpixelAAEnabled: Any = js.native
    
    def markPoint(tag: Any): Unit = js.native
    
    def markPointProps(tag: Any, properties: Any): Unit = js.native
    
    var markedContentStack: js.Array[scala.Nothing] = js.native
    
    def moveText(x: Any, y: Any): Unit = js.native
    
    def nextLine(): Unit = js.native
    
    var objs: Any = js.native
    
    var optionalContentConfig: Any = js.native
    
    var outputScaleX: Double = js.native
    
    var outputScaleY: Double = js.native
    
    var pageColors: Any = js.native
    
    def paintChar(character: Any, x: Any, y: Any, patternTransform: Any): Unit = js.native
    
    def paintFormXObjectBegin(matrix: Any, bbox: Any): Unit = js.native
    
    def paintFormXObjectEnd(): Unit = js.native
    
    def paintImageMaskXObject(img: Any): Unit = js.native
    
    def paintImageMaskXObjectGroup(images: Any): Unit = js.native
    
    def paintImageMaskXObjectRepeat(img: Any, scaleX: Any, skewX: Double, skewY: Double, scaleY: Any, positions: Any): Unit = js.native
    def paintImageMaskXObjectRepeat(img: Any, scaleX: Any, skewX: Double, skewY: Unit, scaleY: Any, positions: Any): Unit = js.native
    def paintImageMaskXObjectRepeat(img: Any, scaleX: Any, skewX: Unit, skewY: Double, scaleY: Any, positions: Any): Unit = js.native
    def paintImageMaskXObjectRepeat(img: Any, scaleX: Any, skewX: Unit, skewY: Unit, scaleY: Any, positions: Any): Unit = js.native
    
    def paintImageXObject(objId: Any): Unit = js.native
    
    def paintImageXObjectRepeat(objId: Any, scaleX: Any, scaleY: Any, positions: Any): Unit = js.native
    
    def paintInlineImageXObject(imgData: Any): Unit = js.native
    
    def paintInlineImageXObjectGroup(imgData: Any, map: Any): Unit = js.native
    
    def paintSolidColorImageMask(): Unit = js.native
    
    var pendingClip: js.Object | Null = js.native
    
    var pendingEOFill: Boolean = js.native
    
    var pendingTextPaths: js.UndefOr[js.Array[Any]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    var processingType3: Any = js.native
    
    var res: Any = js.native
    
    def rescaleAndStroke(saveRestore: Any): Unit = js.native
    
    def restore(): Unit = js.native
    
    def save(): Unit = js.native
    
    def setCharSpacing(spacing: Any): Unit = js.native
    
    def setCharWidth(xWidth: Any, yWidth: Any): Unit = js.native
    
    def setCharWidthAndBounds(xWidth: Any, yWidth: Any, llx: Any, lly: Any, urx: Any, ury: Any): Unit = js.native
    
    def setDash(dashArray: Any, dashPhase: Any): Unit = js.native
    
    def setFillColorN(args: Any*): Unit = js.native
    
    def setFillRGBColor(r: Any, g: Any, b: Any): Unit = js.native
    
    def setFlatness(flatness: Any): Unit = js.native
    
    def setFont(fontRefName: Any, size: Any): Unit = js.native
    
    def setGState(states: Any): Unit = js.native
    
    def setHScale(scale: Any): Unit = js.native
    
    def setLeading(leading: Any): Unit = js.native
    
    def setLeadingMoveText(x: Any, y: Any): Unit = js.native
    
    def setLineCap(style: Any): Unit = js.native
    
    def setLineJoin(style: Any): Unit = js.native
    
    def setLineWidth(width: Any): Unit = js.native
    
    def setMiterLimit(limit: Any): Unit = js.native
    
    def setRenderingIntent(intent: Any): Unit = js.native
    
    def setStrokeColorN(args: Any*): Unit = js.native
    
    def setStrokeRGBColor(r: Any, g: Any, b: Any): Unit = js.native
    
    def setTextMatrix(a: Any, b: Any, c: Any, d: Any, e: Any, f: Any): Unit = js.native
    
    def setTextRenderingMode(mode: Any): Unit = js.native
    
    def setTextRise(rise: Any): Unit = js.native
    
    def setWordSpacing(spacing: Any): Unit = js.native
    
    def shadingFill(objId: Any): Unit = js.native
    
    def showText(glyphs: Any): Unit = js.native
    
    def showType3Text(glyphs: Any): Unit = js.native
    
    var smaskCounter: Double = js.native
    
    var smaskStack: js.Array[Any] = js.native
    
    var stateStack: js.Array[Any] = js.native
    
    def stroke(): Unit = js.native
    def stroke(consumePath: Boolean): Unit = js.native
    
    var suspendedCtx: Any = js.native
    
    var tempSMask: Any = js.native
    
    def transform(a: Any, b: Any, c: Any, d: Any, e: Any, f: Any): Unit = js.native
    
    var transparentCanvas: Any = js.native
    
    var viewportScale: Double = js.native
    
    var xobjs: Any = js.native
  }
  
  trait CachedCanvases extends StObject {
    
    var cache: Any
    
    var canvasFactory: Any
    
    def clear(): Unit
    
    def delete(id: Any): Unit
    
    def getCanvas(id: Any, width: Any, height: Any): Any
  }
  object CachedCanvases {
    
    inline def apply(
      cache: Any,
      canvasFactory: Any,
      clear: () => Unit,
      delete: Any => Unit,
      getCanvas: (Any, Any, Any) => Any
    ): CachedCanvases = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], canvasFactory = canvasFactory.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), getCanvas = js.Any.fromFunction3(getCanvas))
      __obj.asInstanceOf[CachedCanvases]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CachedCanvases] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCanvasFactory(value: Any): Self = StObject.set(x, "canvasFactory", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: Any => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGetCanvas(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getCanvas", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait CanvasExtraState extends StObject {
    
    var activeSMask: Any = js.native
    
    var alphaIsShape: Boolean = js.native
    
    var charSpacing: Double = js.native
    
    var clipBox: Any = js.native
    
    var fillAlpha: Double = js.native
    
    var fillColor: String = js.native
    
    var fontMatrix: js.Array[Double] = js.native
    
    var fontSize: Double = js.native
    
    var fontSizeScale: Double = js.native
    
    def getClippedPathBoundingBox(): js.Array[Double] | Null = js.native
    def getClippedPathBoundingBox(pathType: String): js.Array[Double] | Null = js.native
    
    def getPathBoundingBox(): js.Array[Any] = js.native
    def getPathBoundingBox(pathType: String): js.Array[Any] = js.native
    
    def isEmptyClip(): Boolean = js.native
    
    var leading: Double = js.native
    
    var lineWidth: Double = js.native
    
    var lineX: Double = js.native
    
    var lineY: Double = js.native
    
    var maxX: Any = js.native
    
    var maxY: Any = js.native
    
    var minX: Any = js.native
    
    var minY: Any = js.native
    
    var patternFill: Boolean = js.native
    
    def setCurrentPoint(x: Any, y: Any): Unit = js.native
    
    def startNewPathAndClipBox(box: Any): Unit = js.native
    
    var strokeAlpha: Double = js.native
    
    var strokeColor: String = js.native
    
    var textHScale: Double = js.native
    
    var textMatrix: js.Array[Double] = js.native
    
    var textMatrixScale: Double = js.native
    
    var textRenderingMode: Double = js.native
    
    var textRise: Double = js.native
    
    var transferMaps: String = js.native
    
    def updateClipFromPath(): Unit = js.native
    
    def updateCurvePathMinMax(
      transform: Any,
      x0: Any,
      y0: Any,
      x1: Any,
      y1: Any,
      x2: Any,
      y2: Any,
      x3: Any,
      y3: Any,
      minMax: Any
    ): Unit = js.native
    
    def updatePathMinMax(transform: Any, x: Any, y: Any): Unit = js.native
    
    def updateRectMinMax(transform: Any, rect: Any): Unit = js.native
    
    def updateScalingPathMinMax(transform: Any, minMax: Any): Unit = js.native
    
    var wordSpacing: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
