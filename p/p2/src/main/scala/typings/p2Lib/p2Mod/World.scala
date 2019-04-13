package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "World")
@js.native
//static integrateBody(body: Body, dy: number): void;
class World () extends EventEmitter {
  def this(options: WorldOptions) = this()
  var accumulator: scala.Double = js.native
  var addBodyEvent: p2Lib.Anon_Body = js.native
  var addSpringEvent: p2Lib.Anon_Spring = js.native
  var applyDamping: scala.Boolean = js.native
  var applyGravity: scala.Boolean = js.native
  var applySpringForces: scala.Boolean = js.native
  var beginContactEvent: p2Lib.Anon_BodyABodyB = js.native
  var bodies: js.Array[Body] = js.native
  var broadphase: Broadphase = js.native
  var constraints: js.Array[Constraint] = js.native
  var contactMaterials: js.Array[ContactMaterial] = js.native
  var defaultContactMaterial: ContactMaterial = js.native
  var defaultMaterial: Material = js.native
  var doProfiling: scala.Boolean = js.native
  var emitImpactEvent: scala.Boolean = js.native
  var endContactEvent: p2Lib.Anon_BodyABodyBShapeA = js.native
  var frictionGravity: scala.Double = js.native
  var gravity: js.Tuple2[scala.Double, scala.Double] = js.native
  var impactEvent: p2Lib.Anon_BodyA = js.native
  var islandManager: IslandManager = js.native
  var islandSplit: scala.Boolean = js.native
  var lastStepTime: scala.Double = js.native
  var lastTimeStep: scala.Double = js.native
  var narrowphase: Narrowphase = js.native
  var postBroadphaseEvent: p2Lib.Anon_Pairs = js.native
  var postStepEvent: p2Lib.Anon_Type = js.native
  var preSolveEvent: p2Lib.Anon_ContactEquations = js.native
  var removeBodyEvent: p2Lib.Anon_Body = js.native
  var sleepMode: scala.Double = js.native
  var solveConstraints: scala.Boolean = js.native
  var solver: Solver = js.native
  var springs: js.Array[Spring] = js.native
  var stepping: scala.Boolean = js.native
  var time: scala.Double = js.native
  var useFrictionGravityOnZeroGravity: scala.Boolean = js.native
  var useWorldGravityAsFrictionGravity: scala.Boolean = js.native
  def addBody(body: Body): scala.Unit = js.native
  def addConstraint(c: Constraint): scala.Unit = js.native
  def addContactMaterial(contactMaterial: ContactMaterial): scala.Unit = js.native
  def addSpring(spring: Spring): scala.Unit = js.native
  def clear(): scala.Unit = js.native
   //Body | boolean
  def disableBodyCollision(bodyA: Body, bodyB: Body): scala.Unit = js.native
  def enableBodyCollision(bodyA: Body, bodyB: Body): scala.Unit = js.native
  def getBodyByID(id: scala.Double): Body = js.native
  def getContactMaterial(materialA: Material, materialB: Material): ContactMaterial = js.native
  def hitTest(worldPoint: js.Tuple2[scala.Double, scala.Double], bodies: js.Array[Body], precision: scala.Double): js.Array[Body] = js.native
  def raycast(result: RaycastResult, ray: Ray): scala.Boolean = js.native
  def removeBody(body: Body): scala.Unit = js.native
   // ContactMaterial | boolean
  def removeConstraint(constraint: Constraint): scala.Unit = js.native
  def removeContactMaterial(cm: ContactMaterial): scala.Unit = js.native
  def removeSpring(spring: Spring): scala.Unit = js.native
  def setGlobalEquationParameters(parameters: p2Lib.Anon_Relaxation): scala.Unit = js.native
  def setGlobalRelaxation(relaxation: scala.Double): scala.Unit = js.native
  def setGlobalStiffness(stiffness: scala.Double): scala.Unit = js.native
  def step(dt: scala.Double): scala.Unit = js.native
  def step(dt: scala.Double, timeSinceLastCalled: scala.Double): scala.Unit = js.native
  def step(dt: scala.Double, timeSinceLastCalled: scala.Double, maxSubSteps: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("p2", "World")
@js.native
object World extends js.Object {
  var BODY_SLEEPING: scala.Double = js.native
  var ISLAND_SLEEPING: scala.Double = js.native
  var NO_SLEEPING: scala.Double = js.native
}

