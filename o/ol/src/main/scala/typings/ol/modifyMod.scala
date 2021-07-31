package typings.ol

import typings.ol.conditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olStrings.modifyend
import typings.ol.olStrings.modifystart
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifyMod {
  
  @JSImport("ol/interaction/Modify", JSImport.Default)
  @js.native
  class default protected () extends Modify {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Modify", "ModifyEvent")
  @js.native
  class ModifyEvent protected ()
    extends typings.ol.eventMod.default {
    def this(
      `type`: ModifyEventType,
      features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      MapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * The features being modified.
      */
    var features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent}.
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent] = js.native
  }
  
  @js.native
  sealed trait ModifyEventType extends StObject
  @JSImport("ol/interaction/Modify", "ModifyEventType")
  @js.native
  object ModifyEventType extends StObject {
    
    @js.native
    sealed trait MODIFYEND
      extends StObject
         with ModifyEventType
    
    @js.native
    sealed trait MODIFYSTART
      extends StObject
         with ModifyEventType
  }
  
  @js.native
  trait Modify
    extends typings.ol.pointerMod.default {
    
    /**
      * Get the overlay layer that this interaction renders sketch features to.
      */
    def getOverlay(): typings.ol.vectorMod.default = js.native
    
    @JSName("on")
    def on_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
    
    /**
      * Removes the vertex currently being pointed.
      */
    def removePoint(): Boolean = js.native
    
    @JSName("un")
    def un_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var deleteCondition: js.UndefOr[Condition] = js.undefined
    
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ] = js.undefined
    
    var insertVertexCondition: js.UndefOr[Condition] = js.undefined
    
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
    
    var style: js.UndefOr[StyleLike] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDeleteCondition(value: Condition): Self = StObject.set(x, "deleteCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteConditionUndefined: Self = StObject.set(x, "deleteCondition", js.undefined)
      
      @scala.inline
      def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setInsertVertexCondition(value: Condition): Self = StObject.set(x, "insertVertexCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertVertexConditionUndefined: Self = StObject.set(x, "insertVertexCondition", js.undefined)
      
      @scala.inline
      def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      @scala.inline
      def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  trait SegmentData extends StObject {
    
    var depth: js.UndefOr[js.Array[Double]] = js.undefined
    
    var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
    
    var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
    
    var geometry: typings.ol.simpleGeometryMod.default
    
    var index: js.UndefOr[Double] = js.undefined
    
    var segment: js.Array[Extent]
  }
  object SegmentData {
    
    @scala.inline
    def apply(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      geometry: typings.ol.simpleGeometryMod.default,
      segment: js.Array[Extent]
    ): SegmentData = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentData]
    }
    
    @scala.inline
    implicit class SegmentDataMutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: js.Array[Double]): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setDepthVarargs(value: Double*): Self = StObject.set(x, "depth", js.Array(value :_*))
      
      @scala.inline
      def setFeature(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureSegments(value: js.Array[SegmentData]): Self = StObject.set(x, "featureSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureSegmentsUndefined: Self = StObject.set(x, "featureSegments", js.undefined)
      
      @scala.inline
      def setFeatureSegmentsVarargs(value: SegmentData*): Self = StObject.set(x, "featureSegments", js.Array(value :_*))
      
      @scala.inline
      def setGeometry(value: typings.ol.simpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setSegment(value: js.Array[Extent]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentVarargs(value: Extent*): Self = StObject.set(x, "segment", js.Array(value :_*))
    }
  }
}
