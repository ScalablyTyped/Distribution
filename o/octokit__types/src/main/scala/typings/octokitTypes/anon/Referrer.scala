package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Referrer extends js.Object {
  var count: Double
  var referrer: String
  var uniques: Double
}

object Referrer {
  @scala.inline
  def apply(count: Double, referrer: String, uniques: Double): Referrer = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Referrer]
  }
}

