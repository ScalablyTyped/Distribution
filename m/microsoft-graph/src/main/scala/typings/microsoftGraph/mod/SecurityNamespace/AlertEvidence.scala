package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertEvidence extends StObject {
  
  /**
    * The date and time when the evidence was created and added to the alert. The Timestamp type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  var detailedRoles: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Status of the remediation action taken. The possible values are: none, remediated, prevented, blocked, notFound,
    * unknownFutureValue.
    */
  var remediationStatus: js.UndefOr[EvidenceRemediationStatus] = js.undefined
  
  // Details about the remediation status.
  var remediationStatusDetails: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * One or more roles that an evidence entity represents in an alert. For example, an IP address that is associated with an
    * attacker has the evidence role Attacker.
    */
  var roles: js.UndefOr[js.Array[EvidenceRole]] = js.undefined
  
  /**
    * Array of custom tags associated with an evidence instance. For example, to denote a group of devices or high value
    * assets.
    */
  var tags: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The decision reached by automated investigation. The possible values are: unknown, suspicious, malicious,
    * noThreatsFound, unknownFutureValue.
    */
  var verdict: js.UndefOr[EvidenceVerdict] = js.undefined
}
object AlertEvidence {
  
  inline def apply(): AlertEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertEvidence] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDetailedRoles(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "detailedRoles", value.asInstanceOf[js.Any])
    
    inline def setDetailedRolesNull: Self = StObject.set(x, "detailedRoles", null)
    
    inline def setDetailedRolesUndefined: Self = StObject.set(x, "detailedRoles", js.undefined)
    
    inline def setDetailedRolesVarargs(value: String*): Self = StObject.set(x, "detailedRoles", js.Array(value*))
    
    inline def setRemediationStatus(value: EvidenceRemediationStatus): Self = StObject.set(x, "remediationStatus", value.asInstanceOf[js.Any])
    
    inline def setRemediationStatusDetails(value: NullableOption[String]): Self = StObject.set(x, "remediationStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setRemediationStatusDetailsNull: Self = StObject.set(x, "remediationStatusDetails", null)
    
    inline def setRemediationStatusDetailsUndefined: Self = StObject.set(x, "remediationStatusDetails", js.undefined)
    
    inline def setRemediationStatusUndefined: Self = StObject.set(x, "remediationStatus", js.undefined)
    
    inline def setRoles(value: js.Array[EvidenceRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: EvidenceRole*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setTags(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVerdict(value: EvidenceVerdict): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
