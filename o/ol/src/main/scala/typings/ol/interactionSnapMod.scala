package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionSnapMod {
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link module:ol/source/Vector~VectorSource} or {@link module:ol/Collection~Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     import Snap from 'ol/interaction/Snap.js';
    *
    *     const snap = new Snap({
    *       source: source
    *     });
    *
    *     map.addInteraction(snap);
    *
    * @api
    */
  @JSImport("ol/interaction/Snap", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Snap {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Snap to edges.
      */
    var edge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Snap to these features. Either this option or source should be provided.
      */
    var features: js.UndefOr[typings.ol.collectionMod.default[typings.ol.renderFeatureMod.default]] = js.undefined
    
    /**
      * Pixel tolerance for considering the pointer close enough to a segment or
      * vertex for snapping.
      */
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * Snap to features from this source. Either this option or features should be provided
      */
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
    
    /**
      * Snap to vertices.
      */
    var vertex: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setFeatures(value: typings.ol.collectionMod.default[typings.ol.renderFeatureMod.default]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVertex(value: Boolean): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    /**
      * Vertex.
      */
    var vertex: Coordinate | Null
    
    /**
      * VertexPixel.
      */
    var vertexPixel: Pixel | Null
  }
  object Result {
    
    inline def apply(): Result = {
      val __obj = js.Dynamic.literal(vertex = null, vertexPixel = null)
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setVertex(value: Coordinate): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      inline def setVertexNull: Self = StObject.set(x, "vertex", null)
      
      inline def setVertexPixel(value: Pixel): Self = StObject.set(x, "vertexPixel", value.asInstanceOf[js.Any])
      
      inline def setVertexPixelNull: Self = StObject.set(x, "vertexPixel", null)
      
      inline def setVertexPixelVarargs(value: Double*): Self = StObject.set(x, "vertexPixel", js.Array(value*))
      
      inline def setVertexVarargs(value: Double*): Self = StObject.set(x, "vertex", js.Array(value*))
    }
  }
  
  trait SegmentData extends StObject {
    
    /**
      * Feature.
      */
    var feature: typings.ol.renderFeatureMod.default
    
    /**
      * Segment.
      */
    var segment: js.Array[Coordinate]
  }
  object SegmentData {
    
    inline def apply(feature: typings.ol.renderFeatureMod.default, segment: js.Array[Coordinate]): SegmentData = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentData] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: js.Array[Coordinate]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentVarargs(value: Coordinate*): Self = StObject.set(x, "segment", js.Array(value*))
    }
  }
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link module:ol/source/Vector~VectorSource} or {@link module:ol/Collection~Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     import Snap from 'ol/interaction/Snap.js';
    *
    *     const snap = new Snap({
    *       source: source
    *     });
    *
    *     map.addInteraction(snap);
    *
    * @api
    */
  @js.native
  trait Snap
    extends typings.ol.interactionPointerMod.default {
    
    /**
      * @const
      * @private
      * @type {Object<string, function(Array<Array<import('../coordinate.js').Coordinate>>, import("../geom/Geometry.js").default): void>}
      */
    /* private */ var GEOMETRY_SEGMENTERS_ : Any = js.native
    
    /**
      * Add a feature to the collection of features that we may snap to.
      * @param {import("../Feature.js").default} feature Feature.
      * @param {boolean} [register] Whether to listen to the feature change or not
      *     Defaults to `true`.
      * @api
      */
    def addFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    def addFeature(feature: typings.ol.renderFeatureMod.default, register: Boolean): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var edge_ : Any = js.native
    
    /**
      * @type {Object<string, import("../events.js").EventsKey>}
      * @private
      */
    /* private */ var featureChangeListenerKeys_ : Any = js.native
    
    /**
      * @type {Array<import("../events.js").EventsKey>}
      * @private
      */
    /* private */ var featuresListenerKeys_ : Any = js.native
    
    /**
      * @type {import("../Collection.js").default<import("../Feature.js").default>|null}
      * @private
      */
    /* private */ var features_ : Any = js.native
    
    /**
      * @return {import("../Collection.js").default<import("../Feature.js").default>|Array<import("../Feature.js").default>} Features.
      * @private
      */
    /* private */ var getFeatures_ : Any = js.native
    
    /**
      * @param {import("../source/Vector.js").VectorSourceEvent|import("../Collection.js").CollectionEvent<import("../Feature.js").default>} evt Event.
      * @private
      */
    /* private */ var handleFeatureAdd_ : Any = js.native
    
    /**
      * @param {import("../events/Event.js").default} evt Event.
      * @private
      */
    /* private */ var handleFeatureChange_ : Any = js.native
    
    /**
      * @param {import("../source/Vector.js").VectorSourceEvent|import("../Collection.js").CollectionEvent<import("../Feature.js").default>} evt Event.
      * @private
      */
    /* private */ var handleFeatureRemove_ : Any = js.native
    
    /**
      * Extents are preserved so indexed segment can be quickly removed
      * when its feature geometry changes
      * @type {Object<string, import("../extent.js").Extent>}
      * @private
      */
    /* private */ var indexedFeaturesExtents_ : Any = js.native
    
    /**
      * If a feature geometry changes while a pointer drag|move event occurs, the
      * feature doesn't get updated right away.  It will be at the next 'pointerup'
      * event fired.
      * @type {!Object<string, import("../Feature.js").default>}
      * @private
      */
    /* private */ var pendingFeatures_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var pixelTolerance_ : Any = js.native
    
    /**
      * Segment RTree for each layer
      * @type {import("../structs/RBush.js").default<SegmentData>}
      * @private
      */
    /* private */ var rBush_ : Any = js.native
    
    /**
      * Remove a feature from the collection of features that we may snap to.
      * @param {import("../Feature.js").default} feature Feature
      * @param {boolean} [unlisten] Whether to unlisten to the feature change
      *     or not. Defaults to `true`.
      * @api
      */
    def removeFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    def removeFeature(feature: typings.ol.renderFeatureMod.default, unlisten: Boolean): Unit = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/Circle.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentCircleGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/GeometryCollection.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentGeometryCollectionGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/LineString.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentLineStringGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/MultiLineString.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentMultiLineStringGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/MultiPoint.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentMultiPointGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/MultiPolygon.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentMultiPolygonGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/Point.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentPointGeometry_ : Any = js.native
    
    /**
      * @param {Array<Array<import('../coordinate.js').Coordinate>>} segments Segments
      * @param {import("../geom/Polygon.js").default} geometry Geometry.
      * @private
      */
    /* private */ var segmentPolygonGeometry_ : Any = js.native
    
    /**
      * @param {import("../pixel.js").Pixel} pixel Pixel
      * @param {import("../coordinate.js").Coordinate} pixelCoordinate Coordinate
      * @param {import("../Map.js").default} map Map.
      * @return {Result|null} Snap result
      */
    def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typings.ol.rendererMapMod.default): Result | Null = js.native
    
    /**
      * @type {import("../source/Vector.js").default|null}
      * @private
      */
    /* private */ var source_ : Any = js.native
    
    /**
      * @param {import("../Feature.js").default} feature Feature
      * @private
      */
    /* private */ var updateFeature_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var vertex_ : Any = js.native
  }
}
