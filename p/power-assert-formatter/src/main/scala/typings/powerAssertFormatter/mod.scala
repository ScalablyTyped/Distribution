package typings.powerAssertFormatter

import typings.powerAssertFormatter.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Formatter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Formatter]
  @scala.inline
  def apply(options: Options): Formatter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  @JSImport("power-assert-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")().asInstanceOf[Options]
  
  type Formatter = js.Function1[/* powerAssertContext */ js.Any, String]
  
  trait Options extends StObject {
    
    var ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.undefined
    
    var anonymous: js.UndefOr[String] = js.undefined
    
    var circular: js.UndefOr[String] = js.undefined
    
    var diff: js.UndefOr[js.Function] = js.undefined
    
    var lineDiffThreshold: js.UndefOr[Double] = js.undefined
    
    var lineSeparator: js.UndefOr[String] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var outputOffset: js.UndefOr[Double] = js.undefined
    
    var renderers: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var stringify: js.UndefOr[js.Function] = js.undefined
    
    var widthOf: js.UndefOr[js.Function] = js.undefined
    
    var writerClass: js.UndefOr[Instantiable] = js.undefined
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
      def setAmbiguousEastAsianCharWidth(value: Double): Self = StObject.set(x, "ambiguousEastAsianCharWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmbiguousEastAsianCharWidthUndefined: Self = StObject.set(x, "ambiguousEastAsianCharWidth", js.undefined)
      
      @scala.inline
      def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setDiff(value: js.Function): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setLineDiffThreshold(value: Double): Self = StObject.set(x, "lineDiffThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDiffThresholdUndefined: Self = StObject.set(x, "lineDiffThreshold", js.undefined)
      
      @scala.inline
      def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setOutputOffset(value: Double): Self = StObject.set(x, "outputOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputOffsetUndefined: Self = StObject.set(x, "outputOffset", js.undefined)
      
      @scala.inline
      def setRenderers(value: js.Array[js.Any]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      @scala.inline
      def setRenderersVarargs(value: js.Any*): Self = StObject.set(x, "renderers", js.Array(value :_*))
      
      @scala.inline
      def setStringify(value: js.Function): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setWidthOf(value: js.Function): Self = StObject.set(x, "widthOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthOfUndefined: Self = StObject.set(x, "widthOf", js.undefined)
      
      @scala.inline
      def setWriterClass(value: Instantiable): Self = StObject.set(x, "writerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterClassUndefined: Self = StObject.set(x, "writerClass", js.undefined)
    }
  }
}
