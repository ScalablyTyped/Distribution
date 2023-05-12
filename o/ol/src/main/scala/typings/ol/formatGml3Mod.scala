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

object formatGml3Mod {
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @api
    */
  @JSImport("ol/format/GML3", JSImport.Default)
  @js.native
  open class default () extends GML3
  
  /**
    * @classdesc
    * Feature format for reading and writing data in the GML format
    * version 3.1.1.
    * Currently only supports GML 3.1.1 Simple Features profile.
    *
    * @api
    */
  @js.native
  trait GML3
    extends typings.ol.formatGmlbaseMod.default {
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var CURVEMEMBER_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var CURVE_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var ENVELOPE_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
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
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var GEOMETRY_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var LINESTRINGORCURVEMEMBER_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var MULTICURVE_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
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
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var MULTISURFACE_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var PATCHES_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
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
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var SEGMENTS_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var SURFACEMEMBER_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @type {Object<string, Object<string, import("../xml.js").Serializer>>}
      */
    var SURFACEORPOLYGONMEMBER_SERIALIZERS: StringDictionary[StringDictionary[Serializer]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var SURFACE_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def curveMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var curve_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def exteriorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Array<number>} point Point geometry.
      * @param {string} [srsName] Optional srsName
      * @param {boolean} [hasZ] whether the geometry has a Z coordinate (is 3D) or not.
      * @return {string} The coords string.
      * @private
      */
    /* private */ var getCoords_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var hasZ: Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def interiorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var multiCurve_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var multiSurface_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {LineString|undefined} LineString.
      */
    def readCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomLineStringMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {import("../extent.js").Extent|undefined} Envelope.
      */
    def readEnvelope(node: Element, objectStack: js.Array[Any]): js.UndefOr[Extent] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} Polygon.
      */
    def readFlatCurveRing(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Node} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} Flat coordinates.
      */
    def readFlatPos(node: Node, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} Flat coordinates.
      */
    def readFlatPosList(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} flat coordinates.
      */
    def readLineStringSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {MultiLineString|undefined} MultiLineString.
      */
    def readMultiCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiLineStringMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {MultiPolygon|undefined} MultiPolygon.
      */
    def readMultiSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiPolygonMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<(Array<number>)>|undefined} flat coordinates.
      */
    def readPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<(Array<number>)>|undefined} flat coordinates.
      */
    def readPolygonPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} flat coordinates.
      */
    def readSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Polygon|undefined} Polygon.
      */
    def readSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomPolygonMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def surfaceMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var surface_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {LineString} geometry LineString geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeCurveOrLineString(node: Element, geometry: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {LineString} line LineString geometry.
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
    
    /**
      * @param {Node} node Node.
      * @param {Array<import("../Feature.js").default>} features Features.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writeFeatureMembers_ : Any = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[Any]): Unit = js.native
    /**
      * @param {Node} node Node.
      * @param {import("../geom/Geometry.js").default|import("../extent.js").Extent} geometry Geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeGeometryElement(node: Node, geometry: typings.ol.geomGeometryMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Node} node Node.
      * @param {LineString} line LineString geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeLineStringOrCurveMember(node: Node, line: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LinearRing.js").default} geometry LinearRing geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeLinearRing(node: Element, geometry: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {MultiLineString} geometry MultiLineString geometry.
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
      * @param {MultiPolygon} geometry MultiPolygon geometry.
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
      * @param {LineString|import("../geom/LinearRing.js").default} value Geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writePosList_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/Point.js").default} value Point geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writePos_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {import("../geom/LinearRing.js").default} ring LinearRing geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeRing(node: Element, ring: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Polygon} geometry Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeSurfaceOrPolygon(node: Element, geometry: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Node} node Node.
      * @param {Polygon} polygon Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      */
    def writeSurfaceOrPolygonMember(node: Node, polygon: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Polygon} polygon Polygon geometry.
      * @param {Array<*>} objectStack Node stack.
      * @private
      */
    /* private */ var writeSurfacePatches_ : Any = js.native
  }
}
