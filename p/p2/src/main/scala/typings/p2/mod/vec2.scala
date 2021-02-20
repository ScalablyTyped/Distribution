package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "vec2")
@js.native
class vec2 () extends StObject
/* static members */
object vec2 {
  
  @JSImport("p2", "vec2.add")
  @js.native
  def add(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.centroid")
  @js.native
  def centroid(
    out: js.Tuple2[Double, Double],
    a: js.Tuple2[Double, Double],
    b: js.Tuple2[Double, Double],
    c: js.Tuple2[Double, Double]
  ): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.clone")
  @js.native
  def clone(a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.copy")
  @js.native
  def copy(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.create")
  @js.native
  def create(): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.crossLength")
  @js.native
  def crossLength(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.crossVZ")
  @js.native
  def crossVZ(out: js.Tuple2[Double, Double], vec: js.Tuple2[Double, Double], zcomp: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.crossZV")
  @js.native
  def crossZV(out: js.Tuple2[Double, Double], zcomp: Double, vec: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.dist")
  @js.native
  def dist(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.distance")
  @js.native
  def distance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.div")
  @js.native
  def div(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.divide")
  @js.native
  def divide(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.dot")
  @js.native
  def dot(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.fromValues")
  @js.native
  def fromValues(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.getLineSegmentsIntersection")
  @js.native
  def getLineSegmentsIntersection(
    out: js.Tuple2[Double, Double],
    p1: js.Tuple2[Double, Double],
    p2: js.Tuple2[Double, Double],
    p3: js.Tuple2[Double, Double],
    p4: js.Tuple2[Double, Double]
  ): Boolean = js.native
  
  @JSImport("p2", "vec2.getLineSegmentsIntersectionFraction")
  @js.native
  def getLineSegmentsIntersectionFraction(
    p1: js.Tuple2[Double, Double],
    p2: js.Tuple2[Double, Double],
    p3: js.Tuple2[Double, Double],
    p4: js.Tuple2[Double, Double]
  ): Double = js.native
  
  @JSImport("p2", "vec2.len")
  @js.native
  def len(a: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.length")
  @js.native
  def length(a: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.lerp")
  @js.native
  def lerp(
    out: js.Tuple2[Double, Double],
    a: js.Tuple2[Double, Double],
    b: js.Tuple2[Double, Double],
    t: Double
  ): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.mul")
  @js.native
  def mul(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.multiply")
  @js.native
  def multiply(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.negate")
  @js.native
  def negate(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.normalize")
  @js.native
  def normalize(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.reflect")
  @js.native
  def reflect(
    out: js.Tuple2[Double, Double],
    vector: js.Tuple2[Double, Double],
    normal: js.Tuple2[Double, Double]
  ): Unit = js.native
  
  @JSImport("p2", "vec2.rotate")
  @js.native
  def rotate(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  
  @JSImport("p2", "vec2.rotate90cw")
  @js.native
  def rotate90cw(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): Unit = js.native
  
  @JSImport("p2", "vec2.scale")
  @js.native
  def scale(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.set")
  @js.native
  def set(out: js.Tuple2[Double, Double], x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.sqrDist")
  @js.native
  def sqrDist(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.sqrLen")
  @js.native
  def sqrLen(a: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.squaredDistance")
  @js.native
  def squaredDistance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.squaredLength")
  @js.native
  def squaredLength(a: js.Tuple2[Double, Double]): Double = js.native
  
  @JSImport("p2", "vec2.str")
  @js.native
  def str(a: js.Tuple2[Double, Double]): String = js.native
  
  @JSImport("p2", "vec2.sub")
  @js.native
  def sub(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.subtract")
  @js.native
  def subtract(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("p2", "vec2.toGlobalFrame")
  @js.native
  def toGlobalFrame(
    out: js.Tuple2[Double, Double],
    localPoint: js.Tuple2[Double, Double],
    framePosition: js.Tuple2[Double, Double],
    frameAngle: Double
  ): Unit = js.native
  
  @JSImport("p2", "vec2.toLocalFrame")
  @js.native
  def toLocalFrame(
    out: js.Tuple2[Double, Double],
    worldPoint: js.Tuple2[Double, Double],
    framePosition: js.Tuple2[Double, Double],
    frameAngle: Double
  ): Unit = js.native
  
  @JSImport("p2", "vec2.vectorToLocalFrame")
  @js.native
  def vectorToLocalFrame(out: js.Tuple2[Double, Double], worldVector: js.Tuple2[Double, Double], frameAngle: Double): Unit = js.native
}
