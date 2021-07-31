package typings.ol

import org.scalablytyped.runtime.TopLevel
import typings.ol.coordinateMod.Coordinate
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.renderMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleStyleMod {
  
  @JSImport("ol/style/Style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/Style", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Style {
    def this(opt_options: Options) = this()
  }
  
  @scala.inline
  def createDefaultStyle(feature: FeatureLike, resolution: Double): js.Array[Style] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(feature.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Style]]
  
  @scala.inline
  def createEditingStyle(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>}
    */ typings.ol.olStrings.createEditingStyle & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditingStyle")().asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>}
    */ typings.ol.olStrings.createEditingStyle & TopLevel[js.Any]]
  
  @scala.inline
  def toFunction(obj: js.Array[Style]): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  @scala.inline
  def toFunction(obj: Style): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  @scala.inline
  def toFunction(obj: StyleFunction): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  
  type GeometryFunction = js.Function1[
    /* p0 */ FeatureLike, 
    js.UndefOr[typings.ol.geometryMod.default | typings.ol.renderFeatureMod.default]
  ]
  
  trait Options extends StObject {
    
    var fill: js.UndefOr[typings.ol.fillMod.default] = js.undefined
    
    var geometry: js.UndefOr[String | typings.ol.geometryMod.default | GeometryFunction] = js.undefined
    
    var image: js.UndefOr[typings.ol.styleImageMod.default] = js.undefined
    
    var renderer: js.UndefOr[RenderFunction] = js.undefined
    
    var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.undefined
    
    var text: js.UndefOr[typings.ol.textMod.default] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
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
      def setFill(value: typings.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGeometry(value: String | typings.ol.geometryMod.default | GeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryFunction1(
        value: /* p0 */ FeatureLike => js.UndefOr[typings.ol.geometryMod.default | typings.ol.renderFeatureMod.default]
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      @scala.inline
      def setImage(value: typings.ol.styleImageMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setRenderer(
        value: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setStroke(value: typings.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setText(value: typings.ol.textMod.default): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function2[
    /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* p1 */ State, 
    Unit
  ]
  
  @js.native
  trait Style extends StObject {
    
    /**
      * Get the fill style.
      */
    def getFill(): typings.ol.fillMod.default = js.native
    
    /**
      * Get the geometry to be rendered.
      */
    def getGeometry(): String | typings.ol.geometryMod.default | GeometryFunction = js.native
    
    /**
      * Get the function used to generate a geometry for rendering.
      */
    def getGeometryFunction(): GeometryFunction = js.native
    
    /**
      * Get the image style.
      */
    def getImage(): typings.ol.styleImageMod.default = js.native
    
    /**
      * Get the custom renderer function that was configured with
      * {@link #setRenderer} or the renderer constructor option.
      */
    def getRenderer(): RenderFunction | Null = js.native
    
    /**
      * Get the stroke style.
      */
    def getStroke(): typings.ol.strokeMod.default = js.native
    
    /**
      * Get the text style.
      */
    def getText(): typings.ol.textMod.default = js.native
    
    /**
      * Get the z-index for the style.
      */
    def getZIndex(): js.UndefOr[Double] = js.native
    
    /**
      * Set the fill style.
      */
    def setFill(fill: typings.ol.fillMod.default): Unit = js.native
    
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      */
    def setGeometry(geometry: String): Unit = js.native
    def setGeometry(geometry: typings.ol.geometryMod.default): Unit = js.native
    def setGeometry(geometry: GeometryFunction): Unit = js.native
    
    /**
      * Set the image style.
      */
    def setImage(image: typings.ol.styleImageMod.default): Unit = js.native
    
    /**
      * Sets a custom renderer function for this style. When set, fill, stroke
      * and image options of the style will be ignored.
      */
    def setRenderer(): Unit = js.native
    def setRenderer(renderer: RenderFunction): Unit = js.native
    
    /**
      * Set the stroke style.
      */
    def setStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
    
    /**
      * Set the text style.
      */
    def setText(text: typings.ol.textMod.default): Unit = js.native
    
    /**
      * Set the z-index.
      */
    def setZIndex(): Unit = js.native
    def setZIndex(zIndex: Double): Unit = js.native
  }
  
  type StyleFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ Double, Style | js.Array[Style]]
  
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
