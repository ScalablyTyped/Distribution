package typings.ol

import typings.ol.iconAnchorUnitsMod.IconAnchorUnits
import typings.ol.iconOriginMod.IconOrigin
import typings.std.Document
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmlMod {
  
  @JSImport("ol/format/KML", JSImport.Default)
  @js.native
  class default () extends KML {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format/KML", "getDefaultFillStyle")
  @js.native
  def getDefaultFillStyle(): typings.ol.fillMod.default = js.native
  
  @JSImport("ol/format/KML", "getDefaultImageStyle")
  @js.native
  def getDefaultImageStyle(): typings.ol.styleImageMod.default = js.native
  
  @JSImport("ol/format/KML", "getDefaultStrokeStyle")
  @js.native
  def getDefaultStrokeStyle(): typings.ol.strokeMod.default = js.native
  
  @JSImport("ol/format/KML", "getDefaultStyle")
  @js.native
  def getDefaultStyle(): typings.ol.styleStyleMod.default = js.native
  
  @JSImport("ol/format/KML", "getDefaultStyleArray")
  @js.native
  def getDefaultStyleArray(): js.Array[typings.ol.styleStyleMod.default] = js.native
  
  @JSImport("ol/format/KML", "getDefaultTextStyle")
  @js.native
  def getDefaultTextStyle(): typings.ol.textMod.default = js.native
  
  @JSImport("ol/format/KML", "readFlatCoordinates")
  @js.native
  def readFlatCoordinates(node: Node): js.UndefOr[js.Array[Double]] = js.native
  
  @js.native
  trait GxTrackObject extends StObject {
    
    var flatCoordinates: js.Array[Double] = js.native
    
    var whens: js.Array[Double] = js.native
  }
  object GxTrackObject {
    
    @scala.inline
    def apply(flatCoordinates: js.Array[Double], whens: js.Array[Double]): GxTrackObject = {
      val __obj = js.Dynamic.literal(flatCoordinates = flatCoordinates.asInstanceOf[js.Any], whens = whens.asInstanceOf[js.Any])
      __obj.asInstanceOf[GxTrackObject]
    }
    
    @scala.inline
    implicit class GxTrackObjectMutableBuilder[Self <: GxTrackObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlatCoordinates(value: js.Array[Double]): Self = StObject.set(x, "flatCoordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatCoordinatesVarargs(value: Double*): Self = StObject.set(x, "flatCoordinates", js.Array(value :_*))
      
      @scala.inline
      def setWhens(value: js.Array[Double]): Self = StObject.set(x, "whens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhensVarargs(value: Double*): Self = StObject.set(x, "whens", js.Array(value :_*))
    }
  }
  
  @js.native
  trait KML
    extends typings.ol.xmlfeatureMod.default {
    
    def readName(source: String): js.UndefOr[String] = js.native
    /**
      * Read the name of the KML.
      */
    def readName(source: Document): js.UndefOr[String] = js.native
    def readName(source: Element): js.UndefOr[String] = js.native
    
    def readNameFromDocument(doc: Document): js.UndefOr[String] = js.native
    
    def readNameFromNode(node: Element): js.UndefOr[String] = js.native
    
    def readNetworkLinks(source: String): js.Array[js.Object] = js.native
    /**
      * Read the network links of the KML.
      */
    def readNetworkLinks(source: Document): js.Array[js.Object] = js.native
    def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
    
    def readNetworkLinksFromDocument(doc: Document): js.Array[js.Object] = js.native
    
    def readNetworkLinksFromNode(node: Element): js.Array[js.Object] = js.native
    
    def readRegion(source: String): js.Array[js.Object] = js.native
    /**
      * Read the regions of the KML.
      */
    def readRegion(source: Document): js.Array[js.Object] = js.native
    def readRegion(source: Element): js.Array[js.Object] = js.native
    
    def readRegionFromDocument(doc: Document): js.Array[js.Object] = js.native
    
    def readRegionFromNode(node: Element): js.Array[js.Object] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var defaultStyle: js.UndefOr[js.Array[typings.ol.styleStyleMod.default]] = js.native
    
    var extractStyles: js.UndefOr[Boolean] = js.native
    
    var showPointNames: js.UndefOr[Boolean] = js.native
    
    var writeStyles: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: js.Array[typings.ol.styleStyleMod.default]): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setDefaultStyleVarargs(value: typings.ol.styleStyleMod.default*): Self = StObject.set(x, "defaultStyle", js.Array(value :_*))
      
      @scala.inline
      def setExtractStyles(value: Boolean): Self = StObject.set(x, "extractStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractStylesUndefined: Self = StObject.set(x, "extractStyles", js.undefined)
      
      @scala.inline
      def setShowPointNames(value: Boolean): Self = StObject.set(x, "showPointNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPointNamesUndefined: Self = StObject.set(x, "showPointNames", js.undefined)
      
      @scala.inline
      def setWriteStyles(value: Boolean): Self = StObject.set(x, "writeStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteStylesUndefined: Self = StObject.set(x, "writeStyles", js.undefined)
    }
  }
  
  @js.native
  trait Vec2 extends StObject {
    
    var origin: IconOrigin = js.native
    
    var x: Double = js.native
    
    var xunits: IconAnchorUnits = js.native
    
    var y: Double = js.native
    
    var yunits: IconAnchorUnits = js.native
  }
  object Vec2 {
    
    @scala.inline
    def apply(origin: IconOrigin, x: Double, xunits: IconAnchorUnits, y: Double, yunits: IconAnchorUnits): Vec2 = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xunits = xunits.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yunits = yunits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vec2]
    }
    
    @scala.inline
    implicit class Vec2MutableBuilder[Self <: Vec2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: IconOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXunits(value: IconAnchorUnits): Self = StObject.set(x, "xunits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYunits(value: IconAnchorUnits): Self = StObject.set(x, "yunits", value.asInstanceOf[js.Any])
    }
  }
}
