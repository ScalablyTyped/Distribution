package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.enterfullscreen
import typings.ol.olStrings.leavefullscreen
import typings.std.HTMLElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlFullScreenMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes|
    *     'enterfullscreen'|'leavefullscreen', import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|
    *     'enterfullscreen'|'leavefullscreen'|import("../ObjectEventType").Types, Return>} FullScreenOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-full-screen'] CSS class name.
    * @property {string|Text|HTMLElement} [label='\\u2922'] Text label to use for the button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string|Text|HTMLElement} [labelActive='\\u00d7'] Text label to use for the
    * button when full-screen is active.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [activeClassName=className + '-true'] CSS class name for the button
    * when full-screen is active.
    * @property {string} [inactiveClassName=className + '-false'] CSS class name for the button
    * when full-screen is inactive.
    * @property {string} [tipLabel='Toggle full-screen'] Text label to use for the button tip.
    * @property {boolean} [keys=false] Full keyboard access.
    * @property {HTMLElement|string} [target] Specify a target if you want the
    * control to be rendered outside of the map's viewport.
    * @property {HTMLElement|string} [source] The element to be displayed
    * fullscreen. When not provided, the element containing the map viewport will
    * be displayed fullscreen.
    */
  /**
    * @classdesc
    * Provides a button that when clicked fills up the full screen with the map.
    * The full screen source element is by default the element containing the map viewport unless
    * overridden by providing the `source` option. In which case, the dom
    * element introduced using this parameter will be displayed in full screen.
    *
    * When in full screen mode, a close button is shown to exit full screen mode.
    * The [Fullscreen API](https://www.w3.org/TR/fullscreen/) is used to
    * toggle the map in full screen mode.
    *
    * @fires FullScreenEventType#enterfullscreen
    * @fires FullScreenEventType#leavefullscreen
    * @api
    */
  @JSImport("ol/control/FullScreen", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends FullScreen {
    def this(options: Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes|
    *     'enterfullscreen'|'leavefullscreen', import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|
    *     'enterfullscreen'|'leavefullscreen'|import("../ObjectEventType").Types, Return>} FullScreenOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-full-screen'] CSS class name.
    * @property {string|Text|HTMLElement} [label='\\u2922'] Text label to use for the button.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string|Text|HTMLElement} [labelActive='\\u00d7'] Text label to use for the
    * button when full-screen is active.
    * Instead of text, also an element (e.g. a `span` element) can be used.
    * @property {string} [activeClassName=className + '-true'] CSS class name for the button
    * when full-screen is active.
    * @property {string} [inactiveClassName=className + '-false'] CSS class name for the button
    * when full-screen is inactive.
    * @property {string} [tipLabel='Toggle full-screen'] Text label to use for the button tip.
    * @property {boolean} [keys=false] Full keyboard access.
    * @property {HTMLElement|string} [target] Specify a target if you want the
    * control to be rendered outside of the map's viewport.
    * @property {HTMLElement|string} [source] The element to be displayed
    * fullscreen. When not provided, the element containing the map viewport will
    * be displayed fullscreen.
    */
  /**
    * @classdesc
    * Provides a button that when clicked fills up the full screen with the map.
    * The full screen source element is by default the element containing the map viewport unless
    * overridden by providing the `source` option. In which case, the dom
    * element introduced using this parameter will be displayed in full screen.
    *
    * When in full screen mode, a close button is shown to exit full screen mode.
    * The [Fullscreen API](https://www.w3.org/TR/fullscreen/) is used to
    * toggle the map in full screen mode.
    *
    * @fires FullScreenEventType#enterfullscreen
    * @fires FullScreenEventType#leavefullscreen
    * @api
    */
  @js.native
  trait FullScreen
    extends typings.ol.controlControlMod.default {
    
    /**
      * @private
      * @type {Array<string>}
      */
    /* private */ var activeClassName_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var boundHandleMapTargetChange_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var button_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var cssClassName_ : Any = js.native
    
    /**
      * @private
      * @type {Array<import("../events.js").EventsKey>}
      */
    /* private */ var documentListeners_ : Any = js.native
    
    /**
      * @param {MouseEvent} event The event to handle
      * @private
      */
    /* private */ var handleClick_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleFullScreenChange_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleFullScreen_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleMapTargetChange_ : Any = js.native
    
    /**
      * @private
      * @type {Array<string>}
      */
    /* private */ var inactiveClassName_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var isInFullscreen_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var keys_ : Any = js.native
    
    /**
      * @private
      * @type {Text|HTMLElement}
      */
    /* private */ var labelActiveNode_ : Any = js.native
    
    /**
      * @private
      * @type {Text|HTMLElement}
      */
    /* private */ var labelNode_ : Any = js.native
    
    /***
      * @type {FullScreenOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_FullScreen: FullScreenOnSignature[EventsKey] = js.native
    
    /***
      * @type {FullScreenOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_FullScreen: FullScreenOnSignature[EventsKey] = js.native
    
    /**
      * @param {HTMLElement} element Target element
      * @param {boolean} fullscreen True if fullscreen class name should be active
      * @private
      */
    /* private */ var setClassName_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLElement|string|undefined}
      */
    /* private */ var source_ : Any = js.native
    
    /***
      * @type {FullScreenOnSignature<void>}
      */
    @JSName("un")
    var un_FullScreen: FullScreenOnSignature[Unit] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait FullScreenOnSignature[Return]
    extends OnSignature[
          enterfullscreen | leavefullscreen | EventTypes | Types, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * CSS class name for the button
      * when full-screen is active.
      */
    var activeClassName: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name for the button
      * when full-screen is inactive.
      */
    var inactiveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Full keyboard access.
      */
    var keys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text label to use for the button.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var label: js.UndefOr[String | HTMLElement | Text] = js.undefined
    
    /**
      * Text label to use for the
      * button when full-screen is active.
      * Instead of text, also an element (e.g. a `span` element) can be used.
      */
    var labelActive: js.UndefOr[String | HTMLElement | Text] = js.undefined
    
    /**
      * The element to be displayed
      * fullscreen. When not provided, the element containing the map viewport will
      * be displayed fullscreen.
      */
    var source: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Specify a target if you want the
      * control to be rendered outside of the map's viewport.
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
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInactiveClassName(value: String): Self = StObject.set(x, "inactiveClassName", value.asInstanceOf[js.Any])
      
      inline def setInactiveClassNameUndefined: Self = StObject.set(x, "inactiveClassName", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLabel(value: String | HTMLElement | Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelActive(value: String | HTMLElement | Text): Self = StObject.set(x, "labelActive", value.asInstanceOf[js.Any])
      
      inline def setLabelActiveUndefined: Self = StObject.set(x, "labelActive", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSource(value: String | HTMLElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipLabel(value: String): Self = StObject.set(x, "tipLabel", value.asInstanceOf[js.Any])
      
      inline def setTipLabelUndefined: Self = StObject.set(x, "tipLabel", js.undefined)
    }
  }
}
