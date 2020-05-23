package typings.phaser.phaserMod.Physics

import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Physics.Matter")
@js.native
object Matter extends js.Object {
  /**
    * The Body Bounds class contains methods to help you extract the world coordinates from various points around
    * the bounds of a Matter Body. Because Matter bodies are positioned based on their center of mass, and not a
    * dimension based center, you often need to get the bounds coordinates in order to properly align them in the world.
    * 
    * You can access this class via the MatterPhysics class from a Scene, i.e.:
    * 
    * ```javascript
    * this.matter.bodyBounds.getTopLeft(body);
    * ```
    * 
    * See also the `MatterPhysics.alignBody` method.
    */
  @js.native
  class BodyBounds ()
    extends typings.phaser.Phaser.Physics.Matter.BodyBounds
  
  /**
    * The Matter Factory is responsible for quickly creating a variety of different types of
    * bodies, constraints and Game Objects and adding them into the physics world.
    * 
    * You access the factory from within a Scene using `add`:
    * 
    * ```javascript
    * this.matter.add.rectangle(x, y, width, height);
    * ```
    * 
    * Use of the Factory is optional. All of the objects it creates can also be created
    * directly via your own code or constructors. It is provided as a means to keep your
    * code concise.
    */
  @js.native
  class Factory protected ()
    extends typings.phaser.Phaser.Physics.Matter.Factory {
    /**
      * 
      * @param world The Matter World which this Factory adds to.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World) = this()
  }
  
  /**
    * A Matter Physics Image Game Object.
    * 
    * An Image is a light-weight Game Object useful for the display of static images in your game,
    * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
    * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
    * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
    */
  @js.native
  class Image protected ()
    extends typings.phaser.Phaser.Physics.Matter.Image {
    /**
      * 
      * @param world A reference to the Matter.World instance that this body belongs to.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: MatterBodyConfig
    ) = this()
    /**
      * The body's center of mass.
      * 
      * Calling this creates a new `Vector2 each time to avoid mutation.
      * 
      * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
      */
    /* CompleteClass */
    override val centerOfMass: Vector2 = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Applies a force to a body.
      * @param force A Vector that specifies the force to apply.
      */
    /* CompleteClass */
    override def applyForce(force: Vector2): GameObject = js.native
    /**
      * Applies a force to a body from a given position.
      * @param position The position in which the force comes from.
      * @param force A Vector that specifies the force to apply.
      */
    /* CompleteClass */
    override def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
    /**
      * Is the body belonging to this Game Object a sensor or not?
      */
    /* CompleteClass */
    override def isSensor(): Boolean = js.native
    /**
      * Returns `true` if the body is static, otherwise `false` for a dynamic body.
      */
    /* CompleteClass */
    override def isStatic(): Boolean = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * Sets the restitution on the physics object.
      * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
      */
    /* CompleteClass */
    override def setBounce(value: Double): GameObject = js.native
    /**
      * Sets density of the body.
      * @param value The new density of the body.
      */
    /* CompleteClass */
    override def setDensity(value: Double): GameObject = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * A togglable function for ignoring world gravity in real-time on the current body.
      * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
      */
    /* CompleteClass */
    override def setIgnoreGravity(value: Boolean): GameObject = js.native
    /**
      * Sets the mass of the Game Object's Matter Body.
      * @param value The new mass of the body.
      */
    /* CompleteClass */
    override def setMass(value: Double): GameObject = js.native
    /**
      * Set the body belonging to this Game Object to be a sensor.
      * Sensors trigger collision events, but don't react with colliding body physically.
      * @param value `true` to set the body as a sensor, or `false` to disable it.
      */
    /* CompleteClass */
    override def setSensor(value: Boolean): GameObject = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the size of this Game Object to be that of the given Frame.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param frame The frame to base the size of this Game Object on.
      */
    /* CompleteClass */
    override def setSizeToFrame(frame: Frame): this.type = js.native
    /**
      * Changes the physics body to be either static `true` or dynamic `false`.
      * @param value `true` to set the body as being static, or `false` to make it dynamic.
      */
    /* CompleteClass */
    override def setStatic(value: Boolean): GameObject = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Apply thrust to the forward position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrust(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the back position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustBack(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the left position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustLeft(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the right position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustRight(speed: Double): GameObject = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
  }
  
  /**
    * The Phaser Matter plugin provides the ability to use the Matter JS Physics Engine within your Phaser games.
    * 
    * Unlike Arcade Physics, the other physics system provided with Phaser, Matter JS is a full-body physics system.
    * It features:
    * 
    * * Rigid bodies
    * * Compound bodies
    * * Composite bodies
    * * Concave and convex hulls
    * * Physical properties (mass, area, density etc.)
    * * Restitution (elastic and inelastic collisions)
    * * Collisions (broad-phase, mid-phase and narrow-phase)
    * * Stable stacking and resting
    * * Conservation of momentum
    * * Friction and resistance
    * * Constraints
    * * Gravity
    * * Sleeping and static bodies
    * * Rounded corners (chamfering)
    * * Views (translate, zoom)
    * * Collision queries (raycasting, region tests)
    * * Time scaling (slow-mo, speed-up)
    * 
    * Configuration of Matter is handled via the Matter World Config object, which can be passed in either the
    * Phaser Game Config, or Phaser Scene Config. Here is a basic example:
    * 
    * ```js
    * physics: {
    *     default: 'matter',
    *     matter: {
    *         enableSleeping: true,
    *         gravity: {
    *             y: 0
    *         },
    *         debug: {
    *             showBody: true,
    *             showStaticBody: true
    *         }
    *     }
    * }
    * ```
    * 
    * This class acts as an interface between a Phaser Scene and a single instance of the Matter Engine.
    * 
    * Use it to access the most common Matter features and helper functions.
    * 
    * You can find details, documentation and examples on the Matter JS website: https://brm.io/matter-js/
    */
  @js.native
  class MatterPhysics protected ()
    extends typings.phaser.Phaser.Physics.Matter.MatterPhysics {
    /**
      * 
      * @param scene The Phaser Scene that owns this Matter Physics instance.
      */
    def this(scene: Scene) = this()
  }
  
  /**
    * A Pointer Constraint is a special type of constraint that allows you to click
    * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
    * and when one is pressed down it checks to see if that hit any part of any active
    * body in the world. If it did, and the body has input enabled, it will begin to
    * drag it until either released, or you stop it via the `stopDrag` method.
    * 
    * You can adjust the stiffness, length and other properties of the constraint via
    * the `options` object on creation.
    */
  @js.native
  class PointerConstraint protected ()
    extends typings.phaser.Phaser.Physics.Matter.PointerConstraint {
    /**
      * 
      * @param scene A reference to the Scene to which this Pointer Constraint belongs.
      * @param world A reference to the Matter World instance to which this Constraint belongs.
      * @param options A Constraint configuration object.
      */
    def this(scene: Scene, world: typings.phaser.Phaser.Physics.Matter.World) = this()
    def this(scene: Scene, world: typings.phaser.Phaser.Physics.Matter.World, options: js.Object) = this()
    /**
      * Is this Constraint active or not?
      * 
      * An active constraint will be processed each update. An inactive one will be skipped.
      * Use this to toggle a Pointer Constraint on and off.
      */
    /* CompleteClass */
    override var active: Boolean = js.native
    /**
      * The body that is currently being dragged, if any.
      */
    /* CompleteClass */
    override var body: BodyType = js.native
    /**
      * The Camera the Pointer was interacting with when the input
      * down event was processed.
      */
    /* CompleteClass */
    override var camera: Camera = js.native
    /**
      * The native Matter Constraint that is used to attach to bodies.
      */
    /* CompleteClass */
    override var constraint: ConstraintType = js.native
    /**
      * The part of the body that was clicked on to start the drag.
      */
    /* CompleteClass */
    override var part: BodyType = js.native
    /**
      * A reference to the Input Pointer that activated this Constraint.
      * This is set in the `onDown` handler.
      */
    /* CompleteClass */
    override var pointer: Pointer = js.native
    /**
      * The internal transformed position.
      */
    /* CompleteClass */
    override var position: Vector2 = js.native
    /**
      * A reference to the Scene to which this Pointer Constraint belongs.
      * This is the same Scene as the Matter World instance.
      */
    /* CompleteClass */
    override var scene: Scene = js.native
    /**
      * A reference to the Matter World instance to which this Constraint belongs.
      */
    /* CompleteClass */
    override var world: typings.phaser.Phaser.Physics.Matter.World = js.native
    /**
      * Destroys this Pointer Constraint instance and all of its references.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /**
      * Scans all active bodies in the current Matter World to see if any of them
      * are hit by the Pointer. The _first one_ found to hit is set as the active contraint
      * body.
      */
    /* CompleteClass */
    override def getBody(): Boolean = js.native
    /**
      * Scans the current body to determine if a part of it was clicked on.
      * If a part is found the body is set as the `constraint.bodyB` property,
      * as well as the `body` property of this class. The part is also set.
      * @param body The Matter Body to check.
      * @param position A translated hit test position.
      */
    /* CompleteClass */
    override def hitTestBody(body: BodyType, position: Vector2): Boolean = js.native
    /**
      * A Pointer has been pressed down onto the Scene.
      * 
      * If this Constraint doesn't have an active Pointer then a hit test is set to
      * run against all active bodies in the world during the _next_ call to `update`.
      * If a body is found, it is bound to this constraint and the drag begins.
      * @param pointer A reference to the Pointer that was pressed.
      */
    /* CompleteClass */
    override def onDown(pointer: Pointer): Unit = js.native
    /**
      * A Pointer has been released from the Scene. If it was the one this constraint was using, it's cleared.
      * @param pointer A reference to the Pointer that was pressed.
      */
    /* CompleteClass */
    override def onUp(pointer: Pointer): Unit = js.native
    /**
      * Stops the Pointer Constraint from dragging the body any further.
      * 
      * This is called automatically if the Pointer is released while actively
      * dragging a body. Or, you can call it manually to release a body from a
      * constraint without having to first release the pointer.
      */
    /* CompleteClass */
    override def stopDrag(): Unit = js.native
    /**
      * Internal update handler. Called in the Matter BEFORE_UPDATE step.
      */
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
  /**
    * A Matter Physics Sprite Game Object.
    * 
    * A Sprite Game Object is used for the display of both static and animated images in your game.
    * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
    * and animated.
    * 
    * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
    * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
    * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
    */
  @js.native
  class Sprite protected ()
    extends typings.phaser.Phaser.Physics.Matter.Sprite {
    /**
      * 
      * @param world A reference to the Matter.World instance that this body belongs to.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, x: Double, y: Double, texture: String) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: String,
      options: MatterBodyConfig
    ) = this()
    def this(
      world: typings.phaser.Phaser.Physics.Matter.World,
      x: Double,
      y: Double,
      texture: String,
      frame: integer,
      options: MatterBodyConfig
    ) = this()
    /**
      * The body's center of mass.
      * 
      * Calling this creates a new `Vector2 each time to avoid mutation.
      * 
      * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
      */
    /* CompleteClass */
    override val centerOfMass: Vector2 = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Applies a force to a body.
      * @param force A Vector that specifies the force to apply.
      */
    /* CompleteClass */
    override def applyForce(force: Vector2): GameObject = js.native
    /**
      * Applies a force to a body from a given position.
      * @param position The position in which the force comes from.
      * @param force A Vector that specifies the force to apply.
      */
    /* CompleteClass */
    override def applyForceFrom(position: Vector2, force: Vector2): GameObject = js.native
    /**
      * Is the body belonging to this Game Object a sensor or not?
      */
    /* CompleteClass */
    override def isSensor(): Boolean = js.native
    /**
      * Returns `true` if the body is static, otherwise `false` for a dynamic body.
      */
    /* CompleteClass */
    override def isStatic(): Boolean = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * Sets the restitution on the physics object.
      * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
      */
    /* CompleteClass */
    override def setBounce(value: Double): GameObject = js.native
    /**
      * Sets density of the body.
      * @param value The new density of the body.
      */
    /* CompleteClass */
    override def setDensity(value: Double): GameObject = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * A togglable function for ignoring world gravity in real-time on the current body.
      * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
      */
    /* CompleteClass */
    override def setIgnoreGravity(value: Boolean): GameObject = js.native
    /**
      * Sets the mass of the Game Object's Matter Body.
      * @param value The new mass of the body.
      */
    /* CompleteClass */
    override def setMass(value: Double): GameObject = js.native
    /**
      * Set the body belonging to this Game Object to be a sensor.
      * Sensors trigger collision events, but don't react with colliding body physically.
      * @param value `true` to set the body as a sensor, or `false` to disable it.
      */
    /* CompleteClass */
    override def setSensor(value: Boolean): GameObject = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the size of this Game Object to be that of the given Frame.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param frame The frame to base the size of this Game Object on.
      */
    /* CompleteClass */
    override def setSizeToFrame(frame: Frame): this.type = js.native
    /**
      * Changes the physics body to be either static `true` or dynamic `false`.
      * @param value `true` to set the body as being static, or `false` to make it dynamic.
      */
    /* CompleteClass */
    override def setStatic(value: Boolean): GameObject = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Apply thrust to the forward position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrust(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the back position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustBack(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the left position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustLeft(speed: Double): GameObject = js.native
    /**
      * Apply thrust to the right position of the body.
      * 
      * Use very small values, such as 0.1, depending on the mass and required speed.
      * @param speed A speed value to be applied to a directional force.
      */
    /* CompleteClass */
    override def thrustRight(speed: Double): GameObject = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
  }
  
  /**
    * A wrapper around a Tile that provides access to a corresponding Matter body. A tile can only
    * have one Matter body associated with it. You can either pass in an existing Matter body for
    * the tile or allow the constructor to create the corresponding body for you. If the Tile has a
    * collision group (defined in Tiled), those shapes will be used to create the body. If not, the
    * tile's rectangle bounding box will be used.
    * 
    * The corresponding body will be accessible on the Tile itself via Tile.physics.matterBody.
    * 
    * Note: not all Tiled collision shapes are supported. See
    * Phaser.Physics.Matter.TileBody#setFromTileCollision for more information.
    */
  @js.native
  class TileBody protected ()
    extends typings.phaser.Phaser.Physics.Matter.TileBody {
    /**
      * 
      * @param world The Matter world instance this body belongs to.
      * @param tile The target tile that should have a Matter body.
      * @param options Options to be used when creating the Matter body.
      */
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile) = this()
    def this(world: typings.phaser.Phaser.Physics.Matter.World, tile: Tile, options: MatterTileOptions) = this()
    /**
      * The body's center of mass.
      * 
      * Calling this creates a new `Vector2 each time to avoid mutation.
      * 
      * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
      */
    /* CompleteClass */
    override val centerOfMass: Vector2 = js.native
    /**
      * Is the body belonging to this Game Object a sensor or not?
      */
    /* CompleteClass */
    override def isSensor(): Boolean = js.native
    /**
      * Returns `true` if the body is static, otherwise `false` for a dynamic body.
      */
    /* CompleteClass */
    override def isStatic(): Boolean = js.native
    /**
      * Sets the restitution on the physics object.
      * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
      */
    /* CompleteClass */
    override def setBounce(value: Double): GameObject = js.native
    /**
      * Sets density of the body.
      * @param value The new density of the body.
      */
    /* CompleteClass */
    override def setDensity(value: Double): GameObject = js.native
    /**
      * A togglable function for ignoring world gravity in real-time on the current body.
      * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
      */
    /* CompleteClass */
    override def setIgnoreGravity(value: Boolean): GameObject = js.native
    /**
      * Sets the mass of the Game Object's Matter Body.
      * @param value The new mass of the body.
      */
    /* CompleteClass */
    override def setMass(value: Double): GameObject = js.native
    /**
      * Set the body belonging to this Game Object to be a sensor.
      * Sensors trigger collision events, but don't react with colliding body physically.
      * @param value `true` to set the body as a sensor, or `false` to disable it.
      */
    /* CompleteClass */
    override def setSensor(value: Boolean): GameObject = js.native
    /**
      * Changes the physics body to be either static `true` or dynamic `false`.
      * @param value `true` to set the body as being static, or `false` to make it dynamic.
      */
    /* CompleteClass */
    override def setStatic(value: Boolean): GameObject = js.native
  }
  
  /**
    * The Matter World class is responsible for managing one single instance of a Matter Physics World for Phaser.
    * 
    * Access this via `this.matter.world` from within a Scene.
    * 
    * This class creates a Matter JS World Composite along with the Matter JS Engine during instantiation. It also
    * handles delta timing, bounds, body and constraint creation and debug drawing.
    * 
    * If you wish to access the Matter JS World object directly, see the `localWorld` property.
    * If you wish to access the Matter Engine directly, see the `engine` property.
    * 
    * This class is an Event Emitter and will proxy _all_ Matter JS events, as they are received.
    */
  @js.native
  class World protected ()
    extends typings.phaser.Phaser.Physics.Matter.World {
    /**
      * 
      * @param scene The Scene to which this Matter World instance belongs.
      * @param config The Matter World configuration object.
      */
    def this(scene: Scene, config: MatterWorldConfig) = this()
  }
  
  /**
    * A Matter Game Object is a generic object that allows you to combine any Phaser Game Object,
    * including those you have extended or created yourself, with all of the Matter Components.
    * 
    * This enables you to use component methods such as `setVelocity` or `isSensor` directly from
    * this Game Object.
    * @param world The Matter world to add the body to.
    * @param gameObject The Game Object that will have the Matter body applied to it.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject): GameObject = js.native
  def MatterGameObject(world: typings.phaser.Phaser.Physics.Matter.World, gameObject: GameObject, options: Body): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: Body,
    addToWorld: Boolean
  ): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: MatterBodyConfig
  ): GameObject = js.native
  def MatterGameObject(
    world: typings.phaser.Phaser.Physics.Matter.World,
    gameObject: GameObject,
    options: MatterBodyConfig,
    addToWorld: Boolean
  ): GameObject = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Matter Physics After Add Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the end of the process when a new Body
      * or Constraint has just been added to the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afteradd', listener)`.
      */
    val AFTER_ADD: js.Any = js.native
    /**
      * The Matter Physics After Remove Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the end of the process when a 
      * Body or Constraint was removed from the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afterremove', listener)`.
      */
    val AFTER_REMOVE: js.Any = js.native
    /**
      * The Matter Physics After Update Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated and all collision events have resolved.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('afterupdate', listener)`.
      */
    val AFTER_UPDATE: js.Any = js.native
    /**
      * The Matter Physics Before Add Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the start of the process when a new Body
      * or Constraint is being added to the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeadd', listener)`.
      */
    val BEFORE_ADD: js.Any = js.native
    /**
      * The Matter Physics Before Remove Event.
      * 
      * This event is dispatched by a Matter Physics World instance at the start of the process when a 
      * Body or Constraint is being removed from the world.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeremove', listener)`.
      */
    val BEFORE_REMOVE: js.Any = js.native
    /**
      * The Matter Physics Before Update Event.
      * 
      * This event is dispatched by a Matter Physics World instance right before all the collision processing takes place.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('beforeupdate', listener)`.
      */
    val BEFORE_UPDATE: js.Any = js.native
    /**
      * The Matter Physics Collision Active Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that are colliding in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionactive', listener)`.
      */
    val COLLISION_ACTIVE: js.Any = js.native
    /**
      * The Matter Physics Collision End Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that have finished colliding in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionend', listener)`.
      */
    val COLLISION_END: js.Any = js.native
    /**
      * The Matter Physics Collision Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance after the engine has updated.
      * It provides a list of all pairs that have started to collide in the current tick (if any).
      * 
      * Listen to it from a Scene using: `this.matter.world.on('collisionstart', listener)`.
      */
    val COLLISION_START: js.Any = js.native
    /**
      * The Matter Physics Drag Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * is actively dragging a body. It is emitted each time the pointer moves.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('drag', listener)`.
      */
    val DRAG: js.Any = js.native
    /**
      * The Matter Physics Drag End Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * stops dragging a body.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('dragend', listener)`.
      */
    val DRAG_END: js.Any = js.native
    /**
      * The Matter Physics Drag Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Pointer Constraint
      * starts dragging a body.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('dragstart', listener)`.
      */
    val DRAG_START: js.Any = js.native
    /**
      * The Matter Physics World Pause Event.
      * 
      * This event is dispatched by an Matter Physics World instance when it is paused.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('pause', listener)`.
      */
    val PAUSE: js.Any = js.native
    /**
      * The Matter Physics World Resume Event.
      * 
      * This event is dispatched by an Matter Physics World instance when it resumes from a paused state.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('resume', listener)`.
      */
    val RESUME: js.Any = js.native
    /**
      * The Matter Physics Sleep End Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Body stop sleeping.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('sleepend', listener)`.
      */
    val SLEEP_END: js.Any = js.native
    /**
      * The Matter Physics Sleep Start Event.
      * 
      * This event is dispatched by a Matter Physics World instance when a Body goes to sleep.
      * 
      * Listen to it from a Scene using: `this.matter.world.on('sleepstart', listener)`.
      */
    val SLEEP_START: js.Any = js.native
  }
  
  /**
    * Use PhysicsEditorParser.parseBody() to build a Matter body object, based on a physics data file
    * created and exported with PhysicsEditor (https://www.codeandweb.com/physicseditor).
    */
  @js.native
  object PhysicsEditorParser extends js.Object {
    /**
      * Parses a body element exported by PhysicsEditor.
      * @param x The horizontal world location of the body.
      * @param y The vertical world location of the body.
      * @param config The body configuration and fixture (child body) definitions, as exported by PhysicsEditor.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
    def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
    /**
      * Parses an element of the "fixtures" list exported by PhysicsEditor
      * @param fixtureConfig The fixture object to parse.
      */
    def parseFixture(fixtureConfig: js.Object): js.Array[BodyType] = js.native
    /**
      * Parses the "vertices" lists exported by PhysicsEditor.
      * @param vertexSets The vertex lists to parse.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseVertices(vertexSets: js.Array[_]): js.Array[BodyType] = js.native
    def parseVertices(vertexSets: js.Array[_], options: MatterBodyConfig): js.Array[BodyType] = js.native
  }
  
  /**
    * Creates a body using the supplied physics data, as provided by a JSON file.
    * 
    * The data file should be loaded as JSON:
    * 
    * ```javascript
    * preload ()
    * {
    *   this.load.json('ninjas', 'assets/ninjas.json);
    * }
    * 
    * create ()
    * {
    *   const ninjaShapes = this.cache.json.get('ninjas');
    * 
    *   this.matter.add.fromJSON(400, 300, ninjaShapes.shinobi);
    * }
    * ```
    * 
    * Do not pass the entire JSON file to this method, but instead pass one of the shapes contained within it.
    * 
    * If you pas in an `options` object, any settings in there will override those in the config object.
    * 
    * The structure of the JSON file is as follows:
    * 
    * ```text
    * {
    *   'generator_info': // The name of the application that created the JSON data
    *   'shapeName': {
    *     'type': // The type of body
    *     'label': // Optional body label
    *     'vertices': // An array, or an array of arrays, containing the vertex data in x/y object pairs
    *   }
    * }
    * ```
    * 
    * At the time of writing, only the Phaser Physics Tracer App exports in this format.
    */
  @js.native
  object PhysicsJSONParser extends js.Object {
    /**
      * Parses a body element from the given JSON data.
      * @param x The horizontal world location of the body.
      * @param y The vertical world location of the body.
      * @param config The body configuration data.
      * @param options An optional Body configuration object that is used to set initial Body properties on creation.
      */
    def parseBody(x: Double, y: Double, config: js.Object): BodyType = js.native
    def parseBody(x: Double, y: Double, config: js.Object, options: MatterBodyConfig): BodyType = js.native
  }
  
}

