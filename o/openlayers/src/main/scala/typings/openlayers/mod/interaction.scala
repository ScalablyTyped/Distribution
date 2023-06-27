package typings.openlayers.mod

import typings.openlayers.mod.geom.Polygon
import typings.openlayers.mod.layer.Vector
import typings.openlayers.mod.olx.interaction.DefaultsOptions
import typings.openlayers.mod.olx.interaction.DoubleClickZoomOptions
import typings.openlayers.mod.olx.interaction.DragAndDropOptions
import typings.openlayers.mod.olx.interaction.DragBoxOptions
import typings.openlayers.mod.olx.interaction.DragPanOptions
import typings.openlayers.mod.olx.interaction.DragRotateAndZoomOptions
import typings.openlayers.mod.olx.interaction.DragRotateOptions
import typings.openlayers.mod.olx.interaction.DragZoomOptions
import typings.openlayers.mod.olx.interaction.DrawOptions
import typings.openlayers.mod.olx.interaction.ExtentOptions
import typings.openlayers.mod.olx.interaction.InteractionOptions
import typings.openlayers.mod.olx.interaction.KeyboardPanOptions
import typings.openlayers.mod.olx.interaction.KeyboardZoomOptions
import typings.openlayers.mod.olx.interaction.ModifyOptions
import typings.openlayers.mod.olx.interaction.MouseWheelZoomOptions
import typings.openlayers.mod.olx.interaction.PinchRotateOptions
import typings.openlayers.mod.olx.interaction.PinchZoomOptions
import typings.openlayers.mod.olx.interaction.PointerOptions
import typings.openlayers.mod.olx.interaction.SelectOptions
import typings.openlayers.mod.olx.interaction.SnapOptions
import typings.openlayers.mod.olx.interaction.TranslateOptions
import typings.openlayers.mod.proj.Projection
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interaction {
  
  @JSImport("openlayers", "interaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DoubleClickZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DoubleClickZoom () extends Interaction {
    def this(opt_options: DoubleClickZoomOptions) = this()
  }
  object DoubleClickZoom {
    
    @JSImport("openlayers", "interaction.DoubleClickZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * doubleclick) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragAndDrop")
  @js.native
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  open class DragAndDrop () extends Interaction {
    def this(opt_options: DragAndDropOptions) = this()
  }
  object DragAndDrop {
    
    @JSImport("openlayers", "interaction.DragAndDrop")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    @JSImport("openlayers", "interaction.DragAndDrop.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
        * of this type.
        *
        * @param type Type.
        * @param file File.
        * @param opt_features Features.
        * @param opt_projection Projection.
        */
      def this(`type`: DragAndDropEventType, file: File) = this()
      def this(`type`: DragAndDropEventType, file: File, opt_features: js.Array[Feature]) = this()
      def this(
        `type`: DragAndDropEventType,
        file: File,
        opt_features: js.Array[Feature],
        opt_projection: Projection
      ) = this()
      def this(`type`: DragAndDropEventType, file: File, opt_features: Unit, opt_projection: Projection) = this()
      
      /**
        * The features parsed from dropped data.
        * @api stable
        */
      var features: js.Array[Feature] = js.native
      
      /**
        * The dropped file.
        * @api stable
        */
      var file: File = js.native
      
      /**
        * The feature projection.
        * @api
        */
      var projection: Projection = js.native
    }
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
      * neither prevents the browser default nor stops event propagation.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    @JSImport("openlayers", "interaction.DragAndDrop.handleEvent")
    @js.native
    def handleEvent: Any = js.native
    inline def handleEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragBox")
  @js.native
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  open class DragBox () extends Pointer {
    def this(opt_options: DragBoxOptions) = this()
    
    /**
      * Returns geometry of last drawn box.
      * @return Geometry.
      * @api stable
      */
    def getGeometry(): Polygon = js.native
  }
  object DragBox {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragBox} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param coordinate The event coordinate.
      * @param mapBrowserEvent Originating event.
      */
    @JSImport("openlayers", "interaction.DragBox.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragBox} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param coordinate The event coordinate.
        * @param mapBrowserEvent Originating event.
        */
      def this(`type`: String, coordinate: Coordinate_, mapBrowserEvent: MapBrowserEvent) = this()
      
      /**
        * The coordinate of the drag event.
        * @api stable
        */
      var coordinate: Coordinate_ = js.native
      
      /**
        * @api
        */
      var mapBrowserEvent: MapBrowserEvent = js.native
    }
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragPan")
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragPan () extends Pointer {
    def this(opt_options: DragPanOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragRotate")
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragRotate () extends Pointer {
    def this(opt_options: DragRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragRotateAndZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragRotateAndZoom () extends Pointer {
    def this(opt_options: DragRotateAndZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.DragZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class DragZoom () extends DragBox {
    def this(opt_options: DragZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires ol.interaction.DrawEvent
    * @param options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.Draw")
  @js.native
  open class Draw protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for drawing feature geometries.
      *
      * @fires ol.interaction.DrawEvent
      * @param options Options.
      * @api stable
      */
    def this(options: DrawOptions) = this()
    
    /**
      * Extend an existing geometry by adding additional points. This only works
      * on features with `LineString` geometries, where the interaction will
      * extend lines by adding points to the end of the coordinates array.
      * @param feature Feature to be extended.
      * @api
      */
    def extend(feature: Feature): Unit = js.native
    
    /**
      * Stop drawing and add the sketch feature to the target layer.
      * The {@link ol.interaction.DrawEventType.DRAWEND} event is dispatched before
      * inserting the feature.
      * @api
      */
    def finishDrawing(): Unit = js.native
    
    /**
      * Remove last point of the feature currently being drawn.
      * @api
      */
    def removeLastPoint(): Unit = js.native
  }
  object Draw {
    
    @JSImport("openlayers", "interaction.Draw")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Draw} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    @JSImport("openlayers", "interaction.Draw.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Draw} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: DrawEventType, feature: Feature) = this()
      
      /**
        * The feature being drawn.
        * @api stable
        */
      var feature: Feature = js.native
    }
    
    /**
      * Create a `geometryFunction` that will create a box-shaped polygon (aligned
      * with the coordinate system axes).  Use this with the draw interaction and
      * `type: 'Circle'` to return a box instead of a circle geometry.
      * @return Function that draws a box-shaped polygon.
      * @api
      */
    /* static member */
    inline def createBox(): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")().asInstanceOf[DrawGeometryFunctionType]
    
    /**
      * Create a `geometryFunction` for `mode: 'Circle'` that will create a regular
      * polygon with a user specified number of sides and start angle instead of an
      * `ol.geom.Circle` geometry.
      * @param opt_sides Number of sides of the regular polygon. Default is
      *     32.
      * @param opt_angle Angle of the first point in radians. 0 means East.
      *     Default is the angle defined by the heading from the center of the
      *     regular polygon to the current pointer position.
      * @return Function that draws a
      *     polygon.
      * @api
      */
    /* static member */
    inline def createRegularPolygon(): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")().asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Double): DrawGeometryFunctionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any]).asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Double, opt_angle: Double): DrawGeometryFunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[DrawGeometryFunctionType]
    inline def createRegularPolygon(opt_sides: Unit, opt_angle: Double): DrawGeometryFunctionType = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(opt_sides.asInstanceOf[js.Any], opt_angle.asInstanceOf[js.Any])).asInstanceOf[DrawGeometryFunctionType]
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.interaction.Extent.Event
    * @param options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.Extent")
  @js.native
  open class Extent protected () extends Pointer {
    /**
      * @fires ol.interaction.Extent.Event
      * @param options Options.
      * @api stable
      */
    def this(options: ExtentOptions) = this()
    
    /**
      * Returns the current drawn extent in the view projection
      *
      * @return Drawn extent in the view projection.
      * @api
      */
    def getExtent(): Extent_ = js.native
    
    /**
      * Manually sets the drawn extent, using the view projection.
      *
      * @param extent Extent
      * @api
      */
    def setExtent(extent: Extent_): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def setMap(map: Map): Unit = js.native
  }
  object Extent {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Extent} instances are instances of
      * this type.
      *
      * @param extent the new extent
      */
    @JSImport("openlayers", "interaction.Extent.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Extent} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: ExtentEventType, extent: Extent_) = this()
      
      /**
        * The current extent.
        * @api stable
        */
      var extent: Extent_ = js.native
    }
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
    * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
    * element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    *
    * @param options Options.
    * @api
    */
  @JSImport("openlayers", "interaction.Interaction")
  @js.native
  open class Interaction protected () extends Object {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * User actions that change the state of the map. Some are similar to controls,
      * but are not associated with a DOM element.
      * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
      * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
      * element event.
      * Although interactions do not have a DOM element, some of them do render
      * vectors and so are visible on the screen.
      *
      * @param options Options.
      * @api
      */
    def this(options: InteractionOptions) = this()
    
    /**
      * Return whether the interaction is currently active.
      * @return `true` if the interaction is active, `false` otherwise.
      * @observable
      * @api
      */
    def getActive(): Boolean = js.native
    
    /**
      * Get the map associated with this interaction.
      * @return Map.
      * @api
      */
    def getMap(): Map = js.native
    
    /**
      * Activate or deactivate the interaction.
      * @param active Active.
      * @observable
      * @api
      */
    def setActive(active: Boolean): Unit = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.KeyboardPan")
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class KeyboardPan () extends Interaction {
    def this(opt_options: KeyboardPanOptions) = this()
  }
  object KeyboardPan {
    
    @JSImport("openlayers", "interaction.KeyboardPan")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides the direction to pan to (if an arrow key was
      * pressed).
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.KeyboardZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class KeyboardZoom () extends Interaction {
    def this(opt_options: KeyboardZoomOptions) = this()
  }
  object KeyboardZoom {
    
    @JSImport("openlayers", "interaction.KeyboardZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides whether to zoom in or out (depending on whether the
      * key pressed was '+' or '-').
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Interaction for modifying feature geometries.
    *
    * @param options Options.
    * @fires ol.interaction.ModifyEvent
    * @api
    */
  @JSImport("openlayers", "interaction.Modify")
  @js.native
  open class Modify protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for modifying feature geometries.
      *
      * @param options Options.
      * @fires ol.interaction.ModifyEvent
      * @api
      */
    def this(options: ModifyOptions) = this()
    
    /**
      * Removes the vertex currently being pointed.
      * @return True when a vertex was removed.
      * @api
      */
    def removePoint(): Boolean = js.native
  }
  object Modify {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Modify} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features modified.
      * @param mapBrowserPointerEvent Associated
      *     {@link ol.MapBrowserPointerEvent}.
      */
    @JSImport("openlayers", "interaction.Modify.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Modify} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features modified.
        * @param mapBrowserPointerEvent Associated
        *     {@link ol.MapBrowserPointerEvent}.
        */
      def this(
        `type`: ModifyEventType,
        features: Collection[Feature],
        mapBrowserPointerEvent: MapBrowserPointerEvent
      ) = this()
      
      /**
        * The features being modified.
        * @api
        */
      var features: Collection[Feature] = js.native
      
      /**
        * Associated {@link ol.MapBrowserEvent}.
        * @api
        */
      var mapBrowserEvent: MapBrowserEvent = js.native
    }
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.MouseWheelZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class MouseWheelZoom () extends Interaction {
    def this(opt_options: MouseWheelZoomOptions) = this()
    
    /**
      * Enable or disable using the mouse's location as an anchor when zooming
      * @param useAnchor true to zoom to the mouse's location, false
      * to zoom to the center of the map
      * @api
      */
    def setMouseAnchor(useAnchor: Boolean): Unit = js.native
  }
  object MouseWheelZoom {
    
    @JSImport("openlayers", "interaction.MouseWheelZoom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * mousewheel-event) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.PinchRotate")
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class PinchRotate () extends Pointer {
    def this(opt_options: PinchRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @JSImport("openlayers", "interaction.PinchZoom")
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  open class PinchZoom () extends Pointer {
    def this(opt_options: PinchZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "interaction.Pointer")
  @js.native
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  open class Pointer () extends Interaction {
    def this(opt_options: PointerOptions) = this()
  }
  object Pointer {
    
    @JSImport("openlayers", "interaction.Pointer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
      * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
      * detected.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
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
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  @JSImport("openlayers", "interaction.Select")
  @js.native
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
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  open class Select () extends Interaction {
    def this(opt_options: SelectOptions) = this()
    
    /**
      * Get the selected features.
      * @return Features collection.
      * @api stable
      */
    def getFeatures(): Collection[Feature] = js.native
    
    /**
      * Returns the associated {@link ol.layer.Vector vectorlayer} of
      * the (last) selected feature. Note that this will not work with any
      * programmatic method like pushing features to
      * {@link ol.interaction.Select#getFeatures collection}.
      * @param feature Feature
      * @return Layer.
      * @api
      */
    def getLayer(feature: Feature): Vector = js.native
    def getLayer(feature: typings.openlayers.mod.render.Feature): Vector = js.native
    
    /**
      * Remove the interaction from its current map, if any,  and attach it to a new
      * map, if any. Pass `null` to just remove the interaction from the current map.
      * @param map Map.
      * @api stable
      */
    def setMap(map: Map): Unit = js.native
  }
  object Select {
    
    @JSImport("openlayers", "interaction.Select")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Select} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param selected Selected features.
      * @param deselected Deselected features.
      * @param mapBrowserEvent Associated
      *     {@link ol.MapBrowserEvent}.
      */
    @JSImport("openlayers", "interaction.Select.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Select} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param selected Selected features.
        * @param deselected Deselected features.
        * @param mapBrowserEvent Associated
        *     {@link ol.MapBrowserEvent}.
        */
      def this(
        `type`: String,
        selected: js.Array[Feature],
        deselected: js.Array[Feature],
        mapBrowserEvent: MapBrowserEvent
      ) = this()
      
      /**
        * Deselected features array.
        * @api
        */
      var deselected: js.Array[Feature] = js.native
      
      /**
        * Associated {@link ol.MapBrowserEvent}.
        * @api
        */
      var mapBrowserEvent: MapBrowserEvent = js.native
      
      /**
        * Selected features array.
        * @api
        */
      var selected: js.Array[Feature] = js.native
    }
    
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
      * selected state of features.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    /* static member */
    inline def handleEvent(mapBrowserEvent: MapBrowserEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("handleEvent")(mapBrowserEvent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  @JSImport("openlayers", "interaction.Snap")
  @js.native
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  open class Snap () extends Pointer {
    def this(opt_options: SnapOptions) = this()
    
    /**
      * Add a feature to the collection of features that we may snap to.
      * @param feature Feature.
      * @param opt_listen Whether to listen to the geometry change or not
      *     Defaults to `true`.
      * @api
      */
    def addFeature(feature: Feature): Unit = js.native
    def addFeature(feature: Feature, opt_listen: Boolean): Unit = js.native
    
    /**
      * Remove a feature from the collection of features that we may snap to.
      * @param feature Feature
      * @param opt_unlisten Whether to unlisten to the geometry change
      *     or not. Defaults to `true`.
      * @api
      */
    def removeFeature(feature: Feature): Unit = js.native
    def removeFeature(feature: Feature, opt_unlisten: Boolean): Unit = js.native
  }
  
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    *
    * @fires ol.interaction.TranslateEvent
    * @param options Options.
    * @api
    */
  @JSImport("openlayers", "interaction.Translate")
  @js.native
  open class Translate protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for translating (moving) features.
      *
      * @fires ol.interaction.TranslateEvent
      * @param options Options.
      * @api
      */
    def this(options: TranslateOptions) = this()
  }
  object Translate {
    
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Translate} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features translated.
      * @param coordinate The event coordinate.
      */
    @JSImport("openlayers", "interaction.Translate.Event")
    @js.native
    open class Event protected ()
      extends typings.openlayers.mod.events.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Translate} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features translated.
        * @param coordinate The event coordinate.
        */
      def this(`type`: TranslateEventType, features: Collection[Feature], coordinate: Coordinate_) = this()
      
      /**
        * The coordinate of the drag event.
        * @api
        */
      var coordinate: Coordinate_ = js.native
      
      /**
        * The features being translated.
        * @api
        */
      var features: Collection[Feature] = js.native
    }
  }
  
  /**
    * Set of interactions included in maps by default. Specific interactions can be
    * excluded by setting the appropriate option to false in the constructor
    * options, but the order of the interactions is fixed.  If you want to specify
    * a different order for interactions, you will need to create your own
    * {@link ol.interaction.Interaction} instances and insert them into a
    * {@link ol.Collection} in the order you want before creating your
    * {@link ol.Map} instance. The default set of interactions, in sequence, is:
    * * {@link ol.interaction.DragRotate}
    * * {@link ol.interaction.DoubleClickZoom}
    * * {@link ol.interaction.DragPan}
    * * {@link ol.interaction.PinchRotate}
    * * {@link ol.interaction.PinchZoom}
    * * {@link ol.interaction.KeyboardPan}
    * * {@link ol.interaction.KeyboardZoom}
    * * {@link ol.interaction.MouseWheelZoom}
    * * {@link ol.interaction.DragZoom}
    *
    * @param opt_options Defaults options.
    * @return A collection of
    * interactions to be used with the ol.Map constructor's interactions option.
    * @api stable
    */
  inline def defaults(): Collection[Interaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Collection[Interaction]]
  inline def defaults(opt_options: DefaultsOptions): Collection[Interaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Collection[Interaction]]
  
  type DragAndDropEventType = String
  
  type DragBoxEventType = String
  
  type DrawEventType = String
  
  type ExtentEventType = String
  
  type TranslateEventType = String
}
