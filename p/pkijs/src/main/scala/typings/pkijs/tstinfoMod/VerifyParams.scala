package typings.pkijs.tstinfoMod

import typings.std.BufferSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyParams extends js.Object {
  var data: BufferSource
  var notAfter: js.UndefOr[Date] = js.undefined
  var notBefore: js.UndefOr[Date] = js.undefined
}

object VerifyParams {
  @scala.inline
  def apply(data: BufferSource, notAfter: Date = null, notBefore: Date = null): VerifyParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyParams]
  }
}

