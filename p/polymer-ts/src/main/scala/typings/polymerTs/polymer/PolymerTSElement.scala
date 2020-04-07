package typings.polymerTs.polymer

import typings.std.FunctionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolymerTSElement extends js.Object {
  @JSName("$custom_cons")
  var $custom_cons: js.UndefOr[FunctionConstructor] = js.undefined
  @JSName("$custom_cons_args")
  var $custom_cons_args: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object PolymerTSElement {
  @scala.inline
  def apply(
    $custom_cons: FunctionConstructor = null,
    $custom_cons_args: js.Array[_] = null,
    style: String = null,
    template: String = null
  ): PolymerTSElement = {
    val __obj = js.Dynamic.literal()
    if ($custom_cons != null) __obj.updateDynamic("$custom_cons")($custom_cons.asInstanceOf[js.Any])
    if ($custom_cons_args != null) __obj.updateDynamic("$custom_cons_args")($custom_cons_args.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolymerTSElement]
  }
}

