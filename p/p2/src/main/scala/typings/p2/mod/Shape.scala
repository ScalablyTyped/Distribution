package typings.p2.mod

import typings.p2.p2Numbers.`128`
import typings.p2.p2Numbers.`16`
import typings.p2.p2Numbers.`1`
import typings.p2.p2Numbers.`2`
import typings.p2.p2Numbers.`32`
import typings.p2.p2Numbers.`4`
import typings.p2.p2Numbers.`64`
import typings.p2.p2Numbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Shape")
@js.native
open class Shape () extends StObject {
  def this(options: ShapeOptions) = this()
  
  var angle: Double = js.native
  
  var area: Double = js.native
  
  var body: Body = js.native
  
  var boundingRadius: Double = js.native
  
  var collisionGroup: Double = js.native
  
  var collisionMask: Double = js.native
  
  var collisionResponse: Boolean = js.native
  
  def computeAABB(): Unit = js.native
  def computeAABB(out: Unit, position: js.Tuple2[Double, Double]): Unit = js.native
  def computeAABB(out: Unit, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def computeAABB(out: Unit, position: Unit, angle: Double): Unit = js.native
  def computeAABB(out: AABB): Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[Double, Double]): Unit = js.native
  def computeAABB(out: AABB, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def computeAABB(out: AABB, position: Unit, angle: Double): Unit = js.native
  
  def computeMomentOfInertia(): Double = js.native
  def computeMomentOfInertia(mass: Double): Double = js.native
  
  var id: Double = js.native
  
  var material: Material = js.native
  
  var position: js.Tuple2[Double, Double] = js.native
  
  def raycast(): Unit = js.native
  def raycast(result: Unit, ray: Unit, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: Unit, ray: Unit, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def raycast(result: Unit, ray: Unit, position: Unit, angle: Double): Unit = js.native
  def raycast(result: Unit, ray: Ray): Unit = js.native
  def raycast(result: Unit, ray: Ray, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: Unit, ray: Ray, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def raycast(result: Unit, ray: Ray, position: Unit, angle: Double): Unit = js.native
  def raycast(result: RaycastResult): Unit = js.native
  def raycast(result: RaycastResult, ray: Unit, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: RaycastResult, ray: Unit, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def raycast(result: RaycastResult, ray: Unit, position: Unit, angle: Double): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.Tuple2[Double, Double]): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def raycast(result: RaycastResult, ray: Ray, position: Unit, angle: Double): Unit = js.native
  
  var sensor: Boolean = js.native
  
  var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Shape.CIRCLE */ Any = js.native
  
  def updateArea(): Unit = js.native
  
  def updateBoundingRadius(): Double = js.native
}
/* static members */
object Shape {
  
  @JSImport("p2", "Shape")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Shape.BOX")
  @js.native
  def BOX: `32` = js.native
  inline def BOX_=(x: `32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOX")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.CAPSULE")
  @js.native
  def CAPSULE: `64` = js.native
  inline def CAPSULE_=(x: `64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPSULE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.CIRCLE")
  @js.native
  def CIRCLE: `1` = js.native
  inline def CIRCLE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CIRCLE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.CONVEX")
  @js.native
  def CONVEX: `8` = js.native
  inline def CONVEX_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONVEX")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.HEIGHTFIELD")
  @js.native
  def HEIGHTFIELD: `128` = js.native
  inline def HEIGHTFIELD_=(x: `128`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHTFIELD")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.LINE")
  @js.native
  def LINE: `16` = js.native
  inline def LINE_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.PARTICLE")
  @js.native
  def PARTICLE: `2` = js.native
  inline def PARTICLE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARTICLE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.PLANE")
  @js.native
  def PLANE: `4` = js.native
  inline def PLANE_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLANE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Shape.idCounter")
  @js.native
  def idCounter: Double = js.native
  inline def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
