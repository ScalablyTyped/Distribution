package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlOverviewMapMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-overviewmap'] CSS class name.
    * @property {boolean} [collapsed=true] Whether the control should start collapsed or not (expanded).
    * @property {string|HTMLElement} [collapseLabel='‹'] Text label to use for the
    * expanded overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {boolean} [collapsible=true] Whether the control can be collapsed or not.
    * @property {string|HTMLElement} [label='›'] Text label to use for the collapsed
    * overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {Array<import("../layer/Base.js").default>|import("../Collection.js").default<import("../layer/Base.js").default>} [layers]
    * Layers for the overview map.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {boolean} [rotateWithView=false] Whether the control view should rotate with the main map view.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {string} [tipLabel='Overview map'] Text label to use for the button tip.
    * @property {View} [view] Custom view for the overview map (should use same projection as main map). If not provided,
    * a default view with the same projection as the main map will be used.
    */
  /**
    * Create a new control with a map acting as an overview map for another
    * defined map.
    *
    * @api
    */
  @JSImport("ol/control/OverviewMap", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] OverviewMap options.
    */
  open class default () extends OverviewMap {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Text label to use for the
      * expanded overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var collapseLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Whether the control should start collapsed or not (expanded).
      */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the control can be collapsed or not.
      */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text label to use for the collapsed
      * overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Layers for the overview map.
      */
    var layers: js.UndefOr[
        js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]
      ] = js.undefined
    
    /**
      * Function called when the control
      * should be re-rendered. This is called in a `requestAnimationFrame` callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Whether the control view should rotate with the main map view.
      */
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a target if you want the control
      * to be rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Text label to use for the button tip.
      */
    var tipLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom view for the overview map (should use same projection as main map). If not provided,
      * a default view with the same projection as the main map will be used.
      */
    var view: js.UndefOr[typings.ol.viewMod.default] = js.undefined
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
      
      inline def setCollapseLabel(value: String | HTMLElement): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayers(
        value: js.Array[typings.ol.layerBaseMod.default] | typings.ol.collectionMod.default[typings.ol.layerBaseMod.default]
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: typings.ol.layerBaseMod.default*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
      
      inline def setView(value: typings.ol.viewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-overviewmap'] CSS class name.
    * @property {boolean} [collapsed=true] Whether the control should start collapsed or not (expanded).
    * @property {string|HTMLElement} [collapseLabel='‹'] Text label to use for the
    * expanded overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {boolean} [collapsible=true] Whether the control can be collapsed or not.
    * @property {string|HTMLElement} [label='›'] Text label to use for the collapsed
    * overviewmap button. Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {Array<import("../layer/Base.js").default>|import("../Collection.js").default<import("../layer/Base.js").default>} [layers]
    * Layers for the overview map.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the control
    * should be re-rendered. This is called in a `requestAnimationFrame` callback.
    * @property {boolean} [rotateWithView=false] Whether the control view should rotate with the main map view.
    * @property {HTMLElement|string} [target] Specify a target if you want the control
    * to be rendered outside of the map's viewport.
    * @property {string} [tipLabel='Overview map'] Text label to use for the button tip.
    * @property {View} [view] Custom view for the overview map (should use same projection as main map). If not provided,
    * a default view with the same projection as the main map will be used.
    */
  /**
    * Create a new control with a map acting as an overview map for another
    * defined map.
    *
    * @api
    */
  @js.native
  trait OverviewMap
    extends typings.ol.controlControlMod.default {
    
    /**
      * Register listeners for view property changes.
      * @param {import("../View.js").default} view The view.
      * @private
      */
    /* private */ var bindView_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var boundHandleRotationChanged_ : Any = js.native
    
    /**
      * @type {import("../Overlay.js").default}
      * @private
      */
    /* private */ var boxOverlay_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var collapseLabel_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var collapsed_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var collapsible_ : Any = js.native
    
    /**
      * Determine if the overview map is collapsed.
      * @return {boolean} The overview map is collapsed.
      * @api
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return `true` if the overview map is collapsible, `false` otherwise.
      * @return {boolean} True if the widget is collapsible.
      * @api
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * Return the overview map.
      * @return {import("../Map.js").default} Overview map.
      * @api
      */
    def getOverviewMap(): typings.ol.rendererMapMod.default = js.native
    
    /**
      * Return `true` if the overview map view can rotate, `false` otherwise.
      * @return {boolean} True if the control view can rotate.
      * @api
      */
    def getRotateWithView(): Boolean = js.native
    
    /**
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
    /**
      * Handle map property changes.  This only deals with changes to the map's view.
      * @param {import("../Object.js").ObjectEvent} event The propertychange event.
      * @private
      */
    /* private */ var handleMapPropertyChange_ : Any = js.native
    
    /**
      * Handle rotation changes to the main map.
      * @private
      */
    /* private */ var handleRotationChanged_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleToggle_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var label_ : Any = js.native
    
    /**
      * @type {HTMLElement}
      * @private
      */
    /* private */ var ovmapDiv_ : Any = js.native
    
    var ovmapPostrenderKey_ : Any = js.native
    
    /**
      * @type {Map}
      * @private
      */
    /* private */ var ovmap_ : Any = js.native
    
    /**
      * Set the center of the overview map to the map center without changing its
      * resolution.
      * @private
      */
    /* private */ var recenter_ : Any = js.native
    
    /**
      * Reset the overview map extent to half calculated min and max ratio times
      * the extent of the main map.
      * @private
      */
    /* private */ var resetExtent_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var rotateWithView_ : Any = js.native
    
    /**
      * Collapse or expand the overview map according to the passed parameter. Will
      * not do anything if the overview map isn't collapsible or if the current
      * collapsed state is already the one requested.
      * @param {boolean} collapsed True if the widget is collapsed.
      * @api
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the overview map should be collapsible.
      * @param {boolean} collapsible True if the widget is collapsible.
      * @api
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
    
    /**
      * Set whether the overview map view should rotate with the main map view.
      * @param {boolean} rotateWithView True if the control view should rotate.
      * @api
      */
    def setRotateWithView(rotateWithView: Boolean): Unit = js.native
    
    /**
      * Unregister listeners for view property changes.
      * @param {import("../View.js").default} view The view.
      * @private
      */
    /* private */ var unbindView_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var updateBoxAfterOvmapIsRendered_ : Any = js.native
    
    /**
      * Update the box using the main map extent
      * @private
      */
    /* private */ var updateBox_ : Any = js.native
    
    /**
      * Reset the overview map extent if the box size (width or
      * height) is less than the size of the overview map size times minRatio
      * or is greater than the size of the overview size times maxRatio.
      *
      * If the map extent was not reset, the box size can fits in the defined
      * ratio sizes. This method then checks if is contained inside the overview
      * map current extent. If not, recenter the overview map to the current
      * main map center location.
      * @private
      */
    /* private */ var validateExtent_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent|undefined}
      */
    /* private */ var viewExtent_ : Any = js.native
    
    /**
      * Explicitly given view to be used instead of a view derived from the main map.
      * @type {View}
      * @private
      */
    /* private */ var view_ : Any = js.native
  }
}
