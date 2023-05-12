package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.Detector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeOsdetectorMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/OSDetector", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
  
  /**
    * OSDetector detects the resources related to the operating system (OS) on
    * which the process represented by this resource is running.
    */
  @js.native
  trait OSDetector_
    extends StObject
       with Detector
}
