package typings.phaser.Phaser.Tilemaps

import typings.phaser.Phaser.Types.Tilemaps.TiledObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
  * object layer, except:
  *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
  *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
  *    are ignored as well.
  *  - "draworder" is ignored.
  */
@js.native
trait ObjectLayer extends js.Object {
  
  /**
    * The name of the Object Layer.
    */
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
  var objects: js.Array[TiledObject] = js.native
  
  /**
    * The opacity of the layer, between 0 and 1.
    */
  var opacity: Double = js.native
  
  /**
    * The custom properties defined on the Object Layer, keyed by their name.
    */
  var properties: js.Object = js.native
  
  /**
    * The type of each custom property defined on the Object Layer, keyed by its name.
    */
  var propertyTypes: js.Object = js.native
  
  /**
    * The type of the layer, which should be `objectgroup`.
    */
  var `type`: String = js.native
  
  /**
    * Whether the layer is shown (`true`) or hidden (`false`).
    */
  var visible: Boolean = js.native
}
object ObjectLayer {
  
  @scala.inline
  def apply(
    name: String,
    objects: js.Array[TiledObject],
    opacity: Double,
    properties: js.Object,
    propertyTypes: js.Object,
    `type`: String,
    visible: Boolean
  ): ObjectLayer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], propertyTypes = propertyTypes.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLayer]
  }
  
  @scala.inline
  implicit class ObjectLayerOps[Self <: ObjectLayer] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: TiledObject*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[TiledObject]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyTypes(value: js.Object): Self = this.set("propertyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
