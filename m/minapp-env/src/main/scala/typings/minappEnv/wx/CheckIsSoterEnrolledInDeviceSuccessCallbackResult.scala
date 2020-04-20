package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceSuccessCallbackResult extends js.Object {
  /** 错误信息 */
  var errMs: String
  /** 是否已录入信息 */
  var isEnrolled: Boolean
}

object CheckIsSoterEnrolledInDeviceSuccessCallbackResult {
  @scala.inline
  def apply(errMs: String, isEnrolled: Boolean): CheckIsSoterEnrolledInDeviceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMs = errMs.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceSuccessCallbackResult]
  }
}

