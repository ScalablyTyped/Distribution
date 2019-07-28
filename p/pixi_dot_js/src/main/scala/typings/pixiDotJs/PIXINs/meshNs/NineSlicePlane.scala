package typings.pixiDotJs.PIXINs.meshNs

import typings.pixiDotJs.PIXINs.Texture
import typings.std.CanvasRenderingContext2D
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.NineSlicePlane")
@js.native
class NineSlicePlane protected () extends Plane {
  def this(texture: Texture) = this()
  def this(texture: Texture, leftWidth: Double) = this()
  def this(texture: Texture, leftWidth: Double, topHeight: Double) = this()
  def this(texture: Texture, leftWidth: Double, topHeight: Double, rightWidth: Double) = this()
  def this(texture: Texture, leftWidth: Double, topHeight: Double, rightWidth: Double, bottomHeight: Double) = this()
  var _bottomHeight: Double = js.native
  var _height: Double = js.native
  var _leftWidth: Double = js.native
  var _origHeight: Double = js.native
  var _origWidth: Double = js.native
  var _rightWidth: Double = js.native
  var _topHeight: Double = js.native
  var _uvh: Double = js.native
  var _uvw: Double = js.native
  var _width: Double = js.native
  var bottomHeight: Double = js.native
  var leftWidth: Double = js.native
  var rightWidth: Double = js.native
  var topHeight: Double = js.native
  /* protected */ def drawSegment(
    context: CanvasRenderingContext2D,
    textureSource: js.Any,
    w: Double,
    h: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double
  ): Unit = js.native
  /* protected */ def drawSegment(
    context: WebGLRenderingContext,
    textureSource: js.Any,
    w: Double,
    h: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double
  ): Unit = js.native
  def updateHorizontalVertices(): Unit = js.native
  def updateVerticalVertices(): Unit = js.native
}

