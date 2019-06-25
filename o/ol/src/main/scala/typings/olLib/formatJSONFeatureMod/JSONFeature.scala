package typings
package olLib.formatJSONFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFeature
  extends olLib.formatFeatureMod.default {
  def readFeature(source: stdLib.ArrayBuffer): olLib.featureMod.default = js.native
  def readFeature(source: stdLib.ArrayBuffer, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  /* protected */ def readFeatureFromObject(`object`: js.Any): olLib.featureMod.default = js.native
  /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
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
  /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: olLib.formatFeatureMod.ReadOptions): js.Array[olLib.featureMod.default] = js.native
  def readGeometry(source: stdLib.ArrayBuffer): olLib.geomGeometryMod.default = js.native
  def readGeometry(source: stdLib.ArrayBuffer, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromObject(`object`: js.Any): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.geomGeometryMod.default = js.native
  def readProjection(source: stdLib.ArrayBuffer): olLib.projProjectionMod.default = js.native
  /* protected */ def readProjectionFromObject(`object`: js.Any): olLib.projProjectionMod.default = js.native
  def writeFeatureObject(feature: olLib.featureMod.default): js.Any = js.native
  def writeFeatureObject(feature: olLib.featureMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): js.Any = js.native
  def writeFeaturesObject(features: js.Array[olLib.featureMod.default]): js.Any = js.native
  def writeFeaturesObject(features: js.Array[olLib.featureMod.default], opt_options: olLib.formatFeatureMod.WriteOptions): js.Any = js.native
  def writeGeometryObject(geometry: olLib.geomGeometryMod.default): js.Any = js.native
  def writeGeometryObject(geometry: olLib.geomGeometryMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): js.Any = js.native
}

