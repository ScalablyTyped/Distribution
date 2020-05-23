package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponseEntity extends js.Object {
  var confidence: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object MessageResponseEntity {
  @scala.inline
  def apply(confidence: js.UndefOr[Double] = js.undefined, `type`: String = null, value: String = null): MessageResponseEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponseEntity]
  }
}

