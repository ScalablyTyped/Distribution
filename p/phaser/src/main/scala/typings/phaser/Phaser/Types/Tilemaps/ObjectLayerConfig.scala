package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectLayerConfig extends js.Object {
  /**
    * The name of the Object Layer.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * An array of all objects on this Object Layer.
    */
  var objects: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The opacity of the layer, between 0 and 1.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * The custom properties defined on the Object Layer, keyed by their name.
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  /**
    * The type of each custom property defined on the Object Layer, keyed by its name.
    */
  var propertytypes: js.UndefOr[js.Any] = js.undefined
  /**
    * The type of the layer, which should be `objectgroup`.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Whether the layer is shown (`true`) or hidden (`false`).
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ObjectLayerConfig {
  @scala.inline
  def apply(
    name: String = null,
    objects: js.Array[_] = null,
    opacity: Int | Double = null,
    properties: js.Any = null,
    propertytypes: js.Any = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ObjectLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (propertytypes != null) __obj.updateDynamic("propertytypes")(propertytypes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLayerConfig]
  }
}

