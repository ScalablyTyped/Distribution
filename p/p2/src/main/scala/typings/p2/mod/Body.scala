package typings.p2.mod

import typings.p2.anon.OptimalDecomp
import typings.p2.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Body")
@js.native
class Body () extends EventEmitter {
  def this(options: BodyOptions) = this()
  
  var aabb: AABB = js.native
  
  var aabbNeedsUpdate: Boolean = js.native
  
  def addShape(shape: Shape): Unit = js.native
  def addShape(shape: Shape, offset: js.Tuple2[Double, Double]): Unit = js.native
  def addShape(shape: Shape, offset: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def addShape(shape: Shape, offset: Unit, angle: Double): Unit = js.native
  
  def adjustCenterOfMass(): Unit = js.native
  
  var allowSleep: Boolean = js.native
  
  var angle: Double = js.native
  
  var angularDamping: Double = js.native
  
  var angularForce: Double = js.native
  
  var angularVelocity: Double = js.native
  
  def applyDamping(dt: Double): Unit = js.native
  
  def applyForce(force: js.Tuple2[Double, Double]): Unit = js.native
  def applyForce(force: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): Unit = js.native
  
  def applyForceLocal(localForce: js.Tuple2[Double, Double]): Unit = js.native
  def applyForceLocal(localForce: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  def applyImpulse(impulseVector: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulse(impulseVector: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): Unit = js.native
  
  def applyImpulseLocal(localImpulse: js.Tuple2[Double, Double]): Unit = js.native
  def applyImpulseLocal(localImpulse: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  var boundingRadius: Double = js.native
  
  var ccdIterations: Double = js.native
  
  var ccdSpeedThreshold: Double = js.native
  
  var collisionResponse: Boolean = js.native
  
  var damping: Double = js.native
  
  var fixedRotation: Boolean = js.native
  
  var fixedX: Boolean = js.native
  
  var fixedY: Boolean = js.native
  
  var force: js.Tuple2[Double, Double] = js.native
  
  def fromPolygon(path: js.Array[js.Tuple2[Double, Double]]): Boolean = js.native
  def fromPolygon(path: js.Array[js.Tuple2[Double, Double]], options: OptimalDecomp): Boolean = js.native
  
  def getAABB(): AABB = js.native
  
  def getArea(): Double = js.native
  
  def getVelocityAtPoint(result: js.Tuple2[Double, Double], relativePoint: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  
  var gravityScale: Double = js.native
  
  var id: Double = js.native
  
  var idleTime: Double = js.native
  
  var inertia: Double = js.native
  
  def integrate(dy: Double): Unit = js.native
  
  var interpolatedAngle: Double = js.native
  
  var interpolatedPosition: js.Tuple2[Double, Double] = js.native
  
  var invInertia: Double = js.native
  
  var invInertiaSolve: Double = js.native
  
  var invMass: Double = js.native
  
  var invMassSolve: Double = js.native
  
  var mass: Double = js.native
  
  def overlaps(body: Body): Boolean = js.native
  
  var position: js.Tuple2[Double, Double] = js.native
  
  var previousAngle: Double = js.native
  
  var previousPosition: js.Tuple2[Double, Double] = js.native
  
  def removeShape(shape: Shape): Boolean = js.native
  
  def setDensity(density: Double): Unit = js.native
  
  def setZeroForce(): Unit = js.native
  
  var shapes: js.Array[Shape] = js.native
  
  def sleep(): Unit = js.native
  
  var sleepEvent: Type = js.native
  
  var sleepSpeedLimit: Double = js.native
  
  var sleepState: Double = js.native
  
  def sleepTick(time: Double, dontSleep: Boolean, dt: Double): Unit = js.native
  
  var sleepTimeLimit: Double = js.native
  
  var sleepyEvent: Type = js.native
  
  def toLocalFrame(out: js.Tuple2[Double, Double], worldPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  def toWorldFrame(out: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  var `type`: Double = js.native
  
  def updateAABB(): Unit = js.native
  
  def updateBoundingRadius(): Unit = js.native
  
  def updateMassProperties(): Unit = js.native
  
  def updateSolveMassProperties(): Unit = js.native
  
  def vectorToLocalFrame(out: js.Tuple2[Double, Double], worldVector: js.Tuple2[Double, Double]): Unit = js.native
  
  def vectorToWorldFrame(out: js.Tuple2[Double, Double], localVector: js.Tuple2[Double, Double]): Unit = js.native
  
  var velocity: js.Tuple2[Double, Double] = js.native
  
  var vlambda: js.Tuple2[Double, Double] = js.native
  
  def wakeUp(): Unit = js.native
  
  var wakeUpEvent: Type = js.native
  
  var wlambda: js.Tuple2[Double, Double] = js.native
  
  var world: World = js.native
}
/* static members */
object Body {
  
  @JSImport("p2", "Body")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p2", "Body.AWAKE")
  @js.native
  def AWAKE: Double = js.native
  @scala.inline
  def AWAKE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAKE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.DYNAMIC")
  @js.native
  def DYNAMIC: Double = js.native
  @scala.inline
  def DYNAMIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.KINEMATIC")
  @js.native
  def KINEMATIC: Double = js.native
  @scala.inline
  def KINEMATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KINEMATIC")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.SLEEPING")
  @js.native
  def SLEEPING: Double = js.native
  @scala.inline
  def SLEEPING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.SLEEPY")
  @js.native
  def SLEEPY: Double = js.native
  @scala.inline
  def SLEEPY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPY")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.STATIC")
  @js.native
  def STATIC: Double = js.native
  @scala.inline
  def STATIC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC")(x.asInstanceOf[js.Any])
}
