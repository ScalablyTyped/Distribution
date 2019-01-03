package typings
package olLib.olMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  @js.native
  class AssertionError protected ()
    extends openlayersLib.openlayersMod.AssertionError {
    /**
      * Error object thrown when an assertion failed. This is an ECMA-262 Error,
      * extended with a `code` property.
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error}
      * @param code Error code.
      */
    def this(code: scala.Double) = this()
  }
  
  @js.native
  class Attribution protected ()
    extends openlayersLib.openlayersMod.Attribution {
    /**
      * @classdesc
      * An attribution for a layer source.
      *
      * Example:
      *
      *     source: new ol.source.OSM({
      *       attributions: [
      *         new ol.Attribution({
      *           html: 'All maps &copy; ' +
      *               '<a href="http://www.opencyclemap.org/">OpenCycleMap</a>'
      *         }),
      *         ol.source.OSM.ATTRIBUTION
      *       ],
      *     ..
      *
      * @param options Attribution options.
      * @struct
      * @api stable
      */
    def this(options: openlayersLib.openlayersMod.olxNs.AttributionOptions) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * An expanded version of standard JS Array, adding convenience methods for
    * manipulation. Add and remove changes to the Collection trigger a Collection
    * event. Note that this does not cover changes to the objects _within_ the
    * Collection; they trigger events on the appropriate object, not on the
    * Collection as a whole.
    *
    * @fires ol.Collection.Event
    * @param opt_array Array.
    * @template T
    * @api stable
    */
  class Collection[T] ()
    extends openlayersLib.openlayersMod.Collection[T] {
    def this(opt_array: js.Array[T]) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * The ol.DeviceOrientation class provides access to information from
    * DeviceOrientation events.  See the [HTML 5 DeviceOrientation Specification](
    * http://www.w3.org/TR/orientation-event/) for more details.
    *
    * Many new computers, and especially mobile phones
    * and tablets, provide hardware support for device orientation. Web
    * developers targeting mobile devices will be especially interested in this
    * class.
    *
    * Device orientation data are relative to a common starting point. For mobile
    * devices, the starting point is to lay your phone face up on a table with the
    * top of the phone pointing north. This represents the zero state. All
    * angles are then relative to this state. For computers, it is the same except
    * the screen is open at 90 degrees.
    *
    * Device orientation is reported as three angles - `alpha`, `beta`, and
    * `gamma` - relative to the starting position along the three planar axes X, Y
    * and Z. The X axis runs from the left edge to the right edge through the
    * middle of the device. Similarly, the Y axis runs from the bottom to the top
    * of the device through the middle. The Z axis runs from the back to the front
    * through the middle. In the starting position, the X axis points to the
    * right, the Y axis points away from you and the Z axis points straight up
    * from the device lying flat.
    *
    * The three angles representing the device orientation are relative to the
    * three axes. `alpha` indicates how much the device has been rotated around the
    * Z axis, which is commonly interpreted as the compass heading (see note
    * below). `beta` indicates how much the device has been rotated around the X
    * axis, or how much it is tilted from front to back.  `gamma` indicates how
    * much the device has been rotated around the Y axis, or how much it is tilted
    * from left to right.
    *
    * For most browsers, the `alpha` value returns the compass heading so if the
    * device points north, it will be 0.  With Safari on iOS, the 0 value of
    * `alpha` is calculated from when device orientation was first requested.
    * ol.DeviceOrientation provides the `heading` property which normalizes this
    * behavior across all browsers for you.
    *
    * It is important to note that the HTML 5 DeviceOrientation specification
    * indicates that `alpha`, `beta` and `gamma` are in degrees while the
    * equivalent properties in ol.DeviceOrientation are in radians for consistency
    * with all other uses of angles throughout OpenLayers.
    *
    * To get notified of device orientation changes, register a listener for the
    * generic `change` event on your `ol.DeviceOrientation` instance.
    *
    * @see {@link http://www.w3.org/TR/orientation-event/}
    *
    * @param opt_options Options.
    * @api
    */
  class DeviceOrientation ()
    extends openlayersLib.openlayersMod.DeviceOrientation {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.DeviceOrientationOptions) = this()
  }
  
  @js.native
  /**
    * Objects that need to clean up after themselves.
    */
  class Disposable ()
    extends openlayersLib.openlayersMod.Disposable
  
  @js.native
  /**
    * @classdesc
    * A vector object for geographic features with a geometry and other
    * attribute properties, similar to the features in vector file formats like
    * GeoJSON.
    *
    * Features can be styled individually with `setStyle`; otherwise they use the
    * style of their vector layer.
    *
    * Note that attribute properties are set as {@link ol.Object} properties on
    * the feature object, so they are observable, and have get/set accessors.
    *
    * Typically, a feature has a single geometry property. You can set the
    * geometry using the `setGeometry` method and get it with `getGeometry`.
    * It is possible to store more than one geometry on a feature using attribute
    * properties. By default, the geometry used for rendering is identified by
    * the property name `geometry`. If you want to use another geometry property
    * for rendering, use the `setGeometryName` method to change the attribute
    * property associated with the geometry for the feature.  For example:
    *
    * ```js
    * var feature = new ol.Feature({
    *   geometry: new ol.geom.Polygon(polyCoords),
    *   labelPoint: new ol.geom.Point(labelCoords),
    *   name: 'My Polygon'
    * });
    *
    * // get the polygon geometry
    * var poly = feature.getGeometry();
    *
    * // Render the feature as a point using the coordinates from labelPoint
    * feature.setGeometryName('labelPoint');
    *
    * // get the point geometry
    * var point = feature.getGeometry();
    * ```
    *
    * @param opt_geometryOrProperties
    *     You may pass a Geometry object directly, or an object literal
    *     containing properties.  If you pass an object literal, you may
    *     include a Geometry associated with a `geometry` key.
    * @api stable
    */
  class Feature ()
    extends openlayersLib.openlayersMod.Feature {
    def this(opt_geometryOrProperties: openlayersLib.openlayersMod.geomNs.Geometry) = this()
    def this(opt_geometryOrProperties: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * Helper class for providing HTML5 Geolocation capabilities.
    * The [Geolocation API](http://www.w3.org/TR/geolocation-API/)
    * is used to locate a user's position.
    *
    * To get notified of position changes, register a listener for the generic
    * `change` event on your instance of `ol.Geolocation`.
    *
    * Example:
    *
    *     var geolocation = new ol.Geolocation({
    *       // take the projection to use from the map's view
    *       projection: view.getProjection()
    *     });
    *     // listen to changes in position
    *     geolocation.on('change', function(evt) {
    *       window.console.log(geolocation.getPosition());
    *     });
    *
    * @fires error
    * @param opt_options Options.
    * @api stable
    */
  class Geolocation ()
    extends openlayersLib.openlayersMod.Geolocation {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.GeolocationOptions) = this()
  }
  
  @js.native
  /**
    * Render a grid for a coordinate system on a map.
    * @param opt_options Options.
    * @api
    */
  class Graticule ()
    extends openlayersLib.openlayersMod.Graticule {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.GraticuleOptions) = this()
  }
  
  @js.native
  class Image protected ()
    extends openlayersLib.openlayersMod.Image {
    /**
      * @param extent Extent.
      * @param resolution Resolution.
      * @param pixelRatio Pixel ratio.
      * @param attributions Attributions.
      * @param src Image source URI.
      * @param crossOrigin Cross origin.
      * @param imageLoadFunction Image load function.
      */
    def this(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[openlayersLib.openlayersMod.Attribution], src: java.lang.String) = this()
    def this(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[openlayersLib.openlayersMod.Attribution], src: java.lang.String, crossOrigin: java.lang.String) = this()
    def this(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double, pixelRatio: scala.Double, attributions: js.Array[openlayersLib.openlayersMod.Attribution], src: java.lang.String, crossOrigin: java.lang.String, imageLoadFunction: openlayersLib.openlayersMod.ImageLoadFunctionType) = this()
  }
  
  @js.native
  class ImageBase protected ()
    extends openlayersLib.openlayersMod.ImageBase {
    /**
      * @param extent Extent.
      * @param resolution Resolution.
      * @param pixelRatio Pixel ratio.
      * @param state State.
      * @param attributions Attributions.
      */
    def this(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double, pixelRatio: scala.Double, state: openlayersLib.openlayersMod.ImageState, attributions: js.Array[openlayersLib.openlayersMod.Attribution]) = this()
  }
  
  @js.native
  class ImageTile protected ()
    extends openlayersLib.openlayersMod.ImageTile {
    /**
      * @param tileCoord Tile coordinate.
      * @param state State.
      * @param src Image source URI.
      * @param crossOrigin Cross origin.
      * @param tileLoadFunction Tile load function.
      */
    def this(tileCoord: openlayersLib.openlayersMod.TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String) = this()
    def this(tileCoord: openlayersLib.openlayersMod.TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, crossOrigin: java.lang.String) = this()
    def this(tileCoord: openlayersLib.openlayersMod.TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, crossOrigin: java.lang.String, tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType) = this()
  }
  
  @js.native
  class Kinetic protected ()
    extends openlayersLib.openlayersMod.Kinetic {
    /**
      * @classdesc
      * Implementation of inertial deceleration for map movement.
      *
      * @param decay Rate of decay (must be negative).
      * @param minVelocity Minimum velocity (pixels/millisecond).
      * @param delay Delay to consider to calculate the kinetic
      *     initial values (milliseconds).
      * @struct
      * @api
      */
    def this(decay: scala.Double, minVelocity: scala.Double, delay: scala.Double) = this()
  }
  
  @js.native
  class Map protected ()
    extends openlayersLib.openlayersMod.Map {
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
    def this(options: openlayersLib.openlayersMod.olxNs.MapOptions) = this()
  }
  
  @js.native
  class MapBrowserEvent protected ()
    extends openlayersLib.openlayersMod.MapBrowserEvent {
    /**
      * @classdesc
      * Events emitted as map browser events are instances of this type.
      * See {@link ol.Map} for which events trigger a map browser event.
      *
      * @param type Event type.
      * @param map Map.
      * @param browserEvent Browser event.
      * @param opt_dragging Is the map currently being dragged?
      * @param opt_frameState Frame state.
      */
    def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event) = this()
    def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean) = this()
    def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, browserEvent: stdLib.Event, opt_dragging: scala.Boolean, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
  }
  
  @js.native
  class MapBrowserPointerEvent ()
    extends openlayersLib.openlayersMod.MapBrowserPointerEvent
  
  @js.native
  class MapEvent protected ()
    extends openlayersLib.openlayersMod.MapEvent {
    /**
      * @classdesc
      * Events emitted as map events are instances of this type.
      * See {@link ol.Map} for which events trigger a map event.
      *
      * @param type Event type.
      * @param map Map.
      * @param opt_frameState Frame state.
      */
    def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map) = this()
    def this(`type`: java.lang.String, map: openlayersLib.openlayersMod.Map, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Most non-trivial classes inherit from this.
    *
    * This extends {@link ol.Observable} with observable properties, where each
    * property is observable as well as the object as a whole.
    *
    * Classes that inherit from this have pre-defined properties, to which you can
    * add your owns. The pre-defined properties are listed in this documentation as
    * 'Observable Properties', and have their own accessors; for example,
    * {@link ol.Map} has a `target` property, accessed with `getTarget()`  and
    * changed with `setTarget()`. Not all properties are however settable. There
    * are also general-purpose accessors `get()` and `set()`. For example,
    * `get('target')` is equivalent to `getTarget()`.
    *
    * The `set` accessors trigger a change event, and you can monitor this by
    * registering a listener. For example, {@link ol.View} has a `center`
    * property, so `view.on('change:center', function(evt) {...});` would call the
    * function whenever the value of the center property changes. Within the
    * function, `evt.target` would be the view, so `evt.target.getCenter()` would
    * return the new center.
    *
    * You can add your own observable properties with
    * `object.set('prop', 'value')`, and retrieve that with `object.get('prop')`.
    * You can listen for changes on that property value with
    * `object.on('change:prop', listener)`. You can get a list of all
    * properties with {@link ol.Object#getProperties object.getProperties()}.
    *
    * Note that the observable properties are separate from standard JS properties.
    * You can, for example, give your map object a title with
    * `map.title='New title'` and with `map.set('title', 'Another title')`. The
    * first will be a `hasOwnProperty`; the second will appear in
    * `getProperties()`. Only the second is observable.
    *
    * Properties can be deleted by using the unset method. E.g.
    * object.unset('foo').
    *
    * @param opt_values An object with key-value pairs.
    * @fires ol.ObjectEvent
    * @api
    */
  class Object ()
    extends openlayersLib.openlayersMod.Object {
    def this(opt_values: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class ObjectEvent protected ()
    extends openlayersLib.openlayersMod.ObjectEvent {
    /**
      * @classdesc
      * Events emitted by {@link ol.Object} instances are instances of this type.
      *
      * @param type The event type.
      * @param key The property name.
      * @param oldValue The old value for `key`.
      */
    def this(`type`: java.lang.String, key: java.lang.String, oldValue: js.Any) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * An event target providing convenient methods for listener registration
    * and unregistration. A generic `change` event is always available through
    * {@link ol.Observable#changed}.
    *
    * @fires ol.events.Event
    * @struct
    * @api stable
    */
  class Observable ()
    extends openlayersLib.openlayersMod.Observable
  
  @js.native
  class Overlay protected ()
    extends openlayersLib.openlayersMod.Overlay {
    /**
      * @classdesc
      * An element to be displayed over the map and attached to a single map
      * location.  Like {@link ol.control.Control}, Overlays are visible widgets.
      * Unlike Controls, they are not in a fixed position on the screen, but are tied
      * to a geographical coordinate, so panning the map will move an Overlay but not
      * a Control.
      *
      * Example:
      *
      *     var popup = new ol.Overlay({
      *       element: document.getElementById('popup')
      *     });
      *     popup.setPosition(coordinate);
      *     map.addOverlay(popup);
      *
      * @param options Overlay options.
      * @api stable
      */
    def this(options: openlayersLib.openlayersMod.olxNs.OverlayOptions) = this()
  }
  
  @js.native
  class Sphere protected ()
    extends openlayersLib.openlayersMod.Sphere {
    /**
      * @classdesc
      * Class to create objects that can be used with {@link
      * ol.geom.Polygon.circular}.
      *
      * For example to create a sphere whose radius is equal to the semi-major
      * axis of the WGS84 ellipsoid:
      *
      * ```js
      * var wgs84Sphere= new ol.Sphere(6378137);
      * ```
      *
      * @param radius Radius.
      * @api
      */
    def this(radius: scala.Double) = this()
  }
  
  @js.native
  class Tile protected ()
    extends openlayersLib.openlayersMod.Tile {
    /**
      * @classdesc
      * Base class for tiles.
      *
      * @param tileCoord Tile coordinate.
      * @param state State.
      */
    def this(tileCoord: openlayersLib.openlayersMod.TileCoord, state: openlayersLib.openlayersMod.TileNs.State) = this()
  }
  
  @js.native
  class VectorTile protected ()
    extends openlayersLib.openlayersMod.VectorTile {
    /**
      * @param tileCoord Tile coordinate.
      * @param state State.
      * @param src Data source url.
      * @param format Feature format.
      * @param tileLoadFunction Tile load function.
      */
    def this(tileCoord: openlayersLib.openlayersMod.TileCoord, state: openlayersLib.openlayersMod.TileNs.State, src: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature, tileLoadFunction: openlayersLib.openlayersMod.TileLoadFunctionType) = this()
  }
  
  @js.native
  /**
    * @classdesc
    * An ol.View object represents a simple 2D view of the map.
    *
    * This is the object to act upon to change the center, resolution,
    * and rotation of the map.
    *
    * ### The view states
    *
    * An `ol.View` is determined by three states: `center`, `resolution`,
    * and `rotation`. Each state has a corresponding getter and setter, e.g.
    * `getCenter` and `setCenter` for the `center` state.
    *
    * An `ol.View` has a `projection`. The projection determines the
    * coordinate system of the center, and its units determine the units of the
    * resolution (projection units per pixel). The default projection is
    * Spherical Mercator (EPSG:3857).
    *
    * ### The constraints
    *
    * `setCenter`, `setResolution` and `setRotation` can be used to change the
    * states of the view. Any value can be passed to the setters. And the value
    * that is passed to a setter will effectively be the value set in the view,
    * and returned by the corresponding getter.
    *
    * But an `ol.View` object also has a *resolution constraint*, a
    * *rotation constraint* and a *center constraint*.
    *
    * As said above, no constraints are applied when the setters are used to set
    * new states for the view. Applying constraints is done explicitly through
    * the use of the `constrain*` functions (`constrainResolution` and
    * `constrainRotation` and `constrainCenter`).
    *
    * The main users of the constraints are the interactions and the
    * controls. For example, double-clicking on the map changes the view to
    * the "next" resolution. And releasing the fingers after pinch-zooming
    * snaps to the closest resolution (with an animation).
    *
    * The *resolution constraint* snaps to specific resolutions. It is
    * determined by the following options: `resolutions`, `maxResolution`,
    * `maxZoom`, and `zoomFactor`. If `resolutions` is set, the other three
    * options are ignored. See documentation for each option for more
    * information.
    *
    * The *rotation constraint* snaps to specific angles. It is determined
    * by the following options: `enableRotation` and `constrainRotation`.
    * By default the rotation value is snapped to zero when approaching the
    * horizontal.
    *
    * The *center constraint* is determined by the `extent` option. By
    * default the center is not constrained at all.
    *
    * @param opt_options View options.
    * @api stable
    */
  class View ()
    extends openlayersLib.openlayersMod.View {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.ViewOptions) = this()
  }
  
  def inherits(childCtor: js.Function0[_], parentCtor: js.Function0[_]): scala.Unit = js.native
  @JSName("Collection")
  @js.native
  object CollectionNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.Collection} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_element Element.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.CollectionNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.Collection} instances are instances of this
        * type.
        *
        * @param type Type.
        * @param opt_element Element.
        */
      def this(`type`: openlayersLib.openlayersMod.CollectionNs.EventType) = this()
      def this(`type`: openlayersLib.openlayersMod.CollectionNs.EventType, opt_element: js.Any) = this()
    }
    
  }
  
  @js.native
  object Observable extends js.Object {
    def unByKey(key: js.Array[openlayersLib.openlayersMod.EventsKey]): scala.Unit = js.native
    /**
      * Removes an event listener using the key returned by `on()` or `once()`.
      * @param key The key returned by `on()`
      *     or `once()` (or an array of keys).
      * @api stable
      */
    def unByKey(key: openlayersLib.openlayersMod.EventsKey): scala.Unit = js.native
  }
  
  @js.native
  object Sphere extends js.Object {
    /**
      * Get the spherical area of a geometry.  This is the area (in meters) assuming
      * that polygon edges are segments of great circles on a sphere.
      * @param geometry A geometry.
      * @param opt_options Options for the area
      *     calculation.  By default, geometries are assumed to be in 'EPSG:3857'.
      *     You can change this by providing a `projection` option.
      * @return The spherical area (in square meters).
      * @api
      */
    def getArea(geometry: openlayersLib.openlayersMod.geomNs.Geometry): scala.Double = js.native
    def getArea(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.SphereMetricOptions
    ): scala.Double = js.native
    /**
      * Get the spherical length of a geometry.  This length is the sum of the
      * great circle distances between coordinates.  For polygons, the length is
      * the sum of all rings.  For points, the length is zero.  For multi-part
      * geometries, the length is the sum of the length of each part.
      * @param geometry A geometry.
      * @param opt_options Options for the length
      *     calculation.  By default, geometries are assumed to be in 'EPSG:3857'.
      *     You can change this by providing a `projection` option.
      * @return The spherical length (in meters).
      * @api
      */
    def getLength(geometry: openlayersLib.openlayersMod.geomNs.Geometry): scala.Double = js.native
    def getLength(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.SphereMetricOptions
    ): scala.Double = js.native
  }
  
  @JSName("color")
  @js.native
  object colorNs extends js.Object {
    def asArray(color: java.lang.String): openlayersLib.openlayersMod.Color = js.native
    /**
      * Return the color as an array. This function maintains a cache of calculated
      * arrays which means the result should not be modified.
      * @param color Color.
      * @return Color.
      * @api
      */
    def asArray(color: openlayersLib.openlayersMod.Color): openlayersLib.openlayersMod.Color = js.native
    def asString(color: java.lang.String): java.lang.String = js.native
    /**
      * Return the color as an rgba string.
      * @param color Color.
      * @return Rgba string.
      * @api
      */
    def asString(color: openlayersLib.openlayersMod.Color): java.lang.String = js.native
  }
  
  @JSName("colorlike")
  @js.native
  object colorlikeNs extends js.Object {
    /**
      * @param color Color.
      * @return The color as an ol.ColorLike
      * @api
      */
    def asColorLike(color: openlayersLib.openlayersMod.Color | openlayersLib.openlayersMod.ColorLike): openlayersLib.openlayersMod.ColorLike = js.native
  }
  
  @JSName("control")
  @js.native
  object controlNs extends js.Object {
    /**
      * @classdesc
      * Control to show all the attributions associated with the layer sources
      * in the map. This control is one of the default controls included in maps.
      * By default it will show in the bottom right portion of the map, but this can
      * be changed by using a css selector for `.ol-attribution`.
      *
      * @param opt_options Attribution options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Control to show all the attributions associated with the layer sources
      * in the map. This control is one of the default controls included in maps.
      * By default it will show in the bottom right portion of the map, but this can
      * be changed by using a css selector for `.ol-attribution`.
      *
      * @param opt_options Attribution options.
      * @api stable
      */
    class Attribution ()
      extends openlayersLib.openlayersMod.controlNs.Attribution {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.AttributionOptions) = this()
    }
    
    /**
      * @classdesc
      * A control is a visible widget with a DOM element in a fixed position on the
      * screen. They can involve user input (buttons), or be informational only;
      * the position is determined using CSS. By default these are placed in the
      * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
      * any outside DOM element.
      *
      * This is the base class for controls. You can use it for simple custom
      * controls by creating the element with listeners, creating an instance:
      * ```js
      * var myControl = new ol.control.Control({element: myElement});
      * ```
      * and then adding this to the map.
      *
      * The main advantage of having this as a control rather than a simple separate
      * DOM element is that preventing propagation is handled for you. Controls
      * will also be `ol.Object`s in a `ol.Collection`, so you can use their
      * methods.
      *
      * You can also extend this base for your own control class. See
      * examples/custom-controls for an example of how to do this.
      *
      * @param options Control options.
      * @api stable
      */
    @js.native
    class Control protected ()
      extends openlayersLib.openlayersMod.controlNs.Control {
      /**
        * @classdesc
        * A control is a visible widget with a DOM element in a fixed position on the
        * screen. They can involve user input (buttons), or be informational only;
        * the position is determined using CSS. By default these are placed in the
        * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
        * any outside DOM element.
        *
        * This is the base class for controls. You can use it for simple custom
        * controls by creating the element with listeners, creating an instance:
        * ```js
        * var myControl = new ol.control.Control({element: myElement});
        * ```
        * and then adding this to the map.
        *
        * The main advantage of having this as a control rather than a simple separate
        * DOM element is that preventing propagation is handled for you. Controls
        * will also be `ol.Object`s in a `ol.Collection`, so you can use their
        * methods.
        *
        * You can also extend this base for your own control class. See
        * examples/custom-controls for an example of how to do this.
        *
        * @param options Control options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.controlNs.ControlOptions) = this()
    }
    
    /**
      * @classdesc
      * Provides a button that when clicked fills up the full screen with the map.
      * The full screen source element is by default the element containing the map viewport unless
      * overriden by providing the `source` option. In which case, the dom
      * element introduced using this parameter will be displayed in full screen.
      *
      * When in full screen mode, a close button is shown to exit full screen mode.
      * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
      * toggle the map in full screen mode.
      *
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Provides a button that when clicked fills up the full screen with the map.
      * The full screen source element is by default the element containing the map viewport unless
      * overriden by providing the `source` option. In which case, the dom
      * element introduced using this parameter will be displayed in full screen.
      *
      * When in full screen mode, a close button is shown to exit full screen mode.
      * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
      * toggle the map in full screen mode.
      *
      *
      * @param opt_options Options.
      * @api stable
      */
    class FullScreen ()
      extends openlayersLib.openlayersMod.controlNs.FullScreen {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.FullScreenOptions) = this()
    }
    
    /**
      * @classdesc
      * A control to show the 2D coordinates of the mouse cursor. By default, these
      * are in the view projection, but can be in any supported projection.
      * By default the control is shown in the top right corner of the map, but this
      * can be changed by using the css selector `.ol-mouse-position`.
      *
      * @param opt_options Mouse position
      *     options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A control to show the 2D coordinates of the mouse cursor. By default, these
      * are in the view projection, but can be in any supported projection.
      * By default the control is shown in the top right corner of the map, but this
      * can be changed by using the css selector `.ol-mouse-position`.
      *
      * @param opt_options Mouse position
      *     options.
      * @api stable
      */
    class MousePosition ()
      extends openlayersLib.openlayersMod.controlNs.MousePosition {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.MousePositionOptions) = this()
    }
    
    /**
      * Create a new control with a map acting as an overview map for an other
      * defined map.
      * @param opt_options OverviewMap options.
      * @api
      */
    @js.native
    /**
      * Create a new control with a map acting as an overview map for an other
      * defined map.
      * @param opt_options OverviewMap options.
      * @api
      */
    class OverviewMap ()
      extends openlayersLib.openlayersMod.controlNs.OverviewMap {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.OverviewMapOptions) = this()
    }
    
    /**
      * @classdesc
      * A button control to reset rotation to 0.
      * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
      * selector is added to the button when the rotation is 0.
      *
      * @param opt_options Rotate options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A button control to reset rotation to 0.
      * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
      * selector is added to the button when the rotation is 0.
      *
      * @param opt_options Rotate options.
      * @api stable
      */
    class Rotate ()
      extends openlayersLib.openlayersMod.controlNs.Rotate {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.RotateOptions) = this()
    }
    
    /**
      * @classdesc
      * A control displaying rough y-axis distances, calculated for the center of the
      * viewport. For conformal projections (e.g. EPSG:3857, the default view
      * projection in OpenLayers), the scale is valid for all directions.
      * No scale line will be shown when the y-axis distance of a pixel at the
      * viewport center cannot be calculated in the view projection.
      * By default the scale line will show in the bottom left portion of the map,
      * but this can be changed by using the css selector `.ol-scale-line`.
      *
      * @param opt_options Scale line options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A control displaying rough y-axis distances, calculated for the center of the
      * viewport. For conformal projections (e.g. EPSG:3857, the default view
      * projection in OpenLayers), the scale is valid for all directions.
      * No scale line will be shown when the y-axis distance of a pixel at the
      * viewport center cannot be calculated in the view projection.
      * By default the scale line will show in the bottom left portion of the map,
      * but this can be changed by using the css selector `.ol-scale-line`.
      *
      * @param opt_options Scale line options.
      * @api stable
      */
    class ScaleLine ()
      extends openlayersLib.openlayersMod.controlNs.ScaleLine {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ScaleLineOptions) = this()
    }
    
    /**
      * @classdesc
      * A control with 2 buttons, one for zoom in and one for zoom out.
      * This control is one of the default controls of a map. To style this control
      * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
      *
      * @param opt_options Zoom options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A control with 2 buttons, one for zoom in and one for zoom out.
      * This control is one of the default controls of a map. To style this control
      * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
      *
      * @param opt_options Zoom options.
      * @api stable
      */
    class Zoom ()
      extends openlayersLib.openlayersMod.controlNs.Zoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * A slider type of control for zooming.
      *
      * Example:
      *
      *     map.addControl(new ol.control.ZoomSlider());
      *
      * @param opt_options Zoom slider options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A slider type of control for zooming.
      *
      * Example:
      *
      *     map.addControl(new ol.control.ZoomSlider());
      *
      * @param opt_options Zoom slider options.
      * @api stable
      */
    class ZoomSlider ()
      extends openlayersLib.openlayersMod.controlNs.ZoomSlider {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomSliderOptions) = this()
    }
    
    /**
      * @classdesc
      * A button control which, when pressed, changes the map view to a specific
      * extent. To style this control use the css selector `.ol-zoom-extent`.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * A button control which, when pressed, changes the map view to a specific
      * extent. To style this control use the css selector `.ol-zoom-extent`.
      *
      * @param opt_options Options.
      * @api stable
      */
    class ZoomToExtent ()
      extends openlayersLib.openlayersMod.controlNs.ZoomToExtent {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomToExtentOptions) = this()
    }
    
    /**
      * Set of controls included in maps by default. Unless configured otherwise,
      * this returns a collection containing an instance of each of the following
      * controls:
      * * {@link ol.control.Zoom}
      * * {@link ol.control.Rotate}
      * * {@link ol.control.Attribution}
      *
      * @param opt_options Defaults options.
      * @return Controls.
      * @api stable
      */
    def defaults(): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] = js.native
    def defaults(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.DefaultsOptions): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] = js.native
    /**
      * @classdesc
      * Control to show all the attributions associated with the layer sources
      * in the map. This control is one of the default controls included in maps.
      * By default it will show in the bottom right portion of the map, but this can
      * be changed by using a css selector for `.ol-attribution`.
      *
      * @param opt_options Attribution options.
      * @api stable
      */
    @js.native
    object Attribution extends js.Object {
      /**
        * Update the attribution element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
    /**
      * @classdesc
      * A control to show the 2D coordinates of the mouse cursor. By default, these
      * are in the view projection, but can be in any supported projection.
      * By default the control is shown in the top right corner of the map, but this
      * can be changed by using the css selector `.ol-mouse-position`.
      *
      * @param opt_options Mouse position
      *     options.
      * @api stable
      */
    @js.native
    object MousePosition extends js.Object {
      /**
        * Update the mouseposition element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
    /**
      * Create a new control with a map acting as an overview map for an other
      * defined map.
      * @param opt_options OverviewMap options.
      * @api
      */
    @js.native
    object OverviewMap extends js.Object {
      /**
        * Update the overview map element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
    /**
      * @classdesc
      * A button control to reset rotation to 0.
      * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
      * selector is added to the button when the rotation is 0.
      *
      * @param opt_options Rotate options.
      * @api stable
      */
    @js.native
    object Rotate extends js.Object {
      /**
        * Update the rotate control element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
    /**
      * @classdesc
      * A control displaying rough y-axis distances, calculated for the center of the
      * viewport. For conformal projections (e.g. EPSG:3857, the default view
      * projection in OpenLayers), the scale is valid for all directions.
      * No scale line will be shown when the y-axis distance of a pixel at the
      * viewport center cannot be calculated in the view projection.
      * By default the scale line will show in the bottom left portion of the map,
      * but this can be changed by using the css selector `.ol-scale-line`.
      *
      * @param opt_options Scale line options.
      * @api stable
      */
    @js.native
    object ScaleLine extends js.Object {
      /**
        * Update the scale line element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
    /**
      * @classdesc
      * A slider type of control for zooming.
      *
      * Example:
      *
      *     map.addControl(new ol.control.ZoomSlider());
      *
      * @param opt_options Zoom slider options.
      * @api stable
      */
    @js.native
    object ZoomSlider extends js.Object {
      /**
        * Update the zoomslider element.
        * @param mapEvent Map event.
        * @api
        */
      def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
    }
    
  }
  
  @JSName("coordinate")
  @js.native
  object coordinateNs extends js.Object {
    /**
      * Add `delta` to `coordinate`. `coordinate` is modified in place and returned
      * by the function.
      *
      * Example:
      *
      *     var coord = [7.85, 47.983333];
      *     ol.coordinate.add(coord, [-2, 4]);
      *     // coord is now [5.85, 51.983333]
      *
      * @param coordinate Coordinate.
      * @param delta Delta.
      * @return The input coordinate adjusted by the given delta.
      * @api stable
      */
    def add(coordinate: openlayersLib.openlayersMod.Coordinate, delta: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Returns a {@link ol.CoordinateFormatType} function that can be used to format
      * a {ol.Coordinate} to a string.
      *
      * Example without specifying the fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var stringifyFunc = ol.coordinate.createStringXY();
      *     var out = stringifyFunc(coord);
      *     // out is now '8, 48'
      *
      * Example with explicitly specifying 2 fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var stringifyFunc = ol.coordinate.createStringXY(2);
      *     var out = stringifyFunc(coord);
      *     // out is now '7.85, 47.98'
      *
      * @param opt_fractionDigits The number of digits to include
      *    after the decimal point. Default is `0`.
      * @return Coordinate format.
      * @api stable
      */
    def createStringXY(): openlayersLib.openlayersMod.CoordinateFormatType = js.native
    def createStringXY(opt_fractionDigits: scala.Double): openlayersLib.openlayersMod.CoordinateFormatType = js.native
    /**
      * Transforms the given {@link ol.Coordinate} to a string using the given string
      * template. The strings `{x}` and `{y}` in the template will be replaced with
      * the first and second coordinate values respectively.
      *
      * Example without specifying the fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var template = 'Coordinate is ({x}|{y}).';
      *     var out = ol.coordinate.format(coord, template);
      *     // out is now 'Coordinate is (8|48).'
      *
      * Example explicitly specifying the fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var template = 'Coordinate is ({x}|{y}).';
      *     var out = ol.coordinate.format(coord, template, 2);
      *     // out is now 'Coordinate is (7.85|47.98).'
      *
      * @param coordinate Coordinate.
      * @param template A template string with `{x}` and `{y}` placeholders
      *     that will be replaced by first and second coordinate values.
      * @param opt_fractionDigits The number of digits to include
      *    after the decimal point. Default is `0`.
      * @return Formatted coordinate.
      * @api stable
      */
    def format(coordinate: openlayersLib.openlayersMod.Coordinate, template: java.lang.String): java.lang.String = js.native
    def format(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      template: java.lang.String,
      opt_fractionDigits: scala.Double
    ): java.lang.String = js.native
    /**
      * Rotate `coordinate` by `angle`. `coordinate` is modified in place and
      * returned by the function.
      *
      * Example:
      *
      *     var coord = [7.85, 47.983333];
      *     var rotateRadians = Math.PI / 2; // 90 degrees
      *     ol.coordinate.rotate(coord, rotateRadians);
      *     // coord is now [-47.983333, 7.85]
      *
      * @param coordinate Coordinate.
      * @param angle Angle in radian.
      * @return Coordinate.
      * @api stable
      */
    def rotate(coordinate: openlayersLib.openlayersMod.Coordinate, angle: scala.Double): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Format a geographic coordinate with the hemisphere, degrees, minutes, and
      * seconds.
      *
      * Example without specifying fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var out = ol.coordinate.toStringHDMS(coord);
      *     // out is now '47° 58′ 60″ N 7° 50′ 60″ E'
      *
      * Example explicitly specifying 1 fractional digit:
      *
      *     var coord = [7.85, 47.983333];
      *     var out = ol.coordinate.toStringHDMS(coord, 1);
      *     // out is now '47° 58′ 60.0″ N 7° 50′ 60.0″ E'
      *
      * @param coordinate Coordinate.
      * @param opt_fractionDigits The number of digits to include
      *    after the decimal point. Default is `0`.
      * @return Hemisphere, degrees, minutes and seconds.
      * @api stable
      */
    def toStringHDMS(): java.lang.String = js.native
    def toStringHDMS(coordinate: openlayersLib.openlayersMod.Coordinate): java.lang.String = js.native
    def toStringHDMS(coordinate: openlayersLib.openlayersMod.Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
    /**
      * Format a coordinate as a comma delimited string.
      *
      * Example without specifying fractional digits:
      *
      *     var coord = [7.85, 47.983333];
      *     var out = ol.coordinate.toStringXY(coord);
      *     // out is now '8, 48'
      *
      * Example explicitly specifying 1 fractional digit:
      *
      *     var coord = [7.85, 47.983333];
      *     var out = ol.coordinate.toStringXY(coord, 1);
      *     // out is now '7.8, 48.0'
      *
      * @param coordinate Coordinate.
      * @param opt_fractionDigits The number of digits to include
      *    after the decimal point. Default is `0`.
      * @return XY.
      * @api stable
      */
    def toStringXY(): java.lang.String = js.native
    def toStringXY(coordinate: openlayersLib.openlayersMod.Coordinate): java.lang.String = js.native
    def toStringXY(coordinate: openlayersLib.openlayersMod.Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
  }
  
  @JSName("easing")
  @js.native
  object easingNs extends js.Object {
    /**
      * Start slow and speed up.
      * @param t Input between 0 and 1.
      * @return Output between 0 and 1.
      * @api
      */
    def easeIn(t: scala.Double): scala.Double = js.native
    /**
      * Start fast and slow down.
      * @param t Input between 0 and 1.
      * @return Output between 0 and 1.
      * @api
      */
    def easeOut(t: scala.Double): scala.Double = js.native
    /**
      * Start slow, speed up, and then slow down again.
      * @param t Input between 0 and 1.
      * @return Output between 0 and 1.
      * @api
      */
    def inAndOut(t: scala.Double): scala.Double = js.native
    /**
      * Maintain a constant speed over time.
      * @param t Input between 0 and 1.
      * @return Output between 0 and 1.
      * @api
      */
    def linear(t: scala.Double): scala.Double = js.native
    /**
      * Start slow, speed up, and at the very end slow down again.  This has the
      * same general behavior as {@link ol.easing.inAndOut}, but the final slowdown
      * is delayed.
      * @param t Input between 0 and 1.
      * @return Output between 0 and 1.
      * @api
      */
    def upAndDown(t: scala.Double): scala.Double = js.native
  }
  
  @JSName("events")
  @js.native
  object eventsNs extends js.Object {
    /**
      * @classdesc
      * Stripped down implementation of the W3C DOM Level 2 Event interface.
      * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
      *
      * This implementation only provides `type` and `target` properties, and
      * `stopPropagation` and `preventDefault` methods. It is meant as base class
      * for higher level events defined in the library, and works with
      * {@link ol.events.EventTarget}.
      *
      * @param type Type.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Stripped down implementation of the W3C DOM Level 2 Event interface.
        * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
        *
        * This implementation only provides `type` and `target` properties, and
        * `stopPropagation` and `preventDefault` methods. It is meant as base class
        * for higher level events defined in the library, and works with
        * {@link ol.events.EventTarget}.
        *
        * @param type Type.
        */
      def this(`type`: java.lang.String) = this()
    }
    
    /**
      * @classdesc
      * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
      * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
      *
      * There are two important simplifications compared to the specification:
      *
      * 1. The handling of `useCapture` in `addEventListener` and
      *    `removeEventListener`. There is no real capture model.
      * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
      *    There is no event target hierarchy. When a listener calls
      *    `stopPropagation` or `preventDefault` on an event object, it means that no
      *    more listeners after this one will be called. Same as when the listener
      *    returns false.
      *
      */
    @js.native
    /**
      * @classdesc
      * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
      * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
      *
      * There are two important simplifications compared to the specification:
      *
      * 1. The handling of `useCapture` in `addEventListener` and
      *    `removeEventListener`. There is no real capture model.
      * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
      *    There is no event target hierarchy. When a listener calls
      *    `stopPropagation` or `preventDefault` on an event object, it means that no
      *    more listeners after this one will be called. Same as when the listener
      *    returns false.
      *
      */
    class EventTarget ()
      extends openlayersLib.openlayersMod.eventsNs.EventTarget
    
    @JSName("condition")
    @js.native
    object conditionNs extends js.Object {
      /**
        * Return `true` if only the alt-key is pressed, `false` otherwise (e.g. when
        * additionally the shift-key is pressed).
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if only the alt key is pressed.
        * @api stable
        */
      def altKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if only the alt-key and shift-key is pressed, `false` otherwise
        * (e.g. when additionally the platform-modifier-key is pressed).
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if only the alt and shift keys are pressed.
        * @api stable
        */
      def altShiftKeysOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return always true.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True.
        * @api stable
        */
      def always(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the event is a `click` event, `false` otherwise.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the event is a map `click` event.
        * @api stable
        */
      def click(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the event is a map `dblclick` event, `false` otherwise.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the event is a map `dblclick` event.
        * @api stable
        */
      def doubleClick(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the event originates from a mouse device.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the event originates from a mouse device.
        * @api stable
        */
      def mouseOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return always false.
        *
        * @param mapBrowserEvent Map browser event.
        * @return False.
        * @api stable
        */
      def never(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if no modifier key (alt-, shift- or platform-modifier-key) is
        * pressed.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True only if there no modifier keys are pressed.
        * @api stable
        */
      def noModifierKeys(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if only the platform-modifier-key (the meta-key on Mac,
        * ctrl-key otherwise) is pressed, `false` otherwise (e.g. when additionally
        * the shift-key is pressed).
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if only the platform modifier key is pressed.
        * @api stable
        */
      def platformModifierKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the browser event is a `pointermove` event, `false`
        * otherwise.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the browser event is a `pointermove` event.
        * @api
        */
      def pointerMove(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the event originates from a primary pointer in
        * contact with the surface or if the left mouse button is pressed.
        * @see http://www.w3.org/TR/pointerevents/#button-states
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the event originates from a primary pointer.
        * @api
        */
      def primaryAction(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if only the shift-key is pressed, `false` otherwise (e.g. when
        * additionally the alt-key is pressed).
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if only the shift key is pressed.
        * @api stable
        */
      def shiftKeyOnly(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the event is a map `singleclick` event, `false` otherwise.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True if the event is a map `singleclick` event.
        * @api stable
        */
      def singleClick(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
      /**
        * Return `true` if the target element is not editable, i.e. not a `<input>`-,
        * `<select>`- or `<textarea>`-element, `false` otherwise.
        *
        * @param mapBrowserEvent Map browser event.
        * @return True only if the target element is not editable.
        * @api
        */
      def targetNotEditable(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
  }
  
  @JSName("extent")
  @js.native
  object extentNs extends js.Object {
    /**
      * Apply a transform function to the extent.
      * @param extent Extent.
      * @param transformFn Transform function.  Called with
      * [minX, minY, maxX, maxY] extent coordinates.
      * @param opt_extent Destination extent.
      * @return Extent.
      * @api stable
      */
    def applyTransform(
      extent: openlayersLib.openlayersMod.Extent,
      transformFn: openlayersLib.openlayersMod.TransformFunction
    ): openlayersLib.openlayersMod.Extent = js.native
    def applyTransform(
      extent: openlayersLib.openlayersMod.Extent,
      transformFn: openlayersLib.openlayersMod.TransformFunction,
      opt_extent: openlayersLib.openlayersMod.Extent
    ): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Build an extent that includes all given coordinates.
      *
      * @param coordinates Coordinates.
      * @return Bounding extent.
      * @api stable
      */
    def boundingExtent(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Return extent increased by the provided value.
      * @param extent Extent.
      * @param value The amount by which the extent should be buffered.
      * @param opt_extent Extent.
      * @return Extent.
      * @api stable
      */
    def buffer(extent: openlayersLib.openlayersMod.Extent, value: scala.Double): openlayersLib.openlayersMod.Extent = js.native
    def buffer(
      extent: openlayersLib.openlayersMod.Extent,
      value: scala.Double,
      opt_extent: openlayersLib.openlayersMod.Extent
    ): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Check if the passed coordinate is contained or on the edge of the extent.
      *
      * @param extent Extent.
      * @param coordinate Coordinate.
      * @return The coordinate is contained in the extent.
      * @api stable
      */
    def containsCoordinate(extent: openlayersLib.openlayersMod.Extent, coordinate: openlayersLib.openlayersMod.Coordinate): scala.Boolean = js.native
    /**
      * Check if one extent contains another.
      *
      * An extent is deemed contained if it lies completely within the other extent,
      * including if they share one or more edges.
      *
      * @param extent1 Extent 1.
      * @param extent2 Extent 2.
      * @return The second extent is contained by or on the edge of the
      *     first.
      * @api stable
      */
    def containsExtent(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
    /**
      * Check if the passed coordinate is contained or on the edge of the extent.
      *
      * @param extent Extent.
      * @param x X coordinate.
      * @param y Y coordinate.
      * @return The x, y values are contained in the extent.
      * @api stable
      */
    def containsXY(extent: openlayersLib.openlayersMod.Extent, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    /**
      * Create an empty extent.
      * @return Empty extent.
      * @api stable
      */
    def createEmpty(): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Determine if two extents are equivalent.
      * @param extent1 Extent 1.
      * @param extent2 Extent 2.
      * @return The two extents are equivalent.
      * @api stable
      */
    def equals(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
    /**
      * Modify an extent to include another extent.
      * @param extent1 The extent to be modified.
      * @param extent2 The extent that will be included in the first.
      * @return A reference to the first (extended) extent.
      * @api stable
      */
    def extend(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Get the bottom left coordinate of an extent.
      * @param extent Extent.
      * @return Bottom left coordinate.
      * @api stable
      */
    def getBottomLeft(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the bottom right coordinate of an extent.
      * @param extent Extent.
      * @return Bottom right coordinate.
      * @api stable
      */
    def getBottomRight(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the center coordinate of an extent.
      * @param extent Extent.
      * @return Center.
      * @api stable
      */
    def getCenter(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the height of an extent.
      * @param extent Extent.
      * @return Height.
      * @api stable
      */
    def getHeight(extent: openlayersLib.openlayersMod.Extent): scala.Double = js.native
    /**
      * Get the intersection of two extents.
      * @param extent1 Extent 1.
      * @param extent2 Extent 2.
      * @param opt_extent Optional extent to populate with intersection.
      * @return Intersecting extent.
      * @api stable
      */
    def getIntersection(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Extent = js.native
    def getIntersection(
      extent1: openlayersLib.openlayersMod.Extent,
      extent2: openlayersLib.openlayersMod.Extent,
      opt_extent: openlayersLib.openlayersMod.Extent
    ): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Get the size (width, height) of an extent.
      * @param extent The extent.
      * @return The extent size.
      * @api stable
      */
    def getSize(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Size = js.native
    /**
      * Get the top left coordinate of an extent.
      * @param extent Extent.
      * @return Top left coordinate.
      * @api stable
      */
    def getTopLeft(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the top right coordinate of an extent.
      * @param extent Extent.
      * @return Top right coordinate.
      * @api stable
      */
    def getTopRight(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Get the width of an extent.
      * @param extent Extent.
      * @return Width.
      * @api stable
      */
    def getWidth(extent: openlayersLib.openlayersMod.Extent): scala.Double = js.native
    /**
      * Determine if one extent intersects another.
      * @param extent1 Extent 1.
      * @param extent2 Extent.
      * @return The two extents intersect.
      * @api stable
      */
    def intersects(extent1: openlayersLib.openlayersMod.Extent, extent2: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
    /**
      * Determine if an extent is empty.
      * @param extent Extent.
      * @return Is empty.
      * @api stable
      */
    def isEmpty(extent: openlayersLib.openlayersMod.Extent): scala.Boolean = js.native
  }
  
  @JSName("featureloader")
  @js.native
  object featureloaderNs extends js.Object {
    /**
      * Create an XHR feature loader for a `url` and `format`. The feature loader
      * loads features (with XHR), parses the features, and adds them to the
      * vector tile.
      * @param url Feature URL service.
      * @param format Feature format.
      * @return The feature loader.
      * @api
      */
    def tile(url: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature): openlayersLib.openlayersMod.FeatureLoader = js.native
    def tile(
      url: openlayersLib.openlayersMod.FeatureUrlFunction,
      format: openlayersLib.openlayersMod.formatNs.Feature
    ): openlayersLib.openlayersMod.FeatureLoader = js.native
    /**
      * Create an XHR feature loader for a `url` and `format`. The feature loader
      * loads features (with XHR), parses the features, and adds them to the
      * vector source.
      * @param url Feature URL service.
      * @param format Feature format.
      * @return The feature loader.
      * @api
      */
    def xhr(url: java.lang.String, format: openlayersLib.openlayersMod.formatNs.Feature): openlayersLib.openlayersMod.FeatureLoader = js.native
    def xhr(
      url: openlayersLib.openlayersMod.FeatureUrlFunction,
      format: openlayersLib.openlayersMod.formatNs.Feature
    ): openlayersLib.openlayersMod.FeatureLoader = js.native
  }
  
  @JSName("format")
  @js.native
  object formatNs extends js.Object {
    /**
      * @classdesc
      * Feature format for reading and writing data in the EsriJSON format.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the EsriJSON format.
      *
      * @param opt_options Options.
      * @api
      */
    class EsriJSON ()
      extends openlayersLib.openlayersMod.formatNs.EsriJSON {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.EsriJSONOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for feature formats.
      * {ol.format.Feature} subclasses provide the ability to decode and encode
      * {@link ol.Feature} objects from a variety of commonly used geospatial
      * file formats.  See the documentation for each format for more details.
      *
      * @api stable
      */
    /* tslint:disable-next-line:no-unnecessary-class */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for feature formats.
      * {ol.format.Feature} subclasses provide the ability to decode and encode
      * {@link ol.Feature} objects from a variety of commonly used geospatial
      * file formats.  See the documentation for each format for more details.
      *
      * @api stable
      */
    class Feature ()
      extends openlayersLib.openlayersMod.formatNs.Feature
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format
      * version 3.1.1.
      * Currently only supports GML 3.1.1 Simple Features profile.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format
      * version 3.1.1.
      * Currently only supports GML 3.1.1 Simple Features profile.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    class GML ()
      extends openlayersLib.openlayersMod.formatNs.GML {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format,
      * version 2.1.2.
      *
      * @param opt_options Optional configuration object.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format,
      * version 2.1.2.
      *
      * @param opt_options Optional configuration object.
      * @api
      */
    class GML2 ()
      extends openlayersLib.openlayersMod.formatNs.GML2 {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format
      * version 3.1.1.
      * Currently only supports GML 3.1.1 Simple Features profile.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the GML format
      * version 3.1.1.
      * Currently only supports GML 3.1.1 Simple Features profile.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api
      */
    class GML3 ()
      extends openlayersLib.openlayersMod.formatNs.GML3 {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Feature base format for reading and writing data in the GML format.
      * This class cannot be instantiated, it contains only base content that
      * is shared with versioned format classes ol.format.GML2 and
      * ol.format.GML3.
      *
      * @param opt_options
      *     Optional configuration object.
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Feature base format for reading and writing data in the GML format.
      * This class cannot be instantiated, it contains only base content that
      * is shared with versioned format classes ol.format.GML2 and
      * ol.format.GML3.
      *
      * @param opt_options
      *     Optional configuration object.
      */
    class GMLBase ()
      extends openlayersLib.openlayersMod.formatNs.GMLBase {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the GPX format.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the GPX format.
      *
      * @param opt_options Options.
      * @api stable
      */
    class GPX ()
      extends openlayersLib.openlayersMod.formatNs.GPX {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GPXOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the GeoJSON format.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the GeoJSON format.
      *
      * @param opt_options Options.
      * @api stable
      */
    class GeoJSON ()
      extends openlayersLib.openlayersMod.formatNs.GeoJSON {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GeoJSONOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for `*.igc` flight recording files.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Feature format for `*.igc` flight recording files.
      *
      * @param opt_options Options.
      * @api
      */
    class IGC ()
      extends openlayersLib.openlayersMod.formatNs.IGC {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.IGCOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for JSON feature formats.
      *
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for JSON feature formats.
      *
      */
    class JSONFeature ()
      extends openlayersLib.openlayersMod.formatNs.JSONFeature
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the KML format.
      *
      * Note that the KML format uses the URL() constructor. Older browsers such as IE
      * which do not support this will need a URL polyfill to be loaded before use.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the KML format.
      *
      * Note that the KML format uses the URL() constructor. Older browsers such as IE
      * which do not support this will need a URL polyfill to be loaded before use.
      *
      * @param opt_options Options.
      * @api stable
      */
    class KML ()
      extends openlayersLib.openlayersMod.formatNs.KML {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.KMLOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading data in the Mapbox MVT format.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading data in the Mapbox MVT format.
      *
      * @param opt_options Options.
      * @api
      */
    class MVT ()
      extends openlayersLib.openlayersMod.formatNs.MVT {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.MVTOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading data in the
      * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
      *
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading data in the
      * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
      *
      * @api stable
      */
    class OSMXML ()
      extends openlayersLib.openlayersMod.formatNs.OSMXML
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the Encoded
      * Polyline Algorithm Format.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the Encoded
      * Polyline Algorithm Format.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    class Polyline ()
      extends openlayersLib.openlayersMod.formatNs.Polyline {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.PolylineOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for text feature formats.
      *
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for text feature formats.
      *
      */
    class TextFeature ()
      extends openlayersLib.openlayersMod.formatNs.TextFeature
    
    /**
      * @classdesc
      * Feature format for reading data in the TopoJSON format.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading data in the TopoJSON format.
      *
      * @param opt_options Options.
      * @api stable
      */
    class TopoJSON ()
      extends openlayersLib.openlayersMod.formatNs.TopoJSON {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.TopoJSONOptions) = this()
    }
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the WFS format.
      * By default, supports WFS version 1.1.0. You can pass a GML format
      * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
      * Also see {@link ol.format.GMLBase} which is used by this format.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Feature format for reading and writing data in the WFS format.
      * By default, supports WFS version 1.1.0. You can pass a GML format
      * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
      * Also see {@link ol.format.GMLBase} which is used by this format.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    class WFS ()
      extends openlayersLib.openlayersMod.formatNs.WFS {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WFSOptions) = this()
    }
    
    /**
      * @classdesc
      * Geometry format for reading and writing data in the `WellKnownText` (WKT)
      * format.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Geometry format for reading and writing data in the `WellKnownText` (WKT)
      * format.
      *
      * @param opt_options Options.
      * @api stable
      */
    class WKT ()
      extends openlayersLib.openlayersMod.formatNs.WKT {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WKTOptions) = this()
    }
    
    /**
      * @classdesc
      * Format for reading WMS capabilities data
      *
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Format for reading WMS capabilities data
      *
      * @api
      */
    class WMSCapabilities ()
      extends openlayersLib.openlayersMod.formatNs.WMSCapabilities
    
    /**
      * @classdesc
      * Format for reading WMSGetFeatureInfo format. It uses
      * {@link ol.format.GML2} to read features.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Format for reading WMSGetFeatureInfo format. It uses
      * {@link ol.format.GML2} to read features.
      *
      * @param opt_options Options.
      * @api
      */
    class WMSGetFeatureInfo ()
      extends openlayersLib.openlayersMod.formatNs.WMSGetFeatureInfo {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WMSGetFeatureInfoOptions) = this()
    }
    
    /**
      * @classdesc
      * Format for reading WMTS capabilities data.
      *
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Format for reading WMTS capabilities data.
      *
      * @api
      */
    class WMTSCapabilities ()
      extends openlayersLib.openlayersMod.formatNs.WMTSCapabilities
    
    /**
      * @classdesc
      * Generic format for reading non-feature XML data
      *
      * @struct
      */
    /* tslint:disable-next-line:no-unnecessary-class */
    @js.native
    /**
      * @classdesc
      * Generic format for reading non-feature XML data
      *
      * @struct
      */
    class XML ()
      extends openlayersLib.openlayersMod.formatNs.XML
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for XML feature formats.
      *
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for XML feature formats.
      *
      */
    class XMLFeature ()
      extends openlayersLib.openlayersMod.formatNs.XMLFeature
    
    /**
      * @classdesc
      * Feature format for reading and writing data in the Encoded
      * Polyline Algorithm Format.
      *
      * @param opt_options
      *     Optional configuration object.
      * @api stable
      */
    @js.native
    object Polyline extends js.Object {
      /**
        * Decode a list of n-dimensional points from an encoded string
        *
        * @param encoded An encoded string.
        * @param stride The number of dimension of the points in the
        *     encoded string.
        * @param opt_factor The factor by which the resulting numbers will
        *     be divided. Default is `1e5`.
        * @return A list of n-dimensional points.
        * @api
        */
      def decodeDeltas(encoded: java.lang.String, stride: scala.Double): js.Array[scala.Double] = js.native
      def decodeDeltas(encoded: java.lang.String, stride: scala.Double, opt_factor: scala.Double): js.Array[scala.Double] = js.native
      /**
        * Decode a list of floating point numbers from an encoded string
        *
        * @param encoded An encoded string.
        * @param opt_factor The factor by which the result will be divided.
        *     Default is `1e5`.
        * @return A list of floating point numbers.
        * @api
        */
      def decodeFloats(encoded: java.lang.String): js.Array[scala.Double] = js.native
      def decodeFloats(encoded: java.lang.String, opt_factor: scala.Double): js.Array[scala.Double] = js.native
      /**
        * Encode a list of n-dimensional points and return an encoded string
        *
        * Attention: This function will modify the passed array!
        *
        * @param numbers A list of n-dimensional points.
        * @param stride The number of dimension of the points in the list.
        * @param opt_factor The factor by which the numbers will be
        *     multiplied. The remaining decimal places will get rounded away.
        *     Default is `1e5`.
        * @return The encoded string.
        * @api
        */
      def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double): java.lang.String = js.native
      def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double, opt_factor: scala.Double): java.lang.String = js.native
      /**
        * Encode a list of floating point numbers and return an encoded string
        *
        * Attention: This function will modify the passed array!
        *
        * @param numbers A list of floating point numbers.
        * @param opt_factor The factor by which the numbers will be
        *     multiplied. The remaining decimal places will get rounded away.
        *     Default is `1e5`.
        * @return The encoded string.
        * @api
        */
      def encodeFloats(numbers: js.Array[scala.Double]): java.lang.String = js.native
      def encodeFloats(numbers: js.Array[scala.Double], opt_factor: scala.Double): java.lang.String = js.native
    }
    
    @JSName("filter")
    @js.native
    object filterNs extends js.Object {
      /**
        * @classdesc
        * Represents a logical <And> operator between two or more filter conditions.
        *
        * @param conditions Conditions
        * @api
        */
      @js.native
      class And protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.And {
        /**
          * @classdesc
          * Represents a logical <And> operator between two or more filter conditions.
          *
          * @param conditions Conditions
          * @api
          */
        def this(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<BBOX>` operator to test whether a geometry-valued property
        * intersects a fixed bounding box
        *
        * @param geometryName Geometry name to use.
        * @param extent Extent.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      @js.native
      class Bbox protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Bbox {
        /**
          * @classdesc
          * Represents a `<BBOX>` operator to test whether a geometry-valued property
          * intersects a fixed bounding box
          *
          * @param geometryName Geometry name to use.
          * @param extent Extent.
          * @param opt_srsName SRS name. No srsName attribute will be
          *    set on geometries when this is not provided.
          * @api
          */
        def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent) = this()
        def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent, opt_srsName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature property comparison filters.
        *
        * deprecated: This class will no longer be exported starting from the next major version.
        *
        * @param tagName The XML tag name for this filter.
        * @param propertyName Name of the context property to compare.
        * @api
        */
      @js.native
      class Comparison protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Comparison {
        /**
          * @classdesc
          * Abstract class; normally only used for creating subclasses and not instantiated in apps.
          * Base class for WFS GetFeature property comparison filters.
          *
          * deprecated: This class will no longer be exported starting from the next major version.
          *
          * @param tagName The XML tag name for this filter.
          * @param propertyName Name of the context property to compare.
          * @api
          */
        def this(tagName: java.lang.String, propertyName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature property binary comparison filters.
        *
        * deprecated: This class will no longer be exported starting from the next major version.
        *
        * @param tagName The XML tag name for this filter.
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      @js.native
      class ComparisonBinary protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.ComparisonBinary {
        /**
          * @classdesc
          * Abstract class; normally only used for creating subclasses and not instantiated in apps.
          * Base class for WFS GetFeature property binary comparison filters.
          *
          * deprecated: This class will no longer be exported starting from the next major version.
          *
          * @param tagName The XML tag name for this filter.
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @param opt_matchCase Case-sensitive?
          * @api
          */
        def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String) = this()
        def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double) = this()
        def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
        def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<During>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param begin The begin date in ISO-8601 format.
        * @param end The end date in ISO-8601 format.
        * @api
        */
      @js.native
      class During protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.During {
        /**
          * @classdesc
          * Represents a `<During>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param begin The begin date in ISO-8601 format.
          * @param end The end date in ISO-8601 format.
          * @api
          */
        def this(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      @js.native
      class EqualTo protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.EqualTo {
        /**
          * @classdesc
          * Represents a `<PropertyIsEqualTo>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @param opt_matchCase Case-sensitive?
          * @api
          */
        def this(propertyName: java.lang.String, expression: java.lang.String) = this()
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
        def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
        def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
      }
      
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature filters.
        *
        * @param tagName The XML tag name for this filter.
        * @struct
        * @api
        */
      @js.native
      class Filter protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Filter {
        /**
          * @classdesc
          * Abstract class; normally only used for creating subclasses and not instantiated in apps.
          * Base class for WFS GetFeature filters.
          *
          * @param tagName The XML tag name for this filter.
          * @struct
          * @api
          */
        def this(tagName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsGreaterThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      @js.native
      class GreaterThan protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.GreaterThan {
        /**
          * @classdesc
          * Represents a `<PropertyIsGreaterThan>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @api
          */
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      @js.native
      class GreaterThanOrEqualTo protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.GreaterThanOrEqualTo {
        /**
          * @classdesc
          * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @api
          */
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<Intersects>` operator to test whether a geometry-valued property
        * intersects a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      @js.native
      class Intersects protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Intersects {
        /**
          * @classdesc
          * Represents a `<Intersects>` operator to test whether a geometry-valued property
          * intersects a given geometry.
          *
          * @param geometryName Geometry name to use.
          * @param geometry Geometry.
          * @param opt_srsName SRS name. No srsName attribute will be
          *    set on geometries when this is not provided.
          * @api
          */
        def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
        def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsBetween>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param lowerBoundary The lower bound of the range.
        * @param upperBoundary The upper bound of the range.
        * @api
        */
      @js.native
      class IsBetween protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.IsBetween {
        /**
          * @classdesc
          * Represents a `<PropertyIsBetween>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param lowerBoundary The lower bound of the range.
          * @param upperBoundary The upper bound of the range.
          * @api
          */
        def this(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsLike>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param pattern Text pattern.
        * @param opt_wildCard Pattern character which matches any sequence of
        *    zero or more string characters. Default is '*'.
        * @param opt_singleChar pattern character which matches any single
        *    string character. Default is '.'.
        * @param opt_escapeChar Escape character which can be used to escape
        *    the pattern characters. Default is '!'.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      @js.native
      class IsLike protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.IsLike {
        /**
          * @classdesc
          * Represents a `<PropertyIsLike>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param pattern Text pattern.
          * @param opt_wildCard Pattern character which matches any sequence of
          *    zero or more string characters. Default is '*'.
          * @param opt_singleChar pattern character which matches any single
          *    string character. Default is '.'.
          * @param opt_escapeChar Escape character which can be used to escape
          *    the pattern characters. Default is '!'.
          * @param opt_matchCase Case-sensitive?
          * @api
          */
        def this(propertyName: java.lang.String, pattern: java.lang.String) = this()
        def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String) = this()
        def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String) = this()
        def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String) = this()
        def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String, opt_matchCase: scala.Boolean) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsNull>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @api
        */
      @js.native
      class IsNull protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.IsNull {
        /**
          * @classdesc
          * Represents a `<PropertyIsNull>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @api
          */
        def this(propertyName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsLessThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      @js.native
      class LessThan protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.LessThan {
        /**
          * @classdesc
          * Represents a `<PropertyIsLessThan>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @api
          */
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      @js.native
      class LessThanOrEqualTo protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.LessThanOrEqualTo {
        /**
          * @classdesc
          * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @api
          */
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
      }
      
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature n-ary logical filters.
        */
      @js.native
      class LogicalNary ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.LogicalNary
      
      /**
        * @classdesc
        * Represents a logical `<Not>` operator for a filter condition.
        *
        * @param condition Filter condition.
        * @api
        */
      @js.native
      class Not protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Not {
        /**
          * @classdesc
          * Represents a logical `<Not>` operator for a filter condition.
          *
          * @param condition Filter condition.
          * @api
          */
        def this(condition: openlayersLib.openlayersMod.formatNs.filterNs.Filter) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<PropertyIsNotEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      @js.native
      class NotEqualTo protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo {
        /**
          * @classdesc
          * Represents a `<PropertyIsNotEqualTo>` comparison operator.
          *
          * @param propertyName Name of the context property to compare.
          * @param expression The value to compare.
          * @param opt_matchCase Case-sensitive?
          * @api
          */
        def this(propertyName: java.lang.String, expression: java.lang.String) = this()
        def this(propertyName: java.lang.String, expression: scala.Double) = this()
        def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
        def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
      }
      
      /**
        * @classdesc
        * Represents a logical <Or> operator between two or more filter conditions.
        *
        * @param conditions Conditions
        * @api
        */
      @js.native
      class Or protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Or {
        /**
          * @classdesc
          * Represents a logical <Or> operator between two or more filter conditions.
          *
          * @param conditions Conditions
          * @api
          */
        def this(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*) = this()
      }
      
      /**
        * @classdesc
        * Represents a spatial operator to test whether a geometry-valued property
        * relates to a given geometry.
        *
        * @param tagName The XML tag name for this filter.
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      @js.native
      class Spatial protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Spatial {
        /**
          * @classdesc
          * Represents a spatial operator to test whether a geometry-valued property
          * relates to a given geometry.
          *
          * @param tagName The XML tag name for this filter.
          * @param geometryName Geometry name to use.
          * @param geometry Geometry.
          * @param opt_srsName SRS name. No srsName attribute will be
          *    set on geometries when this is not provided.
          * @api
          */
        def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
        def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
      }
      
      /**
        * @classdesc
        * Represents a `<Within>` operator to test whether a geometry-valued property
        * is within a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      @js.native
      class Within protected ()
        extends openlayersLib.openlayersMod.formatNs.filterNs.Within {
        /**
          * @classdesc
          * Represents a `<Within>` operator to test whether a geometry-valued property
          * is within a given geometry.
          *
          * @param geometryName Geometry name to use.
          * @param geometry Geometry.
          * @param opt_srsName SRS name. No srsName attribute will be
          *    set on geometries when this is not provided.
          * @api
          */
        def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
        def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
      }
      
      /**
        * Create a logical `<And>` operator between two or more filter conditions.
        *
        * @param conditions Filter conditions.
        * @returns `<And>` operator.
        * @api
        */
      def and(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*): openlayersLib.openlayersMod.formatNs.filterNs.And = js.native
      /**
        * Create a `<BBOX>` operator to test whether a geometry-valued property
        * intersects a fixed bounding box
        *
        * @param geometryName Geometry name to use.
        * @param extent Extent.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @returns `<BBOX>` operator.
        * @api
        */
      def bbox(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.formatNs.filterNs.Bbox = js.native
      def bbox(
        geometryName: java.lang.String,
        extent: openlayersLib.openlayersMod.Extent,
        opt_srsName: java.lang.String
      ): openlayersLib.openlayersMod.formatNs.filterNs.Bbox = js.native
      /**
        * Creates a `<PropertyIsBetween>` comparison operator to test whether an expression
        * value lies within a range given by a lower and upper bound (inclusive).
        *
        * @param propertyName Name of the context property to compare.
        * @param lowerBoundary The lower bound of the range.
        * @param upperBoundary The upper bound of the range.
        * @returns `<PropertyIsBetween>` operator.
        * @api
        */
      def between(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.IsBetween = js.native
      /**
        * Create a `<During>` temporal operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param begin The begin date in ISO-8601 format.
        * @param end The end date in ISO-8601 format.
        * @returns `<During>` operator.
        * @api
        */
      def during(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.During = js.native
      /**
        * Creates a `<PropertyIsEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @returns `<PropertyIsEqualTo>` operator.
        * @api
        */
      def equalTo(propertyName: java.lang.String, expression: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
      def equalTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
      def equalTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
      def equalTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
      /**
        * Creates a `<PropertyIsGreaterThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @returns `<PropertyIsGreaterThan>` operator.
        * @api
        */
      def greaterThan(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.GreaterThan = js.native
      /**
        * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
        * @api
        */
      def greaterThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.GreaterThanOrEqualTo = js.native
      /**
        * Create a `<Intersects>` operator to test whether a geometry-valued property
        * intersects a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @returns `<Intersects>` operator.
        * @api
        */
      def intersects(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): openlayersLib.openlayersMod.formatNs.filterNs.Intersects = js.native
      def intersects(
        geometryName: java.lang.String,
        geometry: openlayersLib.openlayersMod.geomNs.Geometry,
        opt_srsName: java.lang.String
      ): openlayersLib.openlayersMod.formatNs.filterNs.Intersects = js.native
      /**
        * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
        * is null.
        *
        * @param propertyName Name of the context property to compare.
        * @returns `<PropertyIsNull>` operator.
        * @api
        */
      def isNull(propertyName: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsNull = js.native
      /**
        * Creates a `<PropertyIsLessThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @returns `<PropertyIsLessThan>` operator.
        * @api
        */
      def lessThan(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.LessThan = js.native
      /**
        * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @returns `<PropertyIsLessThanOrEqualTo>` operator.
        * @api
        */
      def lessThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.LessThanOrEqualTo = js.native
      /**
        * Represents a `<PropertyIsLike>` comparison operator that matches a string property
        * value against a text pattern.
        *
        * @param propertyName Name of the context property to compare.
        * @param pattern Text pattern.
        * @param opt_wildCard Pattern character which matches any sequence of
        *    zero or more string characters. Default is '*'.
        * @param opt_singleChar pattern character which matches any single
        *    string character. Default is '.'.
        * @param opt_escapeChar Escape character which can be used to escape
        *    the pattern characters. Default is '!'.
        * @param opt_matchCase Case-sensitive?
        * @returns `<PropertyIsLike>` operator.
        * @api
        */
      def like(propertyName: java.lang.String, pattern: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
      def like(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
      def like(
        propertyName: java.lang.String,
        pattern: java.lang.String,
        opt_wildCard: java.lang.String,
        opt_singleChar: java.lang.String
      ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
      def like(
        propertyName: java.lang.String,
        pattern: java.lang.String,
        opt_wildCard: java.lang.String,
        opt_singleChar: java.lang.String,
        opt_escapeChar: java.lang.String
      ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
      def like(
        propertyName: java.lang.String,
        pattern: java.lang.String,
        opt_wildCard: java.lang.String,
        opt_singleChar: java.lang.String,
        opt_escapeChar: java.lang.String,
        opt_matchCase: scala.Boolean
      ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
      /**
        * Represents a logical `<Not>` operator for a filter condition.
        *
        * @param condition Filter condition.
        * @returns `<Not>` operator.
        * @api
        */
      def not(condition: openlayersLib.openlayersMod.formatNs.filterNs.Filter): openlayersLib.openlayersMod.formatNs.filterNs.Not = js.native
      /**
        * Creates a `<PropertyIsNotEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @returns `<PropertyIsNotEqualTo>` operator.
        * @api
        */
      def notEqualTo(propertyName: java.lang.String, expression: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
      def notEqualTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
      def notEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
      def notEqualTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
      /**
        * Create a logical `<Or>` operator between two or more filter conditions.
        *
        * @param conditions Filter conditions.
        * @returns `<Or>` operator.
        * @api
        */
      def or(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*): openlayersLib.openlayersMod.formatNs.filterNs.Or = js.native
      /**
        * Create a `<Within>` operator to test whether a geometry-valued property
        * is within a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @returns `<Within>` operator.
        * @api
        */
      def within(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): openlayersLib.openlayersMod.formatNs.filterNs.Within = js.native
      def within(
        geometryName: java.lang.String,
        geometry: openlayersLib.openlayersMod.geomNs.Geometry,
        opt_srsName: java.lang.String
      ): openlayersLib.openlayersMod.formatNs.filterNs.Within = js.native
    }
    
  }
  
  @JSName("geom")
  @js.native
  object geomNs extends js.Object {
    /**
      * @classdesc
      * Circle geometry.
      *
      * @param center Center.
      * @param opt_radius Radius.
      * @param opt_layout Layout.
      * @api
      */
    @js.native
    class Circle protected ()
      extends openlayersLib.openlayersMod.geomNs.Circle {
      /**
        * @classdesc
        * Circle geometry.
        *
        * @param center Center.
        * @param opt_radius Radius.
        * @param opt_layout Layout.
        * @api
        */
      def this(center: openlayersLib.openlayersMod.Coordinate) = this()
      def this(center: openlayersLib.openlayersMod.Coordinate, opt_radius: scala.Double) = this()
      def this(center: openlayersLib.openlayersMod.Coordinate, opt_radius: scala.Double, opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for vector geometries.
      *
      * To get notified of changes to the geometry, register a listener for the
      * generic `change` event on your geometry instance.
      *
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for vector geometries.
      *
      * To get notified of changes to the geometry, register a listener for the
      * generic `change` event on your geometry instance.
      *
      * @api stable
      */
    class Geometry ()
      extends openlayersLib.openlayersMod.geomNs.Geometry
    
    /**
      * @classdesc
      * An array of {@link ol.geom.Geometry} objects.
      *
      * @param opt_geometries Geometries.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * An array of {@link ol.geom.Geometry} objects.
      *
      * @param opt_geometries Geometries.
      * @api stable
      */
    class GeometryCollection ()
      extends openlayersLib.openlayersMod.geomNs.GeometryCollection {
      def this(opt_geometries: js.Array[openlayersLib.openlayersMod.geomNs.Geometry]) = this()
    }
    
    /**
      * @classdesc
      * Linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class LineString protected ()
      extends openlayersLib.openlayersMod.geomNs.LineString {
      /**
        * @classdesc
        * Linestring geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]) = this()
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Linear ring geometry. Only used as part of polygon; cannot be rendered
      * on its own.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class LinearRing protected ()
      extends openlayersLib.openlayersMod.geomNs.LinearRing {
      /**
        * @classdesc
        * Linear ring geometry. Only used as part of polygon; cannot be rendered
        * on its own.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]) = this()
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Multi-linestring geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class MultiLineString protected ()
      extends openlayersLib.openlayersMod.geomNs.MultiLineString {
      /**
        * @classdesc
        * Multi-linestring geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]) = this()
      def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Multi-point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class MultiPoint protected ()
      extends openlayersLib.openlayersMod.geomNs.MultiPoint {
      /**
        * @classdesc
        * Multi-point geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate]) = this()
      def this(coordinates: js.Array[openlayersLib.openlayersMod.Coordinate], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Multi-polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class MultiPolygon protected ()
      extends openlayersLib.openlayersMod.geomNs.MultiPolygon {
      /**
        * @classdesc
        * Multi-polygon geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]]) = this()
      def this(coordinates: js.Array[js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Point geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class Point protected ()
      extends openlayersLib.openlayersMod.geomNs.Point {
      /**
        * @classdesc
        * Point geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: openlayersLib.openlayersMod.Coordinate) = this()
      def this(coordinates: openlayersLib.openlayersMod.Coordinate, opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    class Polygon protected ()
      extends openlayersLib.openlayersMod.geomNs.Polygon {
      /**
        * @classdesc
        * Polygon geometry.
        *
        * @param coordinates Coordinates.
        * @param opt_layout Layout.
        * @api stable
        */
      def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]) = this()
      def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; only used for creating subclasses; do not instantiate
      * in apps, as cannot be rendered.
      *
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Abstract base class; only used for creating subclasses; do not instantiate
      * in apps, as cannot be rendered.
      *
      * @api stable
      */
    class SimpleGeometry ()
      extends openlayersLib.openlayersMod.geomNs.SimpleGeometry
    
    /**
      * @classdesc
      * Polygon geometry.
      *
      * @param coordinates Coordinates.
      * @param opt_layout Layout.
      * @api stable
      */
    @js.native
    object Polygon extends js.Object {
      /**
        * Create an approximation of a circle on the surface of a sphere.
        * @param sphere The sphere.
        * @param center Center (`[lon, lat]` in degrees).
        * @param radius The great-circle distance from the center to
        *     the polygon vertices.
        * @param opt_n Optional number of vertices for the resulting
        *     polygon. Default is `32`.
        * @return The "circular" polygon.
        * @api stable
        */
      def circular(
        sphere: openlayersLib.openlayersMod.Sphere,
        center: openlayersLib.openlayersMod.Coordinate,
        radius: scala.Double
      ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
      def circular(
        sphere: openlayersLib.openlayersMod.Sphere,
        center: openlayersLib.openlayersMod.Coordinate,
        radius: scala.Double,
        opt_n: scala.Double
      ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
      /**
        * Create a regular polygon from a circle.
        * @param circle Circle geometry.
        * @param opt_sides Number of sides of the polygon. Default is 32.
        * @param opt_angle Start angle for the first vertex of the polygon in
        *     radians. Default is 0.
        * @return Polygon geometry.
        * @api
        */
      def fromCircle(circle: openlayersLib.openlayersMod.geomNs.Circle): openlayersLib.openlayersMod.geomNs.Polygon = js.native
      def fromCircle(circle: openlayersLib.openlayersMod.geomNs.Circle, opt_sides: scala.Double): openlayersLib.openlayersMod.geomNs.Polygon = js.native
      def fromCircle(
        circle: openlayersLib.openlayersMod.geomNs.Circle,
        opt_sides: scala.Double,
        opt_angle: scala.Double
      ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
      /**
        * Create a polygon from an extent. The layout used is `XY`.
        * @param extent The extent.
        * @return The polygon.
        * @api
        */
      def fromExtent(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.geomNs.Polygon = js.native
    }
    
  }
  
  @JSName("has")
  @js.native
  object hasNs extends js.Object {
    /**
      * True if both the library and browser support Canvas.  Always `false`
      * if `ol.ENABLE_CANVAS` is set to `false` at compile time.
      * @const
      * @api stable
      */
    val CANVAS: scala.Boolean = js.native
    /**
      * Indicates if DeviceOrientation is supported in the user's browser.
      * @const
      * @api stable
      */
    val DEVICE_ORIENTATION: scala.Boolean = js.native
    /**
      * The ratio between physical pixels and device-independent pixels
      * (dips) on the device (`window.devicePixelRatio`).
      * @const
      * @api stable
      */
    val DEVICE_PIXEL_RATIO: scala.Double = js.native
    /**
      * Is HTML5 geolocation supported in the current browser?
      * @const
      * @api stable
      */
    val GEOLOCATION: scala.Boolean = js.native
    /**
      * True if browser supports touch events.
      * @const
      * @api stable
      */
    val TOUCH: scala.Boolean = js.native
    /**
      * True if both OpenLayers and browser support WebGL.  Always `false`
      * if `ol.ENABLE_WEBGL` is set to `false` at compile time.
      * @const
      * @api stable
      */
    val WEBGL: scala.Boolean = js.native
  }
  
  @JSName("interaction")
  @js.native
  object interactionNs extends js.Object {
    /**
      * @classdesc
      * Allows the user to zoom by double-clicking on the map.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom by double-clicking on the map.
      *
      * @param opt_options Options.
      * @api stable
      */
    class DoubleClickZoom ()
      extends openlayersLib.openlayersMod.interactionNs.DoubleClickZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DoubleClickZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Handles input of vector data by drag and drop.
      *
      * @fires ol.interaction.DragAndDropEvent
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Handles input of vector data by drag and drop.
      *
      * @fires ol.interaction.DragAndDropEvent
      * @param opt_options Options.
      * @api stable
      */
    class DragAndDrop ()
      extends openlayersLib.openlayersMod.interactionNs.DragAndDrop {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragAndDropOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to draw a vector box by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when the shift or other key is held down. This is used, for example,
      * for zooming to a specific area of the map
      * (see {@link ol.interaction.DragZoom} and
      * {@link ol.interaction.DragRotateAndZoom}).
      *
      * This interaction is only supported for mouse devices.
      *
      * @fires ol.DragBoxEvent
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to draw a vector box by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when the shift or other key is held down. This is used, for example,
      * for zooming to a specific area of the map
      * (see {@link ol.interaction.DragZoom} and
      * {@link ol.interaction.DragRotateAndZoom}).
      *
      * This interaction is only supported for mouse devices.
      *
      * @fires ol.DragBoxEvent
      * @param opt_options Options.
      * @api stable
      */
    class DragBox ()
      extends openlayersLib.openlayersMod.interactionNs.DragBox {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragBoxOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to pan the map by dragging the map.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to pan the map by dragging the map.
      *
      * @param opt_options Options.
      * @api stable
      */
    class DragPan ()
      extends openlayersLib.openlayersMod.interactionNs.DragPan {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragPanOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to rotate the map by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when the alt and shift keys are held down.
      *
      * This interaction is only supported for mouse devices.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to rotate the map by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when the alt and shift keys are held down.
      *
      * This interaction is only supported for mouse devices.
      *
      * @param opt_options Options.
      * @api stable
      */
    class DragRotate ()
      extends openlayersLib.openlayersMod.interactionNs.DragRotate {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragRotateOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to zoom and rotate the map by clicking and dragging
      * on the map.  By default, this interaction is limited to when the shift
      * key is held down.
      *
      * This interaction is only supported for mouse devices.
      *
      * And this interaction is not included in the default interactions.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom and rotate the map by clicking and dragging
      * on the map.  By default, this interaction is limited to when the shift
      * key is held down.
      *
      * This interaction is only supported for mouse devices.
      *
      * And this interaction is not included in the default interactions.
      *
      * @param opt_options Options.
      * @api stable
      */
    class DragRotateAndZoom ()
      extends openlayersLib.openlayersMod.interactionNs.DragRotateAndZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragRotateAndZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when a key, shift by default, is held down.
      *
      * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
      * your custom one configured with `className`.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom the map by clicking and dragging on the map,
      * normally combined with an {@link ol.events.condition} that limits
      * it to when a key, shift by default, is held down.
      *
      * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
      * your custom one configured with `className`.
      *
      * @param opt_options Options.
      * @api stable
      */
    class DragZoom ()
      extends openlayersLib.openlayersMod.interactionNs.DragZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Interaction for drawing feature geometries.
      *
      * @fires ol.interaction.DrawEvent
      * @param options Options.
      * @api stable
      */
    @js.native
    class Draw protected ()
      extends openlayersLib.openlayersMod.interactionNs.Draw {
      /**
        * @classdesc
        * Interaction for drawing feature geometries.
        *
        * @fires ol.interaction.DrawEvent
        * @param options Options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.DrawOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to draw a vector box by clicking and dragging on the map.
      * Once drawn, the vector box can be modified by dragging its vertices or edges.
      * This interaction is only supported for mouse devices.
      *
      * @fires ol.interaction.Extent.Event
      * @param options Options.
      * @api stable
      */
    @js.native
    class Extent protected ()
      extends openlayersLib.openlayersMod.interactionNs.Extent {
      /**
        * @fires ol.interaction.Extent.Event
        * @param options Options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.ExtentOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * User actions that change the state of the map. Some are similar to controls,
      * but are not associated with a DOM element.
      * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
      * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
      * element event.
      * Although interactions do not have a DOM element, some of them do render
      * vectors and so are visible on the screen.
      *
      * @param options Options.
      * @api
      */
    @js.native
    class Interaction protected ()
      extends openlayersLib.openlayersMod.interactionNs.Interaction {
      /**
        * @classdesc
        * Abstract base class; normally only used for creating subclasses and not
        * instantiated in apps.
        * User actions that change the state of the map. Some are similar to controls,
        * but are not associated with a DOM element.
        * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
        * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
        * element event.
        * Although interactions do not have a DOM element, some of them do render
        * vectors and so are visible on the screen.
        *
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.InteractionOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to pan the map using keyboard arrows.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardZoom}.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to pan the map using keyboard arrows.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardZoom}.
      *
      * @param opt_options Options.
      * @api stable
      */
    class KeyboardPan ()
      extends openlayersLib.openlayersMod.interactionNs.KeyboardPan {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.KeyboardPanOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map using keyboard + and -.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardPan}.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom the map using keyboard + and -.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardPan}.
      *
      * @param opt_options Options.
      * @api stable
      */
    class KeyboardZoom ()
      extends openlayersLib.openlayersMod.interactionNs.KeyboardZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.KeyboardZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Interaction for modifying feature geometries.
      *
      * @param options Options.
      * @fires ol.interaction.ModifyEvent
      * @api
      */
    @js.native
    class Modify protected ()
      extends openlayersLib.openlayersMod.interactionNs.Modify {
      /**
        * @classdesc
        * Interaction for modifying feature geometries.
        *
        * @param options Options.
        * @fires ol.interaction.ModifyEvent
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.ModifyOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map by scrolling the mouse wheel.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom the map by scrolling the mouse wheel.
      *
      * @param opt_options Options.
      * @api stable
      */
    class MouseWheelZoom ()
      extends openlayersLib.openlayersMod.interactionNs.MouseWheelZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.MouseWheelZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to rotate the map by twisting with two fingers
      * on a touch screen.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to rotate the map by twisting with two fingers
      * on a touch screen.
      *
      * @param opt_options Options.
      * @api stable
      */
    class PinchRotate ()
      extends openlayersLib.openlayersMod.interactionNs.PinchRotate {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PinchRotateOptions) = this()
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map by pinching with two fingers
      * on a touch screen.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Allows the user to zoom the map by pinching with two fingers
      * on a touch screen.
      *
      * @param opt_options Options.
      * @api stable
      */
    class PinchZoom ()
      extends openlayersLib.openlayersMod.interactionNs.PinchZoom {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PinchZoomOptions) = this()
    }
    
    /**
      * @classdesc
      * Base class that calls user-defined functions on `down`, `move` and `up`
      * events. This class also manages "drag sequences".
      *
      * When the `handleDownEvent` user function returns `true` a drag sequence is
      * started. During a drag sequence the `handleDragEvent` user function is
      * called on `move` events. The drag sequence ends when the `handleUpEvent`
      * user function is called and returns `false`.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Base class that calls user-defined functions on `down`, `move` and `up`
      * events. This class also manages "drag sequences".
      *
      * When the `handleDownEvent` user function returns `true` a drag sequence is
      * started. During a drag sequence the `handleDragEvent` user function is
      * called on `move` events. The drag sequence ends when the `handleUpEvent`
      * user function is called and returns `false`.
      *
      * @param opt_options Options.
      * @api
      */
    class Pointer ()
      extends openlayersLib.openlayersMod.interactionNs.Pointer {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PointerOptions) = this()
    }
    
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
    class Select ()
      extends openlayersLib.openlayersMod.interactionNs.Select {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SelectOptions) = this()
    }
    
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
    class Snap ()
      extends openlayersLib.openlayersMod.interactionNs.Snap {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SnapOptions) = this()
    }
    
    /**
      * @classdesc
      * Interaction for translating (moving) features.
      *
      * @fires ol.interaction.TranslateEvent
      * @param options Options.
      * @api
      */
    @js.native
    class Translate protected ()
      extends openlayersLib.openlayersMod.interactionNs.Translate {
      /**
        * @classdesc
        * Interaction for translating (moving) features.
        *
        * @fires ol.interaction.TranslateEvent
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.TranslateOptions) = this()
    }
    
    /**
      * Set of interactions included in maps by default. Specific interactions can be
      * excluded by setting the appropriate option to false in the constructor
      * options, but the order of the interactions is fixed.  If you want to specify
      * a different order for interactions, you will need to create your own
      * {@link ol.interaction.Interaction} instances and insert them into a
      * {@link ol.Collection} in the order you want before creating your
      * {@link ol.Map} instance. The default set of interactions, in sequence, is:
      * * {@link ol.interaction.DragRotate}
      * * {@link ol.interaction.DoubleClickZoom}
      * * {@link ol.interaction.DragPan}
      * * {@link ol.interaction.PinchRotate}
      * * {@link ol.interaction.PinchZoom}
      * * {@link ol.interaction.KeyboardPan}
      * * {@link ol.interaction.KeyboardZoom}
      * * {@link ol.interaction.MouseWheelZoom}
      * * {@link ol.interaction.DragZoom}
      *
      * @param opt_options Defaults options.
      * @return A collection of
      * interactions to be used with the ol.Map constructor's interactions option.
      * @api stable
      */
    def defaults(): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.interactionNs.Interaction] = js.native
    def defaults(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DefaultsOptions): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.interactionNs.Interaction] = js.native
    /**
      * @classdesc
      * Allows the user to zoom by double-clicking on the map.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    object DoubleClickZoom extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
        * doubleclick) and eventually zooms the map.
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
    /**
      * @classdesc
      * Handles input of vector data by drag and drop.
      *
      * @fires ol.interaction.DragAndDropEvent
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    object DragAndDrop extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
        * neither prevents the browser default nor stops event propagation.
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      var handleEvent: js.Any = js.native
    }
    
    @JSName("DragAndDrop")
    @js.native
    object DragAndDropNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
        * of this type.
        *
        * @param type Type.
        * @param file File.
        * @param opt_features Features.
        * @param opt_projection Projection.
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.DragAndDropNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
          * of this type.
          *
          * @param type Type.
          * @param file File.
          * @param opt_features Features.
          * @param opt_projection Projection.
          */
        def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File) = this()
        def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature]) = this()
        def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature], opt_projection: openlayersLib.openlayersMod.projNs.Projection) = this()
      }
      
    }
    
    @JSName("DragBox")
    @js.native
    object DragBoxNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragBox} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param coordinate The event coordinate.
        * @param mapBrowserEvent Originating event.
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.DragBoxNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.DragBox} instances are instances of
          * this type.
          *
          * @param type The event type.
          * @param coordinate The event coordinate.
          * @param mapBrowserEvent Originating event.
          */
        def this(`type`: java.lang.String, coordinate: openlayersLib.openlayersMod.Coordinate, mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
      }
      
    }
    
    /**
      * @classdesc
      * Interaction for drawing feature geometries.
      *
      * @fires ol.interaction.DrawEvent
      * @param options Options.
      * @api stable
      */
    @js.native
    object Draw extends js.Object {
      /**
        * Create a `geometryFunction` that will create a box-shaped polygon (aligned
        * with the coordinate system axes).  Use this with the draw interaction and
        * `type: 'Circle'` to return a box instead of a circle geometry.
        * @return Function that draws a box-shaped polygon.
        * @api
        */
      def createBox(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
      /**
        * Create a `geometryFunction` for `mode: 'Circle'` that will create a regular
        * polygon with a user specified number of sides and start angle instead of an
        * `ol.geom.Circle` geometry.
        * @param opt_sides Number of sides of the regular polygon. Default is
        *     32.
        * @param opt_angle Angle of the first point in radians. 0 means East.
        *     Default is the angle defined by the heading from the center of the
        *     regular polygon to the current pointer position.
        * @return Function that draws a
        *     polygon.
        * @api
        */
      def createRegularPolygon(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
      def createRegularPolygon(opt_sides: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
      def createRegularPolygon(opt_sides: scala.Double, opt_angle: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
    }
    
    @JSName("Draw")
    @js.native
    object DrawNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Draw} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.DrawNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.Draw} instances are instances of
          * this type.
          *
          * @param type Type.
          * @param feature The feature drawn.
          */
        def this(`type`: openlayersLib.openlayersMod.interactionNs.DrawEventType, feature: openlayersLib.openlayersMod.Feature) = this()
      }
      
    }
    
    @JSName("Extent")
    @js.native
    object ExtentNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Extent} instances are instances of
        * this type.
        *
        * @param extent the new extent
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.ExtentNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.Extent} instances are instances of
          * this type.
          *
          * @param type Type.
          * @param feature The feature drawn.
          */
        def this(`type`: openlayersLib.openlayersMod.interactionNs.ExtentEventType, extent: openlayersLib.openlayersMod.Extent) = this()
      }
      
    }
    
    /**
      * @classdesc
      * Allows the user to pan the map using keyboard arrows.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardZoom}.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    object KeyboardPan extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
        * `KeyEvent`, and decides the direction to pan to (if an arrow key was
        * pressed).
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map using keyboard + and -.
      * Note that, although this interaction is by default included in maps,
      * the keys can only be used when browser focus is on the element to which
      * the keyboard events are attached. By default, this is the map div,
      * though you can change this with the `keyboardEventTarget` in
      * {@link ol.Map}. `document` never loses focus but, for any other element,
      * focus will have to be on, and returned to, this element if the keys are to
      * function.
      * See also {@link ol.interaction.KeyboardPan}.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    object KeyboardZoom extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
        * `KeyEvent`, and decides whether to zoom in or out (depending on whether the
        * key pressed was '+' or '-').
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
    @JSName("Modify")
    @js.native
    object ModifyNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Modify} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features modified.
        * @param mapBrowserPointerEvent Associated
        *     {@link ol.MapBrowserPointerEvent}.
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.ModifyNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.Modify} instances are instances of
          * this type.
          *
          * @param type Type.
          * @param features The features modified.
          * @param mapBrowserPointerEvent Associated
          *     {@link ol.MapBrowserPointerEvent}.
          */
        def this(`type`: openlayersLib.openlayersMod.ModifyEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], mapBrowserPointerEvent: openlayersLib.openlayersMod.MapBrowserPointerEvent) = this()
      }
      
    }
    
    /**
      * @classdesc
      * Allows the user to zoom the map by scrolling the mouse wheel.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    object MouseWheelZoom extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
        * mousewheel-event) and eventually zooms the map.
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
    /**
      * @classdesc
      * Base class that calls user-defined functions on `down`, `move` and `up`
      * events. This class also manages "drag sequences".
      *
      * When the `handleDownEvent` user function returns `true` a drag sequence is
      * started. During a drag sequence the `handleDragEvent` user function is
      * called on `move` events. The drag sequence ends when the `handleUpEvent`
      * user function is called and returns `false`.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    object Pointer extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
        * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
        * detected.
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
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
    @js.native
    object Select extends js.Object {
      /**
        * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
        * selected state of features.
        * @param mapBrowserEvent Map browser event.
        * @return `false` to stop event propagation.
        * @api
        */
      def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
    }
    
    @JSName("Select")
    @js.native
    object SelectNs extends js.Object {
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
        extends openlayersLib.openlayersMod.interactionNs.SelectNs.Event {
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
        def this(`type`: java.lang.String, selected: js.Array[openlayersLib.openlayersMod.Feature], deselected: js.Array[openlayersLib.openlayersMod.Feature], mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
      }
      
    }
    
    @JSName("Translate")
    @js.native
    object TranslateNs extends js.Object {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Translate} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features translated.
        * @param coordinate The event coordinate.
        */
      @js.native
      class Event protected ()
        extends openlayersLib.openlayersMod.interactionNs.TranslateNs.Event {
        /**
          * @classdesc
          * Events emitted by {@link ol.interaction.Translate} instances are instances of
          * this type.
          *
          * @param type Type.
          * @param features The features translated.
          * @param coordinate The event coordinate.
          */
        def this(`type`: openlayersLib.openlayersMod.interactionNs.TranslateEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], coordinate: openlayersLib.openlayersMod.Coordinate) = this()
      }
      
    }
    
  }
  
  @JSName("layer")
  @js.native
  object layerNs extends js.Object {
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
    @js.native
    class Base protected ()
      extends openlayersLib.openlayersMod.layerNs.Base {
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
      def this(options: openlayersLib.openlayersMod.olxNs.layerNs.BaseOptions) = this()
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
    class Group ()
      extends openlayersLib.openlayersMod.layerNs.Group {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.GroupOptions) = this()
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
    class Heatmap ()
      extends openlayersLib.openlayersMod.layerNs.Heatmap {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.HeatmapOptions) = this()
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
    class Image ()
      extends openlayersLib.openlayersMod.layerNs.Image {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.ImageOptions) = this()
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
    @js.native
    class Layer protected ()
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
    class Tile ()
      extends openlayersLib.openlayersMod.layerNs.Tile {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.TileOptions) = this()
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
    class Vector ()
      extends openlayersLib.openlayersMod.layerNs.Vector {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorOptions) = this()
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
    class VectorTile ()
      extends openlayersLib.openlayersMod.layerNs.VectorTile {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.layerNs.VectorTileOptions) = this()
    }
    
  }
  
  @JSName("loadingstrategy")
  @js.native
  object loadingstrategyNs extends js.Object {
    /**
      * Strategy function for loading all features with a single request.
      * @param extent Extent.
      * @param resolution Resolution.
      * @return Extents.
      * @api
      */
    def all(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double): js.Array[openlayersLib.openlayersMod.Extent] = js.native
    /**
      * Strategy function for loading features based on the view's extent and
      * resolution.
      * @param extent Extent.
      * @param resolution Resolution.
      * @return Extents.
      * @api
      */
    def bbox(extent: openlayersLib.openlayersMod.Extent, resolution: scala.Double): js.Array[openlayersLib.openlayersMod.Extent] = js.native
    /**
      * Creates a strategy function for loading features based on a tile grid.
      * @param tileGrid Tile grid.
      * @return Loading strategy.
      * @api
      */
    def tile(tileGrid: openlayersLib.openlayersMod.tilegridNs.TileGrid): js.Function2[
        /* extent */ openlayersLib.openlayersMod.Extent, 
        /* i */ scala.Double, 
        js.Array[openlayersLib.openlayersMod.Extent]
      ] = js.native
  }
  
  @JSName("pointer")
  @js.native
  object pointerNs extends js.Object {
    /**
      * @classdesc
      * A class for pointer events.
      *
      * This class is used as an abstraction for mouse events,
      * touch events and even native pointer events.
      *
      * @param type The type of the event to create.
      * @param originalEvent The event.
      * @param opt_eventDict An optional dictionary of
      *    initial event properties.
      */
    @js.native
    class PointerEvent ()
      extends openlayersLib.openlayersMod.pointerNs.PointerEvent
    
  }
  
  @JSName("proj")
  @js.native
  object projNs extends js.Object {
    /**
      * @classdesc
      * Projection definition class. One of these is created for each projection
      * supported in the application and stored in the {@link ol.proj} namespace.
      * You can use these in applications, but this is not required, as API params
      * and options use {@link ol.ProjectionLike} which means the simple string
      * code will suffice.
      *
      * You can use {@link ol.proj.get} to retrieve the object for a particular
      * projection.
      *
      * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
      * with the following aliases:
      * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
      *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
      *     http://www.opengis.net/gml/srs/epsg.xml#4326,
      *     urn:x-ogc:def:crs:EPSG:4326
      * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
      *     urn:ogc:def:crs:EPSG:6.18:3:3857,
      *     http://www.opengis.net/gml/srs/epsg.xml#3857
      *
      * If you use proj4js, aliases can be added using `proj4.defs()`; see
      * [documentation](https://github.com/proj4js/proj4js). To set an alternative
      * namespace for proj4, use {@link ol.proj.setProj4}.
      *
      * @param options Projection options.
      * @struct
      * @api stable
      */
    @js.native
    class Projection protected ()
      extends openlayersLib.openlayersMod.projNs.Projection {
      /**
        * @classdesc
        * Projection definition class. One of these is created for each projection
        * supported in the application and stored in the {@link ol.proj} namespace.
        * You can use these in applications, but this is not required, as API params
        * and options use {@link ol.ProjectionLike} which means the simple string
        * code will suffice.
        *
        * You can use {@link ol.proj.get} to retrieve the object for a particular
        * projection.
        *
        * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
        * with the following aliases:
        * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
        *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
        *     http://www.opengis.net/gml/srs/epsg.xml#4326,
        *     urn:x-ogc:def:crs:EPSG:4326
        * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
        *     urn:ogc:def:crs:EPSG:6.18:3:3857,
        *     http://www.opengis.net/gml/srs/epsg.xml#3857
        *
        * If you use proj4js, aliases can be added using `proj4.defs()`; see
        * [documentation](https://github.com/proj4js/proj4js). To set an alternative
        * namespace for proj4, use {@link ol.proj.setProj4}.
        *
        * @param options Projection options.
        * @struct
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.ProjectionOptions) = this()
    }
    
    /**
      * Registers coordinate transform functions to convert coordinates between the
      * source projection and the destination projection.
      * The forward and inverse functions convert coordinate pairs; this function
      * converts these into the functions used internally which also handle
      * extents and coordinate arrays.
      *
      * @param source Source projection.
      * @param destination Destination projection.
      * @param forward The forward transform
      *     function (that is, from the source projection to the destination
      *     projection) that takes a {@link ol.Coordinate} as argument and returns
      *     the transformed {@link ol.Coordinate}.
      * @param inverse The inverse transform
      *     function (that is, from the destination projection to the source
      *     projection) that takes a {@link ol.Coordinate} as argument and returns
      *     the transformed {@link ol.Coordinate}.
      * @api stable
      */
    def addCoordinateTransforms(
      source: openlayersLib.openlayersMod.ProjectionLike,
      destination: openlayersLib.openlayersMod.ProjectionLike,
      forward: js.Function1[
          /* coords */ openlayersLib.openlayersMod.Coordinate, 
          openlayersLib.openlayersMod.Coordinate
        ],
      inverse: js.Function1[
          /* coords */ openlayersLib.openlayersMod.Coordinate, 
          openlayersLib.openlayersMod.Coordinate
        ]
    ): scala.Unit = js.native
    /**
      * Registers transformation functions that don't alter coordinates. Those allow
      * to transform between projections with equal meaning.
      *
      * @param projections Projections.
      * @api
      */
    def addEquivalentProjections(projections: js.Array[openlayersLib.openlayersMod.projNs.Projection]): scala.Unit = js.native
    /**
      * Add a Projection object to the list of supported projections that can be
      * looked up by their code.
      *
      * @param projection Projection instance.
      * @api stable
      */
    def addProjection(projection: openlayersLib.openlayersMod.projNs.Projection): scala.Unit = js.native
    /**
      * Checks if two projections are the same, that is every coordinate in one
      * projection does represent the same geographic point as the same coordinate in
      * the other projection.
      *
      * @param projection1 Projection 1.
      * @param projection2 Projection 2.
      * @return Equivalent.
      * @api
      */
    def equivalent(
      projection1: openlayersLib.openlayersMod.projNs.Projection,
      projection2: openlayersLib.openlayersMod.projNs.Projection
    ): scala.Boolean = js.native
    /**
      * Transforms a coordinate from longitude/latitude to a different projection.
      * @param coordinate Coordinate as longitude and latitude, i.e.
      *     an array with longitude as 1st and latitude as 2nd element.
      * @param opt_projection Target projection. The
      *     default is Web Mercator, i.e. 'EPSG:3857'.
      * @return Coordinate projected to the target projection.
      * @api stable
      */
    def fromLonLat(coordinate: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
    def fromLonLat(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      opt_projection: openlayersLib.openlayersMod.ProjectionLike
    ): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Fetches a Projection object for the code specified.
      *
      * @param projectionLike Either a code string which is
      *     a combination of authority and identifier such as "EPSG:4326", or an
      *     existing projection object, or undefined.
      * @return Projection object, or null if not in list.
      * @api stable
      */
    def get(projectionLike: openlayersLib.openlayersMod.ProjectionLike): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Get the resolution of the point in degrees or distance units. For
      * projections with degrees as the unit this will simply return the
      * provided resolution. For other projections the point resolution is
      * estimated by transforming the 'point' pixel to EPSG:4326, measuring
      * its width and height on the normal sphere, and taking the average of
      * the width and height.
      * @param projection The projection.
      * @param resolution Nominal resolution in projection units.
      * @param point Point to find adjusted resolution at.
      * @return Point to find adjusted resolution at.
      */
    def getPointResolution(
      projection: openlayersLib.openlayersMod.projNs.Projection,
      resolution: scala.Double,
      point: openlayersLib.openlayersMod.Coordinate
    ): scala.Double = js.native
    /**
      * Given the projection-like objects, searches for a transformation
      * function to convert a coordinates array from the source projection to the
      * destination projection.
      *
      * @param source Source.
      * @param destination Destination.
      * @return Transform function.
      * @api stable
      */
    def getTransform(
      source: openlayersLib.openlayersMod.ProjectionLike,
      destination: openlayersLib.openlayersMod.ProjectionLike
    ): openlayersLib.openlayersMod.TransformFunction = js.native
    /**
      * Register proj4. If not explicitly registered, it will be assumed that
      * proj4js will be loaded in the global namespace. For example in a
      * browserify ES6 environment you could use:
      *
      *     import ol from 'openlayers';
      *     import proj4 from 'proj4';
      *     ol.proj.setProj4(proj4);
      *
      * @param proj4 Proj4.
      * @api
      */
    def setProj4(proj4: js.Any): scala.Unit = js.native
    /**
      * Transforms a coordinate to longitude/latitude.
      * @param coordinate Projected coordinate.
      * @param opt_projection Projection of the coordinate.
      *     The default is Web Mercator, i.e. 'EPSG:3857'.
      * @return Coordinate as longitude and latitude, i.e. an array
      *     with longitude as 1st and latitude as 2nd element.
      * @api stable
      */
    def toLonLat(coordinate: openlayersLib.openlayersMod.Coordinate): openlayersLib.openlayersMod.Coordinate = js.native
    def toLonLat(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      opt_projection: openlayersLib.openlayersMod.ProjectionLike
    ): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Transforms a coordinate from source projection to destination projection.
      * This returns a new coordinate (and does not modify the original).
      *
      * See {@link ol.proj.transformExtent} for extent transformation.
      * See the transform method of {@link ol.geom.Geometry} and its subclasses for
      * geometry transforms.
      *
      * @param coordinate Coordinate.
      * @param source Source projection-like.
      * @param destination Destination projection-like.
      */
    def transform(
      coordinate: openlayersLib.openlayersMod.Coordinate,
      source: openlayersLib.openlayersMod.ProjectionLike,
      destination: openlayersLib.openlayersMod.ProjectionLike
    ): openlayersLib.openlayersMod.Coordinate = js.native
    /**
      * Transforms an extent from source projection to destination projection.  This
      * returns a new extent (and does not modify the original).
      *
      * @param extent The extent to transform.
      * @param source Source projection-like.
      * @param destination Destination projection-like.
      * @return The transformed extent.
      * @api stable
      */
    def transformExtent(
      extent: openlayersLib.openlayersMod.Extent,
      source: openlayersLib.openlayersMod.ProjectionLike,
      destination: openlayersLib.openlayersMod.ProjectionLike
    ): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Meters per unit lookup table.
      * @const
      * @api stable
      */
    @js.native
    object METERS_PER_UNIT
      extends /* k */ org.scalablytyped.runtime.StringDictionary[scala.Double]
    
  }
  
  @JSName("render")
  @js.native
  object renderNs extends js.Object {
    /**
      * @param type Type.
      * @param opt_vectorContext Vector context.
      * @param opt_frameState Frame state.
      * @param opt_context Context.
      * @param opt_glContext WebGL Context.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.renderNs.Event {
      /**
        * @param type Type.
        * @param opt_vectorContext Vector context.
        * @param opt_frameState Frame state.
        * @param opt_context Context.
        * @param opt_glContext WebGL Context.
        */
      def this(`type`: openlayersLib.openlayersMod.renderNs.EventType) = this()
      def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext) = this()
      def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState) = this()
      def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState, opt_context: stdLib.CanvasRenderingContext2D) = this()
      def this(`type`: openlayersLib.openlayersMod.renderNs.EventType, opt_vectorContext: openlayersLib.openlayersMod.renderNs.VectorContext, opt_frameState: openlayersLib.openlayersMod.olxNs.FrameState, opt_context: stdLib.CanvasRenderingContext2D, opt_glContext: js.Any) = this()
    }
    
    /**
      * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
      * structure, optimized for rendering and styling. Geometry access through the
      * API is limited to getting the type and extent of the geometry.
      *
      * @param type Geometry type.
      * @param flatCoordinates Flat coordinates. These always need
      *     to be right-handed for polygons.
      * @param ends Ends or Endss.
      * @param properties Properties.
      */
    @js.native
    class Feature protected ()
      extends openlayersLib.openlayersMod.renderNs.Feature {
      /**
        * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
        * structure, optimized for rendering and styling. Geometry access through the
        * API is limited to getting the type and extent of the geometry.
        *
        * @param type Geometry type.
        * @param flatCoordinates Flat coordinates. These always need
        *     to be right-handed for polygons.
        * @param ends Ends or Endss.
        * @param properties Properties.
        */
      def this(`type`: openlayersLib.openlayersMod.geomNs.GeometryType, flatCoordinates: js.Array[scala.Double], ends: js.Array[js.Array[scala.Double] | scala.Double], properties: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
    }
    
    /**
      * Context for drawing geometries.  A vector context is available on render
      * events and does not need to be constructed directly.
      * @struct
      * @api
      */
    /* tslint:disable-next-line:no-unnecessary-class */
    @js.native
    /**
      * Context for drawing geometries.  A vector context is available on render
      * events and does not need to be constructed directly.
      * @struct
      * @api
      */
    class VectorContext ()
      extends openlayersLib.openlayersMod.renderNs.VectorContext
    
    /**
      * Binds a Canvas Immediate API to a canvas context, to allow drawing geometries
      * to the context's canvas.
      *
      * The units for geometry coordinates are css pixels relative to the top left
      * corner of the canvas element.
      * ```js
      * var canvas = document.createElement('canvas');
      * var render = ol.render.toContext(canvas.getContext('2d'),
      *     { size: [100, 100] });
      * render.setFillStrokeStyle(new ol.style.Fill({ color: blue }));
      * render.drawPolygon(
      *     new ol.geom.Polygon([[[0, 0], [100, 100], [100, 0], [0, 0]]]));
      * ```
      *
      * @param context Canvas context.
      * @param opt_options Options.
      * @return Canvas Immediate.
      * @api
      */
    def toContext(context: stdLib.CanvasRenderingContext2D): openlayersLib.openlayersMod.renderNs.canvasNs.Immediate = js.native
    def toContext(
      context: stdLib.CanvasRenderingContext2D,
      opt_options: openlayersLib.openlayersMod.olxNs.renderNs.ToContextOptions
    ): openlayersLib.openlayersMod.renderNs.canvasNs.Immediate = js.native
    @JSName("canvas")
    @js.native
    object canvasNs extends js.Object {
      /**
        * @classdesc
        * A concrete subclass of {@link ol.render.VectorContext} that implements
        * direct rendering of features and geometries to an HTML5 Canvas context.
        * Instances of this class are created internally by the library and
        * provided to application code as vectorContext member of the
        * {@link ol.render.Event} object associated with postcompose, precompose and
        * render events emitted by layers and maps.
        *
        * @param context Context.
        * @param pixelRatio Pixel ratio.
        * @param extent Extent.
        * @param transform Transform.
        * @param viewRotation View rotation.
        * @struct
        */
      @js.native
      class Immediate protected ()
        extends openlayersLib.openlayersMod.renderNs.canvasNs.Immediate {
        /**
          * @classdesc
          * A concrete subclass of {@link ol.render.VectorContext} that implements
          * direct rendering of features and geometries to an HTML5 Canvas context.
          * Instances of this class are created internally by the library and
          * provided to application code as vectorContext member of the
          * {@link ol.render.Event} object associated with postcompose, precompose and
          * render events emitted by layers and maps.
          *
          * @param context Context.
          * @param pixelRatio Pixel ratio.
          * @param extent Extent.
          * @param transform Transform.
          * @param viewRotation View rotation.
          * @struct
          */
        def this(context: stdLib.CanvasRenderingContext2D, pixelRatio: scala.Double, extent: openlayersLib.openlayersMod.Extent, transform: js.Any, viewRotation: scala.Double) = this()
      }
      
    }
    
  }
  
  @JSName("source")
  @js.native
  object sourceNs extends js.Object {
    /**
      * @classdesc
      * Layer source for Bing Maps tile data.
      *
      * @param options Bing Maps options.
      * @api stable
      */
    @js.native
    class BingMaps protected ()
      extends openlayersLib.openlayersMod.sourceNs.BingMaps {
      /**
        * @classdesc
        * Layer source for Bing Maps tile data.
        *
        * @param options Bing Maps options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.BingMapsOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for the CartoDB tiles.
      *
      * @param options CartoDB options.
      * @api
      */
    @js.native
    class CartoDB protected ()
      extends openlayersLib.openlayersMod.sourceNs.CartoDB {
      /**
        * @classdesc
        * Layer source for the CartoDB tiles.
        *
        * @param options CartoDB options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.CartoDBOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source to cluster vector data. Works out of the box with point
      * geometries. For other geometry types, or if not all geometries should be
      * considered for clustering, a custom `geometryFunction` can be defined.
      *
      * @param options Constructor options.
      * @api
      */
    @js.native
    class Cluster protected ()
      extends openlayersLib.openlayersMod.sourceNs.Cluster {
      /**
        * @classdesc
        * Layer source to cluster vector data. Works out of the box with point
        * geometries. For other geometry types, or if not all geometries should be
        * considered for clustering, a custom `geometryFunction` can be defined.
        *
        * @param options Constructor options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ClusterOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for sources providing a single image.
      *
      * @param options Single image source options.
      * @api
      */
    @js.native
    class Image protected ()
      extends openlayersLib.openlayersMod.sourceNs.Image {
      /**
        * @classdesc
        * Abstract base class; normally only used for creating subclasses and not
        * instantiated in apps.
        * Base class for sources providing a single image.
        *
        * @param options Single image source options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.SourceImageOptions) = this()
    }
    
    /**
      * @classdesc
      * Source for data from ArcGIS Rest services providing single, untiled images.
      * Useful when underlying map service has labels.
      *
      * If underlying map service is not using labels,
      * take advantage of ol image caching and use
      * {@link ol.source.TileArcGISRest} data source.
      *
      * @fires ol.source.ImageEvent
      * @param opt_options Image ArcGIS Rest Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Source for data from ArcGIS Rest services providing single, untiled images.
      * Useful when underlying map service has labels.
      *
      * If underlying map service is not using labels,
      * take advantage of ol image caching and use
      * {@link ol.source.TileArcGISRest} data source.
      *
      * @fires ol.source.ImageEvent
      * @param opt_options Image ArcGIS Rest Options.
      * @api
      */
    class ImageArcGISRest ()
      extends openlayersLib.openlayersMod.sourceNs.ImageArcGISRest {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageArcGISRestOptions) = this()
    }
    
    /**
      * @classdesc
      * Base class for image sources where a canvas element is the image.
      *
      * @param options Constructor options.
      * @api
      */
    @js.native
    class ImageCanvas protected ()
      extends openlayersLib.openlayersMod.sourceNs.ImageCanvas {
      /**
        * @classdesc
        * Base class for image sources where a canvas element is the image.
        *
        * @param options Constructor options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageCanvasOptions) = this()
    }
    
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Image} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param image The image.
      */
    @js.native
    class ImageEvent protected ()
      extends openlayersLib.openlayersMod.sourceNs.ImageEvent {
      /**
        * @classdesc
        * Events emitted by {@link ol.source.Image} instances are instances of this
        * type.
        *
        * @param type Type.
        * @param image The image.
        */
      def this(`type`: java.lang.String, image: openlayersLib.openlayersMod.Image) = this()
    }
    
    /**
      * @classdesc
      * Source for images from Mapguide servers
      *
      * @fires ol.source.ImageEvent
      * @param options Options.
      * @api stable
      */
    @js.native
    class ImageMapGuide protected ()
      extends openlayersLib.openlayersMod.sourceNs.ImageMapGuide {
      /**
        * @classdesc
        * Source for images from Mapguide servers
        *
        * @fires ol.source.ImageEvent
        * @param options Options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageMapGuideOptions) = this()
    }
    
    /**
      * @classdesc
      * A layer source for displaying a single, static image.
      *
      * @param options Options.
      * @api stable
      */
    @js.native
    class ImageStatic protected ()
      extends openlayersLib.openlayersMod.sourceNs.ImageStatic {
      /**
        * @classdesc
        * A layer source for displaying a single, static image.
        *
        * @param options Options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageStaticOptions) = this()
    }
    
    /**
      * @classdesc
      * An image source whose images are canvas elements into which vector features
      * read from a vector source (`ol.source.Vector`) are drawn. An
      * `ol.source.ImageVector` object is to be used as the `source` of an image
      * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
      * as opposed to being re-rendered, during animations and interactions. So, like
      * any other image layer, an image layer configured with an
      * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
      * vector layer, where vector features are re-drawn during animations and
      * interactions.
      *
      * @param options Options.
      * @api
      */
    @js.native
    class ImageVector protected ()
      extends openlayersLib.openlayersMod.sourceNs.ImageVector {
      /**
        * @classdesc
        * An image source whose images are canvas elements into which vector features
        * read from a vector source (`ol.source.Vector`) are drawn. An
        * `ol.source.ImageVector` object is to be used as the `source` of an image
        * layer (`ol.layer.Image`). Image layers are rotated, scaled, and translated,
        * as opposed to being re-rendered, during animations and interactions. So, like
        * any other image layer, an image layer configured with an
        * `ol.source.ImageVector` will exhibit this behaviour. This is in contrast to a
        * vector layer, where vector features are re-drawn during animations and
        * interactions.
        *
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageVectorOptions) = this()
    }
    
    /**
      * @classdesc
      * Source for WMS servers providing single, untiled images.
      *
      * @fires ol.source.ImageEvent
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Source for WMS servers providing single, untiled images.
      *
      * @fires ol.source.ImageEvent
      * @param opt_options Options.
      * @api stable
      */
    class ImageWMS ()
      extends openlayersLib.openlayersMod.sourceNs.ImageWMS {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.ImageWMSOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for the OpenStreetMap tile server.
      *
      * @param opt_options Open Street Map options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Layer source for the OpenStreetMap tile server.
      *
      * @param opt_options Open Street Map options.
      * @api stable
      */
    class OSM ()
      extends openlayersLib.openlayersMod.sourceNs.OSM {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.OSMOptions) = this()
    }
    
    /**
      * @classdesc
      * A source that transforms data from any number of input sources using an array
      * of {@link ol.RasterOperation} functions to transform input pixel values into
      * output pixel values.
      *
      * @fires ol.source.RasterEvent
      * @param options Options.
      * @api
      */
    @js.native
    class Raster protected ()
      extends openlayersLib.openlayersMod.sourceNs.Raster {
      /**
        * @classdesc
        * A source that transforms data from any number of input sources using an array
        * of {@link ol.RasterOperation} functions to transform input pixel values into
        * output pixel values.
        *
        * @fires ol.source.RasterEvent
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.RasterOptions) = this()
    }
    
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Raster} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param frameState The frame state.
      * @param data An object made available to operations.
      */
    @js.native
    class RasterEvent protected ()
      extends openlayersLib.openlayersMod.sourceNs.RasterEvent {
      /**
        * @classdesc
        * Events emitted by {@link ol.source.Raster} instances are instances of this
        * type.
        *
        * @param type Type.
        * @param frameState The frame state.
        * @param data An object made available to operations.
        */
      def this(`type`: java.lang.String, frameState: openlayersLib.openlayersMod.olxNs.FrameState, data: openlayersLib.openlayersMod.GlobalObject) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for {@link ol.layer.Layer} sources.
      *
      * A generic `change` event is triggered when the state of the source changes.
      *
      * @param options Source options.
      * @api stable
      */
    @js.native
    class Source protected ()
      extends openlayersLib.openlayersMod.sourceNs.Source {
      /**
        * @classdesc
        * Abstract base class; normally only used for creating subclasses and not
        * instantiated in apps.
        * Base class for {@link ol.layer.Layer} sources.
        *
        * A generic `change` event is triggered when the state of the source changes.
        *
        * @param options Source options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.SourceSourceOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for the Stamen tile server.
      *
      * @param options Stamen options.
      * @api stable
      */
    @js.native
    class Stamen protected ()
      extends openlayersLib.openlayersMod.sourceNs.Stamen {
      /**
        * @classdesc
        * Layer source for the Stamen tile server.
        *
        * @param options Stamen options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.StamenOptions) = this()
    }
    
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * Base class for sources providing images divided into a tile grid.
      *
      * @param options Tile source options.
      * @api
      */
    @js.native
    class Tile protected ()
      extends openlayersLib.openlayersMod.sourceNs.Tile {
      /**
        * @classdesc
        * Abstract base class; normally only used for creating subclasses and not
        * instantiated in apps.
        * Base class for sources providing images divided into a tile grid.
        *
        * @param options Tile source options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.SourceTileOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data from ArcGIS Rest services. Map and Image
      * Services are supported.
      *
      * For cached ArcGIS services, better performance is available using the
      * {@link ol.source.XYZ} data source.
      *
      * @param opt_options Tile ArcGIS Rest
      *     options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Layer source for tile data from ArcGIS Rest services. Map and Image
      * Services are supported.
      *
      * For cached ArcGIS services, better performance is available using the
      * {@link ol.source.XYZ} data source.
      *
      * @param opt_options Tile ArcGIS Rest
      *     options.
      * @api
      */
    class TileArcGISRest ()
      extends openlayersLib.openlayersMod.sourceNs.TileArcGISRest {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.TileArcGISRestOptions) = this()
    }
    
    /**
      * @classdesc
      * A pseudo tile source, which does not fetch tiles from a server, but renders
      * a grid outline for the tile grid/projection along with the coordinates for
      * each tile. See examples/canvas-tiles for an example.
      *
      * Uses Canvas context2d, so requires Canvas support.
      *
      * @param options Debug tile options.
      * @api
      */
    @js.native
    class TileDebug protected ()
      extends openlayersLib.openlayersMod.sourceNs.TileDebug {
      /**
        * @classdesc
        * A pseudo tile source, which does not fetch tiles from a server, but renders
        * a grid outline for the tile grid/projection along with the coordinates for
        * each tile. See examples/canvas-tiles for an example.
        *
        * Uses Canvas context2d, so requires Canvas support.
        *
        * @param options Debug tile options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.TileDebugOptions) = this()
    }
    
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Tile} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param tile The tile.
      */
    @js.native
    class TileEvent protected ()
      extends openlayersLib.openlayersMod.sourceNs.TileEvent {
      /**
        * @classdesc
        * Events emitted by {@link ol.source.Tile} instances are instances of this
        * type.
        *
        * @param type Type.
        * @param tile The tile.
        */
      def this(`type`: java.lang.String, tile: openlayersLib.openlayersMod.Tile) = this()
    }
    
    /**
      * @classdesc
      * Base class for sources providing images divided into a tile grid.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      * @api
      */
    @js.native
    class TileImage protected ()
      extends openlayersLib.openlayersMod.sourceNs.TileImage {
      /**
        * @classdesc
        * Base class for sources providing images divided into a tile grid.
        *
        * @fires ol.source.TileEvent
        * @param options Image tile options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.TileImageOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data in TileJSON format.
      *
      * @param options TileJSON options.
      * @api stable
      */
    @js.native
    class TileJSON protected ()
      extends openlayersLib.openlayersMod.sourceNs.TileJSON {
      /**
        * @classdesc
        * Layer source for tile data in TileJSON format.
        *
        * @param options TileJSON options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.TileJSONOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for UTFGrid interaction data loaded from TileJSON format.
      *
      * @param options Source options.
      * @api
      */
    @js.native
    class TileUTFGrid protected ()
      extends openlayersLib.openlayersMod.sourceNs.TileUTFGrid {
      /**
        * @classdesc
        * Layer source for UTFGrid interaction data loaded from TileJSON format.
        *
        * @param options Source options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.TileUTFGridOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data from WMS servers.
      *
      * @param opt_options Tile WMS options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Layer source for tile data from WMS servers.
      *
      * @param opt_options Tile WMS options.
      * @api stable
      */
    class TileWMS ()
      extends openlayersLib.openlayersMod.sourceNs.TileWMS {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.TileWMSOptions) = this()
    }
    
    /**
      * @classdesc
      * Base class for sources providing tiles divided into a tile grid over http.
      *
      * @fires ol.source.TileEvent
      * @param options Image tile options.
      */
    @js.native
    class UrlTile protected ()
      extends openlayersLib.openlayersMod.sourceNs.UrlTile {
      /**
        * @classdesc
        * Base class for sources providing tiles divided into a tile grid over http.
        *
        * @fires ol.source.TileEvent
        * @param options Image tile options.
        */
      def this(options: openlayersLib.openlayersMod.SourceUrlTileOptions) = this()
    }
    
    /**
      * @classdesc
      * Provides a source of features for vector layers. Vector features provided
      * by this source are suitable for editing. See {@link ol.source.VectorTile} for
      * vector data that is optimized for rendering.
      *
      * @fires ol.source.VectorEvent
      * @param opt_options Vector source options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Provides a source of features for vector layers. Vector features provided
      * by this source are suitable for editing. See {@link ol.source.VectorTile} for
      * vector data that is optimized for rendering.
      *
      * @fires ol.source.VectorEvent
      * @param opt_options Vector source options.
      * @api stable
      */
    class Vector ()
      extends openlayersLib.openlayersMod.sourceNs.Vector {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.VectorOptions) = this()
    }
    
    /**
      * @classdesc
      * Events emitted by {@link ol.source.Vector} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_feature Feature.
      */
    @js.native
    class VectorEvent protected ()
      extends openlayersLib.openlayersMod.sourceNs.VectorEvent {
      /**
        * @classdesc
        * Events emitted by {@link ol.source.Vector} instances are instances of this
        * type.
        *
        * @param type Type.
        * @param opt_feature Feature.
        */
      def this(`type`: java.lang.String) = this()
      def this(`type`: java.lang.String, opt_feature: openlayersLib.openlayersMod.Feature) = this()
    }
    
    /**
      * @classdesc
      * Class for layer sources providing vector data divided into a tile grid, to be
      * used with {@link ol.layer.VectorTile}. Although this source receives tiles
      * with vector features from the server, it is not meant for feature editing.
      * Features are optimized for rendering, their geometries are clipped at or near
      * tile boundaries and simplified for a view resolution. See
      * {@link ol.source.Vector} for vector sources that are suitable for feature
      * editing.
      *
      * @fires ol.source.TileEvent
      * @param options Vector tile options.
      * @api
      */
    @js.native
    class VectorTile protected ()
      extends openlayersLib.openlayersMod.sourceNs.VectorTile {
      /**
        * @classdesc
        * Class for layer sources providing vector data divided into a tile grid, to be
        * used with {@link ol.layer.VectorTile}. Although this source receives tiles
        * with vector features from the server, it is not meant for feature editing.
        * Features are optimized for rendering, their geometries are clipped at or near
        * tile boundaries and simplified for a view resolution. See
        * {@link ol.source.Vector} for vector sources that are suitable for feature
        * editing.
        *
        * @fires ol.source.TileEvent
        * @param options Vector tile options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.VectorTileOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data from WMTS servers.
      *
      * @param options WMTS options.
      * @api stable
      */
    @js.native
    class WMTS protected ()
      extends openlayersLib.openlayersMod.sourceNs.WMTS {
      /**
        * @classdesc
        * Layer source for tile data from WMTS servers.
        *
        * @param options WMTS options.
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.sourceNs.WMTSOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data with URLs in a set XYZ format that are
      * defined in a URL template. By default, this follows the widely-used
      * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
      * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
      * using the `{-y}` placeholder in the URL template, so long as the
      * source does not have a custom tile grid. In this case,
      * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
      * such as:
      *
      *  tileUrlFunction: function(coordinate) {
      *    return 'http://mapserver.com/' + coordinate[0] + '/' +
      *        coordinate[1] + '/' + coordinate[2] + '.png';
      *    }
      *
      *
      * @param opt_options XYZ options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Layer source for tile data with URLs in a set XYZ format that are
      * defined in a URL template. By default, this follows the widely-used
      * Google grid where `x` 0 and `y` 0 are in the top left. Grids like
      * TMS where `x` 0 and `y` 0 are in the bottom left can be used by
      * using the `{-y}` placeholder in the URL template, so long as the
      * source does not have a custom tile grid. In this case,
      * {@link ol.source.TileImage} can be used with a `tileUrlFunction`
      * such as:
      *
      *  tileUrlFunction: function(coordinate) {
      *    return 'http://mapserver.com/' + coordinate[0] + '/' +
      *        coordinate[1] + '/' + coordinate[2] + '.png';
      *    }
      *
      *
      * @param opt_options XYZ options.
      * @api stable
      */
    class XYZ ()
      extends openlayersLib.openlayersMod.sourceNs.XYZ {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.XYZOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for tile data in Zoomify format.
      *
      * @param opt_options Options.
      * @api stable
      */
    @js.native
    /**
      * @classdesc
      * Layer source for tile data in Zoomify format.
      *
      * @param opt_options Options.
      * @api stable
      */
    class Zoomify ()
      extends openlayersLib.openlayersMod.sourceNs.Zoomify {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.sourceNs.ZoomifyOptions) = this()
    }
    
    /**
      * @classdesc
      * Layer source for Bing Maps tile data.
      *
      * @param options Bing Maps options.
      * @api stable
      */
    @js.native
    object BingMaps extends js.Object {
      /**
        * The attribution containing a link to the Microsoft® Bing™ Maps Platform APIs’
        * Terms Of Use.
        * @const
        * @api
        */
      var TOS_ATTRIBUTION: openlayersLib.openlayersMod.Attribution = js.native
    }
    
    /**
      * @classdesc
      * Layer source for the OpenStreetMap tile server.
      *
      * @param opt_options Open Street Map options.
      * @api stable
      */
    @js.native
    object OSM extends js.Object {
      /**
        * The attribution containing a link to the OpenStreetMap Copyright and License
        * page.
        * @const
        * @api
        */
      var ATTRIBUTION: openlayersLib.openlayersMod.Attribution = js.native
    }
    
    /**
      * @classdesc
      * Layer source for tile data from WMTS servers.
      *
      * @param options WMTS options.
      * @api stable
      */
    @js.native
    object WMTS extends js.Object {
      /**
        * Generate source options from a capabilities object.
        * @param wmtsCap An object representing the capabilities document.
        * @param config Configuration properties for the layer.  Defaults for
        *                  the layer will apply if not provided.
        *
        * Required config properties:
        *  - layer - {string} The layer identifier.
        *
        * Optional config properties:
        *  - matrixSet - {string} The matrix set identifier, required if there is
        *       more than one matrix set in the layer capabilities.
        *  - projection - {string} The desired CRS when no matrixSet is specified.
        *       eg: "EPSG:3857". If the desired projection is not available,
        *       an error is thrown.
        *  - requestEncoding - {string} url encoding format for the layer. Default is
        *       the first tile url format found in the GetCapabilities response.
        *  - style - {string} The name of the style
        *  - format - {string} Image format for the layer. Default is the first
        *       format returned in the GetCapabilities response.
        * @return WMTS source options object.
        * @api
        */
      def optionsFromCapabilities(
        wmtsCap: openlayersLib.openlayersMod.GlobalObject,
        config: openlayersLib.openlayersMod.GlobalObject
      ): openlayersLib.openlayersMod.olxNs.sourceNs.WMTSOptions = js.native
    }
    
  }
  
  @JSName("style")
  @js.native
  object styleNs extends js.Object {
    /**
      * Manages the creation of image atlases.
      *
      * Images added to this manager will be inserted into an atlas, which
      * will be used for rendering.
      * The `size` given in the constructor is the size for the first
      * atlas. After that, when new atlases are created, they will have
      * twice the size as the latest atlas (until `maxSize` is reached).
      *
      * If an application uses many images or very large images, it is recommended
      * to set a higher `size` value to avoid the creation of too many atlases.
      *
      * @struct
      * @api
      * @param opt_options Options.
      */
    /* tslint:disable-next-line:no-unnecessary-class */
    @js.native
    /**
      * Manages the creation of image atlases.
      *
      * Images added to this manager will be inserted into an atlas, which
      * will be used for rendering.
      * The `size` given in the constructor is the size for the first
      * atlas. After that, when new atlases are created, they will have
      * twice the size as the latest atlas (until `maxSize` is reached).
      *
      * If an application uses many images or very large images, it is recommended
      * to set a higher `size` value to avoid the creation of too many atlases.
      *
      * @struct
      * @api
      * @param opt_options Options.
      */
    class AtlasManager ()
      extends openlayersLib.openlayersMod.styleNs.AtlasManager {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.AtlasManagerOptions) = this()
    }
    
    /**
      * @classdesc
      * Set circle style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Set circle style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    class Circle ()
      extends openlayersLib.openlayersMod.styleNs.Circle {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.CircleOptions) = this()
    }
    
    /**
      * @classdesc
      * Set fill style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Set fill style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    class Fill ()
      extends openlayersLib.openlayersMod.styleNs.Fill {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.FillOptions) = this()
    }
    
    /**
      * @classdesc
      * Set icon style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Set icon style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    class Icon ()
      extends openlayersLib.openlayersMod.styleNs.Icon {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.IconOptions) = this()
    }
    
    /**
      * @classdesc
      * A base class used for creating subclasses and not instantiated in
      * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
      * {@link ol.style.RegularShape}.
      *
      * @param options Options.
      * @api
      */
    @js.native
    class Image protected ()
      extends openlayersLib.openlayersMod.styleNs.Image {
      /**
        * @classdesc
        * A base class used for creating subclasses and not instantiated in
        * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
        * {@link ol.style.RegularShape}.
        *
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.StyleImageOptions) = this()
    }
    
    /**
      * @classdesc
      * Set regular shape style for vector features. The resulting shape will be
      * a regular polygon when `radius` is provided, or a star when `radius1` and
      * `radius2` are provided.
      *
      * @param options Options.
      * @api
      */
    @js.native
    class RegularShape protected ()
      extends openlayersLib.openlayersMod.styleNs.RegularShape {
      /**
        * @classdesc
        * Set regular shape style for vector features. The resulting shape will be
        * a regular polygon when `radius` is provided, or a star when `radius1` and
        * `radius2` are provided.
        *
        * @param options Options.
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.styleNs.RegularShapeOptions) = this()
    }
    
    /**
      * @classdesc
      * Set stroke style for vector features.
      * Note that the defaults given are the Canvas defaults, which will be used if
      * option is not defined. The `get` functions return whatever was entered in
      * the options; they will not return the default.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Set stroke style for vector features.
      * Note that the defaults given are the Canvas defaults, which will be used if
      * option is not defined. The `get` functions return whatever was entered in
      * the options; they will not return the default.
      *
      * @param opt_options Options.
      * @api
      */
    class Stroke ()
      extends openlayersLib.openlayersMod.styleNs.Stroke {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.StrokeOptions) = this()
    }
    
    /**
      * @classdesc
      * Container for vector feature rendering styles. Any changes made to the style
      * or its children through `set*()` methods will not take effect until the
      * feature or layer that uses the style is re-rendered.
      *
      * @struct
      * @param opt_options Style options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Container for vector feature rendering styles. Any changes made to the style
      * or its children through `set*()` methods will not take effect until the
      * feature or layer that uses the style is re-rendered.
      *
      * @struct
      * @param opt_options Style options.
      * @api
      */
    class Style ()
      extends openlayersLib.openlayersMod.styleNs.Style {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.StyleOptions) = this()
    }
    
    /**
      * @classdesc
      * Set text style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    @js.native
    /**
      * @classdesc
      * Set text style for vector features.
      *
      * @param opt_options Options.
      * @api
      */
    class Text ()
      extends openlayersLib.openlayersMod.styleNs.Text {
      def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.TextOptions) = this()
    }
    
  }
  
  @JSName("tilegrid")
  @js.native
  object tilegridNs extends js.Object {
    /**
      * @classdesc
      * Base class for setting the grid pattern for sources accessing tiled-image
      * servers.
      *
      * @param options Tile grid options.
      * @struct
      * @api stable
      */
    @js.native
    class TileGrid protected ()
      extends openlayersLib.openlayersMod.tilegridNs.TileGrid {
      /**
        * @classdesc
        * Base class for setting the grid pattern for sources accessing tiled-image
        * servers.
        *
        * @param options Tile grid options.
        * @struct
        * @api stable
        */
      def this(options: openlayersLib.openlayersMod.olxNs.tilegridNs.TileGridOptions) = this()
    }
    
    /**
      * @classdesc
      * Set the grid pattern for sources accessing WMTS tiled-image servers.
      *
      * @param options WMTS options.
      * @struct
      * @api
      */
    @js.native
    class WMTS protected ()
      extends openlayersLib.openlayersMod.tilegridNs.WMTS {
      /**
        * @classdesc
        * Set the grid pattern for sources accessing WMTS tiled-image servers.
        *
        * @param options WMTS options.
        * @struct
        * @api
        */
      def this(options: openlayersLib.openlayersMod.olxNs.tilegridNs.WMTSOptions) = this()
    }
    
    /**
      * Creates a tile grid with a standard XYZ tiling scheme.
      * @param opt_options Tile grid options.
      * @return Tile grid instance.
      * @api
      */
    def createXYZ(): openlayersLib.openlayersMod.tilegridNs.TileGrid = js.native
    def createXYZ(opt_options: openlayersLib.openlayersMod.olxNs.tilegridNs.XYZOptions): openlayersLib.openlayersMod.tilegridNs.TileGrid = js.native
    /**
      * @classdesc
      * Set the grid pattern for sources accessing WMTS tiled-image servers.
      *
      * @param options WMTS options.
      * @struct
      * @api
      */
    @js.native
    object WMTS extends js.Object {
      /**
        * Create a tile grid from a WMTS capabilities matrix set.
        * @param matrixSet An object representing a matrixSet in the
        *     capabilities document.
        * @param opt_extent An optional extent to restrict the tile
        *     ranges the server provides.
        * @return WMTS tileGrid instance.
        * @api
        */
      def createFromCapabilitiesMatrixSet(matrixSet: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.tilegridNs.WMTS = js.native
      def createFromCapabilitiesMatrixSet(
        matrixSet: openlayersLib.openlayersMod.GlobalObject,
        opt_extent: openlayersLib.openlayersMod.Extent
      ): openlayersLib.openlayersMod.tilegridNs.WMTS = js.native
    }
    
  }
  
}

