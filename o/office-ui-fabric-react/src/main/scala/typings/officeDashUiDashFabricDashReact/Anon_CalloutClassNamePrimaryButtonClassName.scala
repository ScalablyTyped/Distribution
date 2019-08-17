package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalloutClassNamePrimaryButtonClassName extends js.Object {
  /** Class name for callout. */
  var calloutClassName: js.UndefOr[String] = js.undefined
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.undefined
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.undefined
}

object Anon_CalloutClassNamePrimaryButtonClassName {
  @scala.inline
  def apply(
    calloutClassName: String = null,
    primaryButtonClassName: String = null,
    secondaryButtonClassName: String = null
  ): Anon_CalloutClassNamePrimaryButtonClassName = {
    val __obj = js.Dynamic.literal()
    if (calloutClassName != null) __obj.updateDynamic("calloutClassName")(calloutClassName)
    if (primaryButtonClassName != null) __obj.updateDynamic("primaryButtonClassName")(primaryButtonClassName)
    if (secondaryButtonClassName != null) __obj.updateDynamic("secondaryButtonClassName")(secondaryButtonClassName)
    __obj.asInstanceOf[Anon_CalloutClassNamePrimaryButtonClassName]
  }
}

