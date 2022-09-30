package typings.p2.mod

import typings.p2.p2Ints.`1`
import typings.p2.p2Ints.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Broadphase")
@js.native
open class Broadphase protected () extends StObject {
  def this(`type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Broadphase.NAIVE */ Any) = this()
  
  def aabbCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def aabbQuery(): js.Array[Body] = js.native
  def aabbQuery(world: Unit, aabb: Unit, result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: Unit, aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: Unit, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: World): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: Unit, result: js.Array[Body]): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB): js.Array[Body] = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  
  def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def boundingVolumeCheck(bodyA: Body, bodyB: Body): Boolean = js.native
  
  var boundingVolumeType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Broadphase.AABB */ Any = js.native
  
  def canCollide(bodyA: Body, bodyB: Body): Boolean = js.native
  
  def getCollisionPairs(world: World): js.Array[Body] = js.native
  
  var result: js.Array[Body] = js.native
  
  def setWorld(world: World): Unit = js.native
  
  var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Broadphase.NAIVE */ Any = js.native
  
  var world: World = js.native
}
/* static members */
object Broadphase {
  
  @JSImport("p2", "Broadphase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Broadphase.AABB")
  @js.native
  def AABB: `1` = js.native
  inline def AABB_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AABB")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.BOUNDING_CIRCLE")
  @js.native
  def BOUNDING_CIRCLE: `2` = js.native
  inline def BOUNDING_CIRCLE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOUNDING_CIRCLE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.NAIVE")
  @js.native
  def NAIVE: `1` = js.native
  inline def NAIVE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAIVE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Broadphase.SAP")
  @js.native
  def SAP: `2` = js.native
  inline def SAP_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP")(x.asInstanceOf[js.Any])
  
  inline def aabbCheck(bodyA: Body, bodyB: Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aabbCheck")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundingRadiusCheck(bodyA: Body, bodyB: Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundingRadiusCheck")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def canCollide(bodyA: Body, bodyB: Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canCollide")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
