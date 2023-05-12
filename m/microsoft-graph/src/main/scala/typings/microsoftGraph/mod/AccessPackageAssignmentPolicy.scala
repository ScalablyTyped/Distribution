package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentPolicy
  extends StObject
     with Entity {
  
  // Access package containing this policy. Read-only.
  var accessPackage: js.UndefOr[NullableOption[AccessPackage]] = js.undefined
  
  /**
    * Principals that can be assigned the access package through this policy. The possible values are: notSpecified,
    * specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers,
    * allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers,
    * unknownFutureValue.
    */
  var allowedTargetScope: js.UndefOr[NullableOption[AllowedTargetScope]] = js.undefined
  
  // This property is only present for an auto assignment policy; if absent, this is a request-based policy.
  var automaticRequestSettings: js.UndefOr[NullableOption[AccessPackageAutomaticRequestSettings]] = js.undefined
  
  // Catalog of the access package containing this policy. Read-only.
  var catalog: js.UndefOr[NullableOption[AccessPackageCatalog]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The description of the policy.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the policy.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expiration date for assignments created in this policy.
  var expiration: js.UndefOr[NullableOption[ExpirationPattern]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Questions that are posed to the requestor.
  var questions: js.UndefOr[NullableOption[js.Array[AccessPackageQuestion]]] = js.undefined
  
  /**
    * Specifies the settings for approval of requests for an access package assignment through this policy. For example, if
    * approval is required for new requests.
    */
  var requestApprovalSettings: js.UndefOr[NullableOption[AccessPackageAssignmentApprovalSettings]] = js.undefined
  
  /**
    * Provides additional settings to select who can create a request for an access package assignment through this policy,
    * and what they can include in their request.
    */
  var requestorSettings: js.UndefOr[NullableOption[AccessPackageAssignmentRequestorSettings]] = js.undefined
  
  // Settings for access reviews of assignments through this policy.
  var reviewSettings: js.UndefOr[NullableOption[AccessPackageAssignmentReviewSettings]] = js.undefined
  
  // The principals that can be assigned access from an access package through this policy.
  var specificAllowedTargets: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
}
object AccessPackageAssignmentPolicy {
  
  inline def apply(): AccessPackageAssignmentPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageAssignmentPolicy] (val x: Self) extends AnyVal {
    
    inline def setAccessPackage(value: NullableOption[AccessPackage]): Self = StObject.set(x, "accessPackage", value.asInstanceOf[js.Any])
    
    inline def setAccessPackageNull: Self = StObject.set(x, "accessPackage", null)
    
    inline def setAccessPackageUndefined: Self = StObject.set(x, "accessPackage", js.undefined)
    
    inline def setAllowedTargetScope(value: NullableOption[AllowedTargetScope]): Self = StObject.set(x, "allowedTargetScope", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetScopeNull: Self = StObject.set(x, "allowedTargetScope", null)
    
    inline def setAllowedTargetScopeUndefined: Self = StObject.set(x, "allowedTargetScope", js.undefined)
    
    inline def setAutomaticRequestSettings(value: NullableOption[AccessPackageAutomaticRequestSettings]): Self = StObject.set(x, "automaticRequestSettings", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRequestSettingsNull: Self = StObject.set(x, "automaticRequestSettings", null)
    
    inline def setAutomaticRequestSettingsUndefined: Self = StObject.set(x, "automaticRequestSettings", js.undefined)
    
    inline def setCatalog(value: NullableOption[AccessPackageCatalog]): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogNull: Self = StObject.set(x, "catalog", null)
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExpiration(value: NullableOption[ExpirationPattern]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationNull: Self = StObject.set(x, "expiration", null)
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    inline def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    inline def setQuestions(value: NullableOption[js.Array[AccessPackageQuestion]]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    inline def setQuestionsNull: Self = StObject.set(x, "questions", null)
    
    inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
    
    inline def setQuestionsVarargs(value: AccessPackageQuestion*): Self = StObject.set(x, "questions", js.Array(value*))
    
    inline def setRequestApprovalSettings(value: NullableOption[AccessPackageAssignmentApprovalSettings]): Self = StObject.set(x, "requestApprovalSettings", value.asInstanceOf[js.Any])
    
    inline def setRequestApprovalSettingsNull: Self = StObject.set(x, "requestApprovalSettings", null)
    
    inline def setRequestApprovalSettingsUndefined: Self = StObject.set(x, "requestApprovalSettings", js.undefined)
    
    inline def setRequestorSettings(value: NullableOption[AccessPackageAssignmentRequestorSettings]): Self = StObject.set(x, "requestorSettings", value.asInstanceOf[js.Any])
    
    inline def setRequestorSettingsNull: Self = StObject.set(x, "requestorSettings", null)
    
    inline def setRequestorSettingsUndefined: Self = StObject.set(x, "requestorSettings", js.undefined)
    
    inline def setReviewSettings(value: NullableOption[AccessPackageAssignmentReviewSettings]): Self = StObject.set(x, "reviewSettings", value.asInstanceOf[js.Any])
    
    inline def setReviewSettingsNull: Self = StObject.set(x, "reviewSettings", null)
    
    inline def setReviewSettingsUndefined: Self = StObject.set(x, "reviewSettings", js.undefined)
    
    inline def setSpecificAllowedTargets(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "specificAllowedTargets", value.asInstanceOf[js.Any])
    
    inline def setSpecificAllowedTargetsNull: Self = StObject.set(x, "specificAllowedTargets", null)
    
    inline def setSpecificAllowedTargetsUndefined: Self = StObject.set(x, "specificAllowedTargets", js.undefined)
    
    inline def setSpecificAllowedTargetsVarargs(value: SubjectSet*): Self = StObject.set(x, "specificAllowedTargets", js.Array(value*))
  }
}
