package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.AxesFactory
import typings.phaser.MatterJS.BodiesFactory
import typings.phaser.MatterJS.BodyFactory
import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.BoundsFactory
import typings.phaser.MatterJS.Collision
import typings.phaser.MatterJS.CompositeFactory
import typings.phaser.MatterJS.CompositesFactory
import typings.phaser.MatterJS.ConstraintFactory
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.DetectorFactory
import typings.phaser.MatterJS.PairFactory
import typings.phaser.MatterJS.PairsFactory
import typings.phaser.MatterJS.QueryFactory
import typings.phaser.MatterJS.ResolverFactory
import typings.phaser.MatterJS.SvgFactory
import typings.phaser.MatterJS.VectorFactory
import typings.phaser.MatterJS.VerticesFactory
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Physics.Arcade.ArcadePhysicsCallback
import typings.phaser.Phaser.Types.Physics.Matter.MatterBody
import typings.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait MatterPhysics extends StObject {
  
  /**
    * An instance of the Matter Factory. This class provides lots of functions for creating a
    * wide variety of physics objects and adds them automatically to the Matter World.
    * 
    * You can use this class to cut-down on the amount of code required in your game, however,
    * use of the Factory is entirely optional and should be seen as a development aid. It's
    * perfectly possible to create and add components to the Matter world without using it.
    */
  var add: Factory = js.native
  
  /**
    * Aligns a Body, or Matter Game Object, against the given coordinates.
    * 
    * The alignment takes place using the body bounds, which take into consideration things
    * like body scale and rotation.
    * 
    * Although a Body has a `position` property, it is based on the center of mass for the body,
    * not a dimension based center. This makes aligning bodies difficult, especially if they have
    * rotated or scaled. This method will derive the correct position based on the body bounds and
    * its center of mass offset, in order to align the body with the given coordinate.
    * 
    * For example, if you wanted to align a body so it sat in the bottom-center of the
    * Scene, and the world was 800 x 600 in size:
    * 
    * ```javascript
    * this.matter.alignBody(body, 400, 600, Phaser.Display.Align.BOTTOM_CENTER);
    * ```
    * 
    * You pass in 400 for the x coordinate, because that is the center of the world, and 600 for
    * the y coordinate, as that is the base of the world.
    * @param body The Body to align.
    * @param x The horizontal position to align the body to.
    * @param y The vertical position to align the body to.
    * @param align One of the `Phaser.Display.Align` constants, such as `Phaser.Display.Align.TOP_LEFT`.
    */
  def alignBody(body: MatterBody, x: Double, y: Double, align: Double): this.type = js.native
  
  def applyForce(bodies: js.Array[MatterBody], force: Vector2Like): this.type = js.native
  /**
    * Applies a force to a body, at the bodies current position, including resulting torque.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForce(bodies: MatterBody, force: Vector2Like): this.type = js.native
  
  def applyForceFromAngle(bodies: js.Array[MatterBody], speed: Double): this.type = js.native
  def applyForceFromAngle(bodies: js.Array[MatterBody], speed: Double, angle: Double): this.type = js.native
  /**
    * Apply a force to a body based on the given angle and speed.
    * If no angle is given, the current body angle is used.
    * 
    * Use very small speed values, such as 0.1, depending on the mass and required velocity.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param speed A speed value to be applied to a directional force.
    * @param angle The angle, in radians, to apply the force from. Leave undefined to use the current body angle.
    */
  def applyForceFromAngle(bodies: MatterBody, speed: Double): this.type = js.native
  def applyForceFromAngle(bodies: MatterBody, speed: Double, angle: Double): this.type = js.native
  
  def applyForceFromPosition(bodies: js.Array[MatterBody], position: Vector2Like, speed: Double): this.type = js.native
  def applyForceFromPosition(bodies: js.Array[MatterBody], position: Vector2Like, speed: Double, angle: Double): this.type = js.native
  /**
    * Applies a force to a body, from the given world position, including resulting torque.
    * If no angle is given, the current body angle is used.
    * 
    * Use very small speed values, such as 0.1, depending on the mass and required velocity.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param position A Vector that specifies the world-space position to apply the force at.
    * @param speed A speed value to be applied to a directional force.
    * @param angle The angle, in radians, to apply the force from. Leave undefined to use the current body angle.
    */
  def applyForceFromPosition(bodies: MatterBody, position: Vector2Like, speed: Double): this.type = js.native
  def applyForceFromPosition(bodies: MatterBody, position: Vector2Like, speed: Double, angle: Double): this.type = js.native
  
  /**
    * A reference to the `Matter.Axes` module.
    * 
    * The `Matter.Axes` module contains methods for creating and manipulating sets of axes.
    */
  var axes: AxesFactory = js.native
  
  /**
    * A reference to the `Matter.Bodies` module.
    * 
    * The `Matter.Bodies` module contains factory methods for creating rigid bodies
    * with commonly used body configurations (such as rectangles, circles and other polygons).
    */
  var bodies: BodiesFactory = js.native
  
  /**
    * A reference to the `Matter.Body` module.
    * 
    * The `Matter.Body` module contains methods for creating and manipulating body models.
    * A `Matter.Body` is a rigid body that can be simulated by a `Matter.Engine`.
    * Factories for commonly used body configurations (such as rectangles, circles and other polygons) can be found in the `Bodies` module.
    */
  var body: BodyFactory = js.native
  
  /**
    * An instance of the Body Bounds class. This class contains functions used for getting the
    * world position from various points around the bounds of a physics body.
    */
  var bodyBounds: BodyBounds = js.native
  
  /**
    * A reference to the `Matter.Bounds` module.
    * 
    * The `Matter.Bounds` module contains methods for creating and manipulating axis-aligned bounding boxes (AABB).
    */
  var bounds: BoundsFactory = js.native
  
  /**
    * A reference to the `Matter.Collision` module.
    * 
    * The `Matter.Collision` module contains methods for detecting collisions between a given pair of bodies.
    * 
    * For efficient detection between a list of bodies, see `Matter.Detector` and `Matter.Query`.
    */
  var collision: Collision = js.native
  
  /**
    * A reference to the `Matter.Composite` module.
    * 
    * The `Matter.Composite` module contains methods for creating and manipulating composite bodies.
    * A composite body is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`, therefore composites form a tree structure.
    * It is important to use the functions in this module to modify composites, rather than directly modifying their properties.
    * Note that the `Matter.World` object is also a type of `Matter.Composite` and as such all composite methods here can also operate on a `Matter.World`.
    */
  var composite: CompositeFactory = js.native
  
  /**
    * A reference to the `Matter.Composites` module.
    * 
    * The `Matter.Composites` module contains factory methods for creating composite bodies
    * with commonly used configurations (such as stacks and chains).
    */
  var composites: CompositesFactory = js.native
  
  /**
    * The parsed Matter Configuration object.
    */
  var config: MatterWorldConfig = js.native
  
  /**
    * A reference to the `Matter.Constraint` module.
    * 
    * The `Matter.Constraint` module contains methods for creating and manipulating constraints.
    * Constraints are used for specifying that a fixed distance must be maintained between two bodies (or a body and a fixed world-space position).
    * The stiffness of constraints can be modified to create springs or elastic.
    */
  var constraint: ConstraintFactory = js.native
  
  def containsPoint(body: js.Array[MatterBody], x: Double, y: Double): Boolean = js.native
  /**
    * Checks if the vertices of the given body, or an array of bodies, contains the given point, or not.
    * 
    * You can pass in either a single body, or an array of bodies to be checked. This method will
    * return `true` if _any_ of the bodies in the array contain the point. See the `intersectPoint` method if you need
    * to get a list of intersecting bodies.
    * 
    * The point should be transformed into the Matter World coordinate system in advance. This happens by
    * default with Input Pointers, but if you wish to use points from another system you may need to
    * transform them before passing them.
    * @param body The body, or an array of bodies, to check against the point.
    * @param x The horizontal coordinate of the point.
    * @param y The vertical coordinate of the point.
    */
  def containsPoint(body: MatterBody, x: Double, y: Double): Boolean = js.native
  
  /**
    * A reference to the `Matter.Detector` module.
    * 
    * The `Matter.Detector` module contains methods for detecting collisions given a set of pairs.
    */
  var detector: DetectorFactory = js.native
  
  /**
    * Enables the Matter Attractors Plugin.
    * 
    * The attractors plugin that makes it easy to apply continual forces on bodies.
    * It's possible to simulate effects such as wind, gravity and magnetism.
    * 
    * https://github.com/liabru/matter-attractors
    * 
    * This method is called automatically if `plugins.attractors` is set in the Matter World Config.
    * However, you can also call it directly from within your game.
    */
  def enableAttractorPlugin(): this.type = js.native
  
  /**
    * Enables the Matter Collision Events Plugin.
    * 
    * Note that this plugin is enabled by default. So you should only ever need to call this
    * method if you have specifically disabled the plugin in your Matter World Config.
    * You can disable it by setting `plugins.collisionevents: false` in your Matter World Config.
    * 
    * This plugin triggers three new events on Matter.Body:
    * 
    * 1. `onCollide`
    * 2. `onCollideEnd`
    * 3. `onCollideActive`
    * 
    * These events correspond to the Matter.js events `collisionStart`, `collisionActive` and `collisionEnd`, respectively.
    * You can listen to these events via Matter.Events or they will also be emitted from the Matter World.
    * 
    * This plugin also extends Matter.Body with three convenience functions:
    * 
    * `Matter.Body.setOnCollide(callback)`
    * `Matter.Body.setOnCollideEnd(callback)`
    * `Matter.Body.setOnCollideActive(callback)`
    * 
    * You can register event callbacks by providing a function of type (pair: Matter.Pair) => void
    * 
    * https://github.com/dxu/matter-collision-events
    */
  def enableCollisionEventsPlugin(): this.type = js.native
  
  /**
    * Enables the Matter Wrap Plugin.
    * 
    * The coordinate wrapping plugin that automatically wraps the position of bodies such that they always stay
    * within the given bounds. Upon crossing a boundary the body will appear on the opposite side of the bounds,
    * while maintaining its velocity.
    * 
    * https://github.com/liabru/matter-wrap
    * 
    * This method is called automatically if `plugins.wrap` is set in the Matter World Config.
    * However, you can also call it directly from within your game.
    */
  def enableWrapPlugin(): this.type = js.native
  
  /**
    * This internal method is called when this class starts and retrieves the final Matter World Config.
    */
  def getConfig(): MatterWorldConfig = js.native
  
  /**
    * Returns the length of the given constraint, which is the distance between the two points.
    * @param constraint The constraint to get the length from.
    */
  def getConstraintLength(constraint: ConstraintType): Double = js.native
  
  /**
    * Takes an array and returns a new array made from all of the Matter Bodies found in the original array.
    * 
    * For example, passing in Matter Game Objects, such as a bunch of Matter Sprites, to this method, would
    * return an array containing all of their native Matter Body objects.
    * 
    * If the `bodies` argument is falsey, it will return all bodies in the world.
    * @param bodies An array of objects to extract the bodies from. If falsey, it will return all bodies in the world.
    */
  def getMatterBodies(): js.Array[BodyType] = js.native
  def getMatterBodies(bodies: js.Array[Any]): js.Array[BodyType] = js.native
  
  /**
    * Checks the given Matter Body to see if it intersects with any of the given bodies.
    * 
    * If no bodies are provided it will check against all bodies in the Matter World.
    * @param body The target body.
    * @param bodies An array of bodies to check the target body against. If not provided it will search all bodies in the world.
    */
  def intersectBody(body: MatterBody): js.Array[MatterBody] = js.native
  def intersectBody(body: MatterBody, bodies: js.Array[MatterBody]): js.Array[MatterBody] = js.native
  
  /**
    * Checks the given coordinates to see if any vertices of the given bodies contain it.
    * 
    * If no bodies are provided it will search all bodies in the Matter World, including within Composites.
    * 
    * The coordinates should be transformed into the Matter World coordinate system in advance. This happens by
    * default with Input Pointers, but if you wish to use coordinates from another system you may need to
    * transform them before passing them.
    * @param x The horizontal coordinate of the point.
    * @param y The vertical coordinate of the point.
    * @param bodies An array of bodies to check. If not provided it will search all bodies in the world.
    */
  def intersectPoint(x: Double, y: Double): js.Array[MatterBody] = js.native
  def intersectPoint(x: Double, y: Double, bodies: js.Array[MatterBody]): js.Array[MatterBody] = js.native
  
  /**
    * Checks the given ray segment to see if any vertices of the given bodies intersect with it.
    * 
    * If no bodies are provided it will search all bodies in the Matter World.
    * 
    * The width of the ray can be specified via the `rayWidth` parameter.
    * @param x1 The horizontal coordinate of the start of the ray segment.
    * @param y1 The vertical coordinate of the start of the ray segment.
    * @param x2 The horizontal coordinate of the end of the ray segment.
    * @param y2 The vertical coordinate of the end of the ray segment.
    * @param rayWidth The width of the ray segment. Default 1.
    * @param bodies An array of bodies to check. If not provided it will search all bodies in the world.
    */
  def intersectRay(x1: Double, y1: Double, x2: Double, y2: Double): js.Array[MatterBody] = js.native
  def intersectRay(x1: Double, y1: Double, x2: Double, y2: Double, rayWidth: Double): js.Array[MatterBody] = js.native
  def intersectRay(x1: Double, y1: Double, x2: Double, y2: Double, rayWidth: Double, bodies: js.Array[MatterBody]): js.Array[MatterBody] = js.native
  def intersectRay(x1: Double, y1: Double, x2: Double, y2: Double, rayWidth: Unit, bodies: js.Array[MatterBody]): js.Array[MatterBody] = js.native
  
  /**
    * Checks the given rectangular area to see if any vertices of the given bodies intersect with it.
    * Or, if the `outside` parameter is set to `true`, it checks to see which bodies do not
    * intersect with it.
    * 
    * If no bodies are provided it will search all bodies in the Matter World, including within Composites.
    * @param x The horizontal coordinate of the top-left of the area.
    * @param y The vertical coordinate of the top-left of the area.
    * @param width The width of the area.
    * @param height The height of the area.
    * @param outside If `false` it checks for vertices inside the area, if `true` it checks for vertices outside the area. Default false.
    * @param bodies An array of bodies to check. If not provided it will search all bodies in the world.
    */
  def intersectRect(x: Double, y: Double, width: Double, height: Double): js.Array[MatterBody] = js.native
  def intersectRect(x: Double, y: Double, width: Double, height: Double, outside: Boolean): js.Array[MatterBody] = js.native
  def intersectRect(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    outside: Boolean,
    bodies: js.Array[MatterBody]
  ): js.Array[MatterBody] = js.native
  def intersectRect(x: Double, y: Double, width: Double, height: Double, outside: Unit, bodies: js.Array[MatterBody]): js.Array[MatterBody] = js.native
  
  def overlap(target: js.Array[MatterBody]): Boolean = js.native
  def overlap(target: js.Array[MatterBody], bodies: js.Array[MatterBody]): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(target: js.Array[MatterBody], bodies: js.Array[MatterBody], overlapCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: Unit,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(target: js.Array[MatterBody], bodies: Unit, overlapCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: js.Array[MatterBody],
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  /**
    * Checks to see if the target body, or an array of target bodies, intersects with any of the given bodies.
    * 
    * If intersection occurs this method will return `true` and, if provided, invoke the callbacks.
    * 
    * If no bodies are provided for the second parameter the target will check again all bodies in the Matter World.
    * 
    * Note that bodies can only overlap if they are in non-colliding collision groups or categories.
    * 
    * If you provide a `processCallback` then the two bodies that overlap are sent to it. This callback
    * must return a boolean and is used to allow you to perform additional processing tests before a final
    * outcome is decided. If it returns `true` then the bodies are finally passed to the `overlapCallback`, if set.
    * 
    * If you provide an `overlapCallback` then the matching pairs of overlapping bodies will be sent to it.
    * 
    * Both callbacks have the following signature: `function (bodyA, bodyB, collisionInfo)` where `bodyA` is always
    * the target body. The `collisionInfo` object contains additional data, such as the angle and depth of penetration.
    * @param target The target body, or array of target bodies, to check.
    * @param bodies The second body, or array of bodies, to check. If falsey it will check against all bodies in the world.
    * @param overlapCallback An optional callback function that is called if the bodies overlap.
    * @param processCallback An optional callback function that lets you perform additional checks against the two bodies if they overlap. If this is set then `overlapCallback` will only be invoked if this callback returns `true`.
    * @param callbackContext The context, or scope, in which to run the callbacks.
    */
  def overlap(target: MatterBody): Boolean = js.native
  def overlap(target: MatterBody, bodies: js.Array[MatterBody]): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(target: MatterBody, bodies: js.Array[MatterBody], overlapCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: js.Array[MatterBody],
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: Unit,
    overlapCallback: Unit,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(target: MatterBody, bodies: Unit, overlapCallback: Unit, processCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: Unit,
    overlapCallback: Unit,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(target: MatterBody, bodies: Unit, overlapCallback: ArcadePhysicsCallback): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: Unit,
    callbackContext: Any
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback
  ): Boolean = js.native
  def overlap(
    target: MatterBody,
    bodies: Unit,
    overlapCallback: ArcadePhysicsCallback,
    processCallback: ArcadePhysicsCallback,
    callbackContext: Any
  ): Boolean = js.native
  
  /**
    * A reference to the `Matter.Pair` module.
    * 
    * The `Matter.Pair` module contains methods for creating and manipulating collision pairs.
    */
  var pair: PairFactory = js.native
  
  /**
    * A reference to the `Matter.Pairs` module.
    * 
    * The `Matter.Pairs` module contains methods for creating and manipulating collision pair sets.
    */
  var pairs: PairsFactory = js.native
  
  /**
    * Pauses the Matter World instance and sets `enabled` to `false`.
    * 
    * A paused world will not run any simulations for the duration it is paused.
    */
  def pause(): World = js.native
  
  /**
    * A reference to the `Matter.Query` module.
    * 
    * The `Matter.Query` module contains methods for performing collision queries.
    */
  var query: QueryFactory = js.native
  
  /**
    * A reference to the `Matter.Resolver` module.
    * 
    * The `Matter.Resolver` module contains methods for resolving collision pairs.
    */
  var resolver: ResolverFactory = js.native
  
  /**
    * Resumes this Matter World instance from a paused state and sets `enabled` to `true`.
    */
  def resume(): World = js.native
  
  /**
    * The Phaser Scene that owns this Matter Physics instance
    */
  var scene: Scene = js.native
  
  /**
    * Sets the Matter Engine to run at fixed timestep of 30Hz and enables `autoUpdate`.
    * If you have set a custom `getDelta` function then this will override it.
    */
  def set30Hz(): this.type = js.native
  
  /**
    * Sets the Matter Engine to run at fixed timestep of 60Hz and enables `autoUpdate`.
    * If you have set a custom `getDelta` function then this will override it.
    */
  def set60Hz(): this.type = js.native
  
  def setAngularVelocity(bodies: js.Array[MatterBody], value: Double): this.type = js.native
  /**
    * Sets the angular velocity of the bodies instantly.
    * Position, angle, force etc. are unchanged.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param value The angular velocity.
    */
  def setAngularVelocity(bodies: MatterBody, value: Double): this.type = js.native
  
  def setCollidesWith(bodies: js.Array[MatterBody], categories: js.Array[Double]): this.type = js.native
  /**
    * Sets the collision filter mask of all given Matter Bodies to the given value.
    * 
    * Two Matter Bodies with different collision groups will only collide if each one includes the others
    * category in its mask based on a bitwise AND operation: `(categoryA & maskB) !== 0` and
    * `(categoryB & maskA) !== 0` are both true.
    * @param bodies An array of bodies to update. If falsey it will use all bodies in the world.
    * @param categories A unique category bitfield, or an array of them.
    */
  def setCollidesWith(bodies: js.Array[MatterBody], categories: Double): this.type = js.native
  
  /**
    * Sets the collision filter category of all given Matter Bodies to the given value.
    * 
    * This number must be a power of two between 2^0 (= 1) and 2^31.
    * 
    * Bodies with different collision groups (see {@link #setCollisionGroup}) will only collide if their collision
    * categories are included in their collision masks (see {@link #setCollidesWith}).
    * @param bodies An array of bodies to update. If falsey it will use all bodies in the world.
    * @param value Unique category bitfield.
    */
  def setCollisionCategory(bodies: js.Array[MatterBody], value: Double): this.type = js.native
  
  /**
    * Sets the collision filter group of all given Matter Bodies to the given value.
    * 
    * If the group value is zero, or if two Matter Bodies have different group values,
    * they will collide according to the usual collision filter rules (see {@link #setCollisionCategory} and {@link #setCollisionGroup}).
    * 
    * If two Matter Bodies have the same positive group value, they will always collide;
    * if they have the same negative group value they will never collide.
    * @param bodies An array of bodies to update. If falsey it will use all bodies in the world.
    * @param value Unique group index.
    */
  def setCollisionGroup(bodies: js.Array[MatterBody], value: Double): this.type = js.native
  
  def setVelocity(bodies: js.Array[MatterBody], x: Double, y: Double): this.type = js.native
  /**
    * Sets both the horizontal and vertical linear velocity of the physics bodies.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param x The horizontal linear velocity value.
    * @param y The vertical linear velocity value.
    */
  def setVelocity(bodies: MatterBody, x: Double, y: Double): this.type = js.native
  
  def setVelocityX(bodies: js.Array[MatterBody], x: Double): this.type = js.native
  /**
    * Sets just the horizontal linear velocity of the physics bodies.
    * The vertical velocity of the body is unchanged.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param x The horizontal linear velocity value.
    */
  def setVelocityX(bodies: MatterBody, x: Double): this.type = js.native
  
  def setVelocityY(bodies: js.Array[MatterBody], y: Double): this.type = js.native
  /**
    * Sets just the vertical linear velocity of the physics bodies.
    * The horizontal velocity of the body is unchanged.
    * @param bodies Either a single Body, or an array of bodies to update. If falsey it will use all bodies in the world.
    * @param y The vertical linear velocity value.
    */
  def setVelocityY(bodies: MatterBody, y: Double): this.type = js.native
  
  /**
    * Manually advances the physics simulation by one iteration.
    * 
    * You can optionally pass in the `delta` and `correction` values to be used by Engine.update.
    * If undefined they use the Matter defaults of 60Hz and no correction.
    * 
    * Calling `step` directly bypasses any checks of `enabled` or `autoUpdate`.
    * 
    * It also ignores any custom `getDelta` functions, as you should be passing the delta
    * value in to this call.
    * 
    * You can adjust the number of iterations that Engine.update performs internally.
    * Use the Scene Matter Physics config object to set the following properties:
    * 
    * positionIterations (defaults to 6)
    * velocityIterations (defaults to 4)
    * constraintIterations (defaults to 2)
    * 
    * Adjusting these values can help performance in certain situations, depending on the physics requirements
    * of your game.
    * @param delta The delta value. Default 16.666.
    * @param correction Optional delta correction value. Default 1.
    */
  def step(): Unit = js.native
  def step(delta: Double): Unit = js.native
  def step(delta: Double, correction: Double): Unit = js.native
  def step(delta: Unit, correction: Double): Unit = js.native
  
  /**
    * A reference to the `Matter.Svg` module.
    * 
    * The `Matter.Svg` module contains methods for converting SVG images into an array of vector points.
    * 
    * To use this module you also need the SVGPathSeg polyfill: https://github.com/progers/pathseg
    */
  var svg: SvgFactory = js.native
  
  /**
    * A reference to the Scene Systems that belong to the Scene owning this Matter Physics instance.
    */
  var systems: Systems = js.native
  
  /**
    * A reference to the `Matter.Vector` module.
    * 
    * The `Matter.Vector` module contains methods for creating and manipulating vectors.
    * Vectors are the basis of all the geometry related operations in the engine.
    * A `Matter.Vector` object is of the form `{ x: 0, y: 0 }`.
    */
  var vector: VectorFactory = js.native
  
  /**
    * A reference to the `Matter.Vertices` module.
    * 
    * The `Matter.Vertices` module contains methods for creating and manipulating sets of vertices.
    * A set of vertices is an array of `Matter.Vector` with additional indexing properties inserted by `Vertices.create`.
    * A `Matter.Body` maintains a set of vertices to represent the shape of the object (its convex hull).
    */
  var vertices: VerticesFactory = js.native
  
  /**
    * A reference to the `Matter.Vertices` module.
    * 
    * The `Matter.Vertices` module contains methods for creating and manipulating sets of vertices.
    * A set of vertices is an array of `Matter.Vector` with additional indexing properties inserted by `Vertices.create`.
    * A `Matter.Body` maintains a set of vertices to represent the shape of the object (its convex hull).
    */
  var verts: VerticesFactory = js.native
  
  /**
    * An instance of the Matter World class. This class is responsible for the updating of the
    * Matter Physics world, as well as handling debug drawing functions.
    */
  var world: World = js.native
}
