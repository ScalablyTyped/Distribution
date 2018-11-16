package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends EventEmitter {
  var aabb: AABB = js.native
  var aabbNeedsUpdate: scala.Boolean = js.native
  var allowSleep: scala.Boolean = js.native
  var angle: scala.Double = js.native
  var angularDamping: scala.Double = js.native
  var angularForce: scala.Double = js.native
  var angularVelocity: scala.Double = js.native
  var boundingRadius: scala.Double = js.native
  var collisionResponse: scala.Boolean = js.native
  var damping: scala.Double = js.native
  var fixedRotation: scala.Double = js.native
  var force: js.Array[scala.Double] = js.native
  var gravityScale: scala.Double = js.native
  var id: scala.Double = js.native
  var inertia: scala.Double = js.native
  var interpolatedAngle: scala.Double = js.native
  var interpolatedPosition: js.Array[scala.Double] = js.native
  var invInertia: scala.Double = js.native
  var invInertiaSolve: scala.Double = js.native
  var invMass: scala.Double = js.native
  var invMassSolve: scala.Double = js.native
  var mass: scala.Double = js.native
  var position: js.Array[scala.Double] = js.native
  var previousAngle: scala.Double = js.native
  var previousPosition: js.Array[scala.Double] = js.native
  var shapes: js.Array[Shape] = js.native
  var sleepEvent: p2Lib.Anon_Type = js.native
  var sleepSpeedLimit: scala.Double = js.native
  var sleepState: scala.Double = js.native
  var sleepTimeLimit: scala.Double = js.native
  var sleepyEvent: p2Lib.Anon_Type = js.native
  var `type`: scala.Double = js.native
  var velocity: js.Array[scala.Double] = js.native
  var vlambda: js.Array[scala.Double] = js.native
  var wakeUpEvent: p2Lib.Anon_Type = js.native
  var wantsToSleep: scala.Boolean = js.native
  var wlambda: js.Array[scala.Double] = js.native
  var world: World = js.native
  def addShape(shape: Shape): scala.Unit = js.native
  def addShape(shape: Shape, offset: js.Array[scala.Double]): scala.Unit = js.native
  def addShape(shape: Shape, offset: js.Array[scala.Double], angle: scala.Double): scala.Unit = js.native
  def adjustCenterOfMass(): scala.Unit = js.native
  def applyDamping(dy: scala.Double): scala.Unit = js.native
  def applyForce(force: js.Array[scala.Double]): scala.Unit = js.native
  def applyForce(force: js.Array[scala.Double], relativePoint: js.Array[scala.Double]): scala.Unit = js.native
  def applyForceLocal(localforce: js.Array[scala.Double]): scala.Unit = js.native
  def applyForceLocal(localforce: js.Array[scala.Double], localPoint: js.Array[scala.Double]): scala.Unit = js.native
  def applyImpulse(impulse: js.Array[scala.Double]): scala.Unit = js.native
  def applyImpulse(impulse: js.Array[scala.Double], relativePoint: js.Array[scala.Double]): scala.Unit = js.native
  def applyImpulseLocal(impulse: js.Array[scala.Double]): scala.Unit = js.native
  def applyImpulseLocal(impulse: js.Array[scala.Double], localPoint: js.Array[scala.Double]): scala.Unit = js.native
  def fromPolygon(path: js.Array[js.Array[scala.Double]]): scala.Boolean = js.native
  def fromPolygon(path: js.Array[js.Array[scala.Double]], options: p2Lib.Anon_OptimalDecomp): scala.Boolean = js.native
  def getAABB(): AABB = js.native
  def getAngularVelocityFromPosition(timeStep: scala.Double): scala.Double = js.native
  def getArea(): scala.Double = js.native
  def getVelocityFromPosition(story: js.Array[scala.Double], dt: scala.Double): js.Array[scala.Double] = js.native
  def overlaps(body: Body): scala.Boolean = js.native
  def removeShape(shape: Shape): scala.Boolean = js.native
  def resetConstraintVelocity(): scala.Unit = js.native
  def setDensity(density: scala.Double): scala.Unit = js.native
  def setZeroForce(): scala.Unit = js.native
  def sleep(): scala.Unit = js.native
  def sleepTick(time: scala.Double, dontSleep: scala.Boolean, dt: scala.Double): scala.Unit = js.native
  def toLocalFrame(out: js.Array[scala.Double], worldPoint: js.Array[scala.Double]): scala.Unit = js.native
  def toWorldFrame(out: js.Array[scala.Double], localPoint: js.Array[scala.Double]): scala.Unit = js.native
  def updateAABB(): scala.Unit = js.native
  def updateBoundingRadius(): scala.Unit = js.native
  def updateMassProperties(): scala.Unit = js.native
  def updateSolveMassProperties(): scala.Unit = js.native
  def wakeUp(): scala.Unit = js.native
}

