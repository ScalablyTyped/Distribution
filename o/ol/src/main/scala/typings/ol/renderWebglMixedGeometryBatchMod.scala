package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.transformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderWebglMixedGeometryBatchMod {
  
  /**
    * @typedef {Object} GeometryBatchItem Object that holds a reference to a feature as well as the raw coordinates of its various geometries
    * @property {import("../../Feature").default} feature Feature
    * @property {Array<Array<number>>} flatCoordss Array of flat coordinates arrays, one for each geometry related to the feature
    * @property {number} [verticesCount] Only defined for linestring and polygon batches
    * @property {number} [ringsCount] Only defined for polygon batches
    * @property {Array<Array<number>>} [ringsVerticesCounts] Array of vertices counts in each ring for each geometry; only defined for polygons batches
    */
  /**
    * @typedef {PointGeometryBatch|LineStringGeometryBatch|PolygonGeometryBatch} GeometryBatch
    */
  /**
    * @typedef {Object} PolygonGeometryBatch A geometry batch specific to polygons
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    * @property {number} verticesCount Amount of vertices from geometries in the batch.
    * @property {number} ringsCount How many outer and inner rings in this batch.
    */
  /**
    * @typedef {Object} LineStringGeometryBatch A geometry batch specific to lines
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    * @property {number} verticesCount Amount of vertices from geometries in the batch.
    */
  /**
    * @typedef {Object} PointGeometryBatch A geometry batch specific to points
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    */
  /**
    * @classdesc This class is used to group several geometries of various types together for faster rendering.
    * Three inner batches are maintained for polygons, lines and points. Each time a feature is added, changed or removed
    * from the batch, these inner batches are modified accordingly in order to keep them up-to-date.
    *
    * A feature can be present in several inner batches, for example a polygon geometry will be present in the polygon batch
    * and its linar rings will be present in the line batch. Multi geometries are also broken down into individual geometries
    * and added to the corresponding batches in a recursive manner.
    *
    * Corresponding {@link module:ol/render/webgl/BatchRenderer} instances are then used to generate the render instructions
    * and WebGL buffers (vertices and indices) for each inner batches; render instructions are stored on the inner batches,
    * alongside the transform used to convert world coords to screen coords at the time these instructions were generated.
    * The resulting WebGL buffers are stored on the batches as well.
    *
    * An important aspect of geometry batches is that there is no guarantee that render instructions and WebGL buffers
    * are synchronized, i.e. render instructions can describe a new state while WebGL buffers might not have been written yet.
    * This is why two world-to-screen transforms are stored on each batch: one for the render instructions and one for
    * the WebGL buffers.
    */
  @JSImport("ol/render/webgl/MixedGeometryBatch", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MixedGeometryBatch {
    
    /**
      * @param {import("../../Feature").default} feature Feature to add to the batch
      */
    /* CompleteClass */
    override def addFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ /* CompleteClass */
    var addFeatureEntryInLineStringBatch_ : Any = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ /* CompleteClass */
    var addFeatureEntryInPointBatch_ : Any = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ /* CompleteClass */
    var addFeatureEntryInPolygonBatch_ : Any = js.native
    
    /**
      * @param {Array<import("../../Feature").default>} features Array of features to add to the batch
      */
    /* CompleteClass */
    override def addFeatures(features: js.Array[typings.ol.renderFeatureMod.default]): Unit = js.native
    
    /**
      * @param {import("../../geom").Geometry} geometry Geometry
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ /* CompleteClass */
    var addGeometry_ : Any = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      */
    /* CompleteClass */
    override def changeFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ /* CompleteClass */
    var clearFeatureEntryInLineStringBatch_ : Any = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ /* CompleteClass */
    var clearFeatureEntryInPointBatch_ : Any = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ /* CompleteClass */
    var clearFeatureEntryInPolygonBatch_ : Any = js.native
    
    /**
      * @type {LineStringGeometryBatch}
      */
    /* CompleteClass */
    var lineStringBatch: LineStringGeometryBatch = js.native
    
    /**
      * @type {PointGeometryBatch}
      */
    /* CompleteClass */
    var pointBatch: PointGeometryBatch = js.native
    
    /**
      * @type {PolygonGeometryBatch}
      */
    /* CompleteClass */
    var polygonBatch: PolygonGeometryBatch = js.native
    
    /**
      * @param {import("../../Feature").default} feature Feature
      */
    /* CompleteClass */
    override def removeFeature(feature: typings.ol.renderFeatureMod.default): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.renderWebglMixedGeometryBatchMod.PointGeometryBatch
    - typings.ol.renderWebglMixedGeometryBatchMod.LineStringGeometryBatch
    - typings.ol.renderWebglMixedGeometryBatchMod.PolygonGeometryBatch
  */
  trait GeometryBatch extends StObject
  object GeometryBatch {
    
    inline def LineStringGeometryBatch(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform,
      verticesCount: Double
    ): typings.ol.renderWebglMixedGeometryBatchMod.LineStringGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any], verticesCount = verticesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ol.renderWebglMixedGeometryBatchMod.LineStringGeometryBatch]
    }
    
    inline def PointGeometryBatch(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform
    ): typings.ol.renderWebglMixedGeometryBatchMod.PointGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ol.renderWebglMixedGeometryBatchMod.PointGeometryBatch]
    }
    
    inline def PolygonGeometryBatch(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      ringsCount: Double,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform,
      verticesCount: Double
    ): typings.ol.renderWebglMixedGeometryBatchMod.PolygonGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], ringsCount = ringsCount.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any], verticesCount = verticesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ol.renderWebglMixedGeometryBatchMod.PolygonGeometryBatch]
    }
  }
  
  trait GeometryBatchItem extends StObject {
    
    /**
      * Feature
      */
    var feature: typings.ol.renderFeatureMod.default
    
    /**
      * Array of flat coordinates arrays, one for each geometry related to the feature
      */
    var flatCoordss: js.Array[js.Array[Double]]
    
    /**
      * Only defined for polygon batches
      */
    var ringsCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of vertices counts in each ring for each geometry; only defined for polygons batches
      */
    var ringsVerticesCounts: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    /**
      * Only defined for linestring and polygon batches
      */
    var verticesCount: js.UndefOr[Double] = js.undefined
  }
  object GeometryBatchItem {
    
    inline def apply(feature: typings.ol.renderFeatureMod.default, flatCoordss: js.Array[js.Array[Double]]): GeometryBatchItem = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], flatCoordss = flatCoordss.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryBatchItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeometryBatchItem] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: typings.ol.renderFeatureMod.default): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFlatCoordss(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "flatCoordss", value.asInstanceOf[js.Any])
      
      inline def setFlatCoordssVarargs(value: js.Array[Double]*): Self = StObject.set(x, "flatCoordss", js.Array(value*))
      
      inline def setRingsCount(value: Double): Self = StObject.set(x, "ringsCount", value.asInstanceOf[js.Any])
      
      inline def setRingsCountUndefined: Self = StObject.set(x, "ringsCount", js.undefined)
      
      inline def setRingsVerticesCounts(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "ringsVerticesCounts", value.asInstanceOf[js.Any])
      
      inline def setRingsVerticesCountsUndefined: Self = StObject.set(x, "ringsVerticesCounts", js.undefined)
      
      inline def setRingsVerticesCountsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "ringsVerticesCounts", js.Array(value*))
      
      inline def setVerticesCount(value: Double): Self = StObject.set(x, "verticesCount", value.asInstanceOf[js.Any])
      
      inline def setVerticesCountUndefined: Self = StObject.set(x, "verticesCount", js.undefined)
    }
  }
  
  trait LineStringGeometryBatch
    extends StObject
       with GeometryBatch {
    
    /**
      * Dictionary of all entries in the batch with associated computed values.
      * One entry corresponds to one feature. Key is feature uid.
      */
    var entries: StringDictionary[GeometryBatchItem]
    
    /**
      * Amount of geometries in the batch.
      */
    var geometriesCount: Double
    
    /**
      * Indices WebGL buffer
      */
    var indicesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Screen space to world space; applies to the webgl vertices buffer
      */
    var invertVerticesBufferTransform: Transform
    
    /**
      * Render instructions for polygons are structured like so:
      * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
      */
    var renderInstructions: js.typedarray.Float32Array
    
    /**
      * Converts world space coordinates to screen space; applies to the rendering instructions
      */
    var renderInstructionsTransform: Transform
    
    /**
      * Vertices WebGL buffer
      */
    var verticesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Converts world space coordinates to screen space; applies to the webgl vertices buffer
      */
    var verticesBufferTransform: Transform
    
    /**
      * Amount of vertices from geometries in the batch.
      */
    var verticesCount: Double
  }
  object LineStringGeometryBatch {
    
    inline def apply(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform,
      verticesCount: Double
    ): LineStringGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any], verticesCount = verticesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineStringGeometryBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineStringGeometryBatch] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: StringDictionary[GeometryBatchItem]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesCount(value: Double): Self = StObject.set(x, "geometriesCount", value.asInstanceOf[js.Any])
      
      inline def setIndicesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransform(value: Transform): Self = StObject.set(x, "invertVerticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "invertVerticesBufferTransform", js.Array(value*))
      
      inline def setRenderInstructions(value: js.typedarray.Float32Array): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransform(value: Transform): Self = StObject.set(x, "renderInstructionsTransform", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransformVarargs(value: Double*): Self = StObject.set(x, "renderInstructionsTransform", js.Array(value*))
      
      inline def setVerticesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransform(value: Transform): Self = StObject.set(x, "verticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "verticesBufferTransform", js.Array(value*))
      
      inline def setVerticesCount(value: Double): Self = StObject.set(x, "verticesCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {Object} GeometryBatchItem Object that holds a reference to a feature as well as the raw coordinates of its various geometries
    * @property {import("../../Feature").default} feature Feature
    * @property {Array<Array<number>>} flatCoordss Array of flat coordinates arrays, one for each geometry related to the feature
    * @property {number} [verticesCount] Only defined for linestring and polygon batches
    * @property {number} [ringsCount] Only defined for polygon batches
    * @property {Array<Array<number>>} [ringsVerticesCounts] Array of vertices counts in each ring for each geometry; only defined for polygons batches
    */
  /**
    * @typedef {PointGeometryBatch|LineStringGeometryBatch|PolygonGeometryBatch} GeometryBatch
    */
  /**
    * @typedef {Object} PolygonGeometryBatch A geometry batch specific to polygons
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    * @property {number} verticesCount Amount of vertices from geometries in the batch.
    * @property {number} ringsCount How many outer and inner rings in this batch.
    */
  /**
    * @typedef {Object} LineStringGeometryBatch A geometry batch specific to lines
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    * @property {number} verticesCount Amount of vertices from geometries in the batch.
    */
  /**
    * @typedef {Object} PointGeometryBatch A geometry batch specific to points
    * @property {Object<string, GeometryBatchItem>} entries Dictionary of all entries in the batch with associated computed values.
    * One entry corresponds to one feature. Key is feature uid.
    * @property {number} geometriesCount Amount of geometries in the batch.
    * @property {Float32Array} renderInstructions Render instructions for polygons are structured like so:
    * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
    * @property {WebGLArrayBuffer} verticesBuffer Vertices WebGL buffer
    * @property {WebGLArrayBuffer} indicesBuffer Indices WebGL buffer
    * @property {import("../../transform.js").Transform} renderInstructionsTransform Converts world space coordinates to screen space; applies to the rendering instructions
    * @property {import("../../transform.js").Transform} verticesBufferTransform Converts world space coordinates to screen space; applies to the webgl vertices buffer
    * @property {import("../../transform.js").Transform} invertVerticesBufferTransform Screen space to world space; applies to the webgl vertices buffer
    */
  /**
    * @classdesc This class is used to group several geometries of various types together for faster rendering.
    * Three inner batches are maintained for polygons, lines and points. Each time a feature is added, changed or removed
    * from the batch, these inner batches are modified accordingly in order to keep them up-to-date.
    *
    * A feature can be present in several inner batches, for example a polygon geometry will be present in the polygon batch
    * and its linar rings will be present in the line batch. Multi geometries are also broken down into individual geometries
    * and added to the corresponding batches in a recursive manner.
    *
    * Corresponding {@link module:ol/render/webgl/BatchRenderer} instances are then used to generate the render instructions
    * and WebGL buffers (vertices and indices) for each inner batches; render instructions are stored on the inner batches,
    * alongside the transform used to convert world coords to screen coords at the time these instructions were generated.
    * The resulting WebGL buffers are stored on the batches as well.
    *
    * An important aspect of geometry batches is that there is no guarantee that render instructions and WebGL buffers
    * are synchronized, i.e. render instructions can describe a new state while WebGL buffers might not have been written yet.
    * This is why two world-to-screen transforms are stored on each batch: one for the render instructions and one for
    * the WebGL buffers.
    */
  trait MixedGeometryBatch extends StObject {
    
    /**
      * @param {import("../../Feature").default} feature Feature to add to the batch
      */
    def addFeature(feature: typings.ol.renderFeatureMod.default): Unit
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ var addFeatureEntryInLineStringBatch_ : Any
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ var addFeatureEntryInPointBatch_ : Any
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @return {GeometryBatchItem} Batch item added (or existing one)
      * @private
      */
    /* private */ var addFeatureEntryInPolygonBatch_ : Any
    
    /**
      * @param {Array<import("../../Feature").default>} features Array of features to add to the batch
      */
    def addFeatures(features: js.Array[typings.ol.renderFeatureMod.default]): Unit
    
    /**
      * @param {import("../../geom").Geometry} geometry Geometry
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ var addGeometry_ : Any
    
    /**
      * @param {import("../../Feature").default} feature Feature
      */
    def changeFeature(feature: typings.ol.renderFeatureMod.default): Unit
    
    def clear(): Unit
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ var clearFeatureEntryInLineStringBatch_ : Any
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ var clearFeatureEntryInPointBatch_ : Any
    
    /**
      * @param {import("../../Feature").default} feature Feature
      * @private
      */
    /* private */ var clearFeatureEntryInPolygonBatch_ : Any
    
    /**
      * @type {LineStringGeometryBatch}
      */
    var lineStringBatch: LineStringGeometryBatch
    
    /**
      * @type {PointGeometryBatch}
      */
    var pointBatch: PointGeometryBatch
    
    /**
      * @type {PolygonGeometryBatch}
      */
    var polygonBatch: PolygonGeometryBatch
    
    /**
      * @param {import("../../Feature").default} feature Feature
      */
    def removeFeature(feature: typings.ol.renderFeatureMod.default): Unit
  }
  object MixedGeometryBatch {
    
    inline def apply(
      addFeature: typings.ol.renderFeatureMod.default => Unit,
      addFeatureEntryInLineStringBatch_ : Any,
      addFeatureEntryInPointBatch_ : Any,
      addFeatureEntryInPolygonBatch_ : Any,
      addFeatures: js.Array[typings.ol.renderFeatureMod.default] => Unit,
      addGeometry_ : Any,
      changeFeature: typings.ol.renderFeatureMod.default => Unit,
      clear: () => Unit,
      clearFeatureEntryInLineStringBatch_ : Any,
      clearFeatureEntryInPointBatch_ : Any,
      clearFeatureEntryInPolygonBatch_ : Any,
      lineStringBatch: LineStringGeometryBatch,
      pointBatch: PointGeometryBatch,
      polygonBatch: PolygonGeometryBatch,
      removeFeature: typings.ol.renderFeatureMod.default => Unit
    ): MixedGeometryBatch = {
      val __obj = js.Dynamic.literal(addFeature = js.Any.fromFunction1(addFeature), addFeatureEntryInLineStringBatch_ = addFeatureEntryInLineStringBatch_.asInstanceOf[js.Any], addFeatureEntryInPointBatch_ = addFeatureEntryInPointBatch_.asInstanceOf[js.Any], addFeatureEntryInPolygonBatch_ = addFeatureEntryInPolygonBatch_.asInstanceOf[js.Any], addFeatures = js.Any.fromFunction1(addFeatures), addGeometry_ = addGeometry_.asInstanceOf[js.Any], changeFeature = js.Any.fromFunction1(changeFeature), clear = js.Any.fromFunction0(clear), clearFeatureEntryInLineStringBatch_ = clearFeatureEntryInLineStringBatch_.asInstanceOf[js.Any], clearFeatureEntryInPointBatch_ = clearFeatureEntryInPointBatch_.asInstanceOf[js.Any], clearFeatureEntryInPolygonBatch_ = clearFeatureEntryInPolygonBatch_.asInstanceOf[js.Any], lineStringBatch = lineStringBatch.asInstanceOf[js.Any], pointBatch = pointBatch.asInstanceOf[js.Any], polygonBatch = polygonBatch.asInstanceOf[js.Any], removeFeature = js.Any.fromFunction1(removeFeature))
      __obj.asInstanceOf[MixedGeometryBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MixedGeometryBatch] (val x: Self) extends AnyVal {
      
      inline def setAddFeature(value: typings.ol.renderFeatureMod.default => Unit): Self = StObject.set(x, "addFeature", js.Any.fromFunction1(value))
      
      inline def setAddFeatureEntryInLineStringBatch_(value: Any): Self = StObject.set(x, "addFeatureEntryInLineStringBatch_", value.asInstanceOf[js.Any])
      
      inline def setAddFeatureEntryInPointBatch_(value: Any): Self = StObject.set(x, "addFeatureEntryInPointBatch_", value.asInstanceOf[js.Any])
      
      inline def setAddFeatureEntryInPolygonBatch_(value: Any): Self = StObject.set(x, "addFeatureEntryInPolygonBatch_", value.asInstanceOf[js.Any])
      
      inline def setAddFeatures(value: js.Array[typings.ol.renderFeatureMod.default] => Unit): Self = StObject.set(x, "addFeatures", js.Any.fromFunction1(value))
      
      inline def setAddGeometry_(value: Any): Self = StObject.set(x, "addGeometry_", value.asInstanceOf[js.Any])
      
      inline def setChangeFeature(value: typings.ol.renderFeatureMod.default => Unit): Self = StObject.set(x, "changeFeature", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearFeatureEntryInLineStringBatch_(value: Any): Self = StObject.set(x, "clearFeatureEntryInLineStringBatch_", value.asInstanceOf[js.Any])
      
      inline def setClearFeatureEntryInPointBatch_(value: Any): Self = StObject.set(x, "clearFeatureEntryInPointBatch_", value.asInstanceOf[js.Any])
      
      inline def setClearFeatureEntryInPolygonBatch_(value: Any): Self = StObject.set(x, "clearFeatureEntryInPolygonBatch_", value.asInstanceOf[js.Any])
      
      inline def setLineStringBatch(value: LineStringGeometryBatch): Self = StObject.set(x, "lineStringBatch", value.asInstanceOf[js.Any])
      
      inline def setPointBatch(value: PointGeometryBatch): Self = StObject.set(x, "pointBatch", value.asInstanceOf[js.Any])
      
      inline def setPolygonBatch(value: PolygonGeometryBatch): Self = StObject.set(x, "polygonBatch", value.asInstanceOf[js.Any])
      
      inline def setRemoveFeature(value: typings.ol.renderFeatureMod.default => Unit): Self = StObject.set(x, "removeFeature", js.Any.fromFunction1(value))
    }
  }
  
  trait PointGeometryBatch
    extends StObject
       with GeometryBatch {
    
    /**
      * Dictionary of all entries in the batch with associated computed values.
      * One entry corresponds to one feature. Key is feature uid.
      */
    var entries: StringDictionary[GeometryBatchItem]
    
    /**
      * Amount of geometries in the batch.
      */
    var geometriesCount: Double
    
    /**
      * Indices WebGL buffer
      */
    var indicesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Screen space to world space; applies to the webgl vertices buffer
      */
    var invertVerticesBufferTransform: Transform
    
    /**
      * Render instructions for polygons are structured like so:
      * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
      */
    var renderInstructions: js.typedarray.Float32Array
    
    /**
      * Converts world space coordinates to screen space; applies to the rendering instructions
      */
    var renderInstructionsTransform: Transform
    
    /**
      * Vertices WebGL buffer
      */
    var verticesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Converts world space coordinates to screen space; applies to the webgl vertices buffer
      */
    var verticesBufferTransform: Transform
  }
  object PointGeometryBatch {
    
    inline def apply(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform
    ): PointGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointGeometryBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointGeometryBatch] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: StringDictionary[GeometryBatchItem]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesCount(value: Double): Self = StObject.set(x, "geometriesCount", value.asInstanceOf[js.Any])
      
      inline def setIndicesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransform(value: Transform): Self = StObject.set(x, "invertVerticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "invertVerticesBufferTransform", js.Array(value*))
      
      inline def setRenderInstructions(value: js.typedarray.Float32Array): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransform(value: Transform): Self = StObject.set(x, "renderInstructionsTransform", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransformVarargs(value: Double*): Self = StObject.set(x, "renderInstructionsTransform", js.Array(value*))
      
      inline def setVerticesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransform(value: Transform): Self = StObject.set(x, "verticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "verticesBufferTransform", js.Array(value*))
    }
  }
  
  trait PolygonGeometryBatch
    extends StObject
       with GeometryBatch {
    
    /**
      * Dictionary of all entries in the batch with associated computed values.
      * One entry corresponds to one feature. Key is feature uid.
      */
    var entries: StringDictionary[GeometryBatchItem]
    
    /**
      * Amount of geometries in the batch.
      */
    var geometriesCount: Double
    
    /**
      * Indices WebGL buffer
      */
    var indicesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Screen space to world space; applies to the webgl vertices buffer
      */
    var invertVerticesBufferTransform: Transform
    
    /**
      * Render instructions for polygons are structured like so:
      * [ numberOfRings, numberOfVerticesInRing0, ..., numberOfVerticesInRingN, x0, y0, customAttr0, ..., xN, yN, customAttrN, numberOfRings,... ]
      */
    var renderInstructions: js.typedarray.Float32Array
    
    /**
      * Converts world space coordinates to screen space; applies to the rendering instructions
      */
    var renderInstructionsTransform: Transform
    
    /**
      * How many outer and inner rings in this batch.
      */
    var ringsCount: Double
    
    /**
      * Vertices WebGL buffer
      */
    var verticesBuffer: typings.ol.webglBufferMod.default
    
    /**
      * Converts world space coordinates to screen space; applies to the webgl vertices buffer
      */
    var verticesBufferTransform: Transform
    
    /**
      * Amount of vertices from geometries in the batch.
      */
    var verticesCount: Double
  }
  object PolygonGeometryBatch {
    
    inline def apply(
      entries: StringDictionary[GeometryBatchItem],
      geometriesCount: Double,
      indicesBuffer: typings.ol.webglBufferMod.default,
      invertVerticesBufferTransform: Transform,
      renderInstructions: js.typedarray.Float32Array,
      renderInstructionsTransform: Transform,
      ringsCount: Double,
      verticesBuffer: typings.ol.webglBufferMod.default,
      verticesBufferTransform: Transform,
      verticesCount: Double
    ): PolygonGeometryBatch = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], geometriesCount = geometriesCount.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], invertVerticesBufferTransform = invertVerticesBufferTransform.asInstanceOf[js.Any], renderInstructions = renderInstructions.asInstanceOf[js.Any], renderInstructionsTransform = renderInstructionsTransform.asInstanceOf[js.Any], ringsCount = ringsCount.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesBufferTransform = verticesBufferTransform.asInstanceOf[js.Any], verticesCount = verticesCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolygonGeometryBatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolygonGeometryBatch] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: StringDictionary[GeometryBatchItem]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesCount(value: Double): Self = StObject.set(x, "geometriesCount", value.asInstanceOf[js.Any])
      
      inline def setIndicesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransform(value: Transform): Self = StObject.set(x, "invertVerticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setInvertVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "invertVerticesBufferTransform", js.Array(value*))
      
      inline def setRenderInstructions(value: js.typedarray.Float32Array): Self = StObject.set(x, "renderInstructions", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransform(value: Transform): Self = StObject.set(x, "renderInstructionsTransform", value.asInstanceOf[js.Any])
      
      inline def setRenderInstructionsTransformVarargs(value: Double*): Self = StObject.set(x, "renderInstructionsTransform", js.Array(value*))
      
      inline def setRingsCount(value: Double): Self = StObject.set(x, "ringsCount", value.asInstanceOf[js.Any])
      
      inline def setVerticesBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransform(value: Transform): Self = StObject.set(x, "verticesBufferTransform", value.asInstanceOf[js.Any])
      
      inline def setVerticesBufferTransformVarargs(value: Double*): Self = StObject.set(x, "verticesBufferTransform", js.Array(value*))
      
      inline def setVerticesCount(value: Double): Self = StObject.set(x, "verticesCount", value.asInstanceOf[js.Any])
    }
  }
}
