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
  def apply(check: java.lang.String => angularLib.angularMod.angularNs.IPromise[_]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
  
    __obj.asInstanceOf[IAppAvailabilityService]
  }
}

