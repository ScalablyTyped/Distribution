package typings.opentelemetrySdkTraceBase

import typings.opentelemetrySdkTraceBase.buildSrcIdGeneratorMod.IdGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeRandomIdGeneratorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/platform/node/RandomIdGenerator", "RandomIdGenerator")
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
