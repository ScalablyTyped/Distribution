package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlertPolicy extends js.Object {
  
  /** How to combine the results of multiple conditions to determine if an incident should be opened. If condition_time_series_query_language is present, this must be COMBINE_UNSPECIFIED. */
  var combiner: js.UndefOr[String] = js.native
  
  /**
    * A list of conditions for the policy. The conditions are combined by AND or OR according to the combiner field. If the combined conditions evaluate to true, then an incident is
    * created. A policy can have from one to six conditions. If condition_time_series_query_language is present, it must be the only condition.
    */
  var conditions: js.UndefOr[js.Array[Condition]] = js.native
  
  /** A read-only record of the creation of the alerting policy. If provided in a call to create or update, this field will be ignored. */
  var creationRecord: js.UndefOr[MutationRecord] = js.native
  
  /**
    * A short name or phrase used to identify the policy in dashboards, notifications, and incidents. To avoid confusion, don't use the same display name for multiple policies in the same
    * project. The name is limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Documentation that is included with notifications and incidents related to this policy. Best practice is for the documentation to include information to help responders understand,
    * mitigate, escalate, and correct the underlying problems detected by the alerting policy. Notification channels that have limited capacity might not show this documentation.
    */
  var documentation: js.UndefOr[Documentation] = js.native
  
  /**
    * Whether or not the policy is enabled. On write, the default interpretation if unset is that the policy is enabled. On read, clients should not make any assumption about the state if
    * it has not been populated. The field should always be populated on List and Get operations, unless a field projection has been specified that strips it out.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** A read-only record of the most recent change to the alerting policy. If provided in a call to create or update, this field will be ignored. */
  var mutationRecord: js.UndefOr[MutationRecord] = js.native
  
  /**
    * Required if the policy exists. The resource name for this policy. The format is: projects/[PROJECT_ID_OR_NUMBER]/alertPolicies/[ALERT_POLICY_ID] [ALERT_POLICY_ID] is assigned by
    * Stackdriver Monitoring when the policy is created. When calling the alertPolicies.create method, do not include the name field in the alerting policy passed as part of the request.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Identifies the notification channels to which notifications should be sent when incidents are opened or closed or when new violations occur on an already opened incident. Each
    * element of this array corresponds to the name field in each of the NotificationChannel objects that are returned from the ListNotificationChannels method. The format of the entries
    * in this field is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID]
    */
  var notificationChannels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User-supplied key/value data to be used for organizing and identifying the AlertPolicy objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode
    * characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.AlertPolicy with TopLevel[js.Any]
  ] = js.native
  
  /** Read-only description of how the alert policy is invalid. OK if the alert policy is valid. If not OK, the alert policy will not generate incidents. */
  var validity: js.UndefOr[Status] = js.native
}
object AlertPolicy {
  
  @scala.inline
  def apply(): AlertPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertPolicy]
  }
  
  @scala.inline
  implicit class AlertPolicyOps[Self <: AlertPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCombiner(value: String): Self = this.set("combiner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombiner: Self = this.set("combiner", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setCreationRecord(value: MutationRecord): Self = this.set("creationRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationRecord: Self = this.set("creationRecord", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDocumentation(value: Documentation): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMutationRecord(value: MutationRecord): Self = this.set("mutationRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutationRecord: Self = this.set("mutationRecord", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationChannelsVarargs(value: String*): Self = this.set("notificationChannels", js.Array(value :_*))
    
    @scala.inline
    def setNotificationChannels(value: js.Array[String]): Self = this.set("notificationChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationChannels: Self = this.set("notificationChannels", js.undefined)
    
    @scala.inline
    def setUserLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.AlertPolicy with TopLevel[js.Any]
    ): Self = this.set("userLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLabels: Self = this.set("userLabels", js.undefined)
    
    @scala.inline
    def setValidity(value: Status): Self = this.set("validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidity: Self = this.set("validity", js.undefined)
  }
}
