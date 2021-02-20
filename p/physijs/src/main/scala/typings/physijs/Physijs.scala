package typings.physijs

import typings.physijs.anon.Friction
import typings.physijs.anon.Target
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.mod.Euler
import typings.three.mod.Matrix4
import typings.three.mod.Object3D
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Physijs {
  
  type BoxMesh = Mesh
  
  type CapsuleMesh = Mesh
  
  type ConcaveMesh = Mesh
  
  type ConeMesh = Mesh
  
  @js.native
  trait ConeTwistConstraint extends Constraint {
    
    def disableMotor(): Unit = js.native
    
    def enableMotor(): Unit = js.native
    
    def setLimit(x: Double, y: Double, z: Double): Unit = js.native
    
    def setMaxMotorImpulse(max_impulse: Double): Unit = js.native
    
    def setMotorTarget(target: Euler): Unit = js.native
    def setMotorTarget(target: Matrix4): Unit = js.native
    def setMotorTarget(target: Vector3): Unit = js.native
  }
  
  @js.native
  trait ConeTwistConstraintDefinition extends StObject {
    
    var axisa: Vector3 = js.native
    
    var axisb: Vector3 = js.native
    
    var id: Double = js.native
    
    var objecta: Object3D = js.native
    
    var objectb: Object3D = js.native
    
    var positiona: Vector3 = js.native
    
    var positionb: Vector3 = js.native
    
    var `type`: String = js.native
  }
  object ConeTwistConstraintDefinition {
    
    @scala.inline
    def apply(
      axisa: Vector3,
      axisb: Vector3,
      id: Double,
      objecta: Object3D,
      objectb: Object3D,
      positiona: Vector3,
      positionb: Vector3,
      `type`: String
    ): ConeTwistConstraintDefinition = {
      val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConeTwistConstraintDefinition]
    }
    
    @scala.inline
    implicit class ConeTwistConstraintDefinitionMutableBuilder[Self <: ConeTwistConstraintDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxisa(value: Vector3): Self = StObject.set(x, "axisa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisb(value: Vector3): Self = StObject.set(x, "axisb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjecta(value: Object3D): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectb(value: Object3D): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Constraint extends StObject {
    
    def getDefinition(): js.Any = js.native
  }
  object Constraint {
    
    @scala.inline
    def apply(getDefinition: () => js.Any): Constraint = {
      val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
      __obj.asInstanceOf[Constraint]
    }
    
    @scala.inline
    implicit class ConstraintMutableBuilder[Self <: Constraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefinition(value: () => js.Any): Self = StObject.set(x, "getDefinition", js.Any.fromFunction0(value))
    }
  }
  
  type ConvexMesh = Mesh
  
  type CylinderMesh = Mesh
  
  @js.native
  trait DOFConstraint extends Constraint {
    
    def configureAngularMotor(which: Double, low_angle: Double, high_angle: Double, velocity: Double, max_force: Double): Unit = js.native
    
    def disableAngularMotor(which: Double): Unit = js.native
    
    def enableAngularMotor(which: Double): Unit = js.native
    
    def setAngularLowerLimit(limit: Vector3): Unit = js.native
    
    def setAngularUpperLimit(limit: Vector3): Unit = js.native
    
    def setLinearLowerLimit(limit: Vector3): Unit = js.native
    
    def setLinearUpperLimit(limit: Vector3): Unit = js.native
  }
  object DOFConstraint {
    
    @scala.inline
    def apply(
      configureAngularMotor: (Double, Double, Double, Double, Double) => Unit,
      disableAngularMotor: Double => Unit,
      enableAngularMotor: Double => Unit,
      getDefinition: () => js.Any,
      setAngularLowerLimit: Vector3 => Unit,
      setAngularUpperLimit: Vector3 => Unit,
      setLinearLowerLimit: Vector3 => Unit,
      setLinearUpperLimit: Vector3 => Unit
    ): DOFConstraint = {
      val __obj = js.Dynamic.literal(configureAngularMotor = js.Any.fromFunction5(configureAngularMotor), disableAngularMotor = js.Any.fromFunction1(disableAngularMotor), enableAngularMotor = js.Any.fromFunction1(enableAngularMotor), getDefinition = js.Any.fromFunction0(getDefinition), setAngularLowerLimit = js.Any.fromFunction1(setAngularLowerLimit), setAngularUpperLimit = js.Any.fromFunction1(setAngularUpperLimit), setLinearLowerLimit = js.Any.fromFunction1(setLinearLowerLimit), setLinearUpperLimit = js.Any.fromFunction1(setLinearUpperLimit))
      __obj.asInstanceOf[DOFConstraint]
    }
    
    @scala.inline
    implicit class DOFConstraintMutableBuilder[Self <: DOFConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigureAngularMotor(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "configureAngularMotor", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDisableAngularMotor(value: Double => Unit): Self = StObject.set(x, "disableAngularMotor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableAngularMotor(value: Double => Unit): Self = StObject.set(x, "enableAngularMotor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAngularLowerLimit(value: Vector3 => Unit): Self = StObject.set(x, "setAngularLowerLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAngularUpperLimit(value: Vector3 => Unit): Self = StObject.set(x, "setAngularUpperLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLinearLowerLimit(value: Vector3 => Unit): Self = StObject.set(x, "setLinearLowerLimit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLinearUpperLimit(value: Vector3 => Unit): Self = StObject.set(x, "setLinearUpperLimit", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DOFConstraintDefinition extends StObject {
    
    var axisa: Vector3 = js.native
    
    var axisb: Vector3 = js.native
    
    var id: Double = js.native
    
    var objecta: Object3D = js.native
    
    var objectb: Object3D = js.native
    
    var positiona: Vector3 = js.native
    
    var positionb: Vector3 = js.native
    
    var `type`: String = js.native
  }
  object DOFConstraintDefinition {
    
    @scala.inline
    def apply(
      axisa: Vector3,
      axisb: Vector3,
      id: Double,
      objecta: Object3D,
      objectb: Object3D,
      positiona: Vector3,
      positionb: Vector3,
      `type`: String
    ): DOFConstraintDefinition = {
      val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOFConstraintDefinition]
    }
    
    @scala.inline
    implicit class DOFConstraintDefinitionMutableBuilder[Self <: DOFConstraintDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxisa(value: Vector3): Self = StObject.set(x, "axisa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisb(value: Vector3): Self = StObject.set(x, "axisb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjecta(value: Object3D): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectb(value: Object3D): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type HeightfieldMesh = Mesh
  
  @js.native
  trait HingeConstraint extends Constraint {
    
    def disableMotor(): Unit = js.native
    
    def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
    
    def setLimits(low: Double, high: Double, bias_factor: Double, relaxation_factor: Double): Unit = js.native
  }
  object HingeConstraint {
    
    @scala.inline
    def apply(
      disableMotor: () => Unit,
      enableAngularMotor: (Double, Double) => Unit,
      getDefinition: () => js.Any,
      setLimits: (Double, Double, Double, Double) => Unit
    ): HingeConstraint = {
      val __obj = js.Dynamic.literal(disableMotor = js.Any.fromFunction0(disableMotor), enableAngularMotor = js.Any.fromFunction2(enableAngularMotor), getDefinition = js.Any.fromFunction0(getDefinition), setLimits = js.Any.fromFunction4(setLimits))
      __obj.asInstanceOf[HingeConstraint]
    }
    
    @scala.inline
    implicit class HingeConstraintMutableBuilder[Self <: HingeConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableMotor(value: () => Unit): Self = StObject.set(x, "disableMotor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableAngularMotor(value: (Double, Double) => Unit): Self = StObject.set(x, "enableAngularMotor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetLimits(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setLimits", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait HingeConstraintDefinition extends StObject {
    
    var axis: Vector3 = js.native
    
    var id: Double = js.native
    
    var objecta: Object3D = js.native
    
    var objectb: Object3D = js.native
    
    var positiona: Vector3 = js.native
    
    var positionb: Vector3 = js.native
    
    var `type`: String = js.native
  }
  object HingeConstraintDefinition {
    
    @scala.inline
    def apply(
      axis: Vector3,
      id: Double,
      objecta: Object3D,
      objectb: Object3D,
      positiona: Vector3,
      positionb: Vector3,
      `type`: String
    ): HingeConstraintDefinition = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HingeConstraintDefinition]
    }
    
    @scala.inline
    implicit class HingeConstraintDefinitionMutableBuilder[Self <: HingeConstraintDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Vector3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjecta(value: Object3D): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectb(value: Object3D): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Material
    extends typings.three.mod.Material {
    
    var _physijs: Friction = js.native
  }
  
  @js.native
  trait Mesh
    extends typings.three.mod.Mesh[
          Geometry | BufferGeometry, 
          typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
        ] {
    
    def applyCentralForce(force: Vector3): Unit = js.native
    
    def applyCentralImpulse(force: Vector3): Unit = js.native
    
    def applyForce(force: Vector3, offset: Vector3): Unit = js.native
    
    def applyImpulse(force: Vector3, offset: Vector3): Unit = js.native
    
    def dispatchEvent(event_name: String): Unit = js.native
    // (extends from Object3D)
    def dispatchEvent(event: Target): Unit = js.native
    
    def getAngularVelocity(): Vector3 = js.native
    
    def getLinearVelocity(): Vector3 = js.native
    
    def setAngularFactor(factor: Vector3): Unit = js.native
    
    def setAngularVelocity(velocity: Vector3): Unit = js.native
    
    def setCcdMotionThreshold(threshold: Double): Unit = js.native
    
    def setCcdSweptSphereRadius(radius: Double): Unit = js.native
    
    def setDamping(linear: Double, angular: Double): Unit = js.native
    
    def setLinearFactor(factor: Vector3): Unit = js.native
    
    def setLinearVelocity(velocity: Vector3): Unit = js.native
  }
  
  type PlaneMesh = Mesh
  
  @js.native
  trait PointConstraint extends Constraint
  object PointConstraint {
    
    @scala.inline
    def apply(getDefinition: () => js.Any): PointConstraint = {
      val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
      __obj.asInstanceOf[PointConstraint]
    }
  }
  
  @js.native
  trait PointConstraintDefinition extends StObject {
    
    var id: Double = js.native
    
    var objecta: Object3D = js.native
    
    var objectb: Object3D = js.native
    
    var positiona: Vector3 = js.native
    
    var positionb: Vector3 = js.native
    
    var `type`: String = js.native
  }
  object PointConstraintDefinition {
    
    @scala.inline
    def apply(
      id: Double,
      objecta: Object3D,
      objectb: Object3D,
      positiona: Vector3,
      positionb: Vector3,
      `type`: String
    ): PointConstraintDefinition = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointConstraintDefinition]
    }
    
    @scala.inline
    implicit class PointConstraintDefinitionMutableBuilder[Self <: PointConstraintDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjecta(value: Object3D): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectb(value: Object3D): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scene
    extends typings.three.mod.Scene {
    
    def add(`object`: Object3D): this.type = js.native
    
    def addConstraint(constraint: Constraint): Unit = js.native
    def addConstraint(constraint: Constraint, show_marker: Boolean): Unit = js.native
    
    def dispatchEvent(event_name: String): Unit = js.native
    // (extends from Object3D)
    def dispatchEvent(event: Target): Unit = js.native
    
    def execute(cmd: String, params: js.Any): Unit = js.native
    
    def onSimulationResume(): Unit = js.native
    
    def remove(`object`: Object3D): this.type = js.native
    
    def removeConstraint(constraint: Constraint): Unit = js.native
    
    def setFixedTimeStep(fixedTimeStep: Double): Unit = js.native
    
    def setGravity(gravity: Vector3): Unit = js.native
    
    def simulate(): Boolean = js.native
    def simulate(timeStep: js.UndefOr[scala.Nothing], maxSubSteps: Double): Boolean = js.native
    def simulate(timeStep: Double): Boolean = js.native
    def simulate(timeStep: Double, maxSubSteps: Double): Boolean = js.native
  }
  
  @js.native
  trait SceneParameters extends StObject {
    
    var ammo: js.UndefOr[String] = js.native
    
    var fixedTimeStep: js.UndefOr[Double] = js.native
    
    var rateLimit: js.UndefOr[Boolean] = js.native
  }
  object SceneParameters {
    
    @scala.inline
    def apply(): SceneParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SceneParameters]
    }
    
    @scala.inline
    implicit class SceneParametersMutableBuilder[Self <: SceneParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmmo(value: String): Self = StObject.set(x, "ammo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmmoUndefined: Self = StObject.set(x, "ammo", js.undefined)
      
      @scala.inline
      def setFixedTimeStep(value: Double): Self = StObject.set(x, "fixedTimeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedTimeStepUndefined: Self = StObject.set(x, "fixedTimeStep", js.undefined)
      
      @scala.inline
      def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
    }
  }
  
  @js.native
  trait SliderConstraint extends Constraint {
    
    def disableAngularMotor(): Unit = js.native
    
    def disableLinearMotor(): Unit = js.native
    
    def enableAngularMotor(velocity: Double, acceleration: Double): Unit = js.native
    
    def enableLinearMotor(velocity: Double, acceleration: Double): Unit = js.native
    
    def setLimits(lin_lower: Double, lin_upper: Double, ang_lower: Double, ang_upper: Double): Unit = js.native
    
    def setRestitution(linear: Double, angular: Double): Unit = js.native
  }
  object SliderConstraint {
    
    @scala.inline
    def apply(
      disableAngularMotor: () => Unit,
      disableLinearMotor: () => Unit,
      enableAngularMotor: (Double, Double) => Unit,
      enableLinearMotor: (Double, Double) => Unit,
      getDefinition: () => js.Any,
      setLimits: (Double, Double, Double, Double) => Unit,
      setRestitution: (Double, Double) => Unit
    ): SliderConstraint = {
      val __obj = js.Dynamic.literal(disableAngularMotor = js.Any.fromFunction0(disableAngularMotor), disableLinearMotor = js.Any.fromFunction0(disableLinearMotor), enableAngularMotor = js.Any.fromFunction2(enableAngularMotor), enableLinearMotor = js.Any.fromFunction2(enableLinearMotor), getDefinition = js.Any.fromFunction0(getDefinition), setLimits = js.Any.fromFunction4(setLimits), setRestitution = js.Any.fromFunction2(setRestitution))
      __obj.asInstanceOf[SliderConstraint]
    }
    
    @scala.inline
    implicit class SliderConstraintMutableBuilder[Self <: SliderConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableAngularMotor(value: () => Unit): Self = StObject.set(x, "disableAngularMotor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableLinearMotor(value: () => Unit): Self = StObject.set(x, "disableLinearMotor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableAngularMotor(value: (Double, Double) => Unit): Self = StObject.set(x, "enableAngularMotor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnableLinearMotor(value: (Double, Double) => Unit): Self = StObject.set(x, "enableLinearMotor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetLimits(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setLimits", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSetRestitution(value: (Double, Double) => Unit): Self = StObject.set(x, "setRestitution", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SliderConstraintDefinition extends StObject {
    
    var axis: Vector3 = js.native
    
    var id: Double = js.native
    
    var objecta: Object3D = js.native
    
    var objectb: Object3D = js.native
    
    var positiona: Vector3 = js.native
    
    var positionb: Vector3 = js.native
    
    var `type`: String = js.native
  }
  object SliderConstraintDefinition {
    
    @scala.inline
    def apply(
      axis: Vector3,
      id: Double,
      objecta: Object3D,
      objectb: Object3D,
      positiona: Vector3,
      positionb: Vector3,
      `type`: String
    ): SliderConstraintDefinition = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderConstraintDefinition]
    }
    
    @scala.inline
    implicit class SliderConstraintDefinitionMutableBuilder[Self <: SliderConstraintDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Vector3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjecta(value: Object3D): Self = StObject.set(x, "objecta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectb(value: Object3D): Self = StObject.set(x, "objectb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiona(value: Vector3): Self = StObject.set(x, "positiona", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionb(value: Vector3): Self = StObject.set(x, "positionb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SphereMesh = Mesh
  
  @js.native
  trait Vehicle extends StObject {
    
    def addWheel(
      wheel_geometry: typings.three.mod.Geometry,
      wheel_material: typings.three.mod.Material,
      connection_point: Vector3,
      wheel_direction: Vector3,
      wheel_axle: Vector3,
      suspension_rest_length: Double,
      wheel_radius: Double,
      is_front_wheel: Boolean
    ): Unit = js.native
    def addWheel(
      wheel_geometry: typings.three.mod.Geometry,
      wheel_material: typings.three.mod.Material,
      connection_point: Vector3,
      wheel_direction: Vector3,
      wheel_axle: Vector3,
      suspension_rest_length: Double,
      wheel_radius: Double,
      is_front_wheel: Boolean,
      tuning: VehicleTuning
    ): Unit = js.native
    
    def applyEngineForce(amount: Double): Unit = js.native
    def applyEngineForce(
      amount: Double,
      wheel: typings.three.mod.Mesh[
          Geometry | BufferGeometry, 
          typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
        ]
    ): Unit = js.native
    
    var mesh: typings.three.mod.Mesh[
        Geometry | BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ] = js.native
    
    def setBrake(amount: Double): Unit = js.native
    def setBrake(
      amount: Double,
      wheel: typings.three.mod.Mesh[
          Geometry | BufferGeometry, 
          typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
        ]
    ): Unit = js.native
    
    def setSteering(amount: Double): Unit = js.native
    def setSteering(
      amount: Double,
      wheel: typings.three.mod.Mesh[
          Geometry | BufferGeometry, 
          typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
        ]
    ): Unit = js.native
    
    var wheels: js.Array[
        typings.three.mod.Mesh[
          Geometry | BufferGeometry, 
          typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
        ]
      ] = js.native
  }
  
  @js.native
  trait VehicleTuning extends StObject {
    
    var friction_slip: Double = js.native
    
    var max_suspension_force: Double = js.native
    
    var max_suspension_travel: Double = js.native
    
    var suspension_compression: Double = js.native
    
    var suspension_damping: Double = js.native
    
    var suspension_stiffness: Double = js.native
  }
  object VehicleTuning {
    
    @scala.inline
    def apply(
      friction_slip: Double,
      max_suspension_force: Double,
      max_suspension_travel: Double,
      suspension_compression: Double,
      suspension_damping: Double,
      suspension_stiffness: Double
    ): VehicleTuning = {
      val __obj = js.Dynamic.literal(friction_slip = friction_slip.asInstanceOf[js.Any], max_suspension_force = max_suspension_force.asInstanceOf[js.Any], max_suspension_travel = max_suspension_travel.asInstanceOf[js.Any], suspension_compression = suspension_compression.asInstanceOf[js.Any], suspension_damping = suspension_damping.asInstanceOf[js.Any], suspension_stiffness = suspension_stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[VehicleTuning]
    }
    
    @scala.inline
    implicit class VehicleTuningMutableBuilder[Self <: VehicleTuning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriction_slip(value: Double): Self = StObject.set(x, "friction_slip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_suspension_force(value: Double): Self = StObject.set(x, "max_suspension_force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_suspension_travel(value: Double): Self = StObject.set(x, "max_suspension_travel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspension_compression(value: Double): Self = StObject.set(x, "suspension_compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspension_damping(value: Double): Self = StObject.set(x, "suspension_damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspension_stiffness(value: Double): Self = StObject.set(x, "suspension_stiffness", value.asInstanceOf[js.Any])
    }
  }
}
