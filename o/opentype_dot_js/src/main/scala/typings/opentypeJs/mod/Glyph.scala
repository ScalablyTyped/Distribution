package typings.opentypeJs.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "Glyph")
@js.native
class Glyph protected () extends js.Object {
  def this(options: GlyphOptions) = this()
  var advanceWidth: Double = js.native
  var index: js.Any = js.native
  var name: String = js.native
  var path: Path | js.Function0[Path] = js.native
  var points: js.Any = js.native
  var unicode: Double = js.native
  var unicodes: js.Array[Double] = js.native
  var xMax: js.Any = js.native
  var xMin: js.Any = js.native
  var yMax: js.Any = js.native
  var yMin: js.Any = js.native
  def addUnicode(unicode: Double): Unit = js.native
  def bindConstructorValues(options: GlyphOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def getBoundingBox(): BoundingBox = js.native
  def getContours(): Contour = js.native
  def getMetrics(): Metrics = js.native
  def getPath(): Path = js.native
  def getPath(x: Double): Path = js.native
  def getPath(x: Double, y: Double): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double, options: RenderOptions): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double, options: RenderOptions, font: Font): Path = js.native
}

