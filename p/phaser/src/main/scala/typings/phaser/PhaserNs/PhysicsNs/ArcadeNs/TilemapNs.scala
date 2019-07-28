package typings.phaser.PhaserNs.PhysicsNs.ArcadeNs

import typings.phaser.PhaserNs.GeomNs.Rectangle
import typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.Tile
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
  def ProcessTileCallbacks(tile: Tile, sprite: typings.phaser.PhaserNs.GameObjectsNs.Sprite): Boolean = js.native
  /**
    * Internal function to process the separation of a physics body from a tile.
    * @param body The Body object to separate.
    * @param x The x separation amount.
    */
  def ProcessTileSeparationX(body: Body, x: Double): Unit = js.native
  /**
    * Internal function to process the separation of a physics body from a tile.
    * @param body The Body object to separate.
    * @param y The y separation amount.
    */
  def ProcessTileSeparationY(body: Body, y: Double): Unit = js.native
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
    i: Double,
    body: Body,
    tile: Tile,
    tileWorldRect: Rectangle,
    tilemapLayer: DynamicTilemapLayer,
    tileBias: Double,
    isLayer: Boolean
  ): Boolean = js.native
  def SeparateTile(
    i: Double,
    body: Body,
    tile: Tile,
    tileWorldRect: Rectangle,
    tilemapLayer: StaticTilemapLayer,
    tileBias: Double,
    isLayer: Boolean
  ): Boolean = js.native
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
  def TileCheckX(body: Body, tile: Tile, tileLeft: Double, tileRight: Double, tileBias: Double, isLayer: Boolean): Double = js.native
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
  def TileCheckY(body: Body, tile: Tile, tileTop: Double, tileBottom: Double, tileBias: Double, isLayer: Boolean): Double = js.native
  /**
    * Checks for intersection between the given tile rectangle-like object and an Arcade Physics body.
    * @param tileWorldRect A rectangle object that defines the tile placement in the world.
    * @param body The body to check for intersection against.
    */
  def TileIntersectsBody(tileWorldRect: js.Object, body: Body): Boolean = js.native
}

