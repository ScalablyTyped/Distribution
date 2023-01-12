package typings.ol

import typings.ol.colorMod.Color
import typings.ol.sizeMod.Size
import typings.ol.styleIconAnchorUnitsMod.IconAnchorUnits
import typings.ol.styleIconOriginMod.IconOrigin
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconMod {
  
  @JSImport("ol/style/Icon", JSImport.Default)
  @js.native
  open class default () extends Icon {
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
  
  trait Options extends StObject {
    
    var anchor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var anchorOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    var color: js.UndefOr[Color | String] = js.undefined
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.undefined
    
    var imgSize: js.UndefOr[Size] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var offsetOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: js.Array[Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorOrigin(value: IconOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value*))
      
      inline def setAnchorXUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorXUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorXUnitsUndefined: Self = StObject.set(x, "anchorXUnits", js.undefined)
      
      inline def setAnchorYUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorYUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorYUnitsUndefined: Self = StObject.set(x, "anchorYUnits", js.undefined)
      
      inline def setColor(value: Color | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setImg(value: HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgSize(value: Size): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      inline def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetOrigin(value: IconOrigin): Self = StObject.set(x, "offsetOrigin", value.asInstanceOf[js.Any])
      
      inline def setOffsetOriginUndefined: Self = StObject.set(x, "offsetOrigin", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
