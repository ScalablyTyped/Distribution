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
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for XML feature formats.
    *
    * @abstract
    */
  @JSImport("ol/format/XMLFeature", JSImport.Default)
  @js.native
  open class default () extends XMLFeature
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for XML feature formats.
    *
    * @abstract
    */
  @js.native
  trait XMLFeature
    extends typings.ol.formatFeatureMod.default {
    
    /**
      * @param {Document} doc Document.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @return {import("../Feature.js").default} Feature.
      */
    def readFeatureFromDocument(doc: Document): typings.ol.renderFeatureMod.default = js.native
    def readFeatureFromDocument(doc: Document, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @return {import("../Feature.js").default} Feature.
      */
    def readFeatureFromNode(node: Element): typings.ol.renderFeatureMod.default = js.native
    def readFeatureFromNode(node: Element, options: ReadOptions): typings.ol.renderFeatureMod.default = js.native
    
    /**
      * @param {Document} doc Document.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @protected
      * @return {Array<import("../Feature.js").default>} Features.
      */
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[typings.ol.renderFeatureMod.default] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, options: ReadOptions): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @abstract
      * @param {Element} node Node.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @protected
      * @return {Array<import("../Feature.js").default>} Features.
      */
    /* protected */ def readFeaturesFromNode(node: Element): js.Array[typings.ol.renderFeatureMod.default] = js.native
    /* protected */ def readFeaturesFromNode(node: Element, options: ReadOptions): js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @param {Document} doc Document.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromDocument(doc: Document): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("./Feature.js").ReadOptions} [options] Options.
      * @protected
      * @return {import("../geom/Geometry.js").default} Geometry.
      */
    /* protected */ def readGeometryFromNode(node: Element): typings.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Element, options: ReadOptions): typings.ol.geomGeometryMod.default = js.native
    
    /**
      * @param {Document} doc Document.
      * @protected
      * @return {import("../proj/Projection.js").default} Projection.
      */
    /* protected */ def readProjectionFromDocument(doc: Document): typings.ol.projProjectionMod.default = js.native
    
    /**
      * @param {Element} node Node.
      * @protected
      * @return {import("../proj/Projection.js").default} Projection.
      */
    /* protected */ def readProjectionFromNode(node: Element): typings.ol.projProjectionMod.default = js.native
    
    /**
      * @param {import("../Feature.js").default} feature Feature.
      * @param {import("./Feature.js").WriteOptions} [options] Options.
      * @protected
      * @return {Node} Node.
      */
    /* protected */ def writeFeatureNode(feature: typings.ol.renderFeatureMod.default): Node = js.native
    /* protected */ def writeFeatureNode(feature: typings.ol.renderFeatureMod.default, options: WriteOptions): Node = js.native
    
    /**
      * @param {Array<import("../Feature.js").default>} features Features.
      * @param {import("./Feature.js").WriteOptions} [options] Options.
      * @return {Node} Node.
      */
    def writeFeaturesNode(features: js.Array[typings.ol.renderFeatureMod.default]): Node = js.native
    def writeFeaturesNode(features: js.Array[typings.ol.renderFeatureMod.default], options: WriteOptions): Node = js.native
    
    /**
      * @param {import("../geom/Geometry.js").default} geometry Geometry.
      * @param {import("./Feature.js").WriteOptions} [options] Options.
      * @return {Node} Node.
      */
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typings.ol.geomGeometryMod.default, options: WriteOptions): Node = js.native
    
    /**
      * @type {XMLSerializer}
      * @private
      */
    /* private */ var xmlSerializer_ : Any = js.native
  }
}
