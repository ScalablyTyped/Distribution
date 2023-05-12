package typings.metro.anon

import typings.metro.metroStrings.watcher_health_check_result
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result
  extends StObject
     with ReportableEvent {
  
  var result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HealthCheckResult */ Any
  
  var `type`: watcher_health_check_result
}
object Result {
  
  inline def apply(
    result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HealthCheckResult */ Any
  ): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("watcher_health_check_result")
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    inline def setResult(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HealthCheckResult */ Any
    ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: watcher_health_check_result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
