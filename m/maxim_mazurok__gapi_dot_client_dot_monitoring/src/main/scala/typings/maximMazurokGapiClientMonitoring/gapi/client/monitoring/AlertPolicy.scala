package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertPolicy extends StObject {
  
  /** How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED. */
  var combiner: js.UndefOr[String] = js.undefined
  
  /**
    * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is
    * created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
    */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored. */
  var creationRecord: js.UndefOr[MutationRecord] = js.undefined
  
  /**
    * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same
    * project. The name is limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand,
    * mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
    */
  var documentation: js.UndefOr[Documentation] = js.undefined
  
  /**
    * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if
    * it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored. */
  var mutationRecord: js.UndefOr[MutationRecord] = js.undefined
  
  /**
    * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by
    * Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each
    * element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries
    * in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
    */
  var notificationChannels: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode
    * characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.AlertPolicy & TopLevel[js.Any]
  ] = js.undefined
  
  /** Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents. */
  var validity: js.UndefOr[Status] = js.undefined
}
object AlertPolicy {
  
  inline def apply(): AlertPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertPolicy]
  }
  
  extension [Self <: AlertPolicy](x: Self) {
    
    inline def setCombiner(value: String): Self = StObject.set(x, "combiner", value.asInstanceOf[js.Any])
    
    inline def setCombinerUndefined: Self = StObject.set(x, "combiner", js.undefined)
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setCreationRecord(value: MutationRecord): Self = StObject.set(x, "creationRecord", value.asInstanceOf[js.Any])
    
    inline def setCreationRecordUndefined: Self = StObject.set(x, "creationRecord", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDocumentation(value: Documentation): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMutationRecord(value: MutationRecord): Self = StObject.set(x, "mutationRecord", value.asInstanceOf[js.Any])
    
    inline def setMutationRecordUndefined: Self = StObject.set(x, "mutationRecord", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationChannels(value: js.Array[String]): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelsUndefined: Self = StObject.set(x, "notificationChannels", js.undefined)
    
    inline def setNotificationChannelsVarargs(value: String*): Self = StObject.set(x, "notificationChannels", js.Array(value :_*))
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.AlertPolicy & TopLevel[js.Any]
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
    
    inline def setValidity(value: Status): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
