package typings.phaser.global.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.OrthoCamera")
@js.native
class OrthoCamera protected ()
  extends typings.phaser.spine.webgl.OrthoCamera {
  def this(viewportWidth: Double, viewportHeight: Double) = this()
  /* CompleteClass */
  override var direction: typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var far: Double = js.native
  /* CompleteClass */
  override var inverseProjectionView: typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var near: Double = js.native
  /* CompleteClass */
  override var position: typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var projection: typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var projectionView: typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var tmp: js.Any = js.native
  /* CompleteClass */
  override var up: typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override var view: typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override var viewportHeight: Double = js.native
  /* CompleteClass */
  override var viewportWidth: Double = js.native
  /* CompleteClass */
  override var zoom: Double = js.native
  /* CompleteClass */
  override def screenToWorld(screenCoords: typings.phaser.spine.webgl.Vector3, screenWidth: Double, screenHeight: Double): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

