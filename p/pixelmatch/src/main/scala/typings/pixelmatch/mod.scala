package typings.pixelmatch

import typings.node.Buffer
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(
    /** Image data of the first image to compare. Note: image dimensions must be equal. */
  img1: Buffer | Uint8Array | Uint8ClampedArray,
    /** Image data of the second image to compare. Note: image dimensions must be equal. */
  img2: Buffer | Uint8Array | Uint8ClampedArray,
    /** Image data to write the diff to, or null if don't need a diff image. */
  output: Buffer | Uint8Array | Null,
    /** Width of the images. Note that all three images need to have the same dimensions. */
  width: Double,
    /** Height of the images. Note that all three images need to have the same dimensions. */
  height: Double,
    /** Options. */
  options: js.UndefOr[PixelmatchOptions]
  ): Double = (^.asInstanceOf[js.Dynamic].apply(img1.asInstanceOf[js.Any], img2.asInstanceOf[js.Any], output.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("pixelmatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PixelmatchOptions extends StObject {
    
    /**
      * The color of anti-aliased pixels in the diff output.
      * @default [255, 255, 0]
      */
    var aaColor: js.UndefOr[RGBTuple] = js.undefined
    
    /**
      * Blending factor of unchanged pixels in the diff output.
      * Ranges from 0 for pure white to 1 for original brightness
      * @default 0.1
      */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * The color of differing pixels in the diff output.
      * @default [255, 0, 0]
      */
    var diffColor: js.UndefOr[RGBTuple] = js.undefined
    
    /**
      * An alternative color to use for dark on light differences to differentiate between "added" and "removed" parts.
      * If not provided, all differing pixels use the color specified by `diffColor`.
      * @default null
      */
    var diffColorAlt: js.UndefOr[RGBTuple] = js.undefined
    
    /**
      * Draw the diff over a transparent background (a mask), rather than over the original image.
      * Will not draw anti-aliased pixels (if detected)
      * @default false
      */
    var diffMask: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, disables detecting and ignoring anti-aliased pixels.
      * @default false
      */
    val includeAA: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive.
      * @default 0.1
      */
    val threshold: js.UndefOr[Double] = js.undefined
  }
  object PixelmatchOptions {
    
    @scala.inline
    def apply(): PixelmatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PixelmatchOptions]
    }
    
    @scala.inline
    implicit class PixelmatchOptionsMutableBuilder[Self <: PixelmatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAaColor(value: RGBTuple): Self = StObject.set(x, "aaColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAaColorUndefined: Self = StObject.set(x, "aaColor", js.undefined)
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setDiffColor(value: RGBTuple): Self = StObject.set(x, "diffColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffColorAlt(value: RGBTuple): Self = StObject.set(x, "diffColorAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffColorAltUndefined: Self = StObject.set(x, "diffColorAlt", js.undefined)
      
      @scala.inline
      def setDiffColorUndefined: Self = StObject.set(x, "diffColor", js.undefined)
      
      @scala.inline
      def setDiffMask(value: Boolean): Self = StObject.set(x, "diffMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffMaskUndefined: Self = StObject.set(x, "diffMask", js.undefined)
      
      @scala.inline
      def setIncludeAA(value: Boolean): Self = StObject.set(x, "includeAA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAAUndefined: Self = StObject.set(x, "includeAA", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type RGBTuple = js.Tuple3[Double, Double, Double]
}
