package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.xmlMod.Parser
import typings.ol.xmlMod.Serializer
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGml2Mod {
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format,
    * version 2.1.2.
    *
    * @api
    */
  @JSImport("ol/format/GML2", JSImport.Default)
  @js.native
  open class default () extends GML2
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format,
    * version 2.1.2.
    *
    * @api
    */
  @js.native
  trait GML2
    extends typings.ol.formatGmlbaseMod.default {
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var BOX_PARSERS_ : StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var ENVELOPE_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @const
      * @param {*} value Value.
      * @param {Array<*>} objectStack Object stack.
      * @param {string} [nodeName] Node name.
      * @return {Element|undefined} Node.
      * @private
      */
    /* private */ var GEOMETRY_NODE_FACTORY_ : Any = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var GEOMETRY_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var LINESTRINGORCURVEMEMBER_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @const
      * @param {*} value Value.
      * @param {Array<*>} objectStack Object stack.
      * @param {string} [nodeName] Node name.
      * @return {Node|undefined} Node.
      * @private
      */
    /* private */ var MULTIGEOMETRY_MEMBER_NODE_FACTORY_ : Any = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var POINTMEMBER_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @param {*} value Value.
      * @param {Array<*>} objectStack Object stack.
      * @param {string} [nodeName] Node name.
      * @return {Node} Node.
      * @private
      */
    /* private */ var RING_NODE_FACTORY_ : Any = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var RING_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var SURFACEORPOLYGONMEMBER_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @param {string} namespaceURI XML namespace.
      * @return {Element} coordinates node.
      * @private
      */
    /* private */ var createCoordinatesNode_ : Any = js.native
    
    /**
      * @param {Array<number>} point Point geometry.
      * @param {string} [srsName] Optional srsName
      * @param {boolean} [hasZ] whether the geometry has a Z coordinate (is 3D) or not.
      * @return {string} The coords string.
      * @private
      */
    /* private */ var getCoords_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def innerBoundaryIsParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def outerBoundaryIsParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {import("../extent.js").Extent|undefined} Envelope.
      */
    def readBox(node: Element, objectStack: js.Array[Any]): js.UndefOr[Extent] = js.native
    
    /**
      * @param {Node} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} Flat coordinates.
      */
    def readFlatCoordinates(node: Node, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Node} node Node.
      * @param {import("../geom/LineString.js").default|import("../geom/LinearRing.js").default} value Geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writeCoordinates_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LineString.js").default} geometry LineString geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeCurveOrLineString(node: Element, geometry: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LineString.js").default} line LineString geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writeCurveSegments_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../Feature.js").default} feature Feature.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeFeatureElement(node: Element, feature: typings.ol.renderFeatureMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[Any]): Unit = js.native
    /**
      * @param {Node} node Node.
      * @param {import("../geom/Geometry.js").default|import("../extent.js").Extent} geometry Geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeGeometryElement(node: Node, geometry: typings.ol.geomGeometryMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LineString.js").default} line LineString geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeLineStringOrCurveMember(node: Element, line: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LinearRing.js").default} geometry LinearRing geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeLinearRing(node: Element, geometry: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/MultiLineString.js").default} geometry MultiLineString geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeMultiCurveOrLineString(node: Element, geometry: typings.ol.geomMultiLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/MultiPoint.js").default} geometry MultiPoint geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeMultiPoint(node: Element, geometry: typings.ol.geomMultiPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/MultiPolygon.js").default} geometry MultiPolygon geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeMultiSurfaceOrPolygon(node: Element, geometry: typings.ol.geomMultiPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/Point.js").default} geometry Point geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writePoint(node: Element, geometry: typings.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/Point.js").default} point Point geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writePointMember(node: Element, point: typings.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LinearRing.js").default} ring LinearRing geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeRing(node: Element, ring: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/Polygon.js").default} geometry Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeSurfaceOrPolygon(node: Element, geometry: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Node} node Node.
      * @param {import("../geom/Polygon.js").default} polygon Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeSurfaceOrPolygonMember(node: Node, polygon: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/Polygon.js").default} polygon Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writeSurfacePatches_ : Any = js.native
  }
}
