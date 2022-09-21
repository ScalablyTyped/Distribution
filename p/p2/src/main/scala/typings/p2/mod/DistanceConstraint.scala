package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "DistanceConstraint")
@js.native
open class DistanceConstraint protected () extends Constraint {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, options: DistanceConstraintOptions) = this()
  
  var distance: Double = js.native
  
  def getMaxForce(): Double = js.native
  
  var localAnchorA: js.Tuple2[Double, Double] = js.native
  
  var localAnchorB: js.Tuple2[Double, Double] = js.native
  
  var lowerLimit: Double = js.native
  
  var lowerLimitEnabled: Boolean = js.native
  
  var maxForce: Double = js.native
  
  var position: Double = js.native
  
  def setMaxForce(maxForce: Double): Unit = js.native
  
  var upperLimit: Double = js.native
  
  var upperLimitEnabled: Boolean = js.native
}
