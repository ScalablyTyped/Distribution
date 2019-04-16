package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BayesClassifierClassification extends js.Object {
  var label: java.lang.String
  var value: scala.Double
}

object BayesClassifierClassification {
  @scala.inline
  def apply(label: java.lang.String, value: scala.Double): BayesClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[BayesClassifierClassification]
  }
}

