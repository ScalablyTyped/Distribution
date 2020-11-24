package typings.phaser.Phaser.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
  * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
  * to this data and use it to look up and perform operations on tiles.
  */
@js.native
trait LayerData extends js.Object {
  
  /**
    * The alpha value of the layer.
    */
  var alpha: Double = js.native
  
  /**
    * The base tile height.
    */
  var baseTileHeight: Double = js.native
  
  /**
    * The base tile width.
    */
  var baseTileWidth: Double = js.native
  
  /**
    * An array of physics bodies.
    */
  var bodies: js.Array[_] = js.native
  
  /**
    * An array of callbacks.
    */
  var callbacks: js.Array[_] = js.native
  
  /**
    * Tile Collision ID index map.
    */
  var collideIndexes: js.Array[_] = js.native
  
  /**
    * An array of the tile data indexes.
    */
  var data: js.Array[js.Array[Tile]] = js.native
  
  /**
    * The height of the layer in tiles.
    */
  var height: Double = js.native
  
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: Double = js.native
  
  /**
    * Tile ID index map.
    */
  var indexes: js.Array[_] = js.native
  
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: String = js.native
  
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.Array[js.Object] = js.native
  
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: Double = js.native
  
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: Double = js.native
  
  /**
    * A reference to the Tilemap layer that owns this data.
    */
  var tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer = js.native
  
  /**
    * Is the layer visible or not?
    */
  var visible: Boolean = js.native
  
  /**
    * The width of the layer in tiles.
    */
  var width: Double = js.native
  
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: Double = js.native
  
  /**
    * The x offset of where to draw from the top left.
    */
  var x: Double = js.native
  
  /**
    * The y offset of where to draw from the top left.
    */
  var y: Double = js.native
}
object LayerData {
  
  @scala.inline
  def apply(
    alpha: Double,
    baseTileHeight: Double,
    baseTileWidth: Double,
    bodies: js.Array[_],
    callbacks: js.Array[_],
    collideIndexes: js.Array[_],
    data: js.Array[js.Array[Tile]],
    height: Double,
    heightInPixels: Double,
    indexes: js.Array[_],
    name: String,
    properties: js.Array[js.Object],
    tileHeight: Double,
    tileWidth: Double,
    tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer,
    visible: Boolean,
    width: Double,
    widthInPixels: Double,
    x: Double,
    y: Double
  ): LayerData = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], baseTileHeight = baseTileHeight.asInstanceOf[js.Any], baseTileWidth = baseTileWidth.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], collideIndexes = collideIndexes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tilemapLayer = tilemapLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerData]
  }
  
  @scala.inline
  implicit class LayerDataOps[Self <: LayerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTileHeight(value: Double): Self = this.set("baseTileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTileWidth(value: Double): Self = this.set("baseTileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodiesVarargs(value: js.Any*): Self = this.set("bodies", js.Array(value :_*))
    
    @scala.inline
    def setBodies(value: js.Array[_]): Self = this.set("bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksVarargs(value: js.Any*): Self = this.set("callbacks", js.Array(value :_*))
    
    @scala.inline
    def setCallbacks(value: js.Array[_]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideIndexesVarargs(value: js.Any*): Self = this.set("collideIndexes", js.Array(value :_*))
    
    @scala.inline
    def setCollideIndexes(value: js.Array[_]): Self = this.set("collideIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[Tile]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[Tile]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightInPixels(value: Double): Self = this.set("heightInPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesVarargs(value: js.Any*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[_]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: js.Object*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[js.Object]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilemapLayer(value: DynamicTilemapLayer | StaticTilemapLayer): Self = this.set("tilemapLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthInPixels(value: Double): Self = this.set("widthInPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
