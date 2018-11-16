package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.ShapeRenderer")
@js.native
class ShapeRenderer protected ()
  extends phaserLib.spineNs.Disposable {
  def this(context: ManagedWebGLRenderingContext) = this()
  def this(context: stdLib.WebGLRenderingContext) = this()
  def this(context: ManagedWebGLRenderingContext, maxVertices: scala.Double) = this()
  def this(context: stdLib.WebGLRenderingContext, maxVertices: scala.Double) = this()
  var color: js.Any = js.native
  var context: js.Any = js.native
  var dstBlend: js.Any = js.native
  var isDrawing: js.Any = js.native
  var mesh: js.Any = js.native
  var shader: js.Any = js.native
  var shapeType: js.Any = js.native
  var srcBlend: js.Any = js.native
  var tmp: js.Any = js.native
  var vertexIndex: js.Any = js.native
  def begin(shader: Shader): scala.Unit = js.native
  /* private */ def check(shapeType: js.Any, numVertices: js.Any): js.Any = js.native
  def circle(filled: scala.Boolean, x: scala.Double, y: scala.Double, radius: scala.Double): scala.Unit = js.native
  def circle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def circle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    color: phaserLib.spineNs.Color,
    segments: scala.Double
  ): scala.Unit = js.native
  def curve(
    x1: scala.Double,
    y1: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    segments: scala.Double
  ): scala.Unit = js.native
  def curve(
    x1: scala.Double,
    y1: scala.Double,
    cx1: scala.Double,
    cy1: scala.Double,
    cx2: scala.Double,
    cy2: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    segments: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  /* private */ def flush(): js.Any = js.native
  def line(x: scala.Double, y: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  def line(
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def point(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def point(x: scala.Double, y: scala.Double, color: phaserLib.spineNs.Color): scala.Unit = js.native
  def polygon(
    polygonVertices: phaserLib.spineNs.ArrayLike[scala.Double],
    offset: scala.Double,
    count: scala.Double
  ): scala.Unit = js.native
  def polygon(
    polygonVertices: phaserLib.spineNs.ArrayLike[scala.Double],
    offset: scala.Double,
    count: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def quad(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    x4: scala.Double,
    y4: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color,
    color4: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def rect(filled: scala.Boolean, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def rect(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def rectLine(
    filled: scala.Boolean,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    width: scala.Double
  ): scala.Unit = js.native
  def rectLine(
    filled: scala.Boolean,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    width: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def setBlendMode(srcBlend: scala.Double, dstBlend: scala.Double): scala.Unit = js.native
  def setColor(color: phaserLib.spineNs.Color): scala.Unit = js.native
  def setColorWith(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  def triangle(
    filled: scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    color: phaserLib.spineNs.Color,
    color2: phaserLib.spineNs.Color,
    color3: phaserLib.spineNs.Color
  ): scala.Unit = js.native
  /* private */ def vertex(x: js.Any, y: js.Any, color: js.Any): js.Any = js.native
  def x(x: scala.Double, y: scala.Double, size: scala.Double): scala.Unit = js.native
}

