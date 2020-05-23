package typings.npmRegistryPackageInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure extends js.Object {
  var failure: Double
  var success: Double
  var total: Double
}

object Failure {
  @scala.inline
  def apply(failure: Double, success: Double, total: Double): Failure = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
}

