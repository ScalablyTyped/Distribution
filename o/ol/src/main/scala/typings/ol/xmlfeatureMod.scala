package typings.ol

import typings.ol.featureMod.ReadOptions
import typings.ol.featureMod.WriteOptions
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlfeatureMod {
  
  @JSImport("ol/format/XMLFeature", JSImport.Default)
  @js.native
  abstract class default () extends XMLFeature
  
  @js.native
  trait XMLFeature
    extends typings.ol.featureMod.default {
    
    def readFeatureFromDocument(doc: Document): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    def readFeatureFromNode(node: Element): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    def readFeatureFromNode(node: Element, opt_options: ReadOptions): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /* protected */ def readFeaturesFromNode(node: Element): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Element, opt_options: ReadOptions): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromDocument(doc: Document): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    
    /* protected */ def readGeometryFromNode(node: Element): typings.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Element, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
    
    /* protected */ def readProjectionFromDocument(doc: Document): typings.ol.projectionMod.default = js.native
    
    /* protected */ def readProjectionFromNode(node: Element): typings.ol.projectionMod.default = js.native
    
    /* protected */ def writeFeatureNode(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeFeaturesNode(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeGeometryNode(geometry: typings.ol.geometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typings.ol.geometryMod.default, opt_options: WriteOptions): Node = js.native
  }
}
