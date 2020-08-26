package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAppVersionService extends js.Object {
  def getVersionCode(): IPromise[String] = js.native
  def getVersionNumber(): IPromise[String] = js.native
}

object IAppVersionService {
  @scala.inline
  def apply(getVersionCode: () => IPromise[String], getVersionNumber: () => IPromise[String]): IAppVersionService = {
    val __obj = js.Dynamic.literal(getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
    __obj.asInstanceOf[IAppVersionService]
  }
  @scala.inline
  implicit class IAppVersionServiceOps[Self <: IAppVersionService] (val x: Self) extends AnyVal {
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
    def setGetVersionCode(value: () => IPromise[String]): Self = this.set("getVersionCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVersionNumber(value: () => IPromise[String]): Self = this.set("getVersionNumber", js.Any.fromFunction0(value))
  }
  
}

