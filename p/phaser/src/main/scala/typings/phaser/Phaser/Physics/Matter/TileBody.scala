package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Physics.Matter.Components.Bounce
import typings.phaser.Phaser.Physics.Matter.Components.Collision
import typings.phaser.Phaser.Physics.Matter.Components.Friction
import typings.phaser.Phaser.Physics.Matter.Components.Gravity
import typings.phaser.Phaser.Physics.Matter.Components.Mass
import typings.phaser.Phaser.Physics.Matter.Components.Sensor
import typings.phaser.Phaser.Physics.Matter.Components.Sleep
import typings.phaser.Phaser.Physics.Matter.Components.Static
import typings.phaser.Phaser.Tilemaps.Tile
import typings.phaser.Phaser.Types.Physics.Matter.MatterBody
import typings.phaser.Phaser.Types.Physics.Matter.MatterBodyTileOptions
import typings.phaser.Phaser.Types.Physics.Matter.MatterTileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.Physics.Matter.TileBody")
@js.native
class TileBody protected ()
  extends Bounce
     with Collision
     with Friction
     with Gravity
     with Mass
     with Sensor
     with Sleep
     with Static
     with MatterBody {
  /**
    * 
    * @param world The Matter world instance this body belongs to.
    * @param tile The target tile that should have a Matter body.
    * @param options Options to be used when creating the Matter body.
    */
  def this(world: World, tile: Tile) = this()
  def this(world: World, tile: Tile, options: MatterTileOptions) = this()
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
    * The tile object the body is associated with.
    */
  var tile: Tile = js.native
  /**
    * The Matter world the body exists within.
    */
  var world: World = js.native
  /**
    * Removes the current body from the tile and the world.
    */
  def destroy(): TileBody = js.native
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
    * Removes the current body from the TileBody and from the Matter world
    */
  def removeBody(): TileBody = js.native
  /**
    * Sets the current body to the given body. This will remove the previous body, if one already
    * exists.
    * @param body The new Matter body to use.
    * @param addToWorld Whether or not to add the body to the Matter world. Default true.
    */
  def setBody(body: BodyType): TileBody = js.native
  def setBody(body: BodyType, addToWorld: Boolean): TileBody = js.native
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
    * Sets the current body from the collision group associated with the Tile. This is typically
    * set up in Tiled's collision editor.
    * 
    * Note: Matter doesn't support all shapes from Tiled. Rectangles and polygons are directly
    * supported. Ellipses are converted into circle bodies. Polylines are treated as if they are
    * closed polygons. If a tile has multiple shapes, a multi-part body will be created. Concave
    * shapes are supported if poly-decomp library is included. Decomposition is not guaranteed to
    * work for complex shapes (e.g. holes), so it's often best to manually decompose a concave
    * polygon into multiple convex polygons yourself.
    * @param options Options to be used when creating the Matter body. See MatterJS.Body for a list of what Matter accepts.
    */
  def setFromTileCollision(): TileBody = js.native
  def setFromTileCollision(options: MatterBodyTileOptions): TileBody = js.native
  /**
    * Sets the current body to a rectangle that matches the bounds of the tile.
    * @param options Options to be used when creating the Matter body. See MatterJS.Body for a list of what Matter accepts.
    */
  def setFromTileRectangle(): TileBody = js.native
  def setFromTileRectangle(options: MatterBodyTileOptions): TileBody = js.native
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

