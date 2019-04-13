package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "vec2")
@js.native
class vec2 () extends js.Object

/* static members */
@JSImport("p2", "vec2")
@js.native
object vec2 extends js.Object {
  def add(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def centroid(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double],
    c: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def clone(a: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def copy(out: js.Tuple2[scala.Double, scala.Double], a: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def create(): js.Tuple2[scala.Double, scala.Double] = js.native
  def crossLength(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def crossVZ(
    out: js.Tuple2[scala.Double, scala.Double],
    vec: js.Tuple2[scala.Double, scala.Double],
    zcomp: scala.Double
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def crossZV(
    out: js.Tuple2[scala.Double, scala.Double],
    zcomp: scala.Double,
    vec: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def dist(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def distance(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def div(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def divide(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def dot(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def fromValues(x: scala.Double, y: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def getLineSegmentsIntersection(
    out: js.Tuple2[scala.Double, scala.Double],
    p1: js.Tuple2[scala.Double, scala.Double],
    p2: js.Tuple2[scala.Double, scala.Double],
    p3: js.Tuple2[scala.Double, scala.Double],
    p4: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def getLineSegmentsIntersectionFraction(
    p1: js.Tuple2[scala.Double, scala.Double],
    p2: js.Tuple2[scala.Double, scala.Double],
    p3: js.Tuple2[scala.Double, scala.Double],
    p4: js.Tuple2[scala.Double, scala.Double]
  ): scala.Double = js.native
  def len(a: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def length(a: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def lerp(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double],
    t: scala.Double
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def mul(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def multiply(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def negate(out: js.Tuple2[scala.Double, scala.Double], a: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def normalize(out: js.Tuple2[scala.Double, scala.Double], a: js.Tuple2[scala.Double, scala.Double]): js.Tuple2[scala.Double, scala.Double] = js.native
  def reflect(
    out: js.Tuple2[scala.Double, scala.Double],
    vector: js.Tuple2[scala.Double, scala.Double],
    normal: js.Tuple2[scala.Double, scala.Double]
  ): scala.Unit = js.native
  def rotate(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    angle: scala.Double
  ): scala.Unit = js.native
  def rotate90cw(out: js.Tuple2[scala.Double, scala.Double], a: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def scale(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: scala.Double
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def set(out: js.Tuple2[scala.Double, scala.Double], x: scala.Double, y: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def sqrDist(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def sqrLen(a: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def squaredDistance(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def squaredLength(a: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def str(a: js.Tuple2[scala.Double, scala.Double]): java.lang.String = js.native
  def sub(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def subtract(
    out: js.Tuple2[scala.Double, scala.Double],
    a: js.Tuple2[scala.Double, scala.Double],
    b: js.Tuple2[scala.Double, scala.Double]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def toGlobalFrame(
    out: js.Tuple2[scala.Double, scala.Double],
    localPoint: js.Tuple2[scala.Double, scala.Double],
    framePosition: js.Tuple2[scala.Double, scala.Double],
    frameAngle: scala.Double
  ): scala.Unit = js.native
  def toLocalFrame(
    out: js.Tuple2[scala.Double, scala.Double],
    worldPoint: js.Tuple2[scala.Double, scala.Double],
    framePosition: js.Tuple2[scala.Double, scala.Double],
    frameAngle: scala.Double
  ): scala.Unit = js.native
  def vectorToLocalFrame(
    out: js.Tuple2[scala.Double, scala.Double],
    worldVector: js.Tuple2[scala.Double, scala.Double],
    frameAngle: scala.Double
  ): scala.Unit = js.native
}

