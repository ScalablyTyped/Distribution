package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.error
import typings.ol.projMod.ProjectionLike
import typings.std.GeolocationPositionError
import typings.std.PositionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocationMod {
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [tracking=false] Start Tracking right after
    * instantiation.
    * @property {PositionOptions} [trackingOptions] Tracking options.
    * See https://www.w3.org/TR/geolocation-API/#position_options_interface.
    * @property {import("./proj.js").ProjectionLike} [projection] The projection the position
    * is reported in.
    */
  /**
    * @typedef {import("./ObjectEventType").Types|'change:accuracy'|'change:accuracyGeometry'|'change:altitude'|
    *    'change:altitudeAccuracy'|'change:heading'|'change:position'|'change:projection'|'change:speed'|'change:tracking'|
    *    'change:trackingOptions'} GeolocationObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<GeolocationObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'error', GeolocationError, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|GeolocationObjectEventTypes, Return> &
    *   import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return>} GeolocationOnSignature
    */
  /**
    * @classdesc
    * Helper class for providing HTML5 Geolocation capabilities.
    * The [Geolocation API](https://www.w3.org/TR/geolocation-API/)
    * is used to locate a user's position.
    *
    * To get notified of position changes and errors, register listeners for the generic
    * `change` event and the `error` event on your instance of {@link module:ol/Geolocation~Geolocation}.
    *
    * Example:
    *
    *     const geolocation = new Geolocation({
    *       // take the projection to use from the map's view
    *       projection: view.getProjection()
    *     });
    *     // listen to changes in position
    *     geolocation.on('change', function(evt) {
    *       console.log(geolocation.getPosition());
    *     });
    *     // listen to error
    *     geolocation.on('error', function(evt) {
    *       window.console.log(evt.message);
    *     });
    *
    * @fires GeolocationError
    * @api
    */
  @JSImport("ol/Geolocation", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Geolocation {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/Geolocation", "GeolocationError")
  @js.native
  open class GeolocationError protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {GeolocationPositionError} error error object.
      */
    def this(error: GeolocationPositionError) = this()
    
    /**
      * Code of the underlying `GeolocationPositionError`.
      * @type {number}
      * @api
      */
    var code: Double = js.native
    
    /**
      * Message of the underlying `GeolocationPositionError`.
      * @type {string}
      * @api
      */
    var message: String = js.native
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [tracking=false] Start Tracking right after
    * instantiation.
    * @property {PositionOptions} [trackingOptions] Tracking options.
    * See https://www.w3.org/TR/geolocation-API/#position_options_interface.
    * @property {import("./proj.js").ProjectionLike} [projection] The projection the position
    * is reported in.
    */
  /**
    * @typedef {import("./ObjectEventType").Types|'change:accuracy'|'change:accuracyGeometry'|'change:altitude'|
    *    'change:altitudeAccuracy'|'change:heading'|'change:position'|'change:projection'|'change:speed'|'change:tracking'|
    *    'change:trackingOptions'} GeolocationObjectEventTypes
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<GeolocationObjectEventTypes, import("./Object").ObjectEvent, Return> &
    *   import("./Observable").OnSignature<'error', GeolocationError, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|GeolocationObjectEventTypes, Return> &
    *   import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return>} GeolocationOnSignature
    */
  /**
    * @classdesc
    * Helper class for providing HTML5 Geolocation capabilities.
    * The [Geolocation API](https://www.w3.org/TR/geolocation-API/)
    * is used to locate a user's position.
    *
    * To get notified of position changes and errors, register listeners for the generic
    * `change` event and the `error` event on your instance of {@link module:ol/Geolocation~Geolocation}.
    *
    * Example:
    *
    *     const geolocation = new Geolocation({
    *       // take the projection to use from the map's view
    *       projection: view.getProjection()
    *     });
    *     // listen to changes in position
    *     geolocation.on('change', function(evt) {
    *       console.log(geolocation.getPosition());
    *     });
    *     // listen to error
    *     geolocation.on('error', function(evt) {
    *       window.console.log(evt.message);
    *     });
    *
    * @fires GeolocationError
    * @api
    */
  @js.native
  trait Geolocation
    extends typings.ol.objectMod.default {
    
    /**
      * Get the accuracy of the position in meters.
      * @return {number|undefined} The accuracy of the position measurement in
      *     meters.
      * @observable
      * @api
      */
    def getAccuracy(): js.UndefOr[Double] = js.native
    
    /**
      * Get a geometry of the position accuracy.
      * @return {?import("./geom/Polygon.js").default} A geometry of the position accuracy.
      * @observable
      * @api
      */
    def getAccuracyGeometry(): typings.ol.geomPolygonMod.default | Null = js.native
    
    /**
      * Get the altitude associated with the position.
      * @return {number|undefined} The altitude of the position in meters above mean
      *     sea level.
      * @observable
      * @api
      */
    def getAltitude(): js.UndefOr[Double] = js.native
    
    /**
      * Get the altitude accuracy of the position.
      * @return {number|undefined} The accuracy of the altitude measurement in
      *     meters.
      * @observable
      * @api
      */
    def getAltitudeAccuracy(): js.UndefOr[Double] = js.native
    
    /**
      * Get the heading as radians clockwise from North.
      * Note: depending on the browser, the heading is only defined if the `enableHighAccuracy`
      * is set to `true` in the tracking options.
      * @return {number|undefined} The heading of the device in radians from north.
      * @observable
      * @api
      */
    def getHeading(): js.UndefOr[Double] = js.native
    
    /**
      * Get the position of the device.
      * @return {import("./coordinate.js").Coordinate|undefined} The current position of the device reported
      *     in the current projection.
      * @observable
      * @api
      */
    def getPosition(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the projection associated with the position.
      * @return {import("./proj/Projection.js").default|undefined} The projection the position is
      *     reported in.
      * @observable
      * @api
      */
    def getProjection(): js.UndefOr[typings.ol.projProjectionMod.default] = js.native
    
    /**
      * Get the speed in meters per second.
      * @return {number|undefined} The instantaneous speed of the device in meters
      *     per second.
      * @observable
      * @api
      */
    def getSpeed(): js.UndefOr[Double] = js.native
    
    /**
      * Determine if the device location is being tracked.
      * @return {boolean} The device location is being tracked.
      * @observable
      * @api
      */
    def getTracking(): Boolean = js.native
    
    /**
      * Get the tracking options.
      * See https://www.w3.org/TR/geolocation-API/#position-options.
      * @return {PositionOptions|undefined} PositionOptions as defined by
      *     the [HTML5 Geolocation spec
      *     ](https://www.w3.org/TR/geolocation-API/#position_options_interface).
      * @observable
      * @api
      */
    def getTrackingOptions(): js.UndefOr[PositionOptions] = js.native
    
    /**
      * @private
      */
    /* private */ var handleProjectionChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleTrackingChanged_ : Any = js.native
    
    /***
      * @type {GeolocationOnSignature<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_Geolocation: GeolocationOnSignature[EventsKey] = js.native
    
    /***
      * @type {GeolocationOnSignature<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_Geolocation: GeolocationOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @param {GeolocationPosition} position position event.
      */
    /* private */ var positionChange_ : Any = js.native
    
    /**
      * @private
      * @param {GeolocationPositionError} error error object.
      */
    /* private */ var positionError_ : Any = js.native
    
    /**
      * The unprojected (EPSG:4326) device position.
      * @private
      * @type {?import("./coordinate.js").Coordinate}
      */
    /* private */ var position_ : Any = js.native
    
    /**
      * Set the projection to use for transforming the coordinates.
      * @param {import("./proj.js").ProjectionLike} projection The projection the position is
      *     reported in.
      * @observable
      * @api
      */
    def setProjection(projection: ProjectionLike): Unit = js.native
    
    /**
      * Enable or disable tracking.
      * @param {boolean} tracking Enable tracking.
      * @observable
      * @api
      */
    def setTracking(tracking: Boolean): Unit = js.native
    
    /**
      * Set the tracking options.
      * See http://www.w3.org/TR/geolocation-API/#position-options.
      * @param {PositionOptions} options PositionOptions as defined by the
      *     [HTML5 Geolocation spec
      *     ](http://www.w3.org/TR/geolocation-API/#position_options_interface).
      * @observable
      * @api
      */
    def setTrackingOptions(options: PositionOptions): Unit = js.native
    
    /**
      * @private
      * @type {import("./proj.js").TransformFunction}
      */
    /* private */ var transform_ : Any = js.native
    
    /***
      * @type {GeolocationOnSignature<void>}
      */
    @JSName("un")
    var un_Geolocation: GeolocationOnSignature[Unit] = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var watchId_ : Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.objectEventTypeMod.Types
    - typings.ol.olStrings.changeColonaccuracy
    - typings.ol.olStrings.changeColonaccuracyGeometry
    - typings.ol.olStrings.changeColonaltitude
    - typings.ol.olStrings.changeColonaltitudeAccuracy
    - typings.ol.olStrings.changeColonheading
    - typings.ol.olStrings.changeColonposition
    - typings.ol.olStrings.changeColonprojection
    - typings.ol.olStrings.changeColonspeed
    - typings.ol.olStrings.changeColontracking
    - typings.ol.olStrings.changeColontrackingOptions
  */
  type GeolocationObjectEventTypes = _GeolocationObjectEventTypes | Types
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait GeolocationOnSignature[Return]
    extends OnSignature[
          error | EventTypes | GeolocationObjectEventTypes, 
          GeolocationError | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * The projection the position
      * is reported in.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Start Tracking right after
      * instantiation.
      */
    var tracking: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tracking options.
      * See https://www.w3.org/TR/geolocation-API/#position_options_interface.
      */
    var trackingOptions: js.UndefOr[PositionOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptions(value: PositionOptions): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    }
  }
  
  trait _GeolocationObjectEventTypes extends StObject
}
