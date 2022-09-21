package typings.phaser.phaserMod

import typings.phaser.EachTileCallback
import typings.phaser.FindTileCallback
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.GameObjects.Sprite
import typings.phaser.Phaser.Geom.Circle
import typings.phaser.Phaser.Geom.Line
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Geom.Triangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Tilemaps.OrientationType
import typings.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typings.phaser.Phaser.Types.Tilemaps.DebugStyleOptions
import typings.phaser.Phaser.Types.Tilemaps.FilteringOptions
import typings.phaser.Phaser.Types.Tilemaps.GIDData
import typings.phaser.Phaser.Types.Tilemaps.LayerDataConfig
import typings.phaser.Phaser.Types.Tilemaps.MapDataConfig
import typings.phaser.Phaser.Types.Tilemaps.ObjectLayerConfig
import typings.phaser.Phaser.Types.Tilemaps.TiledObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tilemaps {
  
  @JSImport("phaser", "Tilemaps")
  @js.native
  val ^ : js.Any = js.native
  
  object Components {
    
    @JSImport("phaser", "Tilemaps.Components")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * @param tileX The x coordinate.
      * @param tileY The y coordinate.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def CalculateFacesAt(tileX: Double, tileY: Double, layer: typings.phaser.Phaser.Tilemaps.LayerData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CalculateFacesAt")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def CalculateFacesWithin(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("CalculateFacesWithin")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Checks if the given tile coordinate is within the isometric layer bounds, or not.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The Tilemap Layer to check against.
      * @param camera The Camera to run the cull check against.
      */
    inline def CheckIsoBounds(tileX: Double, tileY: Double, layer: typings.phaser.Phaser.Tilemaps.LayerData): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckIsoBounds")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def CheckIsoBounds(tileX: Double, tileY: Double, layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("CheckIsoBounds")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Copies the tiles in the source rectangular area to a new destination (all specified in tile
      * coordinates) within the layer. This copies all tile properties & recalculates collision
      * information in the destination region.
      * @param srcTileX The x coordinate of the area to copy from, in tiles, not pixels.
      * @param srcTileY The y coordinate of the area to copy from, in tiles, not pixels.
      * @param width The width of the area to copy, in tiles, not pixels.
      * @param height The height of the area to copy, in tiles, not pixels.
      * @param destTileX The x coordinate of the area to copy to, in tiles, not pixels.
      * @param destTileY The y coordinate of the area to copy to, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def Copy(
      srcTileX: Double,
      srcTileY: Double,
      width: Double,
      height: Double,
      destTileX: Double,
      destTileY: Double,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Copy")(srcTileX.asInstanceOf[js.Any], srcTileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], destTileX.asInstanceOf[js.Any], destTileY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def CreateFromTiles(
      indexes: js.Array[Double],
      replacements: js.Array[Double],
      spriteConfig: SpriteConfig,
      scene: typings.phaser.Phaser.Scene,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[Sprite] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromTiles")(indexes.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], spriteConfig.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Sprite]]
    inline def CreateFromTiles(
      indexes: js.Array[Double],
      replacements: Double,
      spriteConfig: SpriteConfig,
      scene: typings.phaser.Phaser.Scene,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[Sprite] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromTiles")(indexes.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], spriteConfig.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Sprite]]
    inline def CreateFromTiles(
      indexes: Double,
      replacements: js.Array[Double],
      spriteConfig: SpriteConfig,
      scene: typings.phaser.Phaser.Scene,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[Sprite] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromTiles")(indexes.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], spriteConfig.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Sprite]]
    /**
      * Creates a Sprite for every object matching the given tile indexes in the layer. You can
      * optionally specify if each tile will be replaced with a new tile after the Sprite has been
      * created. This is useful if you want to lay down special tiles in a level that are converted to
      * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
      * @param indexes The tile index, or array of indexes, to create Sprites from.
      * @param replacements The tile index, or array of indexes, to change a converted tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a one-to-one mapping with the indexes array.
      * @param spriteConfig The config object to pass into the Sprite creator (i.e. scene.make.sprite).
      * @param scene The Scene to create the Sprites within.
      * @param camera The Camera to use when determining the world XY
      * @param layer The Tilemap Layer to act upon.
      */
    inline def CreateFromTiles(
      indexes: Double,
      replacements: Double,
      spriteConfig: SpriteConfig,
      scene: typings.phaser.Phaser.Scene,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[Sprite] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromTiles")(indexes.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any], spriteConfig.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[Sprite]]
    
    /**
      * Returns the bounds in the given orthogonal layer that are within the cameras viewport.
      * This is used internally by the cull tiles function.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      */
    inline def CullBounds(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("CullBounds")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport. This is used internally.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      * @param outputArray An optional array to store the Tile objects within.
      * @param renderOrder The rendering order constant. Default 0.
      */
    inline def CullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("CullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def CullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera, outputArray: js.Array[Any]): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("CullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def CullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: js.Array[Any],
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("CullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def CullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: Unit,
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("CullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
      * specified index. Tiles will be set to collide if the given index is a colliding index.
      * Collision information in the region will be recalculated.
      * @param index The tile index to fill the area with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    inline def Fill(
      index: Double,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Fill")(index.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def FilterTiles(
      callback: js.Function,
      context: js.Object,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("FilterTiles")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Searches the entire map layer for the first tile matching the given index, then returns that Tile
      * object. If no match is found, it returns null. The search starts from the top-left tile and
      * continues horizontally until it hits the end of the row, then it drops down to the next column.
      * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
      * the top-left.
      * @param index The tile index value to search for.
      * @param skip The number of times to skip a matching tile before returning.
      * @param reverse If true it will scan the layer in reverse, starting at the bottom-right. Otherwise it scans from the top-left.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def FindByIndex(index: Double, skip: Double, reverse: Boolean, layer: typings.phaser.Phaser.Tilemaps.LayerData): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("FindByIndex")(index.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def FindTile(
      callback: FindTileCallback,
      context: js.Object,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("FindTile")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def ForEachTile(
      callback: EachTileCallback,
      context: js.Object,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ForEachTile")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets the correct function to use to cull tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetCullTilesFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCullTilesFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets a tile at the given tile coordinates from the given layer.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def GetTileAt(tileX: Double, tileY: Double, nonNull: Boolean, layer: typings.phaser.Phaser.Tilemaps.LayerData): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTileAt")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], nonNull.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def GetTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      nonNull: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTileAtWorldXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], nonNull.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetTileToWorldXFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTileToWorldXFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetTileToWorldXYFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTileToWorldXYFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetTileToWorldYFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTileToWorldYFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def GetTilesWithin(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithin")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def GetTilesWithinShape(
      shape: Circle,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithinShape")(shape.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def GetTilesWithinShape(
      shape: Line,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithinShape")(shape.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def GetTilesWithinShape(
      shape: Rectangle,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithinShape")(shape.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def GetTilesWithinShape(
      shape: Triangle,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithinShape")(shape.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * @param worldX The world x coordinate for the top-left of the area.
      * @param worldY The world y coordinate for the top-left of the area.
      * @param width The width of the area.
      * @param height The height of the area.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def GetTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTilesWithinWorldXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], filteringOptions.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetWorldToTileXFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetWorldToTileXFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetWorldToTileXYFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetWorldToTileXYFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Gets the correct function to use to translate tiles, based on the map orientation.
      * @param orientation The Tilemap orientation constant.
      */
    inline def GetWorldToTileYFunction(orientation: Double): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("GetWorldToTileYFunction")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HasTileAt(tileX: Double, tileY: Double, layer: typings.phaser.Phaser.Tilemaps.LayerData): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasTileAt")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param worldX The X coordinate of the world position.
      * @param worldY The Y coordinate of the world position.
      * @param camera The Camera to use when factoring in which tiles to return.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: typings.phaser.Phaser.Tilemaps.LayerData): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasTileAtWorldXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the bounds in the given layer that are within the camera's viewport.
      * This is used internally by the cull tiles function.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      */
    inline def HexagonalCullBounds(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalCullBounds")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport. This is used internally.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      * @param outputArray An optional array to store the Tile objects within.
      * @param renderOrder The rendering order constant. Default 0.
      */
    inline def HexagonalCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def HexagonalCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera, outputArray: js.Array[Any]): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def HexagonalCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: js.Array[Any],
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def HexagonalCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: Unit,
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Converts from hexagonal tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HexagonalTileToWorldXY(
      tileX: Double,
      tileY: Double,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalTileToWorldXY")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from hexagonal tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layer's position, scale and scroll.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HexagonalTileToWorldY(tileY: Double, camera: Camera, layer: typings.phaser.Phaser.Tilemaps.LayerData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalTileToWorldY")(tileY.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts from world XY coordinates (pixels) to hexagonal tile XY coordinates (tile units), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinates down to the nearest integer.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HexagonalWorldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalWorldToTileXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from world Y coordinates (pixels) to hexagonal tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def HexagonalWorldToTileY(
      worldY: Double,
      snapToFloor: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HexagonalWorldToTileY")(worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Checks if the given tile coordinates are within the bounds of the layer.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def IsInLayerBounds(tileX: Double, tileY: Double, layer: typings.phaser.Phaser.Tilemaps.LayerData): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInLayerBounds")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport. This is used internally.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      * @param outputArray An optional array to store the Tile objects within.
      * @param renderOrder The rendering order constant. Default 0.
      */
    inline def IsometricCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def IsometricCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera, outputArray: js.Array[Any]): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def IsometricCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: js.Array[Any],
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def IsometricCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: Unit,
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Converts from isometric tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def IsometricTileToWorldXY(
      tileX: Double,
      tileY: Double,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricTileToWorldXY")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from world XY coordinates (pixels) to isometric tile XY coordinates (tile units), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def IsometricWorldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("IsometricWorldToTileXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
      * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
      * location. If you pass in an index, only the index at the specified location will be changed.
      * Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def PutTileAt(
      tile: Double,
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("PutTileAt")(tile.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    inline def PutTileAt(
      tile: typings.phaser.Phaser.Tilemaps.Tile,
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("PutTileAt")(tile.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
      * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
      * specified location. If you pass in an index, only the index at the specified location will be
      * changed. Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def PutTileAtWorldXY(
      tile: Double,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("PutTileAtWorldXY")(tile.asInstanceOf[js.Any], worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    inline def PutTileAtWorldXY(
      tile: typings.phaser.Phaser.Tilemaps.Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("PutTileAtWorldXY")(tile.asInstanceOf[js.Any], worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
      * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
      * all attributes will be copied over to the specified location. If you pass in an index, only the
      * index at the specified location will be changed. Collision information will be recalculated
      * within the region tiles were changed.
      * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def PutTilesAt(
      tile: js.Array[
          (js.Array[Double | typings.phaser.Phaser.Tilemaps.Tile]) | Double | typings.phaser.Phaser.Tilemaps.Tile
        ],
      tileX: Double,
      tileY: Double,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PutTilesAt")(tile.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
      * those will be used for randomly assigning new tile indexes. If an array is not provided, the
      * indexes found within the region (excluding -1) will be used for randomly assigning new tile
      * indexes. This method only modifies tile indexes and does not change collision information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param indexes An array of indexes to randomly draw from during randomization.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def Randomize(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      indexes: js.Array[Double],
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Randomize")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], indexes.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes the tile at the given tile coordinates in the specified layer and updates the layer's
      * collision information.
      * @param tileX The x coordinate.
      * @param tileY The y coordinate.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def RemoveTileAt(
      tileX: Double,
      tileY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveTileAt")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], replaceWithNull.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Removes the tile at the given world coordinates in the specified layer and updates the layer's
      * collision information.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1.
      * @param recalculateFaces `true` if the faces data should be recalculated.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def RemoveTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): typings.phaser.Phaser.Tilemaps.Tile = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveTileAtWorldXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], replaceWithNull.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tile]
    
    /**
      * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def RenderDebug(
      graphics: Graphics,
      styleConfig: DebugStyleOptions,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RenderDebug")(graphics.asInstanceOf[js.Any], styleConfig.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
      * not change collision information.
      * @param findIndex The index of the tile to search for.
      * @param newIndex The index of the tile to replace it with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def ReplaceByIndex(
      findIndex: Double,
      newIndex: Double,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ReplaceByIndex")(findIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport. This is used internally.
      * @param layer The Tilemap Layer to act upon.
      * @param bounds An object containing the `left`, `right`, `top` and `bottom` bounds.
      * @param renderOrder The rendering order constant.
      * @param outputArray The array to store the Tile objects within.
      */
    inline def RunCull(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      bounds: js.Object,
      renderOrder: Double,
      outputArray: js.Array[Any]
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("RunCull")(layer.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    inline def SetCollision(
      indexes: js.Array[Any],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollision")(indexes.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetCollision(
      indexes: js.Array[Any],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      updateLayer: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollision")(indexes.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], updateLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The Tilemap Layer to act upon.
      * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
      */
    inline def SetCollision(
      indexes: Double,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollision")(indexes.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetCollision(
      indexes: Double,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      updateLayer: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollision")(indexes.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], updateLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The Tilemap Layer to act upon.
      * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
      */
    inline def SetCollisionBetween(
      start: Double,
      stop: Double,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollisionBetween")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def SetCollisionBetween(
      start: Double,
      stop: Double,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      updateLayer: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollisionBetween")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], updateLayer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false). Tile indexes not currently in the layer are not affected.
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetCollisionByExclusion(
      indexes: js.Array[Double],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollisionByExclusion")(indexes.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * @param properties An object with tile properties and corresponding values that should be checked.
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetCollisionByProperty(
      properties: js.Object,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollisionByProperty")(properties.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets collision on the tiles within a layer by checking each tile's collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tile's collision group, the tile's colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * @param collides If true it will enable collision. If false it will clear collision.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: typings.phaser.Phaser.Tilemaps.LayerData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCollisionFromCollisionGroup")(collides.asInstanceOf[js.Any], recalculateFaces.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Internally used method to keep track of the tile indexes that collide within a layer. This
      * updates LayerData.collideIndexes to either contain or not contain the given `tileIndex`.
      * @param tileIndex The tile index to set the collision boolean for.
      * @param collides Should the tile index collide or not?
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetLayerCollisionIndex(tileIndex: Double, collides: Boolean, layer: typings.phaser.Phaser.Tilemaps.LayerData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetLayerCollisionIndex")(tileIndex.asInstanceOf[js.Any], collides.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Internally used method to set the colliding state of a tile. This does not recalculate
      * interesting faces.
      * @param tile The Tile to set the collision on.
      * @param collides Should the tile index collide or not? Default true.
      */
    inline def SetTileCollision(tile: typings.phaser.Phaser.Tilemaps.Tile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetTileCollision")(tile.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def SetTileCollision(tile: typings.phaser.Phaser.Tilemaps.Tile, collides: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTileCollision")(tile.asInstanceOf[js.Any], collides.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def SetTileIndexCallback(
      indexes: js.Array[Any],
      callback: js.Function,
      callbackContext: js.Object,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTileIndexCallback")(indexes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see setTileLocationCallback.
      * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetTileIndexCallback(
      indexes: Double,
      callback: js.Function,
      callbackContext: js.Object,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTileIndexCallback")(indexes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SetTileLocationCallback(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      callback: js.Function,
      callbackContext: js.Object,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTileLocationCallback")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackContext.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
      * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
      * appear to have changed! This method only modifies tile indexes and does not change collision
      * information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def Shuffle(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Shuffle")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns the bounds in the given layer that are within the camera's viewport.
      * This is used internally by the cull tiles function.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      */
    inline def StaggeredCullBounds(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredCullBounds")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    /**
      * Returns the tiles in the given layer that are within the cameras viewport. This is used internally.
      * @param layer The Tilemap Layer to act upon.
      * @param camera The Camera to run the cull check against.
      * @param outputArray An optional array to store the Tile objects within.
      * @param renderOrder The rendering order constant. Default 0.
      */
    inline def StaggeredCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def StaggeredCullTiles(layer: typings.phaser.Phaser.Tilemaps.LayerData, camera: Camera, outputArray: js.Array[Any]): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def StaggeredCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: js.Array[Any],
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    inline def StaggeredCullTiles(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      camera: Camera,
      outputArray: Unit,
      renderOrder: Double
    ): js.Array[typings.phaser.Phaser.Tilemaps.Tile] = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredCullTiles")(layer.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], outputArray.asInstanceOf[js.Any], renderOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.Tile]]
    
    /**
      * Converts from staggered tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def StaggeredTileToWorldXY(
      tileX: Double,
      tileY: Double,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredTileToWorldXY")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from staggered tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def StaggeredTileToWorldY(tileY: Double, camera: Camera, layer: typings.phaser.Phaser.Tilemaps.LayerData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredTileToWorldY")(tileY.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts from world XY coordinates (pixels) to staggered tile XY coordinates (tile units), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def StaggeredWorldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredWorldToTileXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from world Y coordinates (pixels) to staggered tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def StaggeredWorldToTileY(
      worldY: Double,
      snapToFloor: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("StaggeredWorldToTileY")(worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
      * information.
      * @param tileA First tile index.
      * @param tileB Second tile index.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def SwapByIndex(
      tileA: Double,
      tileB: Double,
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SwapByIndex")(tileA.asInstanceOf[js.Any], tileB.asInstanceOf[js.Any], tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layer's position, scale and scroll.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def TileToWorldX(tileX: Double, camera: Camera, layer: typings.phaser.Phaser.Tilemaps.LayerData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("TileToWorldX")(tileX.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def TileToWorldXY(
      tileX: Double,
      tileY: Double,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("TileToWorldXY")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layer's position, scale and scroll.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def TileToWorldY(tileY: Double, camera: Camera, layer: typings.phaser.Phaser.Tilemaps.LayerData): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("TileToWorldY")(tileY.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. New indexes are drawn from the given
      * weightedIndexes array. An example weighted array:
      * 
      * [
      *  { index: 6, weight: 4 },    // Probability of index 6 is 4 / 8
      *  { index: 7, weight: 2 },    // Probability of index 7 would be 2 / 8
      *  { index: 8, weight: 1.5 },  // Probability of index 8 would be 1.5 / 8
      *  { index: 26, weight: 0.5 }  // Probability of index 27 would be 0.5 / 8
      * ]
      * 
      * The probability of any index being choose is (the index's weight) / (sum of all weights). This
      * method only modifies tile indexes and does not change collision information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param weightedIndexes An array of objects to randomly draw from during
      * randomization. They should be in the form: { index: 0, weight: 4 } or
      * { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def WeightedRandomize(
      tileX: Double,
      tileY: Double,
      width: Double,
      height: Double,
      weightedIndexes: js.Array[js.Object],
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WeightedRandomize")(tileX.asInstanceOf[js.Any], tileY.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], weightedIndexes.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layer's position, scale and scroll.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def WorldToTileX(
      worldX: Double,
      snapToFloor: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("WorldToTileX")(worldX.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layer's position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def WorldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("WorldToTileXY")(worldX.asInstanceOf[js.Any], worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], point.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layer's position, scale and scroll.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer.
      * @param camera The Camera to use when calculating the tile index from the world values.
      * @param layer The Tilemap Layer to act upon.
      */
    inline def WorldToTileY(
      worldY: Double,
      snapToFloor: Boolean,
      camera: Camera,
      layer: typings.phaser.Phaser.Tilemaps.LayerData
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("WorldToTileY")(worldY.asInstanceOf[js.Any], snapToFloor.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  object Formats {
    
    @JSImport("phaser", "Tilemaps.Formats")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 2D Array Map Type
      */
    @JSImport("phaser", "Tilemaps.Formats.ARRAY_2D")
    @js.native
    def ARRAY_2D: Double = js.native
    inline def ARRAY_2D_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_2D")(x.asInstanceOf[js.Any])
    
    /**
      * CSV Map Type
      */
    @JSImport("phaser", "Tilemaps.Formats.CSV")
    @js.native
    def CSV: Double = js.native
    inline def CSV_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSV")(x.asInstanceOf[js.Any])
    
    /**
      * Tiled JSON Map Type
      */
    @JSImport("phaser", "Tilemaps.Formats.TILED_JSON")
    @js.native
    def TILED_JSON: Double = js.native
    inline def TILED_JSON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TILED_JSON")(x.asInstanceOf[js.Any])
    
    /**
      * Weltmeister (Impact.js) Map Type
      */
    @JSImport("phaser", "Tilemaps.Formats.WELTMEISTER")
    @js.native
    def WELTMEISTER: Double = js.native
    inline def WELTMEISTER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WELTMEISTER")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Hexagonal Tilemap orientation constant.
    */
  @JSImport("phaser", "Tilemaps.HEXAGONAL")
  @js.native
  val HEXAGONAL: Double = js.native
  
  /**
    * Isometric Tilemap orientation constant.
    */
  @JSImport("phaser", "Tilemaps.ISOMETRIC")
  @js.native
  val ISOMETRIC: Double = js.native
  
  /**
    * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
    * 
    * Image Collections are normally created automatically when Tiled data is loaded.
    */
  @JSImport("phaser", "Tilemaps.ImageCollection")
  @js.native
  open class ImageCollection protected ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.ImageCollection {
    /**
      * 
      * @param name The name of the image collection in the map data.
      * @param firstgid The first image index this image collection contains.
      * @param width Width of widest image (in pixels). Default 32.
      * @param height Height of tallest image (in pixels). Default 32.
      * @param margin The margin around all images in the collection (in pixels). Default 0.
      * @param spacing The spacing between each image in the collection (in pixels). Default 0.
      * @param properties Custom Image Collection properties. Default {}.
      */
    def this(name: String, firstgid: Double) = this()
    def this(name: String, firstgid: Double, width: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Double, margin: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Unit, margin: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Double, margin: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Unit, margin: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Double, margin: Double, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Double, margin: Unit, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Unit, margin: Double, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Double, height: Unit, margin: Unit, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Double, margin: Double, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Double, margin: Unit, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Unit, margin: Double, spacing: Double) = this()
    def this(name: String, firstgid: Double, width: Unit, height: Unit, margin: Unit, spacing: Double) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Double,
      margin: Double,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Double,
      margin: Double,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Double,
      margin: Unit,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Double,
      margin: Unit,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Unit,
      margin: Double,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Unit,
      margin: Double,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Unit,
      margin: Unit,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Double,
      height: Unit,
      margin: Unit,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Double,
      margin: Double,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Double,
      margin: Double,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Double,
      margin: Unit,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Double,
      margin: Unit,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Unit,
      margin: Double,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Unit,
      margin: Double,
      spacing: Unit,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Unit,
      margin: Unit,
      spacing: Double,
      properties: js.Object
    ) = this()
    def this(
      name: String,
      firstgid: Double,
      width: Unit,
      height: Unit,
      margin: Unit,
      spacing: Unit,
      properties: js.Object
    ) = this()
    
    /**
      * Add an image to this Image Collection.
      * @param gid The gid of the image in the Image Collection.
      * @param image The the key of the image in the Image Collection and in the cache.
      */
    /* CompleteClass */
    override def addImage(gid: Double, image: String): typings.phaser.Phaser.Tilemaps.ImageCollection = js.native
    
    /**
      * Returns true if and only if this image collection contains the given image index.
      * @param imageIndex The image index to search for.
      */
    /* CompleteClass */
    override def containsImageIndex(imageIndex: Double): Boolean = js.native
    
    /**
      * The Tiled firstgid value.
      * This is the starting index of the first image index this Image Collection contains.
      */
    /* CompleteClass */
    var firstgid: Double = js.native
    
    /**
      * The height of the tallest image (in pixels).
      */
    /* CompleteClass */
    override val imageHeight: Double = js.native
    
    /**
      * The margin around the images in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    /* CompleteClass */
    override val imageMarge: Double = js.native
    
    /**
      * The spacing between each image in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    /* CompleteClass */
    override val imageSpacing: Double = js.native
    
    /**
      * The width of the widest image (in pixels).
      */
    /* CompleteClass */
    override val imageWidth: Double = js.native
    
    /**
      * The cached images that are a part of this collection.
      */
    /* CompleteClass */
    override val images: js.Array[Any] = js.native
    
    /**
      * The name of the Image Collection.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Image Collection-specific properties that are typically defined in the Tiled editor.
      */
    /* CompleteClass */
    var properties: js.Object = js.native
    
    /**
      * The total number of images in the image collection.
      */
    /* CompleteClass */
    override val total: Double = js.native
  }
  
  /**
    * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
    * etc. into this format. Tilemap and TilemapLayer objects have a reference
    * to this data and use it to look up and perform operations on tiles.
    */
  @JSImport("phaser", "Tilemaps.LayerData")
  @js.native
  /**
    * 
    * @param config The Layer Data configuration object.
    */
  open class LayerData ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.LayerData {
    def this(config: LayerDataConfig) = this()
    
    /**
      * The alpha value of the layer.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * The base tile height.
      */
    /* CompleteClass */
    var baseTileHeight: Double = js.native
    
    /**
      * The base tile width.
      */
    /* CompleteClass */
    var baseTileWidth: Double = js.native
    
    /**
      * An array of physics bodies.
      */
    /* CompleteClass */
    var bodies: js.Array[Any] = js.native
    
    /**
      * An array of callbacks.
      */
    /* CompleteClass */
    var callbacks: js.Array[Any] = js.native
    
    /**
      * Tile Collision ID index map.
      */
    /* CompleteClass */
    var collideIndexes: js.Array[Any] = js.native
    
    /**
      * An array of the tile data indexes.
      */
    /* CompleteClass */
    var data: js.Array[js.Array[typings.phaser.Phaser.Tilemaps.Tile]] = js.native
    
    /**
      * The height of the layer in tiles.
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * The height in pixels of the entire layer.
      */
    /* CompleteClass */
    var heightInPixels: Double = js.native
    
    /**
      * The length of the horizontal sides of the hexagon.
      * Only used for hexagonal orientation Tilemaps.
      */
    /* CompleteClass */
    var hexSideLength: Double = js.native
    
    /**
      * Tile ID index map.
      */
    /* CompleteClass */
    var indexes: js.Array[Any] = js.native
    
    /**
      * The name of the layer, if specified in Tiled.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The layers orientation, necessary to be able to determine a tiles pixelX and pixelY as well as the layers width and height.
      */
    /* CompleteClass */
    var orientation: OrientationType = js.native
    
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    /* CompleteClass */
    var properties: js.Array[js.Object] = js.native
    
    /**
      * The pixel height of the tiles.
      */
    /* CompleteClass */
    var tileHeight: Double = js.native
    
    /**
      * The pixel width of the tiles.
      */
    /* CompleteClass */
    var tileWidth: Double = js.native
    
    /**
      * A reference to the Tilemap layer that owns this data.
      */
    /* CompleteClass */
    var tilemapLayer: typings.phaser.Phaser.Tilemaps.TilemapLayer = js.native
    
    /**
      * Is the layer visible or not?
      */
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /**
      * The width of the layer in tiles.
      */
    /* CompleteClass */
    var width: Double = js.native
    
    /**
      * The width in pixels of the entire layer.
      */
    /* CompleteClass */
    var widthInPixels: Double = js.native
    
    /**
      * The x offset of where to draw from the top left.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The y offset of where to draw from the top left.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
    * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
    * itself.
    */
  @JSImport("phaser", "Tilemaps.MapData")
  @js.native
  /**
    * 
    * @param config The Map configuration object.
    */
  open class MapData ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.MapData {
    def this(config: MapDataConfig) = this()
    
    /**
      * An object of collision data. Must be created as physics object or will return undefined.
      */
    /* CompleteClass */
    var collision: js.Object = js.native
    
    /**
      * The format of the map data.
      */
    /* CompleteClass */
    var format: Double = js.native
    
    /**
      * The height of the entire tilemap.
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * The height in pixels of the entire tilemap.
      */
    /* CompleteClass */
    var heightInPixels: Double = js.native
    
    /**
      * The length of the horizontal sides of the hexagon.
      * Only used for hexagonal orientation Tilemaps.
      */
    /* CompleteClass */
    var hexSideLength: Double = js.native
    
    /**
      * The collection of images the map uses(specified in Tiled)
      */
    /* CompleteClass */
    var imageCollections: js.Array[Any] = js.native
    
    /**
      * An array of Tiled Image Layers.
      */
    /* CompleteClass */
    var images: js.Array[Any] = js.native
    
    /**
      * If the map is infinite or not.
      */
    /* CompleteClass */
    var infinite: Boolean = js.native
    
    /**
      * An array with all the layers configured to the MapData.
      */
    /* CompleteClass */
    var layers: js.Array[typings.phaser.Phaser.Tilemaps.LayerData] | typings.phaser.Phaser.Tilemaps.ObjectLayer = js.native
    
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * An object of Tiled Object Layers.
      */
    /* CompleteClass */
    var objects: js.Object = js.native
    
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    /* CompleteClass */
    var orientation: OrientationType = js.native
    
    /**
      * Map specific properties (can be specified in Tiled)
      */
    /* CompleteClass */
    var properties: js.Object = js.native
    
    /**
      * Determines the draw order of tilemap. Default is right-down
      * 
      * 0, or 'right-down'
      * 1, or 'left-down'
      * 2, or 'right-up'
      * 3, or 'left-up'
      */
    /* CompleteClass */
    var renderOrder: String = js.native
    
    /**
      * The height of the tiles.
      */
    /* CompleteClass */
    var tileHeight: Double = js.native
    
    /**
      * The width of the tiles.
      */
    /* CompleteClass */
    var tileWidth: Double = js.native
    
    /**
      * An array of tile instances.
      */
    /* CompleteClass */
    var tiles: js.Array[Any] = js.native
    
    /**
      * An array of Tilesets.
      */
    /* CompleteClass */
    var tilesets: js.Array[typings.phaser.Phaser.Tilemaps.Tileset] = js.native
    
    /**
      * The version of the map data (as specified in Tiled).
      */
    /* CompleteClass */
    var version: String = js.native
    
    /**
      * The width of the entire tilemap.
      */
    /* CompleteClass */
    var width: Double = js.native
    
    /**
      * The width in pixels of the entire tilemap.
      */
    /* CompleteClass */
    var widthInPixels: Double = js.native
  }
  
  /**
    * Orthogonal Tilemap orientation constant.
    */
  @JSImport("phaser", "Tilemaps.ORTHOGONAL")
  @js.native
  val ORTHOGONAL: Double = js.native
  
  /**
    * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
    * object layer, except:
    *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
    *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
    *    are ignored as well.
    *  - "draworder" is ignored.
    */
  @JSImport("phaser", "Tilemaps.ObjectLayer")
  @js.native
  /**
    * 
    * @param config The data for the layer from the Tiled JSON object.
    */
  open class ObjectLayer ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.ObjectLayer {
    def this(config: ObjectLayerConfig) = this()
    
    /**
      * The name of the Object Layer.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * An array of all objects on this Object Layer.
      * 
      * Each Tiled object corresponds to a JavaScript object in this array. It has an `id` (unique),
      * `name` (as assigned in Tiled), `type` (as assigned in Tiled), `rotation` (in clockwise degrees),
      * `properties` (if any), `visible` state (`true` if visible, `false` otherwise),
      * `x` and `y` coordinates (in pixels, relative to the tilemap), and a `width` and `height` (in pixels).
      * 
      * An object tile has a `gid` property (GID of the represented tile), a `flippedHorizontal` property,
      * a `flippedVertical` property, and `flippedAntiDiagonal` property.
      * The {@link http://docs.mapeditor.org/en/latest/reference/tmx-map-format/|Tiled documentation} contains
      * information on flipping and rotation.
      * 
      * Polylines have a `polyline` property, which is an array of objects corresponding to points,
      * where each point has an `x` property and a `y` property. Polygons have an identically structured
      * array in their `polygon` property. Text objects have a `text` property with the text's properties.
      * 
      * Rectangles and ellipses have a `rectangle` or `ellipse` property set to `true`.
      */
    /* CompleteClass */
    var objects: js.Array[TiledObject] = js.native
    
    /**
      * The opacity of the layer, between 0 and 1.
      */
    /* CompleteClass */
    var opacity: Double = js.native
    
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    /* CompleteClass */
    var properties: js.Object = js.native
    
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    /* CompleteClass */
    var propertyTypes: js.Object = js.native
    
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    /* CompleteClass */
    var `type`: String = js.native
    
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  /**
    * Phaser Tilemap constants for orientation.
    */
  @JSImport("phaser", "Tilemaps.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.phaser.Phaser.Tilemaps.Orientation & Double] = js.native
    
    /* 3 */ val HEXAGONAL: typings.phaser.Phaser.Tilemaps.Orientation.HEXAGONAL & Double = js.native
    
    /* 1 */ val ISOMETRIC: typings.phaser.Phaser.Tilemaps.Orientation.ISOMETRIC & Double = js.native
    
    /* 0 */ val ORTHOGONAL: typings.phaser.Phaser.Tilemaps.Orientation.ORTHOGONAL & Double = js.native
    
    /* 2 */ val STAGGERED: typings.phaser.Phaser.Tilemaps.Orientation.STAGGERED & Double = js.native
  }
  
  /**
    * Create a Tilemap from the given key or data. If neither is given, make a blank Tilemap. When
    * loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing from
    * a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map data. For
    * an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param scene The Scene to which this Tilemap belongs.
    * @param key The key in the Phaser cache that corresponds to the loaded tilemap data.
    * @param tileWidth The width of a tile in pixels. Default 32.
    * @param tileHeight The height of a tile in pixels. Default 32.
    * @param width The width of the map in tiles. Default 10.
    * @param height The height of the map in tiles. Default 10.
    * @param data Instead of loading from the cache, you can also load directly from
    * a 2D array of tile indexes.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the
    * map data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set. Default false.
    */
  inline def ParseToTilemap(
    scene: typings.phaser.Phaser.Scene,
    key: js.UndefOr[String],
    tileWidth: js.UndefOr[Double],
    tileHeight: js.UndefOr[Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    data: js.UndefOr[js.Array[js.Array[Double]]],
    insertNull: js.UndefOr[Boolean]
  ): typings.phaser.Phaser.Tilemaps.Tilemap = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseToTilemap")(scene.asInstanceOf[js.Any], key.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.Tilemap]
  
  object Parsers {
    
    @JSImport("phaser", "Tilemaps.Parsers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the Tilemap orientation from the given string.
      * @param orientation The orientation type as a string.
      */
    inline def FromOrientationString(): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("FromOrientationString")().asInstanceOf[OrientationType]
    inline def FromOrientationString(orientation: String): OrientationType = ^.asInstanceOf[js.Dynamic].applyDynamic("FromOrientationString")(orientation.asInstanceOf[js.Any]).asInstanceOf[OrientationType]
    
    object Impact {
      
      @JSImport("phaser", "Tilemaps.Parsers.Impact")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Parses all tilemap layers in an Impact JSON object into new LayerData objects.
        * @param json The Impact JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled (see {@link Phaser.Tilemaps.Parsers.Tiled.ParseJSONTiled}).
        */
      inline def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[typings.phaser.Phaser.Tilemaps.LayerData] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseTileLayers")(json.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.LayerData]]
      
      /**
        * Tilesets and Image Collections
        * @param json The Impact JSON data.
        */
      inline def ParseTilesets(json: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseTilesets")(json.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      /**
        * Parses a Weltmeister JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Weltmeister JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      inline def ParseWeltmeister(name: String, json: js.Object, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseWeltmeister")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    }
    
    inline def Parse(
      name: String,
      mapFormat: Double,
      data: String,
      tileWidth: Double,
      tileHeight: Double,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(name.asInstanceOf[js.Any], mapFormat.asInstanceOf[js.Any], data.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    /**
      * Parses raw data of a given Tilemap format into a new MapData object. If no recognized data format
      * is found, returns `null`. When loading from CSV or a 2D array, you should specify the tileWidth &
      * tileHeight. When parsing from a map from Tiled, the tileWidth & tileHeight will be pulled from
      * the map data.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param mapFormat See ../Formats.js.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param tileHeight The height of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    inline def Parse(
      name: String,
      mapFormat: Double,
      data: js.Array[js.Array[Double]],
      tileWidth: Double,
      tileHeight: Double,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(name.asInstanceOf[js.Any], mapFormat.asInstanceOf[js.Any], data.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    inline def Parse(
      name: String,
      mapFormat: Double,
      data: js.Object,
      tileWidth: Double,
      tileHeight: Double,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(name.asInstanceOf[js.Any], mapFormat.asInstanceOf[js.Any], data.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    
    /**
      * Parses a 2D array of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    inline def Parse2DArray(
      name: String,
      data: js.Array[js.Array[Double]],
      tileWidth: Double,
      tileHeight: Double,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse2DArray")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    
    /**
      * Parses a CSV string of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data CSV string of tile indexes.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    inline def ParseCSV(name: String, data: String, tileWidth: Double, tileHeight: Double, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseCSV")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], tileWidth.asInstanceOf[js.Any], tileHeight.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
    
    object Tiled {
      
      @JSImport("phaser", "Tilemaps.Parsers.Tiled")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Copy properties from tileset to tiles.
        * @param mapData The Map Data object.
        */
      inline def AssignTileProperties(mapData: typings.phaser.Phaser.Tilemaps.MapData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AssignTileProperties")(mapData.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Decode base-64 encoded data, for example as exported by Tiled.
        * @param data Base-64 encoded data to decode.
        */
      inline def Base64Decode(data: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      /**
        * Master list of tiles -> x, y, index in tileset.
        * @param mapData The Map Data object.
        */
      inline def BuildTilesetIndex(mapData: typings.phaser.Phaser.Tilemaps.MapData): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildTilesetIndex")(mapData.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      /**
        * Parse a Tiled group layer and create a state object for inheriting.
        * @param json The Tiled JSON object.
        * @param currentl The current group layer from the Tiled JSON file.
        * @param parentstate The state of the parent group (if any).
        */
      inline def CreateGroupLayer(json: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroupLayer")(json.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      inline def CreateGroupLayer(json: js.Object, currentl: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroupLayer")(json.asInstanceOf[js.Any], currentl.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def CreateGroupLayer(json: js.Object, currentl: js.Object, parentstate: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroupLayer")(json.asInstanceOf[js.Any], currentl.asInstanceOf[js.Any], parentstate.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def CreateGroupLayer(json: js.Object, currentl: Unit, parentstate: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroupLayer")(json.asInstanceOf[js.Any], currentl.asInstanceOf[js.Any], parentstate.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      /**
        * See Tiled documentation on tile flipping:
        * http://docs.mapeditor.org/en/latest/reference/tmx-map-format/
        * @param gid A Tiled GID.
        */
      inline def ParseGID(gid: Double): GIDData = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseGID")(gid.asInstanceOf[js.Any]).asInstanceOf[GIDData]
      
      /**
        * Parses a Tiled JSON object into an array of objects with details about the image layers.
        * @param json The Tiled JSON object.
        */
      inline def ParseImageLayers(json: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseImageLayers")(json.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      /**
        * Parses a Tiled JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      inline def ParseJSONTiled(name: String, json: js.Object, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseJSONTiled")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Tilemaps.MapData]
      
      /**
        * Convert a Tiled object to an internal parsed object normalising and copying properties over, while applying optional x and y offsets. The parsed object will always have the properties `id`, `name`, `type`, `rotation`, `properties`, `visible`, `x`, `y`, `width` and `height`. Other properties will be added according to the object type (such as text, polyline, gid etc.)
        * @param tiledObject Tiled object to convert to an internal parsed object normalising and copying properties over.
        * @param offsetX Optional additional offset to apply to the object's x property. Defaults to 0. Default 0.
        * @param offsetY Optional additional offset to apply to the object's y property. Defaults to 0. Default 0.
        */
      inline def ParseObject(tiledObject: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseObject")(tiledObject.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      inline def ParseObject(tiledObject: js.Object, offsetX: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseObject")(tiledObject.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def ParseObject(tiledObject: js.Object, offsetX: Double, offsetY: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseObject")(tiledObject.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def ParseObject(tiledObject: js.Object, offsetX: Unit, offsetY: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseObject")(tiledObject.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      /**
        * Parses a Tiled JSON object into an array of ObjectLayer objects.
        * @param json The Tiled JSON object.
        */
      inline def ParseObjectLayers(json: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseObjectLayers")(json.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
      
      /**
        * Parses all tilemap layers in a Tiled JSON object into new LayerData objects.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled (see {@link Phaser.Tilemaps.Parsers.Tiled.ParseJSONTiled}).
        */
      inline def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[typings.phaser.Phaser.Tilemaps.LayerData] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseTileLayers")(json.asInstanceOf[js.Any], insertNull.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.Phaser.Tilemaps.LayerData]]
      
      /**
        * Tilesets and Image Collections.
        * @param json The Tiled JSON data.
        */
      inline def ParseTilesets(json: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseTilesets")(json.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      
      /**
        * Parses out the Wangset information from Tiled 1.1.5+ map data, if present.
        * 
        * Since a given tile can be in more than one wangset, the resulting properties
        * are nested. `tile.data.wangid[someWangsetName]` will return the array-based wang id in
        * this implementation.
        * 
        * Note that we're not guaranteed that there will be any 'normal' tiles if the only
        * thing in the tilset are wangtile definitions, so this has to be parsed separately.
        * 
        * See https://doc.mapeditor.org/en/latest/manual/using-wang-tiles/ for more information.
        * @param wangsets The array of wangset objects (parsed from JSON)
        * @param datas The field into which to put wangset data from Tiled.
        */
      inline def ParseWangsets(wangsets: js.Array[js.Object], datas: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseWangsets")(wangsets.asInstanceOf[js.Any], datas.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    }
  }
  
  /**
    * Staggered Tilemap orientation constant.
    */
  @JSImport("phaser", "Tilemaps.STAGGERED")
  @js.native
  val STAGGERED: Double = js.native
  
  /**
    * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
    * representation, so its position information is stored without factoring in scroll, layer
    * scale or layer position.
    */
  @JSImport("phaser", "Tilemaps.Tile")
  @js.native
  open class Tile protected ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.Tile {
    /**
      * 
      * @param layer The LayerData object in the Tilemap that this tile belongs to.
      * @param index The unique index of this tile within the map.
      * @param x The x coordinate of this tile in tile coordinates.
      * @param y The y coordinate of this tile in tile coordinates.
      * @param width Width of the tile in pixels.
      * @param height Height of the tile in pixels.
      * @param baseWidth The base width a tile in the map (in pixels). Tiled maps support
      * multiple tileset sizes within one map, but they are still placed at intervals of the base
      * tile width.
      * @param baseHeight The base height of the tile in pixels (in pixels). Tiled maps
      * support multiple tileset sizes within one map, but they are still placed at intervals of the
      * base tile height.
      */
    def this(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      index: Double,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      baseWidth: Double,
      baseHeight: Double
    ) = this()
    
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    var flipX: Boolean = js.native
    
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    var flipY: Boolean = js.native
    
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  /**
    * A Tilemap is a container for Tilemap data. This isn't a display object, rather, it holds data
    * about the map and allows you to add tilesets and tilemap layers to it. A map can have one or
    * more tilemap layers, which are the display objects that actually render the tiles.
    * 
    * The Tilemap data can be parsed from a Tiled JSON file, a CSV file or a 2D array. Tiled is a free
    * software package specifically for creating tile maps, and is available from:
    * http://www.mapeditor.org
    * 
    * As of Phaser 3.50.0 the Tilemap API now supports the following types of map:
    * 
    * 1) Orthogonal
    * 2) Isometric
    * 3) Hexagonal
    * 4) Staggered
    * 
    * Prior to this release, only orthogonal maps were supported.
    * 
    * Another large change in 3.50 was the consolidation of Tilemap Layers. Previously, you created
    * either a Static or Dynamic Tilemap Layer. However, as of 3.50 the features of both have been
    * merged and the API simplified, so now there is just the single `TilemapLayer` class.
    * 
    * A Tilemap has handy methods for getting and manipulating the tiles within a layer, allowing
    * you to build or modify the tilemap data at runtime.
    * 
    * Note that all Tilemaps use a base tile size to calculate dimensions from, but that a
    * TilemapLayer may have its own unique tile size that overrides this.
    * 
    * As of Phaser 3.21.0, if your tilemap includes layer groups (a feature of Tiled 1.2.0+) these
    * will be traversed and the following properties will impact children:
    * 
    * - Opacity (blended with parent) and visibility (parent overrides child)
    * - Vertical and horizontal offset
    * 
    * The grouping hierarchy is not preserved and all layers will be flattened into a single array.
    * 
    * Group layers are parsed during Tilemap construction but are discarded after parsing so dynamic
    * layers will NOT continue to be affected by a parent.
    * 
    * To avoid duplicate layer names, a layer that is a child of a group layer will have its parent
    * group name prepended with a '/'.  For example, consider a group called 'ParentGroup' with a
    * child called 'Layer 1'. In the Tilemap object, 'Layer 1' will have the name
    * 'ParentGroup/Layer 1'.
    */
  @JSImport("phaser", "Tilemaps.Tilemap")
  @js.native
  open class Tilemap protected ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.Tilemap {
    /**
      * 
      * @param scene The Scene to which this Tilemap belongs.
      * @param mapData A MapData instance containing Tilemap data.
      */
    def this(scene: typings.phaser.Phaser.Scene, mapData: typings.phaser.Phaser.Tilemaps.MapData) = this()
  }
  
  /**
    * A Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    */
  @JSImport("phaser", "Tilemaps.TilemapLayer")
  @js.native
  open class TilemapLayer protected ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.TilemapLayer {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param tilemap The Tilemap this layer is a part of.
      * @param layerIndex The index of the LayerData associated with this layer.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      */
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: String
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset]
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: String,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: String,
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: String,
      x: Unit,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Unit,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: Double,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Unit,
      y: Double
    ) = this()
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    var depth: Double = js.native
    
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    var displayHeight: Double = js.native
    
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    var displayWidth: Double = js.native
    
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    var flipX: Boolean = js.native
    
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    var flipY: Boolean = js.native
    
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The default depth is zero. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: Double): this.type = js.native
    
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
    
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    var width: Double = js.native
  }
  
  /**
    * A Tileset is a combination of an image containing the tiles and a container for data about
    * each tile.
    */
  @JSImport("phaser", "Tilemaps.Tileset")
  @js.native
  open class Tileset protected ()
    extends StObject
       with typings.phaser.Phaser.Tilemaps.Tileset {
    /**
      * 
      * @param name The name of the tileset in the map data.
      * @param firstgid The first tile index this tileset contains.
      * @param tileWidth Width of each tile (in pixels). Default 32.
      * @param tileHeight Height of each tile (in pixels). Default 32.
      * @param tileMargin The margin around all tiles in the sheet (in pixels). Default 0.
      * @param tileSpacing The spacing between each tile in the sheet (in pixels). Default 0.
      * @param tileProperties Custom properties defined per tile in the Tileset.
      * These typically are custom properties created in Tiled when editing a tileset. Default {}.
      * @param tileData Data stored per tile. These typically are created in Tiled
      * when editing a tileset, e.g. from Tiled's tile collision editor or terrain editor. Default {}.
      */
    def this(
      name: String,
      firstgid: Double,
      tileWidth: js.UndefOr[Double],
      tileHeight: js.UndefOr[Double],
      tileMargin: js.UndefOr[Double],
      tileSpacing: js.UndefOr[Double],
      tileProperties: js.UndefOr[js.Object],
      tileData: js.UndefOr[js.Object]
    ) = this()
  }
}
