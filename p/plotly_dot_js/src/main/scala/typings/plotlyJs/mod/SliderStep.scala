package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.animate
import typings.plotlyJs.plotlyJsStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderStep extends js.Object {
  /**
    * Sets the arguments values to be passed to the Plotly
    * method set in `method` on slide.
    */
  var args: js.Array[_] = js.native
  /**
    * When true, the API method is executed. When false, all other behaviors are the same
    * and command execution is skipped. This may be useful when hooking into, for example,
    * the `plotly_sliderchange` method and executing the API command manually without losing
    * the benefit of the slider automatically binding to the state of the plot through the
    * specification of `method` and `args`.
    */
  var execute: Boolean = js.native
  /**
    * Sets the text label to appear on the slider
    */
  var label: String = js.native
  /**
    * Sets the Plotly method to be called when the slider value is changed.
    * If the `skip` method is used, the API slider will function as normal
    * but will perform no API calls and will not bind automatically to state
    * updates. This may be used to create a component interface and attach to
    * slider events manually via JavaScript.
    */
  var method: animate | typings.plotlyJs.plotlyJsStrings.relayout | typings.plotlyJs.plotlyJsStrings.restyle | skip | typings.plotlyJs.plotlyJsStrings.update = js.native
  /**
    * Sets the value of the slider step, used to refer to the step programatically.
    * Defaults to the slider label if not provided.
    */
  var value: String = js.native
  /**
    * Determines whether or not this step is included in the slider.
    */
  var visible: Boolean = js.native
}

object SliderStep {
  @scala.inline
  def apply(
    args: js.Array[_],
    execute: Boolean,
    label: String,
    method: animate | typings.plotlyJs.plotlyJsStrings.relayout | typings.plotlyJs.plotlyJsStrings.restyle | skip | typings.plotlyJs.plotlyJsStrings.update,
    value: String,
    visible: Boolean
  ): SliderStep = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStep]
  }
  @scala.inline
  implicit class SliderStepOps[Self <: SliderStep] (val x: Self) extends AnyVal {
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
    def setExecute(value: Boolean): Self = this.set("execute", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(
      value: animate | typings.plotlyJs.plotlyJsStrings.relayout | typings.plotlyJs.plotlyJsStrings.restyle | skip | typings.plotlyJs.plotlyJsStrings.update
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

