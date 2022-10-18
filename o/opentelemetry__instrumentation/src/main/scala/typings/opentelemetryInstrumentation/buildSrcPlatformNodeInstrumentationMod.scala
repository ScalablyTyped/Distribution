package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcInstrumentationMod.InstrumentationAbstract
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeInstrumentationMod {
  
  /* note: abstract class */ @JSImport("@opentelemetry/instrumentation/build/src/platform/node/instrumentation", "InstrumentationBase")
  @js.native
  open class InstrumentationBase[T] protected () extends InstrumentationAbstract[Any] {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _extractPackageVersion: Any = js.native
    
    /* private */ var _hooks: Any = js.native
    
    /* private */ var _modules: Any = js.native
    
    /* private */ var _onRequire: Any = js.native
    
    /* private */ var _warnOnPreloadedModules: Any = js.native
    
    def isEnabled(): Boolean = js.native
  }
}
