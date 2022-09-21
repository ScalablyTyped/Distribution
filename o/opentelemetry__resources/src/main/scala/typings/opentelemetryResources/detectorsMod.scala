package typings.opentelemetryResources

import typings.opentelemetryResources.browserDetectorMod.BrowserDetector_
import typings.opentelemetryResources.envDetectorMod.EnvDetector_
import typings.opentelemetryResources.processDetectorMod.ProcessDetector_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectorsMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/detectors", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/detectors", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
}
