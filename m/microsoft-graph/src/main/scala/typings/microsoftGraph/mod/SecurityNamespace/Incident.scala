package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: interface-name
trait Incident
  extends StObject
     with Entity {
  
  // The list of related alerts. Supports $expand.
  var alerts: js.UndefOr[NullableOption[js.Array[Alert]]] = js.undefined
  
  // Owner of the incident, or null if no owner is assigned. Free editable text.
  var assignedTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The specification for the incident. Possible values are: unknown, falsePositive, truePositive,
    * informationalExpectedActivity, unknownFutureValue.
    */
  var classification: js.UndefOr[NullableOption[AlertClassification]] = js.undefined
  
  // Array of comments created by the Security Operations (SecOps) team when the incident is managed.
  var comments: js.UndefOr[NullableOption[js.Array[AlertComment]]] = js.undefined
  
  // Time when the incident was first created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Array of custom tags associated with an incident.
  var customTags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Specifies the determination of the incident. Possible values are: unknown, apt, malware, securityPersonnel,
    * securityTesting, unwantedSoftware, other, multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean,
    * insufficientData, confirmedUserActivity, lineOfBusinessApplication, unknownFutureValue.
    */
  var determination: js.UndefOr[NullableOption[AlertDetermination]] = js.undefined
  
  // The incident name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The URL for the incident page in the Microsoft 365 Defender portal.
  var incidentWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time when the incident was last updated.
  var lastUpdateDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Only populated in case an incident is grouped together with another incident, as part of the logic that processes
    * incidents. In such a case, the status property is redirected.
    */
  var redirectIncidentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the possible impact on assets. The higher the severity, the bigger the impact. Typically higher severity
    * items require the most immediate attention. Possible values are: unknown, informational, low, medium, high,
    * unknownFutureValue.
    */
  var severity: js.UndefOr[AlertSeverity] = js.undefined
  
  // The status of the incident. Possible values are: active, resolved, inProgress, redirected, unknownFutureValue.
  var status: js.UndefOr[IncidentStatus] = js.undefined
  
  // The Azure Active Directory tenant in which the alert was created.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
}
object Incident {
  
  inline def apply(): Incident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Incident]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Incident] (val x: Self) extends AnyVal {
    
    inline def setAlerts(value: NullableOption[js.Array[Alert]]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsNull: Self = StObject.set(x, "alerts", null)
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: Alert*): Self = StObject.set(x, "alerts", js.Array(value*))
    
    inline def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setClassification(value: NullableOption[AlertClassification]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setComments(value: NullableOption[js.Array[AlertComment]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: AlertComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setCustomTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "customTags", value.asInstanceOf[js.Any])
    
    inline def setCustomTagsNull: Self = StObject.set(x, "customTags", null)
    
    inline def setCustomTagsUndefined: Self = StObject.set(x, "customTags", js.undefined)
    
    inline def setCustomTagsVarargs(value: String*): Self = StObject.set(x, "customTags", js.Array(value*))
    
    inline def setDetermination(value: NullableOption[AlertDetermination]): Self = StObject.set(x, "determination", value.asInstanceOf[js.Any])
    
    inline def setDeterminationNull: Self = StObject.set(x, "determination", null)
    
    inline def setDeterminationUndefined: Self = StObject.set(x, "determination", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIncidentWebUrl(value: NullableOption[String]): Self = StObject.set(x, "incidentWebUrl", value.asInstanceOf[js.Any])
    
    inline def setIncidentWebUrlNull: Self = StObject.set(x, "incidentWebUrl", null)
    
    inline def setIncidentWebUrlUndefined: Self = StObject.set(x, "incidentWebUrl", js.undefined)
    
    inline def setLastUpdateDateTime(value: String): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setRedirectIncidentId(value: NullableOption[String]): Self = StObject.set(x, "redirectIncidentId", value.asInstanceOf[js.Any])
    
    inline def setRedirectIncidentIdNull: Self = StObject.set(x, "redirectIncidentId", null)
    
    inline def setRedirectIncidentIdUndefined: Self = StObject.set(x, "redirectIncidentId", js.undefined)
    
    inline def setSeverity(value: AlertSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: IncidentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
