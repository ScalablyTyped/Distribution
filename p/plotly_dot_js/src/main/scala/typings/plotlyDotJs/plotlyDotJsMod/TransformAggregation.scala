package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.avg
import typings.plotlyDotJs.plotlyDotJsStrings.count
import typings.plotlyDotJs.plotlyDotJsStrings.first
import typings.plotlyDotJs.plotlyDotJsStrings.last
import typings.plotlyDotJs.plotlyDotJsStrings.max
import typings.plotlyDotJs.plotlyDotJsStrings.median
import typings.plotlyDotJs.plotlyDotJsStrings.min
import typings.plotlyDotJs.plotlyDotJsStrings.mode
import typings.plotlyDotJs.plotlyDotJsStrings.population
import typings.plotlyDotJs.plotlyDotJsStrings.rms
import typings.plotlyDotJs.plotlyDotJsStrings.sample
import typings.plotlyDotJs.plotlyDotJsStrings.stddev
import typings.plotlyDotJs.plotlyDotJsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformAggregation extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.undefined
  var funcmode: js.UndefOr[sample | population] = js.undefined
  var target: String
}

object TransformAggregation {
  @scala.inline
  def apply(
    target: String,
    enabled: js.UndefOr[Boolean] = js.undefined,
    func: count | sum | avg | median | mode | rms | stddev | min | max | first | last = null,
    funcmode: sample | population = null
  ): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

