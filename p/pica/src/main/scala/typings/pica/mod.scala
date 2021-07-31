package typings.pica

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pica", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Pica {
    def this(config: PicaOptions) = this()
  }
  @JSImport("pica", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PicaStatic = js.native
  
  @js.native
  trait Pica extends StObject {
    
    def resize(from: Blob, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: Blob, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: File, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: File, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    /**
      * Resize image from one canvas (or image) to another.
      * Sizes are taken from source and destination objects.
      * Result is Promise, resolved with to on success.
      * (!) If you need to process multiple images, do it sequentially to optimize CPU & memory use.
      * Pica already knows how to use multiple cores (if browser allows).
      */
    def resize(from: HTMLCanvasElement, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: HTMLCanvasElement, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: HTMLImageElement, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: HTMLImageElement, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    
    /**
      * Supplementary method, not recommended for direct use.
      * Resize Uint8Array with raw RGBA bitmap (don't confuse with jpeg / png / ... binaries).
      * It does not use tiles & webworkers. Left for special cases when you really need to process raw binary data (for example, if you decode jpeg files "manually").
      */
    def resizeBuffer(options: PicaResizeBufferOptions): js.Promise[js.Array[Double]] = js.native
    
    /**
      * Convenience method, similar to canvas.toBlob(), but with promise interface & polyfill for old browsers.
      */
    def toBlob(canvas: HTMLCanvasElement, mimeType: String): js.Promise[Blob] = js.native
    def toBlob(canvas: HTMLCanvasElement, mimeType: String, quality: Double): js.Promise[Blob] = js.native
  }
  
  trait PicaOptions extends StObject {
    
    // max webworkers pool size. Default is autodetected CPU count, but not more than 4.
    var concurrency: js.UndefOr[Double] = js.undefined
    
    // list of features to use.
    // Default is [ 'js', 'wasm', 'ww' ]. Can be [ 'js', 'wasm', 'cib', 'ww' ] or [ 'all' ].
    // Note, resize via createImageBitmap() ('cib') disabled by default due problems with quality.
    var features: js.UndefOr[js.Array[String]] = js.undefined
    
    // cache timeout, ms. Webworkers create is not fast.
    // This option allow reuse webworkers effectively. Default 2000.
    var idle: js.UndefOr[Double] = js.undefined
    
    // tile width/height.
    // Images are processed by regions, to restrict peak memory use. Default 1024.
    var tile: js.UndefOr[Double] = js.undefined
  }
  object PicaOptions {
    
    @scala.inline
    def apply(): PicaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicaOptions]
    }
    
    @scala.inline
    implicit class PicaOptionsMutableBuilder[Self <: PicaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      @scala.inline
      def setTile(value: Double): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    }
  }
  
  trait PicaResizeBufferOptions extends StObject {
    
    // use alpha channel. Default = false.
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    // Optional. Output buffer to write data, if you don't wish pica to create new one.
    var dest: js.UndefOr[String] = js.undefined
    
    // src image height.
    var height: Double
    
    // 0..3. Default = 3 (lanczos, win=3).
    var quality: js.UndefOr[Double] = js.undefined
    
    // Uint8Array with source data.
    var src: js.Array[Double]
    
    // output height, >=0, in pixels.
    var toHeigh: Double
    
    // output width, >=0, in pixels.
    var toWidth: Double
    
    // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
    var unsharpAmount: js.UndefOr[Double] = js.undefined
    
    // 0.5..2.0. Radius of Gaussian blur.
    // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
    var unsharpRadius: js.UndefOr[Double] = js.undefined
    
    // 0..255. Default = 0. Threshold for applying unsharp mask.
    var unsharpThreshold: js.UndefOr[Double] = js.undefined
    
    // src image width.
    var width: Double
  }
  object PicaResizeBufferOptions {
    
    @scala.inline
    def apply(height: Double, src: js.Array[Double], toHeigh: Double, toWidth: Double, width: Double): PicaResizeBufferOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toHeigh = toHeigh.asInstanceOf[js.Any], toWidth = toWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PicaResizeBufferOptions]
    }
    
    @scala.inline
    implicit class PicaResizeBufferOptionsMutableBuilder[Self <: PicaResizeBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSrc(value: js.Array[Double]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcVarargs(value: Double*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setToHeigh(value: Double): Self = StObject.set(x, "toHeigh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToWidth(value: Double): Self = StObject.set(x, "toWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpAmount(value: Double): Self = StObject.set(x, "unsharpAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpAmountUndefined: Self = StObject.set(x, "unsharpAmount", js.undefined)
      
      @scala.inline
      def setUnsharpRadius(value: Double): Self = StObject.set(x, "unsharpRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpRadiusUndefined: Self = StObject.set(x, "unsharpRadius", js.undefined)
      
      @scala.inline
      def setUnsharpThreshold(value: Double): Self = StObject.set(x, "unsharpThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpThresholdUndefined: Self = StObject.set(x, "unsharpThreshold", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PicaResizeOptions extends StObject {
    
    // use alpha channel. Default = false.
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    // Promise instance. If defined, current operation will be terminated on rejection.
    var cancelToken: js.UndefOr[js.Promise[js.Any]] = js.undefined
    
    // 0..3. Default = 3 (lanczos, win=3).
    var quality: js.UndefOr[Double] = js.undefined
    
    // >=0, in percents. Default = 0 (off). Usually between 50 to 100 is good.
    var unsharpAmount: js.UndefOr[Double] = js.undefined
    
    //  0.5..2.0. By default it's not set. Radius of Gaussian blur.
    // If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
    var unsharpRadius: js.UndefOr[Double] = js.undefined
    
    // 0..255. Default = 0. Threshold for applying unsharp mask.
    var unsharpThreshold: js.UndefOr[Double] = js.undefined
  }
  object PicaResizeOptions {
    
    @scala.inline
    def apply(): PicaResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicaResizeOptions]
    }
    
    @scala.inline
    implicit class PicaResizeOptionsMutableBuilder[Self <: PicaResizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setCancelToken(value: js.Promise[js.Any]): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setUnsharpAmount(value: Double): Self = StObject.set(x, "unsharpAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpAmountUndefined: Self = StObject.set(x, "unsharpAmount", js.undefined)
      
      @scala.inline
      def setUnsharpRadius(value: Double): Self = StObject.set(x, "unsharpRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpRadiusUndefined: Self = StObject.set(x, "unsharpRadius", js.undefined)
      
      @scala.inline
      def setUnsharpThreshold(value: Double): Self = StObject.set(x, "unsharpThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsharpThresholdUndefined: Self = StObject.set(x, "unsharpThreshold", js.undefined)
    }
  }
  
  @js.native
  trait PicaStatic
    extends StObject
       with Instantiable0[Pica]
       with Instantiable1[/* config */ PicaOptions, Pica] {
    
    def apply(): Pica = js.native
    def apply(config: PicaOptions): Pica = js.native
  }
  
  type _To = js.Object & PicaStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & PicaStatic = ^
}
