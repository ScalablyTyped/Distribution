package typings.openlayers.global.ol

import typings.openlayers.mod.olx.MapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Map")
@js.native
open class Map protected ()
  extends typings.openlayers.mod.Map {
  /**
    * @classdesc
    * The map is the core component of OpenLayers. For a map to render, a view,
    * one or more layers, and a target container are needed:
    *
    *     var map = new ol.Map({
    *       view: new ol.View({
    *         center: [0, 0],
    *         zoom: 1
    *       }),
    *       layers: [
    *         new ol.layer.Tile({
    *           source: new ol.source.OSM()
    *         })
    *       ],
    *       target: 'map'
    *     });
    *
    * The above snippet creates a map using a {@link ol.layer.Tile} to display
    * {@link ol.source.OSM} OSM data and render it to a DOM element with the
    * id `map`.
    *
    * The constructor places a viewport container (with CSS class name
    * `ol-viewport`) in the target element (see `getViewport()`), and then two
    * further elements within the viewport: one with CSS class name
    * `ol-overlaycontainer-stopevent` for controls and some overlays, and one with
    * CSS class name `ol-overlaycontainer` for other overlays (see the `stopEvent`
    * option of {@link ol.Overlay} for the difference). The map itself is placed in
    * a further element within the viewport, either DOM or Canvas, depending on the
    * renderer.
    *
    * Layers are stored as a `ol.Collection` in layerGroups. A top-level group is
    * provided by the library. This is what is accessed by `getLayerGroup` and
    * `setLayerGroup`. Layers entered in the options are added to this group, and
    * `addLayer` and `removeLayer` change the layer collection in the group.
    * `getLayers` is a convenience function for `getLayerGroup().getLayers()`.
    * Note that `ol.layer.Group` is a subclass of `ol.layer.Base`, so layers
    * entered in the options or added with `addLayer` can be groups, which can
    * contain further groups, and so on.
    *
    * @param options Map options.
    * @fires ol.MapBrowserEvent
    * @fires ol.MapEvent
    * @fires ol.render.Event#postcompose
    * @fires ol.render.Event#precompose
    * @api stable
    */
  def this(options: MapOptions) = this()
}
