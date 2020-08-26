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
@js.native
trait PartialSliderStep extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var execute: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var method: js.UndefOr[animate | relayout | restyle | skip | update] = js.native
  var value: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object PartialSliderStep {
  @scala.inline
  def apply(): PartialSliderStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderStep]
  }
  @scala.inline
  implicit class PartialSliderStepOps[Self <: PartialSliderStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMethod(value: animate | relayout | restyle | skip | update): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

