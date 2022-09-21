package typings.powerAssertFormatter

import typings.powerAssertFormatter.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Formatter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Formatter]
  inline def apply(options: Options): Formatter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  @JSImport("power-assert-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[Options]
  
  type Formatter = js.Function1[/* powerAssertContext */ Any, String]
  
  trait Options extends StObject {
    
    var ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.undefined
    
    var anonymous: js.UndefOr[String] = js.undefined
    
    var circular: js.UndefOr[String] = js.undefined
    
    var diff: js.UndefOr[js.Function] = js.undefined
    
    var lineDiffThreshold: js.UndefOr[Double] = js.undefined
    
    var lineSeparator: js.UndefOr[String] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var outputOffset: js.UndefOr[Double] = js.undefined
    
    var renderers: js.UndefOr[js.Array[Any]] = js.undefined
    
    var stringify: js.UndefOr[js.Function] = js.undefined
    
    var widthOf: js.UndefOr[js.Function] = js.undefined
    
    var writerClass: js.UndefOr[Instantiable] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAmbiguousEastAsianCharWidth(value: Double): Self = StObject.set(x, "ambiguousEastAsianCharWidth", value.asInstanceOf[js.Any])
      
      inline def setAmbiguousEastAsianCharWidthUndefined: Self = StObject.set(x, "ambiguousEastAsianCharWidth", js.undefined)
      
      inline def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setDiff(value: js.Function): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      inline def setLineDiffThreshold(value: Double): Self = StObject.set(x, "lineDiffThreshold", value.asInstanceOf[js.Any])
      
      inline def setLineDiffThresholdUndefined: Self = StObject.set(x, "lineDiffThreshold", js.undefined)
      
      inline def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setOutputOffset(value: Double): Self = StObject.set(x, "outputOffset", value.asInstanceOf[js.Any])
      
      inline def setOutputOffsetUndefined: Self = StObject.set(x, "outputOffset", js.undefined)
      
      inline def setRenderers(value: js.Array[Any]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      inline def setRenderersVarargs(value: Any*): Self = StObject.set(x, "renderers", js.Array(value*))
      
      inline def setStringify(value: js.Function): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      inline def setWidthOf(value: js.Function): Self = StObject.set(x, "widthOf", value.asInstanceOf[js.Any])
      
      inline def setWidthOfUndefined: Self = StObject.set(x, "widthOf", js.undefined)
      
      inline def setWriterClass(value: Instantiable): Self = StObject.set(x, "writerClass", value.asInstanceOf[js.Any])
      
      inline def setWriterClassUndefined: Self = StObject.set(x, "writerClass", js.undefined)
    }
  }
}
