package typings.opentypeJs.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "Glyph")
@js.native
class Glyph protected () extends StObject {
  def this(options: GlyphOptions) = this()
  
  def addUnicode(unicode: Double): Unit = js.native
  
  var advanceWidth: Double = js.native
  
  def bindConstructorValues(options: GlyphOptions): Unit = js.native
  
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  
  def drawMetrics(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  
  def drawPoints(ctx: CanvasRenderingContext2D): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Double, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Double, fontSize: Unit, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Double, options: RenderOptions): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, x: Unit, y: Unit, fontSize: Unit, options: RenderOptions): Unit = js.native
  
  def getBoundingBox(): BoundingBox = js.native
  
  def getContours(): Contour = js.native
  
  def getMetrics(): Metrics = js.native
  
  def getPath(): Path = js.native
  def getPath(x: Double): Path = js.native
  def getPath(x: Double, y: Double): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double, options: Unit, font: Font): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double, options: RenderOptions): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Double, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Unit, options: Unit, font: Font): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Unit, options: RenderOptions): Path = js.native
  def getPath(x: Double, y: Double, fontSize: Unit, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Double): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Double, options: Unit, font: Font): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Double, options: RenderOptions): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Double, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Unit, options: Unit, font: Font): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Unit, options: RenderOptions): Path = js.native
  def getPath(x: Double, y: Unit, fontSize: Unit, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Unit, y: Double): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Double): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Double, options: Unit, font: Font): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Double, options: RenderOptions): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Double, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Unit, options: Unit, font: Font): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Unit, options: RenderOptions): Path = js.native
  def getPath(x: Unit, y: Double, fontSize: Unit, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Double): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Double, options: Unit, font: Font): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Double, options: RenderOptions): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Double, options: RenderOptions, font: Font): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Unit, options: Unit, font: Font): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Unit, options: RenderOptions): Path = js.native
  def getPath(x: Unit, y: Unit, fontSize: Unit, options: RenderOptions, font: Font): Path = js.native
  
  var index: Double = js.native
  
  var name: String = js.native
  
  var path: Path | js.Function0[Path] = js.native
  
  /* private */ var points: js.Any = js.native
  
  var unicode: Double = js.native
  
  var unicodes: js.Array[Double] = js.native
  
  /* private */ var xMax: js.Any = js.native
  
  /* private */ var xMin: js.Any = js.native
  
  /* private */ var yMax: js.Any = js.native
  
  /* private */ var yMin: js.Any = js.native
}
