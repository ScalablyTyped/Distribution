package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorMod.HostDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeHostDetectorSyncMod.HostDetectorSync_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorMod.OSDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeOsdetectorsyncMod.OSDetectorSync_
import typings.opentelemetryResources.buildSrcPlatformNodeProcessDetectorMod.ProcessDetector_
import typings.opentelemetryResources.buildSrcPlatformNodeProcessDetectorSyncMod.ProcessDetectorSync_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "hostDetector")
  @js.native
  val hostDetector: HostDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "hostDetectorSync")
  @js.native
  val hostDetectorSync: HostDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "osDetector")
  @js.native
  val osDetector: OSDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "osDetectorSync")
  @js.native
  val osDetectorSync: OSDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "processDetector")
  @js.native
  val processDetector: ProcessDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "processDetectorSync")
  @js.native
  val processDetectorSync: ProcessDetectorSync_ = js.native
}
