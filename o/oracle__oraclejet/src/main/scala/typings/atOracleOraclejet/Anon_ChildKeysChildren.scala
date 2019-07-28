package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildKeysChildren extends js.Object {
  var childKeys: Anon_ChildKeys
  var children: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_ChildKeysChildren {
  @scala.inline
  def apply(childKeys: Anon_ChildKeys, children: String = null, label: String = null, value: String = null): Anon_ChildKeysChildren = {
    val __obj = js.Dynamic.literal(childKeys = childKeys)
    if (children != null) __obj.updateDynamic("children")(children)
    if (label != null) __obj.updateDynamic("label")(label)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ChildKeysChildren]
  }
}

