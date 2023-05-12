package typings.opentelemetryResources

import typings.opentelemetryResources.buildSrcDetectorsNoopDetectorMod.NoopDetector_
import typings.opentelemetryResources.buildSrcDetectorsNoopDetectorSyncMod.NoopDetectorSync_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultServiceName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultServiceName")().asInstanceOf[String]
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "hostDetector")
  @js.native
  val hostDetector: NoopDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "hostDetectorSync")
  @js.native
  val hostDetectorSync: NoopDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "osDetector")
  @js.native
  val osDetector: NoopDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "osDetectorSync")
  @js.native
  val osDetectorSync: NoopDetectorSync_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "processDetector")
  @js.native
  val processDetector: NoopDetector_ = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/browser", "processDetectorSync")
  @js.native
  val processDetectorSync: NoopDetector_ = js.native
}
