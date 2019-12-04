package typings.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Vector3")
@js.native
class Vector3 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def add(v: Vector3): Vector3 = js.native
  def cross(v: Vector3): Vector3 = js.native
  def distance(v: Vector3): Double = js.native
  def dot(v: Vector3): Double = js.native
  def length(): Double = js.native
  def multiply(matrix: Matrix4): Vector3 = js.native
  def normalize(): Vector3 = js.native
  def project(matrix: Matrix4): Vector3 = js.native
  def scale(s: Double): Vector3 = js.native
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  def setFrom(v: Vector3): Vector3 = js.native
  def sub(v: Vector3): Vector3 = js.native
}

