package typings.phaser.global.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Vector3")
@js.native
class Vector3 ()
  extends typings.phaser.spine.webgl.Vector3 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override var z: Double = js.native
  /* CompleteClass */
  override def add(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def cross(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def distance(v: typings.phaser.spine.webgl.Vector3): Double = js.native
  /* CompleteClass */
  override def dot(v: typings.phaser.spine.webgl.Vector3): Double = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def multiply(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def normalize(): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def project(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def scale(s: Double): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def set(x: Double, y: Double, z: Double): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def setFrom(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
  /* CompleteClass */
  override def sub(v: typings.phaser.spine.webgl.Vector3): typings.phaser.spine.webgl.Vector3 = js.native
}

