package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppVersionService extends js.Object {
  def getVersionCode(): angularLib.angularMod.IPromise[java.lang.String]
  def getVersionNumber(): angularLib.angularMod.IPromise[java.lang.String]
}

object IAppVersionService {
  @scala.inline
  def apply(
    getVersionCode: () => angularLib.angularMod.IPromise[java.lang.String],
    getVersionNumber: () => angularLib.angularMod.IPromise[java.lang.String]
  ): IAppVersionService = {
    val __obj = js.Dynamic.literal(getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
  
    __obj.asInstanceOf[IAppVersionService]
  }
}

