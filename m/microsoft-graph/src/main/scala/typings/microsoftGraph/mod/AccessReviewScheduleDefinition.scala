package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewScheduleDefinition
  extends StObject
     with Entity {
  
  // Defines the list of additional users or group members to be notified of the access review progress.
  var additionalNotificationRecipients: js.UndefOr[NullableOption[js.Array[AccessReviewNotificationRecipientItem]]] = js.undefined
  
  // User who created this review. Read-only.
  var createdBy: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
  
  // Timestamp when the access review series was created. Supports $select. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Description provided by review creators to provide more context of the review to admins. Supports $select.
  var descriptionForAdmins: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Description provided by review creators to provide more context of the review to reviewers. Reviewers will see this
    * description in the email sent to them requesting their review. Email notifications support up to 256 characters.
    * Supports $select.
    */
  var descriptionForReviewers: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of the access review series. Supports $select and $orderBy. Required on create.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be
    * notified to take action if no users are found from the list of reviewers specified. This could occur when either the
    * group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a
    * user's manager does not exist. See accessReviewReviewerScope. Replaces backupReviewers. Supports $select. NOTE: The
    * value of this property will be ignored if fallback reviewers are assigned through the stageSettings property.
    */
  var fallbackReviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * This property is required when scoping a review to guest users' access across all Microsoft 365 groups and determines
    * which Microsoft 365 groups are reviewed. Each group will become a unique accessReviewInstance of the access review
    * series. For supported scopes, see accessReviewScope. Supports $select. For examples of options for configuring
    * instanceEnumerationScope, see Configure the scope of your access review definition using the Microsoft Graph API.
    */
  var instanceEnumerationScope: js.UndefOr[NullableOption[AccessReviewScope]] = js.undefined
  
  /**
    * If the accessReviewScheduleDefinition is a recurring access review, instances represent each recurrence. A review that
    * does not recur will have exactly one instance. Instances also represent each unique resource under review in the
    * accessReviewScheduleDefinition. If a review has multiple resources and multiple instances, each resource will have a
    * unique instance for each recurrence.
    */
  var instances: js.UndefOr[NullableOption[js.Array[AccessReviewInstance]]] = js.undefined
  
  // Timestamp when the access review series was last modified. Supports $select. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This collection of access review scopes is used to define who are the reviewers. The reviewers property is only
    * updatable if individual users are assigned as reviewers. Required on create. Supports $select. For examples of options
    * for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The
    * value of this property will be ignored if reviewers are assigned through the stageSettings property.
    */
  var reviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * Defines the entities whose access is reviewed. For supported scopes, see accessReviewScope. Required on create.
    * Supports $select and $filter (contains only). For examples of options for configuring scope, see Configure the scope of
    * your access review definition using the Microsoft Graph API.
    */
  var scope: js.UndefOr[NullableOption[AccessReviewScope]] = js.undefined
  
  // The settings for an access review series, see type definition below. Supports $select. Required on create.
  var settings: js.UndefOr[NullableOption[AccessReviewScheduleSettings]] = js.undefined
  
  /**
    * Required only for a multi-stage access review to define the stages and their settings. You can break down each review
    * instance into up to three sequential stages, where each stage can have a different set of reviewers, fallback
    * reviewers, and settings. Stages will be created sequentially based on the dependsOn property. Optional. When this
    * property is defined, its settings are used instead of the corresponding settings in the accessReviewScheduleDefinition
    * object and its settings, reviewers, and fallbackReviewers properties.
    */
  var stageSettings: js.UndefOr[NullableOption[js.Array[AccessReviewStageSettings]]] = js.undefined
  
  /**
    * This read-only field specifies the status of an access review. The typical states include Initializing, NotStarted,
    * Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter
    * (eq only). Read-only.
    */
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewScheduleDefinition {
  
  inline def apply(): AccessReviewScheduleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewScheduleDefinition]
  }
  
  extension [Self <: AccessReviewScheduleDefinition](x: Self) {
    
    inline def setAdditionalNotificationRecipients(value: NullableOption[js.Array[AccessReviewNotificationRecipientItem]]): Self = StObject.set(x, "additionalNotificationRecipients", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNotificationRecipientsNull: Self = StObject.set(x, "additionalNotificationRecipients", null)
    
    inline def setAdditionalNotificationRecipientsUndefined: Self = StObject.set(x, "additionalNotificationRecipients", js.undefined)
    
    inline def setAdditionalNotificationRecipientsVarargs(value: AccessReviewNotificationRecipientItem*): Self = StObject.set(x, "additionalNotificationRecipients", js.Array(value*))
    
    inline def setCreatedBy(value: NullableOption[UserIdentity]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDescriptionForAdmins(value: NullableOption[String]): Self = StObject.set(x, "descriptionForAdmins", value.asInstanceOf[js.Any])
    
    inline def setDescriptionForAdminsNull: Self = StObject.set(x, "descriptionForAdmins", null)
    
    inline def setDescriptionForAdminsUndefined: Self = StObject.set(x, "descriptionForAdmins", js.undefined)
    
    inline def setDescriptionForReviewers(value: NullableOption[String]): Self = StObject.set(x, "descriptionForReviewers", value.asInstanceOf[js.Any])
    
    inline def setDescriptionForReviewersNull: Self = StObject.set(x, "descriptionForReviewers", null)
    
    inline def setDescriptionForReviewersUndefined: Self = StObject.set(x, "descriptionForReviewers", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFallbackReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "fallbackReviewers", value.asInstanceOf[js.Any])
    
    inline def setFallbackReviewersNull: Self = StObject.set(x, "fallbackReviewers", null)
    
    inline def setFallbackReviewersUndefined: Self = StObject.set(x, "fallbackReviewers", js.undefined)
    
    inline def setFallbackReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "fallbackReviewers", js.Array(value*))
    
    inline def setInstanceEnumerationScope(value: NullableOption[AccessReviewScope]): Self = StObject.set(x, "instanceEnumerationScope", value.asInstanceOf[js.Any])
    
    inline def setInstanceEnumerationScopeNull: Self = StObject.set(x, "instanceEnumerationScope", null)
    
    inline def setInstanceEnumerationScopeUndefined: Self = StObject.set(x, "instanceEnumerationScope", js.undefined)
    
    inline def setInstances(value: NullableOption[js.Array[AccessReviewInstance]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: AccessReviewInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersNull: Self = StObject.set(x, "reviewers", null)
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setScope(value: NullableOption[AccessReviewScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSettings(value: NullableOption[AccessReviewScheduleSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setStageSettings(value: NullableOption[js.Array[AccessReviewStageSettings]]): Self = StObject.set(x, "stageSettings", value.asInstanceOf[js.Any])
    
    inline def setStageSettingsNull: Self = StObject.set(x, "stageSettings", null)
    
    inline def setStageSettingsUndefined: Self = StObject.set(x, "stageSettings", js.undefined)
    
    inline def setStageSettingsVarargs(value: AccessReviewStageSettings*): Self = StObject.set(x, "stageSettings", js.Array(value*))
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
