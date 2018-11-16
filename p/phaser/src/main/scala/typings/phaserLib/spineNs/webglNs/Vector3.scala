package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Vector3")
@js.native
class Vector3 () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(v: Vector3): Vector3 = js.native
  def cross(v: Vector3): Vector3 = js.native
  def distance(v: Vector3): scala.Double = js.native
  def dot(v: Vector3): scala.Double = js.native
  def length(): scala.Double = js.native
  def multiply(matrix: Matrix4): Vector3 = js.native
  def normalize(): Vector3 = js.native
  def project(matrix: Matrix4): Vector3 = js.native
  def scale(s: scala.Double): Vector3 = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Vector3 = js.native
  def setFrom(v: Vector3): Vector3 = js.native
  def sub(v: Vector3): Vector3 = js.native
}

