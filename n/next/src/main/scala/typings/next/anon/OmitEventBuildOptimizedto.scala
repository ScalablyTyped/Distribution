package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/telemetry/events/build.EventBuildOptimized, 'totalPageCount' | 'hasDunderPages' | 'hasTestPages'> */
trait OmitEventBuildOptimizedto extends StObject {
  
  var durationInSeconds: Double
  
  var hasReportWebVitals: Boolean
  
  var hasStatic404: Boolean
  
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
}
object OmitEventBuildOptimizedto {
  
  inline def apply(
    durationInSeconds: Double,
    hasReportWebVitals: Boolean,
    hasStatic404: Boolean,
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
    staticPropsPageCount: Double
  ): OmitEventBuildOptimizedto = {
    val __obj = js.Dynamic.literal(durationInSeconds = durationInSeconds.asInstanceOf[js.Any], hasReportWebVitals = hasReportWebVitals.asInstanceOf[js.Any], hasStatic404 = hasStatic404.asInstanceOf[js.Any], headersCount = headersCount.asInstanceOf[js.Any], headersWithHasCount = headersWithHasCount.asInstanceOf[js.Any], middlewareCount = middlewareCount.asInstanceOf[js.Any], redirectsCount = redirectsCount.asInstanceOf[js.Any], redirectsWithHasCount = redirectsWithHasCount.asInstanceOf[js.Any], rewritesCount = rewritesCount.asInstanceOf[js.Any], rewritesWithHasCount = rewritesWithHasCount.asInstanceOf[js.Any], serverPropsPageCount = serverPropsPageCount.asInstanceOf[js.Any], ssrPageCount = ssrPageCount.asInstanceOf[js.Any], staticPageCount = staticPageCount.asInstanceOf[js.Any], staticPropsPageCount = staticPropsPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitEventBuildOptimizedto]
  }
  
  extension [Self <: OmitEventBuildOptimizedto](x: Self) {
    
    inline def setDurationInSeconds(value: Double): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setHasReportWebVitals(value: Boolean): Self = StObject.set(x, "hasReportWebVitals", value.asInstanceOf[js.Any])
    
    inline def setHasStatic404(value: Boolean): Self = StObject.set(x, "hasStatic404", value.asInstanceOf[js.Any])
    
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
  }
}
