package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildKeysChildren extends js.Object {
  var childKeys: Anon_ChildKeys
  var children: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChildKeysChildren {
  @scala.inline
  def apply(
    childKeys: Anon_ChildKeys,
    children: java.lang.String = null,
    label: java.lang.String = null,
    value: java.lang.String = null
  ): Anon_ChildKeysChildren = {
    val __obj = js.Dynamic.literal(childKeys = childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ChildKeysChildren]
  }
}

