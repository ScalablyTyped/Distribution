package typings.ol

import typings.ol.styleIconMod.IconAnchorUnits
import typings.ol.styleIconMod.IconOrigin
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatKmlMod {
  
  @JSImport("ol/format/KML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [extractStyles=true] Extract styles from the KML.
    * @property {boolean} [showPointNames=true] Show names as labels for placemarks which contain points.
    * @property {Array<Style>} [defaultStyle] Default style. The
    * default default style is the same as Google Earth.
    * @property {boolean} [writeStyles=true] Write styles into KML.
    * @property {null|string} [crossOrigin='anonymous'] The `crossOrigin` attribute for loaded images. Note that you must provide a
    * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * @property {IconUrlFunction} [iconUrlFunction] Function that takes a url string and returns a url string.
    * Might be used to change an icon path or to substitute a data url obtained from a KMZ array buffer.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the KML format.
    *
    * {@link module:ol/format/KML~KML#readFeature} will read the first feature from
    * a KML source.
    *
    * MultiGeometries are converted into GeometryCollections if they are a mix of
    * geometry types, and into MultiPoint/MultiLineString/MultiPolygon if they are
    * all of the same type.
    *
    * @api
    */
  @JSImport("ol/format/KML", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends KML {
    def this(options: Options) = this()
  }
  
  inline def getDefaultFillStyle(): typings.ol.styleFillMod.default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFillStyle")().asInstanceOf[typings.ol.styleFillMod.default | Null]
  
  inline def getDefaultImageStyle(): typings.ol.styleImageMod.default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultImageStyle")().asInstanceOf[typings.ol.styleImageMod.default | Null]
  
  inline def getDefaultStrokeStyle(): typings.ol.styleStrokeMod.default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStrokeStyle")().asInstanceOf[typings.ol.styleStrokeMod.default | Null]
  
  inline def getDefaultStyle(): typings.ol.styleStyleMod.default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyle")().asInstanceOf[typings.ol.styleStyleMod.default | Null]
  
  inline def getDefaultStyleArray(): js.Array[typings.ol.styleStyleMod.default] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyleArray")().asInstanceOf[js.Array[typings.ol.styleStyleMod.default] | Null]
  
  inline def getDefaultTextStyle(): typings.ol.styleTextMod.default | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextStyle")().asInstanceOf[typings.ol.styleTextMod.default | Null]
  
  inline def readFlatCoordinates(node: Node): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFlatCoordinates")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  trait GxTrackObject extends StObject {
    
    /**
      * Coordinates.
      */
    var coordinates: js.Array[js.Array[Double]]
    
    /**
      * Whens.
      */
    var whens: js.Array[Double]
  }
  object GxTrackObject {
    
    inline def apply(coordinates: js.Array[js.Array[Double]], whens: js.Array[Double]): GxTrackObject = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], whens = whens.asInstanceOf[js.Any])
      __obj.asInstanceOf[GxTrackObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GxTrackObject] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setWhens(value: js.Array[Double]): Self = StObject.set(x, "whens", value.asInstanceOf[js.Any])
      
      inline def setWhensVarargs(value: Double*): Self = StObject.set(x, "whens", js.Array(value*))
    }
  }
  
  type IconUrlFunction = js.Function1[/* arg0 */ String, String]
  
  /**
    * @typedef {Object} Options
    * @property {boolean} [extractStyles=true] Extract styles from the KML.
    * @property {boolean} [showPointNames=true] Show names as labels for placemarks which contain points.
    * @property {Array<Style>} [defaultStyle] Default style. The
    * default default style is the same as Google Earth.
    * @property {boolean} [writeStyles=true] Write styles into KML.
    * @property {null|string} [crossOrigin='anonymous'] The `crossOrigin` attribute for loaded images. Note that you must provide a
    * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * @property {IconUrlFunction} [iconUrlFunction] Function that takes a url string and returns a url string.
    * Might be used to change an icon path or to substitute a data url obtained from a KMZ array buffer.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the KML format.
    *
    * {@link module:ol/format/KML~KML#readFeature} will read the first feature from
    * a KML source.
    *
    * MultiGeometries are converted into GeometryCollections if they are a mix of
    * geometry types, and into MultiPoint/MultiLineString/MultiPolygon if they are
    * all of the same type.
    *
    * @api
    */
  @js.native
  trait KML
    extends typings.ol.formatXmlfeatureMod.default {
    
    /**
      * @type {null|string}
      */
    var crossOrigin_ : Null | String = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_KML: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @private
      * @type {Array<Style>}
      */
    /* private */ var defaultStyle_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var extractStyles_ : Any = js.native
    
    /**
      * @type {IconUrlFunction}
      */
    def iconUrlFunction_(arg0: String): String = js.native
    /**
      * @type {IconUrlFunction}
      */
    @JSName("iconUrlFunction_")
    var iconUrlFunction__Original: IconUrlFunction = js.native
    
    /**
      * @param {Node} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @private
      * @return {Array<Feature>|undefined} Features.
      */
    /* private */ var readDocumentOrFolder_ : Any = js.native
    
    def readName(source: String): js.UndefOr[String] = js.native
    /**
      * Read the name of the KML.
      *
      * @param {Document|Element|string} source Source.
      * @return {string|undefined} Name.
      * @api
      */
    def readName(source: Document): js.UndefOr[String] = js.native
    def readName(source: Element): js.UndefOr[String] = js.native
    
    /**
      * @param {Document} doc Document.
      * @return {string|undefined} Name.
      */
    def readNameFromDocument(doc: Document): js.UndefOr[String] = js.native
    
    /**
      * @param {Element} node Node.
      * @return {string|undefined} Name.
      */
    def readNameFromNode(node: Element): js.UndefOr[String] = js.native
    
    def readNetworkLinks(source: String): js.Array[Any] = js.native
    /**
      * Read the network links of the KML.
      *
      * @param {Document|Element|string} source Source.
      * @return {Array<Object>} Network links.
      * @api
      */
    def readNetworkLinks(source: Document): js.Array[Any] = js.native
    def readNetworkLinks(source: Element): js.Array[Any] = js.native
    
    /**
      * @param {Document} doc Document.
      * @return {Array<Object>} Network links.
      */
    def readNetworkLinksFromDocument(doc: Document): js.Array[Any] = js.native
    
    /**
      * @param {Element} node Node.
      * @return {Array<Object>} Network links.
      */
    def readNetworkLinksFromNode(node: Element): js.Array[Any] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @private
      * @return {Feature|undefined} Feature.
      */
    /* private */ var readPlacemark_ : Any = js.native
    
    def readRegion(source: String): js.Array[Any] = js.native
    /**
      * Read the regions of the KML.
      *
      * @param {Document|Element|string} source Source.
      * @return {Array<Object>} Regions.
      * @api
      */
    def readRegion(source: Document): js.Array[Any] = js.native
    def readRegion(source: Element): js.Array[Any] = js.native
    
    /**
      * @param {Document} doc Document.
      * @return {Array<Object>} Region.
      */
    def readRegionFromDocument(doc: Document): js.Array[Any] = js.native
    
    /**
      * @param {Element} node Node.
      * @return {Array<Object>} Region.
      * @api
      */
    def readRegionFromNode(node: Element): js.Array[Any] = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @private
      */
    /* private */ var readSharedStyleMap_ : Any = js.native
    
    /**
      * @param {Element} node Node.
      * @param {Array<*>} objectStack Object stack.
      * @private
      */
    /* private */ var readSharedStyle_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, (Array<Style>|string)>}
      */
    /* private */ var sharedStyles_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var showPointNames_ : Any = js.native
    
    /**
      * @type {boolean}
      */
    var writeStyles_ : Boolean = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The `crossOrigin` attribute for loaded images. Note that you must provide a
      * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Default style. The
      * default default style is the same as Google Earth.
      */
    var defaultStyle: js.UndefOr[js.Array[typings.ol.styleStyleMod.default]] = js.undefined
    
    /**
      * Extract styles from the KML.
      */
    var extractStyles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that takes a url string and returns a url string.
      * Might be used to change an icon path or to substitute a data url obtained from a KMZ array buffer.
      */
    var iconUrlFunction: js.UndefOr[IconUrlFunction] = js.undefined
    
    /**
      * Show names as labels for placemarks which contain points.
      */
    var showPointNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write styles into KML.
      */
    var writeStyles: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDefaultStyle(value: js.Array[typings.ol.styleStyleMod.default]): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setDefaultStyleVarargs(value: typings.ol.styleStyleMod.default*): Self = StObject.set(x, "defaultStyle", js.Array(value*))
      
      inline def setExtractStyles(value: Boolean): Self = StObject.set(x, "extractStyles", value.asInstanceOf[js.Any])
      
      inline def setExtractStylesUndefined: Self = StObject.set(x, "extractStyles", js.undefined)
      
      inline def setIconUrlFunction(value: /* arg0 */ String => String): Self = StObject.set(x, "iconUrlFunction", js.Any.fromFunction1(value))
      
      inline def setIconUrlFunctionUndefined: Self = StObject.set(x, "iconUrlFunction", js.undefined)
      
      inline def setShowPointNames(value: Boolean): Self = StObject.set(x, "showPointNames", value.asInstanceOf[js.Any])
      
      inline def setShowPointNamesUndefined: Self = StObject.set(x, "showPointNames", js.undefined)
      
      inline def setWriteStyles(value: Boolean): Self = StObject.set(x, "writeStyles", value.asInstanceOf[js.Any])
      
      inline def setWriteStylesUndefined: Self = StObject.set(x, "writeStyles", js.undefined)
    }
  }
  
  trait Vec2 extends StObject {
    
    /**
      * Origin.
      */
    var origin: js.UndefOr[IconOrigin] = js.undefined
    
    /**
      * X coordinate.
      */
    var x: Double
    
    /**
      * Units of x.
      */
    var xunits: IconAnchorUnits
    
    /**
      * Y coordinate.
      */
    var y: Double
    
    /**
      * Units of Y.
      */
    var yunits: IconAnchorUnits
  }
  object Vec2 {
    
    inline def apply(x: Double, xunits: IconAnchorUnits, y: Double, yunits: IconAnchorUnits): Vec2 = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xunits = xunits.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yunits = yunits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vec2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Vec2] (val x: Self) extends AnyVal {
      
      inline def setOrigin(value: IconOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXunits(value: IconAnchorUnits): Self = StObject.set(x, "xunits", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYunits(value: IconAnchorUnits): Self = StObject.set(x, "yunits", value.asInstanceOf[js.Any])
    }
  }
}
