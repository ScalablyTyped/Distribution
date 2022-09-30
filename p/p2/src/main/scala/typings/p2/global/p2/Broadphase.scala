package typings.p2.global.p2

import typings.p2.p2Ints.`1`
import typings.p2.p2Ints.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Broadphase")
@js.native
open class Broadphase protected ()
  extends typings.p2.mod.Broadphase {
  def this(`type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Broadphase.NAIVE */ Any) = this()
}
/* static members */
object Broadphase {
  
  @JSGlobal("p2.Broadphase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Broadphase.AABB")
  @js.native
  def AABB: `1` = js.native
  inline def AABB_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AABB")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Broadphase.BOUNDING_CIRCLE")
  @js.native
  def BOUNDING_CIRCLE: `2` = js.native
  inline def BOUNDING_CIRCLE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOUNDING_CIRCLE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Broadphase.NAIVE")
  @js.native
  def NAIVE: `1` = js.native
  inline def NAIVE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAIVE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Broadphase.SAP")
  @js.native
  def SAP: `2` = js.native
  inline def SAP_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SAP")(x.asInstanceOf[js.Any])
  
  inline def aabbCheck(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aabbCheck")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def boundingRadiusCheck(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundingRadiusCheck")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def canCollide(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canCollide")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
