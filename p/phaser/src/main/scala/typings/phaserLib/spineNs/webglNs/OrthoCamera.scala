package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.OrthoCamera")
@js.native
class OrthoCamera protected () extends js.Object {
  def this(viewportWidth: scala.Double, viewportHeight: scala.Double) = this()
  var direction: Vector3 = js.native
  var far: scala.Double = js.native
  var inverseProjectionView: Matrix4 = js.native
  var near: scala.Double = js.native
  var position: Vector3 = js.native
  var projection: Matrix4 = js.native
  var projectionView: Matrix4 = js.native
  var tmp: js.Any = js.native
  var up: Vector3 = js.native
  var view: Matrix4 = js.native
  var viewportHeight: scala.Double = js.native
  var viewportWidth: scala.Double = js.native
  var zoom: scala.Double = js.native
  def screenToWorld(screenCoords: Vector3, screenWidth: scala.Double, screenHeight: scala.Double): Vector3 = js.native
  def setViewport(viewportWidth: scala.Double, viewportHeight: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

