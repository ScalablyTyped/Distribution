package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.xmlMod.Parser
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGmlbaseMod {
  
  /**
    * @typedef {Object} Options
    * @property {Object<string, string>|string} [featureNS] Feature
    * namespace. If not defined will be derived from GML. If multiple
    * feature types have been configured which come from different feature
    * namespaces, this will be an object with the keys being the prefixes used
    * in the entries of featureType array. The values of the object will be the
    * feature namespaces themselves. So for instance there might be a featureType
    * item `topp:states` in the `featureType` array and then there will be a key
    * `topp` in the featureNS object with value `http://www.openplans.org/topp`.
    * @property {Array<string>|string} [featureType] Feature type(s) to parse.
    * If multiple feature types need to be configured
    * which come from different feature namespaces, `featureNS` will be an object
    * with the keys being the prefixes used in the entries of featureType array.
    * The values of the object will be the feature namespaces themselves.
    * So for instance there might be a featureType item `topp:states` and then
    * there will be a key named `topp` in the featureNS object with value
    * `http://www.openplans.org/topp`.
    * @property {string} [srsName] srsName to use when writing geometries.
    * @property {boolean} [surface=false] Write gml:Surface instead of gml:Polygon
    * elements. This also affects the elements in multi-part geometries.
    * @property {boolean} [curve=false] Write gml:Curve instead of gml:LineString
    * elements. This also affects the elements in multi-part geometries.
    * @property {boolean} [multiCurve=true] Write gml:MultiCurve instead of gml:MultiLineString.
    * Since the latter is deprecated in GML 3.
    * @property {boolean} [multiSurface=true] Write gml:multiSurface instead of
    * gml:MultiPolygon. Since the latter is deprecated in GML 3.
    * @property {string} [schemaLocation] Optional schemaLocation to use when
    * writing out the GML, this will override the default provided.
    * @property {boolean} [hasZ=false] If coordinates have a Z value.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Feature base format for reading and writing data in the GML format.
    * This class cannot be instantiated, it contains only base content that
    * is shared with versioned format classes GML2 and GML3.
    *
    * @abstract
    * @api
    */
  @JSImport("ol/format/GMLBase", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class default () extends GMLBase {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/format/GMLBase", "GMLNS")
  @js.native
  val GMLNS: String = js.native
  
  /**
    * @typedef {Object} Options
    * @property {Object<string, string>|string} [featureNS] Feature
    * namespace. If not defined will be derived from GML. If multiple
    * feature types have been configured which come from different feature
    * namespaces, this will be an object with the keys being the prefixes used
    * in the entries of featureType array. The values of the object will be the
    * feature namespaces themselves. So for instance there might be a featureType
    * item `topp:states` in the `featureType` array and then there will be a key
    * `topp` in the featureNS object with value `http://www.openplans.org/topp`.
    * @property {Array<string>|string} [featureType] Feature type(s) to parse.
    * If multiple feature types need to be configured
    * which come from different feature namespaces, `featureNS` will be an object
    * with the keys being the prefixes used in the entries of featureType array.
    * The values of the object will be the feature namespaces themselves.
    * So for instance there might be a featureType item `topp:states` and then
    * there will be a key named `topp` in the featureNS object with value
    * `http://www.openplans.org/topp`.
    * @property {string} [srsName] srsName to use when writing geometries.
    * @property {boolean} [surface=false] Write gml:Surface instead of gml:Polygon
    * elements. This also affects the elements in multi-part geometries.
    * @property {boolean} [curve=false] Write gml:Curve instead of gml:LineString
    * elements. This also affects the elements in multi-part geometries.
    * @property {boolean} [multiCurve=true] Write gml:MultiCurve instead of gml:MultiLineString.
    * Since the latter is deprecated in GML 3.
    * @property {boolean} [multiSurface=true] Write gml:multiSurface instead of
    * gml:MultiPolygon. Since the latter is deprecated in GML 3.
    * @property {string} [schemaLocation] Optional schemaLocation to use when
    * writing out the GML, this will override the default provided.
    * @property {boolean} [hasZ=false] If coordinates have a Z value.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Feature base format for reading and writing data in the GML format.
    * This class cannot be instantiated, it contains only base content that
    * is shared with versioned format classes GML2 and GML3.
    *
    * @abstract
    * @api
    */
  @js.native
  trait GMLBase
    extends typings.ol.formatXmlfeatureMod.default {
    
    /**
      * @type {Object<string, Object<string, Object>>}
      */
    var FEATURE_COLLECTION_PARSERS: StringDictionary[StringDictionary[Any]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var FLAT_LINEAR_RINGS_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var GEOMETRY_FLAT_COORDINATES_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var GEOMETRY_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var LINESTRINGMEMBER_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var MULTILINESTRING_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var MULTIPOINT_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var MULTIPOLYGON_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var POINTMEMBER_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var POLYGONMEMBER_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @const
      * @type {Object<string, Object<string, import("../xml.js").Parser>>}
      */
    var RING_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
    
    /**
      * @protected
      * @type {Object<string, string>|string|undefined}
      */
    /* protected */ var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
    
    /**
      * @protected
      * @type {Array<string>|string|undefined}
      */
    /* protected */ var featureType: js.UndefOr[js.Array[String] | String] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def lineStringMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    var namespace: String = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def pointMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      */
    def polygonMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {import("../extent.js").Extent|undefined} Geometry.
      */
    def readExtentElement(node: Element, objectStack: js.Array[Any]): js.UndefOr[Extent] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Feature} Feature.
      */
    def readFeatureElement(node: Element, objectStack: js.Array[Any]): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @param {boolean} asFeature whether result should be wrapped as a feature.
      * @return {Feature|Object} Feature
      */
    def readFeatureElementInternal(node: Element, objectStack: js.Array[Any], asFeature: Boolean): typings.ol.featureMod.default[typings.ol.geomGeometryMod.default] | Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<Feature> | undefined} Features.
      */
    def readFeaturesInternal(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>} Flat coordinates.
      */
    def readFlatCoordinatesFromNode(node: Element, objectStack: js.Array[Any]): js.Array[Double] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Array<number>|undefined} LinearRing flat coordinates.
      */
    def readFlatLinearRing(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {import("../geom/Geometry.js").default|undefined} Geometry.
      */
    def readGeometryElement(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {import("../geom/Geometry.js").default|import("../extent.js").Extent|undefined} Geometry.
      */
    def readGeometryOrExtent(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomGeometryMod.default | Extent] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {LineString|undefined} LineString.
      */
    def readLineString(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomLineStringMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {LinearRing|undefined} LinearRing.
      */
    def readLinearRing(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomLinearRingMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {MultiLineString|undefined} MultiLineString.
      */
    def readMultiLineString(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiLineStringMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {MultiPoint|undefined} MultiPoint.
      */
    def readMultiPoint(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiPointMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {MultiPolygon|undefined} MultiPolygon.
      */
    def readMultiPolygon(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiPolygonMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Point|undefined} Point.
      */
    def readPoint(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomPointMod.default] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @return {Polygon|undefined} Polygon.
      */
    def readPolygon(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomPolygonMod.default] = js.native
    
    /**
      * @protected
      * @type {string}
      */
    /* protected */ var schemaLocation: String = js.native
    
    /**
      * @protected
      * @type {string|undefined}
      */
    /* protected */ var srsName: js.UndefOr[String] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Write gml:Curve instead of gml:LineString
      * elements. This also affects the elements in multi-part geometries.
      */
    var curve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Feature
      * namespace. If not defined will be derived from GML. If multiple
      * feature types have been configured which come from different feature
      * namespaces, this will be an object with the keys being the prefixes used
      * in the entries of featureType array. The values of the object will be the
      * feature namespaces themselves. So for instance there might be a featureType
      * item `topp:states` in the `featureType` array and then there will be a key
      * `topp` in the featureNS object with value `http://www.openplans.org/topp`.
      */
    var featureNS: js.UndefOr[String | StringDictionary[String]] = js.undefined
    
    /**
      * Feature type(s) to parse.
      * If multiple feature types need to be configured
      * which come from different feature namespaces, `featureNS` will be an object
      * with the keys being the prefixes used in the entries of featureType array.
      * The values of the object will be the feature namespaces themselves.
      * So for instance there might be a featureType item `topp:states` and then
      * there will be a key named `topp` in the featureNS object with value
      * `http://www.openplans.org/topp`.
      */
    var featureType: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * If coordinates have a Z value.
      */
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write gml:MultiCurve instead of gml:MultiLineString.
      * Since the latter is deprecated in GML 3.
      */
    var multiCurve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write gml:multiSurface instead of
      * gml:MultiPolygon. Since the latter is deprecated in GML 3.
      */
    var multiSurface: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional schemaLocation to use when
      * writing out the GML, this will override the default provided.
      */
    var schemaLocation: js.UndefOr[String] = js.undefined
    
    /**
      * srsName to use when writing geometries.
      */
    var srsName: js.UndefOr[String] = js.undefined
    
    /**
      * Write gml:Surface instead of gml:Polygon
      * elements. This also affects the elements in multi-part geometries.
      */
    var surface: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCurve(value: Boolean): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setFeatureNS(value: String | StringDictionary[String]): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      inline def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
      
      inline def setFeatureType(value: String | js.Array[String]): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
      
      inline def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value*))
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      inline def setMultiCurve(value: Boolean): Self = StObject.set(x, "multiCurve", value.asInstanceOf[js.Any])
      
      inline def setMultiCurveUndefined: Self = StObject.set(x, "multiCurve", js.undefined)
      
      inline def setMultiSurface(value: Boolean): Self = StObject.set(x, "multiSurface", value.asInstanceOf[js.Any])
      
      inline def setMultiSurfaceUndefined: Self = StObject.set(x, "multiSurface", js.undefined)
      
      inline def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
      
      inline def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
      
      inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      inline def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
      
      inline def setSurface(value: Boolean): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    }
  }
}
