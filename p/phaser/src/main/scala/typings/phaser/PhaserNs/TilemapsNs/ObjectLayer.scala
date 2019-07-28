package typings.phaser.PhaserNs.TilemapsNs

import typings.phaser.PhaserNs.TypesNs.TilemapsNs.ObjectLayerConfig
import typings.phaser.PhaserNs.TypesNs.TilemapsNs.TiledObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
  * object layer, except:
  *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
  *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
  *    are ignored as well.
  *  - "draworder" is ignored.
  */
@JSGlobal("Phaser.Tilemaps.ObjectLayer")
@js.native
/**
  * 
  * @param config The data for the layer from the Tiled JSON object.
  */
class ObjectLayer () extends js.Object {
  def this(config: ObjectLayerConfig) = this()
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

