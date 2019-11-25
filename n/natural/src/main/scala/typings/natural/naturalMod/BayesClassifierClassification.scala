package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BayesClassifierClassification extends js.Object {
  var label: String
  var value: Double
}

object BayesClassifierClassification {
  @scala.inline
  def apply(label: String, value: Double): BayesClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BayesClassifierClassification]
  }
}

