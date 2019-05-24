package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalRecord extends js.Object {
  val code: java.lang.String
  val confidence: js.UndefOr[scala.Double] = js.undefined
}

object PostalRecord {
  @scala.inline
  def apply(code: java.lang.String, confidence: scala.Int | scala.Double = null): PostalRecord = {
    val __obj = js.Dynamic.literal(code = code)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalRecord]
  }
}

