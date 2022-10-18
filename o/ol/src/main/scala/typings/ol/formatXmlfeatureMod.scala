package typings.ol

import typings.ol.formatFeatureMod.ReadOptions
import typings.ol.formatFeatureMod.WriteOptions
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatXmlfeatureMod {
  
  /* note: abstract class */ @JSImport("ol/format/XMLFeature", JSImport.Default)
  @js.native
  open class default () extends XMLFeature
  
  @js.native
  trait XMLFeature
    extends typings.ol.formatFeatureMod.default {
    
    def readFeatureFromDocument(doc: Document): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    def readFeatureFromNode(node: Element): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    def readFeatureFromNode(node: Element, opt_options: ReadOptions): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /* protected */ def readFeaturesFromNode(node: Element): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Element, opt_options: ReadOptions): js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromDocument(doc: Document): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readGeometryFromNode(node: Element): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Element, opt_options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readProjectionFromDocument(doc: Document): typings.ol.projProjectionMod.default = js.native
    
    /* protected */ def readProjectionFromNode(node: Element): typings.ol.projProjectionMod.default = js.native
    
    /* protected */ def writeFeatureNode(feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeFeaturesNode(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default, opt_options: WriteOptions): Node = js.native
  }
}
