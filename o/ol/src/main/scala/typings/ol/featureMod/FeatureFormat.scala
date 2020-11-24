package typings.ol.featureMod

import typings.ol.formatTypeMod.FormatType
import typings.ol.olFeatureMod.FeatureLike
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormat extends js.Object {
  
  /**
    * Sets the dataProjection on the options, if no dataProjection
    * is set.
    */
  /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
  
  var dataProjection: typings.ol.projectionMod.default = js.native
  
  var defaultFeatureProjection: typings.ol.projectionMod.default = js.native
  
  /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /**
    * Adds the data projection to the read options.
    */
  /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Element): js.UndefOr[ReadOptions] = js.native
  /* protected */ def getReadOptions(source: Element, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
  
  def getType(): FormatType = js.native
  
  def readFeature(source: String): FeatureLike = js.native
  def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: js.Object): FeatureLike = js.native
  def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
  /**
    * Read a single feature from a source.
    */
  def readFeature(source: Document): FeatureLike = js.native
  def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Element): FeatureLike = js.native
  def readFeature(source: Element, opt_options: ReadOptions): FeatureLike = js.native
  
  def readFeatures(source: String): js.Array[FeatureLike] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  /**
    * Read all features from a source.
    */
  def readFeatures(source: Document): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Element): js.Array[FeatureLike] = js.native
  def readFeatures(source: Element, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  
  def readGeometry(source: String): typings.ol.geometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object): typings.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  /**
    * Read a single geometry from a source.
    */
  def readGeometry(source: Document): typings.ol.geometryMod.default = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  def readGeometry(source: Element): typings.ol.geometryMod.default = js.native
  def readGeometry(source: Element, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  
  def readProjection(source: String): typings.ol.projectionMod.default = js.native
  def readProjection(source: js.Object): typings.ol.projectionMod.default = js.native
  /**
    * Read the projection from a source.
    */
  def readProjection(source: Document): typings.ol.projectionMod.default = js.native
  def readProjection(source: Element): typings.ol.projectionMod.default = js.native
  
  /**
    * Encode a feature in this format.
    */
  def writeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): String = js.native
  def writeFeature(
    feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
    opt_options: WriteOptions
  ): String = js.native
  
  /**
    * Encode an array of features in this format.
    */
  def writeFeatures(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): String = js.native
  def writeFeatures(
    features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    opt_options: WriteOptions
  ): String = js.native
  
  /**
    * Write a single geometry in this format.
    */
  def writeGeometry(geometry: typings.ol.geometryMod.default): String = js.native
  def writeGeometry(geometry: typings.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
}
