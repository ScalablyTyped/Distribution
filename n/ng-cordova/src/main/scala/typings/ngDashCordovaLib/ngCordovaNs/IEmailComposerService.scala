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
    addAlias: (java.lang.String, java.lang.String) => scala.Unit,
    isAvailable: () => angularLib.angularMod.angularNs.IPromise[scala.Boolean],
    open: IEmailComposerOptions => angularLib.angularMod.angularNs.IPromise[_]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
  
    __obj.asInstanceOf[IEmailComposerService]
  }
}

