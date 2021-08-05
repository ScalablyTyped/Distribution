package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Equation")
@js.native
class Equation protected () extends StObject {
  def this(bodyA: Body, bodyB: Body) = this()
  def this(bodyA: Body, bodyB: Body, minForce: Double) = this()
  def this(bodyA: Body, bodyB: Body, minForce: Double, maxForce: Double) = this()
  def this(bodyA: Body, bodyB: Body, minForce: Unit, maxForce: Double) = this()
  
  var G: js.Tuple2[Double, Double] = js.native
  
  def addToWlambda(deltalambda: Double): Double = js.native
  
  var bodyA: Body = js.native
  
  var bodyB: Body = js.native
  
  def computeB(a: Double, b: Double, h: Double): Double = js.native
  
  def computeGW(): Double = js.native
  
  def computeGWlambda(): Double = js.native
  
  def computeGiMGt(): Double = js.native
  
  def computeGiMf(): Double = js.native
  
  def computeGq(): Double = js.native
  
  def computeInvC(eps: Double): Double = js.native
  
  var enabled: Boolean = js.native
  
  var epsilon: Double = js.native
  
  def gmult(
    G: js.Tuple2[Double, Double],
    vi: js.Tuple2[Double, Double],
    wi: js.Tuple2[Double, Double],
    vj: js.Tuple2[Double, Double],
    wj: js.Tuple2[Double, Double]
  ): Double = js.native
  
  var maxForce: Double = js.native
  
  var minForce: Double = js.native
  
  var multiplier: Double = js.native
  
  var needsUpdate: Boolean = js.native
  
  var relativeVelocity: Double = js.native
  
  var relaxation: Double = js.native
  
  var stiffness: Double = js.native
  
  var timeStep: Double = js.native
  
  def update(): Unit = js.native
}
/* static members */
object Equation {
  
  @JSImport("p2", "Equation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Equation.DEFAULT_RELAXATION")
  @js.native
  def DEFAULT_RELAXATION: Double = js.native
  inline def DEFAULT_RELAXATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_RELAXATION")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Equation.DEFAULT_STIFFNESS")
  @js.native
  def DEFAULT_STIFFNESS: Double = js.native
  inline def DEFAULT_STIFFNESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_STIFFNESS")(x.asInstanceOf[js.Any])
}
