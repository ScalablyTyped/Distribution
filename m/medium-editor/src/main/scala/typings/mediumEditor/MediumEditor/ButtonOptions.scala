package typings.mediumEditor.MediumEditor

import org.scalablytyped.runtime.StringDictionary
import typings.mediumEditor.AnonProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var aria: js.UndefOr[String] = js.undefined
  var attrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var classList: js.UndefOr[js.Array[String]] = js.undefined
  var contentDefault: js.UndefOr[String] = js.undefined
  var contentFA: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[AnonProp] = js.undefined
  var tagNames: js.UndefOr[js.Array[String]] = js.undefined
  var useQueryState: js.UndefOr[Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    action: String = null,
    aria: String = null,
    attrs: StringDictionary[String] = null,
    classList: js.Array[String] = null,
    contentDefault: String = null,
    contentFA: String = null,
    name: String = null,
    style: AnonProp = null,
    tagNames: js.Array[String] = null,
    useQueryState: js.UndefOr[Boolean] = js.undefined
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (aria != null) __obj.updateDynamic("aria")(aria.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (classList != null) __obj.updateDynamic("classList")(classList.asInstanceOf[js.Any])
    if (contentDefault != null) __obj.updateDynamic("contentDefault")(contentDefault.asInstanceOf[js.Any])
    if (contentFA != null) __obj.updateDynamic("contentFA")(contentFA.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagNames != null) __obj.updateDynamic("tagNames")(tagNames.asInstanceOf[js.Any])
    if (!js.isUndefined(useQueryState)) __obj.updateDynamic("useQueryState")(useQueryState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

