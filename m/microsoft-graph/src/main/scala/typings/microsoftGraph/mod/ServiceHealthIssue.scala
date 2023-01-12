package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHealthIssue
  extends StObject
     with ServiceAnnouncementBase {
  
  // The type of service health issue. Possible values are: advisory, incident, unknownFutureValue.
  var classification: js.UndefOr[ServiceHealthClassificationType] = js.undefined
  
  // The feature name of the service issue.
  var feature: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The feature group name of the service issue.
  var featureGroup: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the service issue impact.
  var impactDescription: js.UndefOr[String] = js.undefined
  
  // Indicates whether the issue is resolved.
  var isResolved: js.UndefOr[Boolean] = js.undefined
  
  // Indicates the origin of the service issue. Possible values are: microsoft, thirdParty, customer, unknownFutureValue.
  var origin: js.UndefOr[ServiceHealthOrigin] = js.undefined
  
  // Collection of historical posts for the service issue.
  var posts: js.UndefOr[js.Array[ServiceHealthIssuePost]] = js.undefined
  
  // Indicates the service affected by the issue.
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service issue. Possible values are: serviceOperational, investigating, restoringService,
    * verifyingService, serviceRestored, postIncidentReviewPublished, serviceDegradation, serviceInterruption,
    * extendedRecovery, falsePositive, investigationSuspended, resolved, mitigatedExternal, mitigated, resolvedExternal,
    * confirmed, reported, unknownFutureValue. See more in the table below.
    */
  var status: js.UndefOr[ServiceHealthStatus] = js.undefined
}
object ServiceHealthIssue {
  
  inline def apply(): ServiceHealthIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealthIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceHealthIssue] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: ServiceHealthClassificationType): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setFeature(value: NullableOption[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroup(value: NullableOption[String]): Self = StObject.set(x, "featureGroup", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupNull: Self = StObject.set(x, "featureGroup", null)
    
    inline def setFeatureGroupUndefined: Self = StObject.set(x, "featureGroup", js.undefined)
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setImpactDescription(value: String): Self = StObject.set(x, "impactDescription", value.asInstanceOf[js.Any])
    
    inline def setImpactDescriptionUndefined: Self = StObject.set(x, "impactDescription", js.undefined)
    
    inline def setIsResolved(value: Boolean): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    inline def setIsResolvedUndefined: Self = StObject.set(x, "isResolved", js.undefined)
    
    inline def setOrigin(value: ServiceHealthOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPosts(value: js.Array[ServiceHealthIssuePost]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
    inline def setPostsVarargs(value: ServiceHealthIssuePost*): Self = StObject.set(x, "posts", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStatus(value: ServiceHealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
