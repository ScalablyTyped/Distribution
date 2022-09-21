package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBodyDefinition extends StObject {
  
  /**
    * A `Number` specifying the angle of the body, in radians.
    *
    * @property angle
    * @type number
    * @default 0
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that _measures_ the current angular speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.angularVelocity`).
    *
    * @readOnly
    * @property angularSpeed
    * @type number
    * @default 0
    */
  var angularSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that _measures_ the current angular velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's angular velocity directly, you should apply a torque or simply change the body's `angle` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property angularVelocity
    * @type number
    * @default 0
    */
  var angularVelocity: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that _measures_ the area of the body's convex hull, calculated at creation by `Body.create`.
    *
    * @property area
    * @type string
    * @default
    */
  var area: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of unique axis vectors (edge normals) used for collision detection.
    * These are automatically calculated from the given convex hull (`vertices` array) in `Body.create`.
    * They are constantly updated by `Body.update` during the simulation.
    *
    * @property axes
    * @type vector[]
    */
  var axes: js.UndefOr[js.Array[Vector]] = js.undefined
  
  /**
    * A `Bounds` object that defines the AABB region for the body.
    * It is automatically calculated from the given convex hull (`vertices` array) in `Body.create` and constantly updated by `Body.update` during simulation.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: js.UndefOr[IBound] = js.undefined
  
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    *
    * Collisions between two bodies will obey the following rules:
    * - If the two bodies have the same non-zero value of `collisionFilter.group`,
    *   they will always collide if the value is positive, and they will never collide
    *   if the value is negative.
    * - If the two bodies have different values of `collisionFilter.group` or if one
    *   (or both) of the bodies has a value of 0, then the category/mask rules apply as follows:
    *
    * Each body belongs to a collision category, given by `collisionFilter.category`. This
    * value is used as a bit field and the category should have only one bit set, meaning that
    * the value of this property is a power of two in the range [1, 2^31]. Thus, there are 32
    * different collision categories available.
    *
    * Each body also defines a collision bitmask, given by `collisionFilter.mask` which specifies
    * the categories it collides with (the value is the bitwise AND value of all these categories).
    *
    * Using the category/mask rules, two bodies `A` and `B` collide if each includes the other's
    * category in its mask, i.e. `(categoryA & maskB) !== 0` and `(categoryB & maskA) !== 0`
    * are both true.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.undefined
  
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area.
    * If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object.
    * This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    *
    * @property density
    * @type number
    * @default 0.001
    */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    *
    * @property force
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var force: js.UndefOr[Vector] = js.undefined
  
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means that the body may slide indefinitely.
    * A value of `1` means the body may come to a stop almost instantly after a force is applied.
    *
    * The effects of the value may be non-linear.
    * High values may be unstable depending on the body.
    * The engine uses a Coulomb friction model including static and kinetic friction.
    * Note that collision response is based on _pairs_ of bodies, and that `friction` values are _combined_ with the following formula:
    *
    *     Math.min(bodyA.friction, bodyB.friction)
    *
    * @property friction
    * @type number
    * @default 0.1
    */
  var friction: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the air friction of the body (air resistance).
    * A value of `0` means the body will never slow as it moves through space.
    * The higher the value, the faster a body slows when moving through space.
    * The effects of the value are non-linear.
    *
    * @property frictionAir
    * @type number
    * @default 0.01
    */
  var frictionAir: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model).
    * A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used.
    * The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary.
    * This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    *
    * @property frictionStatic
    * @type number
    * @default 0.5
    */
  var frictionStatic: js.UndefOr[Double] = js.undefined
  
  /**
    * A reference to the Phaser Game Object this body belongs to, if any.
    *
    * @property gameObject
    * @type Phaser.GameObjects.GameObject
    */
  var gameObject: js.UndefOr[Any] = js.undefined
  
  /**
    * Scale the influence of World gravity when applied to this body.
    *
    * @property gravityScale
    * @type vector
    * @default { x: 1, y: 1 }
    */
  var gravityScale: js.UndefOr[Vector] = js.undefined
  
  /**
    * Will this Body ignore World gravity during the Engine update?
    *
    * @property ignoreGravity
    * @type boolean
    * @default false
    */
  var ignoreGravity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will this Body ignore Phaser Pointer input events?
    *
    * @property ignorePointer
    * @type boolean
    * @default false
    */
  var ignorePointer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A `Number` that defines the moment of inertia (i.e. second moment of area) of the body.
    * It is automatically calculated from the given convex hull (`vertices` array) and density in `Body.create`.
    * If you modify this value, you must also modify the `body.inverseInertia` property (`1 / inertia`).
    *
    * @property inertia
    * @type number
    */
  var inertia: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the inverse moment of inertia of the body (`1 / inertia`).
    * If you modify this value, you must also modify the `body.inertia` property.
    *
    * @property inverseInertia
    * @type number
    */
  var inverseInertia: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`).
    * If you modify this value, you must also modify the `body.mass` property.
    *
    * @property inverseMass
    * @type number
    */
  var inverseMass: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    *
    * @property isSensor
    * @type boolean
    * @default false
    */
  var isSensor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag that indicates whether the body is considered sleeping. A sleeping body acts similar to a static body, except it is only temporary and can be awoken.
    * If you need to set a body as sleeping, you should use `Sleeping.set` as this requires more than just setting this flag.
    *
    * @property isSleeping
    * @type boolean
    * @default false
    */
  var isSleeping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    * If you need to set a body as static after its creation, you should use `Body.setStatic` as this requires more than just setting this flag.
    *
    * @property isStatic
    * @type boolean
    * @default false
    */
  var isStatic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Body"
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead.
    * If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    *
    * @property mass
    * @type number
    */
  var mass: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that _measures_ the amount of movement a body currently has (a combination of `speed` and `angularSpeed`). It is read-only and always positive.
    * It is used and updated by the `Matter.Sleeping` module during simulation to decide if a body has come to rest.
    *
    * @readOnly
    * @property motion
    * @type number
    * @default 0
    */
  var motion: js.UndefOr[Double] = js.undefined
  
  /**
    * A callback that is invoked for the duration that this Body is colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideActiveCallback
    * @type function
    * @default null
    */
  var onCollideActiveCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A callback that is invoked when this Body starts colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideCallback
    * @type function
    * @default null
    */
  var onCollideCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A callback that is invoked when this Body stops colliding with any other Body.
    * 
    * You can register callbacks by providing a function of type `( pair: Matter.Pair) => void`.
    *
    * @property onCollideEndCallback
    * @type function
    * @default null
    */
  var onCollideEndCallback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A collision callback dictionary used by the `Body.setOnCollideWith` function.
    *
    * @property onCollideWith
    * @type object
    * @default null
    */
  var onCollideWith: js.UndefOr[Any] = js.undefined
  
  /**
    * A self reference if the body is _not_ a part of another body.
    * Otherwise this is a reference to the body that this is a part of.
    * See `body.parts`.
    *
    * @property parent
    * @type body
    */
  var parent: js.UndefOr[BodyType] = js.undefined
  
  /**
    * An array of bodies that make up this body.
    * The first body in the array must always be a self reference to the current body instance.
    * All bodies in the `parts` array together form a single rigid compound body.
    * Parts are allowed to overlap, have gaps or holes or even form concave bodies.
    * Parts themselves should never be added to a `World`, only the parent body should be.
    * Use `Body.setParts` when setting parts to ensure correct updates of all properties.
    *
    * @property parts
    * @type body[]
    */
  var parts: js.UndefOr[js.Array[BodyType]] = js.undefined
  
  /**
    * A `Vector` that specifies the current world-space position of the body.
    *
    * @property position
    * @type vector
    */
  var position: js.UndefOr[Vector] = js.undefined
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: js.UndefOr[IBodyRenderOptions] = js.undefined
  
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means collisions may be perfectly inelastic and no bouncing may occur.
    * A value of `0.8` means the body may bounce back with approximately 80% of its kinetic energy.
    * Note that collision response is based on _pairs_ of bodies, and that `restitution` values are _combined_ with the following formula:
    *
    *     Math.max(bodyA.restitution, bodyB.restitution)
    *
    * @property restitution
    * @type number
    * @default 0
    */
  var restitution: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    *
    * @property sleepThreshold
    * @type number
    * @default 60
    */
  var sleepThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies.
    * Avoid changing this value unless you understand the purpose of `slop` in physics engines.
    * The default should generally suffice, although very large bodies may require larger values for stable stacking.
    *
    * @property slop
    * @type number
    * @default 0.05
    */
  var slop: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that _measures_ the current speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.velocity`).
    *
    * @readOnly
    * @property speed
    * @type number
    * @default 0
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    *
    * @property timeScale
    * @type number
    * @default 1
    */
  var timeScale: js.UndefOr[Double] = js.undefined
  
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    *
    * @property torque
    * @type number
    * @default 0
    */
  var torque: js.UndefOr[Double] = js.undefined
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "body"
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * A `Vector` that _measures_ the current velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's velocity directly, you should either apply a force or simply change the body's `position` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property velocity
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var velocity: js.UndefOr[Vector] = js.undefined
  
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body.
    * These should be provided about the origin `(0, 0)`. E.g.
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * When passed via `Body.create`, the vertices are translated relative to `body.position` (i.e. world-space, and constantly updated by `Body.update` during simulation).
    * The `Vector` objects are also augmented with additional properties required for efficient collision detection.
    *
    * Other properties such as `inertia` and `bounds` are automatically calculated from the passed vertices (unless provided via `options`).
    * Concave hulls are not currently supported. The module `Matter.Vertices` contains useful methods for working with vertices.
    *
    * @property vertices
    * @type vector[]
    */
  var vertices: js.UndefOr[js.Array[Vector]] = js.undefined
}
object IBodyDefinition {
  
  inline def apply(): IBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBodyDefinition]
  }
  
  extension [Self <: IBodyDefinition](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAngularSpeed(value: Double): Self = StObject.set(x, "angularSpeed", value.asInstanceOf[js.Any])
    
    inline def setAngularSpeedUndefined: Self = StObject.set(x, "angularSpeed", js.undefined)
    
    inline def setAngularVelocity(value: Double): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
    
    inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAxes(value: js.Array[Vector]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setAxesVarargs(value: Vector*): Self = StObject.set(x, "axes", js.Array(value*))
    
    inline def setBounds(value: IBound): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setCollisionFilter(value: ICollisionFilter): Self = StObject.set(x, "collisionFilter", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilterUndefined: Self = StObject.set(x, "collisionFilter", js.undefined)
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setForce(value: Vector): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionAir(value: Double): Self = StObject.set(x, "frictionAir", value.asInstanceOf[js.Any])
    
    inline def setFrictionAirUndefined: Self = StObject.set(x, "frictionAir", js.undefined)
    
    inline def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    inline def setFrictionStaticUndefined: Self = StObject.set(x, "frictionStatic", js.undefined)
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setGameObject(value: Any): Self = StObject.set(x, "gameObject", value.asInstanceOf[js.Any])
    
    inline def setGameObjectUndefined: Self = StObject.set(x, "gameObject", js.undefined)
    
    inline def setGravityScale(value: Vector): Self = StObject.set(x, "gravityScale", value.asInstanceOf[js.Any])
    
    inline def setGravityScaleUndefined: Self = StObject.set(x, "gravityScale", js.undefined)
    
    inline def setIgnoreGravity(value: Boolean): Self = StObject.set(x, "ignoreGravity", value.asInstanceOf[js.Any])
    
    inline def setIgnoreGravityUndefined: Self = StObject.set(x, "ignoreGravity", js.undefined)
    
    inline def setIgnorePointer(value: Boolean): Self = StObject.set(x, "ignorePointer", value.asInstanceOf[js.Any])
    
    inline def setIgnorePointerUndefined: Self = StObject.set(x, "ignorePointer", js.undefined)
    
    inline def setInertia(value: Double): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setInverseInertia(value: Double): Self = StObject.set(x, "inverseInertia", value.asInstanceOf[js.Any])
    
    inline def setInverseInertiaUndefined: Self = StObject.set(x, "inverseInertia", js.undefined)
    
    inline def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    inline def setInverseMassUndefined: Self = StObject.set(x, "inverseMass", js.undefined)
    
    inline def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    inline def setIsSensorUndefined: Self = StObject.set(x, "isSensor", js.undefined)
    
    inline def setIsSleeping(value: Boolean): Self = StObject.set(x, "isSleeping", value.asInstanceOf[js.Any])
    
    inline def setIsSleepingUndefined: Self = StObject.set(x, "isSleeping", js.undefined)
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setMotion(value: Double): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setOnCollideActiveCallback(value: js.Function): Self = StObject.set(x, "onCollideActiveCallback", value.asInstanceOf[js.Any])
    
    inline def setOnCollideActiveCallbackUndefined: Self = StObject.set(x, "onCollideActiveCallback", js.undefined)
    
    inline def setOnCollideCallback(value: js.Function): Self = StObject.set(x, "onCollideCallback", value.asInstanceOf[js.Any])
    
    inline def setOnCollideCallbackUndefined: Self = StObject.set(x, "onCollideCallback", js.undefined)
    
    inline def setOnCollideEndCallback(value: js.Function): Self = StObject.set(x, "onCollideEndCallback", value.asInstanceOf[js.Any])
    
    inline def setOnCollideEndCallbackUndefined: Self = StObject.set(x, "onCollideEndCallback", js.undefined)
    
    inline def setOnCollideWith(value: Any): Self = StObject.set(x, "onCollideWith", value.asInstanceOf[js.Any])
    
    inline def setOnCollideWithUndefined: Self = StObject.set(x, "onCollideWith", js.undefined)
    
    inline def setParent(value: BodyType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParts(value: js.Array[BodyType]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: BodyType*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setPosition(value: Vector): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRender(value: IBodyRenderOptions): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
    
    inline def setSleepThreshold(value: Double): Self = StObject.set(x, "sleepThreshold", value.asInstanceOf[js.Any])
    
    inline def setSleepThresholdUndefined: Self = StObject.set(x, "sleepThreshold", js.undefined)
    
    inline def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
    
    inline def setTorque(value: Double): Self = StObject.set(x, "torque", value.asInstanceOf[js.Any])
    
    inline def setTorqueUndefined: Self = StObject.set(x, "torque", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVelocity(value: Vector): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    
    inline def setVertices(value: js.Array[Vector]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: Vector*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
