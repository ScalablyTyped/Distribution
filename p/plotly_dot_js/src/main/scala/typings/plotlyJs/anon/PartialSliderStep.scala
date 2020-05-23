package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.animate
import typings.plotlyJs.plotlyJsStrings.relayout
import typings.plotlyJs.plotlyJsStrings.restyle
import typings.plotlyJs.plotlyJsStrings.skip
import typings.plotlyJs.plotlyJsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.SliderStep> */
trait PartialSliderStep extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var execute: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[animate | relayout | restyle | skip | update] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialSliderStep {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    execute: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    method: animate | relayout | restyle | skip | update = null,
    value: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialSliderStep = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(execute)) __obj.updateDynamic("execute")(execute.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSliderStep]
  }
}

