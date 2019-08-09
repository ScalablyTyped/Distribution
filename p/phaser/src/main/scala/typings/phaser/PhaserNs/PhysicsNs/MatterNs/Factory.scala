package typings.phaser.PhaserNs.PhysicsNs.MatterNs

import typings.phaser.MatterJSNs.Body
import typings.phaser.MatterJSNs.Composite
import typings.phaser.MatterJSNs.Constraint
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.ScenesNs.Systems
import typings.phaser.PhaserNs.TilemapsNs.Tile
import typings.phaser.PhaserNs.TypesNs.MathNs.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Matter Factory can create different types of bodies and them to a physics world.
  */
@JSGlobal("Phaser.Physics.Matter.Factory")
@js.native
class Factory protected () extends js.Object {
  /**
    * 
    * @param world The Matter World which this Factory adds to.
    */
  def this(world: World) = this()
  /**
    * The Scene which this Factory's Matter World belongs to.
    */
  var scene: Scene = js.native
  /**
    * A reference to the Scene.Systems this Matter Physics instance belongs to.
    */
  var sys: Systems = js.native
  /**
    * The Matter World which this Factory adds to.
    */
  var world: World = js.native
  /**
    * Instantly sets the angular velocity of the given body. Position, angle, force etc. are unchanged.
    * 
    * See also `force`.
    * @param body The Matter Body to set the velocity on.
    * @param velocity The angular velocity to set.
    */
  def angularVelocity(body: Body, velocity: Double): Body = js.native
  /**
    * Creates a composite with simple car setup of bodies and constraints.
    * @param x [description]
    * @param y [description]
    * @param width [description]
    * @param height [description]
    * @param wheelSize [description]
    */
  def car(x: Double, y: Double, width: Double, height: Double, wheelSize: Double): Composite = js.native
  /**
    * Chains all bodies in the given composite together using constraints.
    * @param composite [description]
    * @param xOffsetA [description]
    * @param yOffsetA [description]
    * @param xOffsetB [description]
    * @param yOffsetB [description]
    * @param options [description]
    */
  def chain(
    composite: Composite,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: js.Object
  ): Composite = js.native
  /**
    * Creates a new rigid circular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param radius The radius of the circle.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    * @param maxSides The maximum amount of sides to use for the polygon which will approximate this circle.
    */
  def circle(x: Double, y: Double, radius: Double): Body = js.native
  def circle(x: Double, y: Double, radius: Double, options: js.Object): Body = js.native
  def circle(x: Double, y: Double, radius: Double, options: js.Object, maxSides: Double): Body = js.native
  /**
    * [description]
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options [description] Default {}.
    */
  def constraint(bodyA: Body, bodyB: Body): Constraint = js.native
  def constraint(bodyA: Body, bodyB: Body, length: Double): Constraint = js.native
  def constraint(bodyA: Body, bodyB: Body, length: Double, stiffness: Double): Constraint = js.native
  def constraint(bodyA: Body, bodyB: Body, length: Double, stiffness: Double, options: js.Object): Constraint = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): Unit = js.native
  /**
    * Applies a force to a body from a given world-space position, including resulting torque.
    * @param body The Matter Body to set the force on.
    * @param position The world position to apply the force from. An object with public `x` and `y` components.
    * @param force The force to set. An object with public `x` and `y` components.
    */
  def force(body: Body, position: Vector2Like, force: Vector2Like): Body = js.native
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices) and adds it to the World.
    * If the vertices are convex, they will pass through as supplied. Otherwise, if the vertices are concave, they will be decomposed. Note that this process is not guaranteed to support complex sets of vertices, e.g. ones with holes.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param vertexSets [description]
    * @param options [description]
    * @param flagInternal Flag internal edges (coincident part edges) Default false.
    * @param removeCollinear Whether Matter.js will discard collinear edges (to improve performance). Default 0.01.
    * @param minimumArea During decomposition discard parts that have an area less than this. Default 10.
    */
  def fromVertices(x: Double, y: Double, vertexSets: String): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: String, options: js.Object): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: String, options: js.Object, flagInternal: Boolean): Body = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.Object,
    flagInternal: Boolean,
    removeCollinear: Double
  ): Body = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.Object,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_]): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_], options: js.Object): Body = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_], options: js.Object, flagInternal: Boolean): Body = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.Object,
    flagInternal: Boolean,
    removeCollinear: Double
  ): Body = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.Object,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): Body = js.native
  /**
    * [description]
    * @param gameObject The Game Object to inject the Matter Body in to.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    */
  def gameObject(gameObject: GameObject, options: js.Object): GameObject = js.native
  def gameObject(gameObject: GameObject, options: Body): GameObject = js.native
  /**
    * [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options [description] Default {}.
    */
  def image(x: Double, y: Double, key: String): Image = js.native
  def image(x: Double, y: Double, key: String, frame: String): Image = js.native
  def image(x: Double, y: Double, key: String, frame: String, options: js.Object): Image = js.native
  def image(x: Double, y: Double, key: String, frame: integer): Image = js.native
  def image(x: Double, y: Double, key: String, frame: integer, options: js.Object): Image = js.native
  /**
    * Create a new composite containing Matter Image objects created in a grid arrangement.
    * This function uses the body bounds to prevent overlaps.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param x The horizontal position of this composite in the world.
    * @param y The vertical position of this composite in the world.
    * @param columns The number of columns in the grid.
    * @param rows The number of rows in the grid.
    * @param columnGap The distance between each column. Default 0.
    * @param rowGap The distance between each row. Default 0.
    * @param options [description]
    */
  def imageStack(key: String, frame: String, x: Double, y: Double, columns: Double, rows: Double): Composite = js.native
  def imageStack(key: String, frame: String, x: Double, y: Double, columns: Double, rows: Double, columnGap: Double): Composite = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double
  ): Composite = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    options: js.Object
  ): Composite = js.native
  def imageStack(key: String, frame: integer, x: Double, y: Double, columns: Double, rows: Double): Composite = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double
  ): Composite = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double
  ): Composite = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    options: js.Object
  ): Composite = js.native
  /**
    * [description]
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options [description] Default {}.
    */
  def joint(bodyA: Body, bodyB: Body): Constraint = js.native
  def joint(bodyA: Body, bodyB: Body, length: Double): Constraint = js.native
  def joint(bodyA: Body, bodyB: Body, length: Double, stiffness: Double): Constraint = js.native
  def joint(bodyA: Body, bodyB: Body, length: Double, stiffness: Double, options: js.Object): Constraint = js.native
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @param composite [description]
    * @param columns [description]
    * @param rows [description]
    * @param crossBrace [description]
    * @param options [description]
    */
  def mesh(composite: Composite, columns: Double, rows: Double, crossBrace: Boolean, options: js.Object): Composite = js.native
  /**
    * [description]
    * @param options [description]
    */
  def mouseSpring(options: js.Object): Constraint = js.native
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @param x [description]
    * @param y [description]
    * @param number [description]
    * @param size [description]
    * @param length [description]
    */
  def newtonsCradle(x: Double, y: Double, number: Double, size: Double, length: Double): Composite = js.native
  /**
    * [description]
    * @param options [description]
    */
  def pointerConstraint(options: js.Object): Constraint = js.native
  /**
    * Creates a new rigid polygonal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param sides The number of sides the polygon will have.
    * @param radius The "radius" of the polygon, i.e. the distance from its center to any vertex. This is also the radius of its circumcircle.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def polygon(x: Double, y: Double, sides: Double, radius: Double, options: js.Object): Body = js.native
  /**
    * Create a new composite containing bodies created in the callback in a pyramid arrangement.
    * This function uses the body bounds to prevent overlaps.
    * @param x The horizontal position of this composite in the world.
    * @param y The vertical position of this composite in the world.
    * @param columns The number of columns in the pyramid.
    * @param rows The number of rows in the pyramid.
    * @param columnGap The distance between each column.
    * @param rowGap The distance between each row.
    * @param callback The callback function to be invoked.
    */
  def pyramid(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = js.native
  /**
    * Creates a new rigid rectangular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the Body.
    * @param height The height of the Body.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: js.Object): Body = js.native
  /**
    * Creates a simple soft body like object.
    * @param x The horizontal position of this composite in the world.
    * @param y The vertical position of this composite in the world.
    * @param columns The number of columns in the Composite.
    * @param rows The number of rows in the Composite.
    * @param columnGap The distance between each column.
    * @param rowGap The distance between each row.
    * @param crossBrace [description]
    * @param particleRadius The radius of this circlular composite.
    * @param particleOptions [description]
    * @param constraintOptions [description]
    */
  def softBody(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: js.Object,
    constraintOptions: js.Object
  ): Composite = js.native
  /**
    * [description]
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options [description] Default {}.
    */
  def spring(bodyA: Body, bodyB: Body): Constraint = js.native
  def spring(bodyA: Body, bodyB: Body, length: Double): Constraint = js.native
  def spring(bodyA: Body, bodyB: Body, length: Double, stiffness: Double): Constraint = js.native
  def spring(bodyA: Body, bodyB: Body, length: Double, stiffness: Double, options: js.Object): Constraint = js.native
  /**
    * [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options [description] Default {}.
    */
  def sprite(x: Double, y: Double, key: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: String, options: js.Object): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer, options: js.Object): Sprite = js.native
  /**
    * Create a new composite containing bodies created in the callback in a grid arrangement.
    * This function uses the body bounds to prevent overlaps.
    * @param x The horizontal position of this composite in the world.
    * @param y The vertical position of this composite in the world.
    * @param columns The number of columns in the grid.
    * @param rows The number of rows in the grid.
    * @param columnGap The distance between each column.
    * @param rowGap The distance between each row.
    * @param callback The callback that creates the stack.
    */
  def stack(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): Composite = js.native
  /**
    * [description]
    * @param tile [description]
    * @param options [description]
    */
  def tileBody(tile: Tile, options: js.Object): TileBody = js.native
  /**
    * Creates a new rigid trapezoidal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the trapezoid of the Body.
    * @param height The height of the trapezoid of the Body.
    * @param slope The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double, options: js.Object): Body = js.native
  /**
    * Instantly sets the linear velocity of the given body. Position, angle, force etc. are unchanged.
    * 
    * See also `force`.
    * @param body The Matter Body to set the velocity on.
    * @param velocity The velocity to set. An object with public `x` and `y` components.
    */
  def velocity(body: Body, velocity: Vector2Like): Body = js.native
  /**
    * [description]
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options [description] Default {}.
    */
  def worldConstraint(bodyB: Body): Constraint = js.native
  def worldConstraint(bodyB: Body, length: Double): Constraint = js.native
  def worldConstraint(bodyB: Body, length: Double, stiffness: Double): Constraint = js.native
  def worldConstraint(bodyB: Body, length: Double, stiffness: Double, options: js.Object): Constraint = js.native
}

