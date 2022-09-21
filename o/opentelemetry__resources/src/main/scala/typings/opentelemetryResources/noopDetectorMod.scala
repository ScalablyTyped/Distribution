package typings.opentelemetryResources

import typings.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/NoopDetector", "NoopDetector")
  @js.native
  open class NoopDetector_ ()
    extends StObject
       with Detector
  
  @JSImport("@opentelemetry/resources/build/src/detectors/NoopDetector", "noopDetector")
  @js.native
  val noopDetector: NoopDetector_ = js.native
}
