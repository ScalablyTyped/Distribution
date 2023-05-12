package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlZoomSliderMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-zoomslider'] CSS class name.
    * @property {number} [duration=200] Animation duration in milliseconds.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    */
  /**
    * @classdesc
    * A slider type of control for zooming.
    *
    * Example:
    *
    *     map.addControl(new ZoomSlider());
    *
    * @api
    */
  @JSImport("ol/control/ZoomSlider", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Zoom slider options.
    */
  open class default () extends ZoomSlider {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Function called when the control
      * should be re-rendered. This is called in a `requestAnimationFrame` callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-zoomslider'] CSS class name.
    * @property {number} [duration=200] Animation duration in milliseconds.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    */
  /**
    * @classdesc
    * A slider type of control for zooming.
    *
    * Example:
    *
    *     map.addControl(new ZoomSlider());
    *
    * @api
    */
  @js.native
  trait ZoomSlider
    extends typings.ol.controlControlMod.default {
    
    /**
      * Will hold the current resolution of the view.
      *
      * @type {number|undefined}
      * @private
      */
    /* private */ var currentResolution_ : Any = js.native
    
    /**
      * The direction of the slider. Will be determined from actual display of the
      * container and defaults to Direction.VERTICAL.
      *
      * @type {Direction}
      * @private
      */
    /* private */ var direction_ : Any = js.native
    
    /**
      * @type {!Array<import("../events.js").EventsKey>}
      * @private
      */
    /* private */ var dragListenerKeys_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var dragging_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * Determines the relative position of the slider for the given resolution.  A
      * relative position of 0 corresponds to the minimum view resolution.  A
      * relative position of 1 corresponds to the maximum view resolution.
      *
      * @param {number} res The resolution.
      * @return {number} The relative position value (between 0 and 1).
      * @private
      */
    /* private */ var getPositionForResolution_ : Any = js.native
    
    /**
      * Calculates the relative position of the thumb given x and y offsets.  The
      * relative position scales from 0 to 1.  The x and y offsets are assumed to be
      * in pixel units within the dragger limits.
      *
      * @param {number} x Pixel position relative to the left of the slider.
      * @param {number} y Pixel position relative to the top of the slider.
      * @return {number} The relative position of the thumb.
      * @private
      */
    /* private */ var getRelativePosition_ : Any = js.native
    
    /**
      * Calculates the corresponding resolution of the thumb given its relative
      * position (where 0 is the minimum and 1 is the maximum).
      *
      * @param {number} position The relative position of the thumb.
      * @return {number} The corresponding resolution.
      * @private
      */
    /* private */ var getResolutionForPosition_ : Any = js.native
    
    /**
      * @param {PointerEvent} event The browser event to handle.
      * @private
      */
    /* private */ var handleContainerClick_ : Any = js.native
    
    /**
      * Handle dragger drag events.
      *
      * @param {PointerEvent} event The drag event.
      * @private
      */
    /* private */ var handleDraggerDrag_ : Any = js.native
    
    /**
      * Handle dragger end events.
      * @param {PointerEvent} event The drag event.
      * @private
      */
    /* private */ var handleDraggerEnd_ : Any = js.native
    
    /**
      * Handle dragger start events.
      * @param {PointerEvent} event The drag event.
      * @private
      */
    /* private */ var handleDraggerStart_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var heightLimit_ : Any = js.native
    
    /**
      * Initializes the slider element. This will determine and set this controls
      * direction_ and also constrain the dragging of the thumb to always be within
      * the bounds of the container.
      *
      * @return {boolean} Initialization successful
      * @private
      */
    /* private */ var initSlider_ : Any = js.native
    
    /**
      * Positions the thumb inside its container according to the given resolution.
      *
      * @param {number} res The res.
      * @private
      */
    /* private */ var setThumbPosition_ : Any = js.native
    
    /**
      * Whether the slider is initialized.
      * @type {boolean}
      * @private
      */
    /* private */ var sliderInitialized_ : Any = js.native
    
    /**
      * @type {number|undefined}
      * @private
      */
    /* private */ var startX_ : Any = js.native
    
    /**
      * @type {number|undefined}
      * @private
      */
    /* private */ var startY_ : Any = js.native
    
    /**
      * The calculated thumb size (border box plus margins).  Set when initSlider_
      * is called.
      * @type {import("../size.js").Size}
      * @private
      */
    /* private */ var thumbSize_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var widthLimit_ : Any = js.native
  }
}
