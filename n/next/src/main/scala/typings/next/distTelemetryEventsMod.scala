package typings.next

import typings.next.anon.EventName
import typings.next.anon.EventNamePayload
import typings.next.anon.EventNameString
import typings.next.anon.OmitEventBuildCompletedto
import typings.next.anon.OmitEventBuildOptimizedto
import typings.next.anon.OmitEventCliSessionStarte
import typings.next.anon.Payload
import typings.next.anon.PayloadEventCliSessionStarted
import typings.next.anon.PayloadEventPackageUsedInGetServerSideProps
import typings.next.anon.PayloadEventTypeCheckCompleted
import typings.next.distBuildWebpackPluginsTelemetryPluginMod.TelemetryPlugin
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.next.distTelemetryEventsBuildMod.EventLintCheckCompleted_
import typings.next.distTelemetryEventsBuildMod.EventTypeCheckCompleted_
import typings.next.distTelemetryEventsPluginsMod.NextPluginsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsMod {
  
  @JSImport("next/dist/telemetry/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/telemetry/events", "EVENT_BUILD_FEATURE_USAGE")
  @js.native
  val EVENT_BUILD_FEATURE_USAGE: /* "NEXT_BUILD_FEATURE_USAGE" */ String = js.native
  
  @JSImport("next/dist/telemetry/events", "EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS")
  @js.native
  val EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS: /* "NEXT_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS" */ String = js.native
  
  inline def eventBuildCompleted(pagePaths: js.Array[String], event: OmitEventBuildCompletedto): EventName = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildCompleted")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventName]
  
  inline def eventBuildFeatureUsage(telemetryPlugin: TelemetryPlugin): js.Array[Payload] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildFeatureUsage")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[Payload]]
  
  inline def eventBuildOptimize(pagePaths: js.Array[String], event: OmitEventBuildOptimizedto): EventNamePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildOptimize")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventNamePayload]
  
  inline def eventCliSession(dir: String, nextConfig: NextConfigComplete, event: OmitEventCliSessionStarte): js.Array[PayloadEventCliSessionStarted] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventCliSession")(dir.asInstanceOf[js.Any], nextConfig.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[PayloadEventCliSessionStarted]]
  
  inline def eventLintCheckCompleted(event: EventLintCheckCompleted_): EventNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("eventLintCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[EventNameString]
  
  inline def eventNextPlugins(dir: String): js.Promise[js.Array[NextPluginsEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNextPlugins")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NextPluginsEvent]]]
  
  inline def eventPackageUsedInGetServerSideProps(telemetryPlugin: TelemetryPlugin): js.Array[PayloadEventPackageUsedInGetServerSideProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventPackageUsedInGetServerSideProps")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[PayloadEventPackageUsedInGetServerSideProps]]
  
  inline def eventTypeCheckCompleted(event: EventTypeCheckCompleted_): PayloadEventTypeCheckCompleted = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTypeCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[PayloadEventTypeCheckCompleted]
}
