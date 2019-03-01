package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderStep extends js.Object {
  /**
  	 * Sets the arguments values to be passed to the Plotly
  	 * method set in `method` on slide.
  	 */
  var args: js.Array[_]
  /**
  	 * When true, the API method is executed. When false, all other behaviors are the same
  	 * and command execution is skipped. This may be useful when hooking into, for example,
  	 * the `plotly_sliderchange` method and executing the API command manually without losing
  	 * the benefit of the slider automatically binding to the state of the plot through the
  	 * specification of `method` and `args`.
  	 */
  var execute: scala.Boolean
  /**
  	 * Sets the text label to appear on the slider
  	 */
  var label: java.lang.String
  /**
  	 * Sets the Plotly method to be called when the slider value is changed.
  	 * If the `skip` method is used, the API slider will function as normal
  	 * but will perform no API calls and will not bind automatically to state
  	 * updates. This may be used to create a component interface and attach to
  	 * slider events manually via JavaScript.
  	 */
  var method: plotlyDotJsLib.plotlyDotJsLibStrings.animate | plotlyDotJsLib.plotlyDotJsLibStrings.relayout | plotlyDotJsLib.plotlyDotJsLibStrings.restyle | plotlyDotJsLib.plotlyDotJsLibStrings.skip | plotlyDotJsLib.plotlyDotJsLibStrings.update
  /**
  	 * Sets the value of the slider step, used to refer to the step programatically.
  	 * Defaults to the slider label if not provided.
  	 */
  var value: java.lang.String
  /**
  	 * Determines whether or not this step is included in the slider.
  	 */
  var visible: scala.Boolean
}

object SliderStep {
  @scala.inline
  def apply(
    args: js.Array[_],
    execute: scala.Boolean,
    label: java.lang.String,
    method: plotlyDotJsLib.plotlyDotJsLibStrings.animate | plotlyDotJsLib.plotlyDotJsLibStrings.relayout | plotlyDotJsLib.plotlyDotJsLibStrings.restyle | plotlyDotJsLib.plotlyDotJsLibStrings.skip | plotlyDotJsLib.plotlyDotJsLibStrings.update,
    value: java.lang.String,
    visible: scala.Boolean
  ): SliderStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SliderStep]
  }
}

