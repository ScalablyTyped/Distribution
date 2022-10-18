package typings.opentelemetryInstrumentation

import typings.opentelemetryInstrumentation.buildSrcTypesInternalMod.AutoLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAutoLoaderMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/autoLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerInstrumentations(options: AutoLoaderOptions): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInstrumentations")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
