package typings.plotlyJs.mod

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

