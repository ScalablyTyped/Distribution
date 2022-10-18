package typings.opentelemetryCore

import typings.opentelemetryCore.buildSrcTraceIdGeneratorMod.IdGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserRandomIdGeneratorMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/browser/RandomIdGenerator", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends StObject
       with IdGenerator {
    
    /** Returns a span ID composed of 16 lowercase hex characters. */
    /* CompleteClass */
    override def generateSpanId(): String = js.native
    
    /** Returns a trace ID composed of 32 lowercase hex characters. */
    /* CompleteClass */
    override def generateTraceId(): String = js.native
  }
}
