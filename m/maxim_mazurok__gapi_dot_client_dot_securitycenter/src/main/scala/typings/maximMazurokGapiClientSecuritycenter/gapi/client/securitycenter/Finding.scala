package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  /** Access details associated to the Finding, such as more information on the caller, which method was accessed, from where, etc. */
  var access: js.UndefOr[Access] = js.undefined
  
  /**
    * The canonical name of the finding. It's either "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
    * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or "projects/{project_number}/sources/{source_id}/findings/{finding_id}", depending on the closest CRM ancestor of
    * the resource associated with the finding.
    */
  var canonicalName: js.UndefOr[String] = js.undefined
  
  /** The additional taxonomy group within findings from a given source. This field is immutable after creation time. Example: "XSS_FLASH_INJECTION" */
  var category: js.UndefOr[String] = js.undefined
  
  /** Contains compliance information for security standards associated to the finding. */
  var compliances: js.UndefOr[js.Array[Compliance]] = js.undefined
  
  /** Contains information about the IP connection associated with the finding. */
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  /**
    * Output only. Map containing the point of contacts for the given finding. The key represents the type of contact, while the value contains a list of all the contacts that pertain.
    * Please refer to: https://cloud.google.com/resource-manager/docs/managing-notification-contacts#notification-categories { "security": { "contacts": [ { "email": "person1@company.com"
    * }, { "email": "person2@company.com" } ] }
    */
  var contacts: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.securitycenter.gapi.client.securitycenter.ContactDetails} */ js.Any
  ] = js.undefined
  
  /** Containers associated with the finding. containers provides information for both Kubernetes and non-Kubernetes containers. */
  var containers: js.UndefOr[js.Array[Container]] = js.undefined
  
  /** The time at which the finding was created in Security Command Center. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Database associated with the finding. */
  var database: js.UndefOr[Database] = js.undefined
  
  /** Contains more detail about the finding. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time the finding was first detected. If an existing finding is updated, then this is the time the update occurred. For example, if the finding represents an open firewall, this
    * property captures the time the detector believes the firewall became open. The accuracy is determined by the detector. If the finding is later resolved, then this time reflects when
    * the finding was resolved. This must not be set to a value greater than the current timestamp.
    */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /** Represents exfiltration associated with the Finding. */
  var exfiltration: js.UndefOr[Exfiltration] = js.undefined
  
  /** Output only. Third party SIEM/SOAR fields within SCC, contains external system information and external system finding fields. */
  var externalSystems: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.securitycenter.gapi.client.securitycenter.GoogleCloudSecuritycenterV1ExternalSystem} */ js.Any
  ] = js.undefined
  
  /**
    * The URI that, if available, points to a web page outside of Security Command Center where additional information about the finding can be found. This field is guaranteed to be
    * either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.undefined
  
  /** The class of the finding. */
  var findingClass: js.UndefOr[String] = js.undefined
  
  /** Represents IAM bindings associated with the Finding. */
  var iamBindings: js.UndefOr[js.Array[IamBinding]] = js.undefined
  
  /**
    * Represents what's commonly known as an Indicator of compromise (IoC) in computer forensics. This is an artifact observed on a network or in an operating system that, with high
    * confidence, indicates a computer intrusion. Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
    */
  var indicator: js.UndefOr[Indicator] = js.undefined
  
  /** Kubernetes resources associated with the finding. */
  var kubernetes: js.UndefOr[Kubernetes] = js.undefined
  
  /** MITRE ATT&CK tactics and techniques related to this finding. See: https://attack.mitre.org */
  var mitreAttack: js.UndefOr[MitreAttack] = js.undefined
  
  /** Indicates the mute state of a finding (either muted, unmuted or undefined). Unlike other attributes of a finding, a finding provider shouldn't set the value of mute. */
  var mute: js.UndefOr[String] = js.undefined
  
  /**
    * First known as mute_annotation. Records additional information about the mute operation e.g. mute config that muted the finding, user who muted the finding, etc. Unlike other
    * attributes of a finding, a finding provider shouldn't set the value of mute.
    */
  var muteInitiator: js.UndefOr[String] = js.undefined
  
  /** Output only. The most recent time this finding was muted or unmuted. */
  var muteUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Next steps associate to the finding. */
  var nextSteps: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of the source the finding belongs to. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is immutable after
    * creation time. For example: "organizations/{organization_id}/sources/{source_id}"
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Represents operating system processes associated with the Finding. */
  var processes: js.UndefOr[js.Array[Process]] = js.undefined
  
  /**
    * For findings on Google Cloud resources, the full resource name of the Google Cloud resource this finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for a non-Google Cloud resource, the resourceName can be a customer or partner defined
    * string. This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /** Output only. User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the finding. */
  var securityMarks: js.UndefOr[SecurityMarks] = js.undefined
  
  /** The severity of the finding. This field is managed by the source that writes the finding. */
  var severity: js.UndefOr[String] = js.undefined
  
  /**
    * Source specific properties. These properties are managed by the source that writes the finding. The key names in the source_properties map must be between 1 and 255 characters, and
    * must start with a letter and contain alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The state of the finding. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Represents vulnerability specific fields like cve, cvss scores etc. CVE stands for Common Vulnerabilities and Exposures (https://cve.mitre.org/about/) */
  var vulnerability: js.UndefOr[Vulnerability] = js.undefined
}
object Finding {
  
  inline def apply(): Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Finding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Finding] (val x: Self) extends AnyVal {
    
    inline def setAccess(value: Access): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCompliances(value: js.Array[Compliance]): Self = StObject.set(x, "compliances", value.asInstanceOf[js.Any])
    
    inline def setCompliancesUndefined: Self = StObject.set(x, "compliances", js.undefined)
    
    inline def setCompliancesVarargs(value: Compliance*): Self = StObject.set(x, "compliances", js.Array(value*))
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setContacts(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.securitycenter.gapi.client.securitycenter.ContactDetails} */ js.Any
    ): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContainers(value: js.Array[Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setExfiltration(value: Exfiltration): Self = StObject.set(x, "exfiltration", value.asInstanceOf[js.Any])
    
    inline def setExfiltrationUndefined: Self = StObject.set(x, "exfiltration", js.undefined)
    
    inline def setExternalSystems(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.securitycenter.gapi.client.securitycenter.GoogleCloudSecuritycenterV1ExternalSystem} */ js.Any
    ): Self = StObject.set(x, "externalSystems", value.asInstanceOf[js.Any])
    
    inline def setExternalSystemsUndefined: Self = StObject.set(x, "externalSystems", js.undefined)
    
    inline def setExternalUri(value: String): Self = StObject.set(x, "externalUri", value.asInstanceOf[js.Any])
    
    inline def setExternalUriUndefined: Self = StObject.set(x, "externalUri", js.undefined)
    
    inline def setFindingClass(value: String): Self = StObject.set(x, "findingClass", value.asInstanceOf[js.Any])
    
    inline def setFindingClassUndefined: Self = StObject.set(x, "findingClass", js.undefined)
    
    inline def setIamBindings(value: js.Array[IamBinding]): Self = StObject.set(x, "iamBindings", value.asInstanceOf[js.Any])
    
    inline def setIamBindingsUndefined: Self = StObject.set(x, "iamBindings", js.undefined)
    
    inline def setIamBindingsVarargs(value: IamBinding*): Self = StObject.set(x, "iamBindings", js.Array(value*))
    
    inline def setIndicator(value: Indicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setKubernetes(value: Kubernetes): Self = StObject.set(x, "kubernetes", value.asInstanceOf[js.Any])
    
    inline def setKubernetesUndefined: Self = StObject.set(x, "kubernetes", js.undefined)
    
    inline def setMitreAttack(value: MitreAttack): Self = StObject.set(x, "mitreAttack", value.asInstanceOf[js.Any])
    
    inline def setMitreAttackUndefined: Self = StObject.set(x, "mitreAttack", js.undefined)
    
    inline def setMute(value: String): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteInitiator(value: String): Self = StObject.set(x, "muteInitiator", value.asInstanceOf[js.Any])
    
    inline def setMuteInitiatorUndefined: Self = StObject.set(x, "muteInitiator", js.undefined)
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setMuteUpdateTime(value: String): Self = StObject.set(x, "muteUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setMuteUpdateTimeUndefined: Self = StObject.set(x, "muteUpdateTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextSteps(value: String): Self = StObject.set(x, "nextSteps", value.asInstanceOf[js.Any])
    
    inline def setNextStepsUndefined: Self = StObject.set(x, "nextSteps", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProcesses(value: js.Array[Process]): Self = StObject.set(x, "processes", value.asInstanceOf[js.Any])
    
    inline def setProcessesUndefined: Self = StObject.set(x, "processes", js.undefined)
    
    inline def setProcessesVarargs(value: Process*): Self = StObject.set(x, "processes", js.Array(value*))
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSecurityMarks(value: SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSourceProperties(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVulnerability(value: Vulnerability): Self = StObject.set(x, "vulnerability", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityUndefined: Self = StObject.set(x, "vulnerability", js.undefined)
  }
}
