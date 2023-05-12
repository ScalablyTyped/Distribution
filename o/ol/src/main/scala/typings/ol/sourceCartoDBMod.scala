package typings.ol

import typings.ol.anon.Https
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCartoDBMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [maxZoom=18] Max zoom.
    * @property {number} [minZoom] Minimum zoom.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {Object} [config] If using anonymous maps, the CartoDB config to use. See
    * https://carto.com/developers/maps-api/guides/anonymous-maps/
    * for more detail.
    * If using named maps, a key-value lookup with the template parameters.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [map] If using named maps, this will be the name of the template to load.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [account] Username as used to access public Carto dashboard at https://{username}.carto.com/.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @typedef {Object} CartoDBLayerInfo
    * @property {string} layergroupid The layer group ID
    * @property {{https: string}} cdn_url The CDN URL
    */
  /**
    * @classdesc
    * Layer source for the CartoDB Maps API.
    * @api
    */
  @JSImport("ol/source/CartoDB", JSImport.Default)
  @js.native
  open class default protected () extends CartoDB {
    /**
      * @param {Options} options CartoDB options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {import("../proj.js").ProjectionLike} [projection='EPSG:3857'] Projection.
    * @property {number} [maxZoom=18] Max zoom.
    * @property {number} [minZoom] Minimum zoom.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {Object} [config] If using anonymous maps, the CartoDB config to use. See
    * https://carto.com/developers/maps-api/guides/anonymous-maps/
    * for more detail.
    * If using named maps, a key-value lookup with the template parameters.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [map] If using named maps, this will be the name of the template to load.
    * See https://carto.com/developers/maps-api/guides/named-maps/
    * for more detail.
    * @property {string} [account] Username as used to access public Carto dashboard at https://{username}.carto.com/.
    * @property {number} [transition=250] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @typedef {Object} CartoDBLayerInfo
    * @property {string} layergroupid The layer group ID
    * @property {{https: string}} cdn_url The CDN URL
    */
  /**
    * @classdesc
    * Layer source for the CartoDB Maps API.
    * @api
    */
  @js.native
  trait CartoDB
    extends typings.ol.sourceXyzMod.default {
    
    /**
      * @type {string}
      * @private
      */
    /* private */ var account_ : Any = js.native
    
    /**
      * Apply the new tile urls returned by carto db
      * @param {CartoDBLayerInfo} data Result of carto db call.
      * @private
      */
    /* private */ var applyTemplate_ : Any = js.native
    
    /**
      * @type {!Object}
      * @private
      */
    /* private */ var config_ : Any = js.native
    
    /**
      * Returns the current config.
      * @return {!Object} The current configuration.
      * @api
      */
    def getConfig(): Any = js.native
    
    /**
      * @private
      * @param {Event} event Event.
      */
    /* private */ var handleInitError_ : Any = js.native
    
    /**
      * Handle map initialization response.
      * @param {string} paramHash a hash representing the parameter set that was used
      *     for the request
      * @param {Event} event Event.
      * @private
      */
    /* private */ var handleInitResponse_ : Any = js.native
    
    /**
      * Issue a request to initialize the CartoDB map.
      * @private
      */
    /* private */ var initializeMap_ : Any = js.native
    
    /**
      * @type {string}
      * @private
      */
    /* private */ var mapId_ : Any = js.native
    
    /**
      * Sets the CartoDB config
      * @param {Object} config In the case of anonymous maps, a CartoDB configuration
      *     object.
      * If using named maps, a key-value lookup with the template parameters.
      * @api
      */
    def setConfig(config: Any): Unit = js.native
    
    /**
      * @type {!Object<string, CartoDBLayerInfo>}
      * @private
      */
    /* private */ var templateCache_ : Any = js.native
    
    /**
      * Updates the carto db config.
      * @param {Object} config a key-value lookup. Values will replace current values
      *     in the config.
      * @api
      */
    def updateConfig(config: Any): Unit = js.native
  }
  
  trait CartoDBLayerInfo extends StObject {
    
    /**
      * The CDN URL
      */
    var cdn_url: Https
    
    /**
      * The layer group ID
      */
    var layergroupid: String
  }
  object CartoDBLayerInfo {
    
    inline def apply(cdn_url: Https, layergroupid: String): CartoDBLayerInfo = {
      val __obj = js.Dynamic.literal(cdn_url = cdn_url.asInstanceOf[js.Any], layergroupid = layergroupid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CartoDBLayerInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CartoDBLayerInfo] (val x: Self) extends AnyVal {
      
      inline def setCdn_url(value: Https): Self = StObject.set(x, "cdn_url", value.asInstanceOf[js.Any])
      
      inline def setLayergroupid(value: String): Self = StObject.set(x, "layergroupid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Username as used to access public Carto dashboard at https://{username}.carto.com/.
      */
    var account: js.UndefOr[String] = js.undefined
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * If using anonymous maps, the CartoDB config to use. See
      * https://carto.com/developers/maps-api/guides/anonymous-maps/
      * for more detail.
      * If using named maps, a key-value lookup with the template parameters.
      * See https://carto.com/developers/maps-api/guides/named-maps/
      * for more detail.
      */
    var config: js.UndefOr[Any] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If using named maps, this will be the name of the template to load.
      * See https://carto.com/developers/maps-api/guides/named-maps/
      * for more detail.
      */
    var map: js.UndefOr[String] = js.undefined
    
    /**
      * Max zoom.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum zoom.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
}
