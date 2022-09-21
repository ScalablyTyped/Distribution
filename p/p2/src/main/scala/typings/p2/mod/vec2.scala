package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "vec2")
@js.native
open class vec2 () extends StObject
/* static members */
object vec2 {
  
  @JSImport("p2", "vec2")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def centroid(
    out: js.Tuple2[Double, Double],
    a: js.Tuple2[Double, Double],
    b: js.Tuple2[Double, Double],
    c: js.Tuple2[Double, Double]
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("centroid")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def clone(a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def copy(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def create(): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def crossLength(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("crossLength")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def crossVZ(out: js.Tuple2[Double, Double], vec: js.Tuple2[Double, Double], zcomp: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("crossVZ")(out.asInstanceOf[js.Any], vec.asInstanceOf[js.Any], zcomp.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def crossZV(out: js.Tuple2[Double, Double], zcomp: Double, vec: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("crossZV")(out.asInstanceOf[js.Any], zcomp.asInstanceOf[js.Any], vec.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def dist(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def div(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def divide(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def dot(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromValues(x: Double, y: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getLineSegmentsIntersection(
    out: js.Tuple2[Double, Double],
    p1: js.Tuple2[Double, Double],
    p2: js.Tuple2[Double, Double],
    p3: js.Tuple2[Double, Double],
    p4: js.Tuple2[Double, Double]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineSegmentsIntersection")(out.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getLineSegmentsIntersectionFraction(
    p1: js.Tuple2[Double, Double],
    p2: js.Tuple2[Double, Double],
    p3: js.Tuple2[Double, Double],
    p4: js.Tuple2[Double, Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineSegmentsIntersectionFraction")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def len(a: js.Tuple2[Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def length(a: js.Tuple2[Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def lerp(
    out: js.Tuple2[Double, Double],
    a: js.Tuple2[Double, Double],
    b: js.Tuple2[Double, Double],
    t: Double
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def mul(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def multiply(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def negate(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def normalize(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def reflect(
    out: js.Tuple2[Double, Double],
    vector: js.Tuple2[Double, Double],
    normal: js.Tuple2[Double, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reflect")(out.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], normal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rotate(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rotate90cw(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate90cw")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scale(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def set(out: js.Tuple2[Double, Double], x: Double, y: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def sqrDist(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sqrLen(a: js.Tuple2[Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def squaredDistance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def squaredLength(a: js.Tuple2[Double, Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def str(a: js.Tuple2[Double, Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sub(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def subtract(out: js.Tuple2[Double, Double], a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def toGlobalFrame(
    out: js.Tuple2[Double, Double],
    localPoint: js.Tuple2[Double, Double],
    framePosition: js.Tuple2[Double, Double],
    frameAngle: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toGlobalFrame")(out.asInstanceOf[js.Any], localPoint.asInstanceOf[js.Any], framePosition.asInstanceOf[js.Any], frameAngle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toLocalFrame(
    out: js.Tuple2[Double, Double],
    worldPoint: js.Tuple2[Double, Double],
    framePosition: js.Tuple2[Double, Double],
    frameAngle: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toLocalFrame")(out.asInstanceOf[js.Any], worldPoint.asInstanceOf[js.Any], framePosition.asInstanceOf[js.Any], frameAngle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vectorToLocalFrame(out: js.Tuple2[Double, Double], worldVector: js.Tuple2[Double, Double], frameAngle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vectorToLocalFrame")(out.asInstanceOf[js.Any], worldVector.asInstanceOf[js.Any], frameAngle.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
