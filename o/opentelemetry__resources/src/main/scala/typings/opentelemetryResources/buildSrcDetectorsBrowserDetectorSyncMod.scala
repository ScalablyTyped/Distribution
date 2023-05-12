package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.DetectorSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDetectorsBrowserDetectorSyncMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/BrowserDetectorSync", "browserDetectorSync")
  @js.native
  val browserDetectorSync: BrowserDetectorSync_ = js.native
  
  /**
    * BrowserDetectorSync will be used to detect the resources related to browser.
    */
  @js.native
  trait BrowserDetectorSync_
    extends StObject
       with DetectorSync {
    
    /**
      * Validates process resource attribute map from process variables
      *
      * @param browserResource The un-sanitized resource attributes from process as key/value pairs.
      * @param config: Config
      * @returns The sanitized resource attributes.
      */
    /* private */ var _getResourceAttributes: Any = js.native
  }
}
