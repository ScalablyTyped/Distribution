package typings.openlayers.global.ol

import typings.openlayers.mod.olx.control.AttributionOptions
import typings.openlayers.mod.olx.control.ControlOptions
import typings.openlayers.mod.olx.control.DefaultsOptions
import typings.openlayers.mod.olx.control.FullScreenOptions
import typings.openlayers.mod.olx.control.MousePositionOptions
import typings.openlayers.mod.olx.control.OverviewMapOptions
import typings.openlayers.mod.olx.control.RotateOptions
import typings.openlayers.mod.olx.control.ScaleLineOptions
import typings.openlayers.mod.olx.control.ZoomOptions
import typings.openlayers.mod.olx.control.ZoomSliderOptions
import typings.openlayers.mod.olx.control.ZoomToExtentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSGlobal("ol.control")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Control to show all the attributions associated with the layer sources
    * in the map. This control is one of the default controls included in maps.
    * By default it will show in the bottom right portion of the map, but this can
    * be changed by using a css selector for `.ol-attribution`.
    *
    * @param opt_options Attribution options.
    * @api stable
    */
  @JSGlobal("ol.control.Attribution")
  @js.native
  /**
    * @classdesc
    * Control to show all the attributions associated with the layer sources
    * in the map. This control is one of the default controls included in maps.
    * By default it will show in the bottom right portion of the map, but this can
    * be changed by using a css selector for `.ol-attribution`.
    *
    * @param opt_options Attribution options.
    * @api stable
    */
  open class Attribution ()
    extends typings.openlayers.mod.control.Attribution {
    def this(opt_options: AttributionOptions) = this()
  }
  object Attribution {
    
    @JSGlobal("ol.control.Attribution")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the attribution element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
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
    * var myControl = new ol.control.Control({element: myElement});
    * ```
    * and then adding this to the map.
    *
    * The main advantage of having this as a control rather than a simple separate
    * DOM element is that preventing propagation is handled for you. Controls
    * will also be `ol.Object`s in a `ol.Collection`, so you can use their
    * methods.
    *
    * You can also extend this base for your own control class. See
    * examples/custom-controls for an example of how to do this.
    *
    * @param options Control options.
    * @api stable
    */
  @JSGlobal("ol.control.Control")
  @js.native
  open class Control protected ()
    extends typings.openlayers.mod.control.Control {
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
      * var myControl = new ol.control.Control({element: myElement});
      * ```
      * and then adding this to the map.
      *
      * The main advantage of having this as a control rather than a simple separate
      * DOM element is that preventing propagation is handled for you. Controls
      * will also be `ol.Object`s in a `ol.Collection`, so you can use their
      * methods.
      *
      * You can also extend this base for your own control class. See
      * examples/custom-controls for an example of how to do this.
      *
      * @param options Control options.
      * @api stable
      */
    def this(options: ControlOptions) = this()
  }
  
  /**
    * @classdesc
    * Provides a button that when clicked fills up the full screen with the map.
    * The full screen source element is by default the element containing the map viewport unless
    * overriden by providing the `source` option. In which case, the dom
    * element introduced using this parameter will be displayed in full screen.
    *
    * When in full screen mode, a close button is shown to exit full screen mode.
    * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
    * toggle the map in full screen mode.
    *
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.control.FullScreen")
  @js.native
  /**
    * @classdesc
    * Provides a button that when clicked fills up the full screen with the map.
    * The full screen source element is by default the element containing the map viewport unless
    * overriden by providing the `source` option. In which case, the dom
    * element introduced using this parameter will be displayed in full screen.
    *
    * When in full screen mode, a close button is shown to exit full screen mode.
    * The [Fullscreen API](http://www.w3.org/TR/fullscreen/) is used to
    * toggle the map in full screen mode.
    *
    *
    * @param opt_options Options.
    * @api stable
    */
  open class FullScreen ()
    extends typings.openlayers.mod.control.FullScreen {
    def this(opt_options: FullScreenOptions) = this()
  }
  
  /**
    * @classdesc
    * A control to show the 2D coordinates of the mouse cursor. By default, these
    * are in the view projection, but can be in any supported projection.
    * By default the control is shown in the top right corner of the map, but this
    * can be changed by using the css selector `.ol-mouse-position`.
    *
    * @param opt_options Mouse position
    *     options.
    * @api stable
    */
  @JSGlobal("ol.control.MousePosition")
  @js.native
  /**
    * @classdesc
    * A control to show the 2D coordinates of the mouse cursor. By default, these
    * are in the view projection, but can be in any supported projection.
    * By default the control is shown in the top right corner of the map, but this
    * can be changed by using the css selector `.ol-mouse-position`.
    *
    * @param opt_options Mouse position
    *     options.
    * @api stable
    */
  open class MousePosition ()
    extends typings.openlayers.mod.control.MousePosition {
    def this(opt_options: MousePositionOptions) = this()
  }
  object MousePosition {
    
    @JSGlobal("ol.control.MousePosition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the mouseposition element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  @JSGlobal("ol.control.OverviewMap")
  @js.native
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  open class OverviewMap ()
    extends typings.openlayers.mod.control.OverviewMap {
    def this(opt_options: OverviewMapOptions) = this()
  }
  object OverviewMap {
    
    @JSGlobal("ol.control.OverviewMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the overview map element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @classdesc
    * A button control to reset rotation to 0.
    * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
    * selector is added to the button when the rotation is 0.
    *
    * @param opt_options Rotate options.
    * @api stable
    */
  @JSGlobal("ol.control.Rotate")
  @js.native
  /**
    * @classdesc
    * A button control to reset rotation to 0.
    * To style this control use css selector `.ol-rotate`. A `.ol-hidden` css
    * selector is added to the button when the rotation is 0.
    *
    * @param opt_options Rotate options.
    * @api stable
    */
  open class Rotate ()
    extends typings.openlayers.mod.control.Rotate {
    def this(opt_options: RotateOptions) = this()
  }
  object Rotate {
    
    @JSGlobal("ol.control.Rotate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the rotate control element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @classdesc
    * A control displaying rough y-axis distances, calculated for the center of the
    * viewport. For conformal projections (e.g. EPSG:3857, the default view
    * projection in OpenLayers), the scale is valid for all directions.
    * No scale line will be shown when the y-axis distance of a pixel at the
    * viewport center cannot be calculated in the view projection.
    * By default the scale line will show in the bottom left portion of the map,
    * but this can be changed by using the css selector `.ol-scale-line`.
    *
    * @param opt_options Scale line options.
    * @api stable
    */
  @JSGlobal("ol.control.ScaleLine")
  @js.native
  /**
    * @classdesc
    * A control displaying rough y-axis distances, calculated for the center of the
    * viewport. For conformal projections (e.g. EPSG:3857, the default view
    * projection in OpenLayers), the scale is valid for all directions.
    * No scale line will be shown when the y-axis distance of a pixel at the
    * viewport center cannot be calculated in the view projection.
    * By default the scale line will show in the bottom left portion of the map,
    * but this can be changed by using the css selector `.ol-scale-line`.
    *
    * @param opt_options Scale line options.
    * @api stable
    */
  open class ScaleLine ()
    extends typings.openlayers.mod.control.ScaleLine {
    def this(opt_options: ScaleLineOptions) = this()
  }
  object ScaleLine {
    
    @JSGlobal("ol.control.ScaleLine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the scale line element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @classdesc
    * A control with 2 buttons, one for zoom in and one for zoom out.
    * This control is one of the default controls of a map. To style this control
    * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
    *
    * @param opt_options Zoom options.
    * @api stable
    */
  @JSGlobal("ol.control.Zoom")
  @js.native
  /**
    * @classdesc
    * A control with 2 buttons, one for zoom in and one for zoom out.
    * This control is one of the default controls of a map. To style this control
    * use css selectors `.ol-zoom-in` and `.ol-zoom-out`.
    *
    * @param opt_options Zoom options.
    * @api stable
    */
  open class Zoom ()
    extends typings.openlayers.mod.control.Zoom {
    def this(opt_options: ZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * A slider type of control for zooming.
    *
    * Example:
    *
    *     map.addControl(new ol.control.ZoomSlider());
    *
    * @param opt_options Zoom slider options.
    * @api stable
    */
  @JSGlobal("ol.control.ZoomSlider")
  @js.native
  /**
    * @classdesc
    * A slider type of control for zooming.
    *
    * Example:
    *
    *     map.addControl(new ol.control.ZoomSlider());
    *
    * @param opt_options Zoom slider options.
    * @api stable
    */
  open class ZoomSlider ()
    extends typings.openlayers.mod.control.ZoomSlider {
    def this(opt_options: ZoomSliderOptions) = this()
  }
  object ZoomSlider {
    
    @JSGlobal("ol.control.ZoomSlider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the zoomslider element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: typings.openlayers.mod.MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSGlobal("ol.control.ZoomToExtent")
  @js.native
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class ZoomToExtent ()
    extends typings.openlayers.mod.control.ZoomToExtent {
    def this(opt_options: ZoomToExtentOptions) = this()
  }
  
  /**
    * Set of controls included in maps by default. Unless configured otherwise,
    * this returns a collection containing an instance of each of the following
    * controls:
    * * {@link ol.control.Zoom}
    * * {@link ol.control.Rotate}
    * * {@link ol.control.Attribution}
    *
    * @param opt_options Defaults options.
    * @return Controls.
    * @api stable
    */
  inline def defaults(): typings.openlayers.mod.Collection[typings.openlayers.mod.control.Control] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.openlayers.mod.Collection[typings.openlayers.mod.control.Control]]
  inline def defaults(opt_options: DefaultsOptions): typings.openlayers.mod.Collection[typings.openlayers.mod.control.Control] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typings.openlayers.mod.Collection[typings.openlayers.mod.control.Control]]
}
