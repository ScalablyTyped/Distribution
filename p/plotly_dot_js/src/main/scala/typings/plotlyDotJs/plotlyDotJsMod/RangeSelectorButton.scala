package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.all
import typings.plotlyDotJs.plotlyDotJsStrings.backward
import typings.plotlyDotJs.plotlyDotJsStrings.day
import typings.plotlyDotJs.plotlyDotJsStrings.hour
import typings.plotlyDotJs.plotlyDotJsStrings.minute
import typings.plotlyDotJs.plotlyDotJsStrings.month
import typings.plotlyDotJs.plotlyDotJsStrings.second
import typings.plotlyDotJs.plotlyDotJsStrings.todate
import typings.plotlyDotJs.plotlyDotJsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButton extends js.Object {
  var count: Double
  var label: String
  var step: second | minute | hour | day | month | year | all
  var stepmode: backward | todate
}

object RangeSelectorButton {
  @scala.inline
  def apply(
    count: Double,
    label: String,
    step: second | minute | hour | day | month | year | all,
    stepmode: backward | todate
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal(count = count, label = label, step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

