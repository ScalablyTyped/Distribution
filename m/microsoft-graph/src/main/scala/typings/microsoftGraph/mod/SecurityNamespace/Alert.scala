package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert
  extends StObject
     with Entity {
  
  // The adversary or activity group that is associated with this alert.
  var actorDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL for the alert page in the Microsoft 365 Defender portal.
  var alertWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Owner of the alert, or null if no owner is assigned.
  var assignedTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The attack kill-chain category that the alert belongs to. Aligned with the MITRE ATT&amp;CK framework.
  var category: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies whether the alert represents a true threat. Possible values are: unknown, falsePositive, truePositive,
    * benignPositive, unknownFutureValue.
    */
  var classification: js.UndefOr[NullableOption[AlertClassification]] = js.undefined
  
  // Array of comments created by the Security Operations (SecOps) team during the alert management process.
  var comments: js.UndefOr[NullableOption[js.Array[AlertComment]]] = js.undefined
  
  // Time when Microsoft 365 Defender created the alert.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // String value describing each alert.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Detection technology or sensor that identified the notable component or activity. Possible values are: unknown,
    * microsoftDefenderForEndpoint, antivirus, smartScreen, customTi, microsoftDefenderForOffice365, automatedInvestigation,
    * microsoftThreatExperts, customDetection, microsoftDefenderForIdentity, cloudAppSecurity, microsoft365Defender,
    * azureAdIdentityProtection, manual, microsoftDataLossPrevention, appGovernancePolicy, appGovernanceDetection,
    * unknownFutureValue, microsoftDefenderForCloud. Note that you must use the Prefer: include-unknown-enum-members request
    * header to get the following value(s) in this evolvable enum: microsoftDefenderForCloud.
    */
  var detectionSource: js.UndefOr[NullableOption[DetectionSource]] = js.undefined
  
  // The ID of the detector that triggered the alert.
  var detectorId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the result of the investigation, whether the alert represents a true attack and if so, the nature of the
    * attack. Possible values are: unknown, apt, malware, securityPersonnel, securityTesting, unwantedSoftware, other,
    * multiStagedAttack, compromisedUser, phishing, maliciousUserActivity, clean, insufficientData, confirmedUserActivity,
    * lineOfBusinessApplication, unknownFutureValue.
    */
  var determination: js.UndefOr[NullableOption[AlertDetermination]] = js.undefined
  
  // Collection of evidence related to the alert.
  var evidence: js.UndefOr[NullableOption[js.Array[AlertEvidence]]] = js.undefined
  
  // The earliest activity associated with the alert.
  var firstActivityDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier to represent the incident this alert resource is associated with.
  var incidentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL for the incident page in the Microsoft 365 Defender portal.
  var incidentWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The oldest activity associated with the alert.
  var lastActivityDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time when the alert was last updated at Microsoft 365 Defender.
  var lastUpdateDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The attack techniques, as aligned with the MITRE ATT&amp;CK framework.
  var mitreTechniques: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The ID of the alert as it appears in the security provider product that generated the alert.
  var providerAlertId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Recommended response and remediation actions to take in the event this alert was generated.
  var recommendedActions: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Time when the alert was resolved.
  var resolvedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The service or product that created this alert. Possible values are: unknown, microsoftDefenderForEndpoint,
    * microsoftDefenderForIdentity, microsoftDefenderForCloudApps, microsoftDefenderForOffice365, microsoft365Defender,
    * azureAdIdentityProtection, microsoftAppGovernance, dataLossPrevention, unknownFutureValue, microsoftDefenderForCloud.
    * Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this
    * evolvable enum: microsoftDefenderForCloud.
    */
  var serviceSource: js.UndefOr[ServiceSource] = js.undefined
  
  /**
    * Indicates the possible impact on assets. The higher the severity the bigger the impact. Typically higher severity items
    * require the most immediate attention. Possible values are: unknown, informational, low, medium, high,
    * unknownFutureValue.
    */
  var severity: js.UndefOr[AlertSeverity] = js.undefined
  
  // The status of the alert. Possible values are: new, inProgress, resolved, unknownFutureValue.
  var status: js.UndefOr[AlertStatus] = js.undefined
  
  // The Azure Active Directory tenant the alert was created in.
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The threat associated with this alert.
  var threatDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Threat family associated with this alert.
  var threatFamilyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Brief identifying string value describing the alert.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
}
object Alert {
  
  inline def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
    
    inline def setActorDisplayName(value: NullableOption[String]): Self = StObject.set(x, "actorDisplayName", value.asInstanceOf[js.Any])
    
    inline def setActorDisplayNameNull: Self = StObject.set(x, "actorDisplayName", null)
    
    inline def setActorDisplayNameUndefined: Self = StObject.set(x, "actorDisplayName", js.undefined)
    
    inline def setAlertWebUrl(value: NullableOption[String]): Self = StObject.set(x, "alertWebUrl", value.asInstanceOf[js.Any])
    
    inline def setAlertWebUrlNull: Self = StObject.set(x, "alertWebUrl", null)
    
    inline def setAlertWebUrlUndefined: Self = StObject.set(x, "alertWebUrl", js.undefined)
    
    inline def setAssignedTo(value: NullableOption[String]): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setAssignedToNull: Self = StObject.set(x, "assignedTo", null)
    
    inline def setAssignedToUndefined: Self = StObject.set(x, "assignedTo", js.undefined)
    
    inline def setCategory(value: NullableOption[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setClassification(value: NullableOption[AlertClassification]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationNull: Self = StObject.set(x, "classification", null)
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setComments(value: NullableOption[js.Array[AlertComment]]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: AlertComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectionSource(value: NullableOption[DetectionSource]): Self = StObject.set(x, "detectionSource", value.asInstanceOf[js.Any])
    
    inline def setDetectionSourceNull: Self = StObject.set(x, "detectionSource", null)
    
    inline def setDetectionSourceUndefined: Self = StObject.set(x, "detectionSource", js.undefined)
    
    inline def setDetectorId(value: NullableOption[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdNull: Self = StObject.set(x, "detectorId", null)
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setDetermination(value: NullableOption[AlertDetermination]): Self = StObject.set(x, "determination", value.asInstanceOf[js.Any])
    
    inline def setDeterminationNull: Self = StObject.set(x, "determination", null)
    
    inline def setDeterminationUndefined: Self = StObject.set(x, "determination", js.undefined)
    
    inline def setEvidence(value: NullableOption[js.Array[AlertEvidence]]): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceNull: Self = StObject.set(x, "evidence", null)
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setEvidenceVarargs(value: AlertEvidence*): Self = StObject.set(x, "evidence", js.Array(value*))
    
    inline def setFirstActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "firstActivityDateTime", value.asInstanceOf[js.Any])
    
    inline def setFirstActivityDateTimeNull: Self = StObject.set(x, "firstActivityDateTime", null)
    
    inline def setFirstActivityDateTimeUndefined: Self = StObject.set(x, "firstActivityDateTime", js.undefined)
    
    inline def setIncidentId(value: NullableOption[String]): Self = StObject.set(x, "incidentId", value.asInstanceOf[js.Any])
    
    inline def setIncidentIdNull: Self = StObject.set(x, "incidentId", null)
    
    inline def setIncidentIdUndefined: Self = StObject.set(x, "incidentId", js.undefined)
    
    inline def setIncidentWebUrl(value: NullableOption[String]): Self = StObject.set(x, "incidentWebUrl", value.asInstanceOf[js.Any])
    
    inline def setIncidentWebUrlNull: Self = StObject.set(x, "incidentWebUrl", null)
    
    inline def setIncidentWebUrlUndefined: Self = StObject.set(x, "incidentWebUrl", js.undefined)
    
    inline def setLastActivityDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastActivityDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastActivityDateTimeNull: Self = StObject.set(x, "lastActivityDateTime", null)
    
    inline def setLastActivityDateTimeUndefined: Self = StObject.set(x, "lastActivityDateTime", js.undefined)
    
    inline def setLastUpdateDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTimeNull: Self = StObject.set(x, "lastUpdateDateTime", null)
    
    inline def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "lastUpdateDateTime", js.undefined)
    
    inline def setMitreTechniques(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "mitreTechniques", value.asInstanceOf[js.Any])
    
    inline def setMitreTechniquesNull: Self = StObject.set(x, "mitreTechniques", null)
    
    inline def setMitreTechniquesUndefined: Self = StObject.set(x, "mitreTechniques", js.undefined)
    
    inline def setMitreTechniquesVarargs(value: String*): Self = StObject.set(x, "mitreTechniques", js.Array(value*))
    
    inline def setProviderAlertId(value: NullableOption[String]): Self = StObject.set(x, "providerAlertId", value.asInstanceOf[js.Any])
    
    inline def setProviderAlertIdNull: Self = StObject.set(x, "providerAlertId", null)
    
    inline def setProviderAlertIdUndefined: Self = StObject.set(x, "providerAlertId", js.undefined)
    
    inline def setRecommendedActions(value: NullableOption[String]): Self = StObject.set(x, "recommendedActions", value.asInstanceOf[js.Any])
    
    inline def setRecommendedActionsNull: Self = StObject.set(x, "recommendedActions", null)
    
    inline def setRecommendedActionsUndefined: Self = StObject.set(x, "recommendedActions", js.undefined)
    
    inline def setResolvedDateTime(value: NullableOption[String]): Self = StObject.set(x, "resolvedDateTime", value.asInstanceOf[js.Any])
    
    inline def setResolvedDateTimeNull: Self = StObject.set(x, "resolvedDateTime", null)
    
    inline def setResolvedDateTimeUndefined: Self = StObject.set(x, "resolvedDateTime", js.undefined)
    
    inline def setServiceSource(value: ServiceSource): Self = StObject.set(x, "serviceSource", value.asInstanceOf[js.Any])
    
    inline def setServiceSourceUndefined: Self = StObject.set(x, "serviceSource", js.undefined)
    
    inline def setSeverity(value: AlertSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: AlertStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setThreatDisplayName(value: NullableOption[String]): Self = StObject.set(x, "threatDisplayName", value.asInstanceOf[js.Any])
    
    inline def setThreatDisplayNameNull: Self = StObject.set(x, "threatDisplayName", null)
    
    inline def setThreatDisplayNameUndefined: Self = StObject.set(x, "threatDisplayName", js.undefined)
    
    inline def setThreatFamilyName(value: NullableOption[String]): Self = StObject.set(x, "threatFamilyName", value.asInstanceOf[js.Any])
    
    inline def setThreatFamilyNameNull: Self = StObject.set(x, "threatFamilyName", null)
    
    inline def setThreatFamilyNameUndefined: Self = StObject.set(x, "threatFamilyName", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
