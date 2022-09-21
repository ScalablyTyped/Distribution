package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /** A condition that checks that a time series continues to receive new data points. */
  var conditionAbsent: js.UndefOr[MetricAbsence] = js.undefined
  
  /** A condition that checks for log messages matching given constraints. If set, no other conditions can be present. */
  var conditionMatchedLog: js.UndefOr[LogMatch] = js.undefined
  
  /** A condition that uses the Monitoring Query Language to define alerts. */
  var conditionMonitoringQueryLanguage: js.UndefOr[MonitoringQueryLanguageCondition] = js.undefined
  
  /** A condition that compares a time series against a threshold. */
  var conditionThreshold: js.UndefOr[MetricThreshold] = js.undefined
  
  /**
    * A short name or phrase used to identify the condition in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple conditions in the
    * same policy.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required if the condition exists. The unique resource name for this condition. Its format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
    * [CONDITION_ID] is assigned by Cloud Monitoring when the condition is created as part of a new or updated alerting policy.When calling the alertPolicies.create method, do not include
    * the name field in the conditions of the requested alerting policy. Cloud Monitoring creates the condition identifiers and includes them in the new policy.When calling the
    * alertPolicies.update method to update a policy, including a condition name causes the existing condition to be updated. Conditions without names are added to the updated policy.
    * Existing conditions are deleted if they are not updated.Best practice is to preserve [CONDITION_ID] if you make only small changes, such as those to condition thresholds, durations,
    * or trigger values. Otherwise, treat the change as a new condition and let the existing condition be deleted.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setConditionAbsent(value: MetricAbsence): Self = StObject.set(x, "conditionAbsent", value.asInstanceOf[js.Any])
    
    inline def setConditionAbsentUndefined: Self = StObject.set(x, "conditionAbsent", js.undefined)
    
    inline def setConditionMatchedLog(value: LogMatch): Self = StObject.set(x, "conditionMatchedLog", value.asInstanceOf[js.Any])
    
    inline def setConditionMatchedLogUndefined: Self = StObject.set(x, "conditionMatchedLog", js.undefined)
    
    inline def setConditionMonitoringQueryLanguage(value: MonitoringQueryLanguageCondition): Self = StObject.set(x, "conditionMonitoringQueryLanguage", value.asInstanceOf[js.Any])
    
    inline def setConditionMonitoringQueryLanguageUndefined: Self = StObject.set(x, "conditionMonitoringQueryLanguage", js.undefined)
    
    inline def setConditionThreshold(value: MetricThreshold): Self = StObject.set(x, "conditionThreshold", value.asInstanceOf[js.Any])
    
    inline def setConditionThresholdUndefined: Self = StObject.set(x, "conditionThreshold", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
