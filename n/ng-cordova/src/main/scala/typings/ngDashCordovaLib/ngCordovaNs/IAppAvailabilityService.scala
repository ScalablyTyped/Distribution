package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppAvailabilityService extends js.Object {
  def check(urlScheme: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
}

object IAppAvailabilityService {
  @scala.inline
  def apply(check: js.Function1[java.lang.String, angularLib.angularMod.angularNs.IPromise[_]]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(check)
    __obj.asInstanceOf[IAppAvailabilityService]
  }
}

