package typings.npmRegistryPackageInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailure extends js.Object {
  var failure: Double
  var success: Double
  var total: Double
}

object AnonFailure {
  @scala.inline
  def apply(failure: Double, success: Double, total: Double): AnonFailure = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailure]
  }
}

