package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlZoomToExtentMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-zoom-extent'] Class name.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {string|HTMLElement} [label='E'] Text label to use for the button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [tipLabel='Fit to extent'] Text label to use for the button tip.
    * @property {import("../extent.js").Extent} [extent] The extent to zoom to. If undefined the validity
    * extent of the view projection is used.
    */
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @api
    */
  @JSImport("ol/control/ZoomToExtent", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends ZoomToExtent {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The extent to zoom to. If undefined the validity
      * extent of the view projection is used.
      */
    var extent: js.UndefOr[Extent] = js.undefined
    
    /**
      * Text label to use for the button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Specify a target if you want the control
      * to be rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Text label to use for the button tip.
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
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-zoom-extent'] Class name.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {string|HTMLElement} [label='E'] Text label to use for the button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [tipLabel='Fit to extent'] Text label to use for the button tip.
    * @property {import("../extent.js").Extent} [extent] The extent to zoom to. If undefined the validity
    * extent of the view projection is used.
    */
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @api
    */
  @js.native
  trait ZoomToExtent
    extends typings.ol.controlControlMod.default {
    
    /**
      * @type {?import("../extent.js").Extent|null}
      * @protected
      */
    /* protected */ var extent: Extent | Null = js.native
    
    /**
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleZoomToExtent(): Unit = js.native
  }
}
