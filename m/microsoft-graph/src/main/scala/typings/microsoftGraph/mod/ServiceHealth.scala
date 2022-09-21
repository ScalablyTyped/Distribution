package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHealth
  extends StObject
     with Entity {
  
  // A collection of issues that happened on the service, with detailed information for each issue.
  var issues: js.UndefOr[NullableOption[js.Array[ServiceHealthIssue]]] = js.undefined
  
  /**
    * The service name. Use the list healthOverviews operation to get exact string names for services subscribed by the
    * tenant.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * Show the overral service health status. Possible values are: serviceOperational, investigating, restoringService,
    * verifyingService, serviceRestored, postIncidentReviewPublished, serviceDegradation, serviceInterruption,
    * extendedRecovery, falsePositive, investigationSuspended, resolved, mitigatedExternal, mitigated, resolvedExternal,
    * confirmed, reported, unknownFutureValue. For more details, see serviceHealthStatus values.
    */
  var status: js.UndefOr[ServiceHealthStatus] = js.undefined
}
object ServiceHealth {
  
  inline def apply(): ServiceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealth]
  }
  
  extension [Self <: ServiceHealth](x: Self) {
    
    inline def setIssues(value: NullableOption[js.Array[ServiceHealthIssue]]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesNull: Self = StObject.set(x, "issues", null)
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: ServiceHealthIssue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStatus(value: ServiceHealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
