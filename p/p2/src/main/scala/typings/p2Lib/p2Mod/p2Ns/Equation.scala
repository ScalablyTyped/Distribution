package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Equation extends js.Object {
  var G: js.Array[scala.Double]
  var a: scala.Double
  var b: scala.Double
  var bodyA: Body
  var bodyB: Body
  var enabled: scala.Boolean
  var epsilon: scala.Double
  var maxForce: scala.Double
  var minForce: scala.Double
  var multiplier: scala.Double
  var needsUpdate: scala.Boolean
  var offset: scala.Double
  var relativeVelocity: scala.Double
  var relaxation: scala.Double
  var stiffness: scala.Double
  var timeStep: scala.Double
  def addToWlambda(deltalambda: scala.Double): scala.Double
  def computeB(a: scala.Double, b: scala.Double, h: scala.Double): scala.Double
  def computeGW(): scala.Double
  def computeGWlambda(): scala.Double
  def computeGiMGt(): scala.Double
  def computeGiMf(): scala.Double
  def computeGq(): scala.Double
  def computeInvC(eps: scala.Double): scala.Double
  def gmult(
    G: js.Array[scala.Double],
    vi: js.Array[scala.Double],
    wi: js.Array[scala.Double],
    vj: js.Array[scala.Double],
    wj: js.Array[scala.Double]
  ): scala.Double
}

