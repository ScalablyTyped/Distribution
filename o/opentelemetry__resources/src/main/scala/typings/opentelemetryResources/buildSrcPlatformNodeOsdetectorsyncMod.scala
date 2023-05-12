package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcTypesMod.DetectorSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeOsdetectorsyncMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node/OSDetectorSync", "osDetectorSync")
  @js.native
  val osDetectorSync: OSDetectorSync_ = js.native
  
  /**
    * OSDetectorSync detects the resources related to the operating system (OS) on
    * which the process represented by this resource is running.
    */
  @js.native
  trait OSDetectorSync_
    extends StObject
       with DetectorSync
}
