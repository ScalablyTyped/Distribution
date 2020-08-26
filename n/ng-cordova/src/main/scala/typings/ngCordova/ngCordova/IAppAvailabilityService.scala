package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppAvailabilityService extends js.Object {
  def check(urlScheme: String): IPromise[_] = js.native
}

object IAppAvailabilityService {
  @scala.inline
  def apply(check: String => IPromise[_]): IAppAvailabilityService = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
    __obj.asInstanceOf[IAppAvailabilityService]
  }
  @scala.inline
  implicit class IAppAvailabilityServiceOps[Self <: IAppAvailabilityService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheck(value: String => IPromise[_]): Self = this.set("check", js.Any.fromFunction1(value))
  }
  
}

