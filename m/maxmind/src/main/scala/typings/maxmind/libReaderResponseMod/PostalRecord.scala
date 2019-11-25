package typings.maxmind.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalRecord extends js.Object {
  val code: String
  val confidence: js.UndefOr[Double] = js.undefined
}

object PostalRecord {
  @scala.inline
  def apply(code: String, confidence: Int | Double = null): PostalRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalRecord]
  }
}

