package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterBodyConfig extends js.Object {
  
  /**
    * A number specifying the angle of the body, in radians.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * A number, or array of numbers, to chamfer the vertices of the body, or a full Chamfer configuration object.
    */
  var chamfer: js.UndefOr[Double | js.Array[Double] | MatterChamferConfig] = js.native
  
  /**
    * The radius of this body if a circle.
    */
  var circleRadius: js.UndefOr[Double] = js.native
  
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    */
  var collisionFilter: js.UndefOr[MatterCollisionFilter] = js.native
  
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area. If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object. This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    */
  var density: js.UndefOr[Double] = js.native
  
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    */
  var force: js.UndefOr[Vector2Like] = js.native
  
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`. A value of `0` means that the body may slide indefinitely. A value of `1` means the body may come to a stop almost instantly after a force is applied.
    */
  var friction: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that defines the air friction of the body (air resistance). A value of `0` means the body will never slow as it moves through space. The higher the value, the faster a body slows when moving through space.
    */
  var frictionAir: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model). A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used. The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary. This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    */
  var frictionStatic: js.UndefOr[Double] = js.native
  
  /**
    * A `Vector` that scales the influence of World gravity when applied to this body.
    */
  var gravityScale: js.UndefOr[Vector2Like] = js.native
  
  /**
    * A boolean that toggles if this body should ignore world gravity or not.
    */
  var ignoreGravity: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean that toggles if this body should ignore pointer / mouse constraints or not.
    */
  var ignorePointer: js.UndefOr[Boolean] = js.native
  
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`). If you modify this value, you must also modify the `body.mass` property.
    */
  var inverseMass: js.UndefOr[Double] = js.native
  
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    */
  var isSensor: js.UndefOr[Boolean] = js.native
  
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    */
  var isStatic: js.UndefOr[Boolean] = js.native
  
  /**
    * An arbitrary string-based name to help identify this body.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead. If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    */
  var mass: js.UndefOr[Double] = js.native
  
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * A callback that is invoked when this Body starts colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * A callback that is invoked when this Body stops colliding with any other Body. You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.native
  
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    */
  var onCollideWith: js.UndefOr[js.Any] = js.native
  
  /**
    * An array of bodies that make up this body. The first body in the array must always be a self reference to the current body instance. All bodies in the `parts` array together form a single rigid compound body.
    */
  var parts: js.UndefOr[js.Array[BodyType]] = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    */
  var plugin: js.UndefOr[js.Any] = js.native
  
  /**
    * A `Vector` that specifies the current world-space position of the body.
    */
  var position: js.UndefOr[Vector2Like] = js.native
  
  /**
    * The Debug Render configuration object for this body.
    */
  var render: js.UndefOr[MatterBodyRenderConfig] = js.native
  
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    */
  var restitution: js.UndefOr[Double] = js.native
  
  /**
    * A `Vector` that specifies the initial scale of the body.
    */
  var scale: js.UndefOr[Vector2Like] = js.native
  
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    */
  var sleepThreshold: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies. Avoid changing this value unless you understand the purpose of `slop` in physics engines. The default should generally suffice, although very large bodies may require larger values for stable stacking.
    */
  var slop: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    */
  var timeScale: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    */
  var torque: js.UndefOr[Double] = js.native
  
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body. These should be provided about the origin `(0, 0)`.
    */
  var vertices: js.UndefOr[js.Array[Vector2Like]] = js.native
}
object MatterBodyConfig {
  
  @scala.inline
  def apply(): MatterBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyConfig]
  }
  
  @scala.inline
  implicit class MatterBodyConfigOps[Self <: MatterBodyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setChamferVarargs(value: Double*): Self = this.set("chamfer", js.Array(value :_*))
    
    @scala.inline
    def setChamfer(value: Double | js.Array[Double] | MatterChamferConfig): Self = this.set("chamfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChamfer: Self = this.set("chamfer", js.undefined)
    
    @scala.inline
    def setCircleRadius(value: Double): Self = this.set("circleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleRadius: Self = this.set("circleRadius", js.undefined)
    
    @scala.inline
    def setCollisionFilter(value: MatterCollisionFilter): Self = this.set("collisionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollisionFilter: Self = this.set("collisionFilter", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setForce(value: Vector2Like): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setFrictionAir(value: Double): Self = this.set("frictionAir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionAir: Self = this.set("frictionAir", js.undefined)
    
    @scala.inline
    def setFrictionStatic(value: Double): Self = this.set("frictionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrictionStatic: Self = this.set("frictionStatic", js.undefined)
    
    @scala.inline
    def setGravityScale(value: Vector2Like): Self = this.set("gravityScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravityScale: Self = this.set("gravityScale", js.undefined)
    
    @scala.inline
    def setIgnoreGravity(value: Boolean): Self = this.set("ignoreGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreGravity: Self = this.set("ignoreGravity", js.undefined)
    
    @scala.inline
    def setIgnorePointer(value: Boolean): Self = this.set("ignorePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePointer: Self = this.set("ignorePointer", js.undefined)
    
    @scala.inline
    def setInverseMass(value: Double): Self = this.set("inverseMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseMass: Self = this.set("inverseMass", js.undefined)
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = this.set("isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSensor: Self = this.set("isSensor", js.undefined)
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStatic: Self = this.set("isStatic", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = this.set("mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMass: Self = this.set("mass", js.undefined)
    
    @scala.inline
    def setOnCollideActiveCallback(value: js.Function): Self = this.set("onCollideActiveCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCollideActiveCallback: Self = this.set("onCollideActiveCallback", js.undefined)
    
    @scala.inline
    def setOnCollideCallback(value: js.Function): Self = this.set("onCollideCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCollideCallback: Self = this.set("onCollideCallback", js.undefined)
    
    @scala.inline
    def setOnCollideEndCallback(value: js.Function): Self = this.set("onCollideEndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCollideEndCallback: Self = this.set("onCollideEndCallback", js.undefined)
    
    @scala.inline
    def setOnCollideWith(value: js.Any): Self = this.set("onCollideWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCollideWith: Self = this.set("onCollideWith", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: BodyType*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[BodyType]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    
    @scala.inline
    def setPlugin(value: js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setPosition(value: Vector2Like): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRender(value: MatterBodyRenderConfig): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestitution: Self = this.set("restitution", js.undefined)
    
    @scala.inline
    def setScale(value: Vector2Like): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSleepThreshold(value: Double): Self = this.set("sleepThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSleepThreshold: Self = this.set("sleepThreshold", js.undefined)
    
    @scala.inline
    def setSlop(value: Double): Self = this.set("slop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlop: Self = this.set("slop", js.undefined)
    
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
    
    @scala.inline
    def setTorque(value: Double): Self = this.set("torque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTorque: Self = this.set("torque", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: Vector2Like*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Vector2Like]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
