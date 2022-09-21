package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.srcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/browser", "InstrumentationBase")
  @js.native
  abstract class InstrumentationBase protected ()
    extends typings.opentelemetryInstrumentation.browserInstrumentationMod.InstrumentationBase {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
  }
}
