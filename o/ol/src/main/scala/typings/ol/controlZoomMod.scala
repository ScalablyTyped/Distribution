package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlZoomMod {
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {string} [className='ol-zoom'] CSS class name.
    * @property {string} [zoomInClassName=className + '-in'] CSS class name for the zoom-in button.
    * @property {string} [zoomOutClassName=className + '-out'] CSS class name for the zoom-out button.
    * @property {string|HTMLElement} [zoomInLabel='+'] Text label to use for the zoom-in
    * button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string|HTMLElement} [zoomOutLabel='–'] Text label to use for the zoom-out button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [zoomInTipLabel='Zoom in'] Text label to use for the button tip.
    * @property {string} [zoomOutTipLabel='Zoom out'] Text label to use for the button tip.
    * @property {number} [delta=1] The zoom delta applied on each click.
    * @property {HTMLElement|string} [target] Specify a target if you want the control to be
    * rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A control with 2 buttons, one for zoom in and one for zoom out.
    * This control is one of the default controls of a map. To style this control
    * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
    *
    * @api
    */
  @JSImport("ol/control/Zoom", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Zoom options.
    */
  open class default () extends Zoom {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The zoom delta applied on each click.
      */
    var delta: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation duration in milliseconds.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify a target if you want the control to be
      * rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * CSS class name for the zoom-in button.
      */
    var zoomInClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Text label to use for the zoom-in
      * button. Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var zoomInLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Text label to use for the button tip.
      */
    var zoomInTipLabel: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name for the zoom-out button.
      */
    var zoomOutClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Text label to use for the zoom-out button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var zoomOutLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Text label to use for the button tip.
      */
    var zoomOutTipLabel: js.UndefOr[String] = js.undefined
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
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setZoomInClassName(value: String): Self = StObject.set(x, "zoomInClassName", value.asInstanceOf[js.Any])
      
      inline def setZoomInClassNameUndefined: Self = StObject.set(x, "zoomInClassName", js.undefined)
      
      inline def setZoomInLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
      
      inline def setZoomInTipLabel(value: String): Self = StObject.set(x, "zoomInTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInTipLabelUndefined: Self = StObject.set(x, "zoomInTipLabel", js.undefined)
      
      inline def setZoomOutClassName(value: String): Self = StObject.set(x, "zoomOutClassName", value.asInstanceOf[js.Any])
      
      inline def setZoomOutClassNameUndefined: Self = StObject.set(x, "zoomOutClassName", js.undefined)
      
      inline def setZoomOutLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
      
      inline def setZoomOutTipLabel(value: String): Self = StObject.set(x, "zoomOutTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutTipLabelUndefined: Self = StObject.set(x, "zoomOutTipLabel", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {string} [className='ol-zoom'] CSS class name.
    * @property {string} [zoomInClassName=className + '-in'] CSS class name for the zoom-in button.
    * @property {string} [zoomOutClassName=className + '-out'] CSS class name for the zoom-out button.
    * @property {string|HTMLElement} [zoomInLabel='+'] Text label to use for the zoom-in
    * button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string|HTMLElement} [zoomOutLabel='–'] Text label to use for the zoom-out button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [zoomInTipLabel='Zoom in'] Text label to use for the button tip.
    * @property {string} [zoomOutTipLabel='Zoom out'] Text label to use for the button tip.
    * @property {number} [delta=1] The zoom delta applied on each click.
    * @property {HTMLElement|string} [target] Specify a target if you want the control to be
    * rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A control with 2 buttons, one for zoom in and one for zoom out.
    * This control is one of the default controls of a map. To style this control
    * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
    *
    * @api
    */
  @js.native
  trait Zoom
    extends typings.ol.controlControlMod.default {
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var duration_ : Any = js.native
    
    /**
      * @param {number} delta Zoom delta.
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
    /**
      * @param {number} delta Zoom delta.
      * @private
      */
    /* private */ var zoomByDelta_ : Any = js.native
  }
}
