package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.DetectorSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeHostDetectorSyncMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/HostDetectorSync", "hostDetectorSync")
  @js.native
  val hostDetectorSync: HostDetectorSync_ = js.native
  
  /**
    * HostDetectorSync detects the resources related to the host current process is
    * running on. Currently only non-cloud-based attributes are included.
    */
  @js.native
  trait HostDetectorSync_
    extends StObject
       with DetectorSync {
    
    /* private */ var _getAsyncAttributes: Any = js.native
  }
}
