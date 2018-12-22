package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Graphics")
@js.native
class Graphics () extends Container {
  def this(nativeLines: scala.Boolean) = this()
  var _fastRect: scala.Boolean = js.native
  var _localBounds: Bounds = js.native
  var _prevTint: scala.Double = js.native
  var _spriteRect: Rectangle = js.native
  var _webGL: js.Any = js.native
  var blendMode: scala.Double = js.native
  var boundsDirty: scala.Double = js.native
  var boundsPadding: scala.Double = js.native
  var cachedSpriteDirty: scala.Boolean = js.native
  var canvasTintDirty: scala.Double = js.native
  var clearDirty: scala.Double = js.native
  var currentPath: GraphicsData = js.native
  var dirty: scala.Double = js.native
  var fastRectDirty: scala.Double = js.native
  var fillAlpha: scala.Double = js.native
  var graphicsData: js.Array[GraphicsData] = js.native
  var isMask: scala.Boolean = js.native
  var lineAlignment: scala.Double = js.native
  var lineColor: scala.Double = js.native
  var lineWidth: scala.Double = js.native
  var nativeLines: scala.Boolean = js.native
  var tint: scala.Double = js.native
  /* protected */ def _bezierCurveLength(
    fromX: scala.Double,
    fromY: scala.Double,
    cpX: scala.Double,
    cpY: scala.Double,
    cpX2: scala.Double,
    cpY2: scala.Double,
    toX: scala.Double,
    toY: scala.Double
  ): scala.Double = js.native
  /* protected */ def _quadraticCurveLength(
    fromX: scala.Double,
    fromY: scala.Double,
    cpX: scala.Double,
    cpY: scala.Double,
    toX: scala.Double,
    toY: scala.Double
  ): scala.Double = js.native
  /* protected */ def _renderSpriteRect(renderer: SystemRenderer): scala.Unit = js.native
  /* protected */ def _segmentsCount(length: scala.Double): scala.Double = js.native
  def addHole(): Graphics = js.native
  def arc(
    cx: scala.Double,
    cy: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): Graphics = js.native
  def arc(
    cx: scala.Double,
    cy: scala.Double,
    radius: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): Graphics = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, radius: scala.Double): Graphics = js.native
  def beginFill(color: scala.Double): Graphics = js.native
  def beginFill(color: scala.Double, alpha: scala.Double): Graphics = js.native
  def bezierCurveTo(
    cpX: scala.Double,
    cpY: scala.Double,
    cpX2: scala.Double,
    cpY2: scala.Double,
    toX: scala.Double,
    toY: scala.Double
  ): Graphics = js.native
  def clear(): Graphics = js.native
  def closePath(): Graphics = js.native
  def containsPoint(point: Point): scala.Boolean = js.native
  def drawCircle(x: scala.Double, y: scala.Double, radius: scala.Double): Graphics = js.native
  def drawEllipse(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Graphics = js.native
  def drawPolygon(path: js.Array[scala.Double | Point]): Graphics = js.native
  def drawPolygon(path: Polygon): Graphics = js.native
  def drawRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Graphics = js.native
  def drawRoundedRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, radius: scala.Double): Graphics = js.native
  def drawShape(shape: js.Any): GraphicsData = js.native
  def drawShape(shape: Circle): GraphicsData = js.native
  def drawShape(shape: Ellipse): GraphicsData = js.native
  def drawShape(shape: Polygon): GraphicsData = js.native
  def drawShape(shape: Rectangle): GraphicsData = js.native
  def drawShape(shape: RoundedRectangle): GraphicsData = js.native
  def drawStar(
    x: scala.Double,
    y: scala.Double,
    points: scala.Double,
    radius: scala.Double,
    innerRadius: scala.Double
  ): Graphics = js.native
  def drawStar(
    x: scala.Double,
    y: scala.Double,
    points: scala.Double,
    radius: scala.Double,
    innerRadius: scala.Double,
    rotation: scala.Double
  ): Graphics = js.native
  def endFill(): Graphics = js.native
  def generateCanvasTexture(): Texture = js.native
  def generateCanvasTexture(scaleMode: scala.Double): Texture = js.native
  def generateCanvasTexture(scaleMode: scala.Double, resolution: scala.Double): Texture = js.native
  def isFastRect(): scala.Boolean = js.native
  def lineStyle(): Graphics = js.native
  def lineStyle(lineWidth: scala.Double): Graphics = js.native
  def lineStyle(lineWidth: scala.Double, color: scala.Double): Graphics = js.native
  def lineStyle(lineWidth: scala.Double, color: scala.Double, alpha: scala.Double): Graphics = js.native
  def lineStyle(lineWidth: scala.Double, color: scala.Double, alpha: scala.Double, alignment: scala.Double): Graphics = js.native
  def lineTo(x: scala.Double, y: scala.Double): Graphics = js.native
  def moveTo(x: scala.Double, y: scala.Double): Graphics = js.native
  def quadraticCurveTo(cpX: scala.Double, cpY: scala.Double, toX: scala.Double, toY: scala.Double): Graphics = js.native
  def updateLocalBounds(): scala.Unit = js.native
}

@JSGlobal("PIXI.Graphics")
@js.native
object Graphics extends js.Object {
  var CURVES: pixiDotJsLib.Anon_Adaptive = js.native
  var _SPRITE_TEXTURE: pixiDotJsLib.PIXINs.Texture = js.native
}

