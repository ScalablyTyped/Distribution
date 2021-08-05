package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Ray")
@js.native
class Ray () extends StObject {
  def this(options: RayOptions) = this()
  
  def callback(result: RaycastResult): Unit = js.native
  
  var checkCollisionResponse: Boolean = js.native
  
  var collisionGroup: Double = js.native
  
  var collisionMask: Double = js.native
  
  var direction: js.Tuple2[Double, Double] = js.native
  
  var from: js.Tuple2[Double, Double] = js.native
  
  def getAABB(): AABB = js.native
  
  def intersectBodies(result: RaycastResult, bodies: js.Array[Body]): Unit = js.native
  
  var length: Double = js.native
  
  var mode: Double = js.native
  
  var skipBackfaces: Boolean = js.native
  
  var to: js.Tuple2[Double, Double] = js.native
  
  def update(): Unit = js.native
}
/* static members */
object Ray {
  
  @JSImport("p2", "Ray")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Ray.ALL")
  @js.native
  def ALL: Double = js.native
  inline def ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Ray.ANY")
  @js.native
  def ANY: Double = js.native
  inline def ANY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Ray.CLOSEST")
  @js.native
  def CLOSEST: Double = js.native
  inline def CLOSEST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSEST")(x.asInstanceOf[js.Any])
}
