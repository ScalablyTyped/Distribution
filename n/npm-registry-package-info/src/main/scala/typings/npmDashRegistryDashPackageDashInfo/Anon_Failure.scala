package typings.npmDashRegistryDashPackageDashInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failure extends js.Object {
  var failure: Double
  var success: Double
  var total: Double
}

object Anon_Failure {
  @scala.inline
  def apply(failure: Double, success: Double, total: Double): Anon_Failure = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Failure]
  }
}

