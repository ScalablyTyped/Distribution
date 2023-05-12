package typings.ol

import typings.ol.eventsConditionMod.Condition
import typings.ol.eventsMod.EventsKey
import typings.ol.featureMod.FeatureLike
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColonactive
import typings.ol.olStrings.modifyend
import typings.ol.olStrings.modifystart
import typings.ol.styleFlatMod.FlatStyle
import typings.ol.styleFlatMod.FlatStyleLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionModifyMod {
  
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
  @JSImport("ol/interaction/Modify", JSImport.Default)
  @js.native
  open class default protected () extends Modify {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/interaction/Modify", "ModifyEvent")
  @js.native
  open class ModifyEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {ModifyEventType} type Type.
      * @param {Collection<Feature>} features
      * The features modified.
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent
      * Associated {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      */
    def this(
      `type`: ModifyEventType,
      features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any]
    ) = this()
    
    /**
      * The features being modified.
      * @type {Collection<Feature>}
      * @api
      */
    var features: typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent~MapBrowserEvent}.
      * @type {import("../MapBrowserEvent.js").default}
      * @api
      */
    var mapBrowserEvent: typings.ol.mapBrowserEventMod.default[Any] = js.native
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
  @js.native
  trait Modify
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @const
      * @private
      * @type {!Object<string, function(Feature, import("../geom/Geometry.js").default): void>}
      */
    /* private */ var SEGMENT_WRITERS_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature.
      * @private
      */
    /* private */ var addFeature_ : Any = js.native
    
    /** @private */
    /* private */ var boundHandleFeatureChange_ : Any = js.native
    
    /**
      * Indicate whether the interaction is currently changing a feature's
      * coordinates.
      * @type {boolean}
      * @private
      */
    /* private */ var changingFeature_ : Any = js.native
    
    /**
      * @private
      * @type {import("../events/condition.js").Condition}
      */
    /* private */ var condition_ : Any = js.native
    
    /**
      * @param {import("../coordinate.js").Coordinate} coordinates Coordinates.
      * @param {Array<Feature>} features The features being modified.
      * @param {Array<import("../geom/SimpleGeometry.js").default>} geometries The geometries being modified.
      * @return {Feature} Vertex feature.
      * @private
      */
    /* private */ var createOrUpdateVertexFeature_ : Any = js.native
    
    /**
      * @private
      * @param {import("../MapBrowserEvent.js").default} mapBrowserEvent Browser event.
      * @return {boolean} Combined condition result.
      */
    /* private */ var defaultDeleteCondition_ : Any = js.native
    
    /**
      * @type {import("../events/condition.js").Condition}
      * @private
      */
    /* private */ var deleteCondition_ : Any = js.native
    
    /**
      * Delta (x, y in map units) between matched rtree vertex and pointer vertex.
      * @type {Array<number>}
      */
    var delta_ : js.Array[Double] = js.native
    
    /**
      * @type {Array}
      * @private
      */
    /* private */ var dragSegments_ : Any = js.native
    
    /**
      * @type {Collection<Feature>}
      * @private
      */
    /* private */ var featuresBeingModified_ : Any = js.native
    
    /**
      * @type {Collection<Feature>}
      * @private
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * Get the overlay layer that this interaction renders the modification point or vertex to.
      * @return {VectorLayer} Overlay layer.
      * @api
      */
    def getOverlay(): typings.ol.layerVectorMod.default[Any] = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<Feature>} evt Event.
      * @private
      */
    /* private */ var handleFeatureAdd_ : Any = js.native
    
    /**
      * @param {import("../events/Event.js").default} evt Event.
      * @private
      */
    /* private */ var handleFeatureChange_ : Any = js.native
    
    /**
      * @param {import("../Collection.js").CollectionEvent<Feature>} evt Event.
      * @private
      */
    /* private */ var handleFeatureRemove_ : Any = js.native
    
    /**
      * @param {import("../pixel.js").Pixel} pixel Pixel
      * @param {import("../Map.js").default} map Map.
      * @param {import("../coordinate.js").Coordinate} [coordinate] The pixel Coordinate.
      * @private
      */
    /* private */ var handlePointerAtPixel_ : Any = js.native
    
    /**
      * @param {import("../MapBrowserEvent.js").default} evt Event.
      * @private
      */
    /* private */ var handlePointerMove_ : Any = js.native
    
    /**
      * @param {import("../source/Vector.js").VectorSourceEvent} event Event.
      * @private
      */
    /* private */ var handleSourceAdd_ : Any = js.native
    
    /**
      * @param {import("../source/Vector.js").VectorSourceEvent} event Event.
      * @private
      */
    /* private */ var handleSourceRemove_ : Any = js.native
    
    /**
      * @type {boolean|import("../layer/BaseVector").default}
      */
    var hitDetection_ : Boolean | (typings.ol.layerBaseVectorMod.default[Any, Any]) = js.native
    
    /**
      * Tracks if the next `singleclick` event should be ignored to prevent
      * accidental deletion right after vertex creation.
      * @type {boolean}
      * @private
      */
    /* private */ var ignoreNextSingleClick_ : Any = js.native
    
    /**
      * @type {import("../events/condition.js").Condition}
      * @private
      */
    /* private */ var insertVertexCondition_ : Any = js.native
    
    /**
      * @param {SegmentData} segmentData Segment data.
      * @param {import("../coordinate.js").Coordinate} vertex Vertex.
      * @private
      */
    /* private */ var insertVertex_ : Any = js.native
    
    /**
      * @type {import("../pixel.js").Pixel}
      * @private
      */
    /* private */ var lastPixel_ : Any = js.native
    
    /**
      * @type {import("../MapBrowserEvent.js").default}
      * @private
      */
    /* private */ var lastPointerEvent_ : Any = js.native
    
    /***
      * @type {ModifyOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_Modify: ModifyOnSignature[EventsKey] = js.native
    
    /***
      * @type {ModifyOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_Modify: ModifyOnSignature[EventsKey] = js.native
    
    /**
      * Draw overlay where sketch features are drawn.
      * @type {VectorLayer}
      * @private
      */
    /* private */ var overlay_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var pixelTolerance_ : Any = js.native
    
    /**
      * Segment RTree for each layer
      * @type {RBush<SegmentData>}
      * @private
      */
    /* private */ var rBush_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature.
      * @private
      */
    /* private */ var removeFeatureSegmentData_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature.
      * @private
      */
    /* private */ var removeFeature_ : Any = js.native
    
    /**
      * Removes the vertex currently being pointed.
      * @return {boolean} True when a vertex was removed.
      * @api
      */
    def removePoint(): Boolean = js.native
    
    /**
      * Removes a vertex from all matching features.
      * @return {boolean} True when a vertex was removed.
      * @private
      */
    /* private */ var removeVertex_ : Any = js.native
    
    /**
      * @param {import("../geom/SimpleGeometry.js").default} geometry Geometry.
      * @param {Array} coordinates Coordinates.
      * @private
      */
    /* private */ var setGeometryCoordinates_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var snapToPointer_ : Any = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var snappedToVertex_ : Any = js.native
    
    /**
      * @type {VectorSource}
      * @private
      */
    /* private */ var source_ : Any = js.native
    
    /***
      * @type {ModifyOnSignature<void>}
      */
    @JSName("un")
    var un_Modify: ModifyOnSignature[Unit] = js.native
    
    /**
      * @param {import("../geom/SimpleGeometry.js").default} geometry Geometry.
      * @param {number} index Index.
      * @param {Array<number>|undefined} depth Depth.
      * @param {number} delta Delta (1 or -1).
      * @private
      */
    /* private */ var updateSegmentIndices_ : Any = js.native
    
    /**
      * Editing vertex.
      * @type {Feature<Point>}
      * @private
      */
    /* private */ var vertexFeature_ : Any = js.native
    
    /**
      * Segments intersecting {@link this.vertexFeature_} by segment uid.
      * @type {Object<string, boolean>}
      * @private
      */
    /* private */ var vertexSegments_ : Any = js.native
    
    /**
      * @param {import("../MapBrowserEvent.js").default} evt Map browser event.
      * @param {Array<Array<SegmentData>>} segments The segments subject to modification.
      * @private
      */
    /* private */ var willModifyFeatures_ : Any = js.native
    
    /**
      * We convert a circle into two segments.  The segment at index
      * {@link CIRCLE_CENTER_INDEX} is the
      * circle's center (a point).  The segment at index
      * {@link CIRCLE_CIRCUMFERENCE_INDEX} is
      * the circumference, and is not a line segment.
      *
      * @param {Feature} feature Feature.
      * @param {import("../geom/Circle.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeCircleGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/GeometryCollection.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeGeometryCollectionGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/LineString.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeLineStringGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/MultiLineString.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeMultiLineStringGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/MultiPoint.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeMultiPointGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/MultiPolygon.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writeMultiPolygonGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {Point} geometry Geometry.
      * @private
      */
    /* private */ var writePointGeometry_ : Any = js.native
    
    /**
      * @param {Feature} feature Feature
      * @param {import("../geom/Polygon.js").default} geometry Geometry.
      * @private
      */
    /* private */ var writePolygonGeometry_ : Any = js.native
  }
  
  type ModifyEventType = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ModifyOnSignature[Return]
    extends OnSignature[
          changeColonactive | modifyend | modifystart | EventTypes | Types, 
          ModifyEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * A function that
      * takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event will be considered to add or move a
      * vertex to the sketch. Default is
      * {@link module :ol/events/condition.primaryAction}.
      */
    var condition: js.UndefOr[Condition] = js.undefined
    
    /**
      * A function
      * that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and returns a
      * boolean to indicate whether that event should be handled. By default,
      * {@link module :ol/events/condition.singleClick} with
      * {@link module :ol/events/condition.altKeyOnly} results in a vertex deletion.
      */
    var deleteCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * The features the interaction works on.  If a feature collection is not
      * provided, a vector source must be provided with the `source` option.
      */
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]
      ] = js.undefined
    
    /**
      * When configured, point
      * features will be considered for modification based on their visual appearance, instead of being within
      * the `pixelTolerance` from the pointer location. When a {@link module :ol/layer/BaseVector~BaseVectorLayer} is
      * provided, only the rendered representation of the features on that layer will be considered.
      */
    var hitDetection: js.UndefOr[Boolean | (typings.ol.layerBaseVectorMod.default[Any, Any])] = js.undefined
    
    /**
      * A
      * function that takes an {@link module :ol/MapBrowserEvent~MapBrowserEvent} and
      * returns a boolean to indicate whether a new vertex should be added to the sketch
      * features. Default is {@link module :ol/events/condition.always}.
      */
    var insertVertexCondition: js.UndefOr[Condition] = js.undefined
    
    /**
      * Pixel tolerance for considering the
      * pointer close enough to a segment or vertex for editing.
      */
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * The vertex, point or segment being modified snaps to the
      * pointer coordinate when clicked within the `pixelTolerance`.
      */
    var snapToPointer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The vector source with
      * features to modify.  If a vector source is not provided, a feature collection
      * must be provided with the `features` option.
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * Style used for the modification point or vertex. For linestrings and polygons, this will
      * be the affected vertex, for circles a point along the circle, and for points the actual
      * point. If not configured, the default edit style is used (see {@link module :ol/style/Style~Style}).
      * When using a style function, the point feature passed to the function will have a `features`
      * property - an array whose entries are the features that are being modified, and a `geometries`
      * property - an array whose entries are the geometries that are being modified. Both arrays are
      * in the same order. The `geometries` are only useful when modifying geometry collections, where
      * the geometry will be the particular geometry from the collection that is being modified.
      */
    var style: js.UndefOr[StyleLike | FlatStyleLike] = js.undefined
    
    /**
      * Wrap the world horizontally on the sketch
      * overlay.
      */
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
      
      inline def setHitDetection(value: Boolean | (typings.ol.layerBaseVectorMod.default[Any, Any])): Self = StObject.set(x, "hitDetection", value.asInstanceOf[js.Any])
      
      inline def setHitDetectionUndefined: Self = StObject.set(x, "hitDetection", js.undefined)
      
      inline def setInsertVertexCondition(value: Condition): Self = StObject.set(x, "insertVertexCondition", value.asInstanceOf[js.Any])
      
      inline def setInsertVertexConditionUndefined: Self = StObject.set(x, "insertVertexCondition", js.undefined)
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setSnapToPointer(value: Boolean): Self = StObject.set(x, "snapToPointer", value.asInstanceOf[js.Any])
      
      inline def setSnapToPointerUndefined: Self = StObject.set(x, "snapToPointer", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStyle(value: StyleLike | FlatStyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* arg0 */ FeatureLike, /* arg1 */ Double) => Style | js.Array[Style] | Unit): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: (FlatStyle | Style)*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
    }
  }
  
  trait SegmentData extends StObject {
    
    /**
      * Depth.
      */
    var depth: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Feature.
      */
    var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
    
    /**
      * FeatureSegments.
      */
    var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.undefined
    
    /**
      * Geometry.
      */
    var geometry: typings.ol.geomSimpleGeometryMod.default
    
    /**
      * Index.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Segment.
      */
    var segment: js.Array[js.Array[Double]]
  }
  object SegmentData {
    
    inline def apply(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      geometry: typings.ol.geomSimpleGeometryMod.default,
      segment: js.Array[js.Array[Double]]
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
      
      inline def setSegment(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentVarargs(value: js.Array[Double]*): Self = StObject.set(x, "segment", js.Array(value*))
    }
  }
}
