package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastService extends js.Object {
  def show(message: java.lang.String, duration: java.lang.String, position: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongBottom(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongCenter(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showLongTop(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortBottom(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortCenter(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
  def showShortTop(message: java.lang.String): angularLib.angularMod.angularNs.IPromise[_]
}

