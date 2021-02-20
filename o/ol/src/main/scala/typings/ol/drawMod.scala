package typings.ol

import typings.ol.conditionMod.Condition
import typings.ol.coordinateMod.Coordinate
import typings.ol.eventsMod.EventsKey
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.drawabort
import typings.ol.olStrings.drawend
import typings.ol.olStrings.drawstart
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawMod {
  
  @JSImport("ol/interaction/Draw", JSImport.Default)
  @js.native
  class default protected () extends Draw {
    def this(options: Options) = this()
  }
  
  @js.native
  sealed trait DrawEventType extends StObject
  @JSImport("ol/interaction/Draw", "DrawEventType")
  @js.native
  object DrawEventType extends StObject {
    
    @js.native
    sealed trait DRAWABORT extends DrawEventType
    
    @js.native
    sealed trait DRAWEND extends DrawEventType
    
    @js.native
    sealed trait DRAWSTART extends DrawEventType
  }
  
  @JSImport("ol/interaction/Draw", "createBox")
  @js.native
  def createBox(): GeometryFunction = js.native
  
  @JSImport("ol/interaction/Draw", "createRegularPolygon")
  @js.native
  def createRegularPolygon(): GeometryFunction = js.native
  @JSImport("ol/interaction/Draw", "createRegularPolygon")
  @js.native
  def createRegularPolygon(opt_sides: js.UndefOr[scala.Nothing], opt_angle: Double): GeometryFunction = js.native
  @JSImport("ol/interaction/Draw", "createRegularPolygon")
  @js.native
  def createRegularPolygon(opt_sides: Double): GeometryFunction = js.native
  @JSImport("ol/interaction/Draw", "createRegularPolygon")
  @js.native
  def createRegularPolygon(opt_sides: Double, opt_angle: Double): GeometryFunction = js.native
  
  @js.native
  trait Draw
    extends typings.ol.pointerMod.default {
    
    /**
      * Stop drawing without adding the sketch feature to the target layer.
      */
    def abortDrawing(): Unit = js.native
    
    /**
      * Append coordinates to the end of the geometry that is currently being drawn.
      * This can be used when drawing LineStrings or Polygons. Coordinates will
      * either be appended to the current LineString or the outer ring of the current
      * Polygon.
      */
    def appendCoordinates(coordinates: LineCoordType): Unit = js.native
    
    /**
      * Initiate draw mode by starting from an existing geometry which will
      * receive new additional points. This only works on features with
      * LineString geometries, where the interaction will extend lines by adding
      * points to the end of the coordinates array.
      * This will change the original feature, instead of drawing a copy.
      * The function will dispatch a drawstart event.
      */
    def extend(feature: typings.ol.olFeatureMod.default[typings.ol.lineStringMod.default]): Unit = js.native
    
    /**
      * Stop drawing and add the sketch feature to the target layer.
      * The {@link module:ol/interaction/Draw~DrawEventType.DRAWEND} event is
      * dispatched before inserting the feature.
      */
    def finishDrawing(): Unit = js.native
    
    /**
      * Get the overlay layer that this interaction renders sketch features to.
      */
    def getOverlay(): typings.ol.vectorMod.default = js.native
    
    @JSName("on")
    def on_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
    
    /**
      * Remove last point of the feature currently being drawn.
      */
    def removeLastPoint(): Unit = js.native
    
    @JSName("un")
    def un_drawabort(`type`: drawabort, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait DrawEvent
    extends typings.ol.eventMod.default {
    
    /**
      * The feature being drawn.
      */
    var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  }
  
  type GeometryFunction = js.Function3[
    /* p0 */ SketchCoordType, 
    /* p1 */ js.UndefOr[typings.ol.simpleGeometryMod.default], 
    /* p2 */ js.UndefOr[typings.ol.projectionMod.default], 
    typings.ol.simpleGeometryMod.default
  ]
  
  type LineCoordType = js.Array[Coordinate]
  
  @js.native
  trait Options extends StObject {
    
    var clickTolerance: js.UndefOr[Double] = js.native
    
    var condition: js.UndefOr[Condition] = js.native
    
    var dragVertexDelay: js.UndefOr[Double] = js.native
    
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ] = js.native
    
    var finishCondition: js.UndefOr[Condition] = js.native
    
    var freehand: js.UndefOr[Boolean] = js.native
    
    var freehandCondition: js.UndefOr[Condition] = js.native
    
    var geometryFunction: js.UndefOr[GeometryFunction] = js.native
    
    var geometryName: js.UndefOr[String] = js.native
    
    var maxPoints: js.UndefOr[Double] = js.native
    
    var minPoints: js.UndefOr[Double] = js.native
    
    var snapTolerance: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.native
    
    var stopClick: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StyleLike] = js.native
    
    var `type`: GeometryType = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(`type`: GeometryType): Options = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDragVertexDelay(value: Double): Self = StObject.set(x, "dragVertexDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragVertexDelayUndefined: Self = StObject.set(x, "dragVertexDelay", js.undefined)
      
      @scala.inline
      def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFinishCondition(value: Condition): Self = StObject.set(x, "finishCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishConditionUndefined: Self = StObject.set(x, "finishCondition", js.undefined)
      
      @scala.inline
      def setFreehand(value: Boolean): Self = StObject.set(x, "freehand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreehandCondition(value: Condition): Self = StObject.set(x, "freehandCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreehandConditionUndefined: Self = StObject.set(x, "freehandCondition", js.undefined)
      
      @scala.inline
      def setFreehandUndefined: Self = StObject.set(x, "freehand", js.undefined)
      
      @scala.inline
      def setGeometryFunction(
        value: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typings.ol.simpleGeometryMod.default], /* p2 */ js.UndefOr[typings.ol.projectionMod.default]) => typings.ol.simpleGeometryMod.default
      ): Self = StObject.set(x, "geometryFunction", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGeometryFunctionUndefined: Self = StObject.set(x, "geometryFunction", js.undefined)
      
      @scala.inline
      def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      @scala.inline
      def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
      
      @scala.inline
      def setMinPoints(value: Double): Self = StObject.set(x, "minPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPointsUndefined: Self = StObject.set(x, "minPoints", js.undefined)
      
      @scala.inline
      def setSnapTolerance(value: Double): Self = StObject.set(x, "snapTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapToleranceUndefined: Self = StObject.set(x, "snapTolerance", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStopClick(value: Boolean): Self = StObject.set(x, "stopClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopClickUndefined: Self = StObject.set(x, "stopClick", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setType(value: GeometryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  type PointCoordType = Coordinate
  
  type PolyCoordType = js.Array[js.Array[Coordinate]]
  
  type SketchCoordType = PointCoordType | LineCoordType | PolyCoordType
}
