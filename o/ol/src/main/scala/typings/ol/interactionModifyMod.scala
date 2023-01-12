package typings.ol

import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.olStrings.modifyend
import typings.ol.olStrings.modifystart
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModifyMod {
  
  @JSImport("ol/interaction/Modify", JSImport.Default)
  @js.native
  open class default protected () extends Modify {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Modify", "ModifyEvent")
  @js.native
  open class ModifyEvent protected ()
    extends typings.ol.eventsEventMod.default {
    def this(
      `type`: ModifyEventType,
      features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      MapBrowserEvent: typings.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * The features being modified.
      */
    var features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
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
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * Get the overlay layer that this interaction renders the modification point or vertex to.
      */
    def getOverlay(): typings.ol.layerVectorMod.default = js.native
    
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
        typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ] = js.undefined
    
    var hitDetection: js.UndefOr[
        Boolean | (typings.ol.layerBaseVectorMod.default[
          typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.sourceVectorTileMod.default
        ])
      ] = js.undefined
    
    var insertVertexCondition: js.UndefOr[Condition] = js.undefined
    
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    var style: js.UndefOr[StyleLike] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDeleteCondition(value: Condition): Self = StObject.set(x, "deleteCondition", value.asInstanceOf[js.Any])
      
      inline def setDeleteConditionUndefined: Self = StObject.set(x, "deleteCondition", js.undefined)
      
      inline def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setHitDetection(
        value: Boolean | (typings.ol.layerBaseVectorMod.default[
              typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] | typings.ol.sourceVectorTileMod.default
            ])
      ): Self = StObject.set(x, "hitDetection", value.asInstanceOf[js.Any])
      
      inline def setHitDetectionUndefined: Self = StObject.set(x, "hitDetection", js.undefined)
      
      inline def setInsertVertexCondition(value: Condition): Self = StObject.set(x, "insertVertexCondition", value.asInstanceOf[js.Any])
      
      inline def setInsertVertexConditionUndefined: Self = StObject.set(x, "insertVertexCondition", js.undefined)
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  trait SegmentData extends StObject {
    
    var depth: js.UndefOr[js.Array[Double]] = js.undefined
    
    var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
    
    var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
    
    var geometry: typings.ol.geomSimpleGeometryMod.default
    
    var index: js.UndefOr[Double] = js.undefined
    
    var segment: js.Array[Extent]
  }
  object SegmentData {
    
    inline def apply(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      geometry: typings.ol.geomSimpleGeometryMod.default,
      segment: js.Array[Extent]
    ): SegmentData = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: js.Array[Double]): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setDepthVarargs(value: Double*): Self = StObject.set(x, "depth", js.Array(value*))
      
      inline def setFeature(value: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureSegments(value: js.Array[SegmentData]): Self = StObject.set(x, "featureSegments", value.asInstanceOf[js.Any])
      
      inline def setFeatureSegmentsUndefined: Self = StObject.set(x, "featureSegments", js.undefined)
      
      inline def setFeatureSegmentsVarargs(value: SegmentData*): Self = StObject.set(x, "featureSegments", js.Array(value*))
      
      inline def setGeometry(value: typings.ol.geomSimpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setSegment(value: js.Array[Extent]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentVarargs(value: Extent*): Self = StObject.set(x, "segment", js.Array(value*))
    }
  }
}
