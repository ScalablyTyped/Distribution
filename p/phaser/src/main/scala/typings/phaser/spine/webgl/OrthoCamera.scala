package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrthoCamera extends js.Object {
  var direction: Vector3
  var far: Double
  var inverseProjectionView: Matrix4
  var near: Double
  var position: Vector3
  var projection: Matrix4
  var projectionView: Matrix4
  var tmp: js.Any
  var up: Vector3
  var view: Matrix4
  var viewportHeight: Double
  var viewportWidth: Double
  var zoom: Double
  def screenToWorld(screenCoords: Vector3, screenWidth: Double, screenHeight: Double): Vector3
  def setViewport(viewportWidth: Double, viewportHeight: Double): Unit
  def update(): Unit
}

object OrthoCamera {
  @scala.inline
  def apply(
    direction: Vector3,
    far: Double,
    inverseProjectionView: Matrix4,
    near: Double,
    position: Vector3,
    projection: Matrix4,
    projectionView: Matrix4,
    screenToWorld: (Vector3, Double, Double) => Vector3,
    setViewport: (Double, Double) => Unit,
    tmp: js.Any,
    up: Vector3,
    update: () => Unit,
    view: Matrix4,
    viewportHeight: Double,
    viewportWidth: Double,
    zoom: Double
  ): OrthoCamera = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], inverseProjectionView = inverseProjectionView.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], projectionView = projectionView.asInstanceOf[js.Any], screenToWorld = js.Any.fromFunction3(screenToWorld), setViewport = js.Any.fromFunction2(setViewport), tmp = tmp.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), view = view.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthoCamera]
  }
}

