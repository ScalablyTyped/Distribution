package typings.pica

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.pica.picaInts.`0`
import typings.pica.picaInts.`1`
import typings.pica.picaInts.`2`
import typings.pica.picaInts.`3`
import typings.pica.picaStrings.all
import typings.pica.picaStrings.box
import typings.pica.picaStrings.cib
import typings.pica.picaStrings.hamming
import typings.pica.picaStrings.js_
import typings.pica.picaStrings.lanczos2
import typings.pica.picaStrings.lanczos3
import typings.pica.picaStrings.mks2013
import typings.pica.picaStrings.wasm
import typings.pica.picaStrings.ww
import typings.std.Blob
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pica", JSImport.Namespace)
  @js.native
  open class ^ ()
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
    def resize(from: ImageBitmap, to: HTMLCanvasElement): js.Promise[HTMLCanvasElement] = js.native
    def resize(from: ImageBitmap, to: HTMLCanvasElement, options: PicaResizeOptions): js.Promise[HTMLCanvasElement] = js.native
    
    /**
      * Supplementary method, not recommended for direct use.
      * Resize Uint8Array with raw RGBA bitmap (don't confuse with jpeg / png / ... binaries).
      * It does not use tiles & webworkers. Left for special cases when you really need to process raw binary data (for example, if you decode jpeg files "manually").
      */
    def resizeBuffer(options: PicaResizeBufferOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Convenience method, similar to canvas.toBlob(), but with promise interface & polyfill for old browsers.
      */
    def toBlob(canvas: HTMLCanvasElement, mimeType: String): js.Promise[Blob] = js.native
    def toBlob(canvas: HTMLCanvasElement, mimeType: String, quality: Double): js.Promise[Blob] = js.native
  }
  
  trait PicaOptions extends StObject {
    
    /**
      * max webworkers pool size.
      *
      * Default is autodetected CPU count, but not more than 4.
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * function which returns a new canvas, used internally by pica.
      *
      * Default returns a <canvas> element but this function could return an OffscreenCanvas instead (to run pica in a Service Worker).
      */
    var createCanvas: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, HTMLCanvasElement]] = js.undefined
    
    /**
      * list of features to use.
      *
      * Note, `cib` is buggy in Chrome and not supports default `mks2013` filter.
      *
      * @default ['js', 'wasm', 'ww']
      */
    var features: js.UndefOr[js.Array[js_ | wasm | cib | ww | all]] = js.undefined
    
    /**
      * cache timeout, ms. Webworkers create is not fast.
      *
      * This option allow reuse webworkers effectively.
      *
      * @default 2000
      */
    var idle: js.UndefOr[Double] = js.undefined
    
    /**
      * tile width/height.
      *
      * Images are processed by regions, to restrict peak memory use.
      *
      * @default 1024
      */
    var tile: js.UndefOr[Double] = js.undefined
  }
  object PicaOptions {
    
    inline def apply(): PicaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PicaOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setCreateCanvas(value: (/* width */ Double, /* height */ Double) => HTMLCanvasElement): Self = StObject.set(x, "createCanvas", js.Any.fromFunction2(value))
      
      inline def setCreateCanvasUndefined: Self = StObject.set(x, "createCanvas", js.undefined)
      
      inline def setFeatures(value: js.Array[js_ | wasm | cib | ww | all]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: (js_ | wasm | cib | ww | all)*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
      
      inline def setTile(value: Double): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    }
  }
  
  trait PicaResizeBufferOptions extends StObject {
    
    /**
      * Optional. Output buffer to write data, if you don't wish pica to create new one.
      */
    var dest: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * filter name
      *
      * `mks2013` does both resize and sharpening, it's optimal and not recommended to change.
      *
      * @default 'mks2013'
      */
    var filter: js.UndefOr[box | hamming | lanczos2 | lanczos3 | mks2013] = js.undefined
    
    /** src image height. */
    var height: Double
    
    /**
      * deprecated use `.filter` instead.
      *
      * @deprecated
      */
    var quality: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    
    /** Uint8Array with source data. */
    var src: js.typedarray.Uint8Array
    
    /** output height, >=0, in pixels. */
    var toHeight: Double
    
    /** output width, >=0, in pixels. */
    var toWidth: Double
    
    /**
      * in percents, >=0.
      *
      * Usually between 100 to 200 is good.
      * Note, `mks2013` filter already does optimal sharpening.
      *
      * @default 0 (off)
      */
    var unsharpAmount: js.UndefOr[Double] = js.undefined
    
    /**
      * 0.5..2.0.
      *
      * By default it's not set. Radius of Gaussian blur.
      * If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
      */
    var unsharpRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * 0..255
      *
      * Threshold for applying unsharp mask.
      *
      * @default 0
      */
    var unsharpThreshold: js.UndefOr[Double] = js.undefined
    
    /** src image width. */
    var width: Double
  }
  object PicaResizeBufferOptions {
    
    inline def apply(height: Double, src: js.typedarray.Uint8Array, toHeight: Double, toWidth: Double, width: Double): PicaResizeBufferOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], toHeight = toHeight.asInstanceOf[js.Any], toWidth = toWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PicaResizeBufferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PicaResizeBufferOptions] (val x: Self) extends AnyVal {
      
      inline def setDest(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setFilter(value: box | hamming | lanczos2 | lanczos3 | mks2013): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSrc(value: js.typedarray.Uint8Array): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setToHeight(value: Double): Self = StObject.set(x, "toHeight", value.asInstanceOf[js.Any])
      
      inline def setToWidth(value: Double): Self = StObject.set(x, "toWidth", value.asInstanceOf[js.Any])
      
      inline def setUnsharpAmount(value: Double): Self = StObject.set(x, "unsharpAmount", value.asInstanceOf[js.Any])
      
      inline def setUnsharpAmountUndefined: Self = StObject.set(x, "unsharpAmount", js.undefined)
      
      inline def setUnsharpRadius(value: Double): Self = StObject.set(x, "unsharpRadius", value.asInstanceOf[js.Any])
      
      inline def setUnsharpRadiusUndefined: Self = StObject.set(x, "unsharpRadius", js.undefined)
      
      inline def setUnsharpThreshold(value: Double): Self = StObject.set(x, "unsharpThreshold", value.asInstanceOf[js.Any])
      
      inline def setUnsharpThresholdUndefined: Self = StObject.set(x, "unsharpThreshold", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PicaResizeOptions extends StObject {
    
    /**
      * If defined, current operation will be terminated on rejection.
      */
    var cancelToken: js.UndefOr[js.Promise[Any]] = js.undefined
    
    /**
      * filter name
      *
      * `mks2013` does both resize and sharpening, it's optimal and not recommended to change.
      *
      * @default 'mks2013'
      */
    var filter: js.UndefOr[box | hamming | lanczos2 | lanczos3 | mks2013] = js.undefined
    
    /**
      * deprecated use `.filter` instead.
      *
      * @deprecated
      */
    var quality: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    
    /**
      * in percents, >=0.
      *
      * Usually between 100 to 200 is good.
      * Note, `mks2013` filter already does optimal sharpening.
      *
      * @default 0 (off)
      */
    var unsharpAmount: js.UndefOr[Double] = js.undefined
    
    /**
      * 0.5..2.0.
      *
      * By default it's not set. Radius of Gaussian blur.
      * If it is less than 0.5, Unsharp Mask is off. Big values are clamped to 2.0.
      */
    var unsharpRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * 0..255
      *
      * Threshold for applying unsharp mask.
      *
      * @default 0
      */
    var unsharpThreshold: js.UndefOr[Double] = js.undefined
  }
  object PicaResizeOptions {
    
    inline def apply(): PicaResizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicaResizeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PicaResizeOptions] (val x: Self) extends AnyVal {
      
      inline def setCancelToken(value: js.Promise[Any]): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      inline def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      inline def setFilter(value: box | hamming | lanczos2 | lanczos3 | mks2013): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setQuality(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setUnsharpAmount(value: Double): Self = StObject.set(x, "unsharpAmount", value.asInstanceOf[js.Any])
      
      inline def setUnsharpAmountUndefined: Self = StObject.set(x, "unsharpAmount", js.undefined)
      
      inline def setUnsharpRadius(value: Double): Self = StObject.set(x, "unsharpRadius", value.asInstanceOf[js.Any])
      
      inline def setUnsharpRadiusUndefined: Self = StObject.set(x, "unsharpRadius", js.undefined)
      
      inline def setUnsharpThreshold(value: Double): Self = StObject.set(x, "unsharpThreshold", value.asInstanceOf[js.Any])
      
      inline def setUnsharpThresholdUndefined: Self = StObject.set(x, "unsharpThreshold", js.undefined)
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
