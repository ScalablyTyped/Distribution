package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRule extends Entity {
  // Actions to be taken on a message when the corresponding conditions are fulfilled.
  var actions: js.UndefOr[MessageRuleActions] = js.native
  // Conditions that when fulfilled, will trigger the corresponding actions for that rule.
  var conditions: js.UndefOr[MessageRulePredicates] = js.native
  // The display name of the rule.
  var displayName: js.UndefOr[String] = js.native
  // Exception conditions for the rule.
  var exceptions: js.UndefOr[MessageRulePredicates] = js.native
  // Indicates whether the rule is in an error condition. Read-only.
  var hasError: js.UndefOr[Boolean] = js.native
  // Indicates whether the rule is enabled to be applied to messages.
  var isEnabled: js.UndefOr[Boolean] = js.native
  // Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
  var isReadOnly: js.UndefOr[Boolean] = js.native
  // Indicates the order in which the rule is executed, among other rules.
  var sequence: js.UndefOr[Double] = js.native
}

object MessageRule {
  @scala.inline
  def apply(): MessageRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRule]
  }
  @scala.inline
  implicit class MessageRuleOps[Self <: MessageRule] (val x: Self) extends AnyVal {
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
    def setActions(value: MessageRuleActions): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setConditions(value: MessageRulePredicates): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExceptions(value: MessageRulePredicates): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptions: Self = this.set("exceptions", js.undefined)
    @scala.inline
    def setHasError(value: Boolean): Self = this.set("hasError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasError: Self = this.set("hasError", js.undefined)
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
  }
  
}

