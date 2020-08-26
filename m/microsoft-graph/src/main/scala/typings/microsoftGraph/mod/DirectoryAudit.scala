package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryAudit extends Entity {
  /**
    * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight
    * UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var activityDateTime: js.UndefOr[String] = js.native
  /**
    * Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list,
    * see Azure AD activity list.
    */
  var activityDisplayName: js.UndefOr[String] = js.native
  // Indicates additional details on the activity.
  var additionalDetails: js.UndefOr[js.Array[KeyValue]] = js.native
  /**
    * Indicates which resource category that's targeted by the activity. (For example: User Management, Group Management
    * etc..)
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs
    * across services.
    */
  var correlationId: js.UndefOr[String] = js.native
  // Indicates information about the user or app initiated the activity.
  var initiatedBy: js.UndefOr[AuditActivityInitiator] = js.native
  /**
    * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core
    * Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
    */
  var loggedByService: js.UndefOr[String] = js.native
  var operationType: js.UndefOr[String] = js.native
  // Indicates the result of the activity.Possible values are: success, failure, timeout, unknownFutureValue.
  var result: js.UndefOr[OperationResult] = js.native
  // Describes cause of 'failure' or 'timeout' results.
  var resultReason: js.UndefOr[String] = js.native
  /**
    * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device,
    * Directory, App, Role, Group, Policy or Other.
    */
  var targetResources: js.UndefOr[js.Array[TargetResource]] = js.native
}

object DirectoryAudit {
  @scala.inline
  def apply(): DirectoryAudit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryAudit]
  }
  @scala.inline
  implicit class DirectoryAuditOps[Self <: DirectoryAudit] (val x: Self) extends AnyVal {
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
    def setActivityDateTime(value: String): Self = this.set("activityDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityDateTime: Self = this.set("activityDateTime", js.undefined)
    @scala.inline
    def setActivityDisplayName(value: String): Self = this.set("activityDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityDisplayName: Self = this.set("activityDisplayName", js.undefined)
    @scala.inline
    def setAdditionalDetailsVarargs(value: KeyValue*): Self = this.set("additionalDetails", js.Array(value :_*))
    @scala.inline
    def setAdditionalDetails(value: js.Array[KeyValue]): Self = this.set("additionalDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalDetails: Self = this.set("additionalDetails", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    @scala.inline
    def setInitiatedBy(value: AuditActivityInitiator): Self = this.set("initiatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiatedBy: Self = this.set("initiatedBy", js.undefined)
    @scala.inline
    def setLoggedByService(value: String): Self = this.set("loggedByService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggedByService: Self = this.set("loggedByService", js.undefined)
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setResult(value: OperationResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResultReason(value: String): Self = this.set("resultReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultReason: Self = this.set("resultReason", js.undefined)
    @scala.inline
    def setTargetResourcesVarargs(value: TargetResource*): Self = this.set("targetResources", js.Array(value :_*))
    @scala.inline
    def setTargetResources(value: js.Array[TargetResource]): Self = this.set("targetResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetResources: Self = this.set("targetResources", js.undefined)
  }
  
}

