package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Constraint")
@js.native
class Constraint protected () extends js.Object {
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
@JSImport("p2", "Constraint")
@js.native
object Constraint extends js.Object {
  
  var DISTANCE: Double = js.native
  
  var GEAR: Double = js.native
  
  var LOCK: Double = js.native
  
  var PRISMATIC: Double = js.native
  
  var REVOLUTE: Double = js.native
}
