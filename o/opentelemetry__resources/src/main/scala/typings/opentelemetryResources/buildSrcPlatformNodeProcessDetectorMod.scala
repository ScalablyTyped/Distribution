package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeProcessDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/ProcessDetector", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
  
  /**
    * ProcessDetector will be used to detect the resources related current process running
    * and being instrumented from the NodeJS Process module.
    */
  @js.native
  trait ProcessDetector_
    extends StObject
       with Detector
}
