package typings
package olLib.formatTextFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFeature
  extends olLib.formatFeatureMod.default {
  /* protected */ def readFeatureFromText(text: java.lang.String): olLib.featureMod.default = js.native
  /* protected */ def readFeatureFromText(text: java.lang.String, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: java.lang.String): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: java.lang.String, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: js.Object): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: js.Object, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Document): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Document, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Node): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Node, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  /* protected */ def readFeaturesFromText(text: java.lang.String): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readFeaturesFromText(text: java.lang.String, opt_options: olLib.formatFeatureMod.ReadOptions): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readGeometryFromText(text: java.lang.String): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromText(text: java.lang.String, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.geomGeometryMod.default = js.native
  /* protected */ def readProjectionFromText(text: java.lang.String): olLib.projProjectionMod.default = js.native
  /* protected */ def writeFeatureText(feature: olLib.featureMod.default): java.lang.String = js.native
  /* protected */ def writeFeatureText(feature: olLib.featureMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): java.lang.String = js.native
  /* protected */ def writeFeaturesText(features: js.Array[olLib.featureMod.default]): java.lang.String = js.native
  /* protected */ def writeFeaturesText(features: js.Array[olLib.featureMod.default], opt_options: olLib.formatFeatureMod.WriteOptions): java.lang.String = js.native
  /* protected */ def writeGeometryText(geometry: olLib.geomGeometryMod.default): java.lang.String = js.native
  /* protected */ def writeGeometryText(geometry: olLib.geomGeometryMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): java.lang.String = js.native
}

