package typings.opentelemetryResources

import typings.opentelemetryResources.typesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/ProcessDetector", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
  
  /**
    * ProcessDetector will be used to detect the resources related current process running
    * and being instrumented from the NodeJS Process module.
    */
  @js.native
  trait ProcessDetector_
    extends StObject
       with Detector {
    
    /**
      * Validates process resource attribute map from process varaibls
      *
      * @param processResource The unsantized resource attributes from process as key/value pairs.
      * @param config: Config
      * @returns The sanitized resource attributes.
      */
    /* private */ var _getResourceAttributes: Any = js.native
  }
}
