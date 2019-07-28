package typings.phaser.PhaserNs.PhysicsNs.MatterNs

import typings.phaser.MatterJSNs.Body
import typings.phaser.MatterJSNs.Constraint
import typings.phaser.MatterJSNs.Engine
import typings.phaser.PhaserNs.EventsNs.EventEmitter
import typings.phaser.PhaserNs.GameObjectsNs.Graphics
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.Tile
import typings.phaser.PhaserNs.TypesNs.PhysicsNs.MatterNs.MatterWorldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Matter.World")
@js.native
class World protected () extends EventEmitter {
  /**
    * 
    * @param scene The Scene to which this Matter World instance belongs.
    * @param config The Matter World configuration object.
    */
  def this(scene: Scene, config: MatterWorldConfig) = this()
  /**
    * Automatically call Engine.update every time the game steps.
    * If you disable this then you are responsible for calling `World.step` directly from your game.
    * If you call `set60Hz` or `set30Hz` then `autoUpdate` is reset to `true`.
    */
  var autoUpdate: Boolean = js.native
  /**
    * The correction argument is an optional Number that specifies the time correction factor to apply to the update.
    * This can help improve the accuracy of the simulation in cases where delta is changing between updates.
    * The value of correction is defined as delta / lastDelta, i.e. the percentage change of delta over the last step.
    * Therefore the value is always 1 (no correction) when delta constant (or when no correction is desired, which is the default).
    * See the paper on Time Corrected Verlet for more information.
    */
  var correction: Double = js.native
  /**
    * An instance of the Graphics object the debug bodies are drawn to, if enabled.
    */
  var debugGraphic: Graphics = js.native
  /**
    * The default configuration values.
    */
  var defaults: js.Object = js.native
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
    * A `World` composite object that will contain all simulated bodies and constraints.
    */
  var localWorld: typings.phaser.MatterJSNs.World = js.native
  /**
    * The Scene to which this Matter World instance belongs.
    */
  var scene: Scene = js.native
  /**
    * An object containing the 4 wall bodies that bound the physics world.
    */
  var walls: js.Object = js.native
  def add(`object`: js.Array[js.Object]): World = js.native
  /**
    * Adds an object to the world.
    * @param object Can be single or an array, and can be a body, composite or constraint
    */
  def add(`object`: js.Object): World = js.native
  /**
    * Adds MatterTileBody instances for all the colliding tiles within the given tilemap layer. Set
    * the appropriate tiles in your layer to collide before calling this method!
    * @param tilemapLayer An array of tiles.
    * @param options Options to be passed to the MatterTileBody constructor. {@ee Phaser.Physics.Matter.TileBody}
    */
  def convertTilemapLayer(tilemapLayer: DynamicTilemapLayer): World = js.native
  def convertTilemapLayer(tilemapLayer: DynamicTilemapLayer, options: js.Object): World = js.native
  def convertTilemapLayer(tilemapLayer: StaticTilemapLayer): World = js.native
  def convertTilemapLayer(tilemapLayer: StaticTilemapLayer, options: js.Object): World = js.native
  /**
    * Adds MatterTileBody instances for the given tiles. This adds bodies regardless of whether the
    * tiles are set to collide or not.
    * @param tiles An array of tiles.
    * @param options Options to be passed to the MatterTileBody constructor. {@see Phaser.Physics.Matter.TileBody}
    */
  def convertTiles(tiles: js.Array[Tile]): World = js.native
  def convertTiles(tiles: js.Array[Tile], options: js.Object): World = js.native
  /**
    * Creates a rectangle Matter body and adds it to the world.
    * @param x The horizontal position of the body in the world.
    * @param y The vertical position of the body in the world.
    * @param width The width of the body.
    * @param height The height of the body.
    * @param options Optional Matter configuration object.
    */
  def create(x: Double, y: Double, width: Double, height: Double, options: js.Object): Body = js.native
  /**
    * [description]
    */
  def createDebugGraphic(): Graphics = js.native
  /**
    * Sets the world's gravity and gravity scale to 0.
    */
  def disableGravity(): World = js.native
  /**
    * [description]
    * @param path [description]
    * @param points [description]
    */
  def fromPath(path: String, points: js.Array[_]): js.Array[_] = js.native
  /**
    * [description]
    */
  def nextCategory(): Double = js.native
  /**
    * [description]
    * @param isNonColliding [description]
    */
  def nextGroup(isNonColliding: Boolean): Double = js.native
  /**
    * [description]
    */
  def pause(): World = js.native
  /**
    * [description]
    * @param object The object to be removed from the world.
    * @param deep [description]
    */
  def remove(`object`: js.Object, deep: Boolean): World = js.native
  /**
    * [description]
    * @param constraint [description]
    * @param deep [description]
    */
  def removeConstraint(constraint: Constraint, deep: Boolean): World = js.native
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
    * [description]
    */
  def resume(): World = js.native
  /**
    * Sets the bounds of the Physics world to match the given world pixel dimensions.
    * You can optionally set which 'walls' to create: left, right, top or bottom.
    * If none of the walls are given it will default to use the walls settings it had previously.
    * I.e. if you previously told it to not have the left or right walls, and you then adjust the world size
    * the newly created bounds will also not have the left and right walls.
    * Explicitly state them in the parameters to override this.
    * @param x The x coordinate of the top-left corner of the bounds. Default 0.
    * @param y The y coordinate of the top-left corner of the bounds. Default 0.
    * @param width The width of the bounds.
    * @param height The height of the bounds.
    * @param thickness The thickness of each wall, in pixels. Default 128.
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
    * [description]
    */
  def setEventsProxy(): Unit = js.native
  /**
    * Sets the world's gravity
    * @param x The world gravity x component. Default 0.
    * @param y The world gravity y component. Default 1.
    * @param scale [description]
    */
  def setGravity(): World = js.native
  def setGravity(x: Double): World = js.native
  def setGravity(x: Double, y: Double): World = js.native
  def setGravity(x: Double, y: Double, scale: Double): World = js.native
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
    * @param delta [description] Default 16.666.
    * @param correction [description] Default 1.
    */
  def step(): Unit = js.native
  def step(delta: Double): Unit = js.native
  def step(delta: Double, correction: Double): Unit = js.native
  /**
    * [description]
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
    * [description]
    * @param add [description]
    * @param position [description]
    * @param x [description]
    * @param y [description]
    * @param width [description]
    * @param height [description]
    */
  def updateWall(add: Boolean, position: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
}

