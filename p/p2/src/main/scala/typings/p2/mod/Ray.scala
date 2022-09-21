package typings.p2.mod

import typings.p2.p2Numbers.`1`
import typings.p2.p2Numbers.`2`
import typings.p2.p2Numbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Ray")
@js.native
open class Ray () extends StObject {
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
  
  var mode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Ray.CLOSEST */ Any = js.native
  
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
  def ALL: `4` = js.native
  inline def ALL_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Ray.ANY")
  @js.native
  def ANY: `2` = js.native
  inline def ANY_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANY")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Ray.CLOSEST")
  @js.native
  def CLOSEST: `1` = js.native
  inline def CLOSEST_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSEST")(x.asInstanceOf[js.Any])
}
