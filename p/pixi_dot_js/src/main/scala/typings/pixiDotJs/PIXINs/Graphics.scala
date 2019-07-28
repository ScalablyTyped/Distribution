package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.Anon_Adaptive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Graphics")
@js.native
class Graphics () extends Container {
  def this(nativeLines: Boolean) = this()
  var _fastRect: Boolean = js.native
  var _localBounds: Bounds = js.native
  var _prevTint: Double = js.native
  var _spriteRect: Rectangle = js.native
  var _webGL: js.Any = js.native
  var blendMode: Double = js.native
  var boundsDirty: Double = js.native
  var boundsPadding: Double = js.native
  var cachedSpriteDirty: Boolean = js.native
  var canvasTintDirty: Double = js.native
  var clearDirty: Double = js.native
  var currentPath: GraphicsData = js.native
  var dirty: Double = js.native
  var fastRectDirty: Double = js.native
  var fillAlpha: Double = js.native
  var graphicsData: js.Array[GraphicsData] = js.native
  var isMask: Boolean = js.native
  var lineAlignment: Double = js.native
  var lineColor: Double = js.native
  var lineWidth: Double = js.native
  var nativeLines: Boolean = js.native
  var tint: Double = js.native
  /* protected */ def _bezierCurveLength(
    fromX: Double,
    fromY: Double,
    cpX: Double,
    cpY: Double,
    cpX2: Double,
    cpY2: Double,
    toX: Double,
    toY: Double
  ): Double = js.native
  /* protected */ def _quadraticCurveLength(fromX: Double, fromY: Double, cpX: Double, cpY: Double, toX: Double, toY: Double): Double = js.native
  /* protected */ def _renderSpriteRect(renderer: SystemRenderer): Unit = js.native
  /* protected */ def _segmentsCount(length: Double): Double = js.native
  def addHole(): Graphics = js.native
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double): Graphics = js.native
  def arc(
    cx: Double,
    cy: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  ): Graphics = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  def beginFill(color: Double): Graphics = js.native
  def beginFill(color: Double, alpha: Double): Graphics = js.native
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  def clear(): Graphics = js.native
  def closePath(): Graphics = js.native
  def containsPoint(point: Point): Boolean = js.native
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawPolygon(path: js.Array[Double | Point]): Graphics = js.native
  def drawPolygon(path: Polygon): Graphics = js.native
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def drawShape(shape: js.Any): GraphicsData = js.native
  def drawShape(shape: Circle): GraphicsData = js.native
  def drawShape(shape: Ellipse): GraphicsData = js.native
  def drawShape(shape: Polygon): GraphicsData = js.native
  def drawShape(shape: Rectangle): GraphicsData = js.native
  def drawShape(shape: RoundedRectangle): GraphicsData = js.native
  def drawStar(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double): Graphics = js.native
  def drawStar(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double, rotation: Double): Graphics = js.native
  def endFill(): Graphics = js.native
  def generateCanvasTexture(): Texture = js.native
  def generateCanvasTexture(scaleMode: Double): Texture = js.native
  def generateCanvasTexture(scaleMode: Double, resolution: Double): Texture = js.native
  def isFastRect(): Boolean = js.native
  def lineStyle(): Graphics = js.native
  def lineStyle(lineWidth: Double): Graphics = js.native
  def lineStyle(lineWidth: Double, color: Double): Graphics = js.native
  def lineStyle(lineWidth: Double, color: Double, alpha: Double): Graphics = js.native
  def lineStyle(lineWidth: Double, color: Double, alpha: Double, alignment: Double): Graphics = js.native
  def lineTo(x: Double, y: Double): Graphics = js.native
  def moveTo(x: Double, y: Double): Graphics = js.native
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
  def updateLocalBounds(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Graphics")
@js.native
object Graphics extends js.Object {
  var CURVES: Anon_Adaptive = js.native
  var _SPRITE_TEXTURE: Texture = js.native
}

