package typings.p2.mod

import typings.p2.anon.OptimalDecomp
import typings.p2.anon.Type
import typings.p2.anon.`0`
import typings.p2.anon.`1`
import typings.p2.p2Ints.`2`
import typings.p2.p2Ints.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Body")
@js.native
open class Body () extends EventEmitter {
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
  
  var sleepEvent: `0` = js.native
  
  var sleepSpeedLimit: Double = js.native
  
  var sleepState: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Body.AWAKE */ Any = js.native
  
  def sleepTick(time: Double, dontSleep: Boolean, dt: Double): Unit = js.native
  
  var sleepTimeLimit: Double = js.native
  
  var sleepyEvent: Type = js.native
  
  def toLocalFrame(out: js.Tuple2[Double, Double], worldPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  def toWorldFrame(out: js.Tuple2[Double, Double], localPoint: js.Tuple2[Double, Double]): Unit = js.native
  
  var `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Body.DYNAMIC */ Any = js.native
  
  def updateAABB(): Unit = js.native
  
  def updateBoundingRadius(): Unit = js.native
  
  def updateMassProperties(): Unit = js.native
  
  def updateSolveMassProperties(): Unit = js.native
  
  def vectorToLocalFrame(out: js.Tuple2[Double, Double], worldVector: js.Tuple2[Double, Double]): Unit = js.native
  
  def vectorToWorldFrame(out: js.Tuple2[Double, Double], localVector: js.Tuple2[Double, Double]): Unit = js.native
  
  var velocity: js.Tuple2[Double, Double] = js.native
  
  var vlambda: js.Tuple2[Double, Double] = js.native
  
  def wakeUp(): Unit = js.native
  
  var wakeUpEvent: `1` = js.native
  
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
  def AWAKE: typings.p2.p2Ints.`0` = js.native
  inline def AWAKE_=(x: typings.p2.p2Ints.`0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAKE")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.DYNAMIC")
  @js.native
  def DYNAMIC: typings.p2.p2Ints.`1` = js.native
  inline def DYNAMIC_=(x: typings.p2.p2Ints.`1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DYNAMIC")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.KINEMATIC")
  @js.native
  def KINEMATIC: `4` = js.native
  inline def KINEMATIC_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KINEMATIC")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.SLEEPING")
  @js.native
  def SLEEPING: `2` = js.native
  inline def SLEEPING_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPING")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.SLEEPY")
  @js.native
  def SLEEPY: typings.p2.p2Ints.`1` = js.native
  inline def SLEEPY_=(x: typings.p2.p2Ints.`1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLEEPY")(x.asInstanceOf[js.Any])
  
  @JSImport("p2", "Body.STATIC")
  @js.native
  def STATIC: `2` = js.native
  inline def STATIC_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATIC")(x.asInstanceOf[js.Any])
}
