package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCompatibilityMod {
  
  /**
    * A function that takes a tracer factory, and tests wheter the initialized tracer
    * fulfills Opentracing's api requirements.
    *
    * @param {object} createTracer - a factory function that allocates a tracer.
    * @param {object} [options] - the options to be set on api compatibility
    */
  @JSImport("opentracing/lib/test/api_compatibility", JSImport.Default)
  @js.native
  def default(): Unit = js.native
  @JSImport("opentracing/lib/test/api_compatibility", JSImport.Default)
  @js.native
  def default(createTracer: js.UndefOr[scala.Nothing], options: ApiCompatibilityChecksOptions): Unit = js.native
  @JSImport("opentracing/lib/test/api_compatibility", JSImport.Default)
  @js.native
  def default(createTracer: js.Function0[Tracer]): Unit = js.native
  @JSImport("opentracing/lib/test/api_compatibility", JSImport.Default)
  @js.native
  def default(createTracer: js.Function0[Tracer], options: ApiCompatibilityChecksOptions): Unit = js.native
  
  @js.native
  trait ApiCompatibilityChecksOptions extends StObject {
    
    /** a boolean that controls whether or not to verify certain API functionality */
    var skipBaggageChecks: js.UndefOr[Boolean] = js.native
    
    var skipInjectExtractChecks: js.UndefOr[Boolean] = js.native
  }
  object ApiCompatibilityChecksOptions {
    
    @scala.inline
    def apply(): ApiCompatibilityChecksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiCompatibilityChecksOptions]
    }
    
    @scala.inline
    implicit class ApiCompatibilityChecksOptionsMutableBuilder[Self <: ApiCompatibilityChecksOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipBaggageChecks(value: Boolean): Self = StObject.set(x, "skipBaggageChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipBaggageChecksUndefined: Self = StObject.set(x, "skipBaggageChecks", js.undefined)
      
      @scala.inline
      def setSkipInjectExtractChecks(value: Boolean): Self = StObject.set(x, "skipInjectExtractChecks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInjectExtractChecksUndefined: Self = StObject.set(x, "skipInjectExtractChecks", js.undefined)
    }
  }
}
