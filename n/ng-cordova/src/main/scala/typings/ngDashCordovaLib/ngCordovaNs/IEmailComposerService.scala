package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEmailComposerService extends js.Object {
  def addAlias(app: java.lang.String, schema: java.lang.String): scala.Unit
  def isAvailable(): angularLib.angularMod.angularNs.IPromise[scala.Boolean]
  def open(properties: IEmailComposerOptions): angularLib.angularMod.angularNs.IPromise[_]
}

object IEmailComposerService {
  @scala.inline
  def apply(
    addAlias: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    isAvailable: js.Function0[angularLib.angularMod.angularNs.IPromise[scala.Boolean]],
    open: js.Function1[IEmailComposerOptions, angularLib.angularMod.angularNs.IPromise[_]]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAlias")(addAlias)
    __obj.updateDynamic("isAvailable")(isAvailable)
    __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[IEmailComposerService]
  }
}

