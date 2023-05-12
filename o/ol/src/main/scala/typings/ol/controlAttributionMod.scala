package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlAttributionMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-attribution'] CSS class name.
    * @property {HTMLElement|string} [target] Specify a target if you
    * want the control to be rendered outside of the map's
    * viewport.
    * @property {boolean} [collapsible] Specify if attributions can
    * be collapsed. If not specified, sources control this behavior with their
    * `attributionsCollapsible` setting.
    * @property {boolean} [collapsed=true] Specify if attributions should
    * be collapsed at startup.
    * @property {string} [tipLabel='Attributions'] Text label to use for the button tip.
    * @property {string|HTMLElement} [label='i'] Text label to use for the
    * collapsed attributions button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [expandClassName=className + '-expand'] CSS class name for the
    * collapsed attributions button.
    * @property {string|HTMLElement} [collapseLabel='›'] Text label to use
    * for the expanded attributions button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [collapseClassName=className + '-collapse'] CSS class name for the
    * expanded attributions button.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when
    * the control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    */
  /**
    * @classdesc
    * Control to show all the attributions associated with the layer sources
    * in the map. This control is one of the default controls included in maps.
    * By default it will show in the bottom right portion of the map, but this can
    * be changed by using a css selector for `.ol-attribution`.
    *
    * @api
    */
  @JSImport("ol/control/Attribution", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Attribution options.
    */
  open class default () extends Attribution {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-attribution'] CSS class name.
    * @property {HTMLElement|string} [target] Specify a target if you
    * want the control to be rendered outside of the map's
    * viewport.
    * @property {boolean} [collapsible] Specify if attributions can
    * be collapsed. If not specified, sources control this behavior with their
    * `attributionsCollapsible` setting.
    * @property {boolean} [collapsed=true] Specify if attributions should
    * be collapsed at startup.
    * @property {string} [tipLabel='Attributions'] Text label to use for the button tip.
    * @property {string|HTMLElement} [label='i'] Text label to use for the
    * collapsed attributions button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [expandClassName=className + '-expand'] CSS class name for the
    * collapsed attributions button.
    * @property {string|HTMLElement} [collapseLabel='›'] Text label to use
    * for the expanded attributions button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [collapseClassName=className + '-collapse'] CSS class name for the
    * expanded attributions button.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when
    * the control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    */
  /**
    * @classdesc
    * Control to show all the attributions associated with the layer sources
    * in the map. This control is one of the default controls included in maps.
    * By default it will show in the bottom right portion of the map, but this can
    * be changed by using a css selector for `.ol-attribution`.
    *
    * @api
    */
  @js.native
  trait Attribution
    extends typings.ol.controlControlMod.default {
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var collapseLabel_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var collapsed_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var collapsible_ : Any = js.native
    
    /**
      * Collect a list of visible attributions and set the collapsible state.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @return {Array<string>} Attributions.
      * @private
      */
    /* private */ var collectSourceAttributions_ : Any = js.native
    
    /**
      * Return `true` when the attribution is currently collapsed or `false`
      * otherwise.
      * @return {boolean} True if the widget is collapsed.
      * @api
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return `true` if the attribution is collapsible, `false` otherwise.
      * @return {boolean} True if the widget is collapsible.
      * @api
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
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
      * @private
      * @type {boolean}
      */
    /* private */ var overrideCollapsible_ : Any = js.native
    
    /**
      * A list of currently rendered resolutions.
      * @type {Array<string>}
      * @private
      */
    /* private */ var renderedAttributions_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var renderedVisible_ : Any = js.native
    
    /**
      * Collapse or expand the attribution according to the passed parameter. Will
      * not do anything if the attribution isn't collapsible or if the current
      * collapsed state is already the one requested.
      * @param {boolean} collapsed True if the widget is collapsed.
      * @api
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the attribution should be collapsible.
      * @param {boolean} collapsible True if the widget is collapsible.
      * @api
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var toggleButton_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var ulElement_ : Any = js.native
    
    /**
      * @private
      * @param {?import("../Map.js").FrameState} frameState Frame state.
      */
    /* private */ var updateElement_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var userCollapsed_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name for the
      * expanded attributions button.
      */
    var collapseClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Text label to use
      * for the expanded attributions button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var collapseLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Specify if attributions should
      * be collapsed at startup.
      */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify if attributions can
      * be collapsed. If not specified, sources control this behavior with their
      * `attributionsCollapsible` setting.
      */
    var collapsible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name for the
      * collapsed attributions button.
      */
    var expandClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Text label to use for the
      * collapsed attributions button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var label: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Function called when
      * the control should be re-rendered. This is called in a `requestAnimationFrame`
      * callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Specify a target if you
      * want the control to be rendered outside of the map's
      * viewport.
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
      
      inline def setCollapseClassName(value: String): Self = StObject.set(x, "collapseClassName", value.asInstanceOf[js.Any])
      
      inline def setCollapseClassNameUndefined: Self = StObject.set(x, "collapseClassName", js.undefined)
      
      inline def setCollapseLabel(value: String | HTMLElement): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setExpandClassName(value: String): Self = StObject.set(x, "expandClassName", value.asInstanceOf[js.Any])
      
      inline def setExpandClassNameUndefined: Self = StObject.set(x, "expandClassName", js.undefined)
      
      inline def setLabel(value: String | HTMLElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
