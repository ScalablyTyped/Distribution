package typings.p2.mod

import typings.p2.AnonBody
import typings.p2.AnonBodyA
import typings.p2.AnonBodyB
import typings.p2.AnonContactEquations
import typings.p2.AnonPairs
import typings.p2.AnonRelaxation
import typings.p2.AnonShapeA
import typings.p2.AnonSpring
import typings.p2.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "World")
@js.native
//static integrateBody(body: Body, dy: number): void;
class World () extends EventEmitter {
  def this(options: WorldOptions) = this()
  var accumulator: Double = js.native
  var addBodyEvent: AnonBody = js.native
  var addSpringEvent: AnonSpring = js.native
  var applyDamping: Boolean = js.native
  var applyGravity: Boolean = js.native
  var applySpringForces: Boolean = js.native
  var beginContactEvent: AnonBodyB = js.native
  var bodies: js.Array[Body] = js.native
  var broadphase: Broadphase = js.native
  var constraints: js.Array[Constraint] = js.native
  var contactMaterials: js.Array[ContactMaterial] = js.native
  var defaultContactMaterial: ContactMaterial = js.native
  var defaultMaterial: Material = js.native
  var doProfiling: Boolean = js.native
  var emitImpactEvent: Boolean = js.native
  var endContactEvent: AnonShapeA = js.native
  var frictionGravity: Double = js.native
  var gravity: js.Tuple2[Double, Double] = js.native
  var impactEvent: AnonBodyA = js.native
  var islandManager: IslandManager = js.native
  var islandSplit: Boolean = js.native
  var lastStepTime: Double = js.native
  var lastTimeStep: Double = js.native
  var narrowphase: Narrowphase = js.native
  var postBroadphaseEvent: AnonPairs = js.native
  var postStepEvent: AnonType = js.native
  var preSolveEvent: AnonContactEquations = js.native
  var removeBodyEvent: AnonBody = js.native
  var sleepMode: Double = js.native
  var solveConstraints: Boolean = js.native
  var solver: Solver = js.native
  var springs: js.Array[Spring] = js.native
  var stepping: Boolean = js.native
  var time: Double = js.native
  var useFrictionGravityOnZeroGravity: Boolean = js.native
  var useWorldGravityAsFrictionGravity: Boolean = js.native
  def addBody(body: Body): Unit = js.native
  def addConstraint(c: Constraint): Unit = js.native
  def addContactMaterial(contactMaterial: ContactMaterial): Unit = js.native
  def addSpring(spring: Spring): Unit = js.native
  def clear(): Unit = js.native
   //Body | boolean
  def disableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  def enableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  def getBodyByID(id: Double): Body = js.native
  def getContactMaterial(materialA: Material, materialB: Material): ContactMaterial = js.native
  def hitTest(worldPoint: js.Tuple2[Double, Double], bodies: js.Array[Body], precision: Double): js.Array[Body] = js.native
  def raycast(result: RaycastResult, ray: Ray): Boolean = js.native
  def removeBody(body: Body): Unit = js.native
   // ContactMaterial | boolean
  def removeConstraint(constraint: Constraint): Unit = js.native
  def removeContactMaterial(cm: ContactMaterial): Unit = js.native
  def removeSpring(spring: Spring): Unit = js.native
  def setGlobalEquationParameters(parameters: AnonRelaxation): Unit = js.native
  def setGlobalRelaxation(relaxation: Double): Unit = js.native
  def setGlobalStiffness(stiffness: Double): Unit = js.native
  def step(dt: Double): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: Double): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: Double, maxSubSteps: Double): Unit = js.native
}

/* static members */
@JSImport("p2", "World")
@js.native
object World extends js.Object {
  var BODY_SLEEPING: Double = js.native
  var ISLAND_SLEEPING: Double = js.native
  var NO_SLEEPING: Double = js.native
}

