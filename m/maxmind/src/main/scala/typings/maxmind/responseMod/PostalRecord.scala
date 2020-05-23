package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalRecord extends js.Object {
  val code: String
  val confidence: js.UndefOr[Double] = js.undefined
}

object PostalRecord {
  @scala.inline
  def apply(code: String, confidence: js.UndefOr[Double] = js.undefined): PostalRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalRecord]
  }
}

