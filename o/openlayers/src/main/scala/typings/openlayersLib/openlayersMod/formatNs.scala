package typings
package openlayersLib.openlayersMod

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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.EsriJSONOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
    /**
      * Read a feature from a EsriJSON Feature source.  Only works for Feature,
      * use `readFeatures` to read FeatureCollection source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api
      */
    def readFeature(source: stdLib.ArrayBuffer): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.ArrayBuffer, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a EsriJSON source.  Works with both Feature and
      * FeatureCollection sources.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api
      */
    def readFeatures(source: stdLib.ArrayBuffer): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.ArrayBuffer, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readGeometry(source: java.lang.String): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    /**
      * Read a geometry from a EsriJSON source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api
      */
    def readGeometry(source: stdLib.ArrayBuffer): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.ArrayBuffer, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Document): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a EsriJSON source.
      *
      * @param source Source.
      * @return Projection.
      * @api
      */
    def readProjection(source: stdLib.ArrayBuffer): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Encode a feature as a EsriJSON Feature string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeFeature(feature: openlayersLib.openlayersMod.Feature): java.lang.String = js.native
    def writeFeature(
      feature: openlayersLib.openlayersMod.Feature,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode a feature as a esriJSON Feature object.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return Object.
      * @api
      */
    def writeFeatureObject(feature: openlayersLib.openlayersMod.Feature): openlayersLib.openlayersMod.GlobalObject = js.native
    def writeFeatureObject(
      feature: openlayersLib.openlayersMod.Feature,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): openlayersLib.openlayersMod.GlobalObject = js.native
    /**
      * Encode an array of features as EsriJSON.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features as a EsriJSON object.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return EsriJSON Object.
      * @api
      */
    def writeFeaturesObject(features: js.Array[openlayersLib.openlayersMod.Feature]): openlayersLib.openlayersMod.GlobalObject = js.native
    def writeFeaturesObject(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): openlayersLib.openlayersMod.GlobalObject = js.native
    /**
      * Encode a geometry as a EsriJSON string.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return EsriJSON.
      * @api
      */
    def writeGeometry(geometry: openlayersLib.openlayersMod.geomNs.Geometry): java.lang.String = js.native
    def writeGeometry(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode a geometry as a EsriJSON object.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Object.
      * @api
      */
    def writeGeometryObject(geometry: openlayersLib.openlayersMod.geomNs.Geometry): EsriJSONGeometry = js.native
    def writeGeometryObject(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): EsriJSONGeometry = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    /**
      * Encode an array of features in GML 3.1.1 Simple Features.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features in the GML 3.1.1 format as an XML node.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[openlayersLib.openlayersMod.Feature]): stdLib.Node = js.native
    def writeFeaturesNode(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): stdLib.Node = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    /**
      * Encode an array of features in GML 3.1.1 Simple Features.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features in the GML 3.1.1 format as an XML node.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[openlayersLib.openlayersMod.Feature]): stdLib.Node = js.native
    def writeFeaturesNode(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): stdLib.Node = js.native
    /**
      * Encode a geometry in GML 3.1.1 Simple Features.
      *
      * @param geometry Geometry.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeGeometryNode(geometry: openlayersLib.openlayersMod.geomNs.Geometry): stdLib.Node = js.native
    def writeGeometryNode(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): stdLib.Node = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GMLOptions) = this()
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a GML FeatureCollection.
      *
      * @param source Source.
      * @param opt_options Options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GPXOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
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
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
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
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a GPX source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
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
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
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
    def writeFeaturesNode(features: js.Array[openlayersLib.openlayersMod.Feature]): stdLib.Node = js.native
    def writeFeaturesNode(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): stdLib.Node = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.GeoJSONOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
    /**
      * Read a feature from a GeoJSON Feature source.  Only works for Feature,
      * use `readFeatures` to read FeatureCollection source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a GeoJSON source.  Works with both Feature and
      * FeatureCollection sources.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readGeometry(source: java.lang.String): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    /**
      * Read a geometry from a GeoJSON source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: stdLib.Document): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a GeoJSON source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Encode a feature as a GeoJSON Feature string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeFeature(feature: openlayersLib.openlayersMod.Feature): java.lang.String = js.native
    def writeFeature(
      feature: openlayersLib.openlayersMod.Feature,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode a feature as a GeoJSON Feature object.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return Object.
      * @api stable
      */
    def writeFeatureObject(feature: openlayersLib.openlayersMod.Feature): GeoJSONFeature = js.native
    def writeFeatureObject(
      feature: openlayersLib.openlayersMod.Feature,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): GeoJSONFeature = js.native
    /**
      * Encode an array of features as GeoJSON.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features as a GeoJSON object.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return GeoJSON Object.
      * @api stable
      */
    def writeFeaturesObject(features: js.Array[openlayersLib.openlayersMod.Feature]): GeoJSONFeatureCollection = js.native
    def writeFeaturesObject(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): GeoJSONFeatureCollection = js.native
    /**
      * Encode a geometry as a GeoJSON string.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return GeoJSON.
      * @api stable
      */
    def writeGeometry(geometry: openlayersLib.openlayersMod.geomNs.Geometry): java.lang.String = js.native
    def writeGeometry(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode a geometry as a GeoJSON object.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Object.
      * @api stable
      */
    def writeGeometryObject(geometry: openlayersLib.openlayersMod.geomNs.Geometry): GeoJSONGeometry | GeoJSONGeometryCollection = js.native
    def writeGeometryObject(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): GeoJSONGeometry | GeoJSONGeometryCollection = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.IGCOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
    /**
      * Read the feature from the IGC source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api
      */
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read the feature from the source. As IGC sources contain a single
      * feature, this will return the feature in an array.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from the IGC source.
      *
      * @param source Source.
      * @return Projection.
      * @api
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
  }
  
  /**
    * IGC altitude/z. One of 'barometric', 'gps', 'none'.
    */
  /* Rewritten from type alias, can be one of: 
    - openlayersLib.openlayersLibStrings.barometric
    - openlayersLib.openlayersLibStrings.gps
    - openlayersLib.openlayersLibStrings.none
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
  class JSONFeature () extends Feature
  
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.KMLOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
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
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
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
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readName(source: java.lang.String): java.lang.String = js.native
    /**
      * Read the name of the KML.
      *
      * @param source Souce.
      * @return Name.
      * @api stable
      */
    def readName(source: stdLib.Document): java.lang.String = js.native
    def readName(source: stdLib.Node): java.lang.String = js.native
    def readNetworkLinks(source: java.lang.String): js.Array[openlayersLib.openlayersMod.GlobalObject] = js.native
    /**
      * Read the network links of the KML.
      *
      * @param source Source.
      * @return Network links.
      * @api
      */
    def readNetworkLinks(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.GlobalObject] = js.native
    def readNetworkLinks(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.GlobalObject] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a KML source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Encode an array of features in the KML format. GeometryCollections, MultiPoints,
      * MultiLineStrings, and MultiPolygons are output as MultiGeometries.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Result.
      * @api stable
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features in the KML format as an XML node. GeometryCollections,
      * MultiPoints, MultiLineStrings, and MultiPolygons are output as MultiGeometries.
      *
      * @param features Features.
      * @param opt_options Options.
      * @return Node.
      * @api
      */
    def writeFeaturesNode(features: js.Array[openlayersLib.openlayersMod.Feature]): stdLib.Node = js.native
    def writeFeaturesNode(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): stdLib.Node = js.native
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
  class MVT () extends Feature {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.MVTOptions) = this()
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.ArrayBuffer): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.ArrayBuffer, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * @inheritDoc
      * @api
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * @inheritDoc
      * @api
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Sets the layers that features will be read from.
      * @param layers Layers.
      * @api
      */
    def setLayers(layers: js.Array[java.lang.String]): scala.Unit = js.native
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
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from an OSM source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from an OSM source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.PolylineOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
    /**
      * Read the feature from the Polyline source. The coordinates are assumed to be
      * in two dimensions and in latitude, longitude order.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read the feature from the source. As Polyline sources contain a single
      * feature, this will return the feature in an array.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readGeometry(source: java.lang.String): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    /**
      * Read the geometry from the source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: stdLib.Document): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a Polyline source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Write a single geometry in Polyline format.
      *
      * @param geometry Geometry.
      * @param opt_options Write options.
      * @return Geometry.
      * @api stable
      */
    def writeGeometry(geometry: openlayersLib.openlayersMod.geomNs.Geometry): java.lang.String = js.native
    def writeGeometry(
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
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
  class TextFeature () extends Feature
  
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.TopoJSONOptions) = this()
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a TopoJSON source.
      *
      * @param source Source.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(`object`: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(`object`: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a TopoJSON source.
      *
      * @param object Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(`object`: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(`object`: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WFSOptions) = this()
    def readFeatureCollectionMetadata(source: java.lang.String): openlayersLib.openlayersMod.WFSFeatureCollectionMetadata = js.native
    def readFeatureCollectionMetadata(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.WFSFeatureCollectionMetadata = js.native
    /**
      * Read feature collection metadata of the source.
      *
      * @param source Source.
      * @return FeatureCollection metadata.
      * @api stable
      */
    def readFeatureCollectionMetadata(source: stdLib.Document): openlayersLib.openlayersMod.WFSFeatureCollectionMetadata = js.native
    def readFeatureCollectionMetadata(source: stdLib.Node): openlayersLib.openlayersMod.WFSFeatureCollectionMetadata = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WFS FeatureCollection.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readProjection(source: java.lang.String): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.projNs.Projection = js.native
    /**
      * Read the projection from a WFS source.
      *
      * @param source Source.
      * @return Projection.
      * @api stable
      */
    def readProjection(source: stdLib.Document): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readProjection(source: stdLib.Node): openlayersLib.openlayersMod.projNs.Projection = js.native
    def readTransactionResponse(source: java.lang.String): openlayersLib.openlayersMod.WFSTransactionResponse = js.native
    def readTransactionResponse(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.WFSTransactionResponse = js.native
    /**
      * Read transaction response of the source.
      *
      * @param source Source.
      * @return Transaction response.
      * @api stable
      */
    def readTransactionResponse(source: stdLib.Document): openlayersLib.openlayersMod.WFSTransactionResponse = js.native
    def readTransactionResponse(source: stdLib.Node): openlayersLib.openlayersMod.WFSTransactionResponse = js.native
    /**
      * Encode format as WFS `GetFeature` and return the Node.
      *
      * @param options Options.
      * @return Result.
      * @api stable
      */
    def writeGetFeature(options: openlayersLib.openlayersMod.olxNs.formatNs.WFSWriteGetFeatureOptions): stdLib.Node = js.native
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
      inserts: js.Array[openlayersLib.openlayersMod.Feature],
      updates: js.Array[openlayersLib.openlayersMod.Feature],
      deletes: js.Array[openlayersLib.openlayersMod.Feature],
      options: openlayersLib.openlayersMod.olxNs.formatNs.WFSWriteTransactionOptions
    ): stdLib.Node = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WKTOptions) = this()
    def readFeature(source: java.lang.String): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.Feature = js.native
    /**
      * Read a feature from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Feature.
      * @api stable
      */
    def readFeature(source: stdLib.Document): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node): openlayersLib.openlayersMod.Feature = js.native
    def readFeature(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.Feature = js.native
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readGeometry(source: java.lang.String): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: openlayersLib.openlayersMod.GlobalObject): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    /**
      * Read a single geometry from a WKT source.
      *
      * @param source Source.
      * @param opt_options Read options.
      * @return Geometry.
      * @api stable
      */
    def readGeometry(source: stdLib.Document): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    def readGeometry(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): openlayersLib.openlayersMod.geomNs.Geometry = js.native
    /**
      * Encode a feature as a WKT string.
      *
      * @param feature Feature.
      * @param opt_options Write options.
      * @return WKT string.
      * @api stable
      */
    def writeFeature(feature: openlayersLib.openlayersMod.Feature): java.lang.String = js.native
    def writeFeature(
      feature: openlayersLib.openlayersMod.Feature,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Encode an array of features as a WKT string.
      *
      * @param features Features.
      * @param opt_options Write options.
      * @return WKT string.
      * @api stable
      */
    def writeFeatures(features: js.Array[openlayersLib.openlayersMod.Feature]): java.lang.String = js.native
    def writeFeatures(
      features: js.Array[openlayersLib.openlayersMod.Feature],
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WriteOptions
    ): java.lang.String = js.native
    /**
      * Write a single geometry as a WKT string.
      *
      * @param geometry Geometry.
      * @return WKT string.
      * @api stable
      */
    def writeGeometry(geometry: openlayersLib.openlayersMod.geomNs.Geometry): java.lang.String = js.native
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
    def read(source: java.lang.String): openlayersLib.openlayersMod.GlobalObject = js.native
    /**
      * Read a WMS capabilities document.
      *
      * @param source The XML source.
      * @return An object representing the WMS capabilities.
      * @api
      */
    def read(source: stdLib.Document): openlayersLib.openlayersMod.GlobalObject = js.native
    def read(source: stdLib.Node): openlayersLib.openlayersMod.GlobalObject = js.native
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
    def this(opt_options: openlayersLib.openlayersMod.olxNs.formatNs.WMSGetFeatureInfoOptions) = this()
    def readFeatures(source: java.lang.String): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: java.lang.String, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: openlayersLib.openlayersMod.GlobalObject): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(
      source: openlayersLib.openlayersMod.GlobalObject,
      opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions
    ): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Read all features from a WMSGetFeatureInfo response.
      *
      * @param source Source.
      * @param opt_options Options.
      * @return Features.
      * @api stable
      */
    def readFeatures(source: stdLib.Document): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Document, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node): js.Array[openlayersLib.openlayersMod.Feature] = js.native
    def readFeatures(source: stdLib.Node, opt_options: openlayersLib.openlayersMod.olxNs.formatNs.ReadOptions): js.Array[openlayersLib.openlayersMod.Feature] = js.native
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
    def read(source: java.lang.String): openlayersLib.openlayersMod.GlobalObject = js.native
    /**
      * Read a WMTS capabilities document.
      *
      * @param source The XML source.
      * @return An object representing the WMTS capabilities.
      * @api
      */
    def read(source: stdLib.Document): openlayersLib.openlayersMod.GlobalObject = js.native
    def read(source: stdLib.Node): openlayersLib.openlayersMod.GlobalObject = js.native
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
  class XMLFeature () extends Feature
  
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
    def decodeDeltas(encoded: java.lang.String, stride: scala.Double): js.Array[scala.Double] = js.native
    def decodeDeltas(encoded: java.lang.String, stride: scala.Double, opt_factor: scala.Double): js.Array[scala.Double] = js.native
    /**
      * Decode a list of floating point numbers from an encoded string
      *
      * @param encoded An encoded string.
      * @param opt_factor The factor by which the result will be divided.
      *     Default is `1e5`.
      * @return A list of floating point numbers.
      * @api
      */
    def decodeFloats(encoded: java.lang.String): js.Array[scala.Double] = js.native
    def decodeFloats(encoded: java.lang.String, opt_factor: scala.Double): js.Array[scala.Double] = js.native
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
    def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double): java.lang.String = js.native
    def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double, opt_factor: scala.Double): java.lang.String = js.native
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
    def encodeFloats(numbers: js.Array[scala.Double]): java.lang.String = js.native
    def encodeFloats(numbers: js.Array[scala.Double], opt_factor: scala.Double): java.lang.String = js.native
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
      def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent) = this()
      def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent, opt_srsName: java.lang.String) = this()
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
      def this(tagName: java.lang.String, propertyName: java.lang.String) = this()
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
      def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String) = this()
      def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double) = this()
      def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
      def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
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
      def this(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String) = this()
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
      def this(propertyName: java.lang.String, expression: java.lang.String) = this()
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
      def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
      def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
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
      def this(tagName: java.lang.String) = this()
      /**
        * The XML tag name for a filter.
        * @returns Name.
        */
      def getTagName(): java.lang.String = js.native
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
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
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
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
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
      def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
      def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
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
      def this(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double) = this()
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
      def this(propertyName: java.lang.String, pattern: java.lang.String) = this()
      def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String) = this()
      def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String) = this()
      def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String) = this()
      def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String, opt_matchCase: scala.Boolean) = this()
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
      def this(propertyName: java.lang.String) = this()
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
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
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
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
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
      def this(propertyName: java.lang.String, expression: java.lang.String) = this()
      def this(propertyName: java.lang.String, expression: scala.Double) = this()
      def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
      def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
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
      def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
      def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
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
      def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
      def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
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
    def bbox(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent): Bbox = js.native
    def bbox(
      geometryName: java.lang.String,
      extent: openlayersLib.openlayersMod.Extent,
      opt_srsName: java.lang.String
    ): Bbox = js.native
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
    def between(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double): IsBetween = js.native
    /**
      * Create a `<During>` temporal operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param begin The begin date in ISO-8601 format.
      * @param end The end date in ISO-8601 format.
      * @returns `<During>` operator.
      * @api
      */
    def during(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String): During = js.native
    /**
      * Creates a `<PropertyIsEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @returns `<PropertyIsEqualTo>` operator.
      * @api
      */
    def equalTo(propertyName: java.lang.String, expression: java.lang.String): EqualTo = js.native
    def equalTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): EqualTo = js.native
    def equalTo(propertyName: java.lang.String, expression: scala.Double): EqualTo = js.native
    def equalTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): EqualTo = js.native
    /**
      * Creates a `<PropertyIsGreaterThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsGreaterThan>` operator.
      * @api
      */
    def greaterThan(propertyName: java.lang.String, expression: scala.Double): GreaterThan = js.native
    /**
      * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
      * @api
      */
    def greaterThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): GreaterThanOrEqualTo = js.native
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
    def intersects(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): Intersects = js.native
    def intersects(
      geometryName: java.lang.String,
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_srsName: java.lang.String
    ): Intersects = js.native
    /**
      * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
      * is null.
      *
      * @param propertyName Name of the context property to compare.
      * @returns `<PropertyIsNull>` operator.
      * @api
      */
    def isNull(propertyName: java.lang.String): IsNull = js.native
    /**
      * Creates a `<PropertyIsLessThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsLessThan>` operator.
      * @api
      */
    def lessThan(propertyName: java.lang.String, expression: scala.Double): LessThan = js.native
    /**
      * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @returns `<PropertyIsLessThanOrEqualTo>` operator.
      * @api
      */
    def lessThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): LessThanOrEqualTo = js.native
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
    def like(propertyName: java.lang.String, pattern: java.lang.String): IsLike = js.native
    def like(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String): IsLike = js.native
    def like(
      propertyName: java.lang.String,
      pattern: java.lang.String,
      opt_wildCard: java.lang.String,
      opt_singleChar: java.lang.String
    ): IsLike = js.native
    def like(
      propertyName: java.lang.String,
      pattern: java.lang.String,
      opt_wildCard: java.lang.String,
      opt_singleChar: java.lang.String,
      opt_escapeChar: java.lang.String
    ): IsLike = js.native
    def like(
      propertyName: java.lang.String,
      pattern: java.lang.String,
      opt_wildCard: java.lang.String,
      opt_singleChar: java.lang.String,
      opt_escapeChar: java.lang.String,
      opt_matchCase: scala.Boolean
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
    def notEqualTo(propertyName: java.lang.String, expression: java.lang.String): NotEqualTo = js.native
    def notEqualTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): NotEqualTo = js.native
    def notEqualTo(propertyName: java.lang.String, expression: scala.Double): NotEqualTo = js.native
    def notEqualTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): NotEqualTo = js.native
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
    def within(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): Within = js.native
    def within(
      geometryName: java.lang.String,
      geometry: openlayersLib.openlayersMod.geomNs.Geometry,
      opt_srsName: java.lang.String
    ): Within = js.native
  }
  
  type EsriJSONGeometry = stdLib.JSON
  type GeoJSONFeature = stdLib.JSON
  type GeoJSONFeatureCollection = stdLib.JSON
  type GeoJSONGeometry = stdLib.JSON
  type GeoJSONGeometryCollection = stdLib.JSON
}

