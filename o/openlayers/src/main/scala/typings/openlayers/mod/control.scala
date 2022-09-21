package typings.openlayers.mod

import typings.openlayers.mod.control.ScaleLine.Units
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
import typings.openlayers.mod.proj.Projection
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSImport("openlayers", "control")
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
  @JSImport("openlayers", "control.Attribution")
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
  open class Attribution () extends Control {
    def this(opt_options: AttributionOptions) = this()
    
    /**
      * Return `true` when the attribution is currently collapsed or `false`
      * otherwise.
      * @return True if the widget is collapsed.
      * @api stable
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return `true` if the attribution is collapsible, `false` otherwise.
      * @return True if the widget is collapsible.
      * @api stable
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * Collapse or expand the attribution according to the passed parameter. Will
      * not do anything if the attribution isn't collapsible or if the current
      * collapsed state is already the one requested.
      * @param collapsed True if the widget is collapsed.
      * @api stable
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the attribution should be collapsible.
      * @param collapsible True if the widget is collapsible.
      * @api stable
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
  }
  object Attribution {
    
    @JSImport("openlayers", "control.Attribution")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the attribution element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  @JSImport("openlayers", "control.Control")
  @js.native
  open class Control protected () extends Object {
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
    
    /**
      * Get the map associated with this control.
      * @return Map.
      * @api stable
      */
    def getMap(): Map = js.native
    
    /**
      * Remove the control from its current map and attach it to the new map.
      * Subclasses may set up event handlers to get notified about changes to
      * the map here.
      * @param map Map.
      * @api stable
      */
    def setMap(map: Map): Unit = js.native
    
    def setTarget(target: String): Unit = js.native
    /**
      * This function is used to set a target element for the control. It has no
      * effect if it is called after the control has been added to the map (i.e.
      * after `setMap` is called on the control). If no `target` is set in the
      * options passed to the control constructor and if `setTarget` is not called
      * then the control is added to the map's overlay container.
      * @param target Target.
      * @api
      */
    def setTarget(target: Element): Unit = js.native
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
  @JSImport("openlayers", "control.FullScreen")
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
  open class FullScreen () extends Control {
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
  @JSImport("openlayers", "control.MousePosition")
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
  open class MousePosition () extends Control {
    def this(opt_options: MousePositionOptions) = this()
    
    /**
      * Return the coordinate format type used to render the current position or
      * undefined.
      * @return The format to render the current
      *     position in.
      * @observable
      * @api stable
      */
    def getCoordinateFormat(): CoordinateFormatType = js.native
    
    /**
      * Return the projection that is used to report the mouse position.
      * @return The projection to report mouse
      *     position in.
      * @observable
      * @api stable
      */
    def getProjection(): Projection = js.native
    
    /**
      * Set the coordinate format type used to render the current position.
      * @param format The format to render the current
      *     position in.
      * @observable
      * @api stable
      */
    def setCoordinateFormat(format: CoordinateFormatType): Unit = js.native
    
    /**
      * Set the projection that is used to report the mouse position.
      * @param projection The projection to report mouse
      *     position in.
      * @observable
      * @api stable
      */
    def setProjection(projection: Projection): Unit = js.native
  }
  object MousePosition {
    
    @JSImport("openlayers", "control.MousePosition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the mouseposition element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  @JSImport("openlayers", "control.OverviewMap")
  @js.native
  /**
    * Create a new control with a map acting as an overview map for an other
    * defined map.
    * @param opt_options OverviewMap options.
    * @api
    */
  open class OverviewMap () extends Control {
    def this(opt_options: OverviewMapOptions) = this()
    
    /**
      * Determine if the overview map is collapsed.
      * @return The overview map is collapsed.
      * @api stable
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Return `true` if the overview map is collapsible, `false` otherwise.
      * @return True if the widget is collapsible.
      * @api stable
      */
    def getCollapsible(): Boolean = js.native
    
    /**
      * Return the overview map.
      * @return Overview map.
      * @api
      */
    def getOverviewMap(): Map = js.native
    
    /**
      * Collapse or expand the overview map according to the passed parameter. Will
      * not do anything if the overview map isn't collapsible or if the current
      * collapsed state is already the one requested.
      * @param collapsed True if the widget is collapsed.
      * @api stable
      */
    def setCollapsed(collapsed: Boolean): Unit = js.native
    
    /**
      * Set whether the overview map should be collapsible.
      * @param collapsible True if the widget is collapsible.
      * @api stable
      */
    def setCollapsible(collapsible: Boolean): Unit = js.native
  }
  object OverviewMap {
    
    @JSImport("openlayers", "control.OverviewMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the overview map element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  @JSImport("openlayers", "control.Rotate")
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
  open class Rotate () extends Control {
    def this(opt_options: RotateOptions) = this()
  }
  object Rotate {
    
    @JSImport("openlayers", "control.Rotate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the rotate control element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
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
  @JSImport("openlayers", "control.ScaleLine")
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
  open class ScaleLine () extends Control {
    def this(opt_options: ScaleLineOptions) = this()
    
    /**
      * Return the units to use in the scale line.
      * @return The units to use in the scale
      *     line.
      * @observable
      * @api stable
      */
    def getUnits(): Units = js.native
    
    /**
      * Set the units to use in the scale line.
      * @param units The units to use in the scale line.
      * @observable
      * @api stable
      */
    def setUnits(units: Units): Unit = js.native
  }
  object ScaleLine {
    
    @JSImport("openlayers", "control.ScaleLine")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the scale line element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @api
      */
    type Property = String
    
    /**
      * Units for the scale line. Supported values are `'degrees'`, `'imperial'`,
      * `'nautical'`, `'metric'`, `'us'`.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.openlayers.openlayersStrings.degrees
      - typings.openlayers.openlayersStrings.imperial
      - typings.openlayers.openlayersStrings.nautical
      - typings.openlayers.openlayersStrings.metric
      - typings.openlayers.openlayersStrings.us
    */
    trait Units extends StObject
    object Units {
      
      inline def degrees: typings.openlayers.openlayersStrings.degrees = "degrees".asInstanceOf[typings.openlayers.openlayersStrings.degrees]
      
      inline def imperial: typings.openlayers.openlayersStrings.imperial = "imperial".asInstanceOf[typings.openlayers.openlayersStrings.imperial]
      
      inline def metric: typings.openlayers.openlayersStrings.metric = "metric".asInstanceOf[typings.openlayers.openlayersStrings.metric]
      
      inline def nautical: typings.openlayers.openlayersStrings.nautical = "nautical".asInstanceOf[typings.openlayers.openlayersStrings.nautical]
      
      inline def us: typings.openlayers.openlayersStrings.us = "us".asInstanceOf[typings.openlayers.openlayersStrings.us]
    }
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
  @JSImport("openlayers", "control.Zoom")
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
  open class Zoom () extends Control {
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
  @JSImport("openlayers", "control.ZoomSlider")
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
  open class ZoomSlider () extends Control {
    def this(opt_options: ZoomSliderOptions) = this()
  }
  object ZoomSlider {
    
    @JSImport("openlayers", "control.ZoomSlider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Update the zoomslider element.
      * @param mapEvent Map event.
      * @api
      */
    /* static member */
    inline def render(mapEvent: MapEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(mapEvent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "control.ZoomToExtent")
  @js.native
  /**
    * @classdesc
    * A button control which, when pressed, changes the map view to a specific
    * extent. To style this control use the css selector `.ol-zoom-extent`.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class ZoomToExtent () extends Control {
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
  inline def defaults(): Collection[Control] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Collection[Control]]
  inline def defaults(opt_options: DefaultsOptions): Collection[Control] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Collection[Control]]
}
