package typings
package npmDashRegistryDashPackageDashInfoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failure extends js.Object {
  var failure: scala.Double
  var success: scala.Double
  var total: scala.Double
}

object Anon_Failure {
  @scala.inline
  def apply(failure: scala.Double, success: scala.Double, total: scala.Double): Anon_Failure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_Failure]
  }
}

