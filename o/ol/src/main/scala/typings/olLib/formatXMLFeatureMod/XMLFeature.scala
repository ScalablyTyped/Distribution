package typings
package olLib.formatXMLFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLFeature
  extends olLib.formatFeatureMod.default {
  def readFeatureFromDocument(doc: stdLib.Document): olLib.featureMod.default = js.native
  def readFeatureFromDocument(doc: stdLib.Document, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  def readFeatureFromNode(node: stdLib.Node): olLib.featureMod.default = js.native
  def readFeatureFromNode(node: stdLib.Node, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: java.lang.String): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: java.lang.String, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: org.scalablytyped.runtime.StringDictionary[js.Any]): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(
    source: org.scalablytyped.runtime.StringDictionary[js.Any],
    opt_options: olLib.formatFeatureMod.ReadOptions
  ): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Document): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Document, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Node): olLib.featureMod.default = js.native
  @JSName("readFeature")
  def readFeature_default(source: stdLib.Node, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.featureMod.default = js.native
  /* protected */ def readFeaturesFromDocument(doc: stdLib.Document): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readFeaturesFromDocument(doc: stdLib.Document, opt_options: olLib.formatFeatureMod.ReadOptions): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readFeaturesFromNode(node: stdLib.Node): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readFeaturesFromNode(node: stdLib.Node, opt_options: olLib.formatFeatureMod.ReadOptions): js.Array[olLib.featureMod.default] = js.native
  /* protected */ def readGeometryFromDocument(doc: stdLib.Document): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromDocument(doc: stdLib.Document, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromNode(node: stdLib.Node): olLib.geomGeometryMod.default = js.native
  /* protected */ def readGeometryFromNode(node: stdLib.Node, opt_options: olLib.formatFeatureMod.ReadOptions): olLib.geomGeometryMod.default = js.native
  /* protected */ def readProjectionFromDocument(doc: stdLib.Document): olLib.projProjectionMod.default = js.native
  /* protected */ def readProjectionFromNode(node: stdLib.Node): olLib.projProjectionMod.default = js.native
  /* protected */ def writeFeatureNode(feature: olLib.featureMod.default): stdLib.Node = js.native
  /* protected */ def writeFeatureNode(feature: olLib.featureMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): stdLib.Node = js.native
  def writeFeaturesNode(features: js.Array[olLib.featureMod.default]): stdLib.Node = js.native
  def writeFeaturesNode(features: js.Array[olLib.featureMod.default], opt_options: olLib.formatFeatureMod.WriteOptions): stdLib.Node = js.native
  def writeGeometryNode(geometry: olLib.geomGeometryMod.default): stdLib.Node = js.native
  def writeGeometryNode(geometry: olLib.geomGeometryMod.default, opt_options: olLib.formatFeatureMod.WriteOptions): stdLib.Node = js.native
}

