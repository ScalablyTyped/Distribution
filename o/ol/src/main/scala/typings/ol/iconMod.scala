package typings.ol

import typings.ol.colorMod.Color
import typings.ol.iconAnchorUnitsMod.IconAnchorUnits
import typings.ol.iconOriginMod.IconOrigin
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("ol/style/Icon", JSImport.Default)
  @js.native
  class default () extends Icon {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Icon
    extends typings.ol.styleImageMod.default {
    
    /**
      * Get the icon color.
      */
    def getColor(): Color = js.native
    
    /**
      * Get the pixel ratio.
      */
    def getPixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * Get the image URL.
      */
    def getSrc(): js.UndefOr[String] = js.native
    
    /**
      * Set the anchor point. The anchor determines the center point for the
      * symbolizer.
      */
    def setAnchor(anchor: js.Array[Double]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var anchor: js.UndefOr[js.Array[Double]] = js.native
    
    var anchorOrigin: js.UndefOr[IconOrigin] = js.native
    
    var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.native
    
    var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.native
    
    var color: js.UndefOr[Color | String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var displacement: js.UndefOr[js.Array[Double]] = js.native
    
    var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.native
    
    var imgSize: js.UndefOr[Size] = js.native
    
    var offset: js.UndefOr[js.Array[Double]] = js.native
    
    var offsetOrigin: js.UndefOr[IconOrigin] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double | Size] = js.native
    
    var size: js.UndefOr[Size] = js.native
    
    var src: js.UndefOr[String] = js.native
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
      def setAnchor(value: js.Array[Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOrigin(value: IconOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value :_*))
      
      @scala.inline
      def setAnchorXUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorXUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorXUnitsUndefined: Self = StObject.set(x, "anchorXUnits", js.undefined)
      
      @scala.inline
      def setAnchorYUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorYUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorYUnitsUndefined: Self = StObject.set(x, "anchorYUnits", js.undefined)
      
      @scala.inline
      def setColor(value: Color | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      @scala.inline
      def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value :_*))
      
      @scala.inline
      def setImg(value: HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSize(value: Size): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOrigin(value: IconOrigin): Self = StObject.set(x, "offsetOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetOriginUndefined: Self = StObject.set(x, "offsetOrigin", js.undefined)
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
