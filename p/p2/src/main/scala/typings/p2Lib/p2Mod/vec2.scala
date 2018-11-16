package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "vec2")
@js.native
class vec2 ()
  extends p2Lib.p2Mod.p2Ns.vec2

@JSImport("p2", "vec2")
@js.native
object vec2 extends js.Object {
  def add(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def centroid(
    out: js.Array[scala.Double],
    a: js.Array[scala.Double],
    b: js.Array[scala.Double],
    c: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def clone(a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def copy(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def create(): js.Array[scala.Double] = js.native
  def crossLength(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def crossVZ(out: js.Array[scala.Double], vec: js.Array[scala.Double], zcomp: scala.Double): scala.Double = js.native
  def crossZV(out: js.Array[scala.Double], zcomp: scala.Double, vec: js.Array[scala.Double]): scala.Double = js.native
  def dist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def distance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def div(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def divide(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def dot(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def fromValues(x: scala.Double, y: scala.Double): js.Array[scala.Double] = js.native
  def len(a: js.Array[scala.Double]): scala.Double = js.native
  def length(a: js.Array[scala.Double]): scala.Double = js.native
  def mul(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def multiply(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def negate(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def normalize(out: js.Array[scala.Double], a: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def rotate(out: js.Array[scala.Double], a: js.Array[scala.Double], angle: scala.Double): scala.Unit = js.native
  def rotate90cw(out: js.Array[scala.Double], a: js.Array[scala.Double]): scala.Double = js.native
  def scale(out: js.Array[scala.Double], a: js.Array[scala.Double], b: scala.Double): js.Array[scala.Double] = js.native
  def set(out: js.Array[scala.Double], x: scala.Double, y: scala.Double): js.Array[scala.Double] = js.native
  def sqrDist(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def sqrLen(a: js.Array[scala.Double]): scala.Double = js.native
  def squaredDistance(a: js.Array[scala.Double], b: js.Array[scala.Double]): scala.Double = js.native
  def squaredLength(a: js.Array[scala.Double]): scala.Double = js.native
  def str(a: js.Array[scala.Double]): java.lang.String = js.native
  def sub(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def subtract(out: js.Array[scala.Double], a: js.Array[scala.Double], b: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toGlobalFrame(
    out: js.Array[scala.Double],
    localPoint: js.Array[scala.Double],
    framePosition: js.Array[scala.Double],
    frameAngle: scala.Double
  ): scala.Unit = js.native
  def toLocalFrame(
    out: js.Array[scala.Double],
    worldPoint: js.Array[scala.Double],
    framePosition: js.Array[scala.Double],
    frameAngle: scala.Double
  ): scala.Unit = js.native
}

