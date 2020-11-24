package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.Phaser.Events.EventEmitter
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait TileBody
  extends EventEmitter
     with Bounce
     with Collision
     with Friction
     with Gravity
     with Mass
     with Sensor
     with Sleep
     with Static
     with MatterBody {
  
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
    * The tile object the body is associated with.
    */
  var tile: Tile = js.native
  
  /**
    * The Matter world the body exists within.
    */
  var world: World = js.native
}
