package typings.ol.formatFeatureMod

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.formatFormatTypeMod.FormatType
import typings.std.ArrayBuffer
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormat extends js.Object {
  var dataProjection: typings.ol.projProjectionMod.default = js.native
  var defaultFeatureProjection: typings.ol.projProjectionMod.default = js.native
  /* protected */ def adaptOptions(options: ReadOptions): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: WriteOptions): WriteOptions | ReadOptions = js.native
  def getLastExtent(): Extent = js.native
  /* protected */ def getReadOptions(source: String): ReadOptions = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node, opt_options: ReadOptions): ReadOptions = js.native
  def getType(): FormatType = js.native
  def readFeature(source: String): FeatureLike = js.native
  def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: js.Object): FeatureLike = js.native
  def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Document): FeatureLike = js.native
  def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Node): FeatureLike = js.native
  def readFeature(source: Node, opt_options: ReadOptions): FeatureLike = js.native
  def readFeatures(source: String): js.Array[FeatureLike] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readGeometry(source: String): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: js.Object): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Document): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Node): typings.ol.geomGeometryMod.default = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  def readProjection(source: String): typings.ol.projProjectionMod.default = js.native
  def readProjection(source: js.Object): typings.ol.projProjectionMod.default = js.native
  def readProjection(source: Document): typings.ol.projProjectionMod.default = js.native
  def readProjection(source: Node): typings.ol.projProjectionMod.default = js.native
  def writeFeature(feature: typings.ol.featureMod.default): String = js.native
  def writeFeature(feature: typings.ol.featureMod.default, opt_options: WriteOptions): String = js.native
  def writeFeatures(features: js.Array[typings.ol.featureMod.default]): String = js.native
  def writeFeatures(features: js.Array[typings.ol.featureMod.default], opt_options: WriteOptions): String = js.native
  def writeGeometry(geometry: typings.ol.geomGeometryMod.default): String = js.native
  def writeGeometry(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
}

