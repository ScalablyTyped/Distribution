package typings.ol.formatTextFeatureMod

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFeature
  extends typings.ol.formatFeatureMod.default {
  /* protected */ def readFeatureFromText(text: String): typings.ol.featureMod.default = js.native
  /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: String): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: String, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: js.Object): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: js.Object, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: Document): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: Document, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: Node): typings.ol.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: Node, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
  /* protected */ def readFeaturesFromText(text: String): js.Array[typings.ol.featureMod.default] = js.native
  /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default] = js.native
  /* protected */ def readGeometryFromText(text: String): typings.ol.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
  /* protected */ def readProjectionFromText(text: String): typings.ol.projProjectionMod.default = js.native
  /* protected */ def writeFeatureText(feature: typings.ol.featureMod.default): String = js.native
  /* protected */ def writeFeatureText(feature: typings.ol.featureMod.default, opt_options: WriteOptions): String = js.native
  /* protected */ def writeFeaturesText(features: js.Array[typings.ol.featureMod.default]): String = js.native
  /* protected */ def writeFeaturesText(features: js.Array[typings.ol.featureMod.default], opt_options: WriteOptions): String = js.native
  /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default): String = js.native
  /* protected */ def writeGeometryText(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
}

