package typings.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonOtherPrimeInfo extends js.Object {
  var d: String
  var r: String
  var t: String
}

object JsonOtherPrimeInfo {
  @scala.inline
  def apply(d: String, r: String, t: String): JsonOtherPrimeInfo = {
    val __obj = js.Dynamic.literal(d = d, r = r, t = t)
  
    __obj.asInstanceOf[JsonOtherPrimeInfo]
  }
}

