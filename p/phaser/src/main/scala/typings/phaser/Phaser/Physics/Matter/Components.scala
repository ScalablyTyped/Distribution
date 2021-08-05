package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterSetBodyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Components {
  
  /**
    * A component to set restitution on objects.
    */
  trait Bounce extends StObject {
    
    /**
      * Sets the restitution on the physics object.
      * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
      */
    def setBounce(value: Double): GameObject
  }
  object Bounce {
    
    inline def apply(setBounce: Double => GameObject): Bounce = {
      val __obj = js.Dynamic.literal(setBounce = js.Any.fromFunction1(setBounce))
      __obj.asInstanceOf[Bounce]
    }
    
    extension [Self <: Bounce](x: Self) {
      
      inline def setSetBounce(value: Double => GameObject): Self = StObject.set(x, "setBounce", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Contains methods for changing the collision filter of a Matter Body. Should be used as a mixin and not called directly.
    */
  @js.native
  trait Collision extends StObject {
    
    def setCollidesWith(categories: js.Array[Double]): GameObject = js.native
    /**
      * Sets the collision mask for this Game Object's Matter Body. Two Matter Bodies with different collision groups will only
      * collide if each one includes the other's category in its mask based on a bitwise AND, i.e. `(categoryA & maskB) !== 0`
      * and `(categoryB & maskA) !== 0` are both true.
      * @param categories A unique category bitfield, or an array of them.
      */
    def setCollidesWith(categories: Double): GameObject = js.native
    
    /**
      * Sets the collision category of this Game Object's Matter Body. This number must be a power of two between 2^0 (= 1) and 2^31.
      * Two bodies with different collision groups (see {@link #setCollisionGroup}) will only collide if their collision
      * categories are included in their collision masks (see {@link #setCollidesWith}).
      * @param value Unique category bitfield.
      */
    def setCollisionCategory(value: Double): GameObject = js.native
    
    /**
      * Sets the collision group of this Game Object's Matter Body. If this is zero or two Matter Bodies have different values,
      * they will collide according to the usual rules (see {@link #setCollisionCategory} and {@link #setCollisionGroup}).
      * If two Matter Bodies have the same positive value, they will always collide; if they have the same negative value,
      * they will never collide.
      * @param value Unique group index.
      */
    def setCollisionGroup(value: Double): GameObject = js.native
    
    /**
      * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
      * 
      * This does not change the bodies collision category, group or filter. Those must be set in addition
      * to the callback.
      * @param callback The callback to invoke when this body starts colliding with another.
      */
    def setOnCollide(callback: js.Function): GameObject = js.native
    
    /**
      * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
      * 
      * This does not change the bodies collision category, group or filter. Those must be set in addition
      * to the callback.
      * @param callback The callback to invoke for the duration of this body colliding with another.
      */
    def setOnCollideActive(callback: js.Function): GameObject = js.native
    
    /**
      * The callback is sent a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
      * 
      * This does not change the bodies collision category, group or filter. Those must be set in addition
      * to the callback.
      * @param callback The callback to invoke when this body stops colliding with another.
      */
    def setOnCollideEnd(callback: js.Function): GameObject = js.native
    
    def setOnCollideWith(body: js.Array[Body], callback: js.Function): GameObject = js.native
    /**
      * The callback is sent a reference to the other body, along with a `Phaser.Types.Physics.Matter.MatterCollisionData` object.
      * 
      * This does not change the bodies collision category, group or filter. Those must be set in addition
      * to the callback.
      * @param body The body, or an array of bodies, to test for collisions with.
      * @param callback The callback to invoke when this body collides with the given body or bodies.
      */
    def setOnCollideWith(body: Body, callback: js.Function): GameObject = js.native
  }
  
  /**
    * A component to apply force to Matter.js bodies.
    */
  trait Force extends StObject {
    
    /**
      * Applies a force to a body.
      * @param force A Vector that specifies the force to apply.
      */
    def applyForce(force: Vector2): GameObject
    
    /**
      * Applies a force to a body from a given position.
      * @param position The position in which the force comes from.
      * @param force A Vector that specifies the force to apply.
      */
    def applyForceFrom(position: Vector2, force: Vector2): GameObject
    
    /**
      * Apply thrust to the forward position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    def thrust(speed: Double): GameObject
    
    /**
      * Apply thrust to the back position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    def thrustBack(speed: Double): GameObject
    
    /**
      * Apply thrust to the left position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    def thrustLeft(speed: Double): GameObject
    
    /**
      * Apply thrust to the right position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    def thrustRight(speed: Double): GameObject
  }
  object Force {
    
    inline def apply(
      applyForce: Vector2 => GameObject,
      applyForceFrom: (Vector2, Vector2) => GameObject,
      thrust: Double => GameObject,
      thrustBack: Double => GameObject,
      thrustLeft: Double => GameObject,
      thrustRight: Double => GameObject
    ): Force = {
      val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction1(applyForce), applyForceFrom = js.Any.fromFunction2(applyForceFrom), thrust = js.Any.fromFunction1(thrust), thrustBack = js.Any.fromFunction1(thrustBack), thrustLeft = js.Any.fromFunction1(thrustLeft), thrustRight = js.Any.fromFunction1(thrustRight))
      __obj.asInstanceOf[Force]
    }
    
    extension [Self <: Force](x: Self) {
      
      inline def setApplyForce(value: Vector2 => GameObject): Self = StObject.set(x, "applyForce", js.Any.fromFunction1(value))
      
      inline def setApplyForceFrom(value: (Vector2, Vector2) => GameObject): Self = StObject.set(x, "applyForceFrom", js.Any.fromFunction2(value))
      
      inline def setThrust(value: Double => GameObject): Self = StObject.set(x, "thrust", js.Any.fromFunction1(value))
      
      inline def setThrustBack(value: Double => GameObject): Self = StObject.set(x, "thrustBack", js.Any.fromFunction1(value))
      
      inline def setThrustLeft(value: Double => GameObject): Self = StObject.set(x, "thrustLeft", js.Any.fromFunction1(value))
      
      inline def setThrustRight(value: Double => GameObject): Self = StObject.set(x, "thrustRight", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Contains methods for changing the friction of a Game Object's Matter Body. Should be used a mixin, not called directly.
    */
  @js.native
  trait Friction extends StObject {
    
    /**
      * Sets new friction values for this Game Object's Matter Body.
      * @param value The new friction of the body, between 0 and 1, where 0 allows the Body to slide indefinitely, while 1 allows it to stop almost immediately after a force is applied.
      * @param air If provided, the new air resistance of the Body. The higher the value, the faster the Body will slow as it moves through space. 0 means the body has no air resistance.
      * @param fstatic If provided, the new static friction of the Body. The higher the value (e.g. 10), the more force it will take to initially get the Body moving when it is nearly stationary. 0 means the body will never "stick" when it is nearly stationary.
      */
    def setFriction(value: Double): GameObject = js.native
    def setFriction(value: Double, air: Double): GameObject = js.native
    def setFriction(value: Double, air: Double, fstatic: Double): GameObject = js.native
    def setFriction(value: Double, air: Unit, fstatic: Double): GameObject = js.native
    
    /**
      * Sets a new air resistance for this Game Object's Matter Body.
      * A value of 0 means the Body will never slow as it moves through space.
      * The higher the value, the faster a Body slows when moving through space.
      * @param value The new air resistance for the Body.
      */
    def setFrictionAir(value: Double): GameObject = js.native
    
    /**
      * Sets a new static friction for this Game Object's Matter Body.
      * A value of 0 means the Body will never "stick" when it is nearly stationary.
      * The higher the value (e.g. 10), the more force it will take to initially get the Body moving when it is nearly stationary.
      * @param value The new static friction for the Body.
      */
    def setFrictionStatic(value: Double): GameObject = js.native
  }
  
  /**
    * A component to manipulate world gravity for Matter.js bodies.
    */
  trait Gravity extends StObject {
    
    /**
      * A togglable function for ignoring world gravity in real-time on the current body.
      * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
      */
    def setIgnoreGravity(value: Boolean): GameObject
  }
  object Gravity {
    
    inline def apply(setIgnoreGravity: Boolean => GameObject): Gravity = {
      val __obj = js.Dynamic.literal(setIgnoreGravity = js.Any.fromFunction1(setIgnoreGravity))
      __obj.asInstanceOf[Gravity]
    }
    
    extension [Self <: Gravity](x: Self) {
      
      inline def setSetIgnoreGravity(value: Boolean => GameObject): Self = StObject.set(x, "setIgnoreGravity", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Allows accessing the mass, density, and center of mass of a Matter-enabled Game Object. Should be used as a mixin and not directly.
    */
  trait Mass extends StObject {
    
    /**
      * The body's center of mass.
      * 
      * Calling this creates a new `Vector2 each time to avoid mutation.
      * 
      * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
      */
    val centerOfMass: Vector2
    
    /**
      * Sets density of the body.
      * @param value The new density of the body.
      */
    def setDensity(value: Double): GameObject
    
    /**
      * Sets the mass of the Game Object's Matter Body.
      * @param value The new mass of the body.
      */
    def setMass(value: Double): GameObject
  }
  object Mass {
    
    inline def apply(centerOfMass: Vector2, setDensity: Double => GameObject, setMass: Double => GameObject): Mass = {
      val __obj = js.Dynamic.literal(centerOfMass = centerOfMass.asInstanceOf[js.Any], setDensity = js.Any.fromFunction1(setDensity), setMass = js.Any.fromFunction1(setMass))
      __obj.asInstanceOf[Mass]
    }
    
    extension [Self <: Mass](x: Self) {
      
      inline def setCenterOfMass(value: Vector2): Self = StObject.set(x, "centerOfMass", value.asInstanceOf[js.Any])
      
      inline def setSetDensity(value: Double => GameObject): Self = StObject.set(x, "setDensity", js.Any.fromFunction1(value))
      
      inline def setSetMass(value: Double => GameObject): Self = StObject.set(x, "setMass", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Enables a Matter-enabled Game Object to be a sensor. Should be used as a mixin and not directly.
    */
  trait Sensor extends StObject {
    
    /**
      * Is the body belonging to this Game Object a sensor or not?
      */
    def isSensor(): Boolean
    
    /**
      * Set the body belonging to this Game Object to be a sensor.
      * Sensors trigger collision events, but don't react with colliding body physically.
      * @param value `true` to set the body as a sensor, or `false` to disable it.
      */
    def setSensor(value: Boolean): GameObject
  }
  object Sensor {
    
    inline def apply(isSensor: () => Boolean, setSensor: Boolean => GameObject): Sensor = {
      val __obj = js.Dynamic.literal(isSensor = js.Any.fromFunction0(isSensor), setSensor = js.Any.fromFunction1(setSensor))
      __obj.asInstanceOf[Sensor]
    }
    
    extension [Self <: Sensor](x: Self) {
      
      inline def setIsSensor(value: () => Boolean): Self = StObject.set(x, "isSensor", js.Any.fromFunction0(value))
      
      inline def setSetSensor(value: Boolean => GameObject): Self = StObject.set(x, "setSensor", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Enables a Matter-enabled Game Object to set its Body. Should be used as a mixin and not directly.
    */
  @js.native
  trait SetBody extends StObject {
    
    /**
      * Set this Game Object to create and use a new Body based on the configuration object given.
      * 
      * Calling this method resets previous properties you may have set on the body, including
      * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
      * @param config Either a string, such as `circle`, or a Matter Set Body Configuration object.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def setBody(config: String): GameObject = js.native
    def setBody(config: String, options: MatterBodyConfig): GameObject = js.native
    def setBody(config: MatterSetBodyConfig): GameObject = js.native
    def setBody(config: MatterSetBodyConfig, options: MatterBodyConfig): GameObject = js.native
    
    /**
      * Set the body on a Game Object to a circle.
      * 
      * Calling this methods resets previous properties you may have set on the body, including
      * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
      * @param radius The radius of the circle.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def setCircle(radius: Double): GameObject = js.native
    def setCircle(radius: Double, options: MatterBodyConfig): GameObject = js.native
    
    /**
      * Set this Game Object to use the given existing Matter Body.
      * 
      * The body is first removed from the world before being added to this Game Object.
      * @param body The Body this Game Object should use.
      * @param addToWorld Should the body be immediately added to the World? Default true.
      */
    def setExistingBody(body: BodyType): GameObject = js.native
    def setExistingBody(body: BodyType, addToWorld: Boolean): GameObject = js.native
    
    /**
      * Set the body on the Game Object to a polygon shape.
      * 
      * Calling this methods resets previous properties you may have set on the body, including
      * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
      * @param sides The number of sides the polygon will have.
      * @param radius The "radius" of the polygon, i.e. the distance from its center to any vertex. This is also the radius of its circumcircle.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def setPolygon(sides: Double, radius: Double): GameObject = js.native
    def setPolygon(sides: Double, radius: Double, options: MatterBodyConfig): GameObject = js.native
    
    /**
      * Set the body on a Game Object to a rectangle.
      * 
      * Calling this methods resets previous properties you may have set on the body, including
      * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
      * @param width Width of the rectangle.
      * @param height Height of the rectangle.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def setRectangle(width: Double, height: Double): GameObject = js.native
    def setRectangle(width: Double, height: Double, options: MatterBodyConfig): GameObject = js.native
    
    /**
      * Set the body on the Game Object to a trapezoid shape.
      * 
      * Calling this methods resets previous properties you may have set on the body, including
      * plugins, mass, friction, etc. So be sure to re-apply these in the options object if needed.
      * @param width The width of the trapezoid Body.
      * @param height The height of the trapezoid Body.
      * @param slope The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def setTrapezoid(width: Double, height: Double, slope: Double): GameObject = js.native
    def setTrapezoid(width: Double, height: Double, slope: Double, options: MatterBodyConfig): GameObject = js.native
  }
  
  /**
    * Enables a Matter-enabled Game Object to be able to go to sleep. Should be used as a mixin and not directly.
    */
  @js.native
  trait Sleep extends StObject {
    
    /**
      * Wakes this Body if asleep.
      */
    def setAwake(): this.type = js.native
    
    /**
      * Enables or disables the Sleep End event for this body.
      * @param value `true` to enable the sleep event, or `false` to disable it.
      */
    def setSleepEndEvent(value: Boolean): this.type = js.native
    
    /**
      * Enable sleep and wake events for this body.
      * 
      * By default when a body goes to sleep, or wakes up, it will not emit any events.
      * 
      * The events are emitted by the Matter World instance and can be listened to via
      * the `SLEEP_START` and `SLEEP_END` events.
      * @param start `true` if you want the sleep start event to be emitted for this body.
      * @param end `true` if you want the sleep end event to be emitted for this body.
      */
    def setSleepEvents(start: Boolean, end: Boolean): this.type = js.native
    
    /**
      * Enables or disables the Sleep Start event for this body.
      * @param value `true` to enable the sleep event, or `false` to disable it.
      */
    def setSleepStartEvent(value: Boolean): this.type = js.native
    
    /**
      * Sets the number of updates in which this body must have near-zero velocity before it is set as sleeping (if sleeping is enabled by the engine).
      * @param value A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping. Default 60.
      */
    def setSleepThreshold(): this.type = js.native
    def setSleepThreshold(value: Double): this.type = js.native
    
    /**
      * Sets this Body to sleep.
      */
    def setToSleep(): this.type = js.native
  }
  
  /**
    * Provides methods used for getting and setting the static state of a physics body.
    */
  trait Static extends StObject {
    
    /**
      * Returns `true` if the body is static, otherwise `false` for a dynamic body.
      */
    def isStatic(): Boolean
    
    /**
      * Changes the physics body to be either static `true` or dynamic `false`.
      * @param value `true` to set the body as being static, or `false` to make it dynamic.
      */
    def setStatic(value: Boolean): GameObject
  }
  object Static {
    
    inline def apply(isStatic: () => Boolean, setStatic: Boolean => GameObject): Static = {
      val __obj = js.Dynamic.literal(isStatic = js.Any.fromFunction0(isStatic), setStatic = js.Any.fromFunction1(setStatic))
      __obj.asInstanceOf[Static]
    }
    
    extension [Self <: Static](x: Self) {
      
      inline def setIsStatic(value: () => Boolean): Self = StObject.set(x, "isStatic", js.Any.fromFunction0(value))
      
      inline def setSetStatic(value: Boolean => GameObject): Self = StObject.set(x, "setStatic", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Provides methods used for getting and setting the position, scale and rotation of a Game Object.
    */
  @js.native
  trait Transform extends StObject {
    
    /**
      * Use `angle` to set or get rotation of the physics body associated to this GameObject.
      * Unlike rotation, when using set the value can be in degrees, which will be converted to radians internally.
      */
    var angle: Double = js.native
    
    /**
      * Use `rotation` to set or get the rotation of the physics body associated with this GameObject.
      * The value when set must be in radians.
      */
    var rotation: Double = js.native
    
    /**
      * The horizontal scale of this Game Object.
      */
    var scaleX: Double = js.native
    
    /**
      * The vertical scale of this Game Object.
      */
    var scaleY: Double = js.native
    
    /**
      * Immediately sets the angle of the Body.
      * Angular velocity, position, force etc. are unchanged.
      * @param degrees The angle to set, in degrees. Default 0.
      */
    def setAngle(): this.type = js.native
    def setAngle(degrees: Double): this.type = js.native
    
    /**
      * Setting fixed rotation sets the Body inertia to Infinity, which stops it
      * from being able to rotate when forces are applied to it.
      */
    def setFixedRotation(): this.type = js.native
    
    /**
      * Sets the position of the physics body along x and y axes.
      * Both the parameters to this function are optional and if not passed any they default to 0.
      * Velocity, angle, force etc. are unchanged.
      * @param x The horizontal position of the body. Default 0.
      * @param y The vertical position of the body. Default x.
      */
    def setPosition(): this.type = js.native
    def setPosition(x: Double): this.type = js.native
    def setPosition(x: Double, y: Double): this.type = js.native
    def setPosition(x: Unit, y: Double): this.type = js.native
    
    /**
      * Immediately sets the angle of the Body.
      * Angular velocity, position, force etc. are unchanged.
      * @param radians The angle of the body, in radians. Default 0.
      */
    def setRotation(): this.type = js.native
    def setRotation(radians: Double): this.type = js.native
    
    /**
      * Sets the scale of this Game Object.
      * @param x The horizontal scale of this Game Object. Default 1.
      * @param y The vertical scale of this Game Object. If not set it will use the x value. Default x.
      * @param point The point (Vector2) from which scaling will occur.
      */
    def setScale(): this.type = js.native
    def setScale(x: Double): this.type = js.native
    def setScale(x: Double, y: Double): this.type = js.native
    def setScale(x: Double, y: Double, point: Vector2): this.type = js.native
    def setScale(x: Double, y: Unit, point: Vector2): this.type = js.native
    def setScale(x: Unit, y: Double): this.type = js.native
    def setScale(x: Unit, y: Double, point: Vector2): this.type = js.native
    def setScale(x: Unit, y: Unit, point: Vector2): this.type = js.native
    
    /**
      * The x position of this Game Object.
      */
    var x: Double = js.native
    
    /**
      * The y position of this Game Object.
      */
    var y: Double = js.native
  }
  
  /**
    * Contains methods for changing the velocity of a Matter Body. Should be used as a mixin and not called directly.
    */
  @js.native
  trait Velocity extends StObject {
    
    /**
      * Sets the angular velocity of the body instantly.
      * Position, angle, force etc. are unchanged.
      * @param value The angular velocity.
      */
    def setAngularVelocity(value: Double): GameObject = js.native
    
    /**
      * Sets both the horizontal and vertical velocity of the physics body.
      * @param x The horizontal velocity value.
      * @param y The vertical velocity value, it can be either positive or negative. If not given, it will be the same as the `x` value. Default x.
      */
    def setVelocity(x: Double): GameObject = js.native
    def setVelocity(x: Double, y: Double): GameObject = js.native
    
    /**
      * Sets the horizontal velocity of the physics body.
      * @param x The horizontal velocity value.
      */
    def setVelocityX(x: Double): GameObject = js.native
    
    /**
      * Sets vertical velocity of the physics body.
      * @param y The vertical velocity value.
      */
    def setVelocityY(y: Double): GameObject = js.native
  }
}
