package typings.ol

import typings.ol.formatEsriJSONMod.Options
import typings.ol.formatEsriJSONMod.default
import typings.ol.formatIiifinfoMod.ImageInformationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  /**
    * @typedef {Object} Options
    * @property {string} [geometryName] Geometry name to use when creating features.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the EsriJSON format.
    *
    * @api
    */
  @JSImport("ol/format", "EsriJSON")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class EsriJSON () extends default {
    def this(options: Options) = this()
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @api
    */
  /* was `typeof GML3` */
  @JSImport("ol/format", "GML")
  @js.native
  open class GML ()
    extends typings.ol.formatGmlMod.default
  
  /**
    * @typedef {Object} Options
    * @property {function(Feature, Node):void} [readExtensions] Callback function
    * to process `extensions` nodes. To prevent memory leaks, this callback function must
    * not store any references to the node. Note that the `extensions`
    * node is not allowed in GPX 1.0. Moreover, only `extensions`
    * nodes from `wpt`, `rte` and `trk` can be processed, as those are
    * directly mapped to a feature.
    */
  /**
    * @typedef {Object} LayoutOptions
    * @property {boolean} [hasZ] HasZ.
    * @property {boolean} [hasM] HasM.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the GPX format.
    *
    * Note that {@link module:ol/format/GPX~GPX#readFeature} only reads the first
    * feature of the source.
    *
    * When reading, routes (`<rte>`) are converted into LineString geometries, and
    * tracks (`<trk>`) into MultiLineString. Any properties on route and track
    * waypoints are ignored.
    *
    * When writing, LineString geometries are output as routes (`<rte>`), and
    * MultiLineString as tracks (`<trk>`).
    *
    * @api
    */
  @JSImport("ol/format", "GPX")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class GPX ()
    extends typings.ol.formatGpxMod.default {
    def this(options: typings.ol.formatGpxMod.Options) = this()
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
  @JSImport("ol/format", "GeoJSON")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class GeoJSON ()
    extends typings.ol.formatGeoJSONMod.default {
    def this(options: typings.ol.formatGeoJSONMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {IGCZ} [altitudeMode='none'] Altitude mode. Possible
    * values are `'barometric'`, `'gps'`, and `'none'`.
    */
  /**
    * @classdesc
    * Feature format for `*.igc` flight recording files.
    *
    * As IGC sources contain a single feature,
    * {@link module:ol/format/IGC~IGC#readFeatures} will return the feature in an
    * array
    *
    * @api
    */
  @JSImport("ol/format", "IGC")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class IGC ()
    extends typings.ol.formatIgcMod.default {
    def this(options: typings.ol.formatIgcMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Format for transforming IIIF Image API image information responses into
    * IIIF tile source ready options
    *
    * @api
    */
  @JSImport("ol/format", "IIIFInfo")
  @js.native
  open class IIIFInfo protected ()
    extends typings.ol.formatIiifinfoMod.default {
    /**
      * @param {string|ImageInformationResponse} imageInfo
      * Deserialized image information JSON response object or JSON response as string
      */
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [extractStyles=true] Extract styles from the KML.
    * @property {boolean} [showPointNames=true] Show names as labels for placemarks which contain points.
    * @property {Array<Style>} [defaultStyle] Default style. The
    * default default style is the same as Google Earth.
    * @property {boolean} [writeStyles=true] Write styles into KML.
    * @property {null|string} [crossOrigin='anonymous'] The `crossOrigin` attribute for loaded images. Note that you must provide a
    * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * @property {IconUrlFunction} [iconUrlFunction] Function that takes a url string and returns a url string.
    * Might be used to change an icon path or to substitute a data url obtained from a KMZ array buffer.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the KML format.
    *
    * {@link module:ol/format/KML~KML#readFeature} will read the first feature from
    * a KML source.
    *
    * MultiGeometries are converted into GeometryCollections if they are a mix of
    * geometry types, and into MultiPoint/MultiLineString/MultiPolygon if they are
    * all of the same type.
    *
    * @api
    */
  @JSImport("ol/format", "KML")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class KML ()
    extends typings.ol.formatKmlMod.default {
    def this(options: typings.ol.formatKmlMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("../Feature.js").FeatureClass} [featureClass] Class for features returned by
    * {@link module:ol/format/MVT~MVT#readFeatures}. Set to {@link module:ol/Feature~Feature} to get full editing and geometry
    * support at the cost of decreased rendering performance. The default is
    * {@link module:ol/render/Feature~RenderFeature}, which is optimized for rendering and hit detection.
    * @property {string} [geometryName='geometry'] Geometry name to use when creating features.
    * @property {string} [layerName='layer'] Name of the feature attribute that holds the layer name.
    * @property {Array<string>} [layers] Layers to read features from. If not provided, features will be read from all
    * @property {string} [idProperty] Optional property that will be assigned as the feature id and removed from the properties.
    * layers.
    */
  /**
    * @classdesc
    * Feature format for reading data in the Mapbox MVT format.
    *
    * @param {Options} [options] Options.
    * @api
    */
  @JSImport("ol/format", "MVT")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class MVT ()
    extends typings.ol.formatMvtMod.default {
    def this(options: typings.ol.formatMvtMod.Options) = this()
  }
  
  @JSImport("ol/format", "OWS")
  @js.native
  open class OWS ()
    extends typings.ol.formatOwsMod.default
  
  /**
    * @typedef {Object} Options
    * @property {number} [factor=1e5] The factor by which the coordinates values will be scaled.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout='XY'] Layout of the
    * feature geometries created by the format reader.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the Encoded
    * Polyline Algorithm Format.
    *
    * When reading features, the coordinates are assumed to be in two dimensions
    * and in [latitude, longitude] order.
    *
    * As Polyline sources contain a single feature,
    * {@link module:ol/format/Polyline~Polyline#readFeatures} will return the
    * feature in an array.
    *
    * @api
    */
  @JSImport("ol/format", "Polyline")
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class Polyline ()
    extends typings.ol.formatPolylineMod.default {
    def this(options: typings.ol.formatPolylineMod.Options) = this()
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
  @JSImport("ol/format", "TopoJSON")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class TopoJSON ()
    extends typings.ol.formatTopoJSONMod.default {
    def this(options: typings.ol.formatTopoJSONMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the WFS format.
    * By default, supports WFS version 1.1.0. You can pass a GML format
    * as option to override the default.
    * Also see {@link module:ol/format/GMLBase~GMLBase} which is used by this format.
    *
    * @api
    */
  @JSImport("ol/format", "WFS")
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class WFS ()
    extends typings.ol.formatWfsMod.default {
    def this(options: typings.ol.formatWfsMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [splitCollection=false] Whether to split GeometryCollections into multiple features on reading.
    * @property {boolean} [hex=true] Returns hex string instead of ArrayBuffer for output. This also is used as a hint internally whether it should load contents as text or ArrayBuffer on reading.
    * @property {boolean} [littleEndian=true] Use littleEndian for output.
    * @property {boolean} [ewkb=true] Use EWKB format for output.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout=null] Use specific coordinate layout for output features (null: auto detect)
    * @property {number} [nodataZ=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of Z.
    * @property {number} [nodataM=0] If the `geometryLayout` doesn't match with geometry to be output, this value is used to fill missing coordinate value of M.
    * @property {number|boolean} [srid=true] SRID for output. Specify integer value to enforce the value as a SRID. Specify `true` to extract from `dataProjection`. `false` to suppress the output. This option only takes effect when `ewkb` is `true`.
    */
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `Well-Known Binary` (WKB) format.
    * Also supports `Extended Well-Known Binary` (EWKB) format, used in PostGIS for example.
    *
    * @api
    */
  @JSImport("ol/format", "WKB")
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class WKB ()
    extends typings.ol.formatWkbMod.default {
    def this(options: typings.ol.formatWkbMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `WellKnownText` (WKT)
    * format.
    *
    * @api
    */
  @JSImport("ol/format", "WKT")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class WKT ()
    extends typings.ol.formatWktMod.default {
    def this(options: typings.ol.formatWktMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Format for reading WMS capabilities data
    *
    * @api
    */
  @JSImport("ol/format", "WMSCapabilities")
  @js.native
  open class WMSCapabilities ()
    extends typings.ol.formatWmscapabilitiesMod.default
  
  /**
    * @classdesc
    * Format for reading WMSGetFeatureInfo format. It uses
    * {@link module:ol/format/GML2~GML2} to read features.
    *
    * @api
    */
  @JSImport("ol/format", "WMSGetFeatureInfo")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class WMSGetFeatureInfo ()
    extends typings.ol.formatWmsgetfeatureinfoMod.default {
    def this(options: typings.ol.formatWmsgetfeatureinfoMod.Options) = this()
  }
  
  /**
    * @classdesc
    * Format for reading WMTS capabilities data.
    *
    * @api
    */
  @JSImport("ol/format", "WMTSCapabilities")
  @js.native
  open class WMTSCapabilities ()
    extends typings.ol.formatWmtscapabilitiesMod.default
}
