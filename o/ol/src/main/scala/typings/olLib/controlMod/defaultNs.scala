package typings
package olLib.controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/control", JSImport.Default)
@js.native
object defaultNs extends js.Object {
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
  class Attribution ()
    extends openlayersLib.openlayersMod.controlNs.Attribution {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.AttributionOptions) = this()
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
  @js.native
  class Control protected ()
    extends openlayersLib.openlayersMod.controlNs.Control {
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
    def this(options: openlayersLib.openlayersMod.olxNs.controlNs.ControlOptions) = this()
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
  class FullScreen ()
    extends openlayersLib.openlayersMod.controlNs.FullScreen {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.FullScreenOptions) = this()
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
  class MousePosition ()
    extends openlayersLib.openlayersMod.controlNs.MousePosition {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.MousePositionOptions) = this()
  }
  
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  @js.native
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  class OverviewMap ()
    extends openlayersLib.openlayersMod.controlNs.OverviewMap {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.OverviewMapOptions) = this()
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
  class Rotate ()
    extends openlayersLib.openlayersMod.controlNs.Rotate {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.RotateOptions) = this()
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
  class ScaleLine ()
    extends openlayersLib.openlayersMod.controlNs.ScaleLine {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ScaleLineOptions) = this()
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
  class Zoom ()
    extends openlayersLib.openlayersMod.controlNs.Zoom {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomOptions) = this()
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
  class ZoomSlider ()
    extends openlayersLib.openlayersMod.controlNs.ZoomSlider {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomSliderOptions) = this()
  }
  
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  class ZoomToExtent ()
    extends openlayersLib.openlayersMod.controlNs.ZoomToExtent {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ZoomToExtentOptions) = this()
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
  def defaults(): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] = js.native
  def defaults(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.DefaultsOptions): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.controlNs.Control] = js.native
  /* static members */
  @js.native
  object Attribution extends js.Object {
    /**
      * Update the attribution element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object MousePosition extends js.Object {
    /**
      * Update the mouseposition element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object OverviewMap extends js.Object {
    /**
      * Update the overview map element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object Rotate extends js.Object {
    /**
      * Update the rotate control element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object ScaleLine extends js.Object {
    /**
      * Update the scale line element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object ZoomSlider extends js.Object {
    /**
      * Update the zoomslider element.
      * @param mapEvent Map event.
      * @api
      */
    def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
  }
  
}

