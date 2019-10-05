package typings.openlayers.openlayersMod.format

import typings.openlayers.openlayersMod.GlobalObject
import typings.openlayers.openlayersMod.geom.Geometry
import typings.openlayers.openlayersMod.olx.format.EsriJSONOptions
import typings.openlayers.openlayersMod.olx.format.ReadOptions
import typings.openlayers.openlayersMod.olx.format.WriteOptions
import typings.openlayers.openlayersMod.proj.Projection
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading and writing data in the EsriJSON format.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.EsriJSON")
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

