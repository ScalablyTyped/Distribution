package typings.p2.mod

import typings.p2.anon.BodyA
import typings.p2.anon.BodyB
import typings.p2.anon.ContactEquations
import typings.p2.anon.Pairs
import typings.p2.anon.Relaxation
import typings.p2.anon.ShapeA
import typings.p2.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "World")
@js.native
//static integrateBody(body: Body, dy: number): void;
class World () extends EventEmitter {
  def this(options: WorldOptions) = this()
  
  var accumulator: Double = js.native
  
  def addBody(body: Body): Unit = js.native
  
  var addBodyEvent: typings.p2.anon.Body = js.native
  
  def addConstraint(c: Constraint): Unit = js.native
  
  def addContactMaterial(contactMaterial: ContactMaterial): Unit = js.native
  
  def addSpring(spring: Spring): Unit = js.native
  
  var addSpringEvent: typings.p2.anon.Spring = js.native
  
  var applyDamping: Boolean = js.native
  
  var applyGravity: Boolean = js.native
  
  var applySpringForces: Boolean = js.native
  
  var beginContactEvent: BodyB = js.native
  
  var bodies: js.Array[Body] = js.native
  
  var broadphase: Broadphase = js.native
  
  def clear(): Unit = js.native
  
  var constraints: js.Array[Constraint] = js.native
  
  var contactMaterials: js.Array[ContactMaterial] = js.native
  
  var defaultContactMaterial: ContactMaterial = js.native
  
  var defaultMaterial: Material = js.native
  
   //Body | boolean
  def disableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  
  var doProfiling: Boolean = js.native
  
  var emitImpactEvent: Boolean = js.native
  
  def enableBodyCollision(bodyA: Body, bodyB: Body): Unit = js.native
  
  var endContactEvent: ShapeA = js.native
  
  var frictionGravity: Double = js.native
  
  def getBodyByID(id: Double): Body = js.native
  
  def getContactMaterial(materialA: Material, materialB: Material): ContactMaterial = js.native
  
  var gravity: js.Tuple2[Double, Double] = js.native
  
  def hitTest(worldPoint: js.Tuple2[Double, Double], bodies: js.Array[Body], precision: Double): js.Array[Body] = js.native
  
  var impactEvent: BodyA = js.native
  
  var islandManager: IslandManager = js.native
  
  var islandSplit: Boolean = js.native
  
  var lastStepTime: Double = js.native
  
  var lastTimeStep: Double = js.native
  
  var narrowphase: Narrowphase = js.native
  
  var postBroadphaseEvent: Pairs = js.native
  
  var postStepEvent: Type = js.native
  
  var preSolveEvent: ContactEquations = js.native
  
  def raycast(result: RaycastResult, ray: Ray): Boolean = js.native
  
  def removeBody(body: Body): Unit = js.native
  
  var removeBodyEvent: typings.p2.anon.Body = js.native
  
   // ContactMaterial | boolean
  def removeConstraint(constraint: Constraint): Unit = js.native
  
  def removeContactMaterial(cm: ContactMaterial): Unit = js.native
  
  def removeSpring(spring: Spring): Unit = js.native
  
  def setGlobalEquationParameters(parameters: Relaxation): Unit = js.native
  
  def setGlobalRelaxation(relaxation: Double): Unit = js.native
  
  def setGlobalStiffness(stiffness: Double): Unit = js.native
  
  var sleepMode: Double = js.native
  
  var solveConstraints: Boolean = js.native
  
  var solver: Solver = js.native
  
  var springs: js.Array[Spring] = js.native
  
  def step(dt: Double): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: js.UndefOr[scala.Nothing], maxSubSteps: Double): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: Double): Unit = js.native
  def step(dt: Double, timeSinceLastCalled: Double, maxSubSteps: Double): Unit = js.native
  
  var stepping: Boolean = js.native
  
  var time: Double = js.native
  
  var useFrictionGravityOnZeroGravity: Boolean = js.native
  
  var useWorldGravityAsFrictionGravity: Boolean = js.native
}
/* static members */
@JSImport("p2", "World")
@js.native
object World extends js.Object {
  
  var BODY_SLEEPING: Double = js.native
  
  var ISLAND_SLEEPING: Double = js.native
  
  var NO_SLEEPING: Double = js.native
}
