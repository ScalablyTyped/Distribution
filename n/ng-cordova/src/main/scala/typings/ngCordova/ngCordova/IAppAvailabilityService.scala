package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppAvailabilityService extends js.Object {
  def check(urlScheme: String): IPromise[_]
}

object IAppAvailabilityService {
  @scala.inline
  def apply(check: String => IPromise[_]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[IAppAvailabilityService]
  }
}

