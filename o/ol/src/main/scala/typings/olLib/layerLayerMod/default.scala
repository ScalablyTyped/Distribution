package typings
package olLib.layerLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("ol/layer/Layer", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.layerNs.Layer {
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
  def this(options: openlayersLib.openlayersMod.olxNs.layerNs.LayerOptions) = this()
}

