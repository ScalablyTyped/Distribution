package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import typings.ol.formatXMLFeatureMod.XMLFeature
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/XMLFeature", JSImport.Namespace)
@js.native
object formatXMLFeatureMod extends js.Object {
  @js.native
  trait XMLFeature
    extends typings.ol.formatFeatureMod.default {
    def readFeatureFromDocument(doc: Document): typings.ol.featureMod.default = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
    def readFeatureFromNode(node: Node): typings.ol.featureMod.default = js.native
    def readFeatureFromNode(node: Node, opt_options: ReadOptions): typings.ol.featureMod.default = js.native
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
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typings.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromNode(node: Node): js.Array[typings.ol.featureMod.default] = js.native
    /* protected */ def readFeaturesFromNode(node: Node, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default] = js.native
    /* protected */ def readGeometryFromDocument(doc: Document): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readProjectionFromDocument(doc: Document): typings.ol.projProjectionMod.default = js.native
    /* protected */ def readProjectionFromNode(node: Node): typings.ol.projProjectionMod.default = js.native
    /* protected */ def writeFeatureNode(feature: typings.ol.featureMod.default): Node = js.native
    /* protected */ def writeFeatureNode(feature: typings.ol.featureMod.default, opt_options: WriteOptions): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.ol.featureMod.default]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.ol.featureMod.default], opt_options: WriteOptions): Node = js.native
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): Node = js.native
  }
  
  @js.native
  class default () extends XMLFeature
  
}

