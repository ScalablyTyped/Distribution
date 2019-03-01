package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolymerTSElement extends js.Object {
  @JSName("$custom_cons")
  var $custom_cons: js.UndefOr[stdLib.FunctionConstructor] = js.undefined
  @JSName("$custom_cons_args")
  var $custom_cons_args: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object PolymerTSElement {
  @scala.inline
  def apply(
    $custom_cons: stdLib.FunctionConstructor = null,
    $custom_cons_args: js.Array[_] = null,
    style: java.lang.String = null,
    template: java.lang.String = null
  ): PolymerTSElement = {
    val __obj = js.Dynamic.literal()
    if ($custom_cons != null) __obj.updateDynamic("$custom_cons")($custom_cons)
    if ($custom_cons_args != null) __obj.updateDynamic("$custom_cons_args")($custom_cons_args)
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[PolymerTSElement]
  }
}

