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

