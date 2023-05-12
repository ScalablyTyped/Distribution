package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMouseWheelZoomMod {
  
  /**
    * @typedef {'trackpad' | 'wheel'} Mode
    */
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.always}.
    * @property {boolean} [onFocusOnly=false] When the map's target has a `tabindex` attribute set,
    * the interaction will only handle events when the map has the focus.
    * @property {number} [maxDelta=1] Maximum mouse wheel delta.
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {number} [timeout=80] Mouse wheel timeout duration in milliseconds.
    * @property {boolean} [useAnchor=true] Enable zooming using the mouse's
    * location as the anchor. When set to `false`, zooming in and out will zoom to
    * the center of the screen instead of zooming on the mouse's location.
    * @property {boolean} [constrainResolution=false] If true, the mouse wheel zoom
    * event will always animate to the closest zoom level after an interaction;
    * false means intermediary zoom levels are allowed.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    * @api
    */
  @JSImport("ol/interaction/MouseWheelZoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends MouseWheelZoom {
    def this(options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.trackpad
    - typings.ol.olStrings.wheel
  */
  trait Mode extends StObject
  object Mode {
    
    inline def trackpad: typings.ol.olStrings.trackpad = "trackpad".asInstanceOf[typings.ol.olStrings.trackpad]
    
    inline def wheel: typings.ol.olStrings.wheel = "wheel".asInstanceOf[typings.ol.olStrings.wheel]
  }
  
  /**
    * @typedef {'trackpad' | 'wheel'} Mode
    */
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.always}.
    * @property {boolean} [onFocusOnly=false] When the map's target has a `tabindex` attribute set,
    * the interaction will only handle events when the map has the focus.
    * @property {number} [maxDelta=1] Maximum mouse wheel delta.
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {number} [timeout=80] Mouse wheel timeout duration in milliseconds.
    * @property {boolean} [useAnchor=true] Enable zooming using the mouse's
    * location as the anchor. When set to `false`, zooming in and out will zoom to
    * the center of the screen instead of zooming on the mouse's location.
    * @property {boolean} [constrainResolution=false] If true, the mouse wheel zoom
    * event will always animate to the closest zoom level after an interaction;
    * false means intermediary zoom levels are allowed.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    * @api
    */
  @js.native
  trait MouseWheelZoom
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var constrainResolution_ : Any = js.native
    
    /**
      * The number of delta values per zoom level
      * @private
      * @type {number}
      */
    /* private */ var deltaPerZoom_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var endInteraction_ : Any = js.native
    
    /**
      * @private
      * @param {import("../Map.js").default} map Map.
      */
    /* private */ var handleWheelZoom_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../coordinate.js").Coordinate}
      */
    /* private */ var lastAnchor_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var lastDelta_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDelta_ : Any = js.native
    
    /**
      * @private
      * @type {Mode|undefined}
      */
    /* private */ var mode_ : Any = js.native
    
    /**
      * Enable or disable using the mouse's location as an anchor when zooming
      * @param {boolean} useAnchor true to zoom to the mouse's location, false
      * to zoom to the center of the map
      * @api
      */
    def setMouseAnchor(useAnchor: Boolean): Unit = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var startTime_ : Any = js.native
    
    /**
      * @private
      * @type {?}
      */
    /* private */ var timeoutId_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var timeout_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var totalDelta_ : Any = js.native
    
    /**
      * Trackpad events separated by this delay will be considered separate
      * interactions.
      * @type {number}
      */
    var trackpadEventGap_ : Double = js.native
    
    /**
      * @type {?}
      */
    var trackpadTimeoutId_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var useAnchor_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. Default is
      * {@link module :ol/events/condition.always}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * If true, the mouse wheel zoom
      * event will always animate to the closest zoom level after an interaction;
      * false means intermediary zoom levels are allowed.
      */
    var constrainResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum mouse wheel delta.
      */
    var maxDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * When the map's target has a `tabindex` attribute set,
      * the interaction will only handle events when the map has the focus.
      */
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mouse wheel timeout duration in milliseconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable zooming using the mouse's
      * location as the anchor. When set to `false`, zooming in and out will zoom to
      * the center of the screen instead of zooming on the mouse's location.
      */
    var useAnchor: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
      
      inline def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
    }
  }
}
