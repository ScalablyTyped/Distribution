package typings.next.anon

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next.next/dist/build/analysis/get-page-static-info.MiddlewareConfig> */
trait PartialMiddlewareConfig extends StObject {
  
  var matchers: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
  
  var regions: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var unstable_allowDynamicGlobs: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialMiddlewareConfig {
  
  inline def apply(): PartialMiddlewareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMiddlewareConfig]
  }
  
  extension [Self <: PartialMiddlewareConfig](x: Self) {
    
    inline def setMatchers(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
    
    inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
    
    inline def setMatchersVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "matchers", js.Array(value*))
    
    inline def setRegions(value: js.Array[String] | String): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setUnstable_allowDynamicGlobs(value: js.Array[String]): Self = StObject.set(x, "unstable_allowDynamicGlobs", value.asInstanceOf[js.Any])
    
    inline def setUnstable_allowDynamicGlobsUndefined: Self = StObject.set(x, "unstable_allowDynamicGlobs", js.undefined)
    
    inline def setUnstable_allowDynamicGlobsVarargs(value: String*): Self = StObject.set(x, "unstable_allowDynamicGlobs", js.Array(value*))
  }
}
