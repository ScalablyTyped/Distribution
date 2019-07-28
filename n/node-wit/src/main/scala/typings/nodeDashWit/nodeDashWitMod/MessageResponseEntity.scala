package typings.nodeDashWit.nodeDashWitMod

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
  def apply(confidence: Int | Double = null, `type`: String = null, value: String = null): MessageResponseEntity = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MessageResponseEntity]
  }
}

