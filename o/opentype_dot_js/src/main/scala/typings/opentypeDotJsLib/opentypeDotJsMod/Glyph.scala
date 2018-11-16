package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "Glyph")
@js.native
class Glyph protected () extends js.Object {
  def this(options: GlyphOptions) = this()
  var advanceWidth: scala.Double = js.native
  var index: js.Any = js.native
  var name: java.lang.String = js.native
  var path: Path | js.Function0[Path] = js.native
  var points: js.Any = js.native
  var unicode: scala.Double = js.native
  var unicodes: js.Array[scala.Double] = js.native
  var xMax: js.Any = js.native
  var xMin: js.Any = js.native
  var yMax: js.Any = js.native
  var yMin: js.Any = js.native
  def addUnicode(unicode: scala.Double): scala.Unit = js.native
  def bindConstructorValues(options: GlyphOptions): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double, fontSize: scala.Double): scala.Unit = js.native
  def draw(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double, fontSize: scala.Double): scala.Unit = js.native
  def drawMetrics(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, x: scala.Double, y: scala.Double, fontSize: scala.Double): scala.Unit = js.native
  def drawPoints(
    ctx: stdLib.CanvasRenderingContext2D,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getContours(): Contour = js.native
  def getMetrics(): Metrics = js.native
  def getPath(): Path = js.native
  def getPath(x: scala.Double): Path = js.native
  def getPath(x: scala.Double, y: scala.Double): Path = js.native
  def getPath(x: scala.Double, y: scala.Double, fontSize: scala.Double): Path = js.native
  def getPath(x: scala.Double, y: scala.Double, fontSize: scala.Double, options: RenderOptions): Path = js.native
  def getPath(x: scala.Double, y: scala.Double, fontSize: scala.Double, options: RenderOptions, font: Font): Path = js.native
}

