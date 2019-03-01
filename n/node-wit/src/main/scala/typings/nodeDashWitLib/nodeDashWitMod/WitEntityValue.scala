package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitEntityValue extends js.Object {
  var expressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object WitEntityValue {
  @scala.inline
  def apply(expressions: js.Array[java.lang.String] = null, value: java.lang.String = null): WitEntityValue = {
    val __obj = js.Dynamic.literal()
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WitEntityValue]
  }
}

