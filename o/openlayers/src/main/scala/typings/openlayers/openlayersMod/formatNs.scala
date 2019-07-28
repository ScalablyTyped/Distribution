package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.formatNs.EsriJSONGeometry
import typings.openlayers.openlayersMod.formatNs.GMLBase
import typings.openlayers.openlayersMod.formatNs.GeoJSONFeature
import typings.openlayers.openlayersMod.formatNs.GeoJSONFeatureCollection
import typings.openlayers.openlayersMod.formatNs.GeoJSONGeometry
import typings.openlayers.openlayersMod.formatNs.GeoJSONGeometryCollection
import typings.openlayers.openlayersMod.formatNs.JSONFeature
import typings.openlayers.openlayersMod.formatNs.TextFeature
import typings.openlayers.openlayersMod.formatNs.XML
import typings.openlayers.openlayersMod.formatNs.XMLFeature
import typings.openlayers.openlayersMod.formatNs.filterNs.And
import typings.openlayers.openlayersMod.formatNs.filterNs.Bbox
import typings.openlayers.openlayersMod.formatNs.filterNs.Comparison
import typings.openlayers.openlayersMod.formatNs.filterNs.ComparisonBinary
import typings.openlayers.openlayersMod.formatNs.filterNs.During
import typings.openlayers.openlayersMod.formatNs.filterNs.EqualTo
import typings.openlayers.openlayersMod.formatNs.filterNs.Filter
import typings.openlayers.openlayersMod.formatNs.filterNs.GreaterThan
import typings.openlayers.openlayersMod.formatNs.filterNs.GreaterThanOrEqualTo
import typings.openlayers.openlayersMod.formatNs.filterNs.Intersects
import typings.openlayers.openlayersMod.formatNs.filterNs.IsBetween
import typings.openlayers.openlayersMod.formatNs.filterNs.IsLike
import typings.openlayers.openlayersMod.formatNs.filterNs.IsNull
import typings.openlayers.openlayersMod.formatNs.filterNs.LessThan
import typings.openlayers.openlayersMod.formatNs.filterNs.LessThanOrEqualTo
import typings.openlayers.openlayersMod.formatNs.filterNs.LogicalNary
import typings.openlayers.openlayersMod.formatNs.filterNs.Not
import typings.openlayers.openlayersMod.formatNs.filterNs.NotEqualTo
import typings.openlayers.openlayersMod.formatNs.filterNs.Or
import typings.openlayers.openlayersMod.formatNs.filterNs.Spatial
import typings.openlayers.openlayersMod.formatNs.filterNs.Within
import typings.openlayers.openlayersMod.geomNs.Geometry
import typings.openlayers.openlayersMod.olxNs.formatNs.EsriJSONOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.GMLOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.GPXOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.GeoJSONOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.IGCOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.KMLOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.MVTOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.PolylineOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.ReadOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.TopoJSONOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WFSOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WFSWriteGetFeatureOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WFSWriteTransactionOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WKTOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WMSGetFeatureInfoOptions
import typings.openlayers.openlayersMod.olxNs.formatNs.WriteOptions
import typings.openlayers.openlayersMod.projNs.Projection
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.JSON
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format")
@js.native
object formatNs extends js.Object {
  /**
    * @classdesc
    * Feature format for reading and writing data in the EsriJSON format.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the EsriJSON format.
    *
    * @param opt_options Options.
    * @api
    */
  class EsriJSON () extends JSONFeature {
    def this(opt_options: EsriJSONOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read a feature from a EsriJSON Feature source.  Only works for Feature,
      * use `readFeatures` to read FeatureCollection source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api
      */
    def readFeature(source: ArrayBuffer): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: ArrayBuffer, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a EsriJSON source.  Works with both Feature and
      * FeatureCollection sources.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api
      */
    def readFeatures(source: ArrayBuffer): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readGeometry(source: String): Geometry = js.native
    def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: GlobalObject): Geometry = js.native
    def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
    /**
      * Read a geometry from a EsriJSON source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api
      */
    def readGeometry(source: ArrayBuffer): Geometry = js.native
    def readGeometry(source: ArrayBuffer, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: Document): Geometry = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: Node): Geometry = js.native
    def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a EsriJSON source.
      *
      * @param source Source.
      * @return Projection.
      * @api
      */
    def readProjection(source: ArrayBuffer): Projection = js.native
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Encode a feature as a EsriJSON Feature string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature): String = js.native
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature, opt_options: WriteOptions): String = js.native
    /**
      * Encode a feature as a esriJSON Feature object.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return Object.
      * @api
      */
    def writeFeatureObject(feature: typings.openlayers.openlayersMod.Feature): GlobalObject = js.native
    def writeFeatureObject(feature: typings.openlayers.openlayersMod.Feature, opt_options: WriteOptions): GlobalObject = js.native
    /**
      * Encode an array of features as EsriJSON.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features as a EsriJSON object.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return EsriJSON Object.
      * @api
      */
    def writeFeaturesObject(features: js.Array[typings.openlayers.openlayersMod.Feature]): GlobalObject = js.native
    def writeFeaturesObject(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): GlobalObject = js.native
    /**
      * Encode a geometry as a EsriJSON string.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeGeometry(geometry: Geometry): String = js.native
    def writeGeometry(geometry: Geometry, opt_options: WriteOptions): String = js.native
    /**
      * Encode a geometry as a EsriJSON object.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Object.
      * @api
      */
    def writeGeometryObject(geometry: Geometry): EsriJSONGeometry = js.native
    def writeGeometryObject(geometry: Geometry, opt_options: WriteOptions): EsriJSONGeometry = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for feature formats.
    * {ol.format.Feature} subclasses provide the ability to decode and encode
    * {@link ol.Feature} objects from a variety of commonly used geospatial
    * file formats.  See the documentation for each format for more details.
    *
    * @api stable
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for feature formats.
    * {ol.format.Feature} subclasses provide the ability to decode and encode
    * {@link ol.Feature} objects from a variety of commonly used geospatial
    * file formats.  See the documentation for each format for more details.
    *
    * @api stable
    */
  class Feature () extends js.Object
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  class GML () extends GMLBase {
    def this(opt_options: GMLOptions) = this()
    /**
      * Encode an array of features in GML 3.1.1 Simple Features.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features in the GML 3.1.1 format as an XML node.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): Node = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format,
    * version 2.1.2.
    *
    * @param opt_options Optional configuration object.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format,
    * version 2.1.2.
    *
    * @param opt_options Optional configuration object.
    * @api
    */
  class GML2 () extends GMLBase {
    def this(opt_options: GMLOptions) = this()
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api
    */
  class GML3 () extends GMLBase {
    def this(opt_options: GMLOptions) = this()
    /**
      * Encode an array of features in GML 3.1.1 Simple Features.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features in the GML 3.1.1 format as an XML node.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): Node = js.native
    /**
      * Encode a geometry in GML 3.1.1 Simple Features.
      *
      * @param geometry Geometry.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeGeometryNode(geometry: Geometry): Node = js.native
    def writeGeometryNode(geometry: Geometry, opt_options: WriteOptions): Node = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Feature base format for reading and writing data in the GML format.
    * This class cannot be instantiated, it contains only base content that
    * is shared with versioned format classes ol.format.GML2 and
    * ol.format.GML3.
    *
    * @param opt_options
    *     Optional configuration object.
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Feature base format for reading and writing data in the GML format.
    * This class cannot be instantiated, it contains only base content that
    * is shared with versioned format classes ol.format.GML2 and
    * ol.format.GML3.
    *
    * @param opt_options
    *     Optional configuration object.
    */
  class GMLBase () extends XMLFeature {
    def this(opt_options: GMLOptions) = this()
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a GML FeatureCollection.
      *
      * @param source Source.
      * @param opt_options Options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GPX format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the GPX format.
    *
    * @param opt_options Options.
    * @api stable
    */
  class GPX () extends XMLFeature {
    def this(opt_options: GPXOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read the first feature from a GPX source.
      * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
      * into MultiLineString. Any properties on route and track waypoints are ignored.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a GPX source.
      * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
      * into MultiLineString. Any properties on route and track waypoints are ignored.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a GPX source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Encode an array of features in the GPX format.
      * LineString geometries are output as routes (`<rte>`), and MultiLineString
      * as tracks (`<trk>`).
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features in the GPX format as an XML node.
      * LineString geometries are output as routes (`<rte>`), and MultiLineString
      * as tracks (`<trk>`).
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): Node = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GeoJSON format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the GeoJSON format.
    *
    * @param opt_options Options.
    * @api stable
    */
  class GeoJSON () extends JSONFeature {
    def this(opt_options: GeoJSONOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read a feature from a GeoJSON Feature source.  Only works for Feature,
      * use `readFeatures` to read FeatureCollection source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a GeoJSON source.  Works with both Feature and
      * FeatureCollection sources.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readGeometry(source: String): Geometry = js.native
    def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: GlobalObject): Geometry = js.native
    def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
    /**
      * Read a geometry from a GeoJSON source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: Document): Geometry = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: Node): Geometry = js.native
    def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a GeoJSON source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Encode a feature as a GeoJSON Feature string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature): String = js.native
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature, opt_options: WriteOptions): String = js.native
    /**
      * Encode a feature as a GeoJSON Feature object.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return Object.
      * @api stable
      */
    def writeFeatureObject(feature: typings.openlayers.openlayersMod.Feature): GeoJSONFeature = js.native
    def writeFeatureObject(feature: typings.openlayers.openlayersMod.Feature, opt_options: WriteOptions): GeoJSONFeature = js.native
    /**
      * Encode an array of features as GeoJSON.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features as a GeoJSON object.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return GeoJSON Object.
      * @api stable
      */
    def writeFeaturesObject(features: js.Array[typings.openlayers.openlayersMod.Feature]): GeoJSONFeatureCollection = js.native
    def writeFeaturesObject(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): GeoJSONFeatureCollection = js.native
    /**
      * Encode a geometry as a GeoJSON string.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeGeometry(geometry: Geometry): String = js.native
    def writeGeometry(geometry: Geometry, opt_options: WriteOptions): String = js.native
    /**
      * Encode a geometry as a GeoJSON object.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Object.
      * @api stable
      */
    def writeGeometryObject(geometry: Geometry): GeoJSONGeometry | GeoJSONGeometryCollection = js.native
    def writeGeometryObject(geometry: Geometry, opt_options: WriteOptions): GeoJSONGeometry | GeoJSONGeometryCollection = js.native
  }
  
  /**
    * @classdesc
    * Feature format for `*.igc` flight recording files.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Feature format for `*.igc` flight recording files.
    *
    * @param opt_options Options.
    * @api
    */
  class IGC () extends TextFeature {
    def this(opt_options: IGCOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read the feature from the IGC source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read the feature from the source. As IGC sources contain a single
      * feature, this will return the feature in an array.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from the IGC source.
      *
      * @param source Source.
      * @return Projection.
      * @api
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
  }
  
  /**
    * IGC altitude/z. One of 'barometric', 'gps', 'none'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.barometric
    - typings.openlayers.openlayersStrings.gps
    - typings.openlayers.openlayersStrings.none
  */
  trait IGCZ extends js.Object
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for JSON feature formats.
    *
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for JSON feature formats.
    *
    */
  class JSONFeature ()
    extends typings.openlayers.openlayersMod.formatNs.Feature
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the KML format.
    *
    * Note that the KML format uses the URL() constructor. Older browsers such as IE
    * which do not support this will need a URL polyfill to be loaded before use.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the KML format.
    *
    * Note that the KML format uses the URL() constructor. Older browsers such as IE
    * which do not support this will need a URL polyfill to be loaded before use.
    *
    * @param opt_options Options.
    * @api stable
    */
  class KML () extends XMLFeature {
    def this(opt_options: KMLOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read the first feature from a KML source. MultiGeometries are converted into
      * GeometryCollections if they are a mix of geometry types, and into MultiPoint/
      * MultiLineString/MultiPolygon if they are all of the same type.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a KML source. MultiGeometries are converted into
      * GeometryCollections if they are a mix of geometry types, and into MultiPoint/
      * MultiLineString/MultiPolygon if they are all of the same type.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readName(source: String): String = js.native
    /**
      * Read the name of the KML.
      *
      * @param source Souce.
      * @return Name.
      * @api stable
      */
    def readName(source: Document): String = js.native
    def readName(source: Node): String = js.native
    def readNetworkLinks(source: String): js.Array[GlobalObject] = js.native
    /**
      * Read the network links of the KML.
      *
      * @param source Source.
      * @return Network links.
      * @api
      */
    def readNetworkLinks(source: Document): js.Array[GlobalObject] = js.native
    def readNetworkLinks(source: Node): js.Array[GlobalObject] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a KML source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Encode an array of features in the KML format. GeometryCollections, MultiPoints,
      * MultiLineStrings, and MultiPolygons are output as MultiGeometries.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features in the KML format as an XML node. GeometryCollections,
      * MultiPoints, MultiLineStrings, and MultiPolygons are output as MultiGeometries.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): Node = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading data in the Mapbox MVT format.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading data in the Mapbox MVT format.
    *
    * @param opt_options Options.
    * @api
    */
  class MVT ()
    extends typings.openlayers.openlayersMod.formatNs.Feature {
    def this(opt_options: MVTOptions) = this()
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: ArrayBuffer): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * @inheritDoc
      * @api
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * @inheritDoc
      * @api
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Sets the layers that features will be read from.
      * @param layers Layers.
      * @api
      */
    def setLayers(layers: js.Array[String]): Unit = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading data in the
    * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
    *
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading data in the
    * [OSMXML format](http://wiki.openstreetmap.org/wiki/OSM_XML).
    *
    * @api stable
    */
  class OSMXML () extends XMLFeature {
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from an OSM source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from an OSM source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the Encoded
    * Polyline Algorithm Format.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the Encoded
    * Polyline Algorithm Format.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  class Polyline () extends TextFeature {
    def this(opt_options: PolylineOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read the feature from the Polyline source. The coordinates are assumed to be
      * in two dimensions and in latitude, longitude order.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read the feature from the source. As Polyline sources contain a single
      * feature, this will return the feature in an array.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readGeometry(source: String): Geometry = js.native
    def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: GlobalObject): Geometry = js.native
    def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
    /**
      * Read the geometry from the source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: Document): Geometry = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: Node): Geometry = js.native
    def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a Polyline source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    /**
      * Write a single geometry in Polyline format.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Geometry.
      * @api stable
      */
    def writeGeometry(geometry: Geometry): String = js.native
    def writeGeometry(geometry: Geometry, opt_options: WriteOptions): String = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for text feature formats.
    *
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for text feature formats.
    *
    */
  class TextFeature ()
    extends typings.openlayers.openlayersMod.formatNs.Feature
  
  /**
    * @classdesc
    * Feature format for reading data in the TopoJSON format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading data in the TopoJSON format.
    *
    * @param opt_options Options.
    * @api stable
    */
  class TopoJSON () extends JSONFeature {
    def this(opt_options: TopoJSONOptions) = this()
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a TopoJSON source.
      *
      * @param source Source.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(`object`: String): Projection = js.native
    def readProjection(`object`: GlobalObject): Projection = js.native
    /**
      * Read the projection from a TopoJSON source.
      *
      * @param object Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(`object`: Document): Projection = js.native
    def readProjection(`object`: Node): Projection = js.native
  }
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the WFS format.
    * By default, supports WFS version 1.1.0. You can pass a GML format
    * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
    * Also see {@link ol.format.GMLBase} which is used by this format.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Feature format for reading and writing data in the WFS format.
    * By default, supports WFS version 1.1.0. You can pass a GML format
    * as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
    * Also see {@link ol.format.GMLBase} which is used by this format.
    *
    * @param opt_options
    *     Optional configuration object.
    * @api stable
    */
  class WFS () extends XMLFeature {
    def this(opt_options: WFSOptions) = this()
    def readFeatureCollectionMetadata(source: String): WFSFeatureCollectionMetadata = js.native
    def readFeatureCollectionMetadata(source: GlobalObject): WFSFeatureCollectionMetadata = js.native
    /**
      * Read feature collection metadata of the source.
      *
      * @param source Source.
      * @return FeatureCollection metadata.
      * @api stable
      */
    def readFeatureCollectionMetadata(source: Document): WFSFeatureCollectionMetadata = js.native
    def readFeatureCollectionMetadata(source: Node): WFSFeatureCollectionMetadata = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WFS FeatureCollection.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readProjection(source: String): Projection = js.native
    def readProjection(source: GlobalObject): Projection = js.native
    /**
      * Read the projection from a WFS source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: Document): Projection = js.native
    def readProjection(source: Node): Projection = js.native
    def readTransactionResponse(source: String): WFSTransactionResponse = js.native
    def readTransactionResponse(source: GlobalObject): WFSTransactionResponse = js.native
    /**
      * Read transaction response of the source.
      *
      * @param source Source.
      * @return Transaction response.
      * @api stable
      */
    def readTransactionResponse(source: Document): WFSTransactionResponse = js.native
    def readTransactionResponse(source: Node): WFSTransactionResponse = js.native
    /**
      * Encode format as WFS `GetFeature` and return the Node.
      *
      * @param options Options.
      * @return Result.
      * @api stable
      */
    def writeGetFeature(options: WFSWriteGetFeatureOptions): Node = js.native
    /**
      * Encode format as WFS `Transaction` and return the Node.
      *
      * @param inserts The features to insert.
      * @param updates The features to update.
      * @param deletes The features to delete.
      * @param options Write options.
      * @return Result.
      * @api stable
      */
    def writeTransaction(
      inserts: js.Array[typings.openlayers.openlayersMod.Feature],
      updates: js.Array[typings.openlayers.openlayersMod.Feature],
      deletes: js.Array[typings.openlayers.openlayersMod.Feature],
      options: WFSWriteTransactionOptions
    ): Node = js.native
  }
  
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `WellKnownText` (WKT)
    * format.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Geometry format for reading and writing data in the `WellKnownText` (WKT)
    * format.
    *
    * @param opt_options Options.
    * @api stable
    */
  class WKT () extends TextFeature {
    def this(opt_options: WKTOptions) = this()
    def readFeature(source: String): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    /**
      * Read a feature from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: Document): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node): typings.openlayers.openlayersMod.Feature = js.native
    def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.openlayersMod.Feature = js.native
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readGeometry(source: String): Geometry = js.native
    def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: GlobalObject): Geometry = js.native
    def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
    /**
      * Read a single geometry from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: Document): Geometry = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
    def readGeometry(source: Node): Geometry = js.native
    def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
    /**
      * Encode a feature as a WKT string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return WKT string.
      * @api stable
      */
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature): String = js.native
    def writeFeature(feature: typings.openlayers.openlayersMod.Feature, opt_options: WriteOptions): String = js.native
    /**
      * Encode an array of features as a WKT string.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return WKT string.
      * @api stable
      */
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature]): String = js.native
    def writeFeatures(features: js.Array[typings.openlayers.openlayersMod.Feature], opt_options: WriteOptions): String = js.native
    /**
      * Write a single geometry as a WKT string.
      *
      * @param geometry Geometry.
      * @return WKT string.
      * @api stable
      */
    def writeGeometry(geometry: Geometry): String = js.native
  }
  
  /**
    * @classdesc
    * Format for reading WMS capabilities data
    *
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Format for reading WMS capabilities data
    *
    * @api
    */
  class WMSCapabilities () extends XML {
    def read(source: String): GlobalObject = js.native
    /**
      * Read a WMS capabilities document.
      *
      * @param source The XML source.
      * @return An object representing the WMS capabilities.
      * @api
      */
    def read(source: Document): GlobalObject = js.native
    def read(source: Node): GlobalObject = js.native
  }
  
  /**
    * @classdesc
    * Format for reading WMSGetFeatureInfo format. It uses
    * {@link ol.format.GML2} to read features.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Format for reading WMSGetFeatureInfo format. It uses
    * {@link ol.format.GML2} to read features.
    *
    * @param opt_options Options.
    * @api
    */
  class WMSGetFeatureInfo () extends XMLFeature {
    def this(opt_options: WMSGetFeatureInfoOptions) = this()
    def readFeatures(source: String): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WMSGetFeatureInfo response.
      *
      * @param source Source.
      * @param opt_options Options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: Document): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
    def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.openlayersMod.Feature] = js.native
  }
  
  /**
    * @classdesc
    * Format for reading WMTS capabilities data.
    *
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Format for reading WMTS capabilities data.
    *
    * @api
    */
  class WMTSCapabilities () extends XML {
    def read(source: String): GlobalObject = js.native
    /**
      * Read a WMTS capabilities document.
      *
      * @param source The XML source.
      * @return An object representing the WMTS capabilities.
      * @api
      */
    def read(source: Document): GlobalObject = js.native
    def read(source: Node): GlobalObject = js.native
  }
  
  /**
    * @classdesc
    * Generic format for reading non-feature XML data
    *
    * @struct
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @js.native
  /**
    * @classdesc
    * Generic format for reading non-feature XML data
    *
    * @struct
    */
  class XML () extends js.Object
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for XML feature formats.
    *
    */
  @js.native
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for XML feature formats.
    *
    */
  class XMLFeature ()
    extends typings.openlayers.openlayersMod.formatNs.Feature
  
  /* static members */
  @js.native
  object Polyline extends js.Object {
    /**
      * Decode a list of n-dimensional points from an encoded string
      *
      * @param encoded An encoded string.
      * @param stride The number of dimension of the points in the
      *     encoded string.
      * @param opt_factor The factor by which the resulting numbers will
      *     be divided. Default is `1e5`.
      * @return A list of n-dimensional points.
      * @api
      */
    def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = js.native
    def decodeDeltas(encoded: String, stride: Double, opt_factor: Double): js.Array[Double] = js.native
    /**
      * Decode a list of floating point numbers from an encoded string
      *
      * @param encoded An encoded string.
      * @param opt_factor The factor by which the result will be divided.
      *     Default is `1e5`.
      * @return A list of floating point numbers.
      * @api
      */
    def decodeFloats(encoded: String): js.Array[Double] = js.native
    def decodeFloats(encoded: String, opt_factor: Double): js.Array[Double] = js.native
    /**
      * Encode a list of n-dimensional points and return an encoded string
      *
      * Attention: This function will modify the passed array!
      *
      * @param numbers A list of n-dimensional points.
      * @param stride The number of dimension of the points in the list.
      * @param opt_factor The factor by which the numbers will be
      *     multiplied. The remaining decimal places will get rounded away.
      *     Default is `1e5`.
      * @return The encoded string.
      * @api
      */
    def encodeDeltas(numbers: js.Array[Double], stride: Double): String = js.native
    def encodeDeltas(numbers: js.Array[Double], stride: Double, opt_factor: Double): String = js.native
    /**
      * Encode a list of floating point numbers and return an encoded string
      *
      * Attention: This function will modify the passed array!
      *
      * @param numbers A list of floating point numbers.
      * @param opt_factor The factor by which the numbers will be
      *     multiplied. The remaining decimal places will get rounded away.
      *     Default is `1e5`.
      * @return The encoded string.
      * @api
      */
    def encodeFloats(numbers: js.Array[Double]): String = js.native
    def encodeFloats(numbers: js.Array[Double], opt_factor: Double): String = js.native
  }
  
  @JSName("filter")
  @js.native
  object filterNs extends js.Object {
    /**
      * @classdesc
      * Represents a logical <And> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    @js.native
    class And protected () extends LogicalNary {
      /**
        * @classdesc
        * Represents a logical <And> operator between two or more filter conditions.
        *
        * @param conditions Conditions
        * @api
        */
      def this(conditions: Filter*) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<BBOX>` operator to test whether a geometry-valued property
      * intersects a fixed bounding box
      *
      * @param geometryName Geometry name to use.
      * @param extent Extent.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    @js.native
    class Bbox protected () extends Filter {
      /**
        * @classdesc
        * Represents a `<BBOX>` operator to test whether a geometry-valued property
        * intersects a fixed bounding box
        *
        * @param geometryName Geometry name to use.
        * @param extent Extent.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      def this(geometryName: String, extent: Extent) = this()
      def this(geometryName: String, extent: Extent, opt_srsName: String) = this()
    }
    
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature property comparison filters.
      *
      * deprecated: This class will no longer be exported starting from the next major version.
      *
      * @param tagName The XML tag name for this filter.
      * @param propertyName Name of the context property to compare.
      * @api
      */
    @js.native
    class Comparison protected () extends Filter {
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature property comparison filters.
        *
        * deprecated: This class will no longer be exported starting from the next major version.
        *
        * @param tagName The XML tag name for this filter.
        * @param propertyName Name of the context property to compare.
        * @api
        */
      def this(tagName: String, propertyName: String) = this()
    }
    
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature property binary comparison filters.
      *
      * deprecated: This class will no longer be exported starting from the next major version.
      *
      * @param tagName The XML tag name for this filter.
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    @js.native
    class ComparisonBinary protected () extends Comparison {
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature property binary comparison filters.
        *
        * deprecated: This class will no longer be exported starting from the next major version.
        *
        * @param tagName The XML tag name for this filter.
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      def this(tagName: String, propertyName: String, expression: String) = this()
      def this(tagName: String, propertyName: String, expression: Double) = this()
      def this(tagName: String, propertyName: String, expression: String, opt_matchCase: Boolean) = this()
      def this(tagName: String, propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<During>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param begin The begin date in ISO-8601 format.
      * @param end The end date in ISO-8601 format.
      * @api
      */
    @js.native
    class During protected () extends Comparison {
      /**
        * @classdesc
        * Represents a `<During>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param begin The begin date in ISO-8601 format.
        * @param end The end date in ISO-8601 format.
        * @api
        */
      def this(propertyName: String, begin: String, end: String) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    @js.native
    class EqualTo protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      def this(propertyName: String, expression: String) = this()
      def this(propertyName: String, expression: Double) = this()
      def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
      def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
    }
    
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature filters.
      *
      * @param tagName The XML tag name for this filter.
      * @struct
      * @api
      */
    @js.native
    class Filter protected () extends js.Object {
      /**
        * @classdesc
        * Abstract class; normally only used for creating subclasses and not instantiated in apps.
        * Base class for WFS GetFeature filters.
        *
        * @param tagName The XML tag name for this filter.
        * @struct
        * @api
        */
      def this(tagName: String) = this()
      /**
        * The XML tag name for a filter.
        * @returns Name.
        */
      def getTagName(): String = js.native
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    @js.native
    class GreaterThan protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsGreaterThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      def this(propertyName: String, expression: Double) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    @js.native
    class GreaterThanOrEqualTo protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      def this(propertyName: String, expression: Double) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<Intersects>` operator to test whether a geometry-valued property
      * intersects a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    @js.native
    class Intersects protected () extends Spatial {
      /**
        * @classdesc
        * Represents a `<Intersects>` operator to test whether a geometry-valued property
        * intersects a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      def this(geometryName: String, geometry: Geometry) = this()
      def this(geometryName: String, geometry: Geometry, opt_srsName: String) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsBetween>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param lowerBoundary The lower bound of the range.
      * @param upperBoundary The upper bound of the range.
      * @api
      */
    @js.native
    class IsBetween protected () extends Comparison {
      /**
        * @classdesc
        * Represents a `<PropertyIsBetween>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param lowerBoundary The lower bound of the range.
        * @param upperBoundary The upper bound of the range.
        * @api
        */
      def this(propertyName: String, lowerBoundary: Double, upperBoundary: Double) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsLike>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param pattern Text pattern.
      * @param opt_wildCard Pattern character which matches any sequence of
      *    zero or more string characters. Default is '*'.
      * @param opt_singleChar pattern character which matches any single
      *    string character. Default is '.'.
      * @param opt_escapeChar Escape character which can be used to escape
      *    the pattern characters. Default is '!'.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    @js.native
    class IsLike protected () extends Comparison {
      /**
        * @classdesc
        * Represents a `<PropertyIsLike>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param pattern Text pattern.
        * @param opt_wildCard Pattern character which matches any sequence of
        *    zero or more string characters. Default is '*'.
        * @param opt_singleChar pattern character which matches any single
        *    string character. Default is '.'.
        * @param opt_escapeChar Escape character which can be used to escape
        *    the pattern characters. Default is '!'.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      def this(propertyName: String, pattern: String) = this()
      def this(propertyName: String, pattern: String, opt_wildCard: String) = this()
      def this(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String) = this()
      def this(
        propertyName: String,
        pattern: String,
        opt_wildCard: String,
        opt_singleChar: String,
        opt_escapeChar: String
      ) = this()
      def this(
        propertyName: String,
        pattern: String,
        opt_wildCard: String,
        opt_singleChar: String,
        opt_escapeChar: String,
        opt_matchCase: Boolean
      ) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsNull>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @api
      */
    @js.native
    class IsNull protected () extends Comparison {
      /**
        * @classdesc
        * Represents a `<PropertyIsNull>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @api
        */
      def this(propertyName: String) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    @js.native
    class LessThan protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsLessThan>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      def this(propertyName: String, expression: Double) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    @js.native
    class LessThanOrEqualTo protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @api
        */
      def this(propertyName: String, expression: Double) = this()
    }
    
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature n-ary logical filters.
      */
    @js.native
    class LogicalNary () extends Filter
    
    /**
      * @classdesc
      * Represents a logical `<Not>` operator for a filter condition.
      *
      * @param condition Filter condition.
      * @api
      */
    @js.native
    class Not protected () extends Filter {
      /**
        * @classdesc
        * Represents a logical `<Not>` operator for a filter condition.
        *
        * @param condition Filter condition.
        * @api
        */
      def this(condition: Filter) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<PropertyIsNotEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    @js.native
    class NotEqualTo protected () extends ComparisonBinary {
      /**
        * @classdesc
        * Represents a `<PropertyIsNotEqualTo>` comparison operator.
        *
        * @param propertyName Name of the context property to compare.
        * @param expression The value to compare.
        * @param opt_matchCase Case-sensitive?
        * @api
        */
      def this(propertyName: String, expression: String) = this()
      def this(propertyName: String, expression: Double) = this()
      def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
      def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
    }
    
    /**
      * @classdesc
      * Represents a logical <Or> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    @js.native
    class Or protected () extends LogicalNary {
      /**
        * @classdesc
        * Represents a logical <Or> operator between two or more filter conditions.
        *
        * @param conditions Conditions
        * @api
        */
      def this(conditions: Filter*) = this()
    }
    
    /**
      * @classdesc
      * Represents a spatial operator to test whether a geometry-valued property
      * relates to a given geometry.
      *
      * @param tagName The XML tag name for this filter.
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    @js.native
    class Spatial protected () extends Filter {
      /**
        * @classdesc
        * Represents a spatial operator to test whether a geometry-valued property
        * relates to a given geometry.
        *
        * @param tagName The XML tag name for this filter.
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      def this(tagName: String, geometryName: String, geometry: Geometry) = this()
      def this(tagName: String, geometryName: String, geometry: Geometry, opt_srsName: String) = this()
    }
    
    /**
      * @classdesc
      * Represents a `<Within>` operator to test whether a geometry-valued property
      * is within a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    @js.native
    class Within protected () extends Spatial {
      /**
        * @classdesc
        * Represents a `<Within>` operator to test whether a geometry-valued property
        * is within a given geometry.
        *
        * @param geometryName Geometry name to use.
        * @param geometry Geometry.
        * @param opt_srsName SRS name. No srsName attribute will be
        *    set on geometries when this is not provided.
        * @api
        */
      def this(geometryName: String, geometry: Geometry) = this()
      def this(geometryName: String, geometry: Geometry, opt_srsName: String) = this()
    }
    
    /**
      * Create a logical `<And>` operator between two or more filter conditions.
      *
      * @param conditions Filter conditions.
      * @returns `<And>` operator.
      * @api
      */
    def and(conditions: Filter*): And = js.native
    /**
      * Create a `<BBOX>` operator to test whether a geometry-valued property
      * intersects a fixed bounding box
      *
      * @param geometryName Geometry name to use.
      * @param extent Extent.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @returns `<BBOX>` operator.
      * @api
      */
    def bbox(geometryName: String, extent: Extent): Bbox = js.native
    def bbox(geometryName: String, extent: Extent, opt_srsName: String): Bbox = js.native
    /**
      * Creates a `<PropertyIsBetween>` comparison operator to test whether an expression
      * value lies within a range given by a lower and upper bound (inclusive).
      *
      * @param propertyName Name of the context property to compare.
      * @param lowerBoundary The lower bound of the range.
      * @param upperBoundary The upper bound of the range.
      * @returns `<PropertyIsBetween>` operator.
      * @api
      */
    def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): IsBetween = js.native
    /**
      * Create a `<During>` temporal operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param begin The begin date in ISO-8601 format.
      * @param end The end date in ISO-8601 format.
      * @returns `<During>` operator.
      * @api
      */
    def during(propertyName: String, begin: String, end: String): During = js.native
    /**
      * Creates a `<PropertyIsEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @returns `<PropertyIsEqualTo>` operator.
      * @api
      */
    def equalTo(propertyName: String, expression: String): EqualTo = js.native
    def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): EqualTo = js.native
    def equalTo(propertyName: String, expression: Double): EqualTo = js.native
    def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): EqualTo = js.native
    /**
      * Creates a `<PropertyIsGreaterThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsGreaterThan>` operator.
      * @api
      */
    def greaterThan(propertyName: String, expression: Double): GreaterThan = js.native
    /**
      * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
      * @api
      */
    def greaterThanOrEqualTo(propertyName: String, expression: Double): GreaterThanOrEqualTo = js.native
    /**
      * Create a `<Intersects>` operator to test whether a geometry-valued property
      * intersects a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @returns `<Intersects>` operator.
      * @api
      */
    def intersects(geometryName: String, geometry: Geometry): Intersects = js.native
    def intersects(geometryName: String, geometry: Geometry, opt_srsName: String): Intersects = js.native
    /**
      * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
      * is null.
      *
      * @param propertyName Name of the context property to compare.
      * @returns `<PropertyIsNull>` operator.
      * @api
      */
    def isNull(propertyName: String): IsNull = js.native
    /**
      * Creates a `<PropertyIsLessThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsLessThan>` operator.
      * @api
      */
    def lessThan(propertyName: String, expression: Double): LessThan = js.native
    /**
      * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsLessThanOrEqualTo>` operator.
      * @api
      */
    def lessThanOrEqualTo(propertyName: String, expression: Double): LessThanOrEqualTo = js.native
    /**
      * Represents a `<PropertyIsLike>` comparison operator that matches a string property
      * value against a text pattern.
      *
      * @param propertyName Name of the context property to compare.
      * @param pattern Text pattern.
      * @param opt_wildCard Pattern character which matches any sequence of
      *    zero or more string characters. Default is '*'.
      * @param opt_singleChar pattern character which matches any single
      *    string character. Default is '.'.
      * @param opt_escapeChar Escape character which can be used to escape
      *    the pattern characters. Default is '!'.
      * @param opt_matchCase Case-sensitive?
      * @returns `<PropertyIsLike>` operator.
      * @api
      */
    def like(propertyName: String, pattern: String): IsLike = js.native
    def like(propertyName: String, pattern: String, opt_wildCard: String): IsLike = js.native
    def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): IsLike = js.native
    def like(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String
    ): IsLike = js.native
    def like(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ): IsLike = js.native
    /**
      * Represents a logical `<Not>` operator for a filter condition.
      *
      * @param condition Filter condition.
      * @returns `<Not>` operator.
      * @api
      */
    def not(condition: Filter): Not = js.native
    /**
      * Creates a `<PropertyIsNotEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @returns `<PropertyIsNotEqualTo>` operator.
      * @api
      */
    def notEqualTo(propertyName: String, expression: String): NotEqualTo = js.native
    def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): NotEqualTo = js.native
    def notEqualTo(propertyName: String, expression: Double): NotEqualTo = js.native
    def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): NotEqualTo = js.native
    /**
      * Create a logical `<Or>` operator between two or more filter conditions.
      *
      * @param conditions Filter conditions.
      * @returns `<Or>` operator.
      * @api
      */
    def or(conditions: Filter*): Or = js.native
    /**
      * Create a `<Within>` operator to test whether a geometry-valued property
      * is within a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @returns `<Within>` operator.
      * @api
      */
    def within(geometryName: String, geometry: Geometry): Within = js.native
    def within(geometryName: String, geometry: Geometry, opt_srsName: String): Within = js.native
  }
  
  type EsriJSONGeometry = JSON
  type GeoJSONFeature = JSON
  type GeoJSONFeatureCollection = JSON
  type GeoJSONGeometry = JSON
  type GeoJSONGeometryCollection = JSON
}

