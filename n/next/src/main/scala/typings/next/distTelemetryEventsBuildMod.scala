package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.EventName
import typings.next.anon.EventNamePayload
import typings.next.anon.EventNameString
import typings.next.anon.OmitEventBuildCompletedto
import typings.next.anon.OmitEventBuildOptimizedto
import typings.next.anon.Payload
import typings.next.anon.PayloadEventPackageUsedInGetServerSideProps
import typings.next.anon.PayloadEventTypeCheckCompleted
import typings.next.distBuildWebpackPluginsTelemetryPluginMod.TelemetryPlugin
import typings.next.nextStrings.`build-lint`
import typings.next.nextStrings.error
import typings.next.nextStrings.experimentalSlashnextScriptWorkers
import typings.next.nextStrings.experimentalSlashoptimizeCss
import typings.next.nextStrings.nextSlashdynamic
import typings.next.nextStrings.nextSlashfutureSlashimage
import typings.next.nextStrings.nextSlashimage
import typings.next.nextStrings.nextSlashlegacySlashimage
import typings.next.nextStrings.nextSlashscript
import typings.next.nextStrings.off
import typings.next.nextStrings.optimizeFonts
import typings.next.nextStrings.swcEmotion
import typings.next.nextStrings.swcExperimentalDecorators
import typings.next.nextStrings.swcImportSource
import typings.next.nextStrings.swcLoader
import typings.next.nextStrings.swcMinify
import typings.next.nextStrings.swcReactRemoveProperties
import typings.next.nextStrings.swcRelay
import typings.next.nextStrings.swcRemoveConsole
import typings.next.nextStrings.swcStyledComponents
import typings.next.nextStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsBuildMod {
  
  @JSImport("next/dist/telemetry/events/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/telemetry/events/build", "EVENT_BUILD_FEATURE_USAGE")
  @js.native
  val EVENT_BUILD_FEATURE_USAGE: /* "NEXT_BUILD_FEATURE_USAGE" */ String = js.native
  
  @JSImport("next/dist/telemetry/events/build", "EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS")
  @js.native
  val EVENT_NAME_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS: /* "NEXT_PACKAGE_USED_IN_GET_SERVER_SIDE_PROPS" */ String = js.native
  
  inline def eventBuildCompleted(pagePaths: js.Array[String], event: OmitEventBuildCompletedto): EventName = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildCompleted")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventName]
  
  inline def eventBuildFeatureUsage(telemetryPlugin: TelemetryPlugin): js.Array[Payload] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildFeatureUsage")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[Payload]]
  
  inline def eventBuildOptimize(pagePaths: js.Array[String], event: OmitEventBuildOptimizedto): EventNamePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("eventBuildOptimize")(pagePaths.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[EventNamePayload]
  
  inline def eventLintCheckCompleted(event: EventLintCheckCompleted_): EventNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("eventLintCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[EventNameString]
  
  inline def eventPackageUsedInGetServerSideProps(telemetryPlugin: TelemetryPlugin): js.Array[PayloadEventPackageUsedInGetServerSideProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventPackageUsedInGetServerSideProps")(telemetryPlugin.asInstanceOf[js.Any]).asInstanceOf[js.Array[PayloadEventPackageUsedInGetServerSideProps]]
  
  inline def eventTypeCheckCompleted(event: EventTypeCheckCompleted_): PayloadEventTypeCheckCompleted = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTypeCheckCompleted")(event.asInstanceOf[js.Any]).asInstanceOf[PayloadEventTypeCheckCompleted]
  
  trait EventBuildCompleted_ extends StObject {
    
    var durationInSeconds: Double
    
    var hasDunderPages: Boolean
    
    var hasTestPages: Boolean
    
    var totalPageCount: Double
  }
  object EventBuildCompleted_ {
    
    inline def apply(durationInSeconds: Double, hasDunderPages: Boolean, hasTestPages: Boolean, totalPageCount: Double): EventBuildCompleted_ = {
      val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any], hasDunderPages = hasDunderPages.asInstanceOf[js.Any], hasTestPages = hasTestPages.asInstanceOf[js.Any], totalPageCount = totalPageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBuildCompleted_]
    }
    
    extension [Self <: EventBuildCompleted_](x: Self) {
      
      inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
      
      inline def setHasDunderPages(value: Boolean): Self = StObject.set(x, "hasDunderPages", value.asInstanceOf[js.Any])
      
      inline def setHasTestPages(value: Boolean): Self = StObject.set(x, "hasTestPages", value.asInstanceOf[js.Any])
      
      inline def setTotalPageCount(value: Double): Self = StObject.set(x, "totalPageCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventBuildFeatureUsage_ extends StObject {
    
    var featureName: nextSlashimage | nextSlashlegacySlashimage | nextSlashfutureSlashimage | nextSlashscript | nextSlashdynamic | experimentalSlashoptimizeCss | experimentalSlashnextScriptWorkers | optimizeFonts | swcLoader | swcMinify | swcRelay | swcStyledComponents | swcReactRemoveProperties | swcExperimentalDecorators | swcRemoveConsole | swcImportSource | swcEmotion | (/* template literal string: swc/target/${SWC_TARGET_TRIPLE} */ String) | `build-lint`
    
    var invocationCount: Double
  }
  object EventBuildFeatureUsage_ {
    
    inline def apply(
      featureName: nextSlashimage | nextSlashlegacySlashimage | nextSlashfutureSlashimage | nextSlashscript | nextSlashdynamic | experimentalSlashoptimizeCss | experimentalSlashnextScriptWorkers | optimizeFonts | swcLoader | swcMinify | swcRelay | swcStyledComponents | swcReactRemoveProperties | swcExperimentalDecorators | swcRemoveConsole | swcImportSource | swcEmotion | (/* template literal string: swc/target/${SWC_TARGET_TRIPLE} */ String) | `build-lint`,
      invocationCount: Double
    ): EventBuildFeatureUsage_ = {
      val __obj = js.Dynamic.literal(featureName = featureName.asInstanceOf[js.Any], invocationCount = invocationCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBuildFeatureUsage_]
    }
    
    extension [Self <: EventBuildFeatureUsage_](x: Self) {
      
      inline def setFeatureName(
        value: nextSlashimage | nextSlashlegacySlashimage | nextSlashfutureSlashimage | nextSlashscript | nextSlashdynamic | experimentalSlashoptimizeCss | experimentalSlashnextScriptWorkers | optimizeFonts | swcLoader | swcMinify | swcRelay | swcStyledComponents | swcReactRemoveProperties | swcExperimentalDecorators | swcRemoveConsole | swcImportSource | swcEmotion | (/* template literal string: swc/target/${SWC_TARGET_TRIPLE} */ String) | `build-lint`
      ): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
      
      inline def setInvocationCount(value: Double): Self = StObject.set(x, "invocationCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventBuildOptimized extends StObject {
    
    var durationInSeconds: Double
    
    var hasDunderPages: Boolean
    
    var hasReportWebVitals: Boolean
    
    var hasStatic404: Boolean
    
    var hasTestPages: Boolean
    
    var headersCount: Double
    
    var headersWithHasCount: Double
    
    var middlewareCount: Double
    
    var redirectsCount: Double
    
    var redirectsWithHasCount: Double
    
    var rewritesCount: Double
    
    var rewritesWithHasCount: Double
    
    var serverPropsPageCount: Double
    
    var ssrPageCount: Double
    
    var staticPageCount: Double
    
    var staticPropsPageCount: Double
    
    var totalPageCount: Double
  }
  object EventBuildOptimized {
    
    inline def apply(
      durationInSeconds: Double,
      hasDunderPages: Boolean,
      hasReportWebVitals: Boolean,
      hasStatic404: Boolean,
      hasTestPages: Boolean,
      headersCount: Double,
      headersWithHasCount: Double,
      middlewareCount: Double,
      redirectsCount: Double,
      redirectsWithHasCount: Double,
      rewritesCount: Double,
      rewritesWithHasCount: Double,
      serverPropsPageCount: Double,
      ssrPageCount: Double,
      staticPageCount: Double,
      staticPropsPageCount: Double,
      totalPageCount: Double
    ): EventBuildOptimized = {
      val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any], hasDunderPages = hasDunderPages.asInstanceOf[js.Any], hasReportWebVitals = hasReportWebVitals.asInstanceOf[js.Any], hasStatic404 = hasStatic404.asInstanceOf[js.Any], hasTestPages = hasTestPages.asInstanceOf[js.Any], headersCount = headersCount.asInstanceOf[js.Any], headersWithHasCount = headersWithHasCount.asInstanceOf[js.Any], middlewareCount = middlewareCount.asInstanceOf[js.Any], redirectsCount = redirectsCount.asInstanceOf[js.Any], redirectsWithHasCount = redirectsWithHasCount.asInstanceOf[js.Any], rewritesCount = rewritesCount.asInstanceOf[js.Any], rewritesWithHasCount = rewritesWithHasCount.asInstanceOf[js.Any], serverPropsPageCount = serverPropsPageCount.asInstanceOf[js.Any], ssrPageCount = ssrPageCount.asInstanceOf[js.Any], staticPageCount = staticPageCount.asInstanceOf[js.Any], staticPropsPageCount = staticPropsPageCount.asInstanceOf[js.Any], totalPageCount = totalPageCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventBuildOptimized]
    }
    
    extension [Self <: EventBuildOptimized](x: Self) {
      
      inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
      
      inline def setHasDunderPages(value: Boolean): Self = StObject.set(x, "hasDunderPages", value.asInstanceOf[js.Any])
      
      inline def setHasReportWebVitals(value: Boolean): Self = StObject.set(x, "hasReportWebVitals", value.asInstanceOf[js.Any])
      
      inline def setHasStatic404(value: Boolean): Self = StObject.set(x, "hasStatic404", value.asInstanceOf[js.Any])
      
      inline def setHasTestPages(value: Boolean): Self = StObject.set(x, "hasTestPages", value.asInstanceOf[js.Any])
      
      inline def setHeadersCount(value: Double): Self = StObject.set(x, "headersCount", value.asInstanceOf[js.Any])
      
      inline def setHeadersWithHasCount(value: Double): Self = StObject.set(x, "headersWithHasCount", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareCount(value: Double): Self = StObject.set(x, "middlewareCount", value.asInstanceOf[js.Any])
      
      inline def setRedirectsCount(value: Double): Self = StObject.set(x, "redirectsCount", value.asInstanceOf[js.Any])
      
      inline def setRedirectsWithHasCount(value: Double): Self = StObject.set(x, "redirectsWithHasCount", value.asInstanceOf[js.Any])
      
      inline def setRewritesCount(value: Double): Self = StObject.set(x, "rewritesCount", value.asInstanceOf[js.Any])
      
      inline def setRewritesWithHasCount(value: Double): Self = StObject.set(x, "rewritesWithHasCount", value.asInstanceOf[js.Any])
      
      inline def setServerPropsPageCount(value: Double): Self = StObject.set(x, "serverPropsPageCount", value.asInstanceOf[js.Any])
      
      inline def setSsrPageCount(value: Double): Self = StObject.set(x, "ssrPageCount", value.asInstanceOf[js.Any])
      
      inline def setStaticPageCount(value: Double): Self = StObject.set(x, "staticPageCount", value.asInstanceOf[js.Any])
      
      inline def setStaticPropsPageCount(value: Double): Self = StObject.set(x, "staticPropsPageCount", value.asInstanceOf[js.Any])
      
      inline def setTotalPageCount(value: Double): Self = StObject.set(x, "totalPageCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventLintCheckCompleted_ extends StObject {
    
    var buildLint: js.UndefOr[Boolean] = js.undefined
    
    var durationInSeconds: Double
    
    var eslintVersion: String | Null
    
    var lintFix: js.UndefOr[Boolean] = js.undefined
    
    var lintedFilesCount: js.UndefOr[Double] = js.undefined
    
    var nextEslintPluginErrorsCount: js.UndefOr[Double] = js.undefined
    
    var nextEslintPluginVersion: js.UndefOr[String | Null] = js.undefined
    
    var nextEslintPluginWarningsCount: js.UndefOr[Double] = js.undefined
    
    var nextRulesEnabled: StringDictionary[off | warn | error]
  }
  object EventLintCheckCompleted_ {
    
    inline def apply(durationInSeconds: Double, nextRulesEnabled: StringDictionary[off | warn | error]): EventLintCheckCompleted_ = {
      val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any], nextRulesEnabled = nextRulesEnabled.asInstanceOf[js.Any], eslintVersion = null)
      __obj.asInstanceOf[EventLintCheckCompleted_]
    }
    
    extension [Self <: EventLintCheckCompleted_](x: Self) {
      
      inline def setBuildLint(value: Boolean): Self = StObject.set(x, "buildLint", value.asInstanceOf[js.Any])
      
      inline def setBuildLintUndefined: Self = StObject.set(x, "buildLint", js.undefined)
      
      inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
      
      inline def setEslintVersion(value: String): Self = StObject.set(x, "eslintVersion", value.asInstanceOf[js.Any])
      
      inline def setEslintVersionNull: Self = StObject.set(x, "eslintVersion", null)
      
      inline def setLintFix(value: Boolean): Self = StObject.set(x, "lintFix", value.asInstanceOf[js.Any])
      
      inline def setLintFixUndefined: Self = StObject.set(x, "lintFix", js.undefined)
      
      inline def setLintedFilesCount(value: Double): Self = StObject.set(x, "lintedFilesCount", value.asInstanceOf[js.Any])
      
      inline def setLintedFilesCountUndefined: Self = StObject.set(x, "lintedFilesCount", js.undefined)
      
      inline def setNextEslintPluginErrorsCount(value: Double): Self = StObject.set(x, "nextEslintPluginErrorsCount", value.asInstanceOf[js.Any])
      
      inline def setNextEslintPluginErrorsCountUndefined: Self = StObject.set(x, "nextEslintPluginErrorsCount", js.undefined)
      
      inline def setNextEslintPluginVersion(value: String): Self = StObject.set(x, "nextEslintPluginVersion", value.asInstanceOf[js.Any])
      
      inline def setNextEslintPluginVersionNull: Self = StObject.set(x, "nextEslintPluginVersion", null)
      
      inline def setNextEslintPluginVersionUndefined: Self = StObject.set(x, "nextEslintPluginVersion", js.undefined)
      
      inline def setNextEslintPluginWarningsCount(value: Double): Self = StObject.set(x, "nextEslintPluginWarningsCount", value.asInstanceOf[js.Any])
      
      inline def setNextEslintPluginWarningsCountUndefined: Self = StObject.set(x, "nextEslintPluginWarningsCount", js.undefined)
      
      inline def setNextRulesEnabled(value: StringDictionary[off | warn | error]): Self = StObject.set(x, "nextRulesEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventPackageUsedInGetServerSideProps_ extends StObject {
    
    @JSName("package")
    var _package: String
  }
  object EventPackageUsedInGetServerSideProps_ {
    
    inline def apply(_package: String): EventPackageUsedInGetServerSideProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPackageUsedInGetServerSideProps_]
    }
    
    extension [Self <: EventPackageUsedInGetServerSideProps_](x: Self) {
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTypeCheckCompleted_ extends StObject {
    
    var durationInSeconds: Double
    
    var incremental: js.UndefOr[Boolean] = js.undefined
    
    var inputFilesCount: js.UndefOr[Double] = js.undefined
    
    var totalFilesCount: js.UndefOr[Double] = js.undefined
    
    var typescriptVersion: String | Null
  }
  object EventTypeCheckCompleted_ {
    
    inline def apply(durationInSeconds: Double): EventTypeCheckCompleted_ = {
      val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any], typescriptVersion = null)
      __obj.asInstanceOf[EventTypeCheckCompleted_]
    }
    
    extension [Self <: EventTypeCheckCompleted_](x: Self) {
      
      inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
      
      inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      inline def setInputFilesCount(value: Double): Self = StObject.set(x, "inputFilesCount", value.asInstanceOf[js.Any])
      
      inline def setInputFilesCountUndefined: Self = StObject.set(x, "inputFilesCount", js.undefined)
      
      inline def setTotalFilesCount(value: Double): Self = StObject.set(x, "totalFilesCount", value.asInstanceOf[js.Any])
      
      inline def setTotalFilesCountUndefined: Self = StObject.set(x, "totalFilesCount", js.undefined)
      
      inline def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
      
      inline def setTypescriptVersionNull: Self = StObject.set(x, "typescriptVersion", null)
    }
  }
}
