package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewScheduleSettings extends StObject {
  
  /**
    * Optional field. Describes the actions to take once a review is complete. There are two types that are currently
    * supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in
    * the case of disableAndDeleteUserApplyAction.
    */
  var applyActions: js.UndefOr[NullableOption[js.Array[AccessReviewApplyAction]]] = js.undefined
  
  /**
    * Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually
    * once the reviewer completes the access review. When set to true, decisions are applied automatically after the access
    * review instance duration ends, whether or not the reviewers have responded. Default value is false.
    */
  var autoApplyDecisionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance
    * with multiple subsequent stages. If not provided, the default is disabled (false).
    */
  var decisionHistoriesForReviewersEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
  var defaultDecision: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.
  var defaultDecisionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Duration of an access review instance in days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object
    * is defined, its durationInDays setting will be used instead of the value of this property.
    */
  var instanceDurationInDays: js.UndefOr[Double] = js.undefined
  
  // Indicates whether reviewers are required to provide justification with their decision. Default value is false.
  var justificationRequiredOnApproval: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether emails are enabled or disabled. Default value is false.
  var mailNotificationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the
    * accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value
    * of this property.
    */
  var recommendationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and
    * type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the
    * day the review starts.
    */
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  // Indicates whether reminders are enabled or disabled. Default value is false.
  var reminderNotificationsEnabled: js.UndefOr[Boolean] = js.undefined
}
object AccessReviewScheduleSettings {
  
  inline def apply(): AccessReviewScheduleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewScheduleSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewScheduleSettings] (val x: Self) extends AnyVal {
    
    inline def setApplyActions(value: NullableOption[js.Array[AccessReviewApplyAction]]): Self = StObject.set(x, "applyActions", value.asInstanceOf[js.Any])
    
    inline def setApplyActionsNull: Self = StObject.set(x, "applyActions", null)
    
    inline def setApplyActionsUndefined: Self = StObject.set(x, "applyActions", js.undefined)
    
    inline def setApplyActionsVarargs(value: AccessReviewApplyAction*): Self = StObject.set(x, "applyActions", js.Array(value*))
    
    inline def setAutoApplyDecisionsEnabled(value: Boolean): Self = StObject.set(x, "autoApplyDecisionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoApplyDecisionsEnabledUndefined: Self = StObject.set(x, "autoApplyDecisionsEnabled", js.undefined)
    
    inline def setDecisionHistoriesForReviewersEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "decisionHistoriesForReviewersEnabled", value.asInstanceOf[js.Any])
    
    inline def setDecisionHistoriesForReviewersEnabledNull: Self = StObject.set(x, "decisionHistoriesForReviewersEnabled", null)
    
    inline def setDecisionHistoriesForReviewersEnabledUndefined: Self = StObject.set(x, "decisionHistoriesForReviewersEnabled", js.undefined)
    
    inline def setDefaultDecision(value: NullableOption[String]): Self = StObject.set(x, "defaultDecision", value.asInstanceOf[js.Any])
    
    inline def setDefaultDecisionEnabled(value: Boolean): Self = StObject.set(x, "defaultDecisionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDefaultDecisionEnabledUndefined: Self = StObject.set(x, "defaultDecisionEnabled", js.undefined)
    
    inline def setDefaultDecisionNull: Self = StObject.set(x, "defaultDecision", null)
    
    inline def setDefaultDecisionUndefined: Self = StObject.set(x, "defaultDecision", js.undefined)
    
    inline def setInstanceDurationInDays(value: Double): Self = StObject.set(x, "instanceDurationInDays", value.asInstanceOf[js.Any])
    
    inline def setInstanceDurationInDaysUndefined: Self = StObject.set(x, "instanceDurationInDays", js.undefined)
    
    inline def setJustificationRequiredOnApproval(value: Boolean): Self = StObject.set(x, "justificationRequiredOnApproval", value.asInstanceOf[js.Any])
    
    inline def setJustificationRequiredOnApprovalUndefined: Self = StObject.set(x, "justificationRequiredOnApproval", js.undefined)
    
    inline def setMailNotificationsEnabled(value: Boolean): Self = StObject.set(x, "mailNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setMailNotificationsEnabledUndefined: Self = StObject.set(x, "mailNotificationsEnabled", js.undefined)
    
    inline def setRecommendationsEnabled(value: Boolean): Self = StObject.set(x, "recommendationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsEnabledUndefined: Self = StObject.set(x, "recommendationsEnabled", js.undefined)
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setReminderNotificationsEnabled(value: Boolean): Self = StObject.set(x, "reminderNotificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setReminderNotificationsEnabledUndefined: Self = StObject.set(x, "reminderNotificationsEnabled", js.undefined)
  }
}
