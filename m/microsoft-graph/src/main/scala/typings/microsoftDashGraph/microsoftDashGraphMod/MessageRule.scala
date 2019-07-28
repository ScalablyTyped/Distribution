package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRule extends Entity {
  // Actions to be taken on a message when the corresponding conditions are fulfilled.
  var actions: js.UndefOr[MessageRuleActions] = js.undefined
  // Conditions that when fulfilled, will trigger the corresponding actions for that rule.
  var conditions: js.UndefOr[MessageRulePredicates] = js.undefined
  // The display name of the rule.
  var displayName: js.UndefOr[String] = js.undefined
  // Exception conditions for the rule.
  var exceptions: js.UndefOr[MessageRulePredicates] = js.undefined
  // Indicates whether the rule is in an error condition. Read-only.
  var hasError: js.UndefOr[Boolean] = js.undefined
  // Indicates whether the rule is enabled to be applied to messages.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  // Indicates if the rule is read-only and cannot be modified or deleted by the rules REST API.
  var isReadOnly: js.UndefOr[Boolean] = js.undefined
  // Indicates the order in which the rule is executed, among other rules.
  var sequence: js.UndefOr[Double] = js.undefined
}

object MessageRule {
  @scala.inline
  def apply(
    actions: MessageRuleActions = null,
    conditions: MessageRulePredicates = null,
    displayName: String = null,
    exceptions: MessageRulePredicates = null,
    hasError: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isEnabled: js.UndefOr[Boolean] = js.undefined,
    isReadOnly: js.UndefOr[Boolean] = js.undefined,
    sequence: Int | Double = null
  ): MessageRule = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    if (!js.isUndefined(hasError)) __obj.updateDynamic("hasError")(hasError)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isEnabled)) __obj.updateDynamic("isEnabled")(isEnabled)
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRule]
  }
}

