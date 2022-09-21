package typings.mergeImg

import typings.jimp.mod.DepreciatedJimp
import typings.mergeImg.mergeImgStrings.center
import typings.mergeImg.mergeImgStrings.end
import typings.mergeImg.mergeImgStrings.start
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp]): js.Promise[DepreciatedJimp] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(images.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DepreciatedJimp]]
  inline def default(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp], options: Options): js.Promise[DepreciatedJimp] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(images.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DepreciatedJimp]]
  
  trait ImageDescriptor extends StObject {
    
    /**
      * x offset to affect this image
      * @default 0
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * y offset to affect this image
      * @default 0
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * A single image source to concat
      */
    var src: String | Buffer
  }
  object ImageDescriptor {
    
    inline def apply(src: String | Buffer): ImageDescriptor = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDescriptor]
    }
    
    extension [Self <: ImageDescriptor](x: Self) {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setSrc(value: String | Buffer): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarginOptions extends StObject {
    
    /**
      * Margin on bottom side of result image
      * @default 0
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin on left side of result image
      * @default 0
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin on right side of result image
      * @default 0
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /**
      * Margin on top side of result image
      * @default 0
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object MarginOptions {
    
    inline def apply(): MarginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarginOptions]
    }
    
    extension [Self <: MarginOptions](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Aligning of given images. If the images are not all the same size, images will be sorted to largest image
      * @default 'start'
      */
    var align: js.UndefOr[start | center | end] = js.undefined
    
    /**
      * Default background color represented by RGBA hex value.
      * @default 0x00000000
      */
    var color: js.UndefOr[Double] = js.undefined
    
    /**
      * Direction of the merged image. If this value is true, the images will be merged vertically (column).
      * Otherwise, the images will be merged horizontally (row)
      * @default false
      */
    var direction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Margin of the result image.
      * If `number` or `string` is passed, it will be considered as standard
      * css shorthand properties (e.g. '40 40 0 10')
      */
    var margin: js.UndefOr[Double | String | MarginOptions] = js.undefined
    
    /**
      * Offset in pixels between each image
      * @default 0
      */
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlign(value: start | center | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMargin(value: Double | String | MarginOptions): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
