package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDetectorsBrowserDetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/detectors/BrowserDetector", "browserDetector")
  @js.native
  val browserDetector: BrowserDetector_ = js.native
  
  /**
    * BrowserDetector will be used to detect the resources related to browser.
    */
  @js.native
  trait BrowserDetector_
    extends StObject
       with Detector
}
