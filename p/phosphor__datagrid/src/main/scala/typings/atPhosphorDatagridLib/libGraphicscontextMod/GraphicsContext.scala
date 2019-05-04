package typings
package atPhosphorDatagridLib.libGraphicscontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/graphicscontext", "GraphicsContext")
@js.native
class GraphicsContext protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Create a new graphics context object.
    *
    * @param context - The 2D canvas rendering context to wrap.
    */
  def this(context: stdLib.CanvasRenderingContext2D) = this()
  var _context: js.Any = js.native
  var _disposed: js.Any = js.native
  var _state: js.Any = js.native
  var fillStyle: java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  var font: java.lang.String = js.native
  var globalAlpha: scala.Double = js.native
  var globalCompositeOperation: java.lang.String = js.native
  var imageSmoothingEnabled: scala.Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  var lineCap: java.lang.String = js.native
  var lineDashOffset: scala.Double = js.native
  var lineJoin: java.lang.String = js.native
  var lineWidth: scala.Double = js.native
  var miterLimit: scala.Double = js.native
  var shadowBlur: scala.Double = js.native
  var shadowColor: java.lang.String = js.native
  var shadowOffsetX: scala.Double = js.native
  var shadowOffsetY: scala.Double = js.native
  var strokeStyle: java.lang.String | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  var textAlign: java.lang.String = js.native
  var textBaseline: java.lang.String = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): scala.Unit = js.native
  def beginPath(): scala.Unit = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def clip(): scala.Unit = js.native
  def clip(fillRule: stdLib.CanvasFillRule): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def createImageData(imageData: stdLib.ImageData): stdLib.ImageData = js.native
  def createImageData(sw: scala.Double, sh: scala.Double): stdLib.ImageData = js.native
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): stdLib.CanvasGradient = js.native
  def createPattern(image: stdLib.HTMLCanvasElement, repetition: java.lang.String): stdLib.CanvasPattern = js.native
  def createPattern(image: stdLib.HTMLImageElement, repetition: java.lang.String): stdLib.CanvasPattern = js.native
  def createPattern(image: stdLib.HTMLVideoElement, repetition: java.lang.String): stdLib.CanvasPattern = js.native
  def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): stdLib.CanvasGradient = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def drawFocusIfNeeded(element: stdLib.Element): scala.Unit = js.native
  def drawImage(image: stdLib.HTMLCanvasElement, dstX: scala.Double, dstY: scala.Double): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLCanvasElement,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLCanvasElement,
    srcX: scala.Double,
    srcY: scala.Double,
    srcW: scala.Double,
    srcH: scala.Double,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(image: stdLib.HTMLImageElement, dstX: scala.Double, dstY: scala.Double): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLImageElement,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLImageElement,
    srcX: scala.Double,
    srcY: scala.Double,
    srcW: scala.Double,
    srcH: scala.Double,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(image: stdLib.HTMLVideoElement, dstX: scala.Double, dstY: scala.Double): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLVideoElement,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    image: stdLib.HTMLVideoElement,
    srcX: scala.Double,
    srcY: scala.Double,
    srcW: scala.Double,
    srcH: scala.Double,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(image: stdLib.ImageBitmap, dstX: scala.Double, dstY: scala.Double): scala.Unit = js.native
  def drawImage(
    image: stdLib.ImageBitmap,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def drawImage(
    image: stdLib.ImageBitmap,
    srcX: scala.Double,
    srcY: scala.Double,
    srcW: scala.Double,
    srcH: scala.Double,
    dstX: scala.Double,
    dstY: scala.Double,
    dstW: scala.Double,
    dstH: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  def fill(): scala.Unit = js.native
  def fill(fillRule: stdLib.CanvasFillRule): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def getImageData(sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): stdLib.ImageData = js.native
  def getLineDash(): js.Array[scala.Double] = js.native
  def isPointInPath(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInPath(x: scala.Double, y: scala.Double, fillRule: stdLib.CanvasFillRule): scala.Boolean = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def measureText(text: java.lang.String): stdLib.TextMetrics = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def putImageData(imagedata: stdLib.ImageData, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def putImageData(
    imagedata: stdLib.ImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: scala.Double,
    dirtyY: scala.Double,
    dirtyWidth: scala.Double,
    dirtyHeight: scala.Double
  ): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def rotate(angle: scala.Double): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setLineDash(segments: js.Array[scala.Double]): scala.Unit = js.native
  def setTransform(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def stroke(): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def transform(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

