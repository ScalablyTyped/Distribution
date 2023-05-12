package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlControlMod {
  
  /**
    * @typedef {Object} Options
    * @property {HTMLElement} [element] The element is the control's
    * container element. This only needs to be specified if you're developing
    * a custom control.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when
    * the control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    * @property {HTMLElement|string} [target] Specify a target if you want
    * the control to be rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A control is a visible widget with a DOM element in a fixed position on the
    * screen. They can involve user input (buttons), or be informational only;
    * the position is determined using CSS. By default these are placed in the
    * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
    * any outside DOM element.
    *
    * This is the base class for controls. You can use it for simple custom
    * controls by creating the element with listeners, creating an instance:
    * ```js
    * const myControl = new Control({element: myElement});
    * ```
    * and then adding this to the map.
    *
    * The main advantage of having this as a control rather than a simple separate
    * DOM element is that preventing propagation is handled for you. Controls
    * will also be objects in a {@link module:ol/Collection~Collection}, so you can use their methods.
    *
    * You can also extend this base for your own control class. See
    * examples/custom-controls for an example of how to do this.
    *
    * @api
    */
  @JSImport("ol/control/Control", JSImport.Default)
  @js.native
  open class default protected () extends Control {
    /**
      * @param {Options} options Control options.
      */
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {HTMLElement} [element] The element is the control's
    * container element. This only needs to be specified if you're developing
    * a custom control.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when
    * the control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    * @property {HTMLElement|string} [target] Specify a target if you want
    * the control to be rendered outside of the map's viewport.
    */
  /**
    * @classdesc
    * A control is a visible widget with a DOM element in a fixed position on the
    * screen. They can involve user input (buttons), or be informational only;
    * the position is determined using CSS. By default these are placed in the
    * container with CSS class name `ol-overlaycontainer-stopevent`, but can use
    * any outside DOM element.
    *
    * This is the base class for controls. You can use it for simple custom
    * controls by creating the element with listeners, creating an instance:
    * ```js
    * const myControl = new Control({element: myElement});
    * ```
    * and then adding this to the map.
    *
    * The main advantage of having this as a control rather than a simple separate
    * DOM element is that preventing propagation is handled for you. Controls
    * will also be objects in a {@link module:ol/Collection~Collection}, so you can use their methods.
    *
    * You can also extend this base for your own control class. See
    * examples/custom-controls for an example of how to do this.
    *
    * @api
    */
  @js.native
  trait Control
    extends typings.ol.objectMod.default {
    
    /**
      * @protected
      * @type {HTMLElement}
      */
    /* protected */ var element: HTMLElement = js.native
    
    /**
      * Get the map associated with this control.
      * @return {import("../Map.js").default|null} Map.
      * @api
      */
    def getMap(): typings.ol.rendererMapMod.default | Null = js.native
    
    /**
      * @protected
      * @type {!Array<import("../events.js").EventsKey>}
      */
    /* protected */ var listenerKeys: js.Array[EventsKey] = js.native
    
    /**
      * @private
      * @type {import("../Map.js").default|null}
      */
    /* private */ var map_ : Any = js.native
    
    /**
      * Renders the control.
      * @param {import("../MapEvent.js").default} mapEvent Map event.
      * @api
      */
    def render(mapEvent: typings.ol.mapEventMod.default): Unit = js.native
    
    /**
      * Remove the control from its current map and attach it to the new map.
      * Pass `null` to just remove the control from the current map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      * @param {import("../Map.js").default|null} map Map.
      * @api
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    def setTarget(target: String): Unit = js.native
    /**
      * This function is used to set a target element for the control. It has no
      * effect if it is called after the control has been added to the map (i.e.
      * after `setMap` is called on the control). If no `target` is set in the
      * options passed to the control constructor and if `setTarget` is not called
      * then the control is added to the map's overlay container.
      * @param {HTMLElement|string} target Target.
      * @api
      */
    def setTarget(target: HTMLElement): Unit = js.native
    
    /**
      * @private
      * @type {HTMLElement}
      */
    /* private */ var target_ : Any = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The element is the control's
      * container element. This only needs to be specified if you're developing
      * a custom control.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Function called when
      * the control should be re-rendered. This is called in a `requestAnimationFrame`
      * callback.
      */
    var render: js.UndefOr[js.Function1[/* arg0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
    
    /**
      * Specify a target if you want
      * the control to be rendered outside of the map's viewport.
      */
    var target: js.UndefOr[String | HTMLElement] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setRender(value: /* arg0 */ typings.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: String | HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
