package typings.opentracing

import typings.opentracing.mod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCompatibilityMod {
  
  @JSImport("opentracing/lib/test/api_compatibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function that takes a tracer factory, and tests wheter the initialized tracer
    * fulfills Opentracing's api requirements.
    *
    * @param {object} createTracer - a factory function that allocates a tracer.
    * @param {object} [options] - the options to be set on api compatibility
    */
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(createTracer: js.Function0[Tracer]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(createTracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(createTracer: js.Function0[Tracer], options: ApiCompatibilityChecksOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createTracer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(createTracer: Unit, options: ApiCompatibilityChecksOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createTracer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ApiCompatibilityChecksOptions extends StObject {
    
    /** a boolean that controls whether or not to verify certain API functionality */
    var skipBaggageChecks: js.UndefOr[Boolean] = js.undefined
    
    var skipInjectExtractChecks: js.UndefOr[Boolean] = js.undefined
  }
  object ApiCompatibilityChecksOptions {
    
    inline def apply(): ApiCompatibilityChecksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiCompatibilityChecksOptions]
    }
    
    extension [Self <: ApiCompatibilityChecksOptions](x: Self) {
      
      inline def setSkipBaggageChecks(value: Boolean): Self = StObject.set(x, "skipBaggageChecks", value.asInstanceOf[js.Any])
      
      inline def setSkipBaggageChecksUndefined: Self = StObject.set(x, "skipBaggageChecks", js.undefined)
      
      inline def setSkipInjectExtractChecks(value: Boolean): Self = StObject.set(x, "skipInjectExtractChecks", value.asInstanceOf[js.Any])
      
      inline def setSkipInjectExtractChecksUndefined: Self = StObject.set(x, "skipInjectExtractChecks", js.undefined)
    }
  }
}
