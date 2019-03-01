package typings
package pkijsLib.srcTSTInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyParams extends js.Object {
  var data: stdLib.BufferSource
  var notAfter: js.UndefOr[stdLib.Date] = js.undefined
  var notBefore: js.UndefOr[stdLib.Date] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(data: stdLib.BufferSource, notAfter: stdLib.Date = null, notBefore: stdLib.Date = null): VerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    __obj.asInstanceOf[VerifyParams]
  }
}

