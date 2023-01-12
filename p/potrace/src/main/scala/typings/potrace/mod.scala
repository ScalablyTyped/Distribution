package typings.potrace

import typings.jimp.mod.DepreciatedJimp
import typings.node.bufferMod.global.Buffer
import typings.potrace.potraceStrings.auto
import typings.potrace.potraceStrings.black
import typings.potrace.potraceStrings.dominant
import typings.potrace.potraceStrings.left
import typings.potrace.potraceStrings.majority
import typings.potrace.potraceStrings.minority
import typings.potrace.potraceStrings.right
import typings.potrace.potraceStrings.transparent
import typings.potrace.potraceStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("potrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("potrace", "Posterizer")
  @js.native
  open class Posterizer () extends StObject {
    def this(options: PosterizerOptions) = this()
    
    def getSVG(): String = js.native
    
    def getSymbol(id: String): String = js.native
    
    def loadImage(
      image: String,
      callback: js.Function2[/* posterizer */ this.type, /* error */ js.Error | Null, Unit]
    ): Unit = js.native
    def loadImage(
      image: DepreciatedJimp,
      callback: js.Function2[/* posterizer */ this.type, /* error */ js.Error | Null, Unit]
    ): Unit = js.native
    def loadImage(
      image: Buffer,
      callback: js.Function2[/* posterizer */ this.type, /* error */ js.Error | Null, Unit]
    ): Unit = js.native
    
    def setParameters(params: PotraceOptions): Unit = js.native
  }
  
  @JSImport("potrace", "Potrace")
  @js.native
  open class Potrace () extends StObject {
    def this(options: PotraceOptions) = this()
    
    def getPathTag(fillColor: String, scale: Double): String = js.native
    
    def getSVG(): String = js.native
    
    def getSymbol(id: String): String = js.native
    
    def loadImage(image: String, callback: js.Function2[/* potrace */ this.type, /* error */ js.Error | Null, Unit]): Unit = js.native
    def loadImage(
      image: DepreciatedJimp,
      callback: js.Function2[/* potrace */ this.type, /* error */ js.Error | Null, Unit]
    ): Unit = js.native
    def loadImage(image: Buffer, callback: js.Function2[/* potrace */ this.type, /* error */ js.Error | Null, Unit]): Unit = js.native
    
    def setParameters(params: PotraceOptions): Unit = js.native
  }
  
  inline def posterize(
    file: String,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def posterize(
    file: String,
    options: PosterizerOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def posterize(
    file: DepreciatedJimp,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def posterize(
    file: DepreciatedJimp,
    options: PosterizerOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def posterize(
    file: Buffer,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def posterize(
    file: Buffer,
    options: PosterizerOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* posterizer */ Posterizer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("posterize")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trace(
    file: String,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(
    file: String,
    options: PotraceOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(
    file: DepreciatedJimp,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(
    file: DepreciatedJimp,
    options: PotraceOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(
    file: Buffer,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trace(
    file: Buffer,
    options: PotraceOptions,
    cb: js.Function3[/* error */ js.Error | Null, /* svg */ String, /* potrace */ Potrace, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PosterizerOptions
    extends StObject
       with PotraceOptions {
    
    /**
      * How to select fill color for color ranges - equally spread or dominant. (default: "dominant")
      */
    var fillStrategy: js.UndefOr[String | dominant] = js.undefined
    
    /**
      * How to choose thresholds in-between - after equal intervals or automatically balanced. (default: "auto")
      */
    var rangeDistribution: js.UndefOr[String | auto] = js.undefined
    
    /**
      * Number of samples that needs to be taken (and number of layers in SVG). (default: -1, which most likely will result in 3, sometimes 4)
      */
    var steps: js.UndefOr[Double] = js.undefined
  }
  object PosterizerOptions {
    
    inline def apply(): PosterizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PosterizerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PosterizerOptions] (val x: Self) extends AnyVal {
      
      inline def setFillStrategy(value: String | dominant): Self = StObject.set(x, "fillStrategy", value.asInstanceOf[js.Any])
      
      inline def setFillStrategyUndefined: Self = StObject.set(x, "fillStrategy", js.undefined)
      
      inline def setRangeDistribution(value: String | auto): Self = StObject.set(x, "rangeDistribution", value.asInstanceOf[js.Any])
      
      inline def setRangeDistributionUndefined: Self = StObject.set(x, "rangeDistribution", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    }
  }
  
  trait PotraceOptions extends StObject {
    
    /**
      * corner threshold parameter (default 1)
      */
    var alphaMax: js.UndefOr[Double] = js.undefined
    
    /**
      * background color (default: 'transparent') Will be ignored when exporting as `<symbol>`
      */
    var background: js.UndefOr[String | transparent] = js.undefined
    
    /**
      * specifies colors by which side from threshold should be traced (default true)
      */
    var blackOnWhite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * foreground color (default: 'auto' (black or white)) Will be ignored when exporting as `<symbol>`
      */
    var color: js.UndefOr[String | auto] = js.undefined
    
    /**
      * curve optimization (default true)
      */
    var optCurve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * curve optimization tolerance (default 0.2)
      */
    var optTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * threshold below which color is considered black (0..255, default -1)
      */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * how to resolve ambiguities in path decomposition (default "minority")
      */
    var turdPolicy: js.UndefOr[minority | majority | black | white | left | right] = js.undefined
    
    /**
      * suppress speckles of up to this size (default 2)
      */
    var turdSize: js.UndefOr[Double] = js.undefined
  }
  object PotraceOptions {
    
    inline def apply(): PotraceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PotraceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotraceOptions] (val x: Self) extends AnyVal {
      
      inline def setAlphaMax(value: Double): Self = StObject.set(x, "alphaMax", value.asInstanceOf[js.Any])
      
      inline def setAlphaMaxUndefined: Self = StObject.set(x, "alphaMax", js.undefined)
      
      inline def setBackground(value: String | transparent): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBlackOnWhite(value: Boolean): Self = StObject.set(x, "blackOnWhite", value.asInstanceOf[js.Any])
      
      inline def setBlackOnWhiteUndefined: Self = StObject.set(x, "blackOnWhite", js.undefined)
      
      inline def setColor(value: String | auto): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOptCurve(value: Boolean): Self = StObject.set(x, "optCurve", value.asInstanceOf[js.Any])
      
      inline def setOptCurveUndefined: Self = StObject.set(x, "optCurve", js.undefined)
      
      inline def setOptTolerance(value: Double): Self = StObject.set(x, "optTolerance", value.asInstanceOf[js.Any])
      
      inline def setOptToleranceUndefined: Self = StObject.set(x, "optTolerance", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTurdPolicy(value: minority | majority | black | white | left | right): Self = StObject.set(x, "turdPolicy", value.asInstanceOf[js.Any])
      
      inline def setTurdPolicyUndefined: Self = StObject.set(x, "turdPolicy", js.undefined)
      
      inline def setTurdSize(value: Double): Self = StObject.set(x, "turdSize", value.asInstanceOf[js.Any])
      
      inline def setTurdSizeUndefined: Self = StObject.set(x, "turdSize", js.undefined)
    }
  }
}
