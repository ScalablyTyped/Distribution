package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterBodyConfig extends StObject {
  
  /**
    * A number specifying the angle of the body, in radians.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * A number, or array of numbers, to chamfer the vertices of the body, or a full Chamfer configuration object.
    */
  var chamfer: js.UndefOr[Double | js.Array[Double] | MatterChamferConfig] = js.undefined
  
  /**
    * The radius of this body if a circle.
    */
  var circleRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    */
  var collisionFilter: js.UndefOr[MatterCollisionFilter] = js.undefined
  
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area. If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object. This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    */
  var force: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`. A value of `0` means that the body may slide indefinitely. A value of `1` means the body may come to a stop almost instantly after a force is applied.
    */
  var friction: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the air friction of the body (air resistance). A value of `0` means the body will never slow as it moves through space. The higher the value, the faster a body slows when moving through space.
    */
  var frictionAir: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model). A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used. The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary. This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    */
  var frictionStatic: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Vector` that scales the influence of World gravity when applied to this body.
    */
  var gravityScale: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * A boolean that toggles if this body should ignore world gravity or not.
    */
  var ignoreGravity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean that toggles if this body should ignore pointer / mouse constraints or not.
    */
  var ignorePointer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`). If you modify this value, you must also modify the `body.mass` property.
    */
  var inverseMass: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    */
  var isSensor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An arbitrary string-based name to help identify this body.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead. If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    */
  var mass: js.UndefOr[Double] = js.undefined
  
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A callback that is invoked when this Body starts colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A callback that is invoked when this Body stops colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    */
  var onCollideWith: js.UndefOr[js.Any] = js.undefined
  
  /**
    * An array of bodies that make up this body. The first body in the array must always be a self reference to the current body instance. All bodies in the `parts` array together form a single rigid compound body.
    */
  var parts: js.UndefOr[js.Array[BodyType]] = js.undefined
  
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.undefined
  
  /**
    * A `Vector` that specifies the current world-space position of the body.
    */
  var position: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * The Debug Render configuration object for this body.
    */
  var render: js.UndefOr[MatterBodyRenderConfig] = js.undefined
  
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    */
  var restitution: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Vector` that specifies the initial scale of the body.
    */
  var scale: js.UndefOr[Vector2Like] = js.undefined
  
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    */
  var sleepThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies. Avoid changing this value unless you understand the purpose of `slop` in physics engines. The default should generally suffice, although very large bodies may require larger values for stable stacking.
    */
  var slop: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    */
  var torque: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body. These should be provided about the origin `(0, 0)`.
    */
  var vertices: js.UndefOr[js.Array[Vector2Like]] = js.undefined
}
object MatterBodyConfig {
  
  @scala.inline
  def apply(): MatterBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyConfig]
  }
  
  @scala.inline
  implicit class MatterBodyConfigMutableBuilder[Self <: MatterBodyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setChamfer(value: Double | js.Array[Double] | MatterChamferConfig): Self = StObject.set(x, "chamfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChamferUndefined: Self = StObject.set(x, "chamfer", js.undefined)
    
    @scala.inline
    def setChamferVarargs(value: Double*): Self = StObject.set(x, "chamfer", js.Array(value :_*))
    
    @scala.inline
    def setCircleRadius(value: Double): Self = StObject.set(x, "circleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleRadiusUndefined: Self = StObject.set(x, "circleRadius", js.undefined)
    
    @scala.inline
    def setCollisionFilter(value: MatterCollisionFilter): Self = StObject.set(x, "collisionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionFilterUndefined: Self = StObject.set(x, "collisionFilter", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    @scala.inline
    def setForce(value: Vector2Like): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionAir(value: Double): Self = StObject.set(x, "frictionAir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionAirUndefined: Self = StObject.set(x, "frictionAir", js.undefined)
    
    @scala.inline
    def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionStaticUndefined: Self = StObject.set(x, "frictionStatic", js.undefined)
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setGravityScale(value: Vector2Like): Self = StObject.set(x, "gravityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityScaleUndefined: Self = StObject.set(x, "gravityScale", js.undefined)
    
    @scala.inline
    def setIgnoreGravity(value: Boolean): Self = StObject.set(x, "ignoreGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreGravityUndefined: Self = StObject.set(x, "ignoreGravity", js.undefined)
    
    @scala.inline
    def setIgnorePointer(value: Boolean): Self = StObject.set(x, "ignorePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePointerUndefined: Self = StObject.set(x, "ignorePointer", js.undefined)
    
    @scala.inline
    def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseMassUndefined: Self = StObject.set(x, "inverseMass", js.undefined)
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSensorUndefined: Self = StObject.set(x, "isSensor", js.undefined)
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setOnCollideActiveCallback(value: js.Function): Self = StObject.set(x, "onCollideActiveCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCollideActiveCallbackUndefined: Self = StObject.set(x, "onCollideActiveCallback", js.undefined)
    
    @scala.inline
    def setOnCollideCallback(value: js.Function): Self = StObject.set(x, "onCollideCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCollideCallbackUndefined: Self = StObject.set(x, "onCollideCallback", js.undefined)
    
    @scala.inline
    def setOnCollideEndCallback(value: js.Function): Self = StObject.set(x, "onCollideEndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCollideEndCallbackUndefined: Self = StObject.set(x, "onCollideEndCallback", js.undefined)
    
    @scala.inline
    def setOnCollideWith(value: js.Any): Self = StObject.set(x, "onCollideWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCollideWithUndefined: Self = StObject.set(x, "onCollideWith", js.undefined)
    
    @scala.inline
    def setParts(value: js.Array[BodyType]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: BodyType*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    @scala.inline
    def setPlugin(value: js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setPosition(value: Vector2Like): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRender(value: MatterBodyRenderConfig): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
    
    @scala.inline
    def setScale(value: Vector2Like): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSleepThreshold(value: Double): Self = StObject.set(x, "sleepThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSleepThresholdUndefined: Self = StObject.set(x, "sleepThreshold", js.undefined)
    
    @scala.inline
    def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
    
    @scala.inline
    def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
    
    @scala.inline
    def setTorque(value: Double): Self = StObject.set(x, "torque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorqueUndefined: Self = StObject.set(x, "torque", js.undefined)
    
    @scala.inline
    def setVertices(value: js.Array[Vector2Like]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: Vector2Like*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
