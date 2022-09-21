package typings.p2.global.p2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Equation")
@js.native
open class Equation protected ()
  extends typings.p2.mod.Equation {
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body) = this()
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, minForce: Double) = this()
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, minForce: Double, maxForce: Double) = this()
  def this(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, minForce: Unit, maxForce: Double) = this()
}
/* static members */
object Equation {
  
  @JSGlobal("p2.Equation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Equation.DEFAULT_RELAXATION")
  @js.native
  def DEFAULT_RELAXATION: Double = js.native
  inline def DEFAULT_RELAXATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_RELAXATION")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Equation.DEFAULT_STIFFNESS")
  @js.native
  def DEFAULT_STIFFNESS: Double = js.native
  inline def DEFAULT_STIFFNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_STIFFNESS")(x.asInstanceOf[js.Any])
}
