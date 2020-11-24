package typings.openlayers.mod.layer

import typings.openlayers.mod.Map
import typings.openlayers.mod.olx.layer.LayerOptions
import typings.openlayers.mod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * A visual representation of raster or vector map data.
  * Layers group together those properties that pertain to how the data is to be
  * displayed, irrespective of the source of that data.
  *
  * Layers are usually added to a map with {@link ol.Map#addLayer}. Components
  * like {@link ol.interaction.Select} use unmanaged layers internally. These
  * unmanaged layers are associated with the map using
  * {@link ol.layer.Layer#setMap} instead.
  *
  * A generic `change` event is fired when the state of the source changes.
  *
  * @fires ol.render.Event
  * @param options Layer options.
  * @api stable
  */
@JSImport("openlayers", "layer.Layer")
@js.native
class Layer protected () extends Base {
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * A visual representation of raster or vector map data.
    * Layers group together those properties that pertain to how the data is to be
    * displayed, irrespective of the source of that data.
    *
    * Layers are usually added to a map with {@link ol.Map#addLayer}. Components
    * like {@link ol.interaction.Select} use unmanaged layers internally. These
    * unmanaged layers are associated with the map using
    * {@link ol.layer.Layer#setMap} instead.
    *
    * A generic `change` event is fired when the state of the source changes.
    *
    * @fires ol.render.Event
    * @param options Layer options.
    * @api stable
    */
  def this(options: LayerOptions) = this()
  
  /**
    * Get the layer source.
    * @return The layer source (or `null` if not yet set).
    * @observable
    * @api stable
    */
  def getSource(): Source = js.native
  
  /**
    * Sets the layer to be rendered on top of other layers on a map. The map will
    * not manage this layer in its layers collection, and the callback in
    * {@link ol.Map#forEachLayerAtPixel} will receive `null` as layer. This
    * is useful for temporary layers. To remove an unmanaged layer from the map,
    * use `#setMap(null)`.
    *
    * To add the layer to a map and have it managed by the map, use
    * {@link ol.Map#addLayer} instead.
    * @param map Map.
    * @api
    */
  def setMap(map: Map): Unit = js.native
  
  /**
    * Set the layer source.
    * @param source The layer source.
    * @observable
    * @api stable
    */
  def setSource(source: Source): Unit = js.native
}
