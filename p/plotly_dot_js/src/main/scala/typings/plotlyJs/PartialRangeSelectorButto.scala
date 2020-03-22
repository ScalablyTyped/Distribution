package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.backward
import typings.plotlyJs.plotlyJsStrings.day
import typings.plotlyJs.plotlyJsStrings.hour
import typings.plotlyJs.plotlyJsStrings.minute
import typings.plotlyJs.plotlyJsStrings.month
import typings.plotlyJs.plotlyJsStrings.second
import typings.plotlyJs.plotlyJsStrings.todate
import typings.plotlyJs.plotlyJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelectorButton> */
trait PartialRangeSelectorButto extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[second | minute | hour | day | month | year | all] = js.undefined
  var stepmode: js.UndefOr[backward | todate] = js.undefined
}

object PartialRangeSelectorButto {
  @scala.inline
  def apply(
    count: Int | Double = null,
    label: String = null,
    step: second | minute | hour | day | month | year | all = null,
    stepmode: backward | todate = null
  ): PartialRangeSelectorButto = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (stepmode != null) __obj.updateDynamic("stepmode")(stepmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRangeSelectorButto]
  }
}

