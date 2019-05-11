package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Physics.Arcade.Tilemap")
@js.native
object TilemapNs extends js.Object {
  /**
    * A function to process the collision callbacks between a single tile and an Arcade Physics enabled Game Object.
    * @param tile The Tile to process.
    * @param sprite The Game Object to process with the Tile.
    */
  def ProcessTileCallbacks(tile: phaserLib.PhaserNs.TilemapsNs.Tile, sprite: phaserLib.PhaserNs.GameObjectsNs.Sprite): scala.Boolean = js.native
  /**
    * Internal function to process the separation of a physics body from a tile.
    * @param body The Body object to separate.
    * @param x The x separation amount.
    */
  def ProcessTileSeparationX(body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body, x: scala.Double): scala.Unit = js.native
  /**
    * Internal function to process the separation of a physics body from a tile.
    * @param body The Body object to separate.
    * @param y The y separation amount.
    */
  def ProcessTileSeparationY(body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body, y: scala.Double): scala.Unit = js.native
  /**
    * The core separation function to separate a physics body and a tile.
    * @param i The index of the tile within the map data.
    * @param body The Body object to separate.
    * @param tile The tile to collide against.
    * @param tileWorldRect A rectangle-like object defining the dimensions of the tile.
    * @param tilemapLayer The tilemapLayer to collide against.
    * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
    * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
    */
  def SeparateTile(
    i: scala.Double,
    body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
    tile: phaserLib.PhaserNs.TilemapsNs.Tile,
    tileWorldRect: phaserLib.PhaserNs.GeomNs.Rectangle,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    tileBias: scala.Double,
    isLayer: scala.Boolean
  ): scala.Boolean = js.native
  def SeparateTile(
    i: scala.Double,
    body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
    tile: phaserLib.PhaserNs.TilemapsNs.Tile,
    tileWorldRect: phaserLib.PhaserNs.GeomNs.Rectangle,
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    tileBias: scala.Double,
    isLayer: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Check the body against the given tile on the X axis.
    * Used internally by the SeparateTile function.
    * @param body The Body object to separate.
    * @param tile The tile to check.
    * @param tileLeft The left position of the tile within the tile world.
    * @param tileRight The right position of the tile within the tile world.
    * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
    * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
    */
  def TileCheckX(
    body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
    tile: phaserLib.PhaserNs.TilemapsNs.Tile,
    tileLeft: scala.Double,
    tileRight: scala.Double,
    tileBias: scala.Double,
    isLayer: scala.Boolean
  ): scala.Double = js.native
  /**
    * Check the body against the given tile on the Y axis.
    * Used internally by the SeparateTile function.
    * @param body The Body object to separate.
    * @param tile The tile to check.
    * @param tileTop The top position of the tile within the tile world.
    * @param tileBottom The bottom position of the tile within the tile world.
    * @param tileBias The tile bias value. Populated by the `World.TILE_BIAS` constant.
    * @param isLayer Is this check coming from a TilemapLayer or an array of tiles?
    */
  def TileCheckY(
    body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body,
    tile: phaserLib.PhaserNs.TilemapsNs.Tile,
    tileTop: scala.Double,
    tileBottom: scala.Double,
    tileBias: scala.Double,
    isLayer: scala.Boolean
  ): scala.Double = js.native
  /**
    * Checks for intersection between the given tile rectangle-like object and an Arcade Physics body.
    * @param tileWorldRect A rectangle object that defines the tile placement in the world.
    * @param body The body to check for intersection against.
    */
  def TileIntersectsBody(tileWorldRect: js.Object, body: phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Body): scala.Boolean = js.native
}

