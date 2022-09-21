package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewHistoryDefinition
  extends StObject
     with Entity {
  
  // User who created this review history definition.
  var createdBy: js.UndefOr[UserIdentity] = js.undefined
  
  // Timestamp when the access review definition was created.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Determines which review decisions will be included in the fetched review history data if specified. Optional on create.
    * All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny,
    * dontKnow, notReviewed, and notNotified.
    */
  var decisions: js.UndefOr[NullableOption[js.Array[AccessReviewHistoryDecisionFilter]]] = js.undefined
  
  // Name for the access review history data collection. Required.
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that
    * does not recur will have exactly one instance.
    */
  var instances: js.UndefOr[NullableOption[js.Array[AccessReviewHistoryInstance]]] = js.undefined
  
  /**
    * A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if
    * scheduleSettings is not defined.
    */
  var reviewHistoryPeriodEndDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if
    * scheduleSettings is not defined.
    */
  var reviewHistoryPeriodStartDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime
    * or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
    */
  var scheduleSettings: js.UndefOr[NullableOption[AccessReviewHistoryScheduleSettings]] = js.undefined
  
  /**
    * Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this
    * provided scope. Required.
    */
  var scopes: js.UndefOr[js.Array[AccessReviewScope]] = js.undefined
  
  /**
    * Represents the status of the review history data collection. The possible values are: done, inProgress, error,
    * requested, unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[AccessReviewHistoryStatus]] = js.undefined
}
object AccessReviewHistoryDefinition {
  
  inline def apply(): AccessReviewHistoryDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewHistoryDefinition]
  }
  
  extension [Self <: AccessReviewHistoryDefinition](x: Self) {
    
    inline def setCreatedBy(value: UserIdentity): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDecisions(value: NullableOption[js.Array[AccessReviewHistoryDecisionFilter]]): Self = StObject.set(x, "decisions", value.asInstanceOf[js.Any])
    
    inline def setDecisionsNull: Self = StObject.set(x, "decisions", null)
    
    inline def setDecisionsUndefined: Self = StObject.set(x, "decisions", js.undefined)
    
    inline def setDecisionsVarargs(value: AccessReviewHistoryDecisionFilter*): Self = StObject.set(x, "decisions", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInstances(value: NullableOption[js.Array[AccessReviewHistoryInstance]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: AccessReviewHistoryInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setReviewHistoryPeriodEndDateTime(value: String): Self = StObject.set(x, "reviewHistoryPeriodEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewHistoryPeriodEndDateTimeUndefined: Self = StObject.set(x, "reviewHistoryPeriodEndDateTime", js.undefined)
    
    inline def setReviewHistoryPeriodStartDateTime(value: String): Self = StObject.set(x, "reviewHistoryPeriodStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewHistoryPeriodStartDateTimeUndefined: Self = StObject.set(x, "reviewHistoryPeriodStartDateTime", js.undefined)
    
    inline def setScheduleSettings(value: NullableOption[AccessReviewHistoryScheduleSettings]): Self = StObject.set(x, "scheduleSettings", value.asInstanceOf[js.Any])
    
    inline def setScheduleSettingsNull: Self = StObject.set(x, "scheduleSettings", null)
    
    inline def setScheduleSettingsUndefined: Self = StObject.set(x, "scheduleSettings", js.undefined)
    
    inline def setScopes(value: js.Array[AccessReviewScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: AccessReviewScope*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setStatus(value: NullableOption[AccessReviewHistoryStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
