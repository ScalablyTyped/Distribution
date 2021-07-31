package typings.pdfImage

import org.scalablytyped.runtime.StringDictionary
import typings.pdfImage.anon.CombinedImageCombinedImage
import typings.pdfImage.anon.ReadonlyConvertOptions
import typings.pdfImage.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-image", "PDFImage")
  @js.native
  class PDFImage[CombinedImage /* <: Boolean */] protected () extends StObject {
    def this(
      path: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type OptionalSpread<CombinedImage> is not an array type */ options: OptionalSpread[CombinedImage]
    ) = this()
    
    def combineImages(imagePaths: js.Array[String]): js.Promise[String] = js.native
    
    def constructCombineCommandForFile(imagePaths: js.Array[String]): String = js.native
    
    def constructConvertCommandForPage(pageNumber: Double): String = js.native
    
    def constructConvertOptions(): String = js.native
    
    def constructGetInfoCommand(): String = js.native
    
    def convertFile(): js.Promise[js.Array[String] | String] = js.native
    
    def convertPage(pageNumber: Double): js.Promise[String] = js.native
    
    def getInfo(): js.Promise[PDFInfo] = js.native
    
    def getOutputImagePathForFile(): String = js.native
    
    def getOutputImagePathForPage(pageNumber: Double): String = js.native
    
    def parseGetInfoCommandOutput(output: String): StringDictionary[String] = js.native
    
    def setConvertExtension(): Unit = js.native
    def setConvertExtension(convertExtension: String): Unit = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(convertOptions: ReadonlyConvertOptions): Unit = js.native
    
    def setPdfFileBaseName(): Unit = js.native
    def setPdfFileBaseName(pdfFileBaseName: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfImage.pdfImageStrings.`-adaptive-blur`
    - typings.pdfImage.pdfImageStrings.`-adaptive-resize`
    - typings.pdfImage.pdfImageStrings.`-adaptive-sharpen`
    - typings.pdfImage.pdfImageStrings.`-adjoin`
    - typings.pdfImage.pdfImageStrings.`-affine`
    - typings.pdfImage.pdfImageStrings.`-alpha`
    - typings.pdfImage.pdfImageStrings.`-annotate`
    - typings.pdfImage.pdfImageStrings.`-antialias`
    - typings.pdfImage.pdfImageStrings.`-append`
    - typings.pdfImage.pdfImageStrings.`-authenticate`
    - typings.pdfImage.pdfImageStrings.`-auto-gamma`
    - typings.pdfImage.pdfImageStrings.`-auto-level`
    - typings.pdfImage.pdfImageStrings.`-auto-orient`
    - typings.pdfImage.pdfImageStrings.`-auto-threshold`
    - typings.pdfImage.pdfImageStrings.`-background`
    - typings.pdfImage.pdfImageStrings.`-bench`
    - typings.pdfImage.pdfImageStrings.`-bias`
    - typings.pdfImage.pdfImageStrings.`-black-threshold`
    - typings.pdfImage.pdfImageStrings.`-blue-primary`
    - typings.pdfImage.pdfImageStrings.`-blue-shift`
    - typings.pdfImage.pdfImageStrings.`-blur`
    - typings.pdfImage.pdfImageStrings.`-border`
    - typings.pdfImage.pdfImageStrings.`-bordercolor`
    - typings.pdfImage.pdfImageStrings.`-brightness-contrast`
    - typings.pdfImage.pdfImageStrings.`-canny`
    - typings.pdfImage.pdfImageStrings.`-caption`
    - typings.pdfImage.pdfImageStrings.`-cdl`
    - typings.pdfImage.pdfImageStrings.`-channel`
    - typings.pdfImage.pdfImageStrings.`-charcoal`
    - typings.pdfImage.pdfImageStrings.`-chop`
    - typings.pdfImage.pdfImageStrings.`-clahe`
    - typings.pdfImage.pdfImageStrings.`-clamp`
    - typings.pdfImage.pdfImageStrings.`-clip`
    - typings.pdfImage.pdfImageStrings.`-clip-mask`
    - typings.pdfImage.pdfImageStrings.`-clip-path`
    - typings.pdfImage.pdfImageStrings.`-clone`
    - typings.pdfImage.pdfImageStrings.`-clut`
    - typings.pdfImage.pdfImageStrings.`-connected-components`
    - typings.pdfImage.pdfImageStrings.`-contrast-stretch`
    - typings.pdfImage.pdfImageStrings.`-coalesce`
    - typings.pdfImage.pdfImageStrings.`-colorize`
    - typings.pdfImage.pdfImageStrings.`-color-matrix`
    - typings.pdfImage.pdfImageStrings.`-colors`
    - typings.pdfImage.pdfImageStrings.`-colorspace`
    - typings.pdfImage.pdfImageStrings.`-combine`
    - typings.pdfImage.pdfImageStrings.`-comment`
    - typings.pdfImage.pdfImageStrings.`-compare`
    - typings.pdfImage.pdfImageStrings.`-complexoperator`
    - typings.pdfImage.pdfImageStrings.`-compose`
    - typings.pdfImage.pdfImageStrings.`-composite`
    - typings.pdfImage.pdfImageStrings.`-compress`
    - typings.pdfImage.pdfImageStrings.`-contrast`
    - typings.pdfImage.pdfImageStrings.`-convolve`
    - typings.pdfImage.pdfImageStrings.`-copy`
    - typings.pdfImage.pdfImageStrings.`-crop`
    - typings.pdfImage.pdfImageStrings.`-cycle`
    - typings.pdfImage.pdfImageStrings.`-decipher`
    - typings.pdfImage.pdfImageStrings.`-debug`
    - typings.pdfImage.pdfImageStrings.`-define`
    - typings.pdfImage.pdfImageStrings.`-deconstruct`
    - typings.pdfImage.pdfImageStrings.`-delay`
    - typings.pdfImage.pdfImageStrings.`-delete`
    - typings.pdfImage.pdfImageStrings.`-density`
    - typings.pdfImage.pdfImageStrings.`-depth`
    - typings.pdfImage.pdfImageStrings.`-despeckle`
    - typings.pdfImage.pdfImageStrings.`-direction`
    - typings.pdfImage.pdfImageStrings.`-display`
    - typings.pdfImage.pdfImageStrings.`-dispose`
    - typings.pdfImage.pdfImageStrings.`-distribute-cache`
    - typings.pdfImage.pdfImageStrings.`-distort`
    - typings.pdfImage.pdfImageStrings.`-dither`
    - typings.pdfImage.pdfImageStrings.`-draw`
    - typings.pdfImage.pdfImageStrings.`-duplicate`
    - typings.pdfImage.pdfImageStrings.`-edge`
    - typings.pdfImage.pdfImageStrings.`-emboss`
    - typings.pdfImage.pdfImageStrings.`-encipher`
    - typings.pdfImage.pdfImageStrings.`-encoding`
    - typings.pdfImage.pdfImageStrings.`-endian`
    - typings.pdfImage.pdfImageStrings.`-enhance`
    - typings.pdfImage.pdfImageStrings.`-equalize`
    - typings.pdfImage.pdfImageStrings.`-evaluate`
    - typings.pdfImage.pdfImageStrings.`-evaluate-sequence`
    - typings.pdfImage.pdfImageStrings.`-extent`
    - typings.pdfImage.pdfImageStrings.`-extract`
    - typings.pdfImage.pdfImageStrings.`-family`
    - typings.pdfImage.pdfImageStrings.`-features`
    - typings.pdfImage.pdfImageStrings.`-fft`
    - typings.pdfImage.pdfImageStrings.`-fill`
    - typings.pdfImage.pdfImageStrings.`-filter`
    - typings.pdfImage.pdfImageStrings.`-flatten`
    - typings.pdfImage.pdfImageStrings.`-flip`
    - typings.pdfImage.pdfImageStrings.`-floodfill`
    - typings.pdfImage.pdfImageStrings.`-flop`
    - typings.pdfImage.pdfImageStrings.`-font`
    - typings.pdfImage.pdfImageStrings.`-format`
    - typings.pdfImage.pdfImageStrings.`-frame`
    - typings.pdfImage.pdfImageStrings.`-function`
    - typings.pdfImage.pdfImageStrings.`-fuzz`
    - typings.pdfImage.pdfImageStrings.`-fx`
    - typings.pdfImage.pdfImageStrings.`-gamma`
    - typings.pdfImage.pdfImageStrings.`-gaussian-blur`
    - typings.pdfImage.pdfImageStrings.`-geometry`
    - typings.pdfImage.pdfImageStrings.`-gravity`
    - typings.pdfImage.pdfImageStrings.`-grayscale`
    - typings.pdfImage.pdfImageStrings.`-green-primary`
    - typings.pdfImage.pdfImageStrings.`-help`
    - typings.pdfImage.pdfImageStrings.`-hough-lines`
    - typings.pdfImage.pdfImageStrings.`-identify`
    - typings.pdfImage.pdfImageStrings.`-ift`
    - typings.pdfImage.pdfImageStrings.`-implode`
    - typings.pdfImage.pdfImageStrings.`-insert`
    - typings.pdfImage.pdfImageStrings.`-intensity`
    - typings.pdfImage.pdfImageStrings.`-intent`
    - typings.pdfImage.pdfImageStrings.`-interlace`
    - typings.pdfImage.pdfImageStrings.`-interline-spacing`
    - typings.pdfImage.pdfImageStrings.`-interpolate`
    - typings.pdfImage.pdfImageStrings.`-interword-spacing`
    - typings.pdfImage.pdfImageStrings.`-kerning`
    - typings.pdfImage.pdfImageStrings.`-kmeans`
    - typings.pdfImage.pdfImageStrings.`-kuwahara`
    - typings.pdfImage.pdfImageStrings.`-label`
    - typings.pdfImage.pdfImageStrings.`-lat`
    - typings.pdfImage.pdfImageStrings.`-layers`
    - typings.pdfImage.pdfImageStrings.`-level`
    - typings.pdfImage.pdfImageStrings.`-limit`
    - typings.pdfImage.pdfImageStrings.`-linear-stretch`
    - typings.pdfImage.pdfImageStrings.`-liquid-rescale`
    - typings.pdfImage.pdfImageStrings.`-list`
    - typings.pdfImage.pdfImageStrings.`-log`
    - typings.pdfImage.pdfImageStrings.`-loop`
    - typings.pdfImage.pdfImageStrings.`-mattecolor`
    - typings.pdfImage.pdfImageStrings.`-median`
    - typings.pdfImage.pdfImageStrings.`-mean-shift`
    - typings.pdfImage.pdfImageStrings.`-metric`
    - typings.pdfImage.pdfImageStrings.`-mode`
    - typings.pdfImage.pdfImageStrings.`-modulate`
    - typings.pdfImage.pdfImageStrings.`-moments`
    - typings.pdfImage.pdfImageStrings.`-monitor`
    - typings.pdfImage.pdfImageStrings.`-monochrome`
    - typings.pdfImage.pdfImageStrings.`-morph`
    - typings.pdfImage.pdfImageStrings.`-morphology`
    - typings.pdfImage.pdfImageStrings.`-motion-blur`
    - typings.pdfImage.pdfImageStrings.`-negate`
    - typings.pdfImage.pdfImageStrings.`-noise`
    - typings.pdfImage.pdfImageStrings.`-normalize`
    - typings.pdfImage.pdfImageStrings.`-opaque`
    - typings.pdfImage.pdfImageStrings.`-ordered-dither`
    - typings.pdfImage.pdfImageStrings.`-orient`
    - typings.pdfImage.pdfImageStrings.`-page`
    - typings.pdfImage.pdfImageStrings.`-paint`
    - typings.pdfImage.pdfImageStrings.`-perceptible`
    - typings.pdfImage.pdfImageStrings.`-ping`
    - typings.pdfImage.pdfImageStrings.`-pointsize`
    - typings.pdfImage.pdfImageStrings.`-polaroid`
    - typings.pdfImage.pdfImageStrings.`-poly`
    - typings.pdfImage.pdfImageStrings.`-posterize`
    - typings.pdfImage.pdfImageStrings.`-precision`
    - typings.pdfImage.pdfImageStrings.`-preview`
    - typings.pdfImage.pdfImageStrings.`-print`
    - typings.pdfImage.pdfImageStrings.`-process`
    - typings.pdfImage.pdfImageStrings.`-profile`
    - typings.pdfImage.pdfImageStrings.`-quality`
    - typings.pdfImage.pdfImageStrings.`-quantize`
    - typings.pdfImage.pdfImageStrings.`-quiet`
    - typings.pdfImage.pdfImageStrings.`-radial-blur`
    - typings.pdfImage.pdfImageStrings.`-raise`
    - typings.pdfImage.pdfImageStrings.`-random-threshold`
    - typings.pdfImage.pdfImageStrings.`-range-threshold`
    - typings.pdfImage.pdfImageStrings.`-read-mask`
    - typings.pdfImage.pdfImageStrings.`-red-primary`
    - typings.pdfImage.pdfImageStrings.`-regard-warnings`
    - typings.pdfImage.pdfImageStrings.`-region`
    - typings.pdfImage.pdfImageStrings.`-remap`
    - typings.pdfImage.pdfImageStrings.`-render`
    - typings.pdfImage.pdfImageStrings.`-repage`
    - typings.pdfImage.pdfImageStrings.`-resample`
    - typings.pdfImage.pdfImageStrings.`-resize`
    - typings.pdfImage.pdfImageStrings.`-respect-parentheses`
    - typings.pdfImage.pdfImageStrings.`-roll`
    - typings.pdfImage.pdfImageStrings.`-rotate`
    - typings.pdfImage.pdfImageStrings.`-sample`
    - typings.pdfImage.pdfImageStrings.`-sampling-factor`
    - typings.pdfImage.pdfImageStrings.`-scale`
    - typings.pdfImage.pdfImageStrings.`-scene`
    - typings.pdfImage.pdfImageStrings.`-seed`
    - typings.pdfImage.pdfImageStrings.`-segment`
    - typings.pdfImage.pdfImageStrings.`-selective-blur`
    - typings.pdfImage.pdfImageStrings.`-separate`
    - typings.pdfImage.pdfImageStrings.`-sepia-tone`
    - typings.pdfImage.pdfImageStrings.`-set`
    - typings.pdfImage.pdfImageStrings.`-shade`
    - typings.pdfImage.pdfImageStrings.`-shadow`
    - typings.pdfImage.pdfImageStrings.`-sharpen`
    - typings.pdfImage.pdfImageStrings.`-shave`
    - typings.pdfImage.pdfImageStrings.`-shear`
    - typings.pdfImage.pdfImageStrings.`-sigmoidal-contrast`
    - typings.pdfImage.pdfImageStrings.`-smush`
    - typings.pdfImage.pdfImageStrings.`-size`
    - typings.pdfImage.pdfImageStrings.`-sketch`
    - typings.pdfImage.pdfImageStrings.`-solarize`
    - typings.pdfImage.pdfImageStrings.`-splice`
    - typings.pdfImage.pdfImageStrings.`-spread`
    - typings.pdfImage.pdfImageStrings.`-statistic`
    - typings.pdfImage.pdfImageStrings.`-strip`
    - typings.pdfImage.pdfImageStrings.`-stroke`
    - typings.pdfImage.pdfImageStrings.`-strokewidth`
    - typings.pdfImage.pdfImageStrings.`-stretch`
    - typings.pdfImage.pdfImageStrings.`-style`
    - typings.pdfImage.pdfImageStrings.`-swap`
    - typings.pdfImage.pdfImageStrings.`-swirl`
    - typings.pdfImage.pdfImageStrings.`-synchronize`
    - typings.pdfImage.pdfImageStrings.`-taint`
    - typings.pdfImage.pdfImageStrings.`-texture`
    - typings.pdfImage.pdfImageStrings.`-threshold`
    - typings.pdfImage.pdfImageStrings.`-thumbnail`
    - typings.pdfImage.pdfImageStrings.`-tile`
    - typings.pdfImage.pdfImageStrings.`-tile-offset`
    - typings.pdfImage.pdfImageStrings.`-tint`
    - typings.pdfImage.pdfImageStrings.`-transform`
    - typings.pdfImage.pdfImageStrings.`-transparent`
    - typings.pdfImage.pdfImageStrings.`-transparent-color`
    - typings.pdfImage.pdfImageStrings.`-transpose`
    - typings.pdfImage.pdfImageStrings.`-transverse`
    - typings.pdfImage.pdfImageStrings.`-treedepth`
    - typings.pdfImage.pdfImageStrings.`-trim`
    - typings.pdfImage.pdfImageStrings.`-type`
    - typings.pdfImage.pdfImageStrings.`-undercolor`
    - typings.pdfImage.pdfImageStrings.`-unique-colors`
    - typings.pdfImage.pdfImageStrings.`-units`
    - typings.pdfImage.pdfImageStrings.`-unsharp`
    - typings.pdfImage.pdfImageStrings.`-verbose`
    - typings.pdfImage.pdfImageStrings.`-version`
    - typings.pdfImage.pdfImageStrings.`-view`
    - typings.pdfImage.pdfImageStrings.`-vignette`
    - typings.pdfImage.pdfImageStrings.`-virtual-pixel`
    - typings.pdfImage.pdfImageStrings.`-wave`
    - typings.pdfImage.pdfImageStrings.`-wavelet-denoise`
    - typings.pdfImage.pdfImageStrings.`-weight`
    - typings.pdfImage.pdfImageStrings.`-white-point`
    - typings.pdfImage.pdfImageStrings.`-white-threshold`
    - typings.pdfImage.pdfImageStrings.`-write`
    - typings.pdfImage.pdfImageStrings.`-write-mask`
  */
  trait ConvertOptionKey extends StObject
  object ConvertOptionKey {
    
    @scala.inline
    def `-adaptive-blur`: typings.pdfImage.pdfImageStrings.`-adaptive-blur` = "-adaptive-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-adaptive-blur`]
    
    @scala.inline
    def `-adaptive-resize`: typings.pdfImage.pdfImageStrings.`-adaptive-resize` = "-adaptive-resize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-adaptive-resize`]
    
    @scala.inline
    def `-adaptive-sharpen`: typings.pdfImage.pdfImageStrings.`-adaptive-sharpen` = "-adaptive-sharpen".asInstanceOf[typings.pdfImage.pdfImageStrings.`-adaptive-sharpen`]
    
    @scala.inline
    def `-adjoin`: typings.pdfImage.pdfImageStrings.`-adjoin` = "-adjoin".asInstanceOf[typings.pdfImage.pdfImageStrings.`-adjoin`]
    
    @scala.inline
    def `-affine`: typings.pdfImage.pdfImageStrings.`-affine` = "-affine".asInstanceOf[typings.pdfImage.pdfImageStrings.`-affine`]
    
    @scala.inline
    def `-alpha`: typings.pdfImage.pdfImageStrings.`-alpha` = "-alpha".asInstanceOf[typings.pdfImage.pdfImageStrings.`-alpha`]
    
    @scala.inline
    def `-annotate`: typings.pdfImage.pdfImageStrings.`-annotate` = "-annotate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-annotate`]
    
    @scala.inline
    def `-antialias`: typings.pdfImage.pdfImageStrings.`-antialias` = "-antialias".asInstanceOf[typings.pdfImage.pdfImageStrings.`-antialias`]
    
    @scala.inline
    def `-append`: typings.pdfImage.pdfImageStrings.`-append` = "-append".asInstanceOf[typings.pdfImage.pdfImageStrings.`-append`]
    
    @scala.inline
    def `-authenticate`: typings.pdfImage.pdfImageStrings.`-authenticate` = "-authenticate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-authenticate`]
    
    @scala.inline
    def `-auto-gamma`: typings.pdfImage.pdfImageStrings.`-auto-gamma` = "-auto-gamma".asInstanceOf[typings.pdfImage.pdfImageStrings.`-auto-gamma`]
    
    @scala.inline
    def `-auto-level`: typings.pdfImage.pdfImageStrings.`-auto-level` = "-auto-level".asInstanceOf[typings.pdfImage.pdfImageStrings.`-auto-level`]
    
    @scala.inline
    def `-auto-orient`: typings.pdfImage.pdfImageStrings.`-auto-orient` = "-auto-orient".asInstanceOf[typings.pdfImage.pdfImageStrings.`-auto-orient`]
    
    @scala.inline
    def `-auto-threshold`: typings.pdfImage.pdfImageStrings.`-auto-threshold` = "-auto-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-auto-threshold`]
    
    @scala.inline
    def `-background`: typings.pdfImage.pdfImageStrings.`-background` = "-background".asInstanceOf[typings.pdfImage.pdfImageStrings.`-background`]
    
    @scala.inline
    def `-bench`: typings.pdfImage.pdfImageStrings.`-bench` = "-bench".asInstanceOf[typings.pdfImage.pdfImageStrings.`-bench`]
    
    @scala.inline
    def `-bias`: typings.pdfImage.pdfImageStrings.`-bias` = "-bias".asInstanceOf[typings.pdfImage.pdfImageStrings.`-bias`]
    
    @scala.inline
    def `-black-threshold`: typings.pdfImage.pdfImageStrings.`-black-threshold` = "-black-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-black-threshold`]
    
    @scala.inline
    def `-blue-primary`: typings.pdfImage.pdfImageStrings.`-blue-primary` = "-blue-primary".asInstanceOf[typings.pdfImage.pdfImageStrings.`-blue-primary`]
    
    @scala.inline
    def `-blue-shift`: typings.pdfImage.pdfImageStrings.`-blue-shift` = "-blue-shift".asInstanceOf[typings.pdfImage.pdfImageStrings.`-blue-shift`]
    
    @scala.inline
    def `-blur`: typings.pdfImage.pdfImageStrings.`-blur` = "-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-blur`]
    
    @scala.inline
    def `-border`: typings.pdfImage.pdfImageStrings.`-border` = "-border".asInstanceOf[typings.pdfImage.pdfImageStrings.`-border`]
    
    @scala.inline
    def `-bordercolor`: typings.pdfImage.pdfImageStrings.`-bordercolor` = "-bordercolor".asInstanceOf[typings.pdfImage.pdfImageStrings.`-bordercolor`]
    
    @scala.inline
    def `-brightness-contrast`: typings.pdfImage.pdfImageStrings.`-brightness-contrast` = "-brightness-contrast".asInstanceOf[typings.pdfImage.pdfImageStrings.`-brightness-contrast`]
    
    @scala.inline
    def `-canny`: typings.pdfImage.pdfImageStrings.`-canny` = "-canny".asInstanceOf[typings.pdfImage.pdfImageStrings.`-canny`]
    
    @scala.inline
    def `-caption`: typings.pdfImage.pdfImageStrings.`-caption` = "-caption".asInstanceOf[typings.pdfImage.pdfImageStrings.`-caption`]
    
    @scala.inline
    def `-cdl`: typings.pdfImage.pdfImageStrings.`-cdl` = "-cdl".asInstanceOf[typings.pdfImage.pdfImageStrings.`-cdl`]
    
    @scala.inline
    def `-channel`: typings.pdfImage.pdfImageStrings.`-channel` = "-channel".asInstanceOf[typings.pdfImage.pdfImageStrings.`-channel`]
    
    @scala.inline
    def `-charcoal`: typings.pdfImage.pdfImageStrings.`-charcoal` = "-charcoal".asInstanceOf[typings.pdfImage.pdfImageStrings.`-charcoal`]
    
    @scala.inline
    def `-chop`: typings.pdfImage.pdfImageStrings.`-chop` = "-chop".asInstanceOf[typings.pdfImage.pdfImageStrings.`-chop`]
    
    @scala.inline
    def `-clahe`: typings.pdfImage.pdfImageStrings.`-clahe` = "-clahe".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clahe`]
    
    @scala.inline
    def `-clamp`: typings.pdfImage.pdfImageStrings.`-clamp` = "-clamp".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clamp`]
    
    @scala.inline
    def `-clip`: typings.pdfImage.pdfImageStrings.`-clip` = "-clip".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clip`]
    
    @scala.inline
    def `-clip-mask`: typings.pdfImage.pdfImageStrings.`-clip-mask` = "-clip-mask".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clip-mask`]
    
    @scala.inline
    def `-clip-path`: typings.pdfImage.pdfImageStrings.`-clip-path` = "-clip-path".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clip-path`]
    
    @scala.inline
    def `-clone`: typings.pdfImage.pdfImageStrings.`-clone` = "-clone".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clone`]
    
    @scala.inline
    def `-clut`: typings.pdfImage.pdfImageStrings.`-clut` = "-clut".asInstanceOf[typings.pdfImage.pdfImageStrings.`-clut`]
    
    @scala.inline
    def `-coalesce`: typings.pdfImage.pdfImageStrings.`-coalesce` = "-coalesce".asInstanceOf[typings.pdfImage.pdfImageStrings.`-coalesce`]
    
    @scala.inline
    def `-color-matrix`: typings.pdfImage.pdfImageStrings.`-color-matrix` = "-color-matrix".asInstanceOf[typings.pdfImage.pdfImageStrings.`-color-matrix`]
    
    @scala.inline
    def `-colorize`: typings.pdfImage.pdfImageStrings.`-colorize` = "-colorize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-colorize`]
    
    @scala.inline
    def `-colors`: typings.pdfImage.pdfImageStrings.`-colors` = "-colors".asInstanceOf[typings.pdfImage.pdfImageStrings.`-colors`]
    
    @scala.inline
    def `-colorspace`: typings.pdfImage.pdfImageStrings.`-colorspace` = "-colorspace".asInstanceOf[typings.pdfImage.pdfImageStrings.`-colorspace`]
    
    @scala.inline
    def `-combine`: typings.pdfImage.pdfImageStrings.`-combine` = "-combine".asInstanceOf[typings.pdfImage.pdfImageStrings.`-combine`]
    
    @scala.inline
    def `-comment`: typings.pdfImage.pdfImageStrings.`-comment` = "-comment".asInstanceOf[typings.pdfImage.pdfImageStrings.`-comment`]
    
    @scala.inline
    def `-compare`: typings.pdfImage.pdfImageStrings.`-compare` = "-compare".asInstanceOf[typings.pdfImage.pdfImageStrings.`-compare`]
    
    @scala.inline
    def `-complexoperator`: typings.pdfImage.pdfImageStrings.`-complexoperator` = "-complexoperator".asInstanceOf[typings.pdfImage.pdfImageStrings.`-complexoperator`]
    
    @scala.inline
    def `-compose`: typings.pdfImage.pdfImageStrings.`-compose` = "-compose".asInstanceOf[typings.pdfImage.pdfImageStrings.`-compose`]
    
    @scala.inline
    def `-composite`: typings.pdfImage.pdfImageStrings.`-composite` = "-composite".asInstanceOf[typings.pdfImage.pdfImageStrings.`-composite`]
    
    @scala.inline
    def `-compress`: typings.pdfImage.pdfImageStrings.`-compress` = "-compress".asInstanceOf[typings.pdfImage.pdfImageStrings.`-compress`]
    
    @scala.inline
    def `-connected-components`: typings.pdfImage.pdfImageStrings.`-connected-components` = "-connected-components".asInstanceOf[typings.pdfImage.pdfImageStrings.`-connected-components`]
    
    @scala.inline
    def `-contrast`: typings.pdfImage.pdfImageStrings.`-contrast` = "-contrast".asInstanceOf[typings.pdfImage.pdfImageStrings.`-contrast`]
    
    @scala.inline
    def `-contrast-stretch`: typings.pdfImage.pdfImageStrings.`-contrast-stretch` = "-contrast-stretch".asInstanceOf[typings.pdfImage.pdfImageStrings.`-contrast-stretch`]
    
    @scala.inline
    def `-convolve`: typings.pdfImage.pdfImageStrings.`-convolve` = "-convolve".asInstanceOf[typings.pdfImage.pdfImageStrings.`-convolve`]
    
    @scala.inline
    def `-copy`: typings.pdfImage.pdfImageStrings.`-copy` = "-copy".asInstanceOf[typings.pdfImage.pdfImageStrings.`-copy`]
    
    @scala.inline
    def `-crop`: typings.pdfImage.pdfImageStrings.`-crop` = "-crop".asInstanceOf[typings.pdfImage.pdfImageStrings.`-crop`]
    
    @scala.inline
    def `-cycle`: typings.pdfImage.pdfImageStrings.`-cycle` = "-cycle".asInstanceOf[typings.pdfImage.pdfImageStrings.`-cycle`]
    
    @scala.inline
    def `-debug`: typings.pdfImage.pdfImageStrings.`-debug` = "-debug".asInstanceOf[typings.pdfImage.pdfImageStrings.`-debug`]
    
    @scala.inline
    def `-decipher`: typings.pdfImage.pdfImageStrings.`-decipher` = "-decipher".asInstanceOf[typings.pdfImage.pdfImageStrings.`-decipher`]
    
    @scala.inline
    def `-deconstruct`: typings.pdfImage.pdfImageStrings.`-deconstruct` = "-deconstruct".asInstanceOf[typings.pdfImage.pdfImageStrings.`-deconstruct`]
    
    @scala.inline
    def `-define`: typings.pdfImage.pdfImageStrings.`-define` = "-define".asInstanceOf[typings.pdfImage.pdfImageStrings.`-define`]
    
    @scala.inline
    def `-delay`: typings.pdfImage.pdfImageStrings.`-delay` = "-delay".asInstanceOf[typings.pdfImage.pdfImageStrings.`-delay`]
    
    @scala.inline
    def `-delete`: typings.pdfImage.pdfImageStrings.`-delete` = "-delete".asInstanceOf[typings.pdfImage.pdfImageStrings.`-delete`]
    
    @scala.inline
    def `-density`: typings.pdfImage.pdfImageStrings.`-density` = "-density".asInstanceOf[typings.pdfImage.pdfImageStrings.`-density`]
    
    @scala.inline
    def `-depth`: typings.pdfImage.pdfImageStrings.`-depth` = "-depth".asInstanceOf[typings.pdfImage.pdfImageStrings.`-depth`]
    
    @scala.inline
    def `-despeckle`: typings.pdfImage.pdfImageStrings.`-despeckle` = "-despeckle".asInstanceOf[typings.pdfImage.pdfImageStrings.`-despeckle`]
    
    @scala.inline
    def `-direction`: typings.pdfImage.pdfImageStrings.`-direction` = "-direction".asInstanceOf[typings.pdfImage.pdfImageStrings.`-direction`]
    
    @scala.inline
    def `-display`: typings.pdfImage.pdfImageStrings.`-display` = "-display".asInstanceOf[typings.pdfImage.pdfImageStrings.`-display`]
    
    @scala.inline
    def `-dispose`: typings.pdfImage.pdfImageStrings.`-dispose` = "-dispose".asInstanceOf[typings.pdfImage.pdfImageStrings.`-dispose`]
    
    @scala.inline
    def `-distort`: typings.pdfImage.pdfImageStrings.`-distort` = "-distort".asInstanceOf[typings.pdfImage.pdfImageStrings.`-distort`]
    
    @scala.inline
    def `-distribute-cache`: typings.pdfImage.pdfImageStrings.`-distribute-cache` = "-distribute-cache".asInstanceOf[typings.pdfImage.pdfImageStrings.`-distribute-cache`]
    
    @scala.inline
    def `-dither`: typings.pdfImage.pdfImageStrings.`-dither` = "-dither".asInstanceOf[typings.pdfImage.pdfImageStrings.`-dither`]
    
    @scala.inline
    def `-draw`: typings.pdfImage.pdfImageStrings.`-draw` = "-draw".asInstanceOf[typings.pdfImage.pdfImageStrings.`-draw`]
    
    @scala.inline
    def `-duplicate`: typings.pdfImage.pdfImageStrings.`-duplicate` = "-duplicate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-duplicate`]
    
    @scala.inline
    def `-edge`: typings.pdfImage.pdfImageStrings.`-edge` = "-edge".asInstanceOf[typings.pdfImage.pdfImageStrings.`-edge`]
    
    @scala.inline
    def `-emboss`: typings.pdfImage.pdfImageStrings.`-emboss` = "-emboss".asInstanceOf[typings.pdfImage.pdfImageStrings.`-emboss`]
    
    @scala.inline
    def `-encipher`: typings.pdfImage.pdfImageStrings.`-encipher` = "-encipher".asInstanceOf[typings.pdfImage.pdfImageStrings.`-encipher`]
    
    @scala.inline
    def `-encoding`: typings.pdfImage.pdfImageStrings.`-encoding` = "-encoding".asInstanceOf[typings.pdfImage.pdfImageStrings.`-encoding`]
    
    @scala.inline
    def `-endian`: typings.pdfImage.pdfImageStrings.`-endian` = "-endian".asInstanceOf[typings.pdfImage.pdfImageStrings.`-endian`]
    
    @scala.inline
    def `-enhance`: typings.pdfImage.pdfImageStrings.`-enhance` = "-enhance".asInstanceOf[typings.pdfImage.pdfImageStrings.`-enhance`]
    
    @scala.inline
    def `-equalize`: typings.pdfImage.pdfImageStrings.`-equalize` = "-equalize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-equalize`]
    
    @scala.inline
    def `-evaluate`: typings.pdfImage.pdfImageStrings.`-evaluate` = "-evaluate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-evaluate`]
    
    @scala.inline
    def `-evaluate-sequence`: typings.pdfImage.pdfImageStrings.`-evaluate-sequence` = "-evaluate-sequence".asInstanceOf[typings.pdfImage.pdfImageStrings.`-evaluate-sequence`]
    
    @scala.inline
    def `-extent`: typings.pdfImage.pdfImageStrings.`-extent` = "-extent".asInstanceOf[typings.pdfImage.pdfImageStrings.`-extent`]
    
    @scala.inline
    def `-extract`: typings.pdfImage.pdfImageStrings.`-extract` = "-extract".asInstanceOf[typings.pdfImage.pdfImageStrings.`-extract`]
    
    @scala.inline
    def `-family`: typings.pdfImage.pdfImageStrings.`-family` = "-family".asInstanceOf[typings.pdfImage.pdfImageStrings.`-family`]
    
    @scala.inline
    def `-features`: typings.pdfImage.pdfImageStrings.`-features` = "-features".asInstanceOf[typings.pdfImage.pdfImageStrings.`-features`]
    
    @scala.inline
    def `-fft`: typings.pdfImage.pdfImageStrings.`-fft` = "-fft".asInstanceOf[typings.pdfImage.pdfImageStrings.`-fft`]
    
    @scala.inline
    def `-fill`: typings.pdfImage.pdfImageStrings.`-fill` = "-fill".asInstanceOf[typings.pdfImage.pdfImageStrings.`-fill`]
    
    @scala.inline
    def `-filter`: typings.pdfImage.pdfImageStrings.`-filter` = "-filter".asInstanceOf[typings.pdfImage.pdfImageStrings.`-filter`]
    
    @scala.inline
    def `-flatten`: typings.pdfImage.pdfImageStrings.`-flatten` = "-flatten".asInstanceOf[typings.pdfImage.pdfImageStrings.`-flatten`]
    
    @scala.inline
    def `-flip`: typings.pdfImage.pdfImageStrings.`-flip` = "-flip".asInstanceOf[typings.pdfImage.pdfImageStrings.`-flip`]
    
    @scala.inline
    def `-floodfill`: typings.pdfImage.pdfImageStrings.`-floodfill` = "-floodfill".asInstanceOf[typings.pdfImage.pdfImageStrings.`-floodfill`]
    
    @scala.inline
    def `-flop`: typings.pdfImage.pdfImageStrings.`-flop` = "-flop".asInstanceOf[typings.pdfImage.pdfImageStrings.`-flop`]
    
    @scala.inline
    def `-font`: typings.pdfImage.pdfImageStrings.`-font` = "-font".asInstanceOf[typings.pdfImage.pdfImageStrings.`-font`]
    
    @scala.inline
    def `-format`: typings.pdfImage.pdfImageStrings.`-format` = "-format".asInstanceOf[typings.pdfImage.pdfImageStrings.`-format`]
    
    @scala.inline
    def `-frame`: typings.pdfImage.pdfImageStrings.`-frame` = "-frame".asInstanceOf[typings.pdfImage.pdfImageStrings.`-frame`]
    
    @scala.inline
    def `-function`: typings.pdfImage.pdfImageStrings.`-function` = "-function".asInstanceOf[typings.pdfImage.pdfImageStrings.`-function`]
    
    @scala.inline
    def `-fuzz`: typings.pdfImage.pdfImageStrings.`-fuzz` = "-fuzz".asInstanceOf[typings.pdfImage.pdfImageStrings.`-fuzz`]
    
    @scala.inline
    def `-fx`: typings.pdfImage.pdfImageStrings.`-fx` = "-fx".asInstanceOf[typings.pdfImage.pdfImageStrings.`-fx`]
    
    @scala.inline
    def `-gamma`: typings.pdfImage.pdfImageStrings.`-gamma` = "-gamma".asInstanceOf[typings.pdfImage.pdfImageStrings.`-gamma`]
    
    @scala.inline
    def `-gaussian-blur`: typings.pdfImage.pdfImageStrings.`-gaussian-blur` = "-gaussian-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-gaussian-blur`]
    
    @scala.inline
    def `-geometry`: typings.pdfImage.pdfImageStrings.`-geometry` = "-geometry".asInstanceOf[typings.pdfImage.pdfImageStrings.`-geometry`]
    
    @scala.inline
    def `-gravity`: typings.pdfImage.pdfImageStrings.`-gravity` = "-gravity".asInstanceOf[typings.pdfImage.pdfImageStrings.`-gravity`]
    
    @scala.inline
    def `-grayscale`: typings.pdfImage.pdfImageStrings.`-grayscale` = "-grayscale".asInstanceOf[typings.pdfImage.pdfImageStrings.`-grayscale`]
    
    @scala.inline
    def `-green-primary`: typings.pdfImage.pdfImageStrings.`-green-primary` = "-green-primary".asInstanceOf[typings.pdfImage.pdfImageStrings.`-green-primary`]
    
    @scala.inline
    def `-help`: typings.pdfImage.pdfImageStrings.`-help` = "-help".asInstanceOf[typings.pdfImage.pdfImageStrings.`-help`]
    
    @scala.inline
    def `-hough-lines`: typings.pdfImage.pdfImageStrings.`-hough-lines` = "-hough-lines".asInstanceOf[typings.pdfImage.pdfImageStrings.`-hough-lines`]
    
    @scala.inline
    def `-identify`: typings.pdfImage.pdfImageStrings.`-identify` = "-identify".asInstanceOf[typings.pdfImage.pdfImageStrings.`-identify`]
    
    @scala.inline
    def `-ift`: typings.pdfImage.pdfImageStrings.`-ift` = "-ift".asInstanceOf[typings.pdfImage.pdfImageStrings.`-ift`]
    
    @scala.inline
    def `-implode`: typings.pdfImage.pdfImageStrings.`-implode` = "-implode".asInstanceOf[typings.pdfImage.pdfImageStrings.`-implode`]
    
    @scala.inline
    def `-insert`: typings.pdfImage.pdfImageStrings.`-insert` = "-insert".asInstanceOf[typings.pdfImage.pdfImageStrings.`-insert`]
    
    @scala.inline
    def `-intensity`: typings.pdfImage.pdfImageStrings.`-intensity` = "-intensity".asInstanceOf[typings.pdfImage.pdfImageStrings.`-intensity`]
    
    @scala.inline
    def `-intent`: typings.pdfImage.pdfImageStrings.`-intent` = "-intent".asInstanceOf[typings.pdfImage.pdfImageStrings.`-intent`]
    
    @scala.inline
    def `-interlace`: typings.pdfImage.pdfImageStrings.`-interlace` = "-interlace".asInstanceOf[typings.pdfImage.pdfImageStrings.`-interlace`]
    
    @scala.inline
    def `-interline-spacing`: typings.pdfImage.pdfImageStrings.`-interline-spacing` = "-interline-spacing".asInstanceOf[typings.pdfImage.pdfImageStrings.`-interline-spacing`]
    
    @scala.inline
    def `-interpolate`: typings.pdfImage.pdfImageStrings.`-interpolate` = "-interpolate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-interpolate`]
    
    @scala.inline
    def `-interword-spacing`: typings.pdfImage.pdfImageStrings.`-interword-spacing` = "-interword-spacing".asInstanceOf[typings.pdfImage.pdfImageStrings.`-interword-spacing`]
    
    @scala.inline
    def `-kerning`: typings.pdfImage.pdfImageStrings.`-kerning` = "-kerning".asInstanceOf[typings.pdfImage.pdfImageStrings.`-kerning`]
    
    @scala.inline
    def `-kmeans`: typings.pdfImage.pdfImageStrings.`-kmeans` = "-kmeans".asInstanceOf[typings.pdfImage.pdfImageStrings.`-kmeans`]
    
    @scala.inline
    def `-kuwahara`: typings.pdfImage.pdfImageStrings.`-kuwahara` = "-kuwahara".asInstanceOf[typings.pdfImage.pdfImageStrings.`-kuwahara`]
    
    @scala.inline
    def `-label`: typings.pdfImage.pdfImageStrings.`-label` = "-label".asInstanceOf[typings.pdfImage.pdfImageStrings.`-label`]
    
    @scala.inline
    def `-lat`: typings.pdfImage.pdfImageStrings.`-lat` = "-lat".asInstanceOf[typings.pdfImage.pdfImageStrings.`-lat`]
    
    @scala.inline
    def `-layers`: typings.pdfImage.pdfImageStrings.`-layers` = "-layers".asInstanceOf[typings.pdfImage.pdfImageStrings.`-layers`]
    
    @scala.inline
    def `-level`: typings.pdfImage.pdfImageStrings.`-level` = "-level".asInstanceOf[typings.pdfImage.pdfImageStrings.`-level`]
    
    @scala.inline
    def `-limit`: typings.pdfImage.pdfImageStrings.`-limit` = "-limit".asInstanceOf[typings.pdfImage.pdfImageStrings.`-limit`]
    
    @scala.inline
    def `-linear-stretch`: typings.pdfImage.pdfImageStrings.`-linear-stretch` = "-linear-stretch".asInstanceOf[typings.pdfImage.pdfImageStrings.`-linear-stretch`]
    
    @scala.inline
    def `-liquid-rescale`: typings.pdfImage.pdfImageStrings.`-liquid-rescale` = "-liquid-rescale".asInstanceOf[typings.pdfImage.pdfImageStrings.`-liquid-rescale`]
    
    @scala.inline
    def `-list`: typings.pdfImage.pdfImageStrings.`-list` = "-list".asInstanceOf[typings.pdfImage.pdfImageStrings.`-list`]
    
    @scala.inline
    def `-log`: typings.pdfImage.pdfImageStrings.`-log` = "-log".asInstanceOf[typings.pdfImage.pdfImageStrings.`-log`]
    
    @scala.inline
    def `-loop`: typings.pdfImage.pdfImageStrings.`-loop` = "-loop".asInstanceOf[typings.pdfImage.pdfImageStrings.`-loop`]
    
    @scala.inline
    def `-mattecolor`: typings.pdfImage.pdfImageStrings.`-mattecolor` = "-mattecolor".asInstanceOf[typings.pdfImage.pdfImageStrings.`-mattecolor`]
    
    @scala.inline
    def `-mean-shift`: typings.pdfImage.pdfImageStrings.`-mean-shift` = "-mean-shift".asInstanceOf[typings.pdfImage.pdfImageStrings.`-mean-shift`]
    
    @scala.inline
    def `-median`: typings.pdfImage.pdfImageStrings.`-median` = "-median".asInstanceOf[typings.pdfImage.pdfImageStrings.`-median`]
    
    @scala.inline
    def `-metric`: typings.pdfImage.pdfImageStrings.`-metric` = "-metric".asInstanceOf[typings.pdfImage.pdfImageStrings.`-metric`]
    
    @scala.inline
    def `-mode`: typings.pdfImage.pdfImageStrings.`-mode` = "-mode".asInstanceOf[typings.pdfImage.pdfImageStrings.`-mode`]
    
    @scala.inline
    def `-modulate`: typings.pdfImage.pdfImageStrings.`-modulate` = "-modulate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-modulate`]
    
    @scala.inline
    def `-moments`: typings.pdfImage.pdfImageStrings.`-moments` = "-moments".asInstanceOf[typings.pdfImage.pdfImageStrings.`-moments`]
    
    @scala.inline
    def `-monitor`: typings.pdfImage.pdfImageStrings.`-monitor` = "-monitor".asInstanceOf[typings.pdfImage.pdfImageStrings.`-monitor`]
    
    @scala.inline
    def `-monochrome`: typings.pdfImage.pdfImageStrings.`-monochrome` = "-monochrome".asInstanceOf[typings.pdfImage.pdfImageStrings.`-monochrome`]
    
    @scala.inline
    def `-morph`: typings.pdfImage.pdfImageStrings.`-morph` = "-morph".asInstanceOf[typings.pdfImage.pdfImageStrings.`-morph`]
    
    @scala.inline
    def `-morphology`: typings.pdfImage.pdfImageStrings.`-morphology` = "-morphology".asInstanceOf[typings.pdfImage.pdfImageStrings.`-morphology`]
    
    @scala.inline
    def `-motion-blur`: typings.pdfImage.pdfImageStrings.`-motion-blur` = "-motion-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-motion-blur`]
    
    @scala.inline
    def `-negate`: typings.pdfImage.pdfImageStrings.`-negate` = "-negate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-negate`]
    
    @scala.inline
    def `-noise`: typings.pdfImage.pdfImageStrings.`-noise` = "-noise".asInstanceOf[typings.pdfImage.pdfImageStrings.`-noise`]
    
    @scala.inline
    def `-normalize`: typings.pdfImage.pdfImageStrings.`-normalize` = "-normalize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-normalize`]
    
    @scala.inline
    def `-opaque`: typings.pdfImage.pdfImageStrings.`-opaque` = "-opaque".asInstanceOf[typings.pdfImage.pdfImageStrings.`-opaque`]
    
    @scala.inline
    def `-ordered-dither`: typings.pdfImage.pdfImageStrings.`-ordered-dither` = "-ordered-dither".asInstanceOf[typings.pdfImage.pdfImageStrings.`-ordered-dither`]
    
    @scala.inline
    def `-orient`: typings.pdfImage.pdfImageStrings.`-orient` = "-orient".asInstanceOf[typings.pdfImage.pdfImageStrings.`-orient`]
    
    @scala.inline
    def `-page`: typings.pdfImage.pdfImageStrings.`-page` = "-page".asInstanceOf[typings.pdfImage.pdfImageStrings.`-page`]
    
    @scala.inline
    def `-paint`: typings.pdfImage.pdfImageStrings.`-paint` = "-paint".asInstanceOf[typings.pdfImage.pdfImageStrings.`-paint`]
    
    @scala.inline
    def `-perceptible`: typings.pdfImage.pdfImageStrings.`-perceptible` = "-perceptible".asInstanceOf[typings.pdfImage.pdfImageStrings.`-perceptible`]
    
    @scala.inline
    def `-ping`: typings.pdfImage.pdfImageStrings.`-ping` = "-ping".asInstanceOf[typings.pdfImage.pdfImageStrings.`-ping`]
    
    @scala.inline
    def `-pointsize`: typings.pdfImage.pdfImageStrings.`-pointsize` = "-pointsize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-pointsize`]
    
    @scala.inline
    def `-polaroid`: typings.pdfImage.pdfImageStrings.`-polaroid` = "-polaroid".asInstanceOf[typings.pdfImage.pdfImageStrings.`-polaroid`]
    
    @scala.inline
    def `-poly`: typings.pdfImage.pdfImageStrings.`-poly` = "-poly".asInstanceOf[typings.pdfImage.pdfImageStrings.`-poly`]
    
    @scala.inline
    def `-posterize`: typings.pdfImage.pdfImageStrings.`-posterize` = "-posterize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-posterize`]
    
    @scala.inline
    def `-precision`: typings.pdfImage.pdfImageStrings.`-precision` = "-precision".asInstanceOf[typings.pdfImage.pdfImageStrings.`-precision`]
    
    @scala.inline
    def `-preview`: typings.pdfImage.pdfImageStrings.`-preview` = "-preview".asInstanceOf[typings.pdfImage.pdfImageStrings.`-preview`]
    
    @scala.inline
    def `-print`: typings.pdfImage.pdfImageStrings.`-print` = "-print".asInstanceOf[typings.pdfImage.pdfImageStrings.`-print`]
    
    @scala.inline
    def `-process`: typings.pdfImage.pdfImageStrings.`-process` = "-process".asInstanceOf[typings.pdfImage.pdfImageStrings.`-process`]
    
    @scala.inline
    def `-profile`: typings.pdfImage.pdfImageStrings.`-profile` = "-profile".asInstanceOf[typings.pdfImage.pdfImageStrings.`-profile`]
    
    @scala.inline
    def `-quality`: typings.pdfImage.pdfImageStrings.`-quality` = "-quality".asInstanceOf[typings.pdfImage.pdfImageStrings.`-quality`]
    
    @scala.inline
    def `-quantize`: typings.pdfImage.pdfImageStrings.`-quantize` = "-quantize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-quantize`]
    
    @scala.inline
    def `-quiet`: typings.pdfImage.pdfImageStrings.`-quiet` = "-quiet".asInstanceOf[typings.pdfImage.pdfImageStrings.`-quiet`]
    
    @scala.inline
    def `-radial-blur`: typings.pdfImage.pdfImageStrings.`-radial-blur` = "-radial-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-radial-blur`]
    
    @scala.inline
    def `-raise`: typings.pdfImage.pdfImageStrings.`-raise` = "-raise".asInstanceOf[typings.pdfImage.pdfImageStrings.`-raise`]
    
    @scala.inline
    def `-random-threshold`: typings.pdfImage.pdfImageStrings.`-random-threshold` = "-random-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-random-threshold`]
    
    @scala.inline
    def `-range-threshold`: typings.pdfImage.pdfImageStrings.`-range-threshold` = "-range-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-range-threshold`]
    
    @scala.inline
    def `-read-mask`: typings.pdfImage.pdfImageStrings.`-read-mask` = "-read-mask".asInstanceOf[typings.pdfImage.pdfImageStrings.`-read-mask`]
    
    @scala.inline
    def `-red-primary`: typings.pdfImage.pdfImageStrings.`-red-primary` = "-red-primary".asInstanceOf[typings.pdfImage.pdfImageStrings.`-red-primary`]
    
    @scala.inline
    def `-regard-warnings`: typings.pdfImage.pdfImageStrings.`-regard-warnings` = "-regard-warnings".asInstanceOf[typings.pdfImage.pdfImageStrings.`-regard-warnings`]
    
    @scala.inline
    def `-region`: typings.pdfImage.pdfImageStrings.`-region` = "-region".asInstanceOf[typings.pdfImage.pdfImageStrings.`-region`]
    
    @scala.inline
    def `-remap`: typings.pdfImage.pdfImageStrings.`-remap` = "-remap".asInstanceOf[typings.pdfImage.pdfImageStrings.`-remap`]
    
    @scala.inline
    def `-render`: typings.pdfImage.pdfImageStrings.`-render` = "-render".asInstanceOf[typings.pdfImage.pdfImageStrings.`-render`]
    
    @scala.inline
    def `-repage`: typings.pdfImage.pdfImageStrings.`-repage` = "-repage".asInstanceOf[typings.pdfImage.pdfImageStrings.`-repage`]
    
    @scala.inline
    def `-resample`: typings.pdfImage.pdfImageStrings.`-resample` = "-resample".asInstanceOf[typings.pdfImage.pdfImageStrings.`-resample`]
    
    @scala.inline
    def `-resize`: typings.pdfImage.pdfImageStrings.`-resize` = "-resize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-resize`]
    
    @scala.inline
    def `-respect-parentheses`: typings.pdfImage.pdfImageStrings.`-respect-parentheses` = "-respect-parentheses".asInstanceOf[typings.pdfImage.pdfImageStrings.`-respect-parentheses`]
    
    @scala.inline
    def `-roll`: typings.pdfImage.pdfImageStrings.`-roll` = "-roll".asInstanceOf[typings.pdfImage.pdfImageStrings.`-roll`]
    
    @scala.inline
    def `-rotate`: typings.pdfImage.pdfImageStrings.`-rotate` = "-rotate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-rotate`]
    
    @scala.inline
    def `-sample`: typings.pdfImage.pdfImageStrings.`-sample` = "-sample".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sample`]
    
    @scala.inline
    def `-sampling-factor`: typings.pdfImage.pdfImageStrings.`-sampling-factor` = "-sampling-factor".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sampling-factor`]
    
    @scala.inline
    def `-scale`: typings.pdfImage.pdfImageStrings.`-scale` = "-scale".asInstanceOf[typings.pdfImage.pdfImageStrings.`-scale`]
    
    @scala.inline
    def `-scene`: typings.pdfImage.pdfImageStrings.`-scene` = "-scene".asInstanceOf[typings.pdfImage.pdfImageStrings.`-scene`]
    
    @scala.inline
    def `-seed`: typings.pdfImage.pdfImageStrings.`-seed` = "-seed".asInstanceOf[typings.pdfImage.pdfImageStrings.`-seed`]
    
    @scala.inline
    def `-segment`: typings.pdfImage.pdfImageStrings.`-segment` = "-segment".asInstanceOf[typings.pdfImage.pdfImageStrings.`-segment`]
    
    @scala.inline
    def `-selective-blur`: typings.pdfImage.pdfImageStrings.`-selective-blur` = "-selective-blur".asInstanceOf[typings.pdfImage.pdfImageStrings.`-selective-blur`]
    
    @scala.inline
    def `-separate`: typings.pdfImage.pdfImageStrings.`-separate` = "-separate".asInstanceOf[typings.pdfImage.pdfImageStrings.`-separate`]
    
    @scala.inline
    def `-sepia-tone`: typings.pdfImage.pdfImageStrings.`-sepia-tone` = "-sepia-tone".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sepia-tone`]
    
    @scala.inline
    def `-set`: typings.pdfImage.pdfImageStrings.`-set` = "-set".asInstanceOf[typings.pdfImage.pdfImageStrings.`-set`]
    
    @scala.inline
    def `-shade`: typings.pdfImage.pdfImageStrings.`-shade` = "-shade".asInstanceOf[typings.pdfImage.pdfImageStrings.`-shade`]
    
    @scala.inline
    def `-shadow`: typings.pdfImage.pdfImageStrings.`-shadow` = "-shadow".asInstanceOf[typings.pdfImage.pdfImageStrings.`-shadow`]
    
    @scala.inline
    def `-sharpen`: typings.pdfImage.pdfImageStrings.`-sharpen` = "-sharpen".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sharpen`]
    
    @scala.inline
    def `-shave`: typings.pdfImage.pdfImageStrings.`-shave` = "-shave".asInstanceOf[typings.pdfImage.pdfImageStrings.`-shave`]
    
    @scala.inline
    def `-shear`: typings.pdfImage.pdfImageStrings.`-shear` = "-shear".asInstanceOf[typings.pdfImage.pdfImageStrings.`-shear`]
    
    @scala.inline
    def `-sigmoidal-contrast`: typings.pdfImage.pdfImageStrings.`-sigmoidal-contrast` = "-sigmoidal-contrast".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sigmoidal-contrast`]
    
    @scala.inline
    def `-size`: typings.pdfImage.pdfImageStrings.`-size` = "-size".asInstanceOf[typings.pdfImage.pdfImageStrings.`-size`]
    
    @scala.inline
    def `-sketch`: typings.pdfImage.pdfImageStrings.`-sketch` = "-sketch".asInstanceOf[typings.pdfImage.pdfImageStrings.`-sketch`]
    
    @scala.inline
    def `-smush`: typings.pdfImage.pdfImageStrings.`-smush` = "-smush".asInstanceOf[typings.pdfImage.pdfImageStrings.`-smush`]
    
    @scala.inline
    def `-solarize`: typings.pdfImage.pdfImageStrings.`-solarize` = "-solarize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-solarize`]
    
    @scala.inline
    def `-splice`: typings.pdfImage.pdfImageStrings.`-splice` = "-splice".asInstanceOf[typings.pdfImage.pdfImageStrings.`-splice`]
    
    @scala.inline
    def `-spread`: typings.pdfImage.pdfImageStrings.`-spread` = "-spread".asInstanceOf[typings.pdfImage.pdfImageStrings.`-spread`]
    
    @scala.inline
    def `-statistic`: typings.pdfImage.pdfImageStrings.`-statistic` = "-statistic".asInstanceOf[typings.pdfImage.pdfImageStrings.`-statistic`]
    
    @scala.inline
    def `-stretch`: typings.pdfImage.pdfImageStrings.`-stretch` = "-stretch".asInstanceOf[typings.pdfImage.pdfImageStrings.`-stretch`]
    
    @scala.inline
    def `-strip`: typings.pdfImage.pdfImageStrings.`-strip` = "-strip".asInstanceOf[typings.pdfImage.pdfImageStrings.`-strip`]
    
    @scala.inline
    def `-stroke`: typings.pdfImage.pdfImageStrings.`-stroke` = "-stroke".asInstanceOf[typings.pdfImage.pdfImageStrings.`-stroke`]
    
    @scala.inline
    def `-strokewidth`: typings.pdfImage.pdfImageStrings.`-strokewidth` = "-strokewidth".asInstanceOf[typings.pdfImage.pdfImageStrings.`-strokewidth`]
    
    @scala.inline
    def `-style`: typings.pdfImage.pdfImageStrings.`-style` = "-style".asInstanceOf[typings.pdfImage.pdfImageStrings.`-style`]
    
    @scala.inline
    def `-swap`: typings.pdfImage.pdfImageStrings.`-swap` = "-swap".asInstanceOf[typings.pdfImage.pdfImageStrings.`-swap`]
    
    @scala.inline
    def `-swirl`: typings.pdfImage.pdfImageStrings.`-swirl` = "-swirl".asInstanceOf[typings.pdfImage.pdfImageStrings.`-swirl`]
    
    @scala.inline
    def `-synchronize`: typings.pdfImage.pdfImageStrings.`-synchronize` = "-synchronize".asInstanceOf[typings.pdfImage.pdfImageStrings.`-synchronize`]
    
    @scala.inline
    def `-taint`: typings.pdfImage.pdfImageStrings.`-taint` = "-taint".asInstanceOf[typings.pdfImage.pdfImageStrings.`-taint`]
    
    @scala.inline
    def `-texture`: typings.pdfImage.pdfImageStrings.`-texture` = "-texture".asInstanceOf[typings.pdfImage.pdfImageStrings.`-texture`]
    
    @scala.inline
    def `-threshold`: typings.pdfImage.pdfImageStrings.`-threshold` = "-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-threshold`]
    
    @scala.inline
    def `-thumbnail`: typings.pdfImage.pdfImageStrings.`-thumbnail` = "-thumbnail".asInstanceOf[typings.pdfImage.pdfImageStrings.`-thumbnail`]
    
    @scala.inline
    def `-tile`: typings.pdfImage.pdfImageStrings.`-tile` = "-tile".asInstanceOf[typings.pdfImage.pdfImageStrings.`-tile`]
    
    @scala.inline
    def `-tile-offset`: typings.pdfImage.pdfImageStrings.`-tile-offset` = "-tile-offset".asInstanceOf[typings.pdfImage.pdfImageStrings.`-tile-offset`]
    
    @scala.inline
    def `-tint`: typings.pdfImage.pdfImageStrings.`-tint` = "-tint".asInstanceOf[typings.pdfImage.pdfImageStrings.`-tint`]
    
    @scala.inline
    def `-transform`: typings.pdfImage.pdfImageStrings.`-transform` = "-transform".asInstanceOf[typings.pdfImage.pdfImageStrings.`-transform`]
    
    @scala.inline
    def `-transparent`: typings.pdfImage.pdfImageStrings.`-transparent` = "-transparent".asInstanceOf[typings.pdfImage.pdfImageStrings.`-transparent`]
    
    @scala.inline
    def `-transparent-color`: typings.pdfImage.pdfImageStrings.`-transparent-color` = "-transparent-color".asInstanceOf[typings.pdfImage.pdfImageStrings.`-transparent-color`]
    
    @scala.inline
    def `-transpose`: typings.pdfImage.pdfImageStrings.`-transpose` = "-transpose".asInstanceOf[typings.pdfImage.pdfImageStrings.`-transpose`]
    
    @scala.inline
    def `-transverse`: typings.pdfImage.pdfImageStrings.`-transverse` = "-transverse".asInstanceOf[typings.pdfImage.pdfImageStrings.`-transverse`]
    
    @scala.inline
    def `-treedepth`: typings.pdfImage.pdfImageStrings.`-treedepth` = "-treedepth".asInstanceOf[typings.pdfImage.pdfImageStrings.`-treedepth`]
    
    @scala.inline
    def `-trim`: typings.pdfImage.pdfImageStrings.`-trim` = "-trim".asInstanceOf[typings.pdfImage.pdfImageStrings.`-trim`]
    
    @scala.inline
    def `-type`: typings.pdfImage.pdfImageStrings.`-type` = "-type".asInstanceOf[typings.pdfImage.pdfImageStrings.`-type`]
    
    @scala.inline
    def `-undercolor`: typings.pdfImage.pdfImageStrings.`-undercolor` = "-undercolor".asInstanceOf[typings.pdfImage.pdfImageStrings.`-undercolor`]
    
    @scala.inline
    def `-unique-colors`: typings.pdfImage.pdfImageStrings.`-unique-colors` = "-unique-colors".asInstanceOf[typings.pdfImage.pdfImageStrings.`-unique-colors`]
    
    @scala.inline
    def `-units`: typings.pdfImage.pdfImageStrings.`-units` = "-units".asInstanceOf[typings.pdfImage.pdfImageStrings.`-units`]
    
    @scala.inline
    def `-unsharp`: typings.pdfImage.pdfImageStrings.`-unsharp` = "-unsharp".asInstanceOf[typings.pdfImage.pdfImageStrings.`-unsharp`]
    
    @scala.inline
    def `-verbose`: typings.pdfImage.pdfImageStrings.`-verbose` = "-verbose".asInstanceOf[typings.pdfImage.pdfImageStrings.`-verbose`]
    
    @scala.inline
    def `-version`: typings.pdfImage.pdfImageStrings.`-version` = "-version".asInstanceOf[typings.pdfImage.pdfImageStrings.`-version`]
    
    @scala.inline
    def `-view`: typings.pdfImage.pdfImageStrings.`-view` = "-view".asInstanceOf[typings.pdfImage.pdfImageStrings.`-view`]
    
    @scala.inline
    def `-vignette`: typings.pdfImage.pdfImageStrings.`-vignette` = "-vignette".asInstanceOf[typings.pdfImage.pdfImageStrings.`-vignette`]
    
    @scala.inline
    def `-virtual-pixel`: typings.pdfImage.pdfImageStrings.`-virtual-pixel` = "-virtual-pixel".asInstanceOf[typings.pdfImage.pdfImageStrings.`-virtual-pixel`]
    
    @scala.inline
    def `-wave`: typings.pdfImage.pdfImageStrings.`-wave` = "-wave".asInstanceOf[typings.pdfImage.pdfImageStrings.`-wave`]
    
    @scala.inline
    def `-wavelet-denoise`: typings.pdfImage.pdfImageStrings.`-wavelet-denoise` = "-wavelet-denoise".asInstanceOf[typings.pdfImage.pdfImageStrings.`-wavelet-denoise`]
    
    @scala.inline
    def `-weight`: typings.pdfImage.pdfImageStrings.`-weight` = "-weight".asInstanceOf[typings.pdfImage.pdfImageStrings.`-weight`]
    
    @scala.inline
    def `-white-point`: typings.pdfImage.pdfImageStrings.`-white-point` = "-white-point".asInstanceOf[typings.pdfImage.pdfImageStrings.`-white-point`]
    
    @scala.inline
    def `-white-threshold`: typings.pdfImage.pdfImageStrings.`-white-threshold` = "-white-threshold".asInstanceOf[typings.pdfImage.pdfImageStrings.`-white-threshold`]
    
    @scala.inline
    def `-write`: typings.pdfImage.pdfImageStrings.`-write` = "-write".asInstanceOf[typings.pdfImage.pdfImageStrings.`-write`]
    
    @scala.inline
    def `-write-mask`: typings.pdfImage.pdfImageStrings.`-write-mask` = "-write-mask".asInstanceOf[typings.pdfImage.pdfImageStrings.`-write-mask`]
  }
  
  /* Inlined {[ key in pdf-image.pdf-image.ConvertOptionKey ]:? string} */
  trait ConvertOptions extends StObject {
    
    var `-adaptive-blur`: js.UndefOr[String] = js.undefined
    
    var `-adaptive-resize`: js.UndefOr[String] = js.undefined
    
    var `-adaptive-sharpen`: js.UndefOr[String] = js.undefined
    
    var `-adjoin`: js.UndefOr[String] = js.undefined
    
    var `-affine`: js.UndefOr[String] = js.undefined
    
    var `-alpha`: js.UndefOr[String] = js.undefined
    
    var `-annotate`: js.UndefOr[String] = js.undefined
    
    var `-antialias`: js.UndefOr[String] = js.undefined
    
    var `-append`: js.UndefOr[String] = js.undefined
    
    var `-authenticate`: js.UndefOr[String] = js.undefined
    
    var `-auto-gamma`: js.UndefOr[String] = js.undefined
    
    var `-auto-level`: js.UndefOr[String] = js.undefined
    
    var `-auto-orient`: js.UndefOr[String] = js.undefined
    
    var `-auto-threshold`: js.UndefOr[String] = js.undefined
    
    var `-background`: js.UndefOr[String] = js.undefined
    
    var `-bench`: js.UndefOr[String] = js.undefined
    
    var `-bias`: js.UndefOr[String] = js.undefined
    
    var `-black-threshold`: js.UndefOr[String] = js.undefined
    
    var `-blue-primary`: js.UndefOr[String] = js.undefined
    
    var `-blue-shift`: js.UndefOr[String] = js.undefined
    
    var `-blur`: js.UndefOr[String] = js.undefined
    
    var `-border`: js.UndefOr[String] = js.undefined
    
    var `-bordercolor`: js.UndefOr[String] = js.undefined
    
    var `-brightness-contrast`: js.UndefOr[String] = js.undefined
    
    var `-canny`: js.UndefOr[String] = js.undefined
    
    var `-caption`: js.UndefOr[String] = js.undefined
    
    var `-cdl`: js.UndefOr[String] = js.undefined
    
    var `-channel`: js.UndefOr[String] = js.undefined
    
    var `-charcoal`: js.UndefOr[String] = js.undefined
    
    var `-chop`: js.UndefOr[String] = js.undefined
    
    var `-clahe`: js.UndefOr[String] = js.undefined
    
    var `-clamp`: js.UndefOr[String] = js.undefined
    
    var `-clip`: js.UndefOr[String] = js.undefined
    
    var `-clip-mask`: js.UndefOr[String] = js.undefined
    
    var `-clip-path`: js.UndefOr[String] = js.undefined
    
    var `-clone`: js.UndefOr[String] = js.undefined
    
    var `-clut`: js.UndefOr[String] = js.undefined
    
    var `-coalesce`: js.UndefOr[String] = js.undefined
    
    var `-color-matrix`: js.UndefOr[String] = js.undefined
    
    var `-colorize`: js.UndefOr[String] = js.undefined
    
    var `-colors`: js.UndefOr[String] = js.undefined
    
    var `-colorspace`: js.UndefOr[String] = js.undefined
    
    var `-combine`: js.UndefOr[String] = js.undefined
    
    var `-comment`: js.UndefOr[String] = js.undefined
    
    var `-compare`: js.UndefOr[String] = js.undefined
    
    var `-complexoperator`: js.UndefOr[String] = js.undefined
    
    var `-compose`: js.UndefOr[String] = js.undefined
    
    var `-composite`: js.UndefOr[String] = js.undefined
    
    var `-compress`: js.UndefOr[String] = js.undefined
    
    var `-connected-components`: js.UndefOr[String] = js.undefined
    
    var `-contrast`: js.UndefOr[String] = js.undefined
    
    var `-contrast-stretch`: js.UndefOr[String] = js.undefined
    
    var `-convolve`: js.UndefOr[String] = js.undefined
    
    var `-copy`: js.UndefOr[String] = js.undefined
    
    var `-crop`: js.UndefOr[String] = js.undefined
    
    var `-cycle`: js.UndefOr[String] = js.undefined
    
    var `-debug`: js.UndefOr[String] = js.undefined
    
    var `-decipher`: js.UndefOr[String] = js.undefined
    
    var `-deconstruct`: js.UndefOr[String] = js.undefined
    
    var `-define`: js.UndefOr[String] = js.undefined
    
    var `-delay`: js.UndefOr[String] = js.undefined
    
    var `-delete`: js.UndefOr[String] = js.undefined
    
    var `-density`: js.UndefOr[String] = js.undefined
    
    var `-depth`: js.UndefOr[String] = js.undefined
    
    var `-despeckle`: js.UndefOr[String] = js.undefined
    
    var `-direction`: js.UndefOr[String] = js.undefined
    
    var `-display`: js.UndefOr[String] = js.undefined
    
    var `-dispose`: js.UndefOr[String] = js.undefined
    
    var `-distort`: js.UndefOr[String] = js.undefined
    
    var `-distribute-cache`: js.UndefOr[String] = js.undefined
    
    var `-dither`: js.UndefOr[String] = js.undefined
    
    var `-draw`: js.UndefOr[String] = js.undefined
    
    var `-duplicate`: js.UndefOr[String] = js.undefined
    
    var `-edge`: js.UndefOr[String] = js.undefined
    
    var `-emboss`: js.UndefOr[String] = js.undefined
    
    var `-encipher`: js.UndefOr[String] = js.undefined
    
    var `-encoding`: js.UndefOr[String] = js.undefined
    
    var `-endian`: js.UndefOr[String] = js.undefined
    
    var `-enhance`: js.UndefOr[String] = js.undefined
    
    var `-equalize`: js.UndefOr[String] = js.undefined
    
    var `-evaluate`: js.UndefOr[String] = js.undefined
    
    var `-evaluate-sequence`: js.UndefOr[String] = js.undefined
    
    var `-extent`: js.UndefOr[String] = js.undefined
    
    var `-extract`: js.UndefOr[String] = js.undefined
    
    var `-family`: js.UndefOr[String] = js.undefined
    
    var `-features`: js.UndefOr[String] = js.undefined
    
    var `-fft`: js.UndefOr[String] = js.undefined
    
    var `-fill`: js.UndefOr[String] = js.undefined
    
    var `-filter`: js.UndefOr[String] = js.undefined
    
    var `-flatten`: js.UndefOr[String] = js.undefined
    
    var `-flip`: js.UndefOr[String] = js.undefined
    
    var `-floodfill`: js.UndefOr[String] = js.undefined
    
    var `-flop`: js.UndefOr[String] = js.undefined
    
    var `-font`: js.UndefOr[String] = js.undefined
    
    var `-format`: js.UndefOr[String] = js.undefined
    
    var `-frame`: js.UndefOr[String] = js.undefined
    
    var `-function`: js.UndefOr[String] = js.undefined
    
    var `-fuzz`: js.UndefOr[String] = js.undefined
    
    var `-fx`: js.UndefOr[String] = js.undefined
    
    var `-gamma`: js.UndefOr[String] = js.undefined
    
    var `-gaussian-blur`: js.UndefOr[String] = js.undefined
    
    var `-geometry`: js.UndefOr[String] = js.undefined
    
    var `-gravity`: js.UndefOr[String] = js.undefined
    
    var `-grayscale`: js.UndefOr[String] = js.undefined
    
    var `-green-primary`: js.UndefOr[String] = js.undefined
    
    var `-help`: js.UndefOr[String] = js.undefined
    
    var `-hough-lines`: js.UndefOr[String] = js.undefined
    
    var `-identify`: js.UndefOr[String] = js.undefined
    
    var `-ift`: js.UndefOr[String] = js.undefined
    
    var `-implode`: js.UndefOr[String] = js.undefined
    
    var `-insert`: js.UndefOr[String] = js.undefined
    
    var `-intensity`: js.UndefOr[String] = js.undefined
    
    var `-intent`: js.UndefOr[String] = js.undefined
    
    var `-interlace`: js.UndefOr[String] = js.undefined
    
    var `-interline-spacing`: js.UndefOr[String] = js.undefined
    
    var `-interpolate`: js.UndefOr[String] = js.undefined
    
    var `-interword-spacing`: js.UndefOr[String] = js.undefined
    
    var `-kerning`: js.UndefOr[String] = js.undefined
    
    var `-kmeans`: js.UndefOr[String] = js.undefined
    
    var `-kuwahara`: js.UndefOr[String] = js.undefined
    
    var `-label`: js.UndefOr[String] = js.undefined
    
    var `-lat`: js.UndefOr[String] = js.undefined
    
    var `-layers`: js.UndefOr[String] = js.undefined
    
    var `-level`: js.UndefOr[String] = js.undefined
    
    var `-limit`: js.UndefOr[String] = js.undefined
    
    var `-linear-stretch`: js.UndefOr[String] = js.undefined
    
    var `-liquid-rescale`: js.UndefOr[String] = js.undefined
    
    var `-list`: js.UndefOr[String] = js.undefined
    
    var `-log`: js.UndefOr[String] = js.undefined
    
    var `-loop`: js.UndefOr[String] = js.undefined
    
    var `-mattecolor`: js.UndefOr[String] = js.undefined
    
    var `-mean-shift`: js.UndefOr[String] = js.undefined
    
    var `-median`: js.UndefOr[String] = js.undefined
    
    var `-metric`: js.UndefOr[String] = js.undefined
    
    var `-mode`: js.UndefOr[String] = js.undefined
    
    var `-modulate`: js.UndefOr[String] = js.undefined
    
    var `-moments`: js.UndefOr[String] = js.undefined
    
    var `-monitor`: js.UndefOr[String] = js.undefined
    
    var `-monochrome`: js.UndefOr[String] = js.undefined
    
    var `-morph`: js.UndefOr[String] = js.undefined
    
    var `-morphology`: js.UndefOr[String] = js.undefined
    
    var `-motion-blur`: js.UndefOr[String] = js.undefined
    
    var `-negate`: js.UndefOr[String] = js.undefined
    
    var `-noise`: js.UndefOr[String] = js.undefined
    
    var `-normalize`: js.UndefOr[String] = js.undefined
    
    var `-opaque`: js.UndefOr[String] = js.undefined
    
    var `-ordered-dither`: js.UndefOr[String] = js.undefined
    
    var `-orient`: js.UndefOr[String] = js.undefined
    
    var `-page`: js.UndefOr[String] = js.undefined
    
    var `-paint`: js.UndefOr[String] = js.undefined
    
    var `-perceptible`: js.UndefOr[String] = js.undefined
    
    var `-ping`: js.UndefOr[String] = js.undefined
    
    var `-pointsize`: js.UndefOr[String] = js.undefined
    
    var `-polaroid`: js.UndefOr[String] = js.undefined
    
    var `-poly`: js.UndefOr[String] = js.undefined
    
    var `-posterize`: js.UndefOr[String] = js.undefined
    
    var `-precision`: js.UndefOr[String] = js.undefined
    
    var `-preview`: js.UndefOr[String] = js.undefined
    
    var `-print`: js.UndefOr[String] = js.undefined
    
    var `-process`: js.UndefOr[String] = js.undefined
    
    var `-profile`: js.UndefOr[String] = js.undefined
    
    var `-quality`: js.UndefOr[String] = js.undefined
    
    var `-quantize`: js.UndefOr[String] = js.undefined
    
    var `-quiet`: js.UndefOr[String] = js.undefined
    
    var `-radial-blur`: js.UndefOr[String] = js.undefined
    
    var `-raise`: js.UndefOr[String] = js.undefined
    
    var `-random-threshold`: js.UndefOr[String] = js.undefined
    
    var `-range-threshold`: js.UndefOr[String] = js.undefined
    
    var `-read-mask`: js.UndefOr[String] = js.undefined
    
    var `-red-primary`: js.UndefOr[String] = js.undefined
    
    var `-regard-warnings`: js.UndefOr[String] = js.undefined
    
    var `-region`: js.UndefOr[String] = js.undefined
    
    var `-remap`: js.UndefOr[String] = js.undefined
    
    var `-render`: js.UndefOr[String] = js.undefined
    
    var `-repage`: js.UndefOr[String] = js.undefined
    
    var `-resample`: js.UndefOr[String] = js.undefined
    
    var `-resize`: js.UndefOr[String] = js.undefined
    
    var `-respect-parentheses`: js.UndefOr[String] = js.undefined
    
    var `-roll`: js.UndefOr[String] = js.undefined
    
    var `-rotate`: js.UndefOr[String] = js.undefined
    
    var `-sample`: js.UndefOr[String] = js.undefined
    
    var `-sampling-factor`: js.UndefOr[String] = js.undefined
    
    var `-scale`: js.UndefOr[String] = js.undefined
    
    var `-scene`: js.UndefOr[String] = js.undefined
    
    var `-seed`: js.UndefOr[String] = js.undefined
    
    var `-segment`: js.UndefOr[String] = js.undefined
    
    var `-selective-blur`: js.UndefOr[String] = js.undefined
    
    var `-separate`: js.UndefOr[String] = js.undefined
    
    var `-sepia-tone`: js.UndefOr[String] = js.undefined
    
    var `-set`: js.UndefOr[String] = js.undefined
    
    var `-shade`: js.UndefOr[String] = js.undefined
    
    var `-shadow`: js.UndefOr[String] = js.undefined
    
    var `-sharpen`: js.UndefOr[String] = js.undefined
    
    var `-shave`: js.UndefOr[String] = js.undefined
    
    var `-shear`: js.UndefOr[String] = js.undefined
    
    var `-sigmoidal-contrast`: js.UndefOr[String] = js.undefined
    
    var `-size`: js.UndefOr[String] = js.undefined
    
    var `-sketch`: js.UndefOr[String] = js.undefined
    
    var `-smush`: js.UndefOr[String] = js.undefined
    
    var `-solarize`: js.UndefOr[String] = js.undefined
    
    var `-splice`: js.UndefOr[String] = js.undefined
    
    var `-spread`: js.UndefOr[String] = js.undefined
    
    var `-statistic`: js.UndefOr[String] = js.undefined
    
    var `-stretch`: js.UndefOr[String] = js.undefined
    
    var `-strip`: js.UndefOr[String] = js.undefined
    
    var `-stroke`: js.UndefOr[String] = js.undefined
    
    var `-strokewidth`: js.UndefOr[String] = js.undefined
    
    var `-style`: js.UndefOr[String] = js.undefined
    
    var `-swap`: js.UndefOr[String] = js.undefined
    
    var `-swirl`: js.UndefOr[String] = js.undefined
    
    var `-synchronize`: js.UndefOr[String] = js.undefined
    
    var `-taint`: js.UndefOr[String] = js.undefined
    
    var `-texture`: js.UndefOr[String] = js.undefined
    
    var `-threshold`: js.UndefOr[String] = js.undefined
    
    var `-thumbnail`: js.UndefOr[String] = js.undefined
    
    var `-tile`: js.UndefOr[String] = js.undefined
    
    var `-tile-offset`: js.UndefOr[String] = js.undefined
    
    var `-tint`: js.UndefOr[String] = js.undefined
    
    var `-transform`: js.UndefOr[String] = js.undefined
    
    var `-transparent`: js.UndefOr[String] = js.undefined
    
    var `-transparent-color`: js.UndefOr[String] = js.undefined
    
    var `-transpose`: js.UndefOr[String] = js.undefined
    
    var `-transverse`: js.UndefOr[String] = js.undefined
    
    var `-treedepth`: js.UndefOr[String] = js.undefined
    
    var `-trim`: js.UndefOr[String] = js.undefined
    
    var `-type`: js.UndefOr[String] = js.undefined
    
    var `-undercolor`: js.UndefOr[String] = js.undefined
    
    var `-unique-colors`: js.UndefOr[String] = js.undefined
    
    var `-units`: js.UndefOr[String] = js.undefined
    
    var `-unsharp`: js.UndefOr[String] = js.undefined
    
    var `-verbose`: js.UndefOr[String] = js.undefined
    
    var `-version`: js.UndefOr[String] = js.undefined
    
    var `-view`: js.UndefOr[String] = js.undefined
    
    var `-vignette`: js.UndefOr[String] = js.undefined
    
    var `-virtual-pixel`: js.UndefOr[String] = js.undefined
    
    var `-wave`: js.UndefOr[String] = js.undefined
    
    var `-wavelet-denoise`: js.UndefOr[String] = js.undefined
    
    var `-weight`: js.UndefOr[String] = js.undefined
    
    var `-white-point`: js.UndefOr[String] = js.undefined
    
    var `-white-threshold`: js.UndefOr[String] = js.undefined
    
    var `-write`: js.UndefOr[String] = js.undefined
    
    var `-write-mask`: js.UndefOr[String] = js.undefined
  }
  object ConvertOptions {
    
    @scala.inline
    def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit class ConvertOptionsMutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set-adaptive-blur`(value: String): Self = StObject.set(x, "-adaptive-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-blurUndefined`: Self = StObject.set(x, "-adaptive-blur", js.undefined)
      
      @scala.inline
      def `set-adaptive-resize`(value: String): Self = StObject.set(x, "-adaptive-resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-resizeUndefined`: Self = StObject.set(x, "-adaptive-resize", js.undefined)
      
      @scala.inline
      def `set-adaptive-sharpen`(value: String): Self = StObject.set(x, "-adaptive-sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adaptive-sharpenUndefined`: Self = StObject.set(x, "-adaptive-sharpen", js.undefined)
      
      @scala.inline
      def `set-adjoin`(value: String): Self = StObject.set(x, "-adjoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-adjoinUndefined`: Self = StObject.set(x, "-adjoin", js.undefined)
      
      @scala.inline
      def `set-affine`(value: String): Self = StObject.set(x, "-affine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-affineUndefined`: Self = StObject.set(x, "-affine", js.undefined)
      
      @scala.inline
      def `set-alpha`(value: String): Self = StObject.set(x, "-alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-alphaUndefined`: Self = StObject.set(x, "-alpha", js.undefined)
      
      @scala.inline
      def `set-annotate`(value: String): Self = StObject.set(x, "-annotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-annotateUndefined`: Self = StObject.set(x, "-annotate", js.undefined)
      
      @scala.inline
      def `set-antialias`(value: String): Self = StObject.set(x, "-antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-antialiasUndefined`: Self = StObject.set(x, "-antialias", js.undefined)
      
      @scala.inline
      def `set-append`(value: String): Self = StObject.set(x, "-append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-appendUndefined`: Self = StObject.set(x, "-append", js.undefined)
      
      @scala.inline
      def `set-authenticate`(value: String): Self = StObject.set(x, "-authenticate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-authenticateUndefined`: Self = StObject.set(x, "-authenticate", js.undefined)
      
      @scala.inline
      def `set-auto-gamma`(value: String): Self = StObject.set(x, "-auto-gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-gammaUndefined`: Self = StObject.set(x, "-auto-gamma", js.undefined)
      
      @scala.inline
      def `set-auto-level`(value: String): Self = StObject.set(x, "-auto-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-levelUndefined`: Self = StObject.set(x, "-auto-level", js.undefined)
      
      @scala.inline
      def `set-auto-orient`(value: String): Self = StObject.set(x, "-auto-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-orientUndefined`: Self = StObject.set(x, "-auto-orient", js.undefined)
      
      @scala.inline
      def `set-auto-threshold`(value: String): Self = StObject.set(x, "-auto-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-auto-thresholdUndefined`: Self = StObject.set(x, "-auto-threshold", js.undefined)
      
      @scala.inline
      def `set-background`(value: String): Self = StObject.set(x, "-background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-backgroundUndefined`: Self = StObject.set(x, "-background", js.undefined)
      
      @scala.inline
      def `set-bench`(value: String): Self = StObject.set(x, "-bench", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-benchUndefined`: Self = StObject.set(x, "-bench", js.undefined)
      
      @scala.inline
      def `set-bias`(value: String): Self = StObject.set(x, "-bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-biasUndefined`: Self = StObject.set(x, "-bias", js.undefined)
      
      @scala.inline
      def `set-black-threshold`(value: String): Self = StObject.set(x, "-black-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-black-thresholdUndefined`: Self = StObject.set(x, "-black-threshold", js.undefined)
      
      @scala.inline
      def `set-blue-primary`(value: String): Self = StObject.set(x, "-blue-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blue-primaryUndefined`: Self = StObject.set(x, "-blue-primary", js.undefined)
      
      @scala.inline
      def `set-blue-shift`(value: String): Self = StObject.set(x, "-blue-shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blue-shiftUndefined`: Self = StObject.set(x, "-blue-shift", js.undefined)
      
      @scala.inline
      def `set-blur`(value: String): Self = StObject.set(x, "-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-blurUndefined`: Self = StObject.set(x, "-blur", js.undefined)
      
      @scala.inline
      def `set-border`(value: String): Self = StObject.set(x, "-border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-borderUndefined`: Self = StObject.set(x, "-border", js.undefined)
      
      @scala.inline
      def `set-bordercolor`(value: String): Self = StObject.set(x, "-bordercolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-bordercolorUndefined`: Self = StObject.set(x, "-bordercolor", js.undefined)
      
      @scala.inline
      def `set-brightness-contrast`(value: String): Self = StObject.set(x, "-brightness-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-brightness-contrastUndefined`: Self = StObject.set(x, "-brightness-contrast", js.undefined)
      
      @scala.inline
      def `set-canny`(value: String): Self = StObject.set(x, "-canny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cannyUndefined`: Self = StObject.set(x, "-canny", js.undefined)
      
      @scala.inline
      def `set-caption`(value: String): Self = StObject.set(x, "-caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-captionUndefined`: Self = StObject.set(x, "-caption", js.undefined)
      
      @scala.inline
      def `set-cdl`(value: String): Self = StObject.set(x, "-cdl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cdlUndefined`: Self = StObject.set(x, "-cdl", js.undefined)
      
      @scala.inline
      def `set-channel`(value: String): Self = StObject.set(x, "-channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-channelUndefined`: Self = StObject.set(x, "-channel", js.undefined)
      
      @scala.inline
      def `set-charcoal`(value: String): Self = StObject.set(x, "-charcoal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-charcoalUndefined`: Self = StObject.set(x, "-charcoal", js.undefined)
      
      @scala.inline
      def `set-chop`(value: String): Self = StObject.set(x, "-chop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-chopUndefined`: Self = StObject.set(x, "-chop", js.undefined)
      
      @scala.inline
      def `set-clahe`(value: String): Self = StObject.set(x, "-clahe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-claheUndefined`: Self = StObject.set(x, "-clahe", js.undefined)
      
      @scala.inline
      def `set-clamp`(value: String): Self = StObject.set(x, "-clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clampUndefined`: Self = StObject.set(x, "-clamp", js.undefined)
      
      @scala.inline
      def `set-clip`(value: String): Self = StObject.set(x, "-clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-mask`(value: String): Self = StObject.set(x, "-clip-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-maskUndefined`: Self = StObject.set(x, "-clip-mask", js.undefined)
      
      @scala.inline
      def `set-clip-path`(value: String): Self = StObject.set(x, "-clip-path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clip-pathUndefined`: Self = StObject.set(x, "-clip-path", js.undefined)
      
      @scala.inline
      def `set-clipUndefined`: Self = StObject.set(x, "-clip", js.undefined)
      
      @scala.inline
      def `set-clone`(value: String): Self = StObject.set(x, "-clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cloneUndefined`: Self = StObject.set(x, "-clone", js.undefined)
      
      @scala.inline
      def `set-clut`(value: String): Self = StObject.set(x, "-clut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-clutUndefined`: Self = StObject.set(x, "-clut", js.undefined)
      
      @scala.inline
      def `set-coalesce`(value: String): Self = StObject.set(x, "-coalesce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-coalesceUndefined`: Self = StObject.set(x, "-coalesce", js.undefined)
      
      @scala.inline
      def `set-color-matrix`(value: String): Self = StObject.set(x, "-color-matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-color-matrixUndefined`: Self = StObject.set(x, "-color-matrix", js.undefined)
      
      @scala.inline
      def `set-colorize`(value: String): Self = StObject.set(x, "-colorize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorizeUndefined`: Self = StObject.set(x, "-colorize", js.undefined)
      
      @scala.inline
      def `set-colors`(value: String): Self = StObject.set(x, "-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorsUndefined`: Self = StObject.set(x, "-colors", js.undefined)
      
      @scala.inline
      def `set-colorspace`(value: String): Self = StObject.set(x, "-colorspace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-colorspaceUndefined`: Self = StObject.set(x, "-colorspace", js.undefined)
      
      @scala.inline
      def `set-combine`(value: String): Self = StObject.set(x, "-combine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-combineUndefined`: Self = StObject.set(x, "-combine", js.undefined)
      
      @scala.inline
      def `set-comment`(value: String): Self = StObject.set(x, "-comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-commentUndefined`: Self = StObject.set(x, "-comment", js.undefined)
      
      @scala.inline
      def `set-compare`(value: String): Self = StObject.set(x, "-compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compareUndefined`: Self = StObject.set(x, "-compare", js.undefined)
      
      @scala.inline
      def `set-complexoperator`(value: String): Self = StObject.set(x, "-complexoperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-complexoperatorUndefined`: Self = StObject.set(x, "-complexoperator", js.undefined)
      
      @scala.inline
      def `set-compose`(value: String): Self = StObject.set(x, "-compose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-composeUndefined`: Self = StObject.set(x, "-compose", js.undefined)
      
      @scala.inline
      def `set-composite`(value: String): Self = StObject.set(x, "-composite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compositeUndefined`: Self = StObject.set(x, "-composite", js.undefined)
      
      @scala.inline
      def `set-compress`(value: String): Self = StObject.set(x, "-compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-compressUndefined`: Self = StObject.set(x, "-compress", js.undefined)
      
      @scala.inline
      def `set-connected-components`(value: String): Self = StObject.set(x, "-connected-components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-connected-componentsUndefined`: Self = StObject.set(x, "-connected-components", js.undefined)
      
      @scala.inline
      def `set-contrast`(value: String): Self = StObject.set(x, "-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-contrast-stretch`(value: String): Self = StObject.set(x, "-contrast-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-contrast-stretchUndefined`: Self = StObject.set(x, "-contrast-stretch", js.undefined)
      
      @scala.inline
      def `set-contrastUndefined`: Self = StObject.set(x, "-contrast", js.undefined)
      
      @scala.inline
      def `set-convolve`(value: String): Self = StObject.set(x, "-convolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-convolveUndefined`: Self = StObject.set(x, "-convolve", js.undefined)
      
      @scala.inline
      def `set-copy`(value: String): Self = StObject.set(x, "-copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-copyUndefined`: Self = StObject.set(x, "-copy", js.undefined)
      
      @scala.inline
      def `set-crop`(value: String): Self = StObject.set(x, "-crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cropUndefined`: Self = StObject.set(x, "-crop", js.undefined)
      
      @scala.inline
      def `set-cycle`(value: String): Self = StObject.set(x, "-cycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-cycleUndefined`: Self = StObject.set(x, "-cycle", js.undefined)
      
      @scala.inline
      def `set-debug`(value: String): Self = StObject.set(x, "-debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-debugUndefined`: Self = StObject.set(x, "-debug", js.undefined)
      
      @scala.inline
      def `set-decipher`(value: String): Self = StObject.set(x, "-decipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-decipherUndefined`: Self = StObject.set(x, "-decipher", js.undefined)
      
      @scala.inline
      def `set-deconstruct`(value: String): Self = StObject.set(x, "-deconstruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-deconstructUndefined`: Self = StObject.set(x, "-deconstruct", js.undefined)
      
      @scala.inline
      def `set-define`(value: String): Self = StObject.set(x, "-define", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-defineUndefined`: Self = StObject.set(x, "-define", js.undefined)
      
      @scala.inline
      def `set-delay`(value: String): Self = StObject.set(x, "-delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-delayUndefined`: Self = StObject.set(x, "-delay", js.undefined)
      
      @scala.inline
      def `set-delete`(value: String): Self = StObject.set(x, "-delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-deleteUndefined`: Self = StObject.set(x, "-delete", js.undefined)
      
      @scala.inline
      def `set-density`(value: String): Self = StObject.set(x, "-density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-densityUndefined`: Self = StObject.set(x, "-density", js.undefined)
      
      @scala.inline
      def `set-depth`(value: String): Self = StObject.set(x, "-depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-depthUndefined`: Self = StObject.set(x, "-depth", js.undefined)
      
      @scala.inline
      def `set-despeckle`(value: String): Self = StObject.set(x, "-despeckle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-despeckleUndefined`: Self = StObject.set(x, "-despeckle", js.undefined)
      
      @scala.inline
      def `set-direction`(value: String): Self = StObject.set(x, "-direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-directionUndefined`: Self = StObject.set(x, "-direction", js.undefined)
      
      @scala.inline
      def `set-display`(value: String): Self = StObject.set(x, "-display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-displayUndefined`: Self = StObject.set(x, "-display", js.undefined)
      
      @scala.inline
      def `set-dispose`(value: String): Self = StObject.set(x, "-dispose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-disposeUndefined`: Self = StObject.set(x, "-dispose", js.undefined)
      
      @scala.inline
      def `set-distort`(value: String): Self = StObject.set(x, "-distort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-distortUndefined`: Self = StObject.set(x, "-distort", js.undefined)
      
      @scala.inline
      def `set-distribute-cache`(value: String): Self = StObject.set(x, "-distribute-cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-distribute-cacheUndefined`: Self = StObject.set(x, "-distribute-cache", js.undefined)
      
      @scala.inline
      def `set-dither`(value: String): Self = StObject.set(x, "-dither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ditherUndefined`: Self = StObject.set(x, "-dither", js.undefined)
      
      @scala.inline
      def `set-draw`(value: String): Self = StObject.set(x, "-draw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-drawUndefined`: Self = StObject.set(x, "-draw", js.undefined)
      
      @scala.inline
      def `set-duplicate`(value: String): Self = StObject.set(x, "-duplicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-duplicateUndefined`: Self = StObject.set(x, "-duplicate", js.undefined)
      
      @scala.inline
      def `set-edge`(value: String): Self = StObject.set(x, "-edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-edgeUndefined`: Self = StObject.set(x, "-edge", js.undefined)
      
      @scala.inline
      def `set-emboss`(value: String): Self = StObject.set(x, "-emboss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-embossUndefined`: Self = StObject.set(x, "-emboss", js.undefined)
      
      @scala.inline
      def `set-encipher`(value: String): Self = StObject.set(x, "-encipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-encipherUndefined`: Self = StObject.set(x, "-encipher", js.undefined)
      
      @scala.inline
      def `set-encoding`(value: String): Self = StObject.set(x, "-encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-encodingUndefined`: Self = StObject.set(x, "-encoding", js.undefined)
      
      @scala.inline
      def `set-endian`(value: String): Self = StObject.set(x, "-endian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-endianUndefined`: Self = StObject.set(x, "-endian", js.undefined)
      
      @scala.inline
      def `set-enhance`(value: String): Self = StObject.set(x, "-enhance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-enhanceUndefined`: Self = StObject.set(x, "-enhance", js.undefined)
      
      @scala.inline
      def `set-equalize`(value: String): Self = StObject.set(x, "-equalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-equalizeUndefined`: Self = StObject.set(x, "-equalize", js.undefined)
      
      @scala.inline
      def `set-evaluate`(value: String): Self = StObject.set(x, "-evaluate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-evaluate-sequence`(value: String): Self = StObject.set(x, "-evaluate-sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-evaluate-sequenceUndefined`: Self = StObject.set(x, "-evaluate-sequence", js.undefined)
      
      @scala.inline
      def `set-evaluateUndefined`: Self = StObject.set(x, "-evaluate", js.undefined)
      
      @scala.inline
      def `set-extent`(value: String): Self = StObject.set(x, "-extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-extentUndefined`: Self = StObject.set(x, "-extent", js.undefined)
      
      @scala.inline
      def `set-extract`(value: String): Self = StObject.set(x, "-extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-extractUndefined`: Self = StObject.set(x, "-extract", js.undefined)
      
      @scala.inline
      def `set-family`(value: String): Self = StObject.set(x, "-family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-familyUndefined`: Self = StObject.set(x, "-family", js.undefined)
      
      @scala.inline
      def `set-features`(value: String): Self = StObject.set(x, "-features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-featuresUndefined`: Self = StObject.set(x, "-features", js.undefined)
      
      @scala.inline
      def `set-fft`(value: String): Self = StObject.set(x, "-fft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fftUndefined`: Self = StObject.set(x, "-fft", js.undefined)
      
      @scala.inline
      def `set-fill`(value: String): Self = StObject.set(x, "-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fillUndefined`: Self = StObject.set(x, "-fill", js.undefined)
      
      @scala.inline
      def `set-filter`(value: String): Self = StObject.set(x, "-filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-filterUndefined`: Self = StObject.set(x, "-filter", js.undefined)
      
      @scala.inline
      def `set-flatten`(value: String): Self = StObject.set(x, "-flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flattenUndefined`: Self = StObject.set(x, "-flatten", js.undefined)
      
      @scala.inline
      def `set-flip`(value: String): Self = StObject.set(x, "-flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flipUndefined`: Self = StObject.set(x, "-flip", js.undefined)
      
      @scala.inline
      def `set-floodfill`(value: String): Self = StObject.set(x, "-floodfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-floodfillUndefined`: Self = StObject.set(x, "-floodfill", js.undefined)
      
      @scala.inline
      def `set-flop`(value: String): Self = StObject.set(x, "-flop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-flopUndefined`: Self = StObject.set(x, "-flop", js.undefined)
      
      @scala.inline
      def `set-font`(value: String): Self = StObject.set(x, "-font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fontUndefined`: Self = StObject.set(x, "-font", js.undefined)
      
      @scala.inline
      def `set-format`(value: String): Self = StObject.set(x, "-format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-formatUndefined`: Self = StObject.set(x, "-format", js.undefined)
      
      @scala.inline
      def `set-frame`(value: String): Self = StObject.set(x, "-frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-frameUndefined`: Self = StObject.set(x, "-frame", js.undefined)
      
      @scala.inline
      def `set-function`(value: String): Self = StObject.set(x, "-function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-functionUndefined`: Self = StObject.set(x, "-function", js.undefined)
      
      @scala.inline
      def `set-fuzz`(value: String): Self = StObject.set(x, "-fuzz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fuzzUndefined`: Self = StObject.set(x, "-fuzz", js.undefined)
      
      @scala.inline
      def `set-fx`(value: String): Self = StObject.set(x, "-fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-fxUndefined`: Self = StObject.set(x, "-fx", js.undefined)
      
      @scala.inline
      def `set-gamma`(value: String): Self = StObject.set(x, "-gamma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gammaUndefined`: Self = StObject.set(x, "-gamma", js.undefined)
      
      @scala.inline
      def `set-gaussian-blur`(value: String): Self = StObject.set(x, "-gaussian-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gaussian-blurUndefined`: Self = StObject.set(x, "-gaussian-blur", js.undefined)
      
      @scala.inline
      def `set-geometry`(value: String): Self = StObject.set(x, "-geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-geometryUndefined`: Self = StObject.set(x, "-geometry", js.undefined)
      
      @scala.inline
      def `set-gravity`(value: String): Self = StObject.set(x, "-gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-gravityUndefined`: Self = StObject.set(x, "-gravity", js.undefined)
      
      @scala.inline
      def `set-grayscale`(value: String): Self = StObject.set(x, "-grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-grayscaleUndefined`: Self = StObject.set(x, "-grayscale", js.undefined)
      
      @scala.inline
      def `set-green-primary`(value: String): Self = StObject.set(x, "-green-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-green-primaryUndefined`: Self = StObject.set(x, "-green-primary", js.undefined)
      
      @scala.inline
      def `set-help`(value: String): Self = StObject.set(x, "-help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-helpUndefined`: Self = StObject.set(x, "-help", js.undefined)
      
      @scala.inline
      def `set-hough-lines`(value: String): Self = StObject.set(x, "-hough-lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-hough-linesUndefined`: Self = StObject.set(x, "-hough-lines", js.undefined)
      
      @scala.inline
      def `set-identify`(value: String): Self = StObject.set(x, "-identify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-identifyUndefined`: Self = StObject.set(x, "-identify", js.undefined)
      
      @scala.inline
      def `set-ift`(value: String): Self = StObject.set(x, "-ift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-iftUndefined`: Self = StObject.set(x, "-ift", js.undefined)
      
      @scala.inline
      def `set-implode`(value: String): Self = StObject.set(x, "-implode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-implodeUndefined`: Self = StObject.set(x, "-implode", js.undefined)
      
      @scala.inline
      def `set-insert`(value: String): Self = StObject.set(x, "-insert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-insertUndefined`: Self = StObject.set(x, "-insert", js.undefined)
      
      @scala.inline
      def `set-intensity`(value: String): Self = StObject.set(x, "-intensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-intensityUndefined`: Self = StObject.set(x, "-intensity", js.undefined)
      
      @scala.inline
      def `set-intent`(value: String): Self = StObject.set(x, "-intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-intentUndefined`: Self = StObject.set(x, "-intent", js.undefined)
      
      @scala.inline
      def `set-interlace`(value: String): Self = StObject.set(x, "-interlace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interlaceUndefined`: Self = StObject.set(x, "-interlace", js.undefined)
      
      @scala.inline
      def `set-interline-spacing`(value: String): Self = StObject.set(x, "-interline-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interline-spacingUndefined`: Self = StObject.set(x, "-interline-spacing", js.undefined)
      
      @scala.inline
      def `set-interpolate`(value: String): Self = StObject.set(x, "-interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interpolateUndefined`: Self = StObject.set(x, "-interpolate", js.undefined)
      
      @scala.inline
      def `set-interword-spacing`(value: String): Self = StObject.set(x, "-interword-spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-interword-spacingUndefined`: Self = StObject.set(x, "-interword-spacing", js.undefined)
      
      @scala.inline
      def `set-kerning`(value: String): Self = StObject.set(x, "-kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kerningUndefined`: Self = StObject.set(x, "-kerning", js.undefined)
      
      @scala.inline
      def `set-kmeans`(value: String): Self = StObject.set(x, "-kmeans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kmeansUndefined`: Self = StObject.set(x, "-kmeans", js.undefined)
      
      @scala.inline
      def `set-kuwahara`(value: String): Self = StObject.set(x, "-kuwahara", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-kuwaharaUndefined`: Self = StObject.set(x, "-kuwahara", js.undefined)
      
      @scala.inline
      def `set-label`(value: String): Self = StObject.set(x, "-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-labelUndefined`: Self = StObject.set(x, "-label", js.undefined)
      
      @scala.inline
      def `set-lat`(value: String): Self = StObject.set(x, "-lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-latUndefined`: Self = StObject.set(x, "-lat", js.undefined)
      
      @scala.inline
      def `set-layers`(value: String): Self = StObject.set(x, "-layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-layersUndefined`: Self = StObject.set(x, "-layers", js.undefined)
      
      @scala.inline
      def `set-level`(value: String): Self = StObject.set(x, "-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-levelUndefined`: Self = StObject.set(x, "-level", js.undefined)
      
      @scala.inline
      def `set-limit`(value: String): Self = StObject.set(x, "-limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-limitUndefined`: Self = StObject.set(x, "-limit", js.undefined)
      
      @scala.inline
      def `set-linear-stretch`(value: String): Self = StObject.set(x, "-linear-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-linear-stretchUndefined`: Self = StObject.set(x, "-linear-stretch", js.undefined)
      
      @scala.inline
      def `set-liquid-rescale`(value: String): Self = StObject.set(x, "-liquid-rescale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-liquid-rescaleUndefined`: Self = StObject.set(x, "-liquid-rescale", js.undefined)
      
      @scala.inline
      def `set-list`(value: String): Self = StObject.set(x, "-list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-listUndefined`: Self = StObject.set(x, "-list", js.undefined)
      
      @scala.inline
      def `set-log`(value: String): Self = StObject.set(x, "-log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-logUndefined`: Self = StObject.set(x, "-log", js.undefined)
      
      @scala.inline
      def `set-loop`(value: String): Self = StObject.set(x, "-loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-loopUndefined`: Self = StObject.set(x, "-loop", js.undefined)
      
      @scala.inline
      def `set-mattecolor`(value: String): Self = StObject.set(x, "-mattecolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-mattecolorUndefined`: Self = StObject.set(x, "-mattecolor", js.undefined)
      
      @scala.inline
      def `set-mean-shift`(value: String): Self = StObject.set(x, "-mean-shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-mean-shiftUndefined`: Self = StObject.set(x, "-mean-shift", js.undefined)
      
      @scala.inline
      def `set-median`(value: String): Self = StObject.set(x, "-median", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-medianUndefined`: Self = StObject.set(x, "-median", js.undefined)
      
      @scala.inline
      def `set-metric`(value: String): Self = StObject.set(x, "-metric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-metricUndefined`: Self = StObject.set(x, "-metric", js.undefined)
      
      @scala.inline
      def `set-mode`(value: String): Self = StObject.set(x, "-mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-modeUndefined`: Self = StObject.set(x, "-mode", js.undefined)
      
      @scala.inline
      def `set-modulate`(value: String): Self = StObject.set(x, "-modulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-modulateUndefined`: Self = StObject.set(x, "-modulate", js.undefined)
      
      @scala.inline
      def `set-moments`(value: String): Self = StObject.set(x, "-moments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-momentsUndefined`: Self = StObject.set(x, "-moments", js.undefined)
      
      @scala.inline
      def `set-monitor`(value: String): Self = StObject.set(x, "-monitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-monitorUndefined`: Self = StObject.set(x, "-monitor", js.undefined)
      
      @scala.inline
      def `set-monochrome`(value: String): Self = StObject.set(x, "-monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-monochromeUndefined`: Self = StObject.set(x, "-monochrome", js.undefined)
      
      @scala.inline
      def `set-morph`(value: String): Self = StObject.set(x, "-morph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-morphUndefined`: Self = StObject.set(x, "-morph", js.undefined)
      
      @scala.inline
      def `set-morphology`(value: String): Self = StObject.set(x, "-morphology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-morphologyUndefined`: Self = StObject.set(x, "-morphology", js.undefined)
      
      @scala.inline
      def `set-motion-blur`(value: String): Self = StObject.set(x, "-motion-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-motion-blurUndefined`: Self = StObject.set(x, "-motion-blur", js.undefined)
      
      @scala.inline
      def `set-negate`(value: String): Self = StObject.set(x, "-negate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-negateUndefined`: Self = StObject.set(x, "-negate", js.undefined)
      
      @scala.inline
      def `set-noise`(value: String): Self = StObject.set(x, "-noise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-noiseUndefined`: Self = StObject.set(x, "-noise", js.undefined)
      
      @scala.inline
      def `set-normalize`(value: String): Self = StObject.set(x, "-normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-normalizeUndefined`: Self = StObject.set(x, "-normalize", js.undefined)
      
      @scala.inline
      def `set-opaque`(value: String): Self = StObject.set(x, "-opaque", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-opaqueUndefined`: Self = StObject.set(x, "-opaque", js.undefined)
      
      @scala.inline
      def `set-ordered-dither`(value: String): Self = StObject.set(x, "-ordered-dither", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-ordered-ditherUndefined`: Self = StObject.set(x, "-ordered-dither", js.undefined)
      
      @scala.inline
      def `set-orient`(value: String): Self = StObject.set(x, "-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-orientUndefined`: Self = StObject.set(x, "-orient", js.undefined)
      
      @scala.inline
      def `set-page`(value: String): Self = StObject.set(x, "-page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pageUndefined`: Self = StObject.set(x, "-page", js.undefined)
      
      @scala.inline
      def `set-paint`(value: String): Self = StObject.set(x, "-paint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-paintUndefined`: Self = StObject.set(x, "-paint", js.undefined)
      
      @scala.inline
      def `set-perceptible`(value: String): Self = StObject.set(x, "-perceptible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-perceptibleUndefined`: Self = StObject.set(x, "-perceptible", js.undefined)
      
      @scala.inline
      def `set-ping`(value: String): Self = StObject.set(x, "-ping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pingUndefined`: Self = StObject.set(x, "-ping", js.undefined)
      
      @scala.inline
      def `set-pointsize`(value: String): Self = StObject.set(x, "-pointsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-pointsizeUndefined`: Self = StObject.set(x, "-pointsize", js.undefined)
      
      @scala.inline
      def `set-polaroid`(value: String): Self = StObject.set(x, "-polaroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-polaroidUndefined`: Self = StObject.set(x, "-polaroid", js.undefined)
      
      @scala.inline
      def `set-poly`(value: String): Self = StObject.set(x, "-poly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-polyUndefined`: Self = StObject.set(x, "-poly", js.undefined)
      
      @scala.inline
      def `set-posterize`(value: String): Self = StObject.set(x, "-posterize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-posterizeUndefined`: Self = StObject.set(x, "-posterize", js.undefined)
      
      @scala.inline
      def `set-precision`(value: String): Self = StObject.set(x, "-precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-precisionUndefined`: Self = StObject.set(x, "-precision", js.undefined)
      
      @scala.inline
      def `set-preview`(value: String): Self = StObject.set(x, "-preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-previewUndefined`: Self = StObject.set(x, "-preview", js.undefined)
      
      @scala.inline
      def `set-print`(value: String): Self = StObject.set(x, "-print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-printUndefined`: Self = StObject.set(x, "-print", js.undefined)
      
      @scala.inline
      def `set-process`(value: String): Self = StObject.set(x, "-process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-processUndefined`: Self = StObject.set(x, "-process", js.undefined)
      
      @scala.inline
      def `set-profile`(value: String): Self = StObject.set(x, "-profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-profileUndefined`: Self = StObject.set(x, "-profile", js.undefined)
      
      @scala.inline
      def `set-quality`(value: String): Self = StObject.set(x, "-quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-qualityUndefined`: Self = StObject.set(x, "-quality", js.undefined)
      
      @scala.inline
      def `set-quantize`(value: String): Self = StObject.set(x, "-quantize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-quantizeUndefined`: Self = StObject.set(x, "-quantize", js.undefined)
      
      @scala.inline
      def `set-quiet`(value: String): Self = StObject.set(x, "-quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-quietUndefined`: Self = StObject.set(x, "-quiet", js.undefined)
      
      @scala.inline
      def `set-radial-blur`(value: String): Self = StObject.set(x, "-radial-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-radial-blurUndefined`: Self = StObject.set(x, "-radial-blur", js.undefined)
      
      @scala.inline
      def `set-raise`(value: String): Self = StObject.set(x, "-raise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-raiseUndefined`: Self = StObject.set(x, "-raise", js.undefined)
      
      @scala.inline
      def `set-random-threshold`(value: String): Self = StObject.set(x, "-random-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-random-thresholdUndefined`: Self = StObject.set(x, "-random-threshold", js.undefined)
      
      @scala.inline
      def `set-range-threshold`(value: String): Self = StObject.set(x, "-range-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-range-thresholdUndefined`: Self = StObject.set(x, "-range-threshold", js.undefined)
      
      @scala.inline
      def `set-read-mask`(value: String): Self = StObject.set(x, "-read-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-read-maskUndefined`: Self = StObject.set(x, "-read-mask", js.undefined)
      
      @scala.inline
      def `set-red-primary`(value: String): Self = StObject.set(x, "-red-primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-red-primaryUndefined`: Self = StObject.set(x, "-red-primary", js.undefined)
      
      @scala.inline
      def `set-regard-warnings`(value: String): Self = StObject.set(x, "-regard-warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-regard-warningsUndefined`: Self = StObject.set(x, "-regard-warnings", js.undefined)
      
      @scala.inline
      def `set-region`(value: String): Self = StObject.set(x, "-region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-regionUndefined`: Self = StObject.set(x, "-region", js.undefined)
      
      @scala.inline
      def `set-remap`(value: String): Self = StObject.set(x, "-remap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-remapUndefined`: Self = StObject.set(x, "-remap", js.undefined)
      
      @scala.inline
      def `set-render`(value: String): Self = StObject.set(x, "-render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-renderUndefined`: Self = StObject.set(x, "-render", js.undefined)
      
      @scala.inline
      def `set-repage`(value: String): Self = StObject.set(x, "-repage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-repageUndefined`: Self = StObject.set(x, "-repage", js.undefined)
      
      @scala.inline
      def `set-resample`(value: String): Self = StObject.set(x, "-resample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-resampleUndefined`: Self = StObject.set(x, "-resample", js.undefined)
      
      @scala.inline
      def `set-resize`(value: String): Self = StObject.set(x, "-resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-resizeUndefined`: Self = StObject.set(x, "-resize", js.undefined)
      
      @scala.inline
      def `set-respect-parentheses`(value: String): Self = StObject.set(x, "-respect-parentheses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-respect-parenthesesUndefined`: Self = StObject.set(x, "-respect-parentheses", js.undefined)
      
      @scala.inline
      def `set-roll`(value: String): Self = StObject.set(x, "-roll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-rollUndefined`: Self = StObject.set(x, "-roll", js.undefined)
      
      @scala.inline
      def `set-rotate`(value: String): Self = StObject.set(x, "-rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-rotateUndefined`: Self = StObject.set(x, "-rotate", js.undefined)
      
      @scala.inline
      def `set-sample`(value: String): Self = StObject.set(x, "-sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sampleUndefined`: Self = StObject.set(x, "-sample", js.undefined)
      
      @scala.inline
      def `set-sampling-factor`(value: String): Self = StObject.set(x, "-sampling-factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sampling-factorUndefined`: Self = StObject.set(x, "-sampling-factor", js.undefined)
      
      @scala.inline
      def `set-scale`(value: String): Self = StObject.set(x, "-scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-scaleUndefined`: Self = StObject.set(x, "-scale", js.undefined)
      
      @scala.inline
      def `set-scene`(value: String): Self = StObject.set(x, "-scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sceneUndefined`: Self = StObject.set(x, "-scene", js.undefined)
      
      @scala.inline
      def `set-seed`(value: String): Self = StObject.set(x, "-seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-seedUndefined`: Self = StObject.set(x, "-seed", js.undefined)
      
      @scala.inline
      def `set-segment`(value: String): Self = StObject.set(x, "-segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-segmentUndefined`: Self = StObject.set(x, "-segment", js.undefined)
      
      @scala.inline
      def `set-selective-blur`(value: String): Self = StObject.set(x, "-selective-blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-selective-blurUndefined`: Self = StObject.set(x, "-selective-blur", js.undefined)
      
      @scala.inline
      def `set-separate`(value: String): Self = StObject.set(x, "-separate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-separateUndefined`: Self = StObject.set(x, "-separate", js.undefined)
      
      @scala.inline
      def `set-sepia-tone`(value: String): Self = StObject.set(x, "-sepia-tone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sepia-toneUndefined`: Self = StObject.set(x, "-sepia-tone", js.undefined)
      
      @scala.inline
      def `set-set`(value: String): Self = StObject.set(x, "-set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-setUndefined`: Self = StObject.set(x, "-set", js.undefined)
      
      @scala.inline
      def `set-shade`(value: String): Self = StObject.set(x, "-shade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shadeUndefined`: Self = StObject.set(x, "-shade", js.undefined)
      
      @scala.inline
      def `set-shadow`(value: String): Self = StObject.set(x, "-shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shadowUndefined`: Self = StObject.set(x, "-shadow", js.undefined)
      
      @scala.inline
      def `set-sharpen`(value: String): Self = StObject.set(x, "-sharpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sharpenUndefined`: Self = StObject.set(x, "-sharpen", js.undefined)
      
      @scala.inline
      def `set-shave`(value: String): Self = StObject.set(x, "-shave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shaveUndefined`: Self = StObject.set(x, "-shave", js.undefined)
      
      @scala.inline
      def `set-shear`(value: String): Self = StObject.set(x, "-shear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-shearUndefined`: Self = StObject.set(x, "-shear", js.undefined)
      
      @scala.inline
      def `set-sigmoidal-contrast`(value: String): Self = StObject.set(x, "-sigmoidal-contrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sigmoidal-contrastUndefined`: Self = StObject.set(x, "-sigmoidal-contrast", js.undefined)
      
      @scala.inline
      def `set-size`(value: String): Self = StObject.set(x, "-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sizeUndefined`: Self = StObject.set(x, "-size", js.undefined)
      
      @scala.inline
      def `set-sketch`(value: String): Self = StObject.set(x, "-sketch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-sketchUndefined`: Self = StObject.set(x, "-sketch", js.undefined)
      
      @scala.inline
      def `set-smush`(value: String): Self = StObject.set(x, "-smush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-smushUndefined`: Self = StObject.set(x, "-smush", js.undefined)
      
      @scala.inline
      def `set-solarize`(value: String): Self = StObject.set(x, "-solarize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-solarizeUndefined`: Self = StObject.set(x, "-solarize", js.undefined)
      
      @scala.inline
      def `set-splice`(value: String): Self = StObject.set(x, "-splice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-spliceUndefined`: Self = StObject.set(x, "-splice", js.undefined)
      
      @scala.inline
      def `set-spread`(value: String): Self = StObject.set(x, "-spread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-spreadUndefined`: Self = StObject.set(x, "-spread", js.undefined)
      
      @scala.inline
      def `set-statistic`(value: String): Self = StObject.set(x, "-statistic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-statisticUndefined`: Self = StObject.set(x, "-statistic", js.undefined)
      
      @scala.inline
      def `set-stretch`(value: String): Self = StObject.set(x, "-stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-stretchUndefined`: Self = StObject.set(x, "-stretch", js.undefined)
      
      @scala.inline
      def `set-strip`(value: String): Self = StObject.set(x, "-strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-stripUndefined`: Self = StObject.set(x, "-strip", js.undefined)
      
      @scala.inline
      def `set-stroke`(value: String): Self = StObject.set(x, "-stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-strokeUndefined`: Self = StObject.set(x, "-stroke", js.undefined)
      
      @scala.inline
      def `set-strokewidth`(value: String): Self = StObject.set(x, "-strokewidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-strokewidthUndefined`: Self = StObject.set(x, "-strokewidth", js.undefined)
      
      @scala.inline
      def `set-style`(value: String): Self = StObject.set(x, "-style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-styleUndefined`: Self = StObject.set(x, "-style", js.undefined)
      
      @scala.inline
      def `set-swap`(value: String): Self = StObject.set(x, "-swap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-swapUndefined`: Self = StObject.set(x, "-swap", js.undefined)
      
      @scala.inline
      def `set-swirl`(value: String): Self = StObject.set(x, "-swirl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-swirlUndefined`: Self = StObject.set(x, "-swirl", js.undefined)
      
      @scala.inline
      def `set-synchronize`(value: String): Self = StObject.set(x, "-synchronize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-synchronizeUndefined`: Self = StObject.set(x, "-synchronize", js.undefined)
      
      @scala.inline
      def `set-taint`(value: String): Self = StObject.set(x, "-taint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-taintUndefined`: Self = StObject.set(x, "-taint", js.undefined)
      
      @scala.inline
      def `set-texture`(value: String): Self = StObject.set(x, "-texture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-textureUndefined`: Self = StObject.set(x, "-texture", js.undefined)
      
      @scala.inline
      def `set-threshold`(value: String): Self = StObject.set(x, "-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-thresholdUndefined`: Self = StObject.set(x, "-threshold", js.undefined)
      
      @scala.inline
      def `set-thumbnail`(value: String): Self = StObject.set(x, "-thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-thumbnailUndefined`: Self = StObject.set(x, "-thumbnail", js.undefined)
      
      @scala.inline
      def `set-tile`(value: String): Self = StObject.set(x, "-tile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tile-offset`(value: String): Self = StObject.set(x, "-tile-offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tile-offsetUndefined`: Self = StObject.set(x, "-tile-offset", js.undefined)
      
      @scala.inline
      def `set-tileUndefined`: Self = StObject.set(x, "-tile", js.undefined)
      
      @scala.inline
      def `set-tint`(value: String): Self = StObject.set(x, "-tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-tintUndefined`: Self = StObject.set(x, "-tint", js.undefined)
      
      @scala.inline
      def `set-transform`(value: String): Self = StObject.set(x, "-transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transformUndefined`: Self = StObject.set(x, "-transform", js.undefined)
      
      @scala.inline
      def `set-transparent`(value: String): Self = StObject.set(x, "-transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transparent-color`(value: String): Self = StObject.set(x, "-transparent-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transparent-colorUndefined`: Self = StObject.set(x, "-transparent-color", js.undefined)
      
      @scala.inline
      def `set-transparentUndefined`: Self = StObject.set(x, "-transparent", js.undefined)
      
      @scala.inline
      def `set-transpose`(value: String): Self = StObject.set(x, "-transpose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transposeUndefined`: Self = StObject.set(x, "-transpose", js.undefined)
      
      @scala.inline
      def `set-transverse`(value: String): Self = StObject.set(x, "-transverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-transverseUndefined`: Self = StObject.set(x, "-transverse", js.undefined)
      
      @scala.inline
      def `set-treedepth`(value: String): Self = StObject.set(x, "-treedepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-treedepthUndefined`: Self = StObject.set(x, "-treedepth", js.undefined)
      
      @scala.inline
      def `set-trim`(value: String): Self = StObject.set(x, "-trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-trimUndefined`: Self = StObject.set(x, "-trim", js.undefined)
      
      @scala.inline
      def `set-type`(value: String): Self = StObject.set(x, "-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-typeUndefined`: Self = StObject.set(x, "-type", js.undefined)
      
      @scala.inline
      def `set-undercolor`(value: String): Self = StObject.set(x, "-undercolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-undercolorUndefined`: Self = StObject.set(x, "-undercolor", js.undefined)
      
      @scala.inline
      def `set-unique-colors`(value: String): Self = StObject.set(x, "-unique-colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unique-colorsUndefined`: Self = StObject.set(x, "-unique-colors", js.undefined)
      
      @scala.inline
      def `set-units`(value: String): Self = StObject.set(x, "-units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unitsUndefined`: Self = StObject.set(x, "-units", js.undefined)
      
      @scala.inline
      def `set-unsharp`(value: String): Self = StObject.set(x, "-unsharp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-unsharpUndefined`: Self = StObject.set(x, "-unsharp", js.undefined)
      
      @scala.inline
      def `set-verbose`(value: String): Self = StObject.set(x, "-verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-verboseUndefined`: Self = StObject.set(x, "-verbose", js.undefined)
      
      @scala.inline
      def `set-version`(value: String): Self = StObject.set(x, "-version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-versionUndefined`: Self = StObject.set(x, "-version", js.undefined)
      
      @scala.inline
      def `set-view`(value: String): Self = StObject.set(x, "-view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-viewUndefined`: Self = StObject.set(x, "-view", js.undefined)
      
      @scala.inline
      def `set-vignette`(value: String): Self = StObject.set(x, "-vignette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-vignetteUndefined`: Self = StObject.set(x, "-vignette", js.undefined)
      
      @scala.inline
      def `set-virtual-pixel`(value: String): Self = StObject.set(x, "-virtual-pixel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-virtual-pixelUndefined`: Self = StObject.set(x, "-virtual-pixel", js.undefined)
      
      @scala.inline
      def `set-wave`(value: String): Self = StObject.set(x, "-wave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-waveUndefined`: Self = StObject.set(x, "-wave", js.undefined)
      
      @scala.inline
      def `set-wavelet-denoise`(value: String): Self = StObject.set(x, "-wavelet-denoise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-wavelet-denoiseUndefined`: Self = StObject.set(x, "-wavelet-denoise", js.undefined)
      
      @scala.inline
      def `set-weight`(value: String): Self = StObject.set(x, "-weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-weightUndefined`: Self = StObject.set(x, "-weight", js.undefined)
      
      @scala.inline
      def `set-white-point`(value: String): Self = StObject.set(x, "-white-point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-white-pointUndefined`: Self = StObject.set(x, "-white-point", js.undefined)
      
      @scala.inline
      def `set-white-threshold`(value: String): Self = StObject.set(x, "-white-threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-white-thresholdUndefined`: Self = StObject.set(x, "-white-threshold", js.undefined)
      
      @scala.inline
      def `set-write`(value: String): Self = StObject.set(x, "-write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-write-mask`(value: String): Self = StObject.set(x, "-write-mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set-write-maskUndefined`: Self = StObject.set(x, "-write-mask", js.undefined)
      
      @scala.inline
      def `set-writeUndefined`: Self = StObject.set(x, "-write", js.undefined)
    }
  }
  
  type OptionalSpread[CombinedImage /* <: Boolean */] = js.Array[
    (Options & `0`[CombinedImage]) | (Options & CombinedImageCombinedImage[CombinedImage]) | js.Any
  ]
  
  trait Options extends StObject {
    
    var convertExtension: js.UndefOr[String] = js.undefined
    
    var convertOptions: js.UndefOr[ConvertOptions] = js.undefined
    
    var graphicsMagick: js.UndefOr[Boolean] = js.undefined
    
    var outputDirectory: js.UndefOr[String] = js.undefined
    
    var pdfFileBaseName: js.UndefOr[String] = js.undefined
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
      def setConvertExtension(value: String): Self = StObject.set(x, "convertExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertExtensionUndefined: Self = StObject.set(x, "convertExtension", js.undefined)
      
      @scala.inline
      def setConvertOptions(value: ConvertOptions): Self = StObject.set(x, "convertOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConvertOptionsUndefined: Self = StObject.set(x, "convertOptions", js.undefined)
      
      @scala.inline
      def setGraphicsMagick(value: Boolean): Self = StObject.set(x, "graphicsMagick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphicsMagickUndefined: Self = StObject.set(x, "graphicsMagick", js.undefined)
      
      @scala.inline
      def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      @scala.inline
      def setPdfFileBaseName(value: String): Self = StObject.set(x, "pdfFileBaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdfFileBaseNameUndefined: Self = StObject.set(x, "pdfFileBaseName", js.undefined)
    }
  }
  
  trait PDFInfo
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var CreationDate: String
    
    var Creator: String
    
    var Encrypted: String
    
    var `File size`: String
    
    var Form: String
    
    var JavaScript: String
    
    var Optimized: String
    
    var `PDF version`: String
    
    var `Page rot`: String
    
    var `Page size`: String
    
    var Pages: String
    
    var Producer: String
    
    var Suspects: String
    
    var Tagged: String
    
    var UserProperties: String
  }
  object PDFInfo {
    
    @scala.inline
    def apply(
      CreationDate: String,
      Creator: String,
      Encrypted: String,
      `File size`: String,
      Form: String,
      JavaScript: String,
      Optimized: String,
      `PDF version`: String,
      `Page rot`: String,
      `Page size`: String,
      Pages: String,
      Producer: String,
      Suspects: String,
      Tagged: String,
      UserProperties: String
    ): PDFInfo = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
      __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFInfo]
    }
    
    @scala.inline
    implicit class PDFInfoMutableBuilder[Self <: PDFInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncrypted(value: String): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFile size`(value: String): Self = StObject.set(x, "File size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaScript(value: String): Self = StObject.set(x, "JavaScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimized(value: String): Self = StObject.set(x, "Optimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPDF version`(value: String): Self = StObject.set(x, "PDF version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage rot`(value: String): Self = StObject.set(x, "Page rot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage size`(value: String): Self = StObject.set(x, "Page size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: String): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspects(value: String): Self = StObject.set(x, "Suspects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagged(value: String): Self = StObject.set(x, "Tagged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserProperties(value: String): Self = StObject.set(x, "UserProperties", value.asInstanceOf[js.Any])
    }
  }
}
