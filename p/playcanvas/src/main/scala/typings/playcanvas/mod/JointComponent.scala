package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JointComponent adds a physics joint constraint linking two rigid bodies.
  *
  * @augments Component
  * @ignore
  */
@JSImport("playcanvas", "JointComponent")
@js.native
open class JointComponent protected () extends Component {
  /**
    * Create a new JointComponent instance.
    *
    * @param {JointComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: JointComponentSystem, entity: Entity) = this()
  
  var _angularDampingX: Double = js.native
  
  var _angularDampingY: Double = js.native
  
  var _angularDampingZ: Double = js.native
  
  var _angularEquilibriumX: Double = js.native
  
  var _angularEquilibriumY: Double = js.native
  
  var _angularEquilibriumZ: Double = js.native
  
  var _angularLimitsX: Vec2 = js.native
  
  var _angularLimitsY: Vec2 = js.native
  
  var _angularLimitsZ: Vec2 = js.native
  
  var _angularMotionX: String = js.native
  
  var _angularMotionY: String = js.native
  
  var _angularMotionZ: String = js.native
  
  var _angularSpringX: Boolean = js.native
  
  var _angularSpringY: Boolean = js.native
  
  var _angularSpringZ: Boolean = js.native
  
  var _angularStiffnessX: Double = js.native
  
  var _angularStiffnessY: Double = js.native
  
  var _angularStiffnessZ: Double = js.native
  
  var _breakForce: Double = js.native
  
  var _constraint: Any = js.native
  
  def _convertTransform(pcTransform: Any, ammoTransform: Any): Unit = js.native
  
  def _createConstraint(): Unit = js.native
  
  def _destroyConstraint(): Unit = js.native
  
  var _enableCollision: Boolean = js.native
  
  var _entityA: Any = js.native
  
  var _entityB: Any = js.native
  
  var _linearDampingX: Double = js.native
  
  var _linearDampingY: Double = js.native
  
  var _linearDampingZ: Double = js.native
  
  var _linearEquilibriumX: Double = js.native
  
  var _linearEquilibriumY: Double = js.native
  
  var _linearEquilibriumZ: Double = js.native
  
  var _linearLimitsX: Vec2 = js.native
  
  var _linearLimitsY: Vec2 = js.native
  
  var _linearLimitsZ: Vec2 = js.native
  
  var _linearMotionX: String = js.native
  
  var _linearMotionY: String = js.native
  
  var _linearMotionZ: String = js.native
  
  var _linearSpringX: Boolean = js.native
  
  var _linearSpringY: Boolean = js.native
  
  var _linearSpringZ: Boolean = js.native
  
  var _linearStiffnessX: Double = js.native
  
  var _linearStiffnessY: Double = js.native
  
  var _linearStiffnessZ: Double = js.native
  
  def _onBeforeRemove(): Unit = js.native
  
  def _onSetEnabled(prop: Any, old: Any, value: Any): Unit = js.native
  
  def _updateAngularLimits(): Unit = js.native
  
  def _updateLinearLimits(): Unit = js.native
  
  def angularLimitsX: Vec2 = js.native
  def angularLimitsX_=(arg: Vec2): Unit = js.native
  
  def angularLimitsY: Vec2 = js.native
  def angularLimitsY_=(arg: Vec2): Unit = js.native
  
  def angularLimitsZ: Vec2 = js.native
  def angularLimitsZ_=(arg: Vec2): Unit = js.native
  
  def angularMotionX: String = js.native
  def angularMotionX_=(arg: String): Unit = js.native
  
  def angularMotionY: String = js.native
  def angularMotionY_=(arg: String): Unit = js.native
  
  def angularMotionZ: String = js.native
  def angularMotionZ_=(arg: String): Unit = js.native
  
  def breakForce: Double = js.native
  def breakForce_=(arg: Double): Unit = js.native
  
  def enableCollision: Boolean = js.native
  def enableCollision_=(arg: Boolean): Unit = js.native
  
  def entityA: Any = js.native
  def entityA_=(arg: Any): Unit = js.native
  
  def entityB: Any = js.native
  def entityB_=(arg: Any): Unit = js.native
  
  def initFromData(data: Any): Unit = js.native
  
  def linearLimitsX: Vec2 = js.native
  def linearLimitsX_=(arg: Vec2): Unit = js.native
  
  def linearLimitsY: Vec2 = js.native
  def linearLimitsY_=(arg: Vec2): Unit = js.native
  
  def linearLimitsZ: Vec2 = js.native
  def linearLimitsZ_=(arg: Vec2): Unit = js.native
  
  def linearMotionX: String = js.native
  def linearMotionX_=(arg: String): Unit = js.native
  
  def linearMotionY: String = js.native
  def linearMotionY_=(arg: String): Unit = js.native
  
  def linearMotionZ: String = js.native
  def linearMotionZ_=(arg: String): Unit = js.native
}
