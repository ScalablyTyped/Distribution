package typings.openlayers.mod.interaction

import typings.openlayers.mod.Feature
import typings.openlayers.mod.olx.interaction.SnapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Handles snapping of vector features while modifying or drawing them.  The
  * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
  * Any interaction object that allows the user to interact
  * with the features using the mouse can benefit from the snapping, as long
  * as it is added before.
  *
  * The snap interaction modifies map browser event `coordinate` and `pixel`
  * properties to force the snap to occur to any interaction that them.
  *
  * Example:
  *
  *     var snap = new ol.interaction.Snap({
  *       source: source
  *     });
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "interaction.Snap")
@js.native
/**
  * @classdesc
  * Handles snapping of vector features while modifying or drawing them.  The
  * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
  * Any interaction object that allows the user to interact
  * with the features using the mouse can benefit from the snapping, as long
  * as it is added before.
  *
  * The snap interaction modifies map browser event `coordinate` and `pixel`
  * properties to force the snap to occur to any interaction that them.
  *
  * Example:
  *
  *     var snap = new ol.interaction.Snap({
  *       source: source
  *     });
  *
  * @param opt_options Options.
  * @api
  */
class Snap () extends Pointer {
  def this(opt_options: SnapOptions) = this()
  /**
    * Add a feature to the collection of features that we may snap to.
    * @param feature Feature.
    * @param opt_listen Whether to listen to the geometry change or not
    *     Defaults to `true`.
    * @api
    */
  def addFeature(feature: Feature): Unit = js.native
  def addFeature(feature: Feature, opt_listen: Boolean): Unit = js.native
  /**
    * Remove a feature from the collection of features that we may snap to.
    * @param feature Feature
    * @param opt_unlisten Whether to unlisten to the geometry change
    *     or not. Defaults to `true`.
    * @api
    */
  def removeFeature(feature: Feature): Unit = js.native
  def removeFeature(feature: Feature, opt_unlisten: Boolean): Unit = js.native
}

