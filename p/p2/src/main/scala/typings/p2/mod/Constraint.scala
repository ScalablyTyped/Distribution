package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Constraint")
@js.native
class Constraint protected () extends StObject {
  def this(bodyA: Body, bodyB: Body, `type`: Double) = this()
  def this(bodyA: Body, bodyB: Body, `type`: Double, options: ConstraintOptions) = this()
  
  var bodyA: Body = js.native
  
  var bodyB: Body = js.native
  
  var collideConnected: Boolean = js.native
  
  var equations: js.Array[Equation] = js.native
  
  def setRelaxation(relaxation: Double): Unit = js.native
  
  def setStiffness(stiffness: Double): Unit = js.native
  
  var `type`: Double = js.native
  
  def update(): Unit = js.native
}
/* static members */
object Constraint {
  
  @JSImport("p2", "Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Constraint.DISTANCE")
  @js.native
  def DISTANCE: Double = js.native
  @scala.inline
  def DISTANCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISTANCE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Constraint.GEAR")
  @js.native
  def GEAR: Double = js.native
  @scala.inline
  def GEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Constraint.LOCK")
  @js.native
  def LOCK: Double = js.native
  @scala.inline
  def LOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Constraint.PRISMATIC")
  @js.native
  def PRISMATIC: Double = js.native
  @scala.inline
  def PRISMATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRISMATIC")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Constraint.REVOLUTE")
  @js.native
  def REVOLUTE: Double = js.native
  @scala.inline
  def REVOLUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVOLUTE")(x.asInstanceOf[js.Any])
}
