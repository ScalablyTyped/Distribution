package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.DetectorSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeProcessDetectorSyncMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/ProcessDetectorSync", "processDetectorSync")
  @js.native
  val processDetectorSync: ProcessDetectorSync_ = js.native
  
  /**
    * ProcessDetectorSync will be used to detect the resources related current process running
    * and being instrumented from the NodeJS Process module.
    */
  @js.native
  trait ProcessDetectorSync_
    extends StObject
       with DetectorSync
}
