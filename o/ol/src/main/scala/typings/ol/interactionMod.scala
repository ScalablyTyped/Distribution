package typings.ol

import typings.ol.interactionDefaultsMod.DefaultsOptions
import typings.ol.interactionDoubleClickZoomMod.Options
import typings.ol.interactionDoubleClickZoomMod.default
import typings.ol.interactionInteractionMod.InteractionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("ol/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] Animation duration in milliseconds.
    * @property {number} [delta=1] The zoom delta applied on each double click.
    */
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    * @api
    */
  @JSImport("ol/interaction", "DoubleClickZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DoubleClickZoom () extends default {
    def this(options: Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'addfeatures', DragAndDropEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'addfeatures', Return>} DragAndDropOnSignature
    */
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @api
    *
    * @fires DragAndDropEvent
    */
  @JSImport("ol/interaction", "DragAndDrop")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragAndDrop ()
    extends typings.ol.interactionDragAndDropMod.default {
    def this(options: typings.ol.interactionDragAndDropMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'boxcancel'|'boxdrag'|'boxend'|'boxstart', DragBoxEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'boxcancel'|'boxdrag'|'boxend', Return>} DragBoxOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link module:ol/interaction/DragZoom~DragZoom} and
    * {@link module:ol/interaction/DragRotateAndZoom~DragRotateAndZoom}).
    *
    * @fires DragBoxEvent
    * @api
    */
  @JSImport("ol/interaction", "DragBox")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragBox ()
    extends typings.ol.interactionDragBoxMod.default {
    def this(options: typings.ol.interactionDragBoxMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.noModifierKeys} and {@link module:ol/events/condition.primaryAction}.
    * @property {boolean} [onFocusOnly=false] When the map's target has a `tabindex` attribute set,
    * the interaction will only handle events when the map has the focus.
    * @property {import("../Kinetic.js").default} [kinetic] Kinetic inertia to apply to the pan.
    */
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    * @api
    */
  @JSImport("ol/interaction", "DragPan")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragPan ()
    extends typings.ol.interactionDragPanMod.default {
    def this(options: typings.ol.interactionDragPanMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that takes an
    * {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a boolean
    * to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.altShiftKeysOnly}.
    * @property {number} [duration=250] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    * @api
    */
  @JSImport("ol/interaction", "DragRotate")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragRotate ()
    extends typings.ol.interactionDragRotateMod.default {
    def this(options: typings.ol.interactionDragRotateMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    * @api
    */
  @JSImport("ol/interaction", "DragRotateAndZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragRotateAndZoom ()
    extends typings.ol.interactionDragRotateAndZoomMod.default {
    def this(options: typings.ol.interactionDragRotateAndZoomMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-dragzoom'] CSS class name for styling the
    * box.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled.
    * Default is {@link module:ol/events/condition.shiftKeyOnly}.
    * @property {number} [duration=200] Animation duration in milliseconds.
    * @property {boolean} [out=false] Use interaction for zooming out.
    * @property {number} [minArea=64] The minimum area of the box in pixel, this value is used by the parent default
    * `boxEndCondition` function.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link module:ol/events/condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    * @api
    */
  @JSImport("ol/interaction", "DragZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class DragZoom ()
    extends typings.ol.interactionDragZoomMod.default {
    def this(options: typings.ol.interactionDragZoomMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'drawabort'|'drawend'|'drawstart', DrawEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'drawabort'|'drawend'|'drawstart', Return>} DrawOnSignature
    */
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires DrawEvent
    * @api
    */
  @JSImport("ol/interaction", "Draw")
  @js.native
  open class Draw protected ()
    extends typings.ol.interactionDrawMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.interactionDrawMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'extentchanged', ExtentEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'extentchanged', Return>} ExtentOnSignature
    */
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ExtentEvent
    * @api
    */
  @JSImport("ol/interaction", "Extent")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Extent ()
    extends typings.ol.interactionExtentMod.default {
    def this(options: typings.ol.interactionExtentMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active', Return>} InteractionOnSignature
    */
  /**
    * Object literal with config options for interactions.
    * @typedef {Object} InteractionOptions
    * @property {function(import("../MapBrowserEvent.js").default):boolean} handleEvent
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. If the function returns a falsy value, propagation of
    * the event to other interactions in the map's interactions chain will be
    * prevented (this includes functions with no explicit return). The interactions
    * are traversed in reverse order of the interactions collection of the map.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link module:ol/interaction/KeyboardZoom~KeyboardZoom} is
    * functionally the same as {@link module:ol/control/Zoom~Zoom}, but triggered
    * by a keyboard event not a button element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    * @api
    */
  @JSImport("ol/interaction", "Interaction")
  @js.native
  /**
    * @param {InteractionOptions} [options] Options.
    */
  open class Interaction ()
    extends typings.ol.interactionInteractionMod.default {
    def this(options: InteractionOptions) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.noModifierKeys} and
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {number} [pixelDelta=128] The amount of pixels to pan on each key
    * press.
    */
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardZoom~KeyboardZoom}.
    * @api
    */
  @JSImport("ol/interaction", "KeyboardPan")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class KeyboardPan ()
    extends typings.ol.interactionKeyboardPanMod.default {
    def this(options: typings.ol.interactionKeyboardPanMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=100] Animation duration in milliseconds.
    * @property {import("../events/condition.js").Condition} [condition] A function that
    * takes an {@link module:ol/MapBrowserEvent~MapBrowserEvent} and returns a
    * boolean to indicate whether that event should be handled. Default is
    * {@link module:ol/events/condition.targetNotEditable}.
    * @property {number} [delta=1] The zoom level delta on each key press.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link module:ol/Map~Map}. `document` never loses focus but, for any other
    * element, focus will have to be on, and returned to, this element if the keys
    * are to function.
    * See also {@link module:ol/interaction/KeyboardPan~KeyboardPan}.
    * @api
    */
  @JSImport("ol/interaction", "KeyboardZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class KeyboardZoom ()
    extends typings.ol.interactionKeyboardZoomMod.default {
    def this(options: typings.ol.interactionKeyboardZoomMod.Options) = this()
  }
  
  /** @typedef {'x'|'y'|'z'|'r'|'l'} Params */
  /**
    * @typedef {Object} Options
    * @property {boolean|import('../View.js').AnimationOptions} [animate=true] Animate view transitions.
    * @property {Array<Params>} [params=['x', 'y', 'z', 'r', 'l']] Properties to track. Default is to track
    * `x` (center x), `y` (center y), `z` (zoom), `r` (rotation) and `l` (layers).
    * @property {boolean} [replace=false] Replace the current URL without creating the new entry in browser history.
    * By default, changes in the map state result in a new entry being added to the browser history.
    * @property {string} [prefix=''] By default, the URL will be updated with search parameters x, y, z, and r.  To
    * avoid collisions with existing search parameters that your application uses, you can supply a custom prefix for
    * the ones used by this interaction (e.g. 'ol:').
    */
  /**
    * @classdesc
    * An interaction that synchronizes the map state with the URL.
    *
    * @api
    */
  @JSImport("ol/interaction", "Link")
  @js.native
  /**
    * @param {Options} [options] Link options.
    */
  open class Link ()
    extends typings.ol.interactionLinkMod.default {
    def this(options: typings.ol.interactionLinkMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'modifyend'|'modifystart', ModifyEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'modifyend'|'modifystart', Return>} ModifyOnSignature
    */
  /**
    * @classdesc
    * Interaction for modifying feature geometries.  To modify features that have
    * been added to an existing source, construct the modify interaction with the
    * `source` option.  If you want to modify features in a collection (for example,
    * the collection used by a select interaction), construct the interaction with
    * the `features` option.  The interaction must be constructed with either a
    * `source` or `features` option.
    *
    * Cartesian distance from the pointer is used to determine the features that
    * will be modified. This means that geometries will only be considered for
    * modification when they are within the configured `pixelTolerance`. For point
    * geometries, the `hitDetection` option can be used to match their visual
    * appearance.
    *
    * By default, the interaction will allow deletion of vertices when the `alt`
    * key is pressed.  To configure the interaction with a different condition
    * for deletion, use the `deleteCondition` option.
    * @fires ModifyEvent
    * @api
    */
  @JSImport("ol/interaction", "Modify")
  @js.native
  open class Modify protected ()
    extends typings.ol.interactionModifyMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.interactionModifyMod.Options) = this()
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
  @JSImport("ol/interaction", "MouseWheelZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class MouseWheelZoom ()
    extends typings.ol.interactionMouseWheelZoomMod.default {
    def this(options: typings.ol.interactionMouseWheelZoomMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=250] The duration of the animation in
    * milliseconds.
    * @property {number} [threshold=0.3] Minimal angle in radians to start a rotation.
    */
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    * @api
    */
  @JSImport("ol/interaction", "PinchRotate")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class PinchRotate ()
    extends typings.ol.interactionPinchRotateMod.default {
    def this(options: typings.ol.interactionPinchRotateMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [duration=400] Animation duration in milliseconds.
    */
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    * @api
    */
  @JSImport("ol/interaction", "PinchZoom")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class PinchZoom ()
    extends typings.ol.interactionPinchZoomMod.default {
    def this(options: typings.ol.interactionPinchZoomMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleDownEvent]
    * Function handling "down" events. If the function returns `true` then a drag
    * sequence is started.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleDragEvent]
    * Function handling "drag" events. This function is called on "move" events
    * during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleEvent]
    * Method called by the map to notify the interaction that a browser event was
    * dispatched to the map. The function may return `false` to prevent the
    * propagation of the event to other interactions in the map's interactions
    * chain.
    * @property {function(import("../MapBrowserEvent.js").default):void} [handleMoveEvent]
    * Function handling "move" events. This function is called on "move" events.
    * This functions is also called during a drag sequence, so during a drag
    * sequence both the `handleDragEvent` function and this function are called.
    * If `handleDownEvent` is defined and it returns true this function will not
    * be called during a drag sequence.
    * @property {function(import("../MapBrowserEvent.js").default):boolean} [handleUpEvent]
    *  Function handling "up" events. If the function returns `false` then the
    * current drag sequence is stopped.
    * @property {function(boolean):boolean} [stopDown]
    * Should the down event be propagated to other interactions, or should be
    * stopped?
    */
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    * @api
    */
  @JSImport("ol/interaction", "Pointer")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Pointer ()
    extends typings.ol.interactionPointerMod.default {
    def this(options: typings.ol.interactionPointerMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'select', SelectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'select', Return>} SelectOnSignature
    */
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * @fires SelectEvent
    * @api
    */
  @JSImport("ol/interaction", "Select")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Select ()
    extends typings.ol.interactionSelectMod.default {
    def this(options: typings.ol.interactionSelectMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link module:ol/source/Vector~VectorSource} or {@link module:ol/Collection~Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     import Snap from 'ol/interaction/Snap.js';
    *
    *     const snap = new Snap({
    *       source: source
    *     });
    *
    *     map.addInteraction(snap);
    *
    * @api
    */
  @JSImport("ol/interaction", "Snap")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Snap ()
    extends typings.ol.interactionSnapMod.default {
    def this(options: typings.ol.interactionSnapMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:active', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<'translateend'|'translatestart'|'translating', TranslateEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:active'|'translateend'|'translatestart'|'translating', Return>} TranslateOnSignature
    */
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    * If you want to translate multiple features in a single action (for example,
    * the collection used by a select interaction), construct the interaction with
    * the `features` option.
    *
    * @fires TranslateEvent
    * @api
    */
  @JSImport("ol/interaction", "Translate")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Translate ()
    extends typings.ol.interactionTranslateMod.default {
    def this(options: typings.ol.interactionTranslateMod.Options) = this()
  }
  
  inline def defaults(): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]]
  inline def defaults(options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]]
}
