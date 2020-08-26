package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Color
import typings.phaser.spine.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeRenderer extends Disposable {
  var check: js.Any = js.native
  var color: js.Any = js.native
  var context: js.Any = js.native
  var dstBlend: js.Any = js.native
  var flush: js.Any = js.native
  var isDrawing: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var shapeType: js.Any = js.native
  var srcBlend: js.Any = js.native
  var tmp: js.Any = js.native
  var vertex: js.Any = js.native
  var vertexIndex: js.Any = js.native
  def begin(shader: Shader): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double): Unit = js.native
  def circle(
    filled: Boolean,
    x: Double,
    y: Double,
    radius: Double,
    color: js.UndefOr[scala.Nothing],
    segments: Double
  ): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double, color: Color): Unit = js.native
  def circle(filled: Boolean, x: Double, y: Double, radius: Double, color: Color, segments: Double): Unit = js.native
  def curve(
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    segments: Double
  ): Unit = js.native
  def curve(
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    segments: Double,
    color: Color
  ): Unit = js.native
  def end(): Unit = js.native
  def line(x: Double, y: Double, x2: Double, y2: Double): Unit = js.native
  def line(x: Double, y: Double, x2: Double, y2: Double, color: Color): Unit = js.native
  def point(x: Double, y: Double): Unit = js.native
  def point(x: Double, y: Double, color: Color): Unit = js.native
  def polygon(polygonVertices: ArrayLike[Double], offset: Double, count: Double): Unit = js.native
  def polygon(polygonVertices: ArrayLike[Double], offset: Double, count: Double, color: Color): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: js.UndefOr[scala.Nothing],
    color3: js.UndefOr[scala.Nothing],
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: js.UndefOr[scala.Nothing],
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: js.UndefOr[scala.Nothing],
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color,
    color3: js.UndefOr[scala.Nothing],
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color,
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: js.UndefOr[scala.Nothing],
    color3: js.UndefOr[scala.Nothing],
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: js.UndefOr[scala.Nothing],
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: js.UndefOr[scala.Nothing],
    color3: Color,
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: js.UndefOr[scala.Nothing],
    color4: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: Color
  ): Unit = js.native
  def quad(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double,
    y4: Double,
    color: Color,
    color2: Color,
    color3: Color,
    color4: Color
  ): Unit = js.native
  def rect(filled: Boolean, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def rect(filled: Boolean, x: Double, y: Double, width: Double, height: Double, color: Color): Unit = js.native
  def rectLine(filled: Boolean, x1: Double, y1: Double, x2: Double, y2: Double, width: Double): Unit = js.native
  def rectLine(filled: Boolean, x1: Double, y1: Double, x2: Double, y2: Double, width: Double, color: Color): Unit = js.native
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
  def setColor(color: Color): Unit = js.native
  def setColorWith(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def triangle(filled: Boolean, x: Double, y: Double, x2: Double, y2: Double, x3: Double, y3: Double): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: js.UndefOr[scala.Nothing],
    color2: js.UndefOr[scala.Nothing],
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: js.UndefOr[scala.Nothing],
    color2: Color,
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: js.UndefOr[scala.Nothing],
    color3: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: Color
  ): Unit = js.native
  def triangle(
    filled: Boolean,
    x: Double,
    y: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    color: Color,
    color2: Color,
    color3: Color
  ): Unit = js.native
  def x(x: Double, y: Double, size: Double): Unit = js.native
}

