package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AriaHideActionsDescription extends js.Object {
  var ariaHideActionsDescription: js.UndefOr[String] = js.undefined
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.undefined
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.undefined
}

object AriaHideActionsDescription {
  @scala.inline
  def apply(
    ariaHideActionsDescription: String = null,
    ariaShowEndActionsDescription: String = null,
    ariaShowStartActionsDescription: String = null
  ): AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    if (ariaHideActionsDescription != null) __obj.updateDynamic("ariaHideActionsDescription")(ariaHideActionsDescription.asInstanceOf[js.Any])
    if (ariaShowEndActionsDescription != null) __obj.updateDynamic("ariaShowEndActionsDescription")(ariaShowEndActionsDescription.asInstanceOf[js.Any])
    if (ariaShowStartActionsDescription != null) __obj.updateDynamic("ariaShowStartActionsDescription")(ariaShowStartActionsDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaHideActionsDescription]
  }
}

