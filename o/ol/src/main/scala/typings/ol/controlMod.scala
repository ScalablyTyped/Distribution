package typings.ol

import typings.ol.controlAttributionMod.Options
import typings.ol.controlAttributionMod.default
import typings.ol.controlDefaultsMod.DefaultsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("ol/control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("ol/control", "Attribution")
  @js.native
  /**
    * @param {Options} [options] Attribution options.
    */
  open class Attribution () extends default {
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
  @JSImport("ol/control", "Control")
  @js.native
  open class Control protected ()
    extends typings.ol.controlControlMod.default {
    /**
      * @param {Options} options Control options.
      */
    def this(options: typings.ol.controlControlMod.Options) = this()
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
  @JSImport("ol/control", "FullScreen")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class FullScreen ()
    extends typings.ol.controlFullScreenMod.default {
    def this(options: typings.ol.controlFullScreenMod.Options) = this()
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', import("../Object").ObjectEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     'change:coordinateFormat'|'change:projection', Return>} MousePositionOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {string} [className='ol-mouse-position'] CSS class name.
    * @property {import("../coordinate.js").CoordinateFormat} [coordinateFormat] Coordinate format.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection. Default is the view projection.
    * @property {function(import("../MapEvent.js").default):void} [render] Function called when the
    * control should be re-rendered. This is called in a `requestAnimationFrame`
    * callback.
    * @property {HTMLElement|string} [target] Specify a target if you want the
    * control to be rendered outside of the map's viewport.
    * @property {string} [placeholder] Markup to show when the mouse position is not
    * available (e.g. when the pointer leaves the map viewport).  By default, a non-breaking space is rendered
    * initially and the last position is retained when the mouse leaves the viewport.
    * When a string is provided (e.g. `'no position'` or `''` for an empty string) it is used as a
    * placeholder.
    * @property {boolean} [wrapX=true] Wrap the world horizontally on the projection's antimeridian, if it
    * is a global projection.
    */
  /**
    * @classdesc
    * A control to show the 2D coordinates of the mouse cursor. By default, these
    * are in the view projection, but can be in any supported projection.
    * By default the control is shown in the top right corner of the map, but this
    * can be changed by using the css selector `.ol-mouse-position`.
    *
    * On touch devices, which usually do not have a mouse cursor, the coordinates
    * of the currently touched position are shown.
    *
    * @api
    */
  @JSImport("ol/control", "MousePosition")
  @js.native
  /**
    * @param {Options} [options] Mouse position options.
    */
  open class MousePosition ()
    extends typings.ol.controlMousePositionMod.default {
    def this(options: typings.ol.controlMousePositionMod.Options) = this()
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
  @JSImport("ol/control", "OverviewMap")
  @js.native
  /**
    * @param {Options} [options] OverviewMap options.
    */
  open class OverviewMap ()
    extends typings.ol.controlOverviewMapMod.default {
    def this(options: typings.ol.controlOverviewMapMod.Options) = this()
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
  @JSImport("ol/control", "Rotate")
  @js.native
  /**
    * @param {Options} [options] Rotate options.
    */
  open class Rotate ()
    extends typings.ol.controlRotateMod.default {
    def this(options: typings.ol.controlRotateMod.Options) = this()
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
  @JSImport("ol/control", "ScaleLine")
  @js.native
  /**
    * @param {Options} [options] Scale line options.
    */
  open class ScaleLine ()
    extends typings.ol.controlScaleLineMod.default {
    def this(options: typings.ol.controlScaleLineMod.Options) = this()
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
  @JSImport("ol/control", "Zoom")
  @js.native
  /**
    * @param {Options} [options] Zoom options.
    */
  open class Zoom ()
    extends typings.ol.controlZoomMod.default {
    def this(options: typings.ol.controlZoomMod.Options) = this()
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
  @JSImport("ol/control", "ZoomSlider")
  @js.native
  /**
    * @param {Options} [options] Zoom slider options.
    */
  open class ZoomSlider ()
    extends typings.ol.controlZoomSliderMod.default {
    def this(options: typings.ol.controlZoomSliderMod.Options) = this()
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
  @JSImport("ol/control", "ZoomToExtent")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class ZoomToExtent ()
    extends typings.ol.controlZoomToExtentMod.default {
    def this(options: typings.ol.controlZoomToExtentMod.Options) = this()
  }
  
  inline def defaults(): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]]
  inline def defaults(options: DefaultsOptions): typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]]
}
