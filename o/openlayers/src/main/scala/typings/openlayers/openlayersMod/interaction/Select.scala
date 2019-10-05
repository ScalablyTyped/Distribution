package typings.openlayers.openlayersMod.interaction

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.Map
import typings.openlayers.openlayersMod.MapBrowserEvent
import typings.openlayers.openlayersMod.layer.Vector
import typings.openlayers.openlayersMod.olx.interaction.SelectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Interaction for selecting vector features. By default, selected features are
  * styled differently, so this interaction can be used for visual highlighting,
  * as well as selecting features for other actions, such as modification or
  * output. There are three ways of controlling which features are selected:
  * using the browser event as defined by the `condition` and optionally the
  * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
  * further feature filter using the `filter` option.
  *
  * Selected features are added to an internal unmanaged layer.
  *
  * @param opt_options Options.
  * @fires ol.interaction.SelectEvent
  * @api stable
  */
@JSImport("openlayers", "interaction.Select")
@js.native
/**
  * @classdesc
  * Interaction for selecting vector features. By default, selected features are
  * styled differently, so this interaction can be used for visual highlighting,
  * as well as selecting features for other actions, such as modification or
  * output. There are three ways of controlling which features are selected:
  * using the browser event as defined by the `condition` and optionally the
  * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
  * further feature filter using the `filter` option.
  *
  * Selected features are added to an internal unmanaged layer.
  *
  * @param opt_options Options.
  * @fires ol.interaction.SelectEvent
  * @api stable
  */
class Select () extends Interaction {
  def this(opt_options: SelectOptions) = this()
  /**
    * Get the selected features.
    * @return Features collection.
    * @api stable
    */
  def getFeatures(): Collection[Feature] = js.native
  /**
    * Returns the associated {@link ol.layer.Vector vectorlayer} of
    * the (last) selected feature. Note that this will not work with any
    * programmatic method like pushing features to
    * {@link ol.interaction.Select#getFeatures collection}.
    * @param feature Feature
    * @return Layer.
    * @api
    */
  def getLayer(feature: Feature): Vector = js.native
  def getLayer(feature: typings.openlayers.openlayersMod.render.Feature): Vector = js.native
  /**
    * Remove the interaction from its current map, if any,  and attach it to a new
    * map, if any. Pass `null` to just remove the interaction from the current map.
    * @param map Map.
    * @api stable
    */
  def setMap(map: Map): Unit = js.native
}

/* static members */
@JSImport("openlayers", "interaction.Select")
@js.native
object Select extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Select} instances are instances of
    * this type.
    *
    * @param type The event type.
    * @param selected Selected features.
    * @param deselected Deselected features.
    * @param mapBrowserEvent Associated
    *     {@link ol.MapBrowserEvent}.
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.openlayersMod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Select} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param selected Selected features.
      * @param deselected Deselected features.
      * @param mapBrowserEvent Associated
      *     {@link ol.MapBrowserEvent}.
      */
    def this(
      `type`: String,
      selected: js.Array[Feature],
      deselected: js.Array[Feature],
      mapBrowserEvent: MapBrowserEvent
    ) = this()
    /**
      * Deselected features array.
      * @api
      */
    var deselected: js.Array[Feature] = js.native
    /**
      * Associated {@link ol.MapBrowserEvent}.
      * @api
      */
    var mapBrowserEvent: MapBrowserEvent = js.native
    /**
      * Selected features array.
      * @api
      */
    var selected: js.Array[Feature] = js.native
  }
  
  /**
    * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
    * selected state of features.
    * @param mapBrowserEvent Map browser event.
    * @return `false` to stop event propagation.
    * @api
    */
  def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = js.native
}

