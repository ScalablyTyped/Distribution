package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.absolute
import typings.ol.olStrings.changeColonunits
import typings.ol.olStrings.relative
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlScaleLineMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:units', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |'change:units', Return>} ScaleLineOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className] CSS class name. The default is `ol-scale-bar` when configured with
    * `bar: true`. Otherwise the default is `ol-scale-line`.
    * @property {number} [minWidth=64] Minimum width in pixels at the OGC default dpi. The width will be
    * adjusted to match the dpi used.
    * @property {number} [maxWidth] Maximum width in pixels at the OGC default dpi. The width will be
    * adjusted to match the dpi used.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {Units} [units='metric'] Units.
    * @property {boolean} [bar=false] Render scalebars instead of a line.
    * @property {number} [steps=4] Number of steps the scalebar should use. Use even numbers
    * for best results. Only applies when `bar` is `true`.
    * @property {boolean} [text=false] Render the text scale above of the scalebar. Only applies
    * when `bar` is `true`.
    * @property {number|undefined} [dpi=undefined] dpi of output device such as printer. Only applies
    * when `bar` is `true`. If undefined the OGC default screen pixel size of 0.28mm will be assumed.
    */
  /**
    * @classdesc
    * A control displaying rough y-axis distances, calculated for the center of the
    * viewport. For conformal projections (e.g. EPSG:3857, the default view
    * projection in OpenLayers), the scale is valid for all directions.
    * No scale line will be shown when the y-axis distance of a pixel at the
    * viewport center cannot be calculated in the view projection.
    * By default the scale line will show in the bottom left portion of the map,
    * but this can be changed by using the css selector `.ol-scale-line`.
    * When specifying `bar` as `true`, a scalebar will be rendered instead
    * of a scaleline.
    *
    * @api
    */
  @JSImport("ol/control/ScaleLine", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Scale line options.
    */
  open class default () extends ScaleLine {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Render scalebars instead of a line.
      */
    var bar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name. The default is `ol-scale-bar` when configured with
      * `bar: true`. Otherwise the default is `ol-scale-line`.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * dpi of output device such as printer. Only applies
      * when `bar` is `true`. If undefined the OGC default screen pixel size of 0.28mm will be assumed.
      */
    var dpi: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum width in pixels at the OGC default dpi. The width will be
      * adjusted to match the dpi used.
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum width in pixels at the OGC default dpi. The width will be
      * adjusted to match the dpi used.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Function called when the control
      * should be re-rendered. This is called in a `requestAnimationFrame` callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Number of steps the scalebar should use. Use even numbers
      * for best results. Only applies when `bar` is `true`.
      */
    var steps: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify a target if you want the control
      * to be rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Render the text scale above of the scalebar. Only applies
      * when `bar` is `true`.
      */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Units.
      */
    var units: js.UndefOr[Units] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBar(value: Boolean): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnits(value: Units): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:units', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |'change:units', Return>} ScaleLineOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className] CSS class name. The default is `ol-scale-bar` when configured with
    * `bar: true`. Otherwise the default is `ol-scale-line`.
    * @property {number} [minWidth=64] Minimum width in pixels at the OGC default dpi. The width will be
    * adjusted to match the dpi used.
    * @property {number} [maxWidth] Maximum width in pixels at the OGC default dpi. The width will be
    * adjusted to match the dpi used.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {Units} [units='metric'] Units.
    * @property {boolean} [bar=false] Render scalebars instead of a line.
    * @property {number} [steps=4] Number of steps the scalebar should use. Use even numbers
    * for best results. Only applies when `bar` is `true`.
    * @property {boolean} [text=false] Render the text scale above of the scalebar. Only applies
    * when `bar` is `true`.
    * @property {number|undefined} [dpi=undefined] dpi of output device such as printer. Only applies
    * when `bar` is `true`. If undefined the OGC default screen pixel size of 0.28mm will be assumed.
    */
  /**
    * @classdesc
    * A control displaying rough y-axis distances, calculated for the center of the
    * viewport. For conformal projections (e.g. EPSG:3857, the default view
    * projection in OpenLayers), the scale is valid for all directions.
    * No scale line will be shown when the y-axis distance of a pixel at the
    * viewport center cannot be calculated in the view projection.
    * By default the scale line will show in the bottom left portion of the map,
    * but this can be changed by using the css selector `.ol-scale-line`.
    * When specifying `bar` as `true`, a scalebar will be rendered instead
    * of a scaleline.
    *
    * @api
    */
  @js.native
  trait ScaleLine
    extends typings.ol.controlControlMod.default {
    
    /**
      * Creates a marker at given position
      * @param {'absolute'|'relative'} position The position, absolute or relative
      * @return {string} The stringified div containing the marker
      */
    def createMarker(position: absolute | relative): String = js.native
    
    /**
      * @private
      * @param {number} width The current width of the scalebar.
      * @param {number} scale The current scale.
      * @param {string} suffix The suffix to append to the scale text.
      * @return {string} The stringified HTML of the scalebar.
      */
    /* private */ var createScaleBar: Any = js.native
    
    /**
      * Creates the label for a marker marker at given position
      * @param {number} i The iterator
      * @param {number} width The width the scalebar will currently use
      * @param {boolean} isLast Flag indicating if we add the last step text
      * @param {number} scale The current scale for the whole scalebar
      * @param {string} suffix The suffix for the scale
      * @return {string} The stringified div containing the step text
      */
    def createStepText(i: Double, width: Double, isLast: Boolean, scale: Double, suffix: String): String = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var dpi_ : Any = js.native
    
    /**
      * Returns the appropriate scale for the given resolution and units.
      * @return {number} The appropriate scale.
      */
    def getScaleForResolution(): Double = js.native
    
    /**
      * Return the units to use in the scale line.
      * @return {Units} The units
      * to use in the scale line.
      * @observable
      * @api
      */
    def getUnits(): Units = js.native
    
    /**
      * @private
      */
    /* private */ var handleUnitsChanged_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var innerElement_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var maxWidth_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var minWidth_ : Any = js.native
    
    /***
      * @type {ScaleLineOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_ScaleLine: ScaleLineOnSignature[EventsKey] = js.native
    
    /***
      * @type {ScaleLineOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_ScaleLine: ScaleLineOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var renderedHTML_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderedVisible_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var renderedWidth_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var scaleBarSteps_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var scaleBarText_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var scaleBar_ : Any = js.native
    
    /**
      * Specify the dpi of output device such as printer.
      * @param {number|undefined} dpi The dpi of output device.
      * @api
      */
    def setDpi(): Unit = js.native
    def setDpi(dpi: Double): Unit = js.native
    
    /**
      * Set the units to use in the scale line.
      * @param {Units} units The units to use in the scale line.
      * @observable
      * @api
      */
    def setUnits(units: Units): Unit = js.native
    
    /***
      * @type {ScaleLineOnSignature<void>}
      */
    @JSName("un")
    var un_ScaleLine: ScaleLineOnSignature[Unit] = js.native
    
    /**
      * @private
      */
    /* private */ var updateElement_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../View.js").State}
      */
    /* private */ var viewState_ : Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ScaleLineOnSignature[Return]
    extends OnSignature[
          changeColonunits | EventTypes | Types, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.degrees
    - typings.ol.olStrings.imperial
    - typings.ol.olStrings.nautical
    - typings.ol.olStrings.metric
    - typings.ol.olStrings.us
  */
  trait Units extends StObject
  object Units {
    
    inline def degrees: typings.ol.olStrings.degrees = "degrees".asInstanceOf[typings.ol.olStrings.degrees]
    
    inline def imperial: typings.ol.olStrings.imperial = "imperial".asInstanceOf[typings.ol.olStrings.imperial]
    
    inline def metric: typings.ol.olStrings.metric = "metric".asInstanceOf[typings.ol.olStrings.metric]
    
    inline def nautical: typings.ol.olStrings.nautical = "nautical".asInstanceOf[typings.ol.olStrings.nautical]
    
    inline def us: typings.ol.olStrings.us = "us".asInstanceOf[typings.ol.olStrings.us]
  }
}
