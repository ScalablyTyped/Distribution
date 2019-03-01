package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppVersionService extends js.Object {
  def getVersionCode(): angularLib.angularMod.angularNs.IPromise[java.lang.String]
  def getVersionNumber(): angularLib.angularMod.angularNs.IPromise[java.lang.String]
}

object IAppVersionService {
  @scala.inline
  def apply(
    getVersionCode: js.Function0[angularLib.angularMod.angularNs.IPromise[java.lang.String]],
    getVersionNumber: js.Function0[angularLib.angularMod.angularNs.IPromise[java.lang.String]]
  ): IAppVersionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getVersionCode")(getVersionCode)
    __obj.updateDynamic("getVersionNumber")(getVersionNumber)
    __obj.asInstanceOf[IAppVersionService]
  }
}

