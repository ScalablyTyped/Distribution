package typings.openlayers.global.ol

import typings.openlayers.mod.olx.layer.BaseOptions
import typings.openlayers.mod.olx.layer.GroupOptions
import typings.openlayers.mod.olx.layer.HeatmapOptions
import typings.openlayers.mod.olx.layer.ImageOptions
import typings.openlayers.mod.olx.layer.LayerOptions
import typings.openlayers.mod.olx.layer.TileOptions
import typings.openlayers.mod.olx.layer.VectorOptions
import typings.openlayers.mod.olx.layer.VectorTileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Note that with `ol.layer.Base` and all its subclasses, any property set in
    * the options is set as a {@link ol.Object} property on the layer object, so
    * is observable, and has get/set accessors.
    *
    * @param options Layer options.
    * @api stable
    */
  @JSGlobal("ol.layer.Base")
  @js.native
  open class Base protected ()
    extends typings.openlayers.mod.layer.Base {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Note that with `ol.layer.Base` and all its subclasses, any property set in
      * the options is set as a {@link ol.Object} property on the layer object, so
      * is observable, and has get/set accessors.
      *
      * @param options Layer options.
      * @api stable
      */
    def this(options: BaseOptions) = this()
  }
  
  /**
    * @classdesc
    * A {@link ol.Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @param opt_options Layer options.
    * @api stable
    */
  @JSGlobal("ol.layer.Group")
  @js.native
  /**
    * @classdesc
    * A {@link ol.Collection} of layers that are handled together.
    *
    * A generic `change` event is triggered when the group/Collection changes.
    *
    * @param opt_options Layer options.
    * @api stable
    */
  open class Group ()
    extends typings.openlayers.mod.layer.Group {
    def this(opt_options: GroupOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer for rendering vector data as a heatmap.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.layer.Heatmap")
  @js.native
  /**
    * @classdesc
    * Layer for rendering vector data as a heatmap.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Options.
    * @api
    */
  open class Heatmap ()
    extends typings.openlayers.mod.layer.Heatmap {
    def this(opt_options: HeatmapOptions) = this()
  }
  
  /**
    * @classdesc
    * Server-rendered images that are available for arbitrary extents and
    * resolutions.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Layer options.
    * @api stable
    */
  @JSGlobal("ol.layer.Image")
  @js.native
  /**
    * @classdesc
    * Server-rendered images that are available for arbitrary extents and
    * resolutions.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Layer options.
    * @api stable
    */
  open class Image ()
    extends typings.openlayers.mod.layer.Image {
    def this(opt_options: ImageOptions) = this()
  }
  
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
  @JSGlobal("ol.layer.Layer")
  @js.native
  open class Layer protected ()
    extends typings.openlayers.mod.layer.Layer {
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
  }
  
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Tile layer options.
    * @api stable
    */
  @JSGlobal("ol.layer.Tile")
  @js.native
  /**
    * @classdesc
    * For layer sources that provide pre-rendered, tiled images in grids that are
    * organized by zoom levels for specific resolutions.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Tile layer options.
    * @api stable
    */
  open class Tile ()
    extends typings.openlayers.mod.layer.Tile {
    def this(opt_options: TileOptions) = this()
  }
  
  /**
    * @classdesc
    * Vector data that is rendered client-side.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.layer.Vector")
  @js.native
  /**
    * @classdesc
    * Vector data that is rendered client-side.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @fires ol.render.Event
    * @param opt_options Options.
    * @api stable
    */
  open class Vector ()
    extends typings.openlayers.mod.layer.Vector {
    def this(opt_options: VectorOptions) = this()
  }
  
  /**
    * @classdesc
    * Layer for vector tile data that is rendered client-side.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @param opt_options Options.
    * @api
    */
  @JSGlobal("ol.layer.VectorTile")
  @js.native
  /**
    * @classdesc
    * Layer for vector tile data that is rendered client-side.
    * Note that any property set in the options is set as a {@link ol.Object}
    * property on the layer object; for example, setting `title: 'My Title'` in the
    * options means that `title` is observable, and has get/set accessors.
    *
    * @param opt_options Options.
    * @api
    */
  open class VectorTile ()
    extends typings.openlayers.mod.layer.VectorTile {
    def this(opt_options: VectorTileOptions) = this()
  }
}
