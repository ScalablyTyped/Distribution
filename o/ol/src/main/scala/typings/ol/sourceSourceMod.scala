package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.ol.viewMod.ViewOptions
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSourceMod {
  
  /**
    * @typedef {'undefined' | 'loading' | 'ready' | 'error'} State
    * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
    */
  /**
    * A function that takes a {@link import("../View.js").ViewStateAndExtent} and returns a string or
    * an array of strings representing source attributions.
    *
    * @typedef {function(import("../View.js").ViewStateAndExtent): (string|Array<string>)} Attribution
    */
  /**
    * A type that can be used to provide attribution information for data sources.
    *
    * It represents either
    * * a simple string (e.g. `'© Acme Inc.'`)
    * * an array of simple strings (e.g. `['© Acme Inc.', '© Bacme Inc.']`)
    * * a function that returns a string or array of strings ({@link module:ol/source/Source~Attribution})
    *
    * @typedef {string|Array<string>|Attribution} AttributionLike
    */
  /**
    * @typedef {Object} Options
    * @property {AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("./Source.js").State} [state='ready'] State.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link module:ol/layer/Layer~Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    * @abstract
    * @api
    */
  @JSImport("ol/source/Source", JSImport.Default)
  @js.native
  open class default protected () extends Source {
    /**
      * @param {Options} options Source options.
      */
    def this(options: Options) = this()
  }
  
  type Attribution = js.Function1[/* arg0 */ ViewStateAndExtent, String | js.Array[String]]
  
  type AttributionLike = String | js.Array[String] | Attribution
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Attributions are collapsible.
      */
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection. Default is the view projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * State.
      */
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * WrapX.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  /**
    * @typedef {'undefined' | 'loading' | 'ready' | 'error'} State
    * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
    */
  /**
    * A function that takes a {@link import("../View.js").ViewStateAndExtent} and returns a string or
    * an array of strings representing source attributions.
    *
    * @typedef {function(import("../View.js").ViewStateAndExtent): (string|Array<string>)} Attribution
    */
  /**
    * A type that can be used to provide attribution information for data sources.
    *
    * It represents either
    * * a simple string (e.g. `'© Acme Inc.'`)
    * * an array of simple strings (e.g. `['© Acme Inc.', '© Bacme Inc.']`)
    * * a function that returns a string or array of strings ({@link module:ol/source/Source~Attribution})
    *
    * @typedef {string|Array<string>|Attribution} AttributionLike
    */
  /**
    * @typedef {Object} Options
    * @property {AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {import("./Source.js").State} [state='ready'] State.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for {@link module:ol/layer/Layer~Layer} sources.
    *
    * A generic `change` event is triggered when the state of the source changes.
    * @abstract
    * @api
    */
  @js.native
  trait Source
    extends typings.ol.objectMod.default {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var attributionsCollapsible_ : Any = js.native
    
    /**
      * @private
      * @type {?Attribution}
      */
    /* private */ var attributions_ : Any = js.native
    
    /**
      * Get the attribution function for the source.
      * @return {?Attribution} Attribution function.
      * @api
      */
    def getAttributions(): Attribution | Null = js.native
    
    /**
      * @return {boolean} Attributions are collapsible.
      * @api
      */
    def getAttributionsCollapsible(): Boolean = js.native
    
    /**
      * @return {boolean} Use linear interpolation when resampling.
      */
    def getInterpolate(): Boolean = js.native
    
    /**
      * Get the projection of the source.
      * @return {import("../proj/Projection.js").default|null} Projection.
      * @api
      */
    def getProjection(): typings.ol.projProjectionMod.default | Null = js.native
    
    /**
      * @param {import("../proj/Projection").default} [projection] Projection.
      * @return {Array<number>|null} Resolutions.
      */
    def getResolutions(): js.Array[Double] | Null = js.native
    def getResolutions(projection: typings.ol.projProjectionMod.default): js.Array[Double] | Null = js.native
    
    /**
      * Get the state of the source, see {@link import("./Source.js").State} for possible states.
      * @return {import("./Source.js").State} State.
      * @api
      */
    def getState(): State = js.native
    
    /**
      * @return {Promise<import("../View.js").ViewOptions>} A promise for view-related properties.
      */
    def getView(): js.Promise[ViewOptions] = js.native
    
    /**
      * @return {boolean|undefined} Wrap X.
      */
    def getWrapX(): js.UndefOr[Boolean] = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var interpolate_ : Any = js.native
    
    /**
      * This source is currently loading data. Sources that defer loading to the
      * map's tile queue never set this to `true`.
      * @type {boolean}
      */
    var loading: Boolean = js.native
    
    /**
      * @protected
      * @type {import("../proj/Projection.js").default|null}
      */
    /* protected */ var projection: typings.ol.projProjectionMod.default | Null = js.native
    
    /**
      * Refreshes the source. The source will be cleared, and data from the server will be reloaded.
      * @api
      */
    def refresh(): Unit = js.native
    
    /**
      * Set the attributions of the source.
      * @param {AttributionLike|undefined} attributions Attributions.
      *     Can be passed as `string`, `Array<string>`, {@link module:ol/source/Source~Attribution},
      *     or `undefined`.
      * @api
      */
    def setAttributions(): Unit = js.native
    def setAttributions(attributions: AttributionLike): Unit = js.native
    
    /**
      * Set the state of the source.
      * @param {import("./Source.js").State} state State.
      */
    def setState(state: State): Unit = js.native
    
    /**
      * @private
      * @type {import("./Source.js").State}
      */
    /* private */ var state_ : Any = js.native
    
    /**
      * @private
      * @type {Promise<import("../View.js").ViewOptions>}
      */
    /* private */ var viewPromise_ : Any = js.native
    
    /**
      * @protected
      * @type {function(Error):void}
      */
    /* protected */ def viewRejector(arg0: js.Error): Unit = js.native
    
    /**
      * @protected
      * @type {function(import("../View.js").ViewOptions):void}
      */
    /* protected */ def viewResolver(arg0: ViewOptions): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var wrapX_ : Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.undefined
    - typings.ol.olStrings.loading
    - typings.ol.olStrings.ready
    - typings.ol.olStrings.error
  */
  trait State extends StObject
  object State {
    
    inline def error: typings.ol.olStrings.error = "error".asInstanceOf[typings.ol.olStrings.error]
    
    inline def loading: typings.ol.olStrings.loading = "loading".asInstanceOf[typings.ol.olStrings.loading]
    
    inline def ready: typings.ol.olStrings.ready = "ready".asInstanceOf[typings.ol.olStrings.ready]
    
    inline def undefined: typings.ol.olStrings.undefined = "undefined".asInstanceOf[typings.ol.olStrings.undefined]
  }
}
