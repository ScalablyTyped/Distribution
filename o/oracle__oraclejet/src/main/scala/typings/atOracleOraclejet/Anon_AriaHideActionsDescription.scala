package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AriaHideActionsDescription extends js.Object {
  var ariaHideActionsDescription: js.UndefOr[String] = js.undefined
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.undefined
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.undefined
}

object Anon_AriaHideActionsDescription {
  @scala.inline
  def apply(
    ariaHideActionsDescription: String = null,
    ariaShowEndActionsDescription: String = null,
    ariaShowStartActionsDescription: String = null
  ): Anon_AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    if (ariaHideActionsDescription != null) __obj.updateDynamic("ariaHideActionsDescription")(ariaHideActionsDescription)
    if (ariaShowEndActionsDescription != null) __obj.updateDynamic("ariaShowEndActionsDescription")(ariaShowEndActionsDescription)
    if (ariaShowStartActionsDescription != null) __obj.updateDynamic("ariaShowStartActionsDescription")(ariaShowStartActionsDescription)
    __obj.asInstanceOf[Anon_AriaHideActionsDescription]
  }
}

