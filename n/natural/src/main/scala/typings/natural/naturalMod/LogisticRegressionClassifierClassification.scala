package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogisticRegressionClassifierClassification extends js.Object {
  var label: String
  var value: Double
}

object LogisticRegressionClassifierClassification {
  @scala.inline
  def apply(label: String, value: Double): LogisticRegressionClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[LogisticRegressionClassifierClassification]
  }
}

