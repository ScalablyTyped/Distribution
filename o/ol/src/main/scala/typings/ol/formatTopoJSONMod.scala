package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.GeometryObject
import typings.topojsonSpecification.mod.LineString
import typings.topojsonSpecification.mod.MultiLineString
import typings.topojsonSpecification.mod.MultiPoint
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Point
import typings.topojsonSpecification.mod.Polygon
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTopoJSONMod {
  
  /**
    * @typedef {import("topojson-specification").Topology} TopoJSONTopology
    * @typedef {import("topojson-specification").GeometryCollection} TopoJSONGeometryCollection
    * @typedef {import("topojson-specification").GeometryObject} TopoJSONGeometry
    * @typedef {import("topojson-specification").Point} TopoJSONPoint
    * @typedef {import("topojson-specification").MultiPoint} TopoJSONMultiPoint
    * @typedef {import("topojson-specification").LineString} TopoJSONLineString
    * @typedef {import("topojson-specification").MultiLineString} TopoJSONMultiLineString
    * @typedef {import("topojson-specification").Polygon} TopoJSONPolygon
    * @typedef {import("topojson-specification").MultiPolygon} TopoJSONMultiPolygon
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [dataProjection='EPSG:4326'] Default data projection.
    * @property {string} [layerName] Set the name of the TopoJSON topology
    * `objects`'s children as feature property with the specified name. This means
    * that when set to `'layer'`, a topology like
    * ```
    * {
    *   "type": "Topology",
    *   "objects": {
    *     "example": {
    *       "type": "GeometryCollection",
    *       "geometries": []
    *     }
    *   }
    * }
    * ```
    * will result in features that have a property `'layer'` set to `'example'`.
    * When not set, no property will be added to features.
    * @property {Array<string>} [layers] Names of the TopoJSON topology's
    * `objects`'s children to read features from.  If not provided, features will
    * be read from all children.
    */
  /**
    * @classdesc
    * Feature format for reading data in the TopoJSON format.
    *
    * @api
    */
  @JSImport("ol/format/TopoJSON", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends TopoJSON {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Default data projection.
      */
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Set the name of the TopoJSON topology
      * `objects`'s children as feature property with the specified name. This means
      * that when set to `'layer'`, a topology like
      * ```
      * {
      * "type": "Topology",
      * "objects": {
      * "example": {
      * "type": "GeometryCollection",
      * "geometries": []
      * }
      * }
      * }
      * ```
      * will result in features that have a property `'layer'` set to `'example'`.
      * When not set, no property will be added to features.
      */
    var layerName: js.UndefOr[String] = js.undefined
    
    /**
      * Names of the TopoJSON topology's
      * `objects`'s children to read features from.  If not provided, features will
      * be read from all children.
      */
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  /**
    * @typedef {import("topojson-specification").Topology} TopoJSONTopology
    * @typedef {import("topojson-specification").GeometryCollection} TopoJSONGeometryCollection
    * @typedef {import("topojson-specification").GeometryObject} TopoJSONGeometry
    * @typedef {import("topojson-specification").Point} TopoJSONPoint
    * @typedef {import("topojson-specification").MultiPoint} TopoJSONMultiPoint
    * @typedef {import("topojson-specification").LineString} TopoJSONLineString
    * @typedef {import("topojson-specification").MultiLineString} TopoJSONMultiLineString
    * @typedef {import("topojson-specification").Polygon} TopoJSONPolygon
    * @typedef {import("topojson-specification").MultiPolygon} TopoJSONMultiPolygon
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [dataProjection='EPSG:4326'] Default data projection.
    * @property {string} [layerName] Set the name of the TopoJSON topology
    * `objects`'s children as feature property with the specified name. This means
    * that when set to `'layer'`, a topology like
    * ```
    * {
    *   "type": "Topology",
    *   "objects": {
    *     "example": {
    *       "type": "GeometryCollection",
    *       "geometries": []
    *     }
    *   }
    * }
    * ```
    * will result in features that have a property `'layer'` set to `'example'`.
    * When not set, no property will be added to features.
    * @property {Array<string>} [layers] Names of the TopoJSON topology's
    * `objects`'s children to read features from.  If not provided, features will
    * be read from all children.
    */
  /**
    * @classdesc
    * Feature format for reading data in the TopoJSON format.
    *
    * @api
    */
  @js.native
  trait TopoJSON
    extends typings.ol.formatJsonfeatureMod.default {
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_TopoJSON: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var layerName_ : Any = js.native
    
    /**
      * @private
      * @type {?Array<string>}
      */
    /* private */ var layers_ : Any = js.native
  }
  
  type TopoJSONGeometry = GeometryObject[js.Object]
  
  type TopoJSONGeometryCollection = GeometryCollection[js.Object]
  
  type TopoJSONLineString = LineString[js.Object]
  
  type TopoJSONMultiLineString = MultiLineString[js.Object]
  
  type TopoJSONMultiPoint = MultiPoint[js.Object]
  
  type TopoJSONMultiPolygon = MultiPolygon[js.Object]
  
  type TopoJSONPoint = Point[js.Object]
  
  type TopoJSONPolygon = Polygon[js.Object]
  
  type TopoJSONTopology = Topology[Objects[Properties]]
}
