package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.Body
import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.CompositeType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.MatterJS.Engine
import typings.phaser.MatterJS.Grid
import typings.phaser.MatterJS.Pair
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Tilemaps.TilemapLayer
import typings.phaser.Phaser.Types.Physics.Matter.MatterDebugConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterRunnerConfig
import typings.phaser.Phaser.Types.Physics.Matter.MatterWalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait World
  extends StObject
     with EventEmitter {
  
  def add(`object`: js.Array[js.Object]): this.type = js.native
  /**
    * Adds a Matter JS object, or array of objects, to the world.
    * 
    * The objects should be valid Matter JS entities, such as a Body, Composite or Constraint.
    * 
    * Triggers `beforeAdd` and `afterAdd` events.
    * @param object Can be single object, or an array, and can be a body, composite or constraint.
    */
  def add(`object`: js.Object): this.type = js.native
  
  /**
    * Automatically call Engine.update every time the game steps.
    * If you disable this then you are responsible for calling `World.step` directly from your game.
    * If you call `set60Hz` or `set30Hz` then `autoUpdate` is reset to `true`.
    */
  var autoUpdate: Boolean = js.native
  
  /**
    * Adds `MatterTileBody` instances for all the colliding tiles within the given tilemap layer.
    * 
    * Set the appropriate tiles in your layer to collide before calling this method!
    * @param tilemapLayer An array of tiles.
    * @param options Options to be passed to the MatterTileBody constructor. {@see Phaser.Physics.Matter.TileBody}
    */
  def convertTilemapLayer(tilemapLayer: TilemapLayer): this.type = js.native
  def convertTilemapLayer(tilemapLayer: TilemapLayer, options: js.Object): this.type = js.native
  
  /**
    * Adds `MatterTileBody` instances for the given tiles. This adds bodies regardless of whether the
    * tiles are set to collide or not.
    * @param tiles An array of tiles.
    * @param options Options to be passed to the MatterTileBody constructor. {@see Phaser.Physics.Matter.TileBody}
    */
  def convertTiles(tiles: js.Array[Tile]): this.type = js.native
  def convertTiles(tiles: js.Array[Tile], options: js.Object): this.type = js.native
  
  /**
    * Creates a rectangle Matter body and adds it to the world.
    * @param x The horizontal position of the body in the world.
    * @param y The vertical position of the body in the world.
    * @param width The width of the body.
    * @param height The height of the body.
    * @param options Optional Matter configuration object.
    */
  def create(x: Double, y: Double, width: Double, height: Double, options: js.Object): BodyType = js.native
  
  /**
    * Creates a Phaser.GameObjects.Graphics object that is used to render all of the debug bodies and joints to.
    * 
    * This method is called automatically by the constructor, if debugging has been enabled.
    * 
    * The created Graphics object is automatically added to the Scene at 0x0 and given a depth of `Number.MAX_VALUE`,
    * so it renders above all else in the Scene.
    * 
    * The Graphics object is assigned to the `debugGraphic` property of this class and `drawDebug` is enabled.
    */
  def createDebugGraphic(): Graphics = js.native
  
  /**
    * The debug configuration object.
    * 
    * The values stored in this object are read from the Matter World Config `debug` property.
    * 
    * When a new Body or Constraint is _added to the World_, they are given the values stored in this object,
    * unless they have their own `render` object set that will override them.
    * 
    * Note that while you can modify the values of properties in this object at run-time, it will not change
    * any of the Matter objects _already added_. It will only impact objects newly added to the world, or one
    * that is removed and then re-added at a later time.
    */
  var debugConfig: MatterDebugConfig = js.native
  
  /**
    * An instance of the Graphics object the debug bodies are drawn to, if enabled.
    */
  var debugGraphic: Graphics = js.native
  
  /**
    * Sets the world gravity and gravity scale to 0.
    */
  def disableGravity(): this.type = js.native
  
  /**
    * A flag that controls if the debug graphics will be drawn to or not.
    */
  var drawDebug: Boolean = js.native
  
  /**
    * A flag that toggles if the world is enabled or not.
    */
  var enabled: Boolean = js.native
  
  /**
    * An instance of the MatterJS Engine.
    */
  var engine: Engine = js.native
  
  /**
    * Returns all the bodies in the Matter World, including all bodies in children, recursively.
    */
  def getAllBodies(): js.Array[BodyType] = js.native
  
  /**
    * Returns all the composites in the Matter World, including all composites in children, recursively.
    */
  def getAllComposites(): js.Array[CompositeType] = js.native
  
  /**
    * Returns all the constraints in the Matter World, including all constraints in children, recursively.
    */
  def getAllConstraints(): js.Array[ConstraintType] = js.native
  
  /**
    * This function is called every time the core game loop steps, which is bound to the
    * Request Animation Frame frequency unless otherwise modified.
    * 
    * The function is passed two values: `time` and `delta`, both of which come from the game step values.
    * 
    * It must return a number. This number is used as the delta value passed to Matter.Engine.update.
    * 
    * You can override this function with your own to define your own timestep.
    * 
    * If you need to update the Engine multiple times in a single game step then call
    * `World.update` as many times as required. Each call will trigger the `getDelta` function.
    * If you wish to have full control over when the Engine updates then see the property `autoUpdate`.
    * 
    * You can also adjust the number of iterations that Engine.update performs.
    * Use the Scene Matter Physics config object to set the following properties:
    * 
    * positionIterations (defaults to 6)
    * velocityIterations (defaults to 4)
    * constraintIterations (defaults to 2)
    * 
    * Adjusting these values can help performance in certain situations, depending on the physics requirements
    * of your game.
    */
  var getDelta: js.Function = js.native
  
  /**
    * Returns `true` if the given body can be found within the World.
    * @param body The Matter Body, or Game Object, to search for within the world.
    */
  def has(body: Body): js.Array[BodyType] = js.native
  def has(body: GameObject): js.Array[BodyType] = js.native
  
  /**
    * A `World` composite object that will contain all simulated bodies and constraints.
    */
  var localWorld: typings.phaser.MatterJS.World = js.native
  
  /**
    * Returns the next unique category bitfield (starting after the initial default category 0x0001).
    * There are 32 available.
    */
  def nextCategory(): Double = js.native
  
  /**
    * Returns the next unique group index for which bodies will collide.
    * If `isNonColliding` is `true`, returns the next unique group index for which bodies will not collide.
    * @param isNonColliding If `true`, returns the next unique group index for which bodies will _not_ collide. Default false.
    */
  def nextGroup(): Double = js.native
  def nextGroup(isNonColliding: Boolean): Double = js.native
  
  /**
    * Pauses this Matter World instance and sets `enabled` to `false`.
    * 
    * A paused world will not run any simulations for the duration it is paused.
    */
  def pause(): this.type = js.native
  
  def remove(`object`: js.Array[js.Object]): this.type = js.native
  def remove(`object`: js.Array[js.Object], deep: Boolean): this.type = js.native
  /**
    * Removes a Matter JS object, or array of objects, from the world.
    * 
    * The objects should be valid Matter JS entities, such as a Body, Composite or Constraint.
    * 
    * Triggers `beforeRemove` and `afterRemove` events.
    * @param object Can be single object, or an array, and can be a body, composite or constraint.
    * @param deep Optionally search the objects children and recursively remove those as well. Default false.
    */
  def remove(`object`: js.Object): this.type = js.native
  def remove(`object`: js.Object, deep: Boolean): this.type = js.native
  
  def removeConstraint(constraint: js.Array[ConstraintType]): this.type = js.native
  def removeConstraint(constraint: js.Array[ConstraintType], deep: Boolean): this.type = js.native
  /**
    * Removes a Matter JS constraint, or array of constraints, from the world.
    * 
    * Triggers `beforeRemove` and `afterRemove` events.
    * @param constraint A Matter JS Constraint, or an array of constraints, to be removed.
    * @param deep Optionally search the objects children and recursively remove those as well. Default false.
    */
  def removeConstraint(constraint: ConstraintType): this.type = js.native
  def removeConstraint(constraint: ConstraintType, deep: Boolean): this.type = js.native
  
  /**
    * Renders a single Matter Body to the given Phaser Graphics Game Object.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render a Body to your own Graphics instance.
    * 
    * If you don't wish to render a line around the body, set the `lineColor` parameter to `null`.
    * Equally, if you don't wish to render a fill, set the `fillColor` parameter to `null`.
    * @param body The Matter Body to be rendered.
    * @param graphics The Graphics object to render to.
    * @param showInternalEdges Render internal edges of the polygon?
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    * @param lineThickness The line thickness. Default 1.
    * @param fillColor The fill color.
    * @param fillOpacity The fill opacity, between 0 and 1.
    */
  def renderBody(body: BodyType, graphics: Graphics, showInternalEdges: Boolean): this.type = js.native
  def renderBody(body: BodyType, graphics: Graphics, showInternalEdges: Boolean, lineColor: Double): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def renderBody(
    body: BodyType,
    graphics: Graphics,
    showInternalEdges: Boolean,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  
  /**
    * Renders either all axes, or a single axis indicator, for an array of Bodies, to the given Graphics instance.
    * 
    * The debug renderer calls this method if the `showAxes` or `showAngleIndicator` config values are set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render bounds to your own Graphics instance.
    * @param bodies An array of bodies from the localWorld.
    * @param graphics The Graphics object to render to.
    * @param showAxes If `true` it will render all body axes. If `false` it will render a single axis indicator.
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    */
  def renderBodyAxes(
    bodies: js.Array[Any],
    graphics: Graphics,
    showAxes: Boolean,
    lineColor: Double,
    lineOpacity: Double
  ): Unit = js.native
  
  /**
    * Renders the bounds of an array of Bodies to the given Graphics instance.
    * 
    * If the body is a compound body, it will render the bounds for the parent compound.
    * 
    * The debug renderer calls this method if the `showBounds` config value is set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render bounds to your own Graphics instance.
    * @param bodies An array of bodies from the localWorld.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    */
  def renderBodyBounds(bodies: js.Array[Any], graphics: Graphics, lineColor: Double, lineOpacity: Double): Unit = js.native
  
  /**
    * Renders a velocity indicator for an array of Bodies, to the given Graphics instance.
    * 
    * The debug renderer calls this method if the `showVelocity` config value is set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render bounds to your own Graphics instance.
    * @param bodies An array of bodies from the localWorld.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    * @param lineThickness The line thickness.
    */
  def renderBodyVelocity(
    bodies: js.Array[Any],
    graphics: Graphics,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double
  ): Unit = js.native
  
  /**
    * Renders the list of collision points and normals to the given Graphics instance.
    * 
    * The debug renderer calls this method if the `showCollisions` config value is set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render the Grid to your own Graphics instance.
    * @param pairs An array of Matter Pairs to be rendered.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    */
  def renderCollisions(pairs: js.Array[Pair], graphics: Graphics, lineColor: Double): this.type = js.native
  
  /**
    * Renders a single Matter Constraint, such as a Pin or a Spring, to the given Phaser Graphics Game Object.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render a Constraint to your own Graphics instance.
    * @param constraint The Matter Constraint to render.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    * @param lineThickness The line thickness.
    * @param pinSize If this constraint is a pin, this sets the size of the pin circle.
    * @param anchorColor The color used when rendering this constraints anchors. Set to `null` to not render anchors.
    * @param anchorSize The size of the anchor circle, if this constraint has anchors and is rendering them.
    */
  def renderConstraint(
    constraint: ConstraintType,
    graphics: Graphics,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    pinSize: Double,
    anchorColor: Double,
    anchorSize: Double
  ): this.type = js.native
  
  /**
    * Renders the Convex Hull for a single Matter Body to the given Phaser Graphics Game Object.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render a Body hull to your own Graphics instance.
    * @param body The Matter Body to be rendered.
    * @param graphics The Graphics object to render to.
    * @param hullColor The color used to render the hull.
    * @param lineThickness The hull line thickness. Default 1.
    */
  def renderConvexHull(body: BodyType, graphics: Graphics, hullColor: Double): this.type = js.native
  def renderConvexHull(body: BodyType, graphics: Graphics, hullColor: Double, lineThickness: Double): this.type = js.native
  
  /**
    * Renders the Engine Broadphase Controller Grid to the given Graphics instance.
    * 
    * The debug renderer calls this method if the `showBroadphase` config value is set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render the Grid to your own Graphics instance.
    * @param grid The Matter Grid to be rendered.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    * @param lineOpacity The line opacity, between 0 and 1.
    */
  def renderGrid(grid: Grid, graphics: Graphics, lineColor: Double, lineOpacity: Double): this.type = js.native
  
  /**
    * Renders the list of Pair separations to the given Graphics instance.
    * 
    * The debug renderer calls this method if the `showSeparations` config value is set.
    * 
    * This method is used internally by the Matter Debug Renderer, but is also exposed publically should
    * you wish to render the Grid to your own Graphics instance.
    * @param pairs An array of Matter Pairs to be rendered.
    * @param graphics The Graphics object to render to.
    * @param lineColor The line color.
    */
  def renderSeparations(pairs: js.Array[Pair], graphics: Graphics, lineColor: Double): this.type = js.native
  
  /**
    * Resets the internal collision IDs that Matter.JS uses for Body collision groups.
    * 
    * You should call this before destroying your game if you need to restart the game
    * again on the same page, without first reloading the page. Or, if you wish to
    * consistently destroy a Scene that contains Matter.js and then run it again
    * later in the same game.
    */
  def resetCollisionIDs(): Unit = js.native
  
  /**
    * Resumes this Matter World instance from a paused state and sets `enabled` to `true`.
    */
  def resume(): this.type = js.native
  
  /**
    * The Matter JS Runner Configuration object.
    * 
    * This object is populated via the Matter Configuration object's `runner` property and is
    * updated constantly during the game step.
    */
  var runner: MatterRunnerConfig = js.native
  
  /**
    * The Scene to which this Matter World instance belongs.
    */
  var scene: Scene = js.native
  
  /**
    * Sets the debug render style for the given Matter Body.
    * 
    * If you are using this on a Phaser Game Object, such as a Matter Sprite, then pass in the body property
    * to this method, not the Game Object itself.
    * 
    * If you wish to skip a parameter, so it retains its current value, pass `false` for it.
    * 
    * If you wish to reset the Body render colors to the defaults found in the World Debug Config, then call
    * this method with just the `body` parameter provided and no others.
    * @param body The Matter Body to set the render style on.
    * @param lineColor The line color. If `null` it will use the World Debug Config value.
    * @param lineOpacity The line opacity, between 0 and 1. If `null` it will use the World Debug Config value.
    * @param lineThickness The line thickness. If `null` it will use the World Debug Config value.
    * @param fillColor The fill color. If `null` it will use the World Debug Config value.
    * @param fillOpacity The fill opacity, between 0 and 1. If `null` it will use the World Debug Config value.
    */
  def setBodyRenderStyle(body: BodyType): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Double, lineThickness: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Double, lineThickness: Double, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Double, lineThickness: Unit, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Unit, lineThickness: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Unit, lineThickness: Double, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Double, lineOpacity: Unit, lineThickness: Unit, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Double,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Double, lineThickness: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Double, lineThickness: Double, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Double, lineThickness: Unit, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Double,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Unit, lineThickness: Double): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Unit, lineThickness: Double, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Double,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(body: BodyType, lineColor: Unit, lineOpacity: Unit, lineThickness: Unit, fillColor: Double): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Double,
    fillOpacity: Double
  ): this.type = js.native
  def setBodyRenderStyle(
    body: BodyType,
    lineColor: Unit,
    lineOpacity: Unit,
    lineThickness: Unit,
    fillColor: Unit,
    fillOpacity: Double
  ): this.type = js.native
  
  /**
    * Sets the bounds of the Physics world to match the given world pixel dimensions.
    * 
    * You can optionally set which 'walls' to create: left, right, top or bottom.
    * If none of the walls are given it will default to use the walls settings it had previously.
    * I.e. if you previously told it to not have the left or right walls, and you then adjust the world size
    * the newly created bounds will also not have the left and right walls.
    * Explicitly state them in the parameters to override this.
    * @param x The x coordinate of the top-left corner of the bounds. Default 0.
    * @param y The y coordinate of the top-left corner of the bounds. Default 0.
    * @param width The width of the bounds.
    * @param height The height of the bounds.
    * @param thickness The thickness of each wall, in pixels. Default 64.
    * @param left If true will create the left bounds wall. Default true.
    * @param right If true will create the right bounds wall. Default true.
    * @param top If true will create the top bounds wall. Default true.
    * @param bottom If true will create the bottom bounds wall. Default true.
    */
  def setBounds(
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    thickness: js.UndefOr[Double],
    left: js.UndefOr[Boolean],
    right: js.UndefOr[Boolean],
    top: js.UndefOr[Boolean],
    bottom: js.UndefOr[Boolean]
  ): World = js.native
  
  /**
    * Sets the debug render style for the children of the given Matter Composite.
    * 
    * Composites themselves do not render, but they can contain bodies, constraints and other composites that may do.
    * So the children of this composite are passed to the `setBodyRenderStyle`, `setCompositeRenderStyle` and
    * `setConstraintRenderStyle` methods accordingly.
    * @param composite The Matter Composite to set the render style on.
    */
  def setCompositeRenderStyle(composite: CompositeType): this.type = js.native
  
  /**
    * Sets the debug render style for the given Matter Constraint.
    * 
    * If you are using this on a Phaser Game Object, then pass in the body property
    * to this method, not the Game Object itself.
    * 
    * If you wish to skip a parameter, so it retains its current value, pass `false` for it.
    * 
    * If you wish to reset the Constraint render colors to the defaults found in the World Debug Config, then call
    * this method with just the `constraint` parameter provided and no others.
    * @param constraint The Matter Constraint to set the render style on.
    * @param lineColor The line color. If `null` it will use the World Debug Config value.
    * @param lineOpacity The line opacity, between 0 and 1. If `null` it will use the World Debug Config value.
    * @param lineThickness The line thickness. If `null` it will use the World Debug Config value.
    * @param pinSize If this constraint is a pin, this sets the size of the pin circle. If `null` it will use the World Debug Config value.
    * @param anchorColor The color used when rendering this constraints anchors.  If `null` it will use the World Debug Config value.
    * @param anchorSize The size of the anchor circle, if this constraint has anchors. If `null` it will use the World Debug Config value.
    */
  def setConstraintRenderStyle(
    constraint: ConstraintType,
    lineColor: js.UndefOr[Double],
    lineOpacity: js.UndefOr[Double],
    lineThickness: js.UndefOr[Double],
    pinSize: js.UndefOr[Double],
    anchorColor: js.UndefOr[Double],
    anchorSize: js.UndefOr[Double]
  ): this.type = js.native
  
  /**
    * This internal method acts as a proxy between all of the Matter JS events and then re-emits them
    * via this class.
    */
  def setEventsProxy(): Unit = js.native
  
  /**
    * Sets the worlds gravity to the values given.
    * 
    * Gravity effects all bodies in the world, unless they have the `ignoreGravity` flag set.
    * @param x The world gravity x component. Default 0.
    * @param y The world gravity y component. Default 1.
    * @param scale The gravity scale factor. Default 0.001.
    */
  def setGravity(): this.type = js.native
  def setGravity(x: Double): this.type = js.native
  def setGravity(x: Double, y: Double): this.type = js.native
  def setGravity(x: Double, y: Double, scale: Double): this.type = js.native
  def setGravity(x: Double, y: Unit, scale: Double): this.type = js.native
  def setGravity(x: Unit, y: Double): this.type = js.native
  def setGravity(x: Unit, y: Double, scale: Double): this.type = js.native
  def setGravity(x: Unit, y: Unit, scale: Double): this.type = js.native
  
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
    */
  def step(): Unit = js.native
  def step(delta: Double): Unit = js.native
  
  /**
    * The internal update method. This is called automatically by the parent Scene.
    * 
    * Moves the simulation forward in time by delta ms. Uses `World.correction` value as an optional number that
    * specifies the time correction factor to apply to the update. This can help improve the accuracy of the
    * simulation in cases where delta is changing between updates. The value of correction is defined as `delta / lastDelta`,
    * i.e. the percentage change of delta over the last step. Therefore the value is always 1 (no correction) when
    * delta is constant (or when no correction is desired, which is the default).
    * See the paper on Time Corrected Verlet for more information.
    * 
    * Triggers `beforeUpdate` and `afterUpdate` events. Triggers `collisionStart`, `collisionActive` and `collisionEnd` events.
    * 
    * If the World is paused, `update` is still run, but exits early and does not update the Matter Engine.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: Double, delta: Double): Unit = js.native
  
  /**
    * Runs the Matter Engine.update at a fixed timestep of 30Hz.
    */
  def update30Hz(): Double = js.native
  
  /**
    * Runs the Matter Engine.update at a fixed timestep of 60Hz.
    */
  def update60Hz(): Double = js.native
  
  /**
    * Updates the 4 rectangle bodies that were created, if `setBounds` was set in the Matter config, to use
    * the new positions and sizes. This method is usually only called internally via the `setBounds` method.
    * @param add `true` if the walls are being added or updated, `false` to remove them from the world.
    * @param position Either `left`, `right`, `top` or `bottom`. Only optional if `add` is `false`.
    * @param x The horizontal position to place the walls at. Only optional if `add` is `false`.
    * @param y The vertical position to place the walls at. Only optional if `add` is `false`.
    * @param width The width of the walls, in pixels. Only optional if `add` is `false`.
    * @param height The height of the walls, in pixels. Only optional if `add` is `false`.
    */
  def updateWall(add: Boolean): Unit = js.native
  def updateWall(add: Boolean, position: String): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Double, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Double, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Unit, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Unit, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Double, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Double, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Double, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Unit, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Unit, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: String, x: Unit, y: Unit, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Double, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Double, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Unit, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Unit, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Double, y: Unit, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Double, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Double, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Double, width: Unit, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Unit, width: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Unit, width: Double, height: Double): Unit = js.native
  def updateWall(add: Boolean, position: Unit, x: Unit, y: Unit, width: Unit, height: Double): Unit = js.native
  
  /**
    * An object containing the 4 wall bodies that bound the physics world.
    */
  var walls: MatterWalls = js.native
}
