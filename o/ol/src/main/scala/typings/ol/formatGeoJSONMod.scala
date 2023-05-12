package typings.ol

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryCollection
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.geojson.mod.MultiPoint
import typings.geojson.mod.MultiPolygon
import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGeoJSONMod {
  
  /**
    * @typedef {import("geojson").GeoJSON} GeoJSONObject
    * @typedef {import("geojson").Feature} GeoJSONFeature
    * @typedef {import("geojson").FeatureCollection} GeoJSONFeatureCollection
    * @typedef {import("geojson").Geometry} GeoJSONGeometry
    * @typedef {import("geojson").Point} GeoJSONPoint
    * @typedef {import("geojson").LineString} GeoJSONLineString
    * @typedef {import("geojson").Polygon} GeoJSONPolygon
    * @typedef {import("geojson").MultiPoint} GeoJSONMultiPoint
    * @typedef {import("geojson").MultiLineString} GeoJSONMultiLineString
    * @typedef {import("geojson").MultiPolygon} GeoJSONMultiPolygon
    * @typedef {import("geojson").GeometryCollection} GeoJSONGeometryCollection
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [dataProjection='EPSG:4326'] Default data projection.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection for features read or
    * written by the format.  Options passed to read or write methods will take precedence.
    * @property {string} [geometryName] Geometry name to use when creating features.
    * @property {boolean} [extractGeometryName=false] Certain GeoJSON providers include
    * the geometry_name field in the feature GeoJSON. If set to `true` the GeoJSON reader
    * will look for that field to set the geometry name. If both this field is set to `true`
    * and a `geometryName` is provided, the `geometryName` will take precedence.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the GeoJSON format.
    *
    * @api
    */
  @JSImport("ol/format/GeoJSON", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends GeoJSON {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {import("geojson").GeoJSON} GeoJSONObject
    * @typedef {import("geojson").Feature} GeoJSONFeature
    * @typedef {import("geojson").FeatureCollection} GeoJSONFeatureCollection
    * @typedef {import("geojson").Geometry} GeoJSONGeometry
    * @typedef {import("geojson").Point} GeoJSONPoint
    * @typedef {import("geojson").LineString} GeoJSONLineString
    * @typedef {import("geojson").Polygon} GeoJSONPolygon
    * @typedef {import("geojson").MultiPoint} GeoJSONMultiPoint
    * @typedef {import("geojson").MultiLineString} GeoJSONMultiLineString
    * @typedef {import("geojson").MultiPolygon} GeoJSONMultiPolygon
    * @typedef {import("geojson").GeometryCollection} GeoJSONGeometryCollection
    */
  /**
    * @typedef {Object} Options
    * @property {import("../proj.js").ProjectionLike} [dataProjection='EPSG:4326'] Default data projection.
    * @property {import("../proj.js").ProjectionLike} [featureProjection] Projection for features read or
    * written by the format.  Options passed to read or write methods will take precedence.
    * @property {string} [geometryName] Geometry name to use when creating features.
    * @property {boolean} [extractGeometryName=false] Certain GeoJSON providers include
    * the geometry_name field in the feature GeoJSON. If set to `true` the GeoJSON reader
    * will look for that field to set the geometry name. If both this field is set to `true`
    * and a `geometryName` is provided, the `geometryName` will take precedence.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the GeoJSON format.
    *
    * @api
    */
  @js.native
  trait GeoJSON
    extends typings.ol.formatJsonfeatureMod.default {
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_GeoJSON: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("defaultFeatureProjection")
    var defaultFeatureProjection_GeoJSON: typings.ol.projProjectionMod.default = js.native
    
    /**
      * Look for the geometry name in the feature GeoJSON
      * @type {boolean|undefined}
      * @private
      */
    /* private */ var extractGeometryName_ : Any = js.native
    
    /**
      * Name of the geometry attribute for features.
      * @type {string|undefined}
      * @private
      */
    /* private */ var geometryName_ : Any = js.native
    
    /**
      * @param {GeoJSONGeometry} object Object.
      * @param {import("./Feature.js").ReadOptions} [options] Read options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  }
  
  type GeoJSONFeature = Feature[Geometry, GeoJsonProperties]
  
  type GeoJSONFeatureCollection = FeatureCollection[Geometry, GeoJsonProperties]
  
  type GeoJSONGeometry = Geometry
  
  type GeoJSONGeometryCollection = GeometryCollection[Geometry]
  
  type GeoJSONLineString = LineString
  
  type GeoJSONMultiLineString = MultiLineString
  
  type GeoJSONMultiPoint = MultiPoint
  
  type GeoJSONMultiPolygon = MultiPolygon
  
  type GeoJSONObject = typings.geojson.mod.GeoJSON
  
  type GeoJSONPoint = Point
  
  type GeoJSONPolygon = Polygon
  
  trait Options extends StObject {
    
    /**
      * Default data projection.
      */
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Certain GeoJSON providers include
      * the geometry_name field in the feature GeoJSON. If set to `true` the GeoJSON reader
      * will look for that field to set the geometry name. If both this field is set to `true`
      * and a `geometryName` is provided, the `geometryName` will take precedence.
      */
    var extractGeometryName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection for features read or
      * written by the format.  Options passed to read or write methods will take precedence.
      */
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Geometry name to use when creating features.
      */
    var geometryName: js.UndefOr[String] = js.undefined
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
      
      inline def setExtractGeometryName(value: Boolean): Self = StObject.set(x, "extractGeometryName", value.asInstanceOf[js.Any])
      
      inline def setExtractGeometryNameUndefined: Self = StObject.set(x, "extractGeometryName", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
