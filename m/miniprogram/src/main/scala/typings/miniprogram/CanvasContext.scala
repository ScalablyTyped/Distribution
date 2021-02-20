package typings.miniprogram

import typings.miniprogram.anon.DestHeight
import typings.miniprogram.anon.dataUint8ClampedArrayxnum
import typings.miniprogram.anon.xnumberundefinedynumberun
import typings.miniprogram.anon.xnumberynumberwidthnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasContext extends StObject {
  
  /**
    * Add a circular gradient point.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-addcolorstop)
    */
  def addColorStop(stop: Double, color: String): Unit = js.native
  
  /**
    * Draw arc.
    * In order to create a circle, you can specify the start arc to 0 using `arc()` and
    * specify the end arc to `2 * Math.PI` . Use `stroke()` or `fill()` to draw arc in the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-arc)
    */
  def arc(x: Double, y: Double, r: Double, sAngle: Double, eAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, r: Double, sAngle: Double, eAngle: Double, counterclockwise: Boolean): Unit = js.native
  
  /**
    * Start to create a path, must use `fill` or `stroke` to fill or stroke the path.
    * In the beginning of creating the path, the `beginPath()` is
    * invoked. If the `setFillStyle()`, `setStrokeStyle()`, `setLineWidth()`
    * and others are invoked multiple times in the same path, only t
    * he last invoke will take effect.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-beginpath)
    */
  def beginPath(): Unit = js.native
  
  /**
    * Create cubic Bézier curve path.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-beziercurveto)
    */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * Clear the content in the rect.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-clearrect)
    */
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Set the created path as clipped path.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-clip)
    */
  def clip(): Unit = js.native
  
  /**
    * Close a path. The close path will connect start point and end
    * point. If `fill()` or `stroke()` is not invoked and a new path
    *  is created after `closePath`, the former path will not be rendered.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-closepath)
    */
  def closePath(): Unit = js.native
  
  /**
    * Create a circular gradient point, the start point is the center
    * of the circle and the end point is the ring. The `addColorStop()`
    * should be called to specify the gradient point and at least two
    * points should be specified.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-createcirculargradient)
    */
  def createCircularGradient(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * Create a linear gradient. The `addColorStop()` should be called
    * to specify the gradient point and at least two points should be specified.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-createlineargradient)
    */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  
  /**
    * Draw the description in the context such as path, style to the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-draw)
    */
  def draw(): Unit = js.native
  def draw(reserve: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def draw(reserve: Boolean): Unit = js.native
  def draw(reserve: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Draw the image, and the image keeps the original size information.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-drawimage)
    */
  def drawImage(imageResource: String, x: Double, y: Double): Unit = js.native
  def drawImage(imageResource: String, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def drawImage(imageResource: String, x: Double, y: Double, width: Double): Unit = js.native
  def drawImage(imageResource: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Fill the current path. The default color is black.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-fill)
    */
  def fill(): Unit = js.native
  
  /**
    * Fill the rect. `setFillStyle()` is used to set the color
    * of the fill, by default, its color is black.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-fillrect)
    */
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Fill the text in the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-filltext)
    */
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  
  /**
    * Get the pixel data of the implicit area of the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-getimagedata)
    */
  def getImageData(args: xnumberynumberwidthnumber): Unit = js.native
  
  /**
    * Add a new point, and line the last specified point to the
    * new point. stroke() can be used to draw the line.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-lineto)
    */
  def lineTo(x: Double, y: Double): Unit = js.native
  
  /**
    * CanvasContext.measureText| Mesure the size of the text, current
    * only the witch is returned, and it is a synchronous interface
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-measuretext)
    */
  def measureText(text: String): Unit = js.native
  
  /**
    * Move the path to the specified point, the line will not be created.
    *  `stroke()` can be used to draw the line
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-moveto)
    */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /**
    * Draw the pixel data into the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-putimagedata)
    */
  def putImageData(args: dataUint8ClampedArrayxnum): Unit = js.native
  
  /**
    * Create a quadratic cubic Bezier curve path. The start point of the former point of the path.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-quadraticcurveto)
    */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  
  /**
    * Draw a rect. Use `fill()` or `stroke()` to draw the rect to canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-rect)
    */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Restore the saved context.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-restore)
    */
  def restore(): Unit = js.native
  
  /**
    * Set the original point as the center, rotate the coordinate
    * clockwise. The angle will be added if rotate isinvoked multiple times.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-rotate)
    */
  def rotate(rotate: Double): Unit = js.native
  
  /**
    * Save the context of the canvas.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-save)
    */
  def save(): Unit = js.native
  
  /**
    * After the `scale` is invoked, the horizontal and vertical coordinate
    * of the path created subsequently will be scaled. The scale will be
    * multiplied if `scale` is invoked multiple times.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-scale)
    */
  def scale(scaleWidth: Double, scaleHeight: Double): Unit = js.native
  
  /**
    * Set the color of the fill.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setfillstyle)
    */
  def setFillStyle(color: String): Unit = js.native
  
  /**
    * Set the font size.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setfontsize)
    */
  def setFontSize(fontSize: Double): Unit = js.native
  
  /**
    * Set the alpha of global brush.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setglobalalpha)
    */
  def setGlobalAlpha(alpha: Double): Unit = js.native
  
  /**
    * Set the end ponit style of a line.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setlinecap)
    */
  def setLineCap(lineCap: String): Unit = js.native
  
  /**
    * https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setlinedash
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setlinedash)
    */
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  
  /**
    * Set the style of joint of lines.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setlinejoin)
    */
  def setLineJoin(lineJoin: String): Unit = js.native
  
  /**
    * Set the width of line.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setlinewidth)
    */
  def setLineWidth(lineWidth: Double): Unit = js.native
  
  /**
    * Set the maximum miter length, which is the distance between the inner
    *  and outer angles at the intersection of the two lines. Only valid
    * when `setLineJoin()` is miter. Where the maximum length is exceeded,
    *  the join is displayed as lineJoin as bevel.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setmiterlimit)
    */
  def setMiterLimit(miterLimit: Double): Unit = js.native
  
  /**
    * Set the style including location of color for shadow
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setshadow)
    */
  def setShadow(offsetX: Double, offsetY: Double, blur: Double, color: String): Unit = js.native
  
  /**
    * Set the style of stroke. By default, it is black.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-setstrokestyle)
    */
  def setStrokeStyle(color: String): Unit = js.native
  
  /**
    * Align is a property of the Canvas 2D API that describes the alignment
    *  of text when it is drawn. The alignment is based on the x value of
    * CanvasRenderingContext2D.FillText method. If textAlign="center", the
    *  text will be drawn at 'x-50%*width'.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-settextalign)
    */
  def setTextAlign(textAlign: String): Unit = js.native
  
  /**
    * Set the properties of the current text baseline.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-settextbaseline)
    */
  def setTextBaseline(textBaseline: String): Unit = js.native
  
  /**
    * Reset the transform and invoke the transform by unit matrix, the
    * transform is described by the variable of the method.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-settransform)
    */
  def setTransform(
    scaleX: Double,
    skewX: Double,
    skewY: Double,
    scaleY: Double,
    translateX: Double,
    translateY: Double
  ): Unit = js.native
  
  /**
    * Draw the stroke of the path.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-stroke)
    */
  def stroke(): Unit = js.native
  
  /**
    * Draw a none-filled rect.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-strokerect)
    */
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Get the data URL of specified area of canvas
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-todataurl)
    */
  def toDataURL(): js.Promise[String] = js.native
  def toDataURL(args: DestHeight): js.Promise[String] = js.native
  
  /**
    * Export the canvas to an image and return the file path
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-totempfilepath)
    */
  def toTempFilePath(args: xnumberundefinedynumberun): Unit = js.native
  
  /**
    * A method in which a matrix is superimposed multiple times on the current
    * transformation, and the matrix is described by the parameters of the
    * method. You can scale, rotate, move, and tilt the context.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-transform)
    */
  def transform(
    scaleX: Double,
    skewX: Double,
    skewY: Double,
    scaleY: Double,
    translateX: Double,
    translateY: Double
  ): Unit = js.native
  
  /**
    * Transfor the original point of the coordinate. The default orginal
    * point is the upper-left corner
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_canvas-context_canvascontext-translate)
    */
  def translate(x: Double, y: Double): Unit = js.native
}
