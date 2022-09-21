package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.instrumentationMod.InstrumentationAbstract
import typings.opentelemetryInstrumentation.srcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserInstrumentationMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/browser/instrumentation", "InstrumentationBase")
  @js.native
  abstract class InstrumentationBase protected () extends InstrumentationAbstract[Any] {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
  }
}
