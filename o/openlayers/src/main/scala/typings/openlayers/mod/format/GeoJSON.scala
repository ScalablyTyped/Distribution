package typings.openlayers.mod.format

import typings.openlayers.mod.GlobalObject
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.olx.format.GeoJSONOptions
import typings.openlayers.mod.olx.format.ReadOptions
import typings.openlayers.mod.olx.format.WriteOptions
import typings.openlayers.mod.proj.Projection
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the GeoJSON format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.GeoJSON")
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
  
  def readFeature(source: String): typings.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typings.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  /**
    * Read a feature from a GeoJSON Feature source.  Only works for Feature,
    * use `readFeatures` to read FeatureCollection source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api stable
    */
  def readFeature(source: Document): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typings.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typings.openlayers.mod.Feature = js.native
  
  def readFeatures(source: String): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a GeoJSON source.  Works with both Feature and
    * FeatureCollection sources.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typings.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typings.openlayers.mod.Feature] = js.native
  
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
  def writeFeature(feature: typings.openlayers.mod.Feature): String = js.native
  def writeFeature(feature: typings.openlayers.mod.Feature, opt_options: WriteOptions): String = js.native
  
  /**
    * Encode a feature as a GeoJSON Feature object.
    *
    * @param feature Feature.
    * @param opt_options Write options.
    * @return Object.
    * @api stable
    */
  def writeFeatureObject(feature: typings.openlayers.mod.Feature): GeoJSONFeature = js.native
  def writeFeatureObject(feature: typings.openlayers.mod.Feature, opt_options: WriteOptions): GeoJSONFeature = js.native
  
  /**
    * Encode an array of features as GeoJSON.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return GeoJSON.
    * @api stable
    */
  def writeFeatures(features: js.Array[typings.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typings.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features as a GeoJSON object.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return GeoJSON Object.
    * @api stable
    */
  def writeFeaturesObject(features: js.Array[typings.openlayers.mod.Feature]): GeoJSONFeatureCollection = js.native
  def writeFeaturesObject(features: js.Array[typings.openlayers.mod.Feature], opt_options: WriteOptions): GeoJSONFeatureCollection = js.native
  
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
