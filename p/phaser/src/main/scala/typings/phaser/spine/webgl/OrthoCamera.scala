package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.OrthoCamera")
@js.native
class OrthoCamera protected () extends js.Object {
  def this(viewportWidth: Double, viewportHeight: Double) = this()
  var direction: Vector3 = js.native
  var far: Double = js.native
  var inverseProjectionView: Matrix4 = js.native
  var near: Double = js.native
  var position: Vector3 = js.native
  var projection: Matrix4 = js.native
  var projectionView: Matrix4 = js.native
  var tmp: js.Any = js.native
  var up: Vector3 = js.native
  var view: Matrix4 = js.native
  var viewportHeight: Double = js.native
  var viewportWidth: Double = js.native
  var zoom: Double = js.native
  def screenToWorld(screenCoords: Vector3, screenWidth: Double, screenHeight: Double): Vector3 = js.native
  def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
  def update(): Unit = js.native
}

