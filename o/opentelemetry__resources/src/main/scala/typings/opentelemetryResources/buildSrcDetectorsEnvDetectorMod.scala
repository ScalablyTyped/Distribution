package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDetectorsEnvDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/EnvDetector", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
  
  /**
    * EnvDetector can be used to detect the presence of and create a Resource
    * from the OTEL_RESOURCE_ATTRIBUTES environment variable.
    */
  @js.native
  trait EnvDetector_
    extends StObject
       with Detector
}
