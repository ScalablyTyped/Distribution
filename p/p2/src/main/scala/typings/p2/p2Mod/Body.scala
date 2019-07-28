package typings.p2.p2Mod

import typings.p2.Anon_OptimalDecomp
import typings.p2.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Body")
@js.native
class Body () extends EventEmitter {
  def this(options: BodyOptions) = this()
  var aabb: AABB = js.native
  var aabbNeedsUpdate: Boolean = js.native
  var allowSleep: Boolean = js.native
  var angle: Double = js.native
  var angularDamping: Double = js.native
  var angularForce: Double = js.native
  var angularVelocity: Double = js.native
  var boundingRadius: Double = js.native
  var ccdIterations: Double = js.native
  var ccdSpeedThreshold: Double = js.native
  var collisionResponse: Boolean = js.native
  var damping: Double = js.native
  var fixedRotation: Boolean = js.native
  var fixedX: Boolean = js.native
  var fixedY: Boolean = js.native
  var force: js.Tuple2[Double, Double] = js.native
  var gravityScale: Double = js.native
  var id: Double = js.native
  var idleTime: Double = js.native
  var inertia: Double = js.native
  var interpolatedAngle: Double = js.native
  var interpolatedPosition: js.Tuple2[Double, Double] = js.native
  var invInertia: Double = js.native
  var invInertiaSolve: Double = js.native
  var invMass: Double = js.native
  var invMassSolve: Double = js.native
  var mass: Double = js.native
  var position: js.Tuple2[Double, Double] = js.native
  var previousAngle: Double = js.native
  var previousPosition: js.Tuple2[Double, Double] = js.native
  var shapes: js.Array[Shape] = js.native
  var sleepEvent: Anon_Type = js.native
  var sleepSpeedLimit: Double = js.native
  var sleepState: Double = js.native
  var sleepTimeLimit: Double = js.native
  var sleepyEvent: Anon_Type = js.native
  var `type`: Double = js.native
  var velocity: js.Tuple2[Double, Double] = js.native
  var vlambda: js.Tuple2[Double, Double] = js.native
  var wakeUpEvent: Anon_Type = js.native
  var wlambda: js.Tuple2[Double, Double] = js.native
  var world: World = js.native
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, offset: js.Tuple2[Double, Double]): Unit = js.native
  def addShape(shape: Shape, offset: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def adjustCenterOfMass(): Unit = js.native
  def applyDamping(dt: Double): Unit = js.native
  def applyForce(force: js.Tuple2[Double, Double]): Unit = js.native
  def applyForce(force: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): Unit = js.native
  def applyForceLocal(localForce: js.Tuple2[Double, Double]): Unit = js.native
  def applyForceLocal(localForce: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulse(impulseVector: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulse(impulseVector: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulseLocal(localImpulse: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulseLocal(localImpulse: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  def fromPolygon(path: js.Array[js.Tuple2[Double, Double]]): Boolean = js.native
  def fromPolygon(path: js.Array[js.Tuple2[Double, Double]], options: Anon_OptimalDecomp): Boolean = js.native
  def getAABB(): AABB = js.native
  def getArea(): Double = js.native
  def getVelocityAtPoint(result: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  def integrate(dy: Double): Unit = js.native
  def overlaps(body: Body): Boolean = js.native
  def removeShape(shape: Shape): Boolean = js.native
  def setDensity(density: Double): Unit = js.native
  def setZeroForce(): Unit = js.native
  def sleep(): Unit = js.native
  def sleepTick(time: Double, dontSleep: Boolean, dt: Double): Unit = js.native
  def toLocalFrame(out: js.Tuple2[Double, Double], worldPoint: js.Tuple2[Double, Double]): Unit = js.native
  def toWorldFrame(out: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  def updateAABB(): Unit = js.native
  def updateBoundingRadius(): Unit = js.native
  def updateMassProperties(): Unit = js.native
  def updateSolveMassProperties(): Unit = js.native
  def vectorToLocalFrame(out: js.Tuple2[Double, Double], worldVector: js.Tuple2[Double, Double]): Unit = js.native
  def vectorToWorldFrame(out: js.Tuple2[Double, Double], localVector: js.Tuple2[Double, Double]): Unit = js.native
  def wakeUp(): Unit = js.native
}

/* static members */
@JSImport("p2", "Body")
@js.native
object Body extends js.Object {
  var AWAKE: Double = js.native
  var DYNAMIC: Double = js.native
  var KINEMATIC: Double = js.native
  var SLEEPING: Double = js.native
  var SLEEPY: Double = js.native
  var STATIC: Double = js.native
}

