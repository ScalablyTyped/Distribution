package typings.onfidoActiveVideoCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseBenchmarkMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useBenchmark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBenchmark[Result](): BenchmarkHook[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBenchmark")().asInstanceOf[BenchmarkHook[Result]]
  
  type AverageTime = Double
  
  type BenchmarkAsyncFunction[Result] = js.Function1[/* f */ js.Function0[js.Promise[Result]], js.Promise[Result]]
  
  type BenchmarkHook[Result] = js.Tuple3[AverageTime, Count, BenchmarkAsyncFunction[Result]]
  
  type Count = Double
}
