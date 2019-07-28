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
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[BayesClassifierClassification]
  }
}

