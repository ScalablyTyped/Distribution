package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildKeysChildrenLabelValue extends js.Object {
  var childKeys: js.UndefOr[Anon_ChildKeysChildrenLabel] = js.undefined
  var children: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_ChildKeysChildrenLabelValue {
  @scala.inline
  def apply(
    childKeys: Anon_ChildKeysChildrenLabel = null,
    children: String = null,
    label: String = null,
    value: String = null
  ): Anon_ChildKeysChildrenLabelValue = {
    val __obj = js.Dynamic.literal()
    if (childKeys != null) __obj.updateDynamic("childKeys")(childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ChildKeysChildrenLabelValue]
  }
}

