package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.geomGeometryMod.GeometryLayout
import typings.ol.geomGeometryMod.Type
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import typings.ol.olStrings.drawabort
import typings.ol.olStrings.drawend
import typings.ol.olStrings.drawstart
import typings.ol.pixelMod.Pixel
import typings.ol.styleFlatMod.FlatStyle
import typings.ol.styleFlatMod.FlatStyleLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDrawMod {
  
  @JSImport("ol/interaction/Draw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("ol/interaction/Draw", JSImport.Default)
  @js.native
  open class default protected () extends Draw {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Draw", "DrawEvent")
  @js.native
  open class DrawEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {DrawEventType} type Type.
      * @param {Feature} feature The feature drawn.
      */
    def this(`type`: DrawEventType, feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]) = this()
    
    /**
      * The feature being drawn.
      * @type {Feature}
      * @api
      */
    var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
  }
  
  inline def createBox(): GeometryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")().asInstanceOf[GeometryFunction]
  
  inline def createRegularPolygon(): GeometryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")().asInstanceOf[GeometryFunction]
  inline def createRegularPolygon(sides: Double): GeometryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(sides.asInstanceOf[js.Any]).asInstanceOf[GeometryFunction]
  inline def createRegularPolygon(sides: Double, angle: Double): GeometryFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(sides.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[GeometryFunction]
  inline def createRegularPolygon(sides: Unit, angle: Double): GeometryFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegularPolygon")(sides.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[GeometryFunction]
  
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
  @js.native
  trait Draw
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * Stop drawing without adding the sketch feature to the target layer.
      * @api
      */
    def abortDrawing(): Unit = js.native
    
    /**
      * Stop drawing without adding the sketch feature to the target layer.
      * @return {Feature<import("../geom/SimpleGeometry.js").default>|null} The sketch feature (or null if none).
      * @private
      */
    /* private */ var abortDrawing_ : Any = js.native
    
    /**
      * @param {TraceTarget} target The trace target.
      * @param {number} endIndex The new end index of the trace.
      * @private
      */
    /* private */ var addOrRemoveTracedCoordinates_ : Any = js.native
    
    /**
      * Add a new coordinate to the drawing.
      * @param {!PointCoordType} coordinate Coordinate
      * @private
      */
    /* private */ var addToDrawing_ : Any = js.native
    
    /**
      * @param {TraceTarget} target The trace target.
      * @param {number} fromIndex The start index.
      * @param {number} toIndex The end index.
      * @private
      */
    /* private */ var addTracedCoordinates_ : Any = js.native
    
    /**
      * Append coordinates to the end of the geometry that is currently being drawn.
      * This can be used when drawing LineStrings or Polygons. Coordinates will
      * either be appended to the current LineString or the outer ring of the current
      * Polygon. If no geometry is being drawn, a new one will be created.
      * @param {!LineCoordType} coordinates Linear coordinates to be appended to
      * the coordinate array.
      * @api
      */
    def appendCoordinates(coordinates: LineCoordType): Unit = js.native
    
    /**
      * Determine if an event is within the snapping tolerance of the start coord.
      * @param {import("../pixel.js").Pixel} pixel Pixel.
      * @param {boolean} [tracing] Drawing in trace mode (only stop if at the starting point).
      * @return {boolean} The event is within the snapping tolerance of the start.
      * @private
      */
    /* private */ var atFinish_ : Any = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @param {import("../geom/Polygon.js").default} geometry Polygon geometry.
      * @private
      */
    /* private */ var createOrUpdateCustomSketchLine_ : Any = js.native
    
    /**
      * @param {import("../coordinate").Coordinate} coordinates Coordinate.
      * @private
      */
    /* private */ var createOrUpdateSketchPoint_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var deactivateTrace_ : Any = js.native
    
    /**
      * @type {import("../pixel.js").Pixel}
      * @private
      */
    /* private */ var downPx_ : Any = js.native
    
    /**
      * @type {?}
      * @private
      */
    /* private */ var downTimeout_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var dragVertexDelay_ : Any = js.native
    
    /**
      * Initiate draw mode by starting from an existing geometry which will
      * receive new additional points. This only works on features with
      * `LineString` geometries, where the interaction will extend lines by adding
      * points to the end of the coordinates array.
      * This will change the original feature, instead of drawing a copy.
      *
      * The function will dispatch a `drawstart` event.
      *
      * @param {!Feature<LineString>} feature Feature to be extended.
      * @api
      */
    def extend(feature: typings.ol.featureMod.default[typings.ol.geomLineStringMod.default]): Unit = js.native
    
    /**
      * Target collection for drawn features.
      * @type {import("../Collection.js").default<Feature>|null}
      * @private
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * A function to decide if a potential finish coordinate is permissible
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var finishCondition_ : Any = js.native
    
    /**
      * Finish coordinate for the feature (first point for polygons, last point for
      * linestrings).
      * @type {import("../coordinate.js").Coordinate}
      * @private
      */
    /* private */ var finishCoordinate_ : Any = js.native
    
    /**
      * Stop drawing and add the sketch feature to the target layer.
      * The {@link module:ol/interaction/Draw~DrawEventType.DRAWEND} event is
      * dispatched before inserting the feature.
      * @api
      */
    def finishDrawing(): Unit = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var freehandCondition_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var freehand_ : Any = js.native
    
    /**
      * @type {GeometryFunction}
      * @private
      */
    /* private */ var geometryFunction_ : Any = js.native
    
    /**
      * @private
      * @type {import("../geom/Geometry.js").GeometryLayout}
      */
    /* private */ var geometryLayout_ : Any = js.native
    
    /**
      * Name of the geometry attribute for newly created features.
      * @type {string|undefined}
      * @private
      */
    /* private */ var geometryName_ : Any = js.native
    
    /**
      * Get the overlay layer that this interaction renders sketch features to.
      * @return {VectorLayer} Overlay layer.
      * @api
      */
    def getOverlay(): typings.ol.layerVectorMod.default[Any] = js.native
    
    /**
      * Handle move events.
      * @param {import("../MapBrowserEvent.js").default} event A move event.
      * @private
      */
    /* private */ var handlePointerMove_ : Any = js.native
    
    /**
      * @type {number|undefined}
      * @private
      */
    /* private */ var lastDragTime_ : Any = js.native
    
    /**
      * The number of points that can be drawn before a polygon ring or line string
      * is finished. The default is no restriction.
      * @type {number}
      * @private
      */
    /* private */ var maxPoints_ : Any = js.native
    
    /**
      * The number of points that must be drawn before a polygon ring or line
      * string can be finished.  The default is 3 for polygon rings and 2 for
      * line strings.
      * @type {number}
      * @private
      */
    /* private */ var minPoints_ : Any = js.native
    
    /**
      * Drawing mode (derived from geometry type.
      * @type {Mode}
      * @private
      */
    /* private */ var mode_ : Any = js.native
    
    /**
      * Modify the drawing.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @private
      */
    /* private */ var modifyDrawing_ : Any = js.native
    
    /***
      * @type {DrawOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Draw: DrawOnSignature[EventsKey] = js.native
    
    /***
      * @type {DrawOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Draw: DrawOnSignature[EventsKey] = js.native
    
    /**
      * Draw overlay where our sketch features are drawn.
      * @type {VectorLayer}
      * @private
      */
    /* private */ var overlay_ : Any = js.native
    
    /**
      * Pointer type of the last pointermove event
      * @type {string}
      * @private
      */
    /* private */ var pointerType_ : Any = js.native
    
    /**
      * Remove last point of the feature currently being drawn. Does not do anything when
      * drawing POINT or MULTI_POINT geometries.
      * @api
      */
    def removeLastPoint(): Unit = js.native
    
    /**
      * @param {number} n The number of points to remove.
      */
    def removeLastPoints_(n: Double): Unit = js.native
    
    /**
      * @param {number} fromIndex The start index.
      * @param {number} toIndex The end index.
      * @private
      */
    /* private */ var removeTracedCoordinates_ : Any = js.native
    
    /**
      * Toggle tracing mode or set a tracing condition.
      *
      * @param {boolean|import("../events/condition.js").Condition} trace A boolean to toggle tracing mode or an event
      *     condition that will be checked when a feature is clicked to determine if tracing should be active.
      */
    def setTrace(trace: Boolean): Unit = js.native
    def setTrace(trace: Condition): Unit = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var shouldHandle_ : Any = js.native
    
    /**
      * Sketch coordinates. Used when drawing a line or polygon.
      * @type {SketchCoordType}
      * @private
      */
    /* private */ var sketchCoords_ : Any = js.native
    
    /**
      * Sketch feature.
      * @type {Feature<import('../geom/SimpleGeometry.js').default>}
      * @private
      */
    /* private */ var sketchFeature_ : Any = js.native
    
    /**
      * Sketch line coordinates. Used when drawing a polygon or circle.
      * @type {LineCoordType}
      * @private
      */
    /* private */ var sketchLineCoords_ : Any = js.native
    
    /**
      * Sketch line. Used when drawing polygon.
      * @type {Feature<LineString>}
      * @private
      */
    /* private */ var sketchLine_ : Any = js.native
    
    /**
      * Sketch point.
      * @type {Feature<Point>}
      * @private
      */
    /* private */ var sketchPoint_ : Any = js.native
    
    /**
      * Pixel distance for snapping.
      * @type {number}
      * @private
      */
    /* private */ var snapTolerance_ : Any = js.native
    
    /**
      * Target source for drawn features.
      * @type {VectorSource|null}
      * @private
      */
    /* private */ var source_ : Any = js.native
    
    /**
      * Squared tolerance for handling up events.  If the squared distance
      * between a down and up event is greater than this tolerance, up events
      * will not be handled.
      * @type {number}
      * @private
      */
    /* private */ var squaredClickTolerance_ : Any = js.native
    
    /**
      * Start the drawing.
      * @param {import("../coordinate.js").Coordinate} start Start coordinate.
      * @private
      */
    /* private */ var startDrawing_ : Any = js.native
    
    /**
      * Stop click, singleclick, and doubleclick events from firing during drawing.
      * Default is `false`.
      * @type {boolean}
      * @private
      */
    /* private */ var stopClick_ : Any = js.native
    
    /**
      * Activate or deactivate trace state based on a browser event.
      * @param {import("../MapBrowserEvent.js").default} event Event.
      * @private
      */
    /* private */ var toggleTraceState_ : Any = js.native
    
    /**
      * @type {import("../events/condition.js").Condition}
      * @private
      */
    /* private */ var traceCondition_ : Any = js.native
    
    /**
      * @type {VectorSource|null}
      * @private
      */
    /* private */ var traceSource_ : Any = js.native
    
    /**
      * @type {TraceState}
      * @private
      */
    /* private */ var traceState_ : Any = js.native
    
    /**
      * Geometry type.
      * @type {import("../geom/Geometry.js").Type}
      * @private
      */
    /* private */ var type_ : Any = js.native
    
    /***
      * @type {DrawOnSignature<void>}
      */
    @JSName("un")
    var un_Draw: DrawOnSignature[Unit] = js.native
    
    /**
      * Redraw the sketch features.
      * @private
      */
    /* private */ var updateSketchFeatures_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var updateState_ : Any = js.native
    
    /**
      * Update the trace.
      * @param {import("../MapBrowserEvent.js").default} event Event.
      * @private
      */
    /* private */ var updateTrace_ : Any = js.native
  }
  
  type DrawEventType = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait DrawOnSignature[Return]
    extends OnSignature[
          changeColonactive | drawabort | drawend | drawstart | EventTypes | Types, 
          DrawEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  type GeometryFunction = js.Function3[
    /* arg0 */ SketchCoordType, 
    /* arg1 */ typings.ol.geomSimpleGeometryMod.default, 
    /* arg2 */ typings.ol.projProjectionMod.default, 
    typings.ol.geomSimpleGeometryMod.default
  ]
  
  type LineCoordType = js.Array[Coordinate]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.Point
    - typings.ol.olStrings.LineString
    - typings.ol.olStrings.Polygon
    - typings.ol.olStrings.Circle
  */
  trait Mode extends StObject
  object Mode {
    
    inline def Circle: typings.ol.olStrings.Circle = "Circle".asInstanceOf[typings.ol.olStrings.Circle]
    
    inline def LineString: typings.ol.olStrings.LineString = "LineString".asInstanceOf[typings.ol.olStrings.LineString]
    
    inline def Point: typings.ol.olStrings.Point = "Point".asInstanceOf[typings.ol.olStrings.Point]
    
    inline def Polygon: typings.ol.olStrings.Polygon = "Polygon".asInstanceOf[typings.ol.olStrings.Polygon]
  }
  
  trait Options extends StObject {
    
    /**
      * The maximum distance in pixels between
      * "down" and "up" for a "up" event to be considered a "click" event and
      * actually add a point/vertex to the geometry being drawn.  The default of `6`
      * was chosen for the draw interaction to behave correctly on mouse as well as
      * on touch devices.
      */
    var clickTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled.
      * By default {@link module :ol/events/condition.noModifierKeys}, i.e. a click,
      * adds a vertex or deactivates freehand drawing.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Delay in milliseconds after pointerdown
      * before the current vertex can be dragged to its exact position.
      */
    var dragVertexDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Destination collection for the drawn features.
      */
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether the drawing can be finished. Not used when drawing
      * POINT or MULTI_POINT geometries.
      */
    var finishCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Operate in freehand mode for lines,
      * polygons, and circles.  This makes the interaction always operate in freehand
      * mode and takes precedence over any `freehandCondition` option.
      */
    var freehand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Condition that activates freehand drawing for lines and polygons. This
      * function takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and
      * returns a boolean to indicate whether that event should be handled. The
      * default is {@link module :ol/events/condition.shiftKeyOnly}, meaning that the
      * Shift key activates freehand drawing.
      */
    var freehandCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Function that is called when a geometry's coordinates are updated.
      */
    var geometryFunction: js.UndefOr[GeometryFunction] = js.undefined
    
    /**
      * Layout of the
      * feature geometries created by the draw interaction.
      */
    var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
    
    /**
      * Geometry name to use for features created
      * by the draw interaction.
      */
    var geometryName: js.UndefOr[String] = js.undefined
    
    /**
      * The number of points that can be drawn before
      * a polygon ring or line string is finished. By default there is no
      * restriction.
      */
    var maxPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of points that must be drawn
      * before a polygon ring or line string can be finished. Default is `3` for
      * polygon rings and `2` for line strings.
      */
    var minPoints: js.UndefOr[Double] = js.undefined
    
    /**
      * Pixel distance for snapping to the
      * drawing finish. Must be greater than `0`.
      */
    var snapTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Destination source for
      * the drawn features.
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * Stop click, singleclick, and
      * doubleclick events from firing during drawing.
      */
    var stopClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style for sketch features.
      */
    var style: js.UndefOr[StyleLike | FlatStyleLike] = js.undefined
    
    /**
      * Trace a portion of another geometry.
      * Ignored when in freehand mode.
      */
    var trace: js.UndefOr[Boolean | Condition] = js.undefined
    
    /**
      * Source for features to trace.  If tracing is active and a `traceSource` is
      * not provided, the interaction's `source` will be used.  Tracing requires that the interaction is configured with
      * either a `traceSource` or a `source`.
      */
    var traceSource: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * Geometry type of
      * the geometries being drawn with this instance.
      */
    var `type`: Type
    
    /**
      * Wrap the world horizontally on the sketch
      * overlay.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(`type`: Type): Options = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
      
      inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDragVertexDelay(value: Double): Self = StObject.set(x, "dragVertexDelay", value.asInstanceOf[js.Any])
      
      inline def setDragVertexDelayUndefined: Self = StObject.set(x, "dragVertexDelay", js.undefined)
      
      inline def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFinishCondition(value: Condition): Self = StObject.set(x, "finishCondition", value.asInstanceOf[js.Any])
      
      inline def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
      
      inline def setFreehand(value: Boolean): Self = StObject.set(x, "freehand", value.asInstanceOf[js.Any])
      
      inline def setFreehandCondition(value: Condition): Self = StObject.set(x, "freehandCondition", value.asInstanceOf[js.Any])
      
      inline def setFreehandConditionUndefined: Self = StObject.set(x, "freehandCondition", js.undefined)
      
      inline def setFreehandUndefined: Self = StObject.set(x, "freehand", js.undefined)
      
      inline def setGeometryFunction(
        value: (/* arg0 */ SketchCoordType, /* arg1 */ typings.ol.geomSimpleGeometryMod.default, /* arg2 */ typings.ol.projProjectionMod.default) => typings.ol.geomSimpleGeometryMod.default
      ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction3(value))
      
      inline def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
      
      inline def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
      
      inline def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
      
      inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
      
      inline def setMinPoints(value: Double): Self = StObject.set(x, "minPoints", value.asInstanceOf[js.Any])
      
      inline def setMinPointsUndefined: Self = StObject.set(x, "minPoints", js.undefined)
      
      inline def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
      
      inline def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStopClick(value: Boolean): Self = StObject.set(x, "stopClick", value.asInstanceOf[js.Any])
      
      inline def setStopClickUndefined: Self = StObject.set(x, "stopClick", js.undefined)
      
      inline def setStyle(value: StyleLike | FlatStyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: (FlatStyle | Style)*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTrace(value: Boolean | Condition): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "traceSource", value.asInstanceOf[js.Any])
      
      inline def setTraceSourceUndefined: Self = StObject.set(x, "traceSource", js.undefined)
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  type PointCoordType = Coordinate
  
  trait PointSegmentRelationship extends StObject {
    
    /**
      * The closest point expressed as a fraction along the segment length.
      */
    var along: Double
    
    /**
      * The squared distance of the point to the segment.
      */
    var squaredDistance: Double
  }
  object PointSegmentRelationship {
    
    inline def apply(along: Double, squaredDistance: Double): PointSegmentRelationship = {
      val __obj = js.Dynamic.literal(along = along.asInstanceOf[js.Any], squaredDistance = squaredDistance.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointSegmentRelationship]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointSegmentRelationship] (val x: Self) extends AnyVal {
      
      inline def setAlong(value: Double): Self = StObject.set(x, "along", value.asInstanceOf[js.Any])
      
      inline def setSquaredDistance(value: Double): Self = StObject.set(x, "squaredDistance", value.asInstanceOf[js.Any])
    }
  }
  
  type PolyCoordType = js.Array[js.Array[Coordinate]]
  
  type SketchCoordType = js.Array[js.Array[Coordinate] | Coordinate | Double]
  
  trait TraceState extends StObject {
    
    /**
      * Tracing active.
      */
    var active: Boolean
    
    /**
      * The initially clicked pixel location.
      */
    var startPx: js.UndefOr[Pixel] = js.undefined
    
    /**
      * The index of the currently traced target.  A value of -1 indicates
      * that no trace target is active.
      */
    var targetIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Targets available for tracing.
      */
    var targets: js.UndefOr[js.Array[TraceTarget]] = js.undefined
  }
  object TraceState {
    
    inline def apply(active: Boolean): TraceState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setStartPx(value: Pixel): Self = StObject.set(x, "startPx", value.asInstanceOf[js.Any])
      
      inline def setStartPxUndefined: Self = StObject.set(x, "startPx", js.undefined)
      
      inline def setStartPxVarargs(value: Double*): Self = StObject.set(x, "startPx", js.Array(value*))
      
      inline def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
      
      inline def setTargetIndexUndefined: Self = StObject.set(x, "targetIndex", js.undefined)
      
      inline def setTargets(value: js.Array[TraceTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: TraceTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait TraceTarget extends StObject {
    
    /**
      * Target coordinates.
      */
    var coordinates: js.Array[Coordinate]
    
    /**
      * The index of last traced coordinate.  Details from startIndex also apply here.
      */
    var endIndex: Double
    
    /**
      * The target coordinates are a linear ring.
      */
    var ring: Boolean
    
    /**
      * The index of first traced coordinate.  A fractional index represents an
      * edge intersection.  Index values for rings will wrap (may be negative or larger than coordinates length).
      */
    var startIndex: Double
  }
  object TraceTarget {
    
    inline def apply(coordinates: js.Array[Coordinate], endIndex: Double, ring: Boolean, startIndex: Double): TraceTarget = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], ring = ring.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceTarget] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setRing(value: Boolean): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraceTargetUpdateInfo extends StObject {
    
    /**
      * The new segment end index.
      */
    var endIndex: Double
    
    /**
      * The new target index.
      */
    var index: Double
  }
  object TraceTargetUpdateInfo {
    
    inline def apply(endIndex: Double, index: Double): TraceTargetUpdateInfo = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceTargetUpdateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceTargetUpdateInfo] (val x: Self) extends AnyVal {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
