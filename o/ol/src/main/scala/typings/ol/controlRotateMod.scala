package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlRotateMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-rotate'] CSS class name.
    * @property {string|HTMLElement} [label='⇧'] Text label to use for the rotate button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [tipLabel='Reset rotation'] Text label to use for the rotate tip.
    * @property {string} [compassClassName='ol-compass'] CSS class name for the compass.
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {boolean} [autoHide=true] Hide the control when rotation is 0.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control should
    * be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {function():void} [resetNorth] Function called when the control is clicked.
    * This will override the default `resetNorth`.
    * @property {HTMLElement|string} [target] Specify a target if you want the control to be
    * rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A button control to reset rotation to 0.
    * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
    * selector is added to the button when the rotation is 0.
    *
    * @api
    */
  @JSImport("ol/control/Rotate", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Rotate options.
    */
  open class default () extends Rotate {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Hide the control when rotation is 0.
      */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name for the compass.
      */
    var compassClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Text label to use for the rotate button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Function called when the control should
      * be re-rendered. This is called in a `requestAnimationFrame` callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Function called when the control is clicked.
      * This will override the default `resetNorth`.
      */
    var resetNorth: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Specify a target if you want the control to be
      * rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Text label to use for the rotate tip.
      */
    var tipLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompassClassName(value: String): Self = StObject.set(x, "compassClassName", value.asInstanceOf[js.Any])
      
      inline def setCompassClassNameUndefined: Self = StObject.set(x, "compassClassName", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setResetNorth(value: () => Unit): Self = StObject.set(x, "resetNorth", js.Any.fromFunction0(value))
      
      inline def setResetNorthUndefined: Self = StObject.set(x, "resetNorth", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-rotate'] CSS class name.
    * @property {string|HTMLElement} [label='⇧'] Text label to use for the rotate button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [tipLabel='Reset rotation'] Text label to use for the rotate tip.
    * @property {string} [compassClassName='ol-compass'] CSS class name for the compass.
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {boolean} [autoHide=true] Hide the control when rotation is 0.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control should
    * be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {function():void} [resetNorth] Function called when the control is clicked.
    * This will override the default `resetNorth`.
    * @property {HTMLElement|string} [target] Specify a target if you want the control to be
    * rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A button control to reset rotation to 0.
    * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
    * selector is added to the button when the rotation is 0.
    *
    * @api
    */
  @js.native
  trait Rotate
    extends typings.ol.controlControlMod.default {
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var autoHide_ : Any = js.native
    
    var callResetNorth_ : js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
    /**
      * @type {HTMLElement}
      * @private
      */
    /* private */ var label_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var resetNorth_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var rotation_ : Any = js.native
  }
}
