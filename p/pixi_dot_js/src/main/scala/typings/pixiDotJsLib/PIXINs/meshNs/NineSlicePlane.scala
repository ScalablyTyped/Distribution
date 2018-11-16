package typings
package pixiDotJsLib.PIXINs.meshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.mesh.NineSlicePlane")
@js.native
class NineSlicePlane protected () extends Plane {
  def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double, rightWidth: scala.Double) = this()
  def this(texture: pixiDotJsLib.PIXINs.Texture, leftWidth: scala.Double, topHeight: scala.Double, rightWidth: scala.Double, bottomHeight: scala.Double) = this()
  var _bottomHeight: scala.Double = js.native
  var _height: scala.Double = js.native
  var _leftWidth: scala.Double = js.native
  var _origHeight: scala.Double = js.native
  var _origWidth: scala.Double = js.native
  var _rightWidth: scala.Double = js.native
  var _topHeight: scala.Double = js.native
  var _uvh: scala.Double = js.native
  var _uvw: scala.Double = js.native
  var _width: scala.Double = js.native
  var bottomHeight: scala.Double = js.native
  var leftWidth: scala.Double = js.native
  var rightWidth: scala.Double = js.native
  var topHeight: scala.Double = js.native
  /* protected */ def drawSegment(
    context: stdLib.CanvasRenderingContext2D,
    textureSource: js.Any,
    w: scala.Double,
    h: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Unit = js.native
  /* protected */ def drawSegment(
    context: stdLib.WebGLRenderingContext,
    textureSource: js.Any,
    w: scala.Double,
    h: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Unit = js.native
  def updateHorizontalVertices(): scala.Unit = js.native
  def updateVerticalVertices(): scala.Unit = js.native
}

