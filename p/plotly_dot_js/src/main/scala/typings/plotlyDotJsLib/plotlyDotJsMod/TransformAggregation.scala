package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformAggregation extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var func: js.UndefOr[
    plotlyDotJsLib.plotlyDotJsLibStrings.count | plotlyDotJsLib.plotlyDotJsLibStrings.sum | plotlyDotJsLib.plotlyDotJsLibStrings.avg | plotlyDotJsLib.plotlyDotJsLibStrings.median | plotlyDotJsLib.plotlyDotJsLibStrings.mode | plotlyDotJsLib.plotlyDotJsLibStrings.rms | plotlyDotJsLib.plotlyDotJsLibStrings.stddev | plotlyDotJsLib.plotlyDotJsLibStrings.min | plotlyDotJsLib.plotlyDotJsLibStrings.max | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last
  ] = js.undefined
  var funcmode: js.UndefOr[
    plotlyDotJsLib.plotlyDotJsLibStrings.sample | plotlyDotJsLib.plotlyDotJsLibStrings.population
  ] = js.undefined
  var target: java.lang.String
}

object TransformAggregation {
  @scala.inline
  def apply(
    target: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    func: plotlyDotJsLib.plotlyDotJsLibStrings.count | plotlyDotJsLib.plotlyDotJsLibStrings.sum | plotlyDotJsLib.plotlyDotJsLibStrings.avg | plotlyDotJsLib.plotlyDotJsLibStrings.median | plotlyDotJsLib.plotlyDotJsLibStrings.mode | plotlyDotJsLib.plotlyDotJsLibStrings.rms | plotlyDotJsLib.plotlyDotJsLibStrings.stddev | plotlyDotJsLib.plotlyDotJsLibStrings.min | plotlyDotJsLib.plotlyDotJsLibStrings.max | plotlyDotJsLib.plotlyDotJsLibStrings.first | plotlyDotJsLib.plotlyDotJsLibStrings.last = null,
    funcmode: plotlyDotJsLib.plotlyDotJsLibStrings.sample | plotlyDotJsLib.plotlyDotJsLibStrings.population = null
  ): TransformAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

