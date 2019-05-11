package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs

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
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene.Systems this Matter Physics instance belongs to.
    */
  var sys: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * The Matter World which this Factory adds to.
    */
  var world: World = js.native
  /**
    * Creates a composite with simple car setup of bodies and constraints.
    * @param x [description]
    * @param y [description]
    * @param width [description]
    * @param height [description]
    * @param wheelSize [description]
    */
  def car(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    wheelSize: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
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
    composite: phaserLib.MatterJSNs.Composite,
    xOffsetA: scala.Double,
    yOffsetA: scala.Double,
    xOffsetB: scala.Double,
    yOffsetB: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * Creates a new rigid circular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param radius The radius of the circle.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    * @param maxSides The maximum amount of sides to use for the polygon which will approximate this circle.
    */
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double): phaserLib.MatterJSNs.Body = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double, options: js.Object): phaserLib.MatterJSNs.Body = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double, options: js.Object, maxSides: scala.Double): phaserLib.MatterJSNs.Body = js.native
  /**
    * [description]
    * @param bodyA [description]
    * @param bodyB [description]
    * @param length [description]
    * @param stiffness [description] Default 1.
    * @param options [description] Default {}.
    */
  def constraint(bodyA: phaserLib.MatterJSNs.Body, bodyB: phaserLib.MatterJSNs.Body, length: scala.Double): phaserLib.MatterJSNs.Constraint = js.native
  def constraint(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double
  ): phaserLib.MatterJSNs.Constraint = js.native
  def constraint(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Constraint = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices) and adds it to the World.
    * If the vertices are convex, they will pass through as supplied. Otherwise, if the vertices are concave, they will be decomposed. Note that this process is not guaranteed to support complex sets of vertices, e.g. ones with holes.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param vertexSets [description]
    * @param options [description]
    * @param flagInternal Flag internal edges (coincident part edges)
    * @param removeCollinear Whether Matter.js will discard collinear edges (to improve performance).
    * @param minimumArea During decomposition discard parts that have an area less than this
    */
  def fromVertices(
    x: scala.Double,
    y: scala.Double,
    vertexSets: js.Array[_],
    options: js.Object,
    flagInternal: scala.Boolean,
    removeCollinear: scala.Boolean,
    minimumArea: scala.Double
  ): phaserLib.MatterJSNs.Body = js.native
  /**
    * [description]
    * @param gameObject The Game Object to inject the Matter Body in to.
    * @param options [description]
    */
  def gameObject(gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject, options: js.Object): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options [description] Default {}.
    */
  def image(x: scala.Double, y: scala.Double, key: java.lang.String): Image = js.native
  def image(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): Image = js.native
  def image(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: java.lang.String,
    options: js.Object
  ): Image = js.native
  def image(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): Image = js.native
  def image(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: phaserLib.integer,
    options: js.Object
  ): Image = js.native
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
  def imageStack(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double
  ): phaserLib.MatterJSNs.Composite = js.native
  def imageStack(
    key: java.lang.String,
    frame: phaserLib.integer,
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * [description]
    * @param bodyA [description]
    * @param bodyB [description]
    * @param length [description]
    * @param stiffness [description] Default 1.
    * @param options [description] Default {}.
    */
  def joint(bodyA: phaserLib.MatterJSNs.Body, bodyB: phaserLib.MatterJSNs.Body, length: scala.Double): phaserLib.MatterJSNs.Constraint = js.native
  def joint(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double
  ): phaserLib.MatterJSNs.Constraint = js.native
  def joint(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Constraint = js.native
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @param composite [description]
    * @param columns [description]
    * @param rows [description]
    * @param crossBrace [description]
    * @param options [description]
    */
  def mesh(
    composite: phaserLib.MatterJSNs.Composite,
    columns: scala.Double,
    rows: scala.Double,
    crossBrace: scala.Boolean,
    options: js.Object
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * [description]
    * @param options [description]
    */
  def mouseSpring(options: js.Object): phaserLib.MatterJSNs.Constraint = js.native
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @param x [description]
    * @param y [description]
    * @param number [description]
    * @param size [description]
    * @param length [description]
    */
  def newtonsCradle(x: scala.Double, y: scala.Double, number: scala.Double, size: scala.Double, length: scala.Double): phaserLib.MatterJSNs.Composite = js.native
  /**
    * [description]
    * @param options [description]
    */
  def pointerConstraint(options: js.Object): phaserLib.MatterJSNs.Constraint = js.native
  /**
    * Creates a new rigid polygonal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param sides The number of sides the polygon will have.
    * @param radius The "radius" of the polygon, i.e. the distance from its center to any vertex. This is also the radius of its circumcircle.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def polygon(x: scala.Double, y: scala.Double, sides: scala.Double, radius: scala.Double, options: js.Object): phaserLib.MatterJSNs.Body = js.native
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
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    callback: js.Function
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * Creates a new rigid rectangular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the Body.
    * @param height The height of the Body.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def rectangle(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, options: js.Object): phaserLib.MatterJSNs.Body = js.native
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
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    crossBrace: scala.Boolean,
    particleRadius: scala.Double,
    particleOptions: js.Object,
    constraintOptions: js.Object
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * [description]
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options [description] Default {}.
    */
  def spring(bodyA: phaserLib.MatterJSNs.Body, bodyB: phaserLib.MatterJSNs.Body, length: scala.Double): phaserLib.MatterJSNs.Constraint = js.native
  def spring(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double
  ): phaserLib.MatterJSNs.Constraint = js.native
  def spring(
    bodyA: phaserLib.MatterJSNs.Body,
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Constraint = js.native
  /**
    * [description]
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options [description] Default {}.
    */
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): Sprite = js.native
  def sprite(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: java.lang.String,
    options: js.Object
  ): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): Sprite = js.native
  def sprite(
    x: scala.Double,
    y: scala.Double,
    key: java.lang.String,
    frame: phaserLib.integer,
    options: js.Object
  ): Sprite = js.native
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
    x: scala.Double,
    y: scala.Double,
    columns: scala.Double,
    rows: scala.Double,
    columnGap: scala.Double,
    rowGap: scala.Double,
    callback: js.Function
  ): phaserLib.MatterJSNs.Composite = js.native
  /**
    * [description]
    * @param tile [description]
    * @param options [description]
    */
  def tileBody(tile: phaserLib.PhaserNs.TilemapsNs.Tile, options: js.Object): TileBody = js.native
  /**
    * Creates a new rigid trapezoidal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the trapezoid of the Body.
    * @param height The height of the trapezoid of the Body.
    * @param slope The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    * @param options An object of properties to set on the Body. You can also specify a `chamfer` property to automatically adjust the body.
    */
  def trapezoid(
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    slope: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Body = js.native
  /**
    * [description]
    * @param bodyB [description]
    * @param length [description]
    * @param stiffness [description] Default 1.
    * @param options [description] Default {}.
    */
  def worldConstraint(bodyB: phaserLib.MatterJSNs.Body, length: scala.Double): phaserLib.MatterJSNs.Constraint = js.native
  def worldConstraint(bodyB: phaserLib.MatterJSNs.Body, length: scala.Double, stiffness: scala.Double): phaserLib.MatterJSNs.Constraint = js.native
  def worldConstraint(
    bodyB: phaserLib.MatterJSNs.Body,
    length: scala.Double,
    stiffness: scala.Double,
    options: js.Object
  ): phaserLib.MatterJSNs.Constraint = js.native
}

