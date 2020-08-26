package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.CompositeType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterConstraintConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Factory extends js.Object {
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
    * Creates a composite with simple car setup of bodies and constraints.
    * @param x The horizontal position of the car in the world.
    * @param y The vertical position of the car in the world.
    * @param width The width of the car chasis.
    * @param height The height of the car chasis.
    * @param wheelSize The radius of the car wheels.
    */
  def car(x: Double, y: Double, width: Double, height: Double, wheelSize: Double): CompositeType = js.native
  /**
    * Chains all bodies in the given composite together using constraints.
    * @param composite The composite in which all bodies will be chained together sequentially.
    * @param xOffsetA The horizontal offset of the BodyA constraint. This is a percentage based on the body size, not a world position.
    * @param yOffsetA The vertical offset of the BodyA constraint. This is a percentage based on the body size, not a world position.
    * @param xOffsetB The horizontal offset of the BodyB constraint. This is a percentage based on the body size, not a world position.
    * @param yOffsetB The vertical offset of the BodyB constraint. This is a percentage based on the body size, not a world position.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def chain(composite: CompositeType, xOffsetA: Double, yOffsetA: Double, xOffsetB: Double, yOffsetB: Double): CompositeType = js.native
  def chain(
    composite: CompositeType,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: MatterConstraintConfig
  ): CompositeType = js.native
  /**
    * Creates a new rigid circular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param radius The radius of the circle.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    * @param maxSides The maximum amount of sides to use for the polygon which will approximate this circle.
    */
  def circle(x: Double, y: Double, radius: Double): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: js.UndefOr[scala.Nothing], maxSides: Double): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: MatterBodyConfig): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: MatterBodyConfig, maxSides: Double): BodyType = js.native
  /**
    * Constraints (or joints) are used for specifying that a fixed distance must be maintained
    * between two bodies, or a body and a fixed world-space position.
    * 
    * The stiffness of constraints can be modified to create springs or elastic.
    * 
    * To simulate a revolute constraint (or pin joint) set `length: 0` and a high `stiffness`
    * value (e.g. `0.7` or above).
    * 
    * If the constraint is unstable, try lowering the `stiffness` value and / or increasing
    * `constraintIterations` within the Matter Config.
    * 
    * For compound bodies, constraints must be applied to the parent body and not one of its parts.
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def constraint(bodyA: BodyType, bodyB: BodyType): ConstraintType = js.native
  def constraint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def constraint(bodyA: BodyType, bodyB: BodyType, length: js.UndefOr[scala.Nothing], stiffness: Double): ConstraintType = js.native
  def constraint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def constraint(bodyA: BodyType, bodyB: BodyType, length: Double): ConstraintType = js.native
  def constraint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def constraint(bodyA: BodyType, bodyB: BodyType, length: Double, stiffness: Double): ConstraintType = js.native
  def constraint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  /**
    * Destroys this Factory.
    */
  def destroy(): Unit = js.native
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
    * @param x The X coordinate of the body.
    * @param y The Y coordinate of the body.
    * @param config The JSON physics data.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def fromJSON(x: Double, y: Double, config: js.Any): BodyType = js.native
  def fromJSON(x: Double, y: Double, config: js.Any, options: js.UndefOr[scala.Nothing], addToWorld: Boolean): BodyType = js.native
  def fromJSON(x: Double, y: Double, config: js.Any, options: MatterBodyConfig): BodyType = js.native
  def fromJSON(x: Double, y: Double, config: js.Any, options: MatterBodyConfig, addToWorld: Boolean): BodyType = js.native
  /**
    * Creates a body using data exported from the application PhysicsEditor (https://www.codeandweb.com/physicseditor)
    * 
    * The PhysicsEditor file should be loaded as JSON:
    * 
    * ```javascript
    * preload ()
    * {
    *   this.load.json('vehicles', 'assets/vehicles.json);
    * }
    * 
    * create ()
    * {
    *   const vehicleShapes = this.cache.json.get('vehicles');
    *   this.matter.add.fromPhysicsEditor(400, 300, vehicleShapes.truck);
    * }
    * ```
    * 
    * Do not pass the entire JSON file to this method, but instead pass one of the shapes contained within it.
    * 
    * If you pas in an `options` object, any settings in there will override those in the PhysicsEditor config object.
    * @param x The horizontal world location of the body.
    * @param y The vertical world location of the body.
    * @param config The JSON data exported from PhysicsEditor.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def fromPhysicsEditor(x: Double, y: Double, config: js.Any): BodyType = js.native
  def fromPhysicsEditor(x: Double, y: Double, config: js.Any, options: js.UndefOr[scala.Nothing], addToWorld: Boolean): BodyType = js.native
  def fromPhysicsEditor(x: Double, y: Double, config: js.Any, options: MatterBodyConfig): BodyType = js.native
  def fromPhysicsEditor(x: Double, y: Double, config: js.Any, options: MatterBodyConfig, addToWorld: Boolean): BodyType = js.native
  /**
    * Creates a body using the path data from an SVG file.
    * 
    * SVG Parsing requires the pathseg polyfill from https://github.com/progers/pathseg
    * 
    * The SVG file should be loaded as XML, as this method requires the ability to extract
    * the path data from it. I.e.:
    * 
    * ```javascript
    * preload ()
    * {
    *   this.load.xml('face', 'assets/face.svg);
    * }
    * 
    * create ()
    * {
    *   this.matter.add.fromSVG(400, 300, this.cache.xml.get('face'));
    * }
    * ```
    * @param x The X coordinate of the body.
    * @param y The Y coordinate of the body.
    * @param xml The SVG Path data.
    * @param scale Scale the vertices by this amount after creation. Default 1.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    * @param addToWorld Should the newly created body be immediately added to the World? Default true.
    */
  def fromSVG(x: Double, y: Double, xml: js.Object): BodyType = js.native
  def fromSVG(
    x: Double,
    y: Double,
    xml: js.Object,
    scale: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    addToWorld: Boolean
  ): BodyType = js.native
  def fromSVG(x: Double, y: Double, xml: js.Object, scale: js.UndefOr[scala.Nothing], options: MatterBodyConfig): BodyType = js.native
  def fromSVG(
    x: Double,
    y: Double,
    xml: js.Object,
    scale: js.UndefOr[scala.Nothing],
    options: MatterBodyConfig,
    addToWorld: Boolean
  ): BodyType = js.native
  def fromSVG(x: Double, y: Double, xml: js.Object, scale: Double): BodyType = js.native
  def fromSVG(
    x: Double,
    y: Double,
    xml: js.Object,
    scale: Double,
    options: js.UndefOr[scala.Nothing],
    addToWorld: Boolean
  ): BodyType = js.native
  def fromSVG(x: Double, y: Double, xml: js.Object, scale: Double, options: MatterBodyConfig): BodyType = js.native
  def fromSVG(
    x: Double,
    y: Double,
    xml: js.Object,
    scale: Double,
    options: MatterBodyConfig,
    addToWorld: Boolean
  ): BodyType = js.native
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices) and adds it to the World.
    * If the vertices are convex, they will pass through as supplied. Otherwise, if the vertices are concave, they will be decomposed. Note that this process is not guaranteed to support complex sets of vertices, e.g. ones with holes.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param vertexSets The vertices data. Either a path string or an array of vertices.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    * @param flagInternal Flag internal edges (coincident part edges) Default false.
    * @param removeCollinear Whether Matter.js will discard collinear edges (to improve performance). Default 0.01.
    * @param minimumArea During decomposition discard parts that have an area less than this. Default 10.
    */
  def fromVertices(x: Double, y: Double, vertexSets: String): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: String, options: MatterBodyConfig): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: String, options: MatterBodyConfig, flagInternal: Boolean): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: String,
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_]): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: js.UndefOr[scala.Nothing],
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_], options: MatterBodyConfig): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: js.UndefOr[scala.Nothing],
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[_], options: MatterBodyConfig, flagInternal: Boolean): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: js.UndefOr[scala.Nothing],
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[_],
    options: MatterBodyConfig,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  /**
    * Takes an existing Game Object and injects all of the Matter Components into it.
    * 
    * This enables you to use component methods such as `setVelocity` or `isSensor` directly from
    * this Game Object.
    * 
    * You can also pass in either a Matter Body Configuration object, or a Matter Body instance
    * to link with this Game Object.
    * @param gameObject The Game Object to inject the Matter Components in to.
    * @param options A Matter Body configuration object, or an instance of a Matter Body.
    * @param addToWorld Add this Matter Body to the World? Default true.
    */
  def gameObject(gameObject: GameObject): GameObject = js.native
  def gameObject(gameObject: GameObject, options: js.UndefOr[scala.Nothing], addToWorld: Boolean): GameObject = js.native
  def gameObject(gameObject: GameObject, options: Body): GameObject = js.native
  def gameObject(gameObject: GameObject, options: Body, addToWorld: Boolean): GameObject = js.native
  def gameObject(gameObject: GameObject, options: MatterBodyConfig): GameObject = js.native
  def gameObject(gameObject: GameObject, options: MatterBodyConfig, addToWorld: Boolean): GameObject = js.native
  /**
    * Creates a Matter Physics Image Game Object.
    * 
    * An Image is a light-weight Game Object useful for the display of static images in your game,
    * such as logos, backgrounds, scenery or other non-animated elements. Images can have input
    * events and physics bodies, or be tweened, tinted or scrolled. The main difference between an
    * Image and a Sprite is that you cannot animate an Image as they do not have the Animation component.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def image(x: Double, y: Double, key: String): Image = js.native
  def image(x: Double, y: Double, key: String, frame: js.UndefOr[scala.Nothing], options: MatterBodyConfig): Image = js.native
  def image(x: Double, y: Double, key: String, frame: String): Image = js.native
  def image(x: Double, y: Double, key: String, frame: String, options: MatterBodyConfig): Image = js.native
  def image(x: Double, y: Double, key: String, frame: integer): Image = js.native
  def image(x: Double, y: Double, key: String, frame: integer, options: MatterBodyConfig): Image = js.native
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
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def imageStack(key: String, frame: String, x: Double, y: Double, columns: Double, rows: Double): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: js.UndefOr[scala.Nothing],
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: Double
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: Double,
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(key: String, frame: String, x: Double, y: Double, columns: Double, rows: Double, columnGap: Double): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: js.UndefOr[scala.Nothing],
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: String,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(key: String, frame: integer, x: Double, y: Double, columns: Double, rows: Double): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: js.UndefOr[scala.Nothing],
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: Double
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: js.UndefOr[scala.Nothing],
    rowGap: Double,
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: js.UndefOr[scala.Nothing],
    options: MatterBodyConfig
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double
  ): CompositeType = js.native
  def imageStack(
    key: String,
    frame: integer,
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    options: MatterBodyConfig
  ): CompositeType = js.native
  /**
    * This method is an alias for `Factory.constraint`.
    * 
    * Constraints (or joints) are used for specifying that a fixed distance must be maintained
    * between two bodies, or a body and a fixed world-space position.
    * 
    * The stiffness of constraints can be modified to create springs or elastic.
    * 
    * To simulate a revolute constraint (or pin joint) set `length: 0` and a high `stiffness`
    * value (e.g. `0.7` or above).
    * 
    * If the constraint is unstable, try lowering the `stiffness` value and / or increasing
    * `constraintIterations` within the Matter Config.
    * 
    * For compound bodies, constraints must be applied to the parent body and not one of its parts.
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def joint(bodyA: BodyType, bodyB: BodyType): ConstraintType = js.native
  def joint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def joint(bodyA: BodyType, bodyB: BodyType, length: js.UndefOr[scala.Nothing], stiffness: Double): ConstraintType = js.native
  def joint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def joint(bodyA: BodyType, bodyB: BodyType, length: Double): ConstraintType = js.native
  def joint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def joint(bodyA: BodyType, bodyB: BodyType, length: Double, stiffness: Double): ConstraintType = js.native
  def joint(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @param composite The composite in which all bodies will be chained together.
    * @param columns The number of columns in the mesh.
    * @param rows The number of rows in the mesh.
    * @param crossBrace Create cross braces for the mesh as well?
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def mesh(composite: CompositeType, columns: Double, rows: Double, crossBrace: Boolean): CompositeType = js.native
  def mesh(
    composite: CompositeType,
    columns: Double,
    rows: Double,
    crossBrace: Boolean,
    options: MatterConstraintConfig
  ): CompositeType = js.native
  /**
    * This method is an alias for `Factory.pointerConstraint`.
    * 
    * A Pointer Constraint is a special type of constraint that allows you to click
    * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
    * and when one is pressed down it checks to see if that hit any part of any active
    * body in the world. If it did, and the body has input enabled, it will begin to
    * drag it until either released, or you stop it via the `stopDrag` method.
    * 
    * You can adjust the stiffness, length and other properties of the constraint via
    * the `options` object on creation.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def mouseSpring(): ConstraintType = js.native
  def mouseSpring(options: MatterConstraintConfig): ConstraintType = js.native
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @param x The horizontal position of the start of the cradle.
    * @param y The vertical position of the start of the cradle.
    * @param number The number of balls in the cradle.
    * @param size The radius of each ball in the cradle.
    * @param length The length of the 'string' the balls hang from.
    */
  def newtonsCradle(x: Double, y: Double, number: Double, size: Double, length: Double): CompositeType = js.native
  /**
    * A Pointer Constraint is a special type of constraint that allows you to click
    * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
    * and when one is pressed down it checks to see if that hit any part of any active
    * body in the world. If it did, and the body has input enabled, it will begin to
    * drag it until either released, or you stop it via the `stopDrag` method.
    * 
    * You can adjust the stiffness, length and other properties of the constraint via
    * the `options` object on creation.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def pointerConstraint(): ConstraintType = js.native
  def pointerConstraint(options: MatterConstraintConfig): ConstraintType = js.native
  /**
    * Creates a new rigid polygonal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param sides The number of sides the polygon will have.
    * @param radius The "radius" of the polygon, i.e. the distance from its center to any vertex. This is also the radius of its circumcircle.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def polygon(x: Double, y: Double, sides: Double, radius: Double): BodyType = js.native
  def polygon(x: Double, y: Double, sides: Double, radius: Double, options: MatterBodyConfig): BodyType = js.native
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
  ): CompositeType = js.native
  /**
    * Creates a new rigid rectangular Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the Body.
    * @param height The height of the Body.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def rectangle(x: Double, y: Double, width: Double, height: Double): BodyType = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: MatterBodyConfig): BodyType = js.native
  /**
    * Creates a simple soft body like object.
    * @param x The horizontal position of this composite in the world.
    * @param y The vertical position of this composite in the world.
    * @param columns The number of columns in the Composite.
    * @param rows The number of rows in the Composite.
    * @param columnGap The distance between each column.
    * @param rowGap The distance between each row.
    * @param crossBrace `true` to create cross braces between the bodies, or `false` to create just straight braces.
    * @param particleRadius The radius of this circlular composite.
    * @param particleOptions An optional Body configuration object that is used to set initial Body properties on creation.
    * @param constraintOptions An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def softBody(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double
  ): CompositeType = js.native
  def softBody(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: js.UndefOr[scala.Nothing],
    constraintOptions: MatterConstraintConfig
  ): CompositeType = js.native
  def softBody(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: MatterBodyConfig
  ): CompositeType = js.native
  def softBody(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: MatterBodyConfig,
    constraintOptions: MatterConstraintConfig
  ): CompositeType = js.native
  /**
    * This method is an alias for `Factory.constraint`.
    * 
    * Constraints (or joints) are used for specifying that a fixed distance must be maintained
    * between two bodies, or a body and a fixed world-space position.
    * 
    * The stiffness of constraints can be modified to create springs or elastic.
    * 
    * To simulate a revolute constraint (or pin joint) set `length: 0` and a high `stiffness`
    * value (e.g. `0.7` or above).
    * 
    * If the constraint is unstable, try lowering the `stiffness` value and / or increasing
    * `constraintIterations` within the Matter Config.
    * 
    * For compound bodies, constraints must be applied to the parent body and not one of its parts.
    * @param bodyA The first possible `Body` that this constraint is attached to.
    * @param bodyB The second possible `Body` that this constraint is attached to.
    * @param length A Number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def spring(bodyA: BodyType, bodyB: BodyType): ConstraintType = js.native
  def spring(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def spring(bodyA: BodyType, bodyB: BodyType, length: js.UndefOr[scala.Nothing], stiffness: Double): ConstraintType = js.native
  def spring(
    bodyA: BodyType,
    bodyB: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def spring(bodyA: BodyType, bodyB: BodyType, length: Double): ConstraintType = js.native
  def spring(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def spring(bodyA: BodyType, bodyB: BodyType, length: Double, stiffness: Double): ConstraintType = js.native
  def spring(
    bodyA: BodyType,
    bodyB: BodyType,
    length: Double,
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  /**
    * Creates a Matter Physics Sprite Game Object.
    * 
    * A Sprite Game Object is used for the display of both static and animated images in your game.
    * Sprites can have input events and physics bodies. They can also be tweened, tinted, scrolled
    * and animated.
    * 
    * The main difference between a Sprite and an Image Game Object is that you cannot animate Images.
    * As such, Sprites take a fraction longer to process and have a larger API footprint due to the Animation
    * Component. If you do not require animation then you can safely use Images to replace Sprites in all cases.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with. Set to `null` to skip this value.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def sprite(x: Double, y: Double, key: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: js.UndefOr[scala.Nothing], options: MatterBodyConfig): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: String): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: String, options: MatterBodyConfig): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer): Sprite = js.native
  def sprite(x: Double, y: Double, key: String, frame: integer, options: MatterBodyConfig): Sprite = js.native
  /**
    * Create a new composite containing bodies created in the callback in a grid arrangement.
    * 
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
  ): CompositeType = js.native
  /**
    * Creates a wrapper around a Tile that provides access to a corresponding Matter body. A tile can only
    * have one Matter body associated with it. You can either pass in an existing Matter body for
    * the tile or allow the constructor to create the corresponding body for you. If the Tile has a
    * collision group (defined in Tiled), those shapes will be used to create the body. If not, the
    * tile's rectangle bounding box will be used.
    * 
    * The corresponding body will be accessible on the Tile itself via Tile.physics.matterBody.
    * 
    * Note: not all Tiled collision shapes are supported. See
    * Phaser.Physics.Matter.TileBody#setFromTileCollision for more information.
    * @param tile The target tile that should have a Matter body.
    * @param options Options to be used when creating the Matter body.
    */
  def tileBody(tile: Tile): TileBody = js.native
  def tileBody(tile: Tile, options: MatterTileOptions): TileBody = js.native
  /**
    * Creates a new rigid trapezoidal Body and adds it to the World.
    * @param x The X coordinate of the center of the Body.
    * @param y The Y coordinate of the center of the Body.
    * @param width The width of the trapezoid Body.
    * @param height The height of the trapezoid Body.
    * @param slope The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    * @param options An optional Body configuration object that is used to set initial Body properties on creation.
    */
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double): BodyType = js.native
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double, options: MatterBodyConfig): BodyType = js.native
  /**
    * Constraints (or joints) are used for specifying that a fixed distance must be maintained
    * between two bodies, or a body and a fixed world-space position.
    * 
    * A world constraint has only one body, you should specify a `pointA` position in
    * the constraint options parameter to attach the constraint to the world.
    * 
    * The stiffness of constraints can be modified to create springs or elastic.
    * 
    * To simulate a revolute constraint (or pin joint) set `length: 0` and a high `stiffness`
    * value (e.g. `0.7` or above).
    * 
    * If the constraint is unstable, try lowering the `stiffness` value and / or increasing
    * `constraintIterations` within the Matter Config.
    * 
    * For compound bodies, constraints must be applied to the parent body and not one of its parts.
    * @param body The Matter `Body` that this constraint is attached to.
    * @param length A number that specifies the target resting length of the constraint. If not given it is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    * @param stiffness A Number that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`. A value of `1` means the constraint should be very stiff. A value of `0.2` means the constraint acts as a soft spring. Default 1.
    * @param options An optional Constraint configuration object that is used to set initial Constraint properties on creation.
    */
  def worldConstraint(body: BodyType): ConstraintType = js.native
  def worldConstraint(
    body: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def worldConstraint(body: BodyType, length: js.UndefOr[scala.Nothing], stiffness: Double): ConstraintType = js.native
  def worldConstraint(
    body: BodyType,
    length: js.UndefOr[scala.Nothing],
    stiffness: Double,
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def worldConstraint(body: BodyType, length: Double): ConstraintType = js.native
  def worldConstraint(
    body: BodyType,
    length: Double,
    stiffness: js.UndefOr[scala.Nothing],
    options: MatterConstraintConfig
  ): ConstraintType = js.native
  def worldConstraint(body: BodyType, length: Double, stiffness: Double): ConstraintType = js.native
  def worldConstraint(body: BodyType, length: Double, stiffness: Double, options: MatterConstraintConfig): ConstraintType = js.native
}

