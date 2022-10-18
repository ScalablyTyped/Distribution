package typings.mocha

import typings.mocha.Mocha.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatsCollectorMod {
  
  /**
    * Provides stats such as test duration, number of tests passed / failed etc., by listening for events emitted by `runner`.
    */
  inline def apply(runner: Runner): Unit = ^.asInstanceOf[js.Dynamic].apply(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("mocha/lib/stats-collector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
