package typings.opentelemetryResources

import typings.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHostDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/HostDetector", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  /**
    * HostDetector detects the resources related to the host current process is
    * running on. Currently only non-cloud-based attributes are included.
    */
  @js.native
  trait HostDetector_
    extends StObject
       with Detector {
    
    /* private */ var _normalizeArch: Any = js.native
  }
}
