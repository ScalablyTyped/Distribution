package typings.p2.global.p2

import typings.p2.mod.ConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Constraint")
@js.native
class Constraint protected ()
  extends typings.p2.mod.Constraint {
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, `type`: Double) = this()
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, `type`: Double, options: ConstraintOptions) = this()
}
/* static members */
object Constraint {
  
  @JSGlobal("p2.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Constraint.DISTANCE")
  @js.native
  def DISTANCE: Double = js.native
  inline def DISTANCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISTANCE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.GEAR")
  @js.native
  def GEAR: Double = js.native
  inline def GEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEAR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.LOCK")
  @js.native
  def LOCK: Double = js.native
  inline def LOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.PRISMATIC")
  @js.native
  def PRISMATIC: Double = js.native
  inline def PRISMATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRISMATIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.REVOLUTE")
  @js.native
  def REVOLUTE: Double = js.native
  inline def REVOLUTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVOLUTE")(x.asInstanceOf[js.Any])
}
