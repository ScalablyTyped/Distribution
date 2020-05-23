package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.avg
import typings.plotlyJs.plotlyJsStrings.count
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.max
import typings.plotlyJs.plotlyJsStrings.median
import typings.plotlyJs.plotlyJsStrings.min
import typings.plotlyJs.plotlyJsStrings.mode
import typings.plotlyJs.plotlyJsStrings.population
import typings.plotlyJs.plotlyJsStrings.rms
import typings.plotlyJs.plotlyJsStrings.sample
import typings.plotlyJs.plotlyJsStrings.stddev
import typings.plotlyJs.plotlyJsStrings.sum
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
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (func != null) __obj.updateDynamic("func")(func.asInstanceOf[js.Any])
    if (funcmode != null) __obj.updateDynamic("funcmode")(funcmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
}

