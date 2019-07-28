package typings.ngDashCordova.ngCordovaNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppVersionService extends js.Object {
  def getVersionCode(): IPromise[String]
  def getVersionNumber(): IPromise[String]
}

object IAppVersionService {
  @scala.inline
  def apply(getVersionCode: () => IPromise[String], getVersionNumber: () => IPromise[String]): IAppVersionService = {
    val __obj = js.Dynamic.literal(getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
  
    __obj.asInstanceOf[IAppVersionService]
  }
}

